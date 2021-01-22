package ifsc.sti.tcc.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import ifsc.sti.tcc.modelos.respostasimulado.RespostaQuestao;
import ifsc.sti.tcc.modelos.respostasimulado.RespostaSimulado;
import ifsc.sti.tcc.modelos.simulado.Simulado;
import ifsc.sti.tcc.modelos.usuario.Aluno;
import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.props.EArea;
import ifsc.sti.tcc.props.EDisciplina;
import ifsc.sti.tcc.repository.QuestaoRepository;
import ifsc.sti.tcc.repository.RespostaSimuladoRepository;
import ifsc.sti.tcc.repository.SimuladoRepository;
import ifsc.sti.tcc.repository.UsuarioRepository;
import ifsc.sti.tcc.resources.mappers.domaintoview.QuestaoGabaritoMapper;
import ifsc.sti.tcc.resources.mappers.domaintoview.QuestaoRespostaMapper;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.question.response.QuestaoResponse;
import ifsc.sti.tcc.resources.rest.models.resultado.base.ResultadoDisciplinaQuantitativo;
import ifsc.sti.tcc.resources.rest.models.resultado.base.ResultadoQuantitativo;
import ifsc.sti.tcc.resources.rest.models.resultado.request.ResultadoSimuladoProvaRequest;
import ifsc.sti.tcc.resources.rest.models.resultado.request.ResultadoSimuladoRequest;
import ifsc.sti.tcc.resources.rest.models.resultado.request.ResultadoSimuladoSalaRequest;
import ifsc.sti.tcc.resources.rest.models.resultado.response.ResultadoGeralSalaResponse;
import ifsc.sti.tcc.resources.rest.models.resultado.response.ResultadoGeralUsuarioResponse;
import ifsc.sti.tcc.resources.rest.models.resultado.response.ResultadoSimuladoResponse;
import ifsc.sti.tcc.resources.rest.models.resultado.response.ResultadoSimuladoSalaCompletoResponse;
import ifsc.sti.tcc.resources.rest.models.resultado.response.ResultadoSimuladoSalaResponse;
import ifsc.sti.tcc.resources.rest.models.simulado.response.SimuladoBaseResponse;

public class ResultadoService {

	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(ResultadoService.class);

	private RespostaSimuladoRepository jpaRepository;
	private QuestaoRepository questaoRepository;
	private UsuarioRepository usuarioRepository;
	private SimuladoRepository simuladoRepository;

	public static class Instance extends BaseService<RespostaSimuladoRepository> implements BaseService.BaseObject<ResultadoService> {

		public Instance(RespostaSimuladoRepository jpaRepository) {
			super(jpaRepository);
		}
		
		private QuestaoRepository questaoRepository;
		private UsuarioRepository usuarioRepository;
		private SimuladoRepository simuladoRepository;
		
		public Instance withQuestaoRepository(QuestaoRepository repository) {
			this.questaoRepository = repository;
			return this;
		}

		public Instance withUsuarioRepository(UsuarioRepository repository) {
			this.usuarioRepository = repository;
			return this;
		}
		
		public Instance withSimuladoRepository(SimuladoRepository repository) {
			this.simuladoRepository = repository;
			return this;
		}
		
		@Override
		public ResultadoService build() {
			ResultadoService service = new ResultadoService();
			service.setJpaRepository(jpaRepository);
			service.setQuestaoRepository(questaoRepository);
			service.setUsuarioRepository(usuarioRepository);
			service.setSimuladoRepository(simuladoRepository);
			return service;
		}
	}
	
	private Simulado loadSimuladoById(long idSimulado) {
		return simuladoRepository.findById(idSimulado);
	}
	
	private Usuario loadUsuarioById(long idSimulado) {
		return usuarioRepository.findById(idSimulado);
	}
	
		public SimuladoRepository getSimuladoRepository() {
		return simuladoRepository;
	}

	public void setSimuladoRepository(SimuladoRepository simuladoRepository) {
		this.simuladoRepository = simuladoRepository;
	}

	public void setQuestaoRepository(QuestaoRepository questaoRepository) {
		this.questaoRepository = questaoRepository;
	}

