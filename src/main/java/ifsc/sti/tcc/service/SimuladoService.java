package ifsc.sti.tcc.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import ifsc.sti.tcc.modelos.questao.Questao;
import ifsc.sti.tcc.modelos.questao.QuestaoAlternativa;
import ifsc.sti.tcc.modelos.respostasimulado.RespostaSimulado;
import ifsc.sti.tcc.modelos.simulado.Simulado;
import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.props.EArea;
import ifsc.sti.tcc.props.ETipoSimulado;
import ifsc.sti.tcc.repository.QuestaoRepository;
import ifsc.sti.tcc.repository.RespostaSimuladoRepository;
import ifsc.sti.tcc.repository.SimuladoRepository;
import ifsc.sti.tcc.repository.UsuarioRepository;
import ifsc.sti.tcc.resources.mappers.domaintoview.QuestaoMapper;
import ifsc.sti.tcc.resources.mappers.domaintoview.SimuladoMapper;
import ifsc.sti.tcc.resources.mappers.domaintoview.SimuladoQuestoesMapper;
import ifsc.sti.tcc.resources.mappers.domaintoview.SimuladoResumoMapper;
import ifsc.sti.tcc.resources.mappers.viewtodomain.RespostaSimuladoMapper;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.question.QuestaoResponse;
import ifsc.sti.tcc.resources.rest.models.respostasimulado.BuscarRespostaSimuladoRequest;
import ifsc.sti.tcc.resources.rest.models.respostasimulado.RespostaSimuladoRequest;
import ifsc.sti.tcc.resources.rest.models.simulado.SimuladoBaseResponse;
import ifsc.sti.tcc.resources.rest.models.simulado.SimuladoCompletoResponse;
import ifsc.sti.tcc.resources.rest.models.simulado.SumuladoRequest;
import ifsc.sti.tcc.utilidades.questao.QuestaoPoscomp2002;

public class SimuladoService {

	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(SimuladoService.class);

	private SimuladoRepository jpaRepository;
	private QuestaoRepository questaoRepository;
	private UsuarioRepository usuarioRepository;
	private RespostaSimuladoRepository respostaSimuladoRepository;

	public static class Instance extends BaseService<SimuladoRepository> implements BaseService.BaseObject<SimuladoService> {

		public Instance(SimuladoRepository jpaRepository) {
			super(jpaRepository);
		}
		
		private QuestaoRepository questaoRepository;
		private UsuarioRepository usuarioRepository;
		private RespostaSimuladoRepository respostaSimuladoRepository;
		
		public Instance withQuestaoRepository(QuestaoRepository repository) {
			this.questaoRepository = repository;
			return this;
		}

		public Instance withUsuarioRepository(UsuarioRepository repository) {
			this.usuarioRepository = repository;
			return this;
		}
		
		public Instance withRespostaSimuladoRepository(RespostaSimuladoRepository repository) {
			this.respostaSimuladoRepository = repository;
			return this;
		}
		
		@Override
		public SimuladoService build() {
			SimuladoService service = new SimuladoService();
			service.setJpaRepository(jpaRepository);
			service.setQuestaoRepository(questaoRepository);
			service.setUsuarioRepository(usuarioRepository);
			service.setRespostaSimuladoRepository(respostaSimuladoRepository);
			return service;
		}
	}
	
	private Simulado loadSimuladoById(long idSimulado) {
		return jpaRepository.findById(idSimulado);
	}
	
	private Usuario loadUsuarioById(long idSimulado) {
		return usuarioRepository.findById(idSimulado);
	}
	
	private RespostaSimulado loadRespostaSimulado(RespostaSimuladoRequest request) {
		return respostaSimuladoRepository.consultarRespostaSimulado(request.getIdSimulado(), request.getIdUsuario());
	}
	
	private RespostaSimulado loadRespostaSimulado(long idSimulado, long idUsuario) {
		RespostaSimulado resposta = respostaSimuladoRepository.consultarRespostaSimulado(idSimulado, idUsuario);
		return resposta;
	}
	
	private RespostaSimulado mapperSumulado(RespostaSimuladoRequest request) {
		return  new RespostaSimuladoMapper().transform(request, loadSimuladoById(request.getIdSimulado()), loadUsuarioById(request.getIdUsuario()));
	}
	
	public RespostaSimuladoRepository getRespostaSimuladoRepository() {
		return respostaSimuladoRepository;
	}

	public void setRespostaSimuladoRepository(RespostaSimuladoRepository respostaSimuladoRepository) {
		this.respostaSimuladoRepository = respostaSimuladoRepository;
	}

	public void setQuestaoRepository(QuestaoRepository questaoRepository) {
		this.questaoRepository = questaoRepository;
	}

