package ifsc.sti.tcc.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import ifsc.sti.tcc.modelos.intituicao.Instituicao;
import ifsc.sti.tcc.modelos.respostasimulado.RespostaSimulado;
import ifsc.sti.tcc.modelos.simulado.Sala;
import ifsc.sti.tcc.modelos.simulado.Simulado;
import ifsc.sti.tcc.modelos.usuario.Professor;
import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.repository.InstituicaoRepository;
import ifsc.sti.tcc.repository.QuestaoRepository;
import ifsc.sti.tcc.repository.RespostaSimuladoRepository;
import ifsc.sti.tcc.repository.SalaRepository;
import ifsc.sti.tcc.repository.SimuladoRepository;
import ifsc.sti.tcc.repository.UsuarioRepository;
import ifsc.sti.tcc.resources.mappers.domaintoview.SalaResponseMapper;
import ifsc.sti.tcc.resources.mappers.viewtodomain.SalaMapper;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.sala.request.DeletarSalaRequest;
import ifsc.sti.tcc.resources.rest.models.sala.request.ParticiparSalaRequest;
import ifsc.sti.tcc.resources.rest.models.sala.request.SalaRequest;
import ifsc.sti.tcc.resources.rest.models.sala.response.SalaResponse;
import ifsc.sti.tcc.resources.rest.models.simulado.response.SimuladoBaseResponse;

public class SalaService {

	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(SalaService.class);

	private SalaRepository jpaRepository;
	private SimuladoRepository simuladoRepository;
	private QuestaoRepository questaoRepository;
	private UsuarioRepository usuarioRepository;
	private RespostaSimuladoRepository respostaSimuladoRepository;
	@SuppressWarnings("unused")
	private ResultadoService resultadoService;
	private InstituicaoRepository instituicaoRepository;
	private SimuladoService simuladoService;

	public static class Instance extends BaseService<SalaRepository> implements BaseService.BaseObject<SalaService> {

		public Instance(SalaRepository jpaRepository) {
			super(jpaRepository);
		}
		
		private SimuladoRepository simuladoRepository;
		private QuestaoRepository questaoRepository;
		private UsuarioRepository usuarioRepository;
		private RespostaSimuladoRepository respostaSimuladoRepository;
		private InstituicaoRepository instituicaoRepository;
		
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
		
		public Instance withSimuladoRepository(SimuladoRepository repository) {
			this.simuladoRepository = repository;
			return this;
		}
		
		public Instance withInstituicaoRepository(InstituicaoRepository repository) {
			this.instituicaoRepository = repository;
			return this;
		}
		
		@Override
		public SalaService build() {
			SalaService service = new SalaService();
			service.setJpaRepository(jpaRepository);
			service.setQuestaoRepository(questaoRepository);
			service.setUsuarioRepository(usuarioRepository);
			service.setSimuladoRepository(simuladoRepository);
			service.setRespostaSimuladoRepository(respostaSimuladoRepository);
			service.setInstituicaoRepository(instituicaoRepository);
			service.createServiceRepository();
			return service;
		}
	}
	
