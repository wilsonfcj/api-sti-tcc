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
import ifsc.sti.tcc.modelos.questao.QuestaoDiscusiva;
import ifsc.sti.tcc.modelos.respostasimulado.RespostaSimulado;
import ifsc.sti.tcc.modelos.simulado.Sala;
import ifsc.sti.tcc.modelos.simulado.Simulado;
import ifsc.sti.tcc.modelos.usuario.Professor;
import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.props.EArea;
import ifsc.sti.tcc.props.EFormacao;
import ifsc.sti.tcc.props.ETipoSimulado;
import ifsc.sti.tcc.repository.QuestaoRepository;
import ifsc.sti.tcc.repository.RespostaSimuladoRepository;
import ifsc.sti.tcc.repository.SalaRepository;
import ifsc.sti.tcc.repository.SimuladoRepository;
import ifsc.sti.tcc.repository.UsuarioRepository;
import ifsc.sti.tcc.resources.mappers.domaintoview.QuestaoMapper;
import ifsc.sti.tcc.resources.mappers.domaintoview.SimuladoMapper;
import ifsc.sti.tcc.resources.mappers.domaintoview.SimuladoResumoMapper;
import ifsc.sti.tcc.resources.mappers.viewtodomain.RespostaSimuladoMapper;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.question.response.QuestaoResponse;
import ifsc.sti.tcc.resources.rest.models.resultado.base.ResultadoQuantitativo;
import ifsc.sti.tcc.resources.rest.models.resultado.response.ResultadoSimuladoResponse;
import ifsc.sti.tcc.resources.rest.models.simulado.request.DeletarSimuladoRequest;
import ifsc.sti.tcc.resources.rest.models.simulado.request.RespostaSimuladoRequest;
import ifsc.sti.tcc.resources.rest.models.simulado.request.SimuladoRequest;
import ifsc.sti.tcc.resources.rest.models.simulado.response.SimuladoBaseResponse;
import ifsc.sti.tcc.resources.rest.models.simulado.response.SimuladoCompletoResponse;
import ifsc.sti.tcc.utilidades.questao.QuestaoPoscomp2002;
import ifsc.sti.tcc.utilidades.questao.QuestaoPoscomp2003;
import ifsc.sti.tcc.utilidades.questao.QuestaoPoscomp2004;
import ifsc.sti.tcc.utilidades.questao.QuestaoPoscomp2005;
import ifsc.sti.tcc.utilidades.questao.QuestaoPoscomp2006;
import ifsc.sti.tcc.utilidades.questao.QuestaoPoscomp2007;
import ifsc.sti.tcc.utilidades.questao.QuestaoPoscomp2008;
import ifsc.sti.tcc.utilidades.questao.QuestaoPoscomp2009;
import ifsc.sti.tcc.utilidades.questao.QuestaoPoscomp2010;
import ifsc.sti.tcc.utilidades.questao.QuestaoPoscomp2011;
import ifsc.sti.tcc.utilidades.questao.QuestaoPoscomp2012;
import ifsc.sti.tcc.utilidades.questao.QuestaoPoscomp2013;
import ifsc.sti.tcc.utilidades.questao.QuestaoPoscomp2014;
import ifsc.sti.tcc.utilidades.questao.QuestaoPoscomp2015;
import ifsc.sti.tcc.utilidades.questaoenade.QuestaoEnade2005;

public class SimuladoService {

	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(SimuladoService.class);

	private SimuladoRepository jpaRepository;
	private QuestaoRepository questaoRepository;
	private UsuarioRepository usuarioRepository;
	private RespostaSimuladoRepository respostaSimuladoRepository;
	private ResultadoService resultadoService;
	private SalaRepository salaRepository;

	private List<SimuladoBaseResponse> simuladoResponse;
	
	private final int UPDATE_VALUES = 12;

	public static class Instance extends BaseService<SimuladoRepository> implements BaseService.BaseObject<SimuladoService> {

		public Instance(SimuladoRepository jpaRepository) {
			super(jpaRepository);
		}
		
		private QuestaoRepository questaoRepository;
		private UsuarioRepository usuarioRepository;
		private RespostaSimuladoRepository respostaSimuladoRepository;
		private SalaRepository salaRepository;
		
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
		
