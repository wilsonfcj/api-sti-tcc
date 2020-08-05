package ifsc.sti.tcc.resources;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ifsc.sti.tcc.modelos.disciplina.DisciplinaInteresse;
import ifsc.sti.tcc.modelos.usuario.Aluno;
import ifsc.sti.tcc.modelos.usuario.Imagem;
import ifsc.sti.tcc.modelos.usuario.Professor;
import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.props.EDisciplina;
import ifsc.sti.tcc.props.EPerfilUsuario;
import ifsc.sti.tcc.repository.DisciplinaRepository;
import ifsc.sti.tcc.repository.ImagemRepository;
import ifsc.sti.tcc.repository.UsuarioRepository;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.usuario.cadastro.UsuarioRequest;
import ifsc.sti.tcc.resources.rest.models.usuario.login.request.LoginRequest;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.AlunoResponse;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.DisciplinaResponse;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.ProfessorResponse;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.UsuarioBaseResponse;
import ifsc.sti.tcc.resources.rest.models.usuario.mappers.AlterarMapper;
import ifsc.sti.tcc.resources.rest.models.usuario.mappers.AlunoMapper;
import ifsc.sti.tcc.resources.rest.models.usuario.mappers.CadastroMapper;
import ifsc.sti.tcc.resources.rest.models.usuario.mappers.ProfessorMapper;
import ifsc.sti.tcc.utilidades.ValidatedField;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST STI Usuario")
public class UsuarioApi {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	@Autowired
	private ImagemRepository imagemRepository;
	
	private static Logger logger = LoggerFactory.getLogger(UsuarioApi.class);
	