	public void setUsuarioRepository(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}

	
	public void setJpaRepository(RespostaSimuladoRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}
	
	
	public ResponseEntity<ResponseBase<ResultadoSimuladoSalaCompletoResponse>> buscarRepostaSimulado(ResultadoSimuladoSalaRequest request) {
		ResponseBase<ResultadoSimuladoSalaCompletoResponse> baseResponse = new ResponseBase<>();
		try {
			
			Usuario professor = loadUsuarioById(request.getIdProfessor());
			ResultadoSimuladoSalaCompletoResponse lRespostaSimulado = buscarResultadoSimulado(request);
			if(lRespostaSimulado == null) {
				baseResponse = new ResponseBase<>(false, "Resultado simulado não encontrado", null);
			} else {
				if(loadSimuladoById(request.getIdSimulado())  == null) {
					baseResponse = new ResponseBase<>(false, "Simulado não encontrado", null);
				} else if(loadUsuarioById(request.getIdAluno()) == null){
					baseResponse = new ResponseBase<>(false, "Aluno não encontrado", null);
				} else if(professor instanceof Aluno){
					baseResponse = new ResponseBase<>(false, "Para realizar essa consulta é necessário ser professor", null);
				} else {
					baseResponse = new ResponseBase<>(true, "Resultado simulado obtido com sucesso", lRespostaSimulado);
				}
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível buscar o resultado do simulado", null);
		}
		return new ResponseEntity<ResponseBase<ResultadoSimuladoSalaCompletoResponse>>(baseResponse, HttpStatus.OK);
	}
	
	
	public ResponseEntity<ResponseBase<ResultadoSimuladoResponse>> buscarRepostaSimulado(ResultadoSimuladoRequest request) {
		ResponseBase<ResultadoSimuladoResponse> baseResponse = new ResponseBase<>();
		try {
			ResultadoSimuladoResponse lRespostaSimulado = buscarResultadoSimulado(request.getIdSimulado(), request.getIdUsuario());
			if(lRespostaSimulado == null) {
				baseResponse = new ResponseBase<>(false, "Resultado simulado não encontrado", null);
			} else {
				if(loadSimuladoById(request.getIdSimulado())  == null) {
					baseResponse = new ResponseBase<>(false, "Simulado não encontrado", null);
				} else if(loadUsuarioById(request.getIdUsuario()) == null){
					baseResponse = new ResponseBase<>(false, "Usuário não encontrado", null);
				} else {
					baseResponse = new ResponseBase<>(true, "Resultado simulado obtido com sucesso", lRespostaSimulado);
				}
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível buscar o resultado do simulado", null);
		}
		return new ResponseEntity<ResponseBase<ResultadoSimuladoResponse>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<List<ResultadoSimuladoSalaResponse>>> buscarRepostaSimuladoPorSala(ResultadoSimuladoRequest request) {
		ResponseBase<List<ResultadoSimuladoSalaResponse>> baseResponse = new ResponseBase<>();
		try {
			Usuario usuario = loadUsuarioById(request.getIdUsuario());
			List<ResultadoSimuladoSalaResponse> lRespostaSimulado = buscarResultadosSimulado(request.getIdSimulado());
			if(loadSimuladoById(request.getIdSimulado())  == null) {
				baseResponse = new ResponseBase<>(false, "Simulados não encontrado", null);
			} else if(usuario == null){
				baseResponse = new ResponseBase<>(false, "Usuário não encontrado", null);
			} else if(usuario instanceof Aluno){
				baseResponse = new ResponseBase<>(false, "Para realizar essa consulta é necessário ser professor", null);
			} else {
				baseResponse = new ResponseBase<>(true, "Resultado simulado obtido com sucesso", lRespostaSimulado);
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível buscar os resultados do simulado", null);
		}
		return new ResponseEntity<ResponseBase<List<ResultadoSimuladoSalaResponse>>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<ResultadoGeralUsuarioResponse>> buscarRepostaGeralTodos(long idUsuario) {
		ResponseBase<ResultadoGeralUsuarioResponse> baseResponse = new ResponseBase<>();
		try {
			ResultadoGeralUsuarioResponse lRespostaSimulado = buscarResultadoTodosSimulado(idUsuario);
			if(lRespostaSimulado == null) {
				baseResponse = new ResponseBase<>(false, "Resultado simulado não encontrado", null);
			} else {
				if(loadUsuarioById(idUsuario) == null){
					baseResponse = new ResponseBase<>(false, "Usuário não encontrado", null);
				} else {
					baseResponse = new ResponseBase<>(true, "Resultados dos simulado obtido com sucesso", lRespostaSimulado);
				}
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível buscar o resultado do simulado", null);
		}
		return new ResponseEntity<ResponseBase<ResultadoGeralUsuarioResponse>>(baseResponse, HttpStatus.OK);
	}
	
	
	public ResponseEntity<ResponseBase<ResultadoGeralSalaResponse>> buscarRepostaGeralPorSala(long idUsuario, long idSala) {
		ResponseBase<ResultadoGeralSalaResponse> baseResponse = new ResponseBase<>();
		try {
			ResultadoGeralSalaResponse lRespostaSimulado = buscarResultadoTodosSimulado(idUsuario, idSala);
			if(lRespostaSimulado == null) {
				baseResponse = new ResponseBase<>(false, "Resultado simulado não encontrado", null);
			} else {
				if(loadUsuarioById(idUsuario) == null){
					baseResponse = new ResponseBase<>(false, "Usuário não encontrado", null);
				} else {
					baseResponse = new ResponseBase<>(true, "Resultados dos simulado obtido com sucesso", lRespostaSimulado);
				}
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível buscar o resultado do simulado", null);
		}
		return new ResponseEntity<ResponseBase<ResultadoGeralSalaResponse>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<ResultadoGeralUsuarioResponse>> buscarRepostaGeralPorProvas(ResultadoSimuladoProvaRequest request) {
		ResponseBase<ResultadoGeralUsuarioResponse> baseResponse = new ResponseBase<>();
		try {
			ResultadoGeralUsuarioResponse lRespostaSimulado = buscarResultadoGeralPorTipoProva(request);
			if(lRespostaSimulado == null) {
				baseResponse = new ResponseBase<>(false, "Resultado dos simulados não encontrado", null);
			} else {
				if(loadUsuarioById(request.getIdUsuario()) == null){
					baseResponse = new ResponseBase<>(false, "Usuário não encontrado", null);
				} else {
					baseResponse = new ResponseBase<>(true, "Resultados dos simulado obtido com sucesso", lRespostaSimulado);
				}
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível buscar o resultado dos simulados", null);
		}
		return new ResponseEntity<ResponseBase<ResultadoGeralUsuarioResponse>>(baseResponse, HttpStatus.OK);
	}
	
	
	public ResponseEntity<ResponseBase<List<ResultadoSimuladoResponse>>> buscarUltimosResultados(long idUsuario) {
		ResponseBase<List<ResultadoSimuladoResponse>> baseResponse = new ResponseBase<>();
		try {
			List<ResultadoSimuladoResponse> lRespostaSimulado = buscarResultadoUltimosSimulados(idUsuario);
			if(lRespostaSimulado.isEmpty()) {
				baseResponse = new ResponseBase<>(false, "Resultado dos simulados não encontrado", null);
			} else {
				if(loadUsuarioById(idUsuario) == null){
					baseResponse = new ResponseBase<>(false, "Usuário não encontrado", null);
				} else {
					baseResponse = new ResponseBase<>(true, "Resultados dos simulado obtido com sucesso", lRespostaSimulado);
				}
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível buscar o resultado dos simulados", null);
		}
		return new ResponseEntity<ResponseBase<List<ResultadoSimuladoResponse>>>(baseResponse, HttpStatus.OK);
	}
	
	
	private List<ResultadoSimuladoResponse> buscarResultadoUltimosSimulados(long idUsuario) {
		List<RespostaSimulado> respostas = jpaRepository.buscarRespostaSimulados(idUsuario);
		List<ResultadoSimuladoResponse> listResponse = new ArrayList<>();
		for(RespostaSimulado resposta : respostas) {
			ResultadoSimuladoResponse response = buscarResultadoSimulado(resposta.getIdSimulado().getId(), resposta.getIdUsuario().getId());
			listResponse.add(response);
		}
		return listResponse;
	}
	
	
	public ResultadoSimuladoResponse convertSimuladoToSimuladoProfessorResponse(SimuladoBaseResponse simulado, Long idUser) {
		List<ResultadoDisciplinaQuantitativo> disciplinas = getDisciplinasResultado(idUser, simulado.getId());
		ResultadoSimuladoResponse resultado = new ResultadoSimuladoResponse();
		resultado.setIdSimulado(simulado.getId());
		resultado.setNome(simulado.getNome());
		resultado.setDescricao(simulado.getDescricao());
		resultado.setDataCriacao(simulado.getDataCriacao());
//		resultado.setDataEnvio(simulado.getDataEntrega());
		resultado.setTipoSimulado(simulado.getTipoSimulado());
		resultado.setResultadoGeral(createResultadoSimuladoProfessor(simulado.getId(), idUser));
		resultado.setResultadoMatematica(createResultadoPorAreaProfessor(simulado.getId(), idUser, EArea.MATEMATICA));
		resultado.setResultadoFundamentoComputacao(createResultadoPorAreaProfessor(simulado.getId(), idUser, EArea.FUNDAMENTOS_DE_COMPUTACAO));
		resultado.setResultadoTecnologiaComputacao(createResultadoPorAreaProfessor(simulado.getId(), idUser, EArea.TECNOLOGIA_DA_COMPUTACAO));
		resultado.setDisciplinas(disciplinas);
		return resultado;
	}
	


	public ResultadoSimuladoResponse convertSimuladoToSimuladoResponse(SimuladoBaseResponse simulado, Long idUser) {
		List<ResultadoDisciplinaQuantitativo> disciplinas = getDisciplinasResultado(idUser, simulado.getId());
		ResultadoSimuladoResponse resultado = new ResultadoSimuladoResponse();
		resultado.setIdSimulado(simulado.getId());
		resultado.setNome(simulado.getNome());
		resultado.setDescricao(simulado.getDescricao());
		resultado.setDataCriacao(simulado.getDataCriacao());
//		resultado.setDataEnvio(simulado.getDataEntrega());
		resultado.setTipoSimulado(simulado.getTipoSimulado());
		resultado.setResultadoGeral(createResultadoSimulado(simulado.getId(), idUser));
		resultado.setResultadoMatematica(createResultadoPorArea(simulado.getId(), idUser, EArea.MATEMATICA));
		resultado.setResultadoFundamentoComputacao(createResultadoPorArea(simulado.getId(), idUser, EArea.FUNDAMENTOS_DE_COMPUTACAO));
		resultado.setResultadoTecnologiaComputacao(createResultadoPorArea(simulado.getId(), idUser, EArea.TECNOLOGIA_DA_COMPUTACAO));
		resultado.setDisciplinas(disciplinas);
		return resultado;
	}
	
//	USUARIO ALUNO
	private ResultadoSimuladoResponse convertSimuladoToSimuladoResponse(RespostaSimulado respostaSimulado) {
		List<ResultadoDisciplinaQuantitativo> disciplinas = getDisciplinasResultado(respostaSimulado.getIdUsuario().getId(), respostaSimulado.getIdSimulado().getId());
		ResultadoSimuladoResponse resultado = new ResultadoSimuladoResponse();
		resultado.setIdSimulado(respostaSimulado.getIdSimulado().getId());
		resultado.setNome(respostaSimulado.getIdSimulado().getNome());
		resultado.setDescricao(respostaSimulado.getIdSimulado().getDescricao());
		resultado.setDataCriacao(respostaSimulado.getIdSimulado().getDataCriacao());
		resultado.setDataEnvio(respostaSimulado.getDataEntrega());
		resultado.setTipoSimulado(respostaSimulado.getIdSimulado().getTipoSimulado().codigo);
		resultado.setResultadoGeral(createResultadoSimulado(respostaSimulado.getIdSimulado().getId(), respostaSimulado.getIdUsuario().getId()));
		resultado.setResultadoMatematica(createResultadoPorArea(respostaSimulado.getIdSimulado().getId(), respostaSimulado.getIdUsuario().getId(), EArea.MATEMATICA));
		resultado.setResultadoFundamentoComputacao(createResultadoPorArea(respostaSimulado.getIdSimulado().getId(), respostaSimulado.getIdUsuario().getId(), EArea.FUNDAMENTOS_DE_COMPUTACAO));
		resultado.setResultadoTecnologiaComputacao(createResultadoPorArea(respostaSimulado.getIdSimulado().getId(), respostaSimulado.getIdUsuario().getId(), EArea.TECNOLOGIA_DA_COMPUTACAO));
		resultado.setDisciplinas(disciplinas);
		return resultado;
	}
	
	public List<ResultadoSimuladoResponse> buscarResultadoSimulado(long idSimulado) {
		List<RespostaSimulado> respostasSimulado = jpaRepository.consultarRespostaSimulado(idSimulado);
		if(respostasSimulado == null) {
			return null;
		}
		
		List<ResultadoSimuladoResponse> response = new ArrayList<ResultadoSimuladoResponse>();
		for(RespostaSimulado respostaSimulado :  respostasSimulado) {
			response.add(convertSimuladoToSimuladoResponse(respostaSimulado));
		}
		return response;
	}
	
//	Para Alunos
	public List<ResultadoSimuladoSalaResponse> buscarResultadosSimulado(long idSimulado) {
		List<ResultadoSimuladoSalaResponse> respostas = new ArrayList<ResultadoSimuladoSalaResponse>();
		List<RespostaSimulado> respostasSimulado = jpaRepository.consultarRespostaSimulado(idSimulado);
		
		for(RespostaSimulado respostaSimulado: respostasSimulado) {
			ResultadoSimuladoSalaResponse resultado = new ResultadoSimuladoSalaResponse();
			resultado.setIdUsuario(respostaSimulado.getIdUsuario().getId());
			resultado.setIdSimulado(respostaSimulado.getIdSimulado().getId());
			resultado.setNome(respostaSimulado.getIdUsuario().getNome());
			resultado.setDataEnvio(respostaSimulado.getDataEntrega());
			resultado.setTipoSimulado(respostaSimulado.getIdSimulado().getTipoSimulado().codigo);
			resultado.setResultadoGeral(createResultadoSimulado(idSimulado, respostaSimulado.getIdUsuario().getId()));
			resultado.setResultadoMatematica(createResultadoPorArea(idSimulado, respostaSimulado.getIdUsuario().getId(), EArea.MATEMATICA));
			resultado.setResultadoFundamentoComputacao(createResultadoPorArea(idSimulado, respostaSimulado.getIdUsuario().getId(), EArea.FUNDAMENTOS_DE_COMPUTACAO));
			resultado.setResultadoTecnologiaComputacao(createResultadoPorArea(idSimulado, respostaSimulado.getIdUsuario().getId(), EArea.TECNOLOGIA_DA_COMPUTACAO));
			List<ResultadoDisciplinaQuantitativo> disciplinas = getDisciplinasResultadoPorUsuario(respostaSimulado.getIdUsuario().getId(),  idSimulado);
			resultado.setDisciplinas(disciplinas);
			
			respostas.add(resultado);
		}
		return respostas;
	}
	
	private ResultadoSimuladoSalaCompletoResponse buscarResultadoSimulado(ResultadoSimuladoSalaRequest request) {
		RespostaSimulado respostaSimulado = jpaRepository.consultarRespostaSimulado(request.getIdSimulado(), request.getIdAluno());
		ResultadoSimuladoSalaCompletoResponse resultado = new ResultadoSimuladoSalaCompletoResponse();
		resultado.setIdUsuario(respostaSimulado.getIdUsuario().getId());
		resultado.setIdSimulado(respostaSimulado.getIdSimulado().getId());
		resultado.setNome(respostaSimulado.getIdUsuario().getNome());
		resultado.setDataEnvio(respostaSimulado.getDataEntrega());
		resultado.setTipoSimulado(respostaSimulado.getIdSimulado().getTipoSimulado().codigo);
		resultado.setResultadoGeral(createResultadoSimulado(request.getIdSimulado(), request.getIdAluno()));
		resultado.setResultadoMatematica(createResultadoPorArea(request.getIdSimulado(), request.getIdAluno(), EArea.MATEMATICA));
		resultado.setResultadoFundamentoComputacao(createResultadoPorArea(request.getIdSimulado(), request.getIdAluno(), EArea.FUNDAMENTOS_DE_COMPUTACAO));
		resultado.setResultadoTecnologiaComputacao(createResultadoPorArea(request.getIdSimulado(), request.getIdAluno(), EArea.TECNOLOGIA_DA_COMPUTACAO));
		List<ResultadoDisciplinaQuantitativo> disciplinas = getDisciplinasResultadoPorUsuario(request.getIdAluno(),  request.getIdSimulado());
		resultado.setDisciplinas(disciplinas);
		return resultado;
	}
	
	public ResultadoSimuladoResponse buscarResultadoSimulado(long idSimulado, long idUsuario) {
		RespostaSimulado respostaSimulado = jpaRepository.consultarRespostaSimulado(idSimulado, idUsuario);
		List<ResultadoDisciplinaQuantitativo> disciplinas = getDisciplinasResultadoPorUsuario(idUsuario, idSimulado);
		if(respostaSimulado == null) {
			return null;
		}
		ResultadoSimuladoResponse resultado = new ResultadoSimuladoResponse();
		resultado.setIdSimulado(respostaSimulado.getIdSimulado().getId());
		resultado.setNome(respostaSimulado.getIdSimulado().getNome());
		resultado.setDescricao(respostaSimulado.getIdSimulado().getDescricao());
		resultado.setDataCriacao(respostaSimulado.getIdSimulado().getDataCriacao());
		resultado.setDataEnvio(respostaSimulado.getDataEntrega());
		resultado.setTipoSimulado(respostaSimulado.getIdSimulado().getTipoSimulado().codigo);
		resultado.setResultadoGeral(createResultadoSimulado(idSimulado, idUsuario));
		resultado.setResultadoMatematica(createResultadoPorArea(idSimulado, idUsuario, EArea.MATEMATICA));
		resultado.setResultadoFundamentoComputacao(createResultadoPorArea(idSimulado, idUsuario, EArea.FUNDAMENTOS_DE_COMPUTACAO));
		resultado.setResultadoTecnologiaComputacao(createResultadoPorArea(idSimulado, idUsuario, EArea.TECNOLOGIA_DA_COMPUTACAO));
		resultado.setDisciplinas(disciplinas);
		
		return resultado;
	}
	
	public ResultadoQuantitativo createResultadoSimuladoProfessor(long idSimulado, long idUsuario) {
		int erros = jpaRepository.consultarErrosSimuladoProfessor(idUsuario, idSimulado);
		int acertos = jpaRepository.consultarAcertosSimuladoProfessor(idUsuario, idSimulado);
		int naoRespondidas = jpaRepository.consultarQuantidadeNaoRespondiasSimuladoProfessor(idUsuario, idSimulado);
		int total = jpaRepository.consultarTotalQuestaoesProfessor(idSimulado);
		
		ResultadoQuantitativo resultado = new ResultadoQuantitativo();
		resultado.setAcertos(acertos);
		resultado.setErros(erros);
		resultado.setNaoRespondidas(naoRespondidas);
		resultado.setTotal(total);
		return resultado;
	}
	
	public ResultadoQuantitativo createResultadoSimulado(long idSimulado, long idUsuario) {
		int erros = jpaRepository.consultarErrosSimulado(idUsuario,idSimulado);
		int acertos = jpaRepository.consultarAcertosSimulado(idUsuario, idSimulado);
		int naoRespondidas = jpaRepository.consultarQuantidadeNaoRespondiasSimulado(idUsuario, idSimulado);
		int total = jpaRepository.consultarTotalQuestaoes(idSimulado);
		
		ResultadoQuantitativo resultado = new ResultadoQuantitativo();
		resultado.setAcertos(acertos);
		resultado.setErros(erros);
		resultado.setNaoRespondidas(naoRespondidas);
		resultado.setTotal(total);
		return resultado;
	}
	
	public ResultadoQuantitativo createResultadoPorArea(long idSimulado, long idUsuario, EArea area) {
		int erros = jpaRepository.consultarErrosSimuladoPorArea(idUsuario, idSimulado, area.codigo);
		int acertos = jpaRepository.consultarAcertosSimuladoPorArea(idUsuario, idSimulado, area.codigo);
		int naoRespondidas = jpaRepository.consultarQuantidadeNaoRespondiasSimuladoPorArea(idUsuario, idSimulado, area.codigo);
		int total = jpaRepository.consultarTotalQuestaoesPorArea(idSimulado, area.codigo);
		
		ResultadoQuantitativo resultado = new ResultadoQuantitativo();
		resultado.setAcertos(acertos);
		resultado.setErros(erros);
		resultado.setNaoRespondidas(naoRespondidas);
		resultado.setTotal(total);
		return resultado;
	}
	
	public ResultadoQuantitativo createResultadoPorAreaProfessor(long idSimulado, long idUsuario, EArea area) {
		int erros = jpaRepository.consultarErrosSimuladoPorAreaProfessor(idUsuario, idSimulado, area.codigo);
		int acertos = jpaRepository.consultarAcertosSimuladoPorAreaProfessor(idUsuario, idSimulado, area.codigo);
		int naoRespondidas = jpaRepository.consultarQuantidadeNaoRespondiasSimuladoPorAreaProfessor(idUsuario, idSimulado, area.codigo);
		int total = jpaRepository.consultarTotalQuestaoesPorAreaProfessor(idSimulado, area.codigo);
		
		ResultadoQuantitativo resultado = new ResultadoQuantitativo();
		resultado.setAcertos(acertos);
		resultado.setErros(erros);
		resultado.setNaoRespondidas(naoRespondidas);
		resultado.setTotal(total);
		return resultado;
	}
	
// 	TODOS
	
	private ResultadoGeralUsuarioResponse buscarResultadoTodosSimulado(long idUsuario) {
		Usuario usuario = loadUsuarioById(idUsuario);
		ResultadoGeralUsuarioResponse resultado = new ResultadoGeralUsuarioResponse();
		resultado.setNome(usuario.getNome());
		resultado.setIdUsuario(usuario.getId());
		resultado.setResultadoGeral(createResultadoTodosGeral(idUsuario));
		resultado.setSimuladosRespondidos(jpaRepository.consultarQtdSimuladosRespondidos(idUsuario));
		resultado.setResultadoMatematica(createResultadoTodosPorArea(idUsuario, EArea.MATEMATICA));
		resultado.setResultadoFundamentoComputacao(createResultadoTodosPorArea(idUsuario, EArea.FUNDAMENTOS_DE_COMPUTACAO));
		resultado.setResultadoTecnologiaComputacao(createResultadoTodosPorArea(idUsuario, EArea.TECNOLOGIA_DA_COMPUTACAO));
		return resultado;
	}
	
	private ResultadoGeralSalaResponse buscarResultadoTodosSimulado(long idUsuario, long idSala) {
		Usuario usuario = loadUsuarioById(idUsuario);
		ResultadoGeralSalaResponse resultado = new ResultadoGeralSalaResponse();
		resultado.setNome(usuario.getNome());
		resultado.setIdUsuario(usuario.getId());
		resultado.setResultadoGeral(createResultadoTodosGeralSala(idUsuario, idSala));
		resultado.setQuantidadeSimulados(simuladoRepository.buscarSimuladosPorIdSala(idSala).size());
		resultado.setSimuladosRespondidos(jpaRepository.consultarQtdSimuladosRespondidosSala(idSala));
		resultado.setResultadoMatematica(createResultadoTodosPorAreaPorSala(idUsuario, idSala, EArea.MATEMATICA));
		resultado.setResultadoFundamentoComputacao(createResultadoTodosPorAreaPorSala(idUsuario, idSala, EArea.FUNDAMENTOS_DE_COMPUTACAO));
		resultado.setResultadoTecnologiaComputacao(createResultadoTodosPorAreaPorSala(idUsuario, idSala, EArea.TECNOLOGIA_DA_COMPUTACAO));
		List<ResultadoDisciplinaQuantitativo> disciplinas = getDisciplinasResultadoPorSala(idUsuario,  idSala);
		resultado.setDisciplinas(disciplinas);
		return resultado;
	}
	
	public ResultadoQuantitativo createResultadoTodosGeralSala(long idUsuario, long idSala) {
		int erros = jpaRepository.consultarErrosSimuladoTotalSala(idSala);
		int acertos = jpaRepository.consultarAcertosSimuladoTotalSala(idSala);
		int naoRespondidas = jpaRepository.consultarQuantidadeNaoRespondiasSimuladoTotalSala(idSala);
		int total = jpaRepository.consultarTotalQuestaoesRespondidasSala(idSala);
		
		ResultadoQuantitativo resultado = new ResultadoQuantitativo();
		resultado.setAcertos(acertos);
		resultado.setErros(erros);
		resultado.setNaoRespondidas(naoRespondidas);
		resultado.setTotal(total);
		return resultado;
	}
	

	public ResultadoQuantitativo createResultadoTodosGeral(long idUsuario) {
		int erros = jpaRepository.consultarErrosSimuladoTotal(idUsuario);
		int acertos = jpaRepository.consultarAcertosSimuladoTotal(idUsuario);
		int naoRespondidas = jpaRepository.consultarQuantidadeNaoRespondiasSimuladoTotal(idUsuario);
		int total = jpaRepository.consultarTotalQuestaoesRespondidas(idUsuario);
		
		ResultadoQuantitativo resultado = new ResultadoQuantitativo();
		resultado.setAcertos(acertos);
		resultado.setErros(erros);
		resultado.setNaoRespondidas(naoRespondidas);
		resultado.setTotal(total);
		return resultado;
	}
	
	public ResultadoQuantitativo createResultadoTodosPorArea(long idUsuario, EArea area) {
		int erros = jpaRepository.consultarErrosSimuladoPorAreaTotal(idUsuario, area.codigo);
		int acertos = jpaRepository.consultarAcertosSimuladoPorAreaTotal(idUsuario, area.codigo);
		int naoRespondidas = jpaRepository.consultarQuantidadeNaoRespondiasSimuladoPorAreaTotal(idUsuario, area.codigo);
		int total = jpaRepository.consultarTotalQuestaoesPorAreaTotal(idUsuario, area.codigo);
		
		ResultadoQuantitativo resultado = new ResultadoQuantitativo();
		resultado.setAcertos(acertos);
		resultado.setErros(erros);
		resultado.setNaoRespondidas(naoRespondidas);
		resultado.setTotal(total);
		return resultado;
	}
	
	public ResultadoQuantitativo createResultadoTodosPorAreaPorSala(long idUsuario, long idSala, EArea area) {
		int erros = jpaRepository.consultarErroSalaPorArea(idSala, area.codigo);
		int acertos = jpaRepository.consultarAcertosSalaPorArea(idSala, area.codigo);
		int naoRespondidas = jpaRepository.consultarQuantidadeNaoRespondiasSalaPorArea(idSala, area.codigo);
		int total = jpaRepository.consultarTotalQuestaoesSalaPorArea(idSala, area.codigo);
		
		ResultadoQuantitativo resultado = new ResultadoQuantitativo();
		resultado.setAcertos(acertos);
		resultado.setErros(erros);
		resultado.setNaoRespondidas(naoRespondidas);
		resultado.setTotal(total);
		return resultado;
	}
	
//	POR PROVA
	
	private ResultadoGeralUsuarioResponse buscarResultadoGeralPorTipoProva(ResultadoSimuladoProvaRequest request) {
		Usuario usuario = loadUsuarioById(request.getIdUsuario());
		ResultadoGeralUsuarioResponse resultado = new ResultadoGeralUsuarioResponse();
		resultado.setNome(usuario.getNome());
		resultado.setIdUsuario(usuario.getId());
		resultado.setResultadoGeral(createResultadoGeralPorTipoProva(request));
		resultado.setSimuladosRespondidos(jpaRepository.consultarQtdSimuladosRespondidos(request.getIdUsuario(), request.getTipoSimulado()));
		resultado.setResultadoMatematica(createResultadoGeralPorTipoProva(request, EArea.MATEMATICA));
		resultado.setResultadoFundamentoComputacao(createResultadoGeralPorTipoProva(request, EArea.FUNDAMENTOS_DE_COMPUTACAO));
		resultado.setResultadoTecnologiaComputacao(createResultadoGeralPorTipoProva(request, EArea.TECNOLOGIA_DA_COMPUTACAO));
		return resultado;
	}
	
	public ResultadoQuantitativo createResultadoGeralPorTipoProva(ResultadoSimuladoProvaRequest request) {
		int erros = jpaRepository.consultarErrosSimuladoTotal(request.getIdUsuario(), request.getTipoSimulado());
		int acertos = jpaRepository.consultarAcertosSimuladoTotal(request.getIdUsuario(), request.getTipoSimulado());
		int naoRespondidas = jpaRepository.consultarQuantidadeNaoRespondiasSimuladoTotal(request.getIdUsuario(), request.getTipoSimulado());
		int total = jpaRepository.consultarTotalQuestaoesRespondidas(request.getIdUsuario(), request.getTipoSimulado());
		
		ResultadoQuantitativo resultado = new ResultadoQuantitativo();
		resultado.setAcertos(acertos);
		resultado.setErros(erros);
		resultado.setNaoRespondidas(naoRespondidas);
		resultado.setTotal(total);
		return resultado;
	}
	
	public ResultadoQuantitativo createResultadoGeralPorTipoProva(ResultadoSimuladoProvaRequest request, EArea area) {
		int erros = jpaRepository.consultarErrosSimuladoPorAreaTotal(request.getIdUsuario(), area.codigo, request.getTipoSimulado());
		int acertos = jpaRepository.consultarAcertosSimuladoPorAreaTotal(request.getIdUsuario(), area.codigo, request.getTipoSimulado());
		int naoRespondidas = jpaRepository.consultarQuantidadeNaoRespondiasSimuladoPorAreaTotal(request.getIdUsuario(), area.codigo, request.getTipoSimulado());
		int total = jpaRepository.consultarTotalQuestaoesPorAreaTotal(request.getIdUsuario(), area.codigo, request.getTipoSimulado());
		
		ResultadoQuantitativo resultado = new ResultadoQuantitativo();
		resultado.setAcertos(acertos);
		resultado.setErros(erros);
		resultado.setNaoRespondidas(naoRespondidas);
		resultado.setTotal(total);
		return resultado;
	}
	
	
	public ResponseEntity<ResponseBase<List<QuestaoResponse>>> buscarGabaritoUsuario(long simuladoId, long idUsuario) {
		ResponseBase<List<QuestaoResponse>> baseResponse = new ResponseBase<>();
		try {
			List<QuestaoResponse> response = buscarGabaritoRespostaUsuario(simuladoId, idUsuario);
			baseResponse = new ResponseBase<>(true, "Questões consultadas com sucesso", response);
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível consultar as questões do simulado", null);
		}
		return new ResponseEntity<ResponseBase<List<QuestaoResponse>>>(baseResponse, HttpStatus.OK);
	}
	
	
	public ResponseEntity<ResponseBase<List<QuestaoResponse>>> buscarGabaritoSimulado(long simuladoId, long idUsuario) {
		ResponseBase<List<QuestaoResponse>> baseResponse = new ResponseBase<>();
		try {
			Usuario usuario = loadUsuarioById(idUsuario);
			if(usuario instanceof Aluno) {
				baseResponse = new ResponseBase<>(false, "Para buscar o gabarito do simulado é necessário ser um professor", null);
			}else {
				List<QuestaoResponse> response = buscarGabaritoSimulado(simuladoId);
				baseResponse = new ResponseBase<>(true, "Questões consultadas com sucesso", response);
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível consultar as questões do simulado", null);
		}
		return new ResponseEntity<ResponseBase<List<QuestaoResponse>>>(baseResponse, HttpStatus.OK);
	}
	
	private List<QuestaoResponse> buscarGabaritoRespostaUsuario(long simuladoId, long idUsuario) {
		RespostaSimulado respostaSimulado = jpaRepository.consultarRespostaSimulado(simuladoId, idUsuario);
		List<QuestaoResponse> gabarito = new ArrayList<>();
		for(RespostaQuestao respostaQ : respostaSimulado.getRespostas()) { 
			QuestaoResponse questao = new QuestaoGabaritoMapper().transform(questaoRepository.findById((long) respostaQ.getIdQuestao()), respostaQ);
			gabarito.add(questao);
		}
		return gabarito;
	}
	
	private List<QuestaoResponse> buscarGabaritoSimulado(long simuladoId) {
		Simulado simulado = simuladoRepository.findById(simuladoId);
		List<QuestaoResponse> questao = new QuestaoRespostaMapper().transform(simulado.getQuestoes());
		return questao;
	}
	
	public ResponseEntity<ResponseBase<List<ResultadoDisciplinaQuantitativo>>> buscarDesempenhoDisciplinas(long idUsuario) {
		ResponseBase<List<ResultadoDisciplinaQuantitativo>> baseResponse = new ResponseBase<>();
		try {
			List<ResultadoDisciplinaQuantitativo> response = getDisciplinasResultado(idUsuario);
			baseResponse = new ResponseBase<>(true, "Resultado disciplinas buscados com sucesso", response);
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível buscar os resultados das disciplinas", null);
		}
		return new ResponseEntity<ResponseBase<List<ResultadoDisciplinaQuantitativo>>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<List<ResultadoDisciplinaQuantitativo>>> buscarDesempenhoDisciplinas(long idUsuario, long idSimulado) {
		ResponseBase<List<ResultadoDisciplinaQuantitativo>> baseResponse = new ResponseBase<>();
		try {
			List<ResultadoDisciplinaQuantitativo> response;
			if(loadUsuarioById(idUsuario) instanceof Aluno) {
				response = getDisciplinasResultadoPorUsuario(idUsuario, idSimulado);
			} else {
				response = getDisciplinasResultado(idUsuario, idSimulado);
			}
			baseResponse = new ResponseBase<>(true, "Resultado disciplinas buscados com sucesso", response);
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível buscar os resultados das disciplinas", null);
		}
		return new ResponseEntity<ResponseBase<List<ResultadoDisciplinaQuantitativo>>>(baseResponse, HttpStatus.OK);
	}
	
	private List<ResultadoDisciplinaQuantitativo> getDisciplinasResultado(long idUsuario) {
		List<Object[]> disciplinas = jpaRepository.disciplinaSimulado(idUsuario);
		List<Object[]> erros = jpaRepository.resultadoDisciplinaSimuladoErro(idUsuario);
		List<Object[]> acertos = jpaRepository.resultadoDisciplinaSimuladoAcerto(idUsuario);
		List<Object[]> naoRespondidas = jpaRepository.resultadoDisciplinaSimuladoNaoRespondida(idUsuario);
		
		HashMap<Integer, ResultadoDisciplinaQuantitativo> values = new HashMap<Integer, ResultadoDisciplinaQuantitativo>();
		for (Object[] disciplina : disciplinas) {
			ResultadoDisciplinaQuantitativo resultado = new ResultadoDisciplinaQuantitativo();
			Integer id = (Integer) disciplina[1];
			BigInteger qtd = (BigInteger) disciplina[0];
			resultado.setDisciplina(id);
			resultado.setTotal(qtd.intValue());
			resultado.setNomeDisciplina(EDisciplina.getEnum(id).descricao);
			values.put(id, resultado);
		}
		addErros(erros, values);
		addAcertos(acertos, values);
		addNaoRespondidas(naoRespondidas, values);
		return criarResultadoDisciplinas(values);
	}
	
	private List<ResultadoDisciplinaQuantitativo> gerarResultadoDisciplinas(List<Object[]> disciplinas, List<Object[]> erros, List<Object[]> acertos, List<Object[]> naoRespondidas) {
		HashMap<Integer, ResultadoDisciplinaQuantitativo> values = new HashMap<Integer, ResultadoDisciplinaQuantitativo>();
		for (Object[] disciplina : disciplinas) {
			ResultadoDisciplinaQuantitativo resultado = new ResultadoDisciplinaQuantitativo();
			Integer id = (Integer) disciplina[1];
			BigInteger qtd = (BigInteger) disciplina[0];
			resultado.setDisciplina(id);
			resultado.setTotal(qtd.intValue());
			resultado.setNomeDisciplina(EDisciplina.getEnum(id).descricao);
			values.put(id, resultado);
		}
		addErros(erros, values);
		addAcertos(acertos, values);
		addNaoRespondidas(naoRespondidas, values);
		return criarResultadoDisciplinas(values);
	}
	
	private List<ResultadoDisciplinaQuantitativo> getDisciplinasResultadoPorSala(long idUsuario, long idSala) {
		List<Object[]> disciplinas = jpaRepository.disciplinaSala(idSala);
		List<Object[]> erros = jpaRepository.resultadoDisciplinaSalaErro(idSala);
		List<Object[]> acertos = jpaRepository.resultadoDisciplinaSalaAcerto(idSala);
		List<Object[]> naoRespondidas = jpaRepository.resultadoDisciplinaSalaNaoRespondida(idSala);
		return gerarResultadoDisciplinas(disciplinas, erros, acertos, naoRespondidas);
	}
	
	private List<ResultadoDisciplinaQuantitativo> getDisciplinasResultadoPorUsuario(long idUsuario, long idSimulado) {
		List<Object[]> disciplinas = jpaRepository.disciplinaSimuladoPorUsuario(idUsuario, idSimulado);
		List<Object[]> erros = jpaRepository.resultadoDisciplinaSimuladoErroPorUsuario(idUsuario,  idSimulado);
		List<Object[]> acertos = jpaRepository.resultadoDisciplinaSimuladoAcertoPorUsuario(idUsuario,  idSimulado);
		List<Object[]> naoRespondidas = jpaRepository.resultadoDisciplinaSimuladoNaoRespondidaPorUsuario(idUsuario,  idSimulado);
		return gerarResultadoDisciplinas(disciplinas, erros, acertos, naoRespondidas);
	}
	
	private List<ResultadoDisciplinaQuantitativo> getDisciplinasResultado(long idUsuario, long idSimulado) {
		List<Object[]> disciplinas = jpaRepository.disciplinaSimulado(idUsuario, idSimulado);
		List<Object[]> erros = jpaRepository.resultadoDisciplinaSimuladoErro(idUsuario,  idSimulado);
		List<Object[]> acertos = jpaRepository.resultadoDisciplinaSimuladoAcerto(idUsuario,  idSimulado);
		List<Object[]> naoRespondidas = jpaRepository.resultadoDisciplinaSimuladoNaoRespondida(idUsuario,  idSimulado);
		return gerarResultadoDisciplinas(disciplinas, erros, acertos, naoRespondidas);
	}
	
	private void addErros(List<Object[]> erros, HashMap<Integer, ResultadoDisciplinaQuantitativo> values) {
		for(Object[] disciplina : erros) {
			Integer id = (Integer) disciplina[1];
			BigInteger qtd = (BigInteger) disciplina[0];
			values.get(id).addErros(qtd.intValue());
		}
	}
	
	private void addAcertos(List<Object[]> erros, HashMap<Integer, ResultadoDisciplinaQuantitativo> values) {
		for(Object[] disciplina : erros) {
			Integer id = (Integer) disciplina[1];
			BigInteger qtd = (BigInteger) disciplina[0];
			values.get(id).addAcertos(qtd.intValue());
		}
	}
	
	private void addNaoRespondidas(List<Object[]> erros, HashMap<Integer, ResultadoDisciplinaQuantitativo> values) {
		for(Object[] disciplina : erros) {
			Integer id = (Integer) disciplina[1];
			BigInteger qtd = (BigInteger) disciplina[0];
			values.get(id).addNaoRespondidas(qtd.intValue());
		}
	}
	
	private List<ResultadoDisciplinaQuantitativo> criarResultadoDisciplinas(HashMap<Integer, ResultadoDisciplinaQuantitativo> values) {
		List<ResultadoDisciplinaQuantitativo> disciplina = new ArrayList<ResultadoDisciplinaQuantitativo>();
		for(Map.Entry<Integer, ResultadoDisciplinaQuantitativo> entry : values.entrySet()) {
		    ResultadoDisciplinaQuantitativo value = entry.getValue();
		    disciplina.add(value);
		}
		return disciplina;
	}
}