	public void setInstituicaoRepository(InstituicaoRepository respostaSimuladoRepository) {
		this.instituicaoRepository = respostaSimuladoRepository;
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

	public void setJpaRepository(SalaRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}
	
	public void setSimuladoRepository(SimuladoRepository jpaRepository) {
		this.simuladoRepository = jpaRepository;
	}
	
	private void createServiceRepository() {
		simuladoService = new SimuladoService
				.Instance(simuladoRepository)
				.withQuestaoRepository(questaoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSalaRepository(jpaRepository)
				.withRespostaSimuladoRepository(respostaSimuladoRepository)
				.build();
	}
	
	public Usuario loadUsuario(long idUsuario) {
		Usuario usuario = usuarioRepository.findById(idUsuario);
		return usuario;
	}
	
	public Instituicao loadInstituicao(long idUsuario) {
		Instituicao instituicao = instituicaoRepository.findById(idUsuario);
		return instituicao;
	}
	
	public List<SalaResponse> loadSalas(Usuario usuario) {
		List<Sala> salas = new ArrayList<Sala>();
		if(usuario instanceof Professor) {
			salas = jpaRepository.buscarSalasPorUsuario(usuario.getId());
		} else {
			salas = jpaRepository.buscarSalasPorInstituicao(usuario.getInstituicao());
		}
		List<SalaResponse> salasResponse = new SalaResponseMapper().transform(salas, usuario);
		return salasResponse;
	}

	public ResponseEntity<ResponseBase<SalaResponse>> criarSalaSimulado(SalaRequest request) {
		ResponseBase<SalaResponse> baseResponse = new ResponseBase<>();
		try {
			if(request.getNome().isEmpty()) {
				baseResponse = new ResponseBase<>(false, "Informe o nome da sala", null);
			} else if (request.getSenha().isEmpty()) {	
				baseResponse = new ResponseBase<>(false, "Informe a senha de sua sala", null);
			} else {
				Usuario usuario = loadUsuario(request.getIdProfessor());
				Instituicao instituicao = loadInstituicao(usuario.getInstituicao());
				if(usuario != null && usuario instanceof Professor) {
					Sala sala =  new SalaMapper().transform(request);
					sala.setUsuario(usuario);
					sala.setInstituicao(instituicao);
					Sala salaResponse = jpaRepository.save(sala);
					baseResponse = new ResponseBase<>(true, "Sala registrada com sucesso", new SalaResponseMapper().transform(salaResponse));
				} else {
					baseResponse = new ResponseBase<>(false, "Para criar uma sala de simulado é necessário ser um professor", null);
				}
			}

		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível criar a sala para simulados", null);
		}
		return new ResponseEntity<ResponseBase<SalaResponse>>(baseResponse, HttpStatus.OK);
	}
	
	
	public ResponseEntity<ResponseBase<List<SalaResponse>>> buscarMinhasSalas(long idUsuario) {
		ResponseBase<List<SalaResponse>> baseResponse = new ResponseBase<>();
		try {
			Usuario usuario = loadUsuario(idUsuario);
			if(usuario == null) {
				baseResponse = new ResponseBase<>(false, "Usuário não econtrado", null);
			} else {
				List<SalaResponse> salasResponse = loadSalas(usuario);
				baseResponse = new ResponseBase<>(true, "Salas consultas com sucesso", salasResponse);
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível buscar as salas de simulados", null);
		}
		return new ResponseEntity<ResponseBase<List<SalaResponse>>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<SalaResponse>> deletarSala(DeletarSalaRequest request) {
		ResponseBase<SalaResponse> baseResponse = new ResponseBase<>();
		try {
			Usuario usuario = usuarioRepository.findById((long)request.getIdUsuario());
			Sala sala = jpaRepository.findById((long) request.getIdSala());
			if(usuario == null) {
				baseResponse = new ResponseBase<>(false, "Usuário não econtrado", null);
			} else if(sala == null) {
				baseResponse = new ResponseBase<>(false, "Sala de simulados não econtrada", null);
			} else if(usuario.getId() != sala.getUsuario().getId()) {
				baseResponse = new ResponseBase<>(false, "Essa sala de simulados não pertence ao seu usuário", null);
			} else {
				Sala salaResponse = deleteSala(request);
				if(salaResponse == null) {
					SalaResponse salasResponse = new SalaResponseMapper().transform(sala, usuario);
					baseResponse = new ResponseBase<>(true, "Sala de simulado removida com sucesso", salasResponse);
				} else {
					baseResponse = new ResponseBase<>(false, "Não foi possível remover a sala de simulado", null);
				}
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível remover o simulado", null);
		}
		return new ResponseEntity<ResponseBase<SalaResponse>>(baseResponse, HttpStatus.OK);
	}
	
	private Sala deleteSala(DeletarSalaRequest request) {
		List<Simulado> simulados = simuladoRepository.buscarSimuladosPorIdSala((long)request.getIdSala());
		for(Simulado simulado : simulados) {
			List<RespostaSimulado> respostas = respostaSimuladoRepository.consultarRespostaSimulado(simulado.getId());
			respostaSimuladoRepository.deleteAll(respostas);
		}
		simuladoRepository.deleteAll(simulados);
		Sala sala = jpaRepository.findById((long)request.getIdSala());
		jpaRepository.delete(sala);
		Sala sala2 = jpaRepository.findById((long) request.getIdSala());
		return sala2; 
	}
	
	public ResponseEntity<ResponseBase<List<SimuladoBaseResponse>>> participarSala(ParticiparSalaRequest request) {
		ResponseBase<List<SimuladoBaseResponse>> baseResponse = new ResponseBase<>();
		try {
			if (request.getSenha() == null || request.getSenha().isEmpty()) {	
				baseResponse = new ResponseBase<>(false, "Informe a senha para participar da sala", null);
			} else {
				Sala sala = jpaRepository.findById((long) request.getIdSala());
				Usuario usuario = loadUsuario(request.getIdUsuario());
				if(usuario instanceof Professor) {
					baseResponse = new ResponseBase<>(false, "Apenas alunos podem participar da sala de simulado", null);
				} else if (sala.getAlunos().contains(usuario)) {
					return simuladoService.buscarSimuladoIdSala(usuario.getId(), sala.getId());
				} else if (sala.getInstituicao().getId() != usuario.getInstituicao()) {
					baseResponse = new ResponseBase<>(false, "Você não pertence a está instituição", null);
				} else {
					if((sala.getAlunos().size() + 1) > sala.getMaxParticipantes()) {
						baseResponse = new ResponseBase<>(false, "Não foi possível entrar na sala de simulado, pois quantidade máxima de participantes foi excedida", null);
					} else {
						if(sala.getSenha().equals(request.getSenha())) {
							sala.getAlunos().add(usuario);
							jpaRepository.save(sala);
							return simuladoService.buscarSimuladoIdSala(usuario.getId(), sala.getId());
						} else {
							baseResponse = new ResponseBase<>(false, "Senha inválida, informa a senha correta para continuar", null);
						}
					}
				}
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível criar a sala para simulados", null);
		}
		return new ResponseEntity<ResponseBase<List<SimuladoBaseResponse>>>(baseResponse, HttpStatus.OK);
	}
}