	@ApiOperation(value = "Busca a lista de usuários cadastrados")
	@GetMapping("/BuscarUsuarios")
	public ResponseEntity<ResponseBase<List<UsuarioBaseResponse>>> getAlunosUsers() {
		ResponseBase<List<UsuarioBaseResponse>> baseResponse = new ResponseBase<>();
		List<Usuario> usuarios = usuarioRepository.findAll();
		List<UsuarioBaseResponse> usuarioBaseResponses = new ArrayList<UsuarioBaseResponse>();
		for(Usuario usuario : usuarios) {
			usuarioBaseResponses.add(converterUsuario(usuario));
		}
		baseResponse = new ResponseBase<>(usuarioBaseResponses.size() > 0,
				usuarioBaseResponses.size() > 0 ? 
						"Informações carredas com sucesso" : 
						"Nenhum usuário cadastrado",
				usuarioBaseResponses);
		
		return new ResponseEntity<ResponseBase<List<UsuarioBaseResponse>>>(baseResponse, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Busca um usuários por seu Identificador")
	@GetMapping("/BuscarUsuarioId")
	public ResponseEntity<ResponseBase<UsuarioBaseResponse>> buscarUsuarioPorId(@RequestParam Long id) {
		Usuario usuario = usuarioRepository.findById((long) id);
		ResponseBase<UsuarioBaseResponse> baseResponse = new ResponseBase<>();
		if(usuario != null) {
			baseResponse = new ResponseBase<>(true, "Informações carredas com sucesso", converterUsuario(usuario));
		} else {
			baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Usuario não encontrado", null);
		}
		return new ResponseEntity<ResponseBase<UsuarioBaseResponse>>(baseResponse, HttpStatus.OK);
	}
	

	@ApiOperation(value = "Busca um usuário por seu cpf")
	@GetMapping("/BuscarUsuarioCPF")
	public ResponseEntity<ResponseBase<UsuarioBaseResponse>> buscarUsuarioPorCPF(@RequestParam  String cpf) {
		Usuario usuario = usuarioRepository.findByCpf(cpf);
		ResponseBase<UsuarioBaseResponse> baseResponse = new ResponseBase<>();
		if(usuario != null) {
			baseResponse = new ResponseBase<>(true, "Informações carredas com sucesso", converterUsuario(usuario));
		} else {
			baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Usuario não encontrado", null);
		}
		return new ResponseEntity<ResponseBase<UsuarioBaseResponse>>(baseResponse, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Realiza a autenticação dos usuários")
	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<UsuarioBaseResponse>> loginMob(@RequestBody @Valid LoginRequest loginRequest) {
		ResponseBase<UsuarioBaseResponse> baseResponse = new ResponseBase<>();
		Usuario usuario = usuarioRepository.findByCpf(loginRequest.getCpf());
		if(usuario != null) {
			if(Usuario.autenticarUsuario(usuario, loginRequest.getSenha())) {
				baseResponse = new ResponseBase<>(true, "Informações carredas com sucesso", converterUsuario(usuario));
			} else {
				baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Usuário ou Senha inválida", null);
			}
		} else {
			baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Não foi possível carregar as informações", null);
		}
		return new ResponseEntity<ResponseBase<UsuarioBaseResponse>>(baseResponse, HttpStatus.OK);
	}
	
	
	@ApiOperation(value = "Realiza o cadastro dos usuários")
	@RequestMapping(value = "/Cadastro", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<UsuarioBaseResponse>> cadastrar(@RequestBody @Valid UsuarioRequest usuarioRequest) {
		ResponseBase<UsuarioBaseResponse> baseResponse = new ResponseBase<>();
		ValidatedField validatedField = usuarioRequest.validarCampos();
		if(validatedField.getSuccess()) {
			if(usuarioRepository.findByCpf(usuarioRequest.getCpf()) == null) { 
				Usuario usuario = salvarUsuario(usuarioRequest);
				
				if(usuarioRequest.getImagemPerfil() != null) {
					saveImage(usuario.getId(), usuarioRequest.getImagemPerfil());
				}
				
				if(usuarioRequest.getPerfilUsuario() == EPerfilUsuario.PROFESSOR.codigo) {
					salvarDisciplinas(usuario, usuarioRequest.getDisciplinas());
				}
				
				if(usuario != null) {
					baseResponse = new ResponseBase<UsuarioBaseResponse>(true, "Usuario cadastrado com sucesso", converterUsuario(usuario));
				} else {
					baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Não foi possível cadastrar o usuário, tente novamente mais tarde",
							converterUsuario(usuario));
				}
				
			} else {
				baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Usuario já cadastrado", null);
			}
		} else {
			baseResponse = new ResponseBase<UsuarioBaseResponse>(false, validatedField.getMsm(), null);
		}
		return new ResponseEntity<ResponseBase<UsuarioBaseResponse>>(baseResponse, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Altera as informações do usuários")
	@RequestMapping(value = "/Alterar", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<UsuarioBaseResponse>> alterar(@RequestBody @Valid UsuarioRequest usuarioRequest) {
		ResponseBase<UsuarioBaseResponse> baseResponse = new ResponseBase<>();
		ValidatedField validatedField = usuarioRequest.validarCampos();
		if(validatedField.getSuccess()) {
			Usuario usuario = usuarioRepository.findByCpf(usuarioRequest.getCpf());
			if(usuario != null) { 
				Usuario usuarioAlterado = alterarUsuario(usuario, usuarioRequest);
				alterarImagem(usuario.getId(), usuarioRequest.getImagemPerfil());
				if(usuarioRequest.getPerfilUsuario() == EPerfilUsuario.PROFESSOR.codigo) {
					alterarDisciplinas(usuario, usuarioRequest.getDisciplinas());
				}
				if(usuarioAlterado != null) {
					baseResponse = new ResponseBase<UsuarioBaseResponse>(true, "Usuario Alterado com sucesso", converterUsuario(usuarioAlterado));
				} else {
					baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Não foi possível alterar o usuário, tente novamente mais tarde", converterUsuario(usuario));
				}
			} else {
				baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Usuario não encontrado", null);
			}
		} else {
			baseResponse = new ResponseBase<UsuarioBaseResponse>(false, validatedField.getMsm(), null);
		}
		return new ResponseEntity<ResponseBase<UsuarioBaseResponse>>(baseResponse, HttpStatus.OK);
	}
	
	private UsuarioBaseResponse converterUsuario(Usuario usuario) {
		Imagem imagem = buscarImagem(usuario.getId());
		UsuarioBaseResponse usuarioBaseResponse = null;
		if(usuario instanceof Aluno) {
			AlunoMapper mappper = new AlunoMapper();
			AlunoResponse alunoResponse = mappper.transform((Aluno) usuario);
			usuarioBaseResponse = alunoResponse;
		} else {
			ProfessorMapper mappper = new ProfessorMapper();
			ProfessorResponse professorResponse = mappper.transform((Professor) usuario);
			professorResponse.setDisciplinas(consultarDisplinas(usuario.getId()));
			usuarioBaseResponse = professorResponse;
		}
		
		if(imagem != null) {
			usuarioBaseResponse.setImagemPerfil(imagem.getPerfil());
		}
		return usuarioBaseResponse;
	}
	
	private List<DisciplinaResponse> consultarDisplinas(Long idUsuario) {
		List<DisciplinaInteresse> disciplinaInteresses = disciplinaRepository.findByIdUsuario((long)idUsuario);
		return DisciplinaResponse.convertDisciplinas(disciplinaInteresses);
	}
	
	private Imagem buscarImagem(Long idUsuario) {
		return imagemRepository.findByIdUsuario((long)idUsuario);
	}
	
	private Usuario salvarUsuario(UsuarioRequest usuarioRequest) {
		Usuario usuarioCadastro = new CadastroMapper().transform(usuarioRequest);
		Usuario usuario = usuarioRepository.save(usuarioCadastro);
		return usuario;
	}
	
	private Usuario alterarUsuario(Usuario usuario, UsuarioRequest usuarioRequest) {
		usuario.setNome(usuarioRequest.getNome());
		return usuarioRepository.save(new AlterarMapper().transform(usuario, usuarioRequest));
	}
	
	private Imagem saveImage(Long idUsuario, String usuarioImagem) {
		return imagemRepository.save(new Imagem(idUsuario, usuarioImagem));
	}
	
	private Imagem alterarImagem(Long idUsuario, String usuarioImagem) {
		Imagem imagem = imagemRepository.findByIdUsuario(idUsuario);
		if(imagem != null) {
			imagem = new Imagem(idUsuario); 
		}
		imagem.setPerfil(usuarioImagem);
		return imagemRepository.save(imagem);
	}
	
	private void salvarDisciplinas(Usuario usuario, List<String> disciplinas) {
		for(String cod : disciplinas) {
			disciplinaRepository.save(new DisciplinaInteresse(EDisciplina.getEnum(cod.trim()).codigo, usuario.getId(), EDisciplina.getEnum(cod.trim()).descricao));
		}
	}
	
	private void alterarDisciplinas(Usuario usuario, List<String> disciplinas) {
		try {
			disciplinaRepository.deleteByIdUsuario(usuario.getId());
		} catch (Exception e) {
			logger.info("Usuário não possui disciplinas");
		}
		for(String cod : disciplinas) {
			disciplinaRepository.save(new DisciplinaInteresse(EDisciplina.getEnum(cod.trim()).codigo, usuario.getId(), EDisciplina.getEnum(cod.trim()).descricao));
		}
	}

}
