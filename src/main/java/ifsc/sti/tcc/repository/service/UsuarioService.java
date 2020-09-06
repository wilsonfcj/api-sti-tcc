package ifsc.sti.tcc.repository.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import ifsc.sti.tcc.modelos.intituicao.Instituicao;
import ifsc.sti.tcc.modelos.usuario.Aluno;
import ifsc.sti.tcc.modelos.usuario.Imagem;
import ifsc.sti.tcc.modelos.usuario.Professor;
import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.props.EPerfilUsuario;
import ifsc.sti.tcc.repository.DisciplinaRepository;
import ifsc.sti.tcc.repository.ImagemRepository;
import ifsc.sti.tcc.repository.InstituicaoRepository;
import ifsc.sti.tcc.repository.UsuarioRepository;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.mappers.AlterarMapper;
import ifsc.sti.tcc.resources.rest.models.mappers.AlunoMapper;
import ifsc.sti.tcc.resources.rest.models.mappers.CadastroMapper;
import ifsc.sti.tcc.resources.rest.models.mappers.ProfessorMapper;
import ifsc.sti.tcc.resources.rest.models.usuario.cadastro.UsuarioRequest;
import ifsc.sti.tcc.resources.rest.models.usuario.login.request.LoginRequest;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.AlunoResponse;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.ProfessorResponse;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.UsuarioBaseResponse;
import ifsc.sti.tcc.utilidades.ValidatedField;

public class UsuarioService {

	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(UsuarioService.class);

	private ImagemService imagemService;
	private DisciplinaService disciplinaService;
	private UsuarioRepository jpaRepository;
	private InstituicaoService instituicaoService;

	public static class Instance extends BaseService<UsuarioRepository> implements BaseService.BaseObject<UsuarioService> {

		public Instance(UsuarioRepository jpaRepository) {
			super(jpaRepository);
		}

		private ImagemRepository imagemRepository;
		private DisciplinaRepository disciplinaRepository;
		private InstituicaoRepository instituicaoRepository;
		
		public Instance withImagemRepository(ImagemRepository repository) {
			this.imagemRepository = repository;
			return this;
		}

		public Instance withDisciplinaRepository(DisciplinaRepository repository) {
			this.disciplinaRepository = repository;
			return this;
		}
		
		public Instance withInstituicaoRepository(InstituicaoRepository repository) {
			this.instituicaoRepository = repository;
			return this;
		}

		@Override
		public UsuarioService build() {
			UsuarioService service = new UsuarioService();
			service.setDisciplinaService(new DisciplinaService.Instance(disciplinaRepository).build());
			service.setImagemService(new ImagemService.Instance(imagemRepository).build());
			service.setInstituicaoService(new InstituicaoService.Instance(instituicaoRepository).build());
			service.setJpaRepository(jpaRepository);
			return service;
		}
	}

	private Usuario salvarUsuario(UsuarioRequest usuarioRequest) {
		Usuario usuarioCadastro = new CadastroMapper().transform(usuarioRequest);
		Usuario usuario = jpaRepository.save(usuarioCadastro);
		return usuario;
	}

	private Usuario alterarUsuario(Usuario usuario, UsuarioRequest usuarioRequest) {
		usuario.setNome(usuarioRequest.getNome());
		return jpaRepository.save(new AlterarMapper().transform(usuario, usuarioRequest));
	}

	private UsuarioBaseResponse converterUsuario(Usuario usuario) {
		Imagem imagem = imagemService.buscarImagem(usuario.getId());
		
		UsuarioBaseResponse usuarioBaseResponse = null;
		if (usuario instanceof Aluno) {
			AlunoMapper mappper = new AlunoMapper();
			AlunoResponse alunoResponse = mappper.transform((Aluno) usuario);
			usuarioBaseResponse = alunoResponse;
		} else {
			ProfessorMapper mappper = new ProfessorMapper();
			ProfessorResponse professorResponse = mappper.transform((Professor) usuario);
			professorResponse.setDisciplinas(disciplinaService.consultarDisplinas(usuario.getId()));
			usuarioBaseResponse = professorResponse;
		}
		
		if(usuario.getInstituicao() != null) {
			Instituicao instituicao = instituicaoService.getInstituicaoById(usuario.getInstituicao());
			usuarioBaseResponse.setInstituicao(instituicao.getNome());
		}

		if (imagem != null) {
			usuarioBaseResponse.setImagemPerfil(imagem.getPerfil());
		}
		return usuarioBaseResponse;
	}

	public ResponseEntity<ResponseBase<List<UsuarioBaseResponse>>> buscar() {
		ResponseBase<List<UsuarioBaseResponse>> baseResponse = new ResponseBase<>();
		List<Usuario> usuarios = jpaRepository.findAll();
		List<UsuarioBaseResponse> usuarioBaseResponses = new ArrayList<UsuarioBaseResponse>();
		for (Usuario usuario : usuarios) {
			usuarioBaseResponses.add(converterUsuario(usuario));
		}
		baseResponse = new ResponseBase<>(usuarioBaseResponses.size() > 0,
				usuarioBaseResponses.size() > 0 ? "Informações carredas com sucesso" : "Nenhum usuário cadastrado",
				usuarioBaseResponses);

		return new ResponseEntity<ResponseBase<List<UsuarioBaseResponse>>>(baseResponse, HttpStatus.OK);
	}

	public ResponseEntity<ResponseBase<UsuarioBaseResponse>> buscar(long id) {
		Usuario usuario = jpaRepository.findById(id);
		ResponseBase<UsuarioBaseResponse> baseResponse = new ResponseBase<>();
		if (usuario != null) {
			baseResponse = new ResponseBase<>(true, "Informações carredas com sucesso", converterUsuario(usuario));
		} else {
			baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Usuario não encontrado", null);
		}
		return new ResponseEntity<ResponseBase<UsuarioBaseResponse>>(baseResponse, HttpStatus.OK);
	}