		public Instance withSalaRepository(SalaRepository salaRepository) {
			this.salaRepository = salaRepository;
			return this;
		}
		
		@Override
		public SimuladoService build() {
			SimuladoService service = new SimuladoService();
			service.setJpaRepository(jpaRepository);
			service.setSalaRepository(salaRepository);
			service.setQuestaoRepository(questaoRepository);
			service.setUsuarioRepository(usuarioRepository);
			service.setRespostaSimuladoRepository(respostaSimuladoRepository);
			return service;
		}
	}
	
	private Simulado loadSimuladoById(long idSimulado) {
		return jpaRepository.findById(idSimulado);
	}
	
	public void setSalaRepository(SalaRepository salaRepository) {
		this.salaRepository = salaRepository;
	}

	private Usuario loadUsuarioById(long idSimulado) {
		return usuarioRepository.findById(idSimulado);
	}
	
	private RespostaSimulado loadRespostaSimulado(RespostaSimuladoRequest request) {
		return respostaSimuladoRepository.consultarRespostaSimulado(request.getIdSimulado(), request.getIdUsuario());
	}
	
	private RespostaSimulado mapperSumulado(RespostaSimuladoRequest request) {
		return  new RespostaSimuladoMapper().transform(request, loadSimuladoById(request.getIdSimulado()), loadUsuarioById(request.getIdUsuario()), questaoRepository);
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
	   List<Questao> questoes = QuestaoPoscomp2002.registerPoscomp();
	   List<Questao> questoes1 = QuestaoPoscomp2003.registerPoscomp();
	   List<Questao> questoes2 = QuestaoPoscomp2004.registerPoscomp();
	   List<Questao> questoes3 = QuestaoPoscomp2005.registerPoscomp();
	   List<Questao> questoes4 = QuestaoPoscomp2006.registerPoscomp();
	   List<Questao> questoes5 = QuestaoPoscomp2007.registerPoscomp();
	   List<Questao> questoes6 = QuestaoPoscomp2008.registerPoscomp();
	   List<Questao> questoes7 = QuestaoPoscomp2009.registerPoscomp();
	   List<Questao> questoes8 = QuestaoPoscomp2010.registerPoscomp();
	   List<Questao> questoes9 = QuestaoPoscomp2011.registerPoscomp();
	   List<Questao> questoes10 = QuestaoPoscomp2012.registerPoscomp();
	   List<Questao> questoes11 = QuestaoPoscomp2013.registerPoscomp();
	   List<Questao> questoes12 = QuestaoPoscomp2014.registerPoscomp();
	   List<Questao> questoes13 = QuestaoPoscomp2015.registerPoscomp();
	   List<Questao> questoes22 = QuestaoEnade2005.register();
	   
	   switch (UPDATE_VALUES) {
		case 9:
			questaoRepository.saveAll(questoes9);
			break;
		case 11:
			questaoRepository.saveAll(questoes10);
			questaoRepository.saveAll(questoes11);
			questaoRepository.saveAll(questoes12);
			questaoRepository.saveAll(questoes13);
			break;
		case 12:
			break;
		default:
			questaoRepository.saveAll(questoes);
			questaoRepository.saveAll(questoes1);
			questaoRepository.saveAll(questoes2);
			questaoRepository.saveAll(questoes3);
			questaoRepository.saveAll(questoes4);
			questaoRepository.saveAll(questoes5);
			questaoRepository.saveAll(questoes6);
			questaoRepository.saveAll(questoes7);
			questaoRepository.saveAll(questoes8);
			questaoRepository.saveAll(questoes9);
			questaoRepository.saveAll(questoes22);
			break;
		}
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
	
	
	public ResponseEntity<ResponseBase<SimuladoCompletoResponse>> buscarQuestoesSimuladoId(long id) {
		ResponseBase<SimuladoCompletoResponse> baseResponse = new ResponseBase<>();
		try {
			SimuladoCompletoResponse response = buscarQuestoesSimuladoPorId(id);
			baseResponse = new ResponseBase<>(true, "Questões consultadas com sucesso", response);
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível consultar as questões do simulado", null);
		}
		return new ResponseEntity<ResponseBase<SimuladoCompletoResponse>>(baseResponse, HttpStatus.OK);
	}
	
	
	public ResponseEntity<ResponseBase<List<SimuladoBaseResponse>>> buscarSimuladoIdSala(long idUsuario, long idSala) {
		ResponseBase<List<SimuladoBaseResponse>> baseResponse = new ResponseBase<>();
		try {
			Usuario usuario = loadUsuarioById(idUsuario);
			if(usuario == null) {
				baseResponse = new ResponseBase<>(false, "Usuário não econtrado", null);
			} else {
				simuladoResponse = buscarSimuladoPorIdSala(idSala);
				if(simuladoResponse != null) {
					if(usuario instanceof Professor) {
						for(SimuladoBaseResponse simulado : simuladoResponse) {
							List<ResultadoSimuladoResponse> resposta = buscarResultadoSimulado(simulado.getId());
							if(resposta != null) {
								simulado.setRespondido(true);
								simulado.setQuantidadeResposta(resposta.size());
								ResultadoSimuladoResponse respostaTotal = buscarResultadoSimulado(simulado, idUsuario);
								simulado.setSimuladoResultado(respostaTotal);
							}
						}
					} else {
						for(SimuladoBaseResponse simulado : simuladoResponse) {

							ResultadoSimuladoResponse resposta = buscarResultadoSimulado(simulado.getId(), idUsuario);
							simulado.setRespondido(resposta != null);
							simulado.setSimuladoResultado(resposta);
						}
					}
					baseResponse = new ResponseBase<>(true, "Simulados consultados com sucesso", simuladoResponse);
				} else {
					baseResponse = new ResponseBase<>(false, "Nenhum simulado encontrado", simuladoResponse);
				}
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível consultar o simulado", null);
		}
		return new ResponseEntity<ResponseBase<List<SimuladoBaseResponse>>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<List<SimuladoBaseResponse>>> buscarSimuladoIdUsuario(long idUsuario) {
		ResponseBase<List<SimuladoBaseResponse>> baseResponse = new ResponseBase<>();
		try {
			List<SimuladoBaseResponse> simuladoResponse = buscarSimuladoPorIdUsuario(idUsuario);
			for(SimuladoBaseResponse simulado : simuladoResponse) {
				ResultadoSimuladoResponse resposta = buscarResultadoSimulado(simulado.getId(), idUsuario);
				simulado.setRespondido(resposta != null);
				simulado.setSimuladoResultado(resposta);
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
	

	public ResponseEntity<ResponseBase<ResultadoSimuladoResponse>> salvarRespostaSimulado(RespostaSimuladoRequest request) {
		ResponseBase<ResultadoSimuladoResponse> baseResponse = new ResponseBase<>();
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
					ResultadoSimuladoResponse resposta = createRespostaSimuladoResponse(request);
					baseResponse = new ResponseBase<>(true, "Resposta registrada com sucesso", resposta);
				}
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível salvar a resposta do simulado", null);
		}
		return new ResponseEntity<ResponseBase<ResultadoSimuladoResponse>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<SimuladoCompletoResponse>> deletarSimulado(DeletarSimuladoRequest request) {
		ResponseBase<SimuladoCompletoResponse> baseResponse = new ResponseBase<>();
		try {
			Usuario usuario = loadUsuarioById(request.getIdUsuario());
			Simulado simulado = loadSimuladoById(request.getIdSimulado());
			if(usuario == null) {
				baseResponse = new ResponseBase<>(false, "Usuário não econtrado", null);
			} else if(simulado == null) {
				baseResponse = new ResponseBase<>(false, "Simulado não econtrado", null);
			} else if(usuario.getId() != simulado.getIdUsuario().getId()) {
				baseResponse = new ResponseBase<>(false, "Esse simulado não pertence ao seu usuário", null);
			} else {
				jpaRepository.deleteSimuladoById(request.getIdSimulado());
				Simulado simulado2 = loadSimuladoById(request.getIdSimulado());
				if(simulado2 != null) {
					SimuladoCompletoResponse simuladoResponse = new SimuladoMapper().transform(simulado);
					baseResponse = new ResponseBase<>(true, "Simulado removido com sucesso", simuladoResponse);
				} else {
					baseResponse = new ResponseBase<>(false, "Não foi possível remover o simulado", null);
				}
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível remover a sala de simulado", null);
		}
		return new ResponseEntity<ResponseBase<SimuladoCompletoResponse>>(baseResponse, HttpStatus.OK);
	}


	private ResultadoSimuladoResponse buscarResultadoSimulado(SimuladoBaseResponse simulado, long idUsuario) {
		return getResultadoService().convertSimuladoToSimuladoResponse(simulado, idUsuario);
	}
	
	private ResultadoSimuladoResponse buscarResultadoSimulado(long idSimulado, long idUsuario) {
		return getResultadoService().buscarResultadoSimulado(idSimulado, idUsuario);
	}
	
	private List<ResultadoSimuladoResponse> buscarResultadoSimulado(long idSimulado) {
		return getResultadoService().buscarResultadoSimulado(idSimulado);
	}
	
	public ResultadoSimuladoResponse createRespostaSimuladoResponse(RespostaSimuladoRequest request) {
		RespostaSimulado respostaSimulado = mapperSumulado(request);
		respostaSimuladoRepository.save(respostaSimulado);
		ResultadoSimuladoResponse resultado = new ResultadoSimuladoResponse();
		resultado.setIdSimulado(respostaSimulado.getIdSimulado().getId());
		resultado.setNome(respostaSimulado.getIdSimulado().getNome());
		resultado.setDescricao(respostaSimulado.getIdSimulado().getDescricao());
		resultado.setDataCriacao(respostaSimulado.getIdSimulado().getDataCriacao());
		resultado.setDataEnvio(respostaSimulado.getDataEntrega());
		resultado.setResultadoGeral(createResultadoGeral(request));
		resultado.setTipoSimulado(respostaSimulado.getIdSimulado().getTipoSimulado().codigo);
		resultado.setResultadoMatematica(createResultadoPorArea(request, EArea.MATEMATICA));
		resultado.setResultadoFundamentoComputacao(createResultadoPorArea(request, EArea.FUNDAMENTOS_DE_COMPUTACAO));
		resultado.setResultadoTecnologiaComputacao(createResultadoPorArea(request, EArea.TECNOLOGIA_DA_COMPUTACAO));
		return resultado;
	}
	
	public ResultadoQuantitativo createResultadoGeral(RespostaSimuladoRequest request) {
		int erros = respostaSimuladoRepository.consultarErrosSimulado(request.getIdUsuario(), request.getIdSimulado());
		int acertos = respostaSimuladoRepository.consultarAcertosSimulado(request.getIdUsuario(), request.getIdSimulado());
		int naoRespondidas = respostaSimuladoRepository.consultarQuantidadeNaoRespondiasSimulado(request.getIdUsuario(), request.getIdSimulado());
		int total = respostaSimuladoRepository.consultarTotalQuestaoes(request.getIdSimulado());
		
		ResultadoQuantitativo resultado = new ResultadoQuantitativo();
		resultado.setAcertos(acertos);
		resultado.setErros(erros);
		resultado.setNaoRespondidas(naoRespondidas);
		resultado.setTotal(total);
		return resultado;
	}
	
	public ResultadoQuantitativo createResultadoPorArea(RespostaSimuladoRequest request, EArea area) {
		int erros = respostaSimuladoRepository.consultarErrosSimuladoPorArea(request.getIdUsuario(), request.getIdSimulado(), area.codigo);
		int acertos = respostaSimuladoRepository.consultarAcertosSimuladoPorArea(request.getIdUsuario(), request.getIdSimulado(), area.codigo);
		int naoRespondidas = respostaSimuladoRepository.consultarQuantidadeNaoRespondiasSimuladoPorArea(request.getIdUsuario(), request.getIdSimulado(), area.codigo);
		int total = respostaSimuladoRepository.consultarTotalQuestaoesPorArea(request.getIdSimulado(), area.codigo);
		
		ResultadoQuantitativo resultado = new ResultadoQuantitativo();
		resultado.setAcertos(acertos);
		resultado.setErros(erros);
		resultado.setNaoRespondidas(naoRespondidas);
		resultado.setTotal(total);
		return resultado;
	}
	
	public ResultadoService getResultadoService() {
		if(resultadoService == null) {
			resultadoService = new ResultadoService
					.Instance(respostaSimuladoRepository)
					.withUsuarioRepository(usuarioRepository)
					.withQuestaoRepository(questaoRepository)
					.withSimuladoRepository(jpaRepository)
					.build();
		}
		
		return resultadoService;
	}
	
	public ResponseEntity<ResponseBase<SimuladoCompletoResponse>> gerarSimulado(SimuladoRequest sumuladoRequest) {
		ResponseBase<SimuladoCompletoResponse> baseResponse = new ResponseBase<>();
		try {
			SimuladoCompletoResponse simuladoResponse = null;
			switch (sumuladoRequest.getTipoSimulado()) {
			case 2:
				simuladoResponse = gerarSimuladPoscom(sumuladoRequest);
				if(simuladoResponse != null) {
					baseResponse = new ResponseBase<>(true, "Simulado gerado com sucesso", simuladoResponse);
				} else {
					baseResponse = new ResponseBase<>(true, "Questões não encontras para esse simulado", simuladoResponse);
				}
				break;
			case 1:
				simuladoResponse = gerarSimuladEnade(sumuladoRequest);
				if(simuladoResponse != null) {
					baseResponse = new ResponseBase<>(true, "Simulado gerado com sucesso", simuladoResponse);
				} else {
					baseResponse = new ResponseBase<>(true, "Questões não encontras para esse simulado", simuladoResponse);
				}
				break;
			case 0:
				simuladoResponse = gerarSimuladoPersonalizado(sumuladoRequest);
				if(simuladoResponse != null) {
					baseResponse = new ResponseBase<>(true, "Simulado gerado com sucesso", simuladoResponse);
				} else {
					baseResponse = new ResponseBase<>(true, "Quantidade de questão não informada para esse simulado", simuladoResponse);
				}
				break;
			default:
				baseResponse = new ResponseBase<>(false, "Não foi possível gerar o simulado", null);
				break;
			}
			
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível gerar o simulado", null);
		}
		return new ResponseEntity<ResponseBase<SimuladoCompletoResponse>>(baseResponse, HttpStatus.OK);
	}
	
	private SimuladoCompletoResponse saveSimuladoResponse(SimuladoRequest sumuladoRequest, List<Questao> questoes) {
		Sala sala = null;
		if(sumuladoRequest.getIdSala() != null) {
			sala = salaRepository.findById((long) sumuladoRequest.getIdSala());
		}
		Simulado simulado = saveSimulado(sumuladoRequest, questoes, sala);
		SimuladoCompletoResponse simuladoResponse = new SimuladoMapper().transform(simulado);
		return simuladoResponse;
	}
	
	private SimuladoCompletoResponse gerarSimuladEnade(SimuladoRequest sumuladoRequest) {
		List<Questao> questoes = gerarQuestaoPorQuantidadeEnade(sumuladoRequest.getAnoProva());
		if(questoes.isEmpty()) {
			return null;
		}
		return saveSimuladoResponse(sumuladoRequest, questoes);
	}
	
	private SimuladoCompletoResponse gerarSimuladPoscom(SimuladoRequest sumuladoRequest) {
		List<Questao> questoes = gerarQuestaoPorQuantidadePoscomp(sumuladoRequest.getAnoProva());
		if(questoes.size() == 0) {
			return null;
		}
		return saveSimuladoResponse(sumuladoRequest, questoes);
	}
	
	private SimuladoCompletoResponse gerarSimuladoPersonalizado(SimuladoRequest sumuladoRequest) {
		List<Questao> questoes = new ArrayList<Questao>();
		List<Questao> questoesEnade = gerarQuestaoEnadePersonalizada(sumuladoRequest);
		List<Questao> questoesPoscomp = gerarQuestaoPoscompPersonalizada(sumuladoRequest);
		
		questoes.addAll(questoesEnade);
		questoes.addAll(questoesPoscomp);
		if(questoes.isEmpty()) {
			return null;
		}
		return saveSimuladoResponse(sumuladoRequest, questoes);
	}
	
	private SimuladoCompletoResponse buscarSimuladoPorId(long simuladoId) {
		Simulado simulado = jpaRepository.findById(simuladoId);
		SimuladoCompletoResponse simuladoResponse = new SimuladoMapper().transform(simulado);
		return simuladoResponse;
	}
	
	private SimuladoCompletoResponse buscarQuestoesSimuladoPorId(long simuladoId) {
		Simulado simulado = jpaRepository.findById(simuladoId);
		SimuladoCompletoResponse response = new SimuladoMapper().transform(simulado); //new SimuladoQuestoesMapper().transform(simulado);
		return response;
	}
	
	private List<SimuladoBaseResponse> buscarSimuladoPorIdUsuario(long usuarioId) {
		List<Simulado> simulados = jpaRepository.buscarSimuladosPorId(usuarioId);
		List<SimuladoBaseResponse> simuladoResponse = new SimuladoResumoMapper().transform(simulados);
		return simuladoResponse;
	}
	
	private List<SimuladoBaseResponse> buscarSimuladoPorIdSala(long idSimulado) {
		List<Simulado> simulados = jpaRepository.buscarSimuladosPorIdSala(idSimulado);
		List<SimuladoBaseResponse> simuladoResponse = new SimuladoResumoMapper().transform(simulados);
		return simuladoResponse;
	}
	
	private List<QuestaoAlternativa> getQuestaoPoscomp(int area, int tipoSimulado, int quantidadeQuestao, Integer ano) {
		return ano != null ? questaoRepository.consultPoscompByAno(area, tipoSimulado, (int) ano, quantidadeQuestao) : 
			questaoRepository.consultPoscomp(area, tipoSimulado, quantidadeQuestao); 
	}
	
	private List<QuestaoAlternativa> getQuestaoAlternativaEnade(int formacao, int tipoSimulado, int quantidadeQuestao, Integer ano) {
		return ano != null ? questaoRepository.consultEnadeByAno(formacao, tipoSimulado, (int) ano, quantidadeQuestao): 
			questaoRepository.consultEnade(formacao, tipoSimulado, quantidadeQuestao); 
	}
	
	private List<QuestaoDiscusiva> getQuestaoDiscursivaEnade(int formacao, int quantidadeQuestao, Integer ano) {
		return ano != null ? questaoRepository.consultEnadeDiscursivaByAno(formacao, (int) ano, quantidadeQuestao) : 
			questaoRepository.consultEnadeDiscursiva(formacao, quantidadeQuestao); 
	}
	
	private Simulado saveSimulado(SimuladoRequest sumuladoRequest, List<Questao> questoes, Sala  sala) {
		Simulado simulado = new Simulado();
		simulado.setNome(sumuladoRequest.getNome());
		simulado.setDescricao(sumuladoRequest.getDescricao());
		simulado.setDataCriacao(new Date());
		simulado.setDataInicio(sumuladoRequest.getDataInicio());
		simulado.setDataFimSimulado(sumuladoRequest.getDataFimSimulado());
		simulado.setTempoMaximo(sumuladoRequest.getTempoMaximo());
		simulado.setIdUsuario(usuarioRepository.findById((long)sumuladoRequest.getIdUsuario()));
		simulado.setQuantidadeQuestoes(questoes.size());
		simulado.setTipoSimulado(ETipoSimulado.getEnun(sumuladoRequest.getTipoSimulado()));	
		simulado.setQuestoes(questoes);
		if(sala != null)
			simulado.setSala(sala);
		Simulado simuladoResponse = jpaRepository.save(simulado);
		simulado.setId(simuladoResponse.getId());
		return simulado;
	}
	
	private List<Questao> gerarQuestaoPorQuantidadePoscomp(Integer anoProva) {
		List<Questao> questoes = new ArrayList<Questao>();
		List<QuestaoAlternativa> questaoPart1 = getQuestaoPoscomp(EArea.MATEMATICA.codigo, ETipoSimulado.POSCOMP.codigo, 20, anoProva);
		List<QuestaoAlternativa> questaoPart2 = getQuestaoPoscomp(EArea.FUNDAMENTOS_DE_COMPUTACAO.codigo, ETipoSimulado.POSCOMP.codigo, 20, anoProva);
		List<QuestaoAlternativa> questaoPart3 = getQuestaoPoscomp(EArea.TECNOLOGIA_DA_COMPUTACAO.codigo, ETipoSimulado.POSCOMP.codigo, 30, anoProva);
		questoes.addAll(questaoPart1);
		questoes.addAll(questaoPart2);
		questoes.addAll(questaoPart3);
		return questoes;
	}
	
	
	private List<Questao> gerarQuestaoPorQuantidadeEnade(Integer anoProva) {
		List<Questao> questoes = new ArrayList<Questao>();
	
		List<QuestaoDiscusiva> questaoDiscursivaGeral = getQuestaoDiscursivaEnade(EFormacao.GERAL.codigo, 2, anoProva);
		List<QuestaoAlternativa> questaoAssinalarGeral = getQuestaoAlternativaEnade(EFormacao.GERAL.codigo, ETipoSimulado.ENADE.codigo, 8, anoProva);
		List<QuestaoDiscusiva> questaoDiscursivaEspecifica = getQuestaoDiscursivaEnade(EFormacao.ESPECIFICA.codigo, 3, anoProva);
		List<QuestaoAlternativa> questaoAssinalarEspecifica = getQuestaoAlternativaEnade(EFormacao.ESPECIFICA.codigo, ETipoSimulado.ENADE.codigo, 27, anoProva);
	
		questoes.addAll(questaoDiscursivaGeral);
		questoes.addAll(questaoAssinalarGeral);
		questoes.addAll(questaoDiscursivaEspecifica);
		questoes.addAll(questaoAssinalarEspecifica);
		return questoes;
	}
	
	private List<Questao> gerarQuestaoPoscompPersonalizada(SimuladoRequest sumuladoRequest) {
		List<Questao> questoes = new ArrayList<Questao>();
		if(sumuladoRequest.getSumuladoConfigPoscomp() != null) {
			if(sumuladoRequest.getSumuladoConfigPoscomp().getQtdMatematica() > 0) {
				List<QuestaoAlternativa> questaoPart1 = getQuestaoPoscomp(EArea.MATEMATICA.codigo, ETipoSimulado.POSCOMP.codigo, 
						sumuladoRequest.getSumuladoConfigPoscomp().getQtdMatematica(),
						sumuladoRequest.getAnoProva());
				questoes.addAll(questaoPart1);
			}
			
			if(sumuladoRequest.getSumuladoConfigPoscomp().getQtdFundamentos() > 0) {
				List<QuestaoAlternativa> questaoPart2 = getQuestaoPoscomp(EArea.FUNDAMENTOS_DE_COMPUTACAO.codigo, 
						ETipoSimulado.POSCOMP.codigo, sumuladoRequest.getSumuladoConfigPoscomp().getQtdFundamentos(),
						sumuladoRequest.getAnoProva());
				questoes.addAll(questaoPart2);
			}
			
			if(sumuladoRequest.getSumuladoConfigPoscomp().getQtdTecnologia() > 0) {
				List<QuestaoAlternativa> questaoPart3 = getQuestaoPoscomp(EArea.TECNOLOGIA_DA_COMPUTACAO.codigo,
						ETipoSimulado.POSCOMP.codigo, sumuladoRequest.getSumuladoConfigPoscomp().getQtdTecnologia(),
						sumuladoRequest.getAnoProva());
				questoes.addAll(questaoPart3);
			}
		}
		return questoes;
	}
	
	private List<Questao> gerarQuestaoEnadePersonalizada(SimuladoRequest sumuladoRequest) {
		List<Questao> questoes = new ArrayList<Questao>();
		if(sumuladoRequest.getSumuladoConfigEnade() != null) {
			int formacaoGeral = sumuladoRequest.getSumuladoConfigEnade().getQtdFormacaoGeral();
			questoes.addAll(criarQuestaoEnadeGeral(formacaoGeral, sumuladoRequest.getAnoProva()));
			
			int formacaoEspecifica = sumuladoRequest.getSumuladoConfigEnade().getQtdFormacaoEspecifica();
			questoes.addAll(criarQuestaoEnadeEspecifica(formacaoEspecifica, sumuladoRequest.getAnoProva()));
		}
		return questoes;
	}
	
	private List<Questao> criarQuestaoEnadeGeral(Integer qtd, Integer ano) {
		List<Questao> questoes = new ArrayList<Questao>();
		if(qtd > 0) {
			List<QuestaoDiscusiva> questaoDiscursivaGeral = new ArrayList<>();
			List<QuestaoAlternativa> questaoAssinalarGeral = new ArrayList<>();;
			switch (qtd) {
				case 1:
					questaoAssinalarGeral = getQuestaoAlternativaEnade(EFormacao.GERAL.codigo, ETipoSimulado.ENADE.codigo, qtd, ano);
					break;
				case 2:
					questaoDiscursivaGeral = getQuestaoDiscursivaEnade(EFormacao.GERAL.codigo, 1, ano);
					questaoAssinalarGeral = getQuestaoAlternativaEnade(EFormacao.GERAL.codigo, ETipoSimulado.ENADE.codigo, qtd - 1, ano);
					break;
				case 3:
					questaoDiscursivaGeral = getQuestaoDiscursivaEnade(EFormacao.GERAL.codigo, 1, ano);
					questaoAssinalarGeral = getQuestaoAlternativaEnade(EFormacao.GERAL.codigo, ETipoSimulado.ENADE.codigo, qtd - 1, ano);
					break;
				case 4:
					questaoDiscursivaGeral = getQuestaoDiscursivaEnade(EFormacao.GERAL.codigo, 1, ano);
					questaoAssinalarGeral = getQuestaoAlternativaEnade(EFormacao.GERAL.codigo, ETipoSimulado.ENADE.codigo, qtd - 1, ano);
					break;
				default:
					questaoDiscursivaGeral = getQuestaoDiscursivaEnade(EFormacao.GERAL.codigo, 2, ano);
					questaoAssinalarGeral = getQuestaoAlternativaEnade(EFormacao.GERAL.codigo, ETipoSimulado.ENADE.codigo, qtd - 2, ano);
					break;
			}
			questoes.addAll(questaoDiscursivaGeral);
			questoes.addAll(questaoAssinalarGeral);
		}
		return questoes;
	}
	
	private List<Questao> criarQuestaoEnadeEspecifica(int qtd, Integer ano) {
		List<Questao> questoes = new ArrayList<Questao>();
		if(qtd > 0) {
			List<QuestaoDiscusiva> questaoDiscursivaEspecifica = new ArrayList<QuestaoDiscusiva>();
			List<QuestaoAlternativa> questaoAssinalarEspecifica = new ArrayList<QuestaoAlternativa>();
			switch (qtd) {
				case 1:
					questaoAssinalarEspecifica = getQuestaoAlternativaEnade(EFormacao.ESPECIFICA.codigo, ETipoSimulado.ENADE.codigo, qtd, ano);
					break;
				case 2:
					questaoDiscursivaEspecifica = getQuestaoDiscursivaEnade(EFormacao.ESPECIFICA.codigo, 1, ano);
					questaoAssinalarEspecifica = getQuestaoAlternativaEnade(EFormacao.ESPECIFICA.codigo, ETipoSimulado.ENADE.codigo, qtd - 1, ano);
					break;
				case 3:
					questaoDiscursivaEspecifica = getQuestaoDiscursivaEnade(EFormacao.ESPECIFICA.codigo, 1, ano);
					questaoAssinalarEspecifica = getQuestaoAlternativaEnade(EFormacao.ESPECIFICA.codigo, ETipoSimulado.ENADE.codigo, qtd - 1, ano);
					break;
				case 4:
					questaoDiscursivaEspecifica = getQuestaoDiscursivaEnade(EFormacao.ESPECIFICA.codigo, 2, ano);
					questaoAssinalarEspecifica = getQuestaoAlternativaEnade(EFormacao.ESPECIFICA.codigo, ETipoSimulado.ENADE.codigo, qtd - 2, ano);
					break;
				case 5:
					questaoDiscursivaEspecifica = getQuestaoDiscursivaEnade(EFormacao.ESPECIFICA.codigo, 2, ano);
					questaoAssinalarEspecifica = getQuestaoAlternativaEnade(EFormacao.ESPECIFICA.codigo, ETipoSimulado.ENADE.codigo, qtd - 2, ano);
					break;
				default:
					questaoDiscursivaEspecifica = getQuestaoDiscursivaEnade(EFormacao.ESPECIFICA.codigo, 3, ano);
					questaoAssinalarEspecifica = getQuestaoAlternativaEnade(EFormacao.ESPECIFICA.codigo, ETipoSimulado.ENADE.codigo, qtd - 3, ano);
					break;
			}
			questoes.addAll(questaoDiscursivaEspecifica);
			questoes.addAll(questaoAssinalarEspecifica);
		}
		return questoes;
	}
}