	public void setUsuarioRepository(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	public List<Questao> saveQuestions() {
	   List<Questao> questoes = QuestaoPoscomp2002.registerPoscomp2002();
	   questaoRepository.saveAll(questoes);
	   return questoes;
	}
	
	public void setJpaRepository(SimuladoRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}

	public ResponseEntity<ResponseBase<List<QuestaoResponse>>> salvarTodasQuestoes() {
		ResponseBase<List<QuestaoResponse>> baseResponse = new ResponseBase<>();
		try {
			List<QuestaoResponse> response = new QuestaoMapper().transform(saveQuestions());
			baseResponse = new ResponseBase<>(response.size() > 0, response.size() > 0 ? "Informações cadastradas com sucesso" :
				"Nenhum questão cadastrada",
							response);
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Erro ao realizar o cadastro", null);
		}
		return new ResponseEntity<ResponseBase<List<QuestaoResponse>>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<SimuladoCompletoResponse>> buscarSimuladoId(long id) {
		ResponseBase<SimuladoCompletoResponse> baseResponse = new ResponseBase<>();
		try {
			SimuladoCompletoResponse simuladoResponse = buscarSimuladoPorId(id);
			baseResponse = new ResponseBase<>(true, "Simulado consultado com sucesso", simuladoResponse);
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível consultar o simulado", null);
		}
		return new ResponseEntity<ResponseBase<SimuladoCompletoResponse>>(baseResponse, HttpStatus.OK);
	}
	
	
	public ResponseEntity<ResponseBase<List<QuestaoResponse>>> buscarQuestoesSimuladoId(long id) {
		ResponseBase<List<QuestaoResponse>> baseResponse = new ResponseBase<>();
		try {
			List<QuestaoResponse> response = buscarQuestoesSimuladoPorId(id);
			baseResponse = new ResponseBase<>(true, "Questões consultadas com sucesso", response);
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível consultar as questões do simulado", null);
		}
		return new ResponseEntity<ResponseBase<List<QuestaoResponse>>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<List<SimuladoBaseResponse>>> buscarSimuladoIdUsuario(long idUsuario) {
		ResponseBase<List<SimuladoBaseResponse>> baseResponse = new ResponseBase<>();
		try {
			List<SimuladoBaseResponse> simuladoResponse = buscarSimuladoPorIdUsuario(idUsuario);
			for(SimuladoBaseResponse simulado : simuladoResponse) {
				RespostaSimulado resposta = loadRespostaSimulado(simulado.getId(), idUsuario);
				simulado.setRespondido(resposta != null);
			}
			if(simuladoResponse == null) {
				baseResponse = new ResponseBase<>(false, "Nenhum simulado encontrado", simuladoResponse);
			} else {
				baseResponse = new ResponseBase<>(true, "Simulados consultados com sucesso", simuladoResponse);
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível consultar o simulado", null);
		}
		return new ResponseEntity<ResponseBase<List<SimuladoBaseResponse>>>(baseResponse, HttpStatus.OK);
	}
	

	public ResponseEntity<ResponseBase<RespostaSimuladoRequest>> salvarRespostaSimulado(RespostaSimuladoRequest request) {
		ResponseBase<RespostaSimuladoRequest> baseResponse = new ResponseBase<>();
		try {
			RespostaSimulado lRespostaSimulado = loadRespostaSimulado(request);
			if(lRespostaSimulado != null) {
				baseResponse = new ResponseBase<>(false, "Resposta já registrada para esse usuário", null);
			} else {
				if(loadSimuladoById(request.getIdSimulado())  == null) {
					baseResponse = new ResponseBase<>(false, "Simulado não encontrado", null);
				} else if(loadUsuarioById(request.getIdUsuario()) == null){
					baseResponse = new ResponseBase<>(false, "Usuário não encontrado", null);
				} else {
					RespostaSimulado respostaSimulado = mapperSumulado(request);
					respostaSimuladoRepository.save(respostaSimulado);
					baseResponse = new ResponseBase<>(true, "Resposta registrada com sucesso", request);
				}
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível salvar a resposta do simulado", null);
		}
		return new ResponseEntity<ResponseBase<RespostaSimuladoRequest>>(baseResponse, HttpStatus.OK);
	}
	
	
	public ResponseEntity<ResponseBase<SimuladoCompletoResponse>> buscarRespostaSimulado(BuscarRespostaSimuladoRequest request) {
		ResponseBase<SimuladoCompletoResponse> baseResponse = new ResponseBase<>();
		try {
			RespostaSimulado repostaSimulada = respostaSimuladoRepository.consultarRespostaSimulado(request.getIdSimulado(), request.getIdUsuario());
			baseResponse = new ResponseBase<>(true, "Teste", null);
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível consultar o simulado", null);
		}
		return new ResponseEntity<ResponseBase<SimuladoCompletoResponse>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<SimuladoCompletoResponse>> gerarSimulado(SumuladoRequest sumuladoRequest) {
		ResponseBase<SimuladoCompletoResponse> baseResponse = new ResponseBase<>();
		try {
			SimuladoCompletoResponse simuladoResponse = null;
			switch (sumuladoRequest.getTipoSimulado()) {
			case 2:
				simuladoResponse = gerarSimuladPoscom(sumuladoRequest);
				break;
			case 1:
				simuladoResponse = gerarSimuladEnade(sumuladoRequest);
				break;
			default:
				simuladoResponse = gerarSimuladPersonalizado(sumuladoRequest);
				break;
			}
			baseResponse = new ResponseBase<>(true, "Simulado gerado com sucesso", simuladoResponse);
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível gerar o simulado", null);
		}
		return new ResponseEntity<ResponseBase<SimuladoCompletoResponse>>(baseResponse, HttpStatus.OK);
	}
	
	private SimuladoCompletoResponse gerarSimuladPoscom(SumuladoRequest sumuladoRequest) {
		Simulado simulado = saveSimulado(sumuladoRequest);
		SimuladoCompletoResponse simuladoResponse = new SimuladoMapper().transform(simulado);
		return simuladoResponse;
	}
	
	private SimuladoCompletoResponse buscarSimuladoPorId(long simuladoId) {
		Simulado simulado = jpaRepository.findById(simuladoId);
		SimuladoCompletoResponse simuladoResponse = new SimuladoMapper().transform(simulado);
		return simuladoResponse;
	}
	
	private List<QuestaoResponse> buscarQuestoesSimuladoPorId(long simuladoId) {
		Simulado simulado = jpaRepository.findById(simuladoId);
		List<QuestaoResponse> response = new SimuladoQuestoesMapper().transform(simulado);
		return response;
	}
	
	private List<SimuladoBaseResponse> buscarSimuladoPorIdUsuario(long usuarioId) {
		List<Simulado> simulados = jpaRepository.findByIdUsuario(loadUsuarioById(usuarioId));
		List<SimuladoBaseResponse> simuladoResponse = new SimuladoResumoMapper().transform(simulados);
		return simuladoResponse;
	}
	
	private Simulado saveSimulado(SumuladoRequest sumuladoRequest) {
		List<Questao> questoes = new ArrayList<Questao>();
		List<QuestaoAlternativa> questaoPart1 = questaoRepository.consultPoscomp(EArea.MATEMATICA.codigo, ETipoSimulado.POSCOMP.codigo, 20);
		List<QuestaoAlternativa> questaoPart2 = questaoRepository.consultPoscomp(EArea.FUNDAMENTOS_DE_COMPUTACAO.codigo, ETipoSimulado.POSCOMP.codigo, 5);
		List<QuestaoAlternativa> questaoPart3 = questaoRepository.consultPoscomp(EArea.TECNOLOGIA_DA_COMPUTACAO.codigo, ETipoSimulado.POSCOMP.codigo, 5);
		questoes.addAll(questaoPart1);
		questoes.addAll(questaoPart2);
		questoes.addAll(questaoPart3);
		
		Simulado simulado = new Simulado();
		simulado.setNome(sumuladoRequest.getNome());
		simulado.setDescricao(sumuladoRequest.getDescricao());
		simulado.setDataCriacao(new Date());
		simulado.setDataInicio(sumuladoRequest.getDataInicio());
		simulado.setDataFimSimulado(sumuladoRequest.getDataFimSimulado());
		simulado.setTempoMaximo(sumuladoRequest.getTempoMaximo());
		simulado.setIdUsuario(usuarioRepository.findById((long)sumuladoRequest.getIdUsuario()));
		simulado.setQuantidadeQuestoes(sumuladoRequest.getQuantidadeQuestoes());
		simulado.setTipoSimulado(ETipoSimulado.getEnun(sumuladoRequest.getTipoSimulado()));	
		simulado.setQuestoes(questoes);
		Simulado simuladoResponse = jpaRepository.save(simulado);
		simulado.setId(simuladoResponse.getId());
		return simulado;
	}
	
	private SimuladoCompletoResponse gerarSimuladEnade(SumuladoRequest sumuladoRequest) {
		Simulado simulado = saveSimulado(sumuladoRequest);
		SimuladoCompletoResponse simuladoResponse = new SimuladoMapper().transform(simulado);
		return simuladoResponse;
	}
	
	private SimuladoCompletoResponse gerarSimuladPersonalizado(SumuladoRequest sumuladoRequest) {
		return null;
	}
}