	public ResponseEntity<ResponseBase<UsuarioBaseResponse>> buscar(String cpf) {
		Usuario usuario = jpaRepository.findByCpf(cpf);
		ResponseBase<UsuarioBaseResponse> baseResponse = new ResponseBase<>();
		if (usuario != null) {
			baseResponse = new ResponseBase<>(true, "Informações carredas com sucesso", converterUsuario(usuario));
		} else {
			baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Usuario não encontrado", null);
		}
		return new ResponseEntity<ResponseBase<UsuarioBaseResponse>>(baseResponse, HttpStatus.OK);
	}

	public ResponseEntity<ResponseBase<UsuarioBaseResponse>> autenticar(LoginRequest loginRequest) {
		ResponseBase<UsuarioBaseResponse> baseResponse = new ResponseBase<>();
		Usuario usuario = jpaRepository.findByCpf(loginRequest.getCpf());
		if (usuario != null) {
			if (Usuario.autenticarUsuario(usuario, loginRequest.getSenha())) {
				baseResponse = new ResponseBase<>(true, "Informações carredas com sucesso", converterUsuario(usuario));
			} else {
				baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Usuário ou Senha inválida", null);
			}
		} else {
			baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Não foi possível carregar as informações",
					null);
		}
		return new ResponseEntity<ResponseBase<UsuarioBaseResponse>>(baseResponse, HttpStatus.OK);
	}

	public ResponseEntity<ResponseBase<UsuarioBaseResponse>> cadastrar(UsuarioRequest usuarioRequest) {
		ResponseBase<UsuarioBaseResponse> baseResponse = new ResponseBase<>();
		ValidatedField validatedField = usuarioRequest.validarCampos();
		if (validatedField.getSuccess()) {
			if(instituicaoService.getInstituicaoById(usuarioRequest.getInstituicao()) != null) {
				if (jpaRepository.findByCpf(usuarioRequest.getCpf()) == null) {
					Usuario usuario = salvarUsuario(usuarioRequest);
	
					if (usuarioRequest.getImagemPerfil() != null) {
						imagemService.saveImage(usuario.getId(), usuarioRequest.getImagemPerfil());
					}
	
					if (usuarioRequest.getPerfilUsuario() == EPerfilUsuario.PROFESSOR.codigo) {
						disciplinaService.salvarDisciplinas(usuario,
								usuarioRequest.getDisciplinas());
					}
					
					if (usuario != null) {
						baseResponse = new ResponseBase<UsuarioBaseResponse>(true, "Usuario cadastrado com sucesso",
								converterUsuario(usuario));
					} else {
						baseResponse = new ResponseBase<UsuarioBaseResponse>(false,
								"Não foi possível cadastrar o usuário, tente novamente mais tarde",
								converterUsuario(usuario));
					}
	
				} else {
					baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Usuario já cadastrado", null);
				}
			} else {
				baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Instituição não encontrada", null);
			}
		} else {
			baseResponse = new ResponseBase<UsuarioBaseResponse>(false, validatedField.getMsm(), null);
		}
		return new ResponseEntity<ResponseBase<UsuarioBaseResponse>>(baseResponse, HttpStatus.OK);
	}

	public ResponseEntity<ResponseBase<UsuarioBaseResponse>> alterar(UsuarioRequest usuarioRequest) {
		ResponseBase<UsuarioBaseResponse> baseResponse = new ResponseBase<>();
		ValidatedField validatedField = usuarioRequest.validarCampos();
		if (validatedField.getSuccess()) {
			if(instituicaoService.getInstituicaoById(usuarioRequest.getInstituicao()) != null) {
				Usuario usuario = jpaRepository.findByCpf(usuarioRequest.getCpf());
				if (usuario != null) {
					Usuario usuarioAlterado = alterarUsuario(usuario, usuarioRequest);
					imagemService.alterarImagem(usuario.getId(), usuarioRequest.getImagemPerfil());
					if (usuarioRequest.getPerfilUsuario() == EPerfilUsuario.PROFESSOR.codigo) {
						disciplinaService.alterarDisciplinas(usuario,
								usuarioRequest.getDisciplinas());
					}
					if (usuarioAlterado != null) {
						baseResponse = new ResponseBase<UsuarioBaseResponse>(true, "Usuario Alterado com sucesso",
								converterUsuario(usuarioAlterado));
					} else {
						baseResponse = new ResponseBase<UsuarioBaseResponse>(false,
								"Não foi possível alterar o usuário, tente novamente mais tarde",
								converterUsuario(usuario));
					}
				} else {
					baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Usuario não encontrado", null);
				}
			} else {
				baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Instituição não encontrada", null);
			}
		} else {
			baseResponse = new ResponseBase<UsuarioBaseResponse>(false, validatedField.getMsm(), null);
		}
		return new ResponseEntity<ResponseBase<UsuarioBaseResponse>>(baseResponse, HttpStatus.OK);
	}

	public ImagemService getImagemService() {
		return imagemService;
	}

	public void setImagemService(ImagemService imagemService) {
		this.imagemService = imagemService;
	}
	
	public void setInstituicaoService(InstituicaoService instituicaoService) {
		this.instituicaoService = instituicaoService;
	}

	public DisciplinaService getDisciplinaService() {
		return disciplinaService;
	}

	public void setDisciplinaService(DisciplinaService disciplinaService) {
		this.disciplinaService = disciplinaService;
	}

	public UsuarioRepository getJpaRepository() {
		return jpaRepository;
	}

	public void setJpaRepository(UsuarioRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}
}
