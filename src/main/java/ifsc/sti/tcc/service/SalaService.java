package ifsc.sti.tcc.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import ifsc.sti.tcc.modelos.intituicao.Instituicao;
import ifsc.sti.tcc.modelos.simulado.Sala;
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
import ifsc.sti.tcc.resources.rest.models.sala.ParticiparSalaRequest;
import ifsc.sti.tcc.resources.rest.models.sala.SalaRequest;
import ifsc.sti.tcc.resources.rest.models.sala.SalaResponse;

public class SalaService {

	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(SalaService.class);

	private SalaRepository jpaRepository;
	private SimuladoRepository simuladoRepository;
	private QuestaoRepository questaoRepository;
	private UsuarioRepository usuarioRepository;
	private RespostaSimuladoRepository respostaSimuladoRepository;
	private ResultadoService resultadoService;
	private InstituicaoRepository instituicaoRepository;

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
	
	

//	public ResponseEntity<ResponseBase<SalaResponse>> participarSala(ParticiparSalaRequest request) {
//		ResponseBase<SalaResponse> baseResponse = new ResponseBase<>();
//		try {
//			if(request.getNome().isEmpty()) {
//				baseResponse = new ResponseBase<>(false, "Informe o nome da sala", null);
//			} else {
//				Usuario usuario = loadUsuario(request.getIdProfessor());
//				Instituicao instituicao = loadInstituicao(usuario.getInstituicao());
//				if(usuario != null && usuario instanceof Professor) {
//					Sala sala =  new SalaMapper().transform(request);
//					sala.setUsuario(usuario);
//					sala.setInstituicao(instituicao);
//					Sala salaResponse = jpaRepository.save(sala);
//					baseResponse = new ResponseBase<>(true, "Sala registrada com sucesso", new SalaResponseMapper().transform(salaResponse));
//				} else {
//					baseResponse = new ResponseBase<>(false, "Para criar uma sala de simulado é necessário ser um professor", null);
//				}
//			}
//
//		} catch (Exception e) {
//			baseResponse = new ResponseBase<>(false, "Não foi possível criar a sala para simulados", null);
//		}
//		return new ResponseEntity<ResponseBase<SalaResponse>>(baseResponse, HttpStatus.OK);
//	}
}
