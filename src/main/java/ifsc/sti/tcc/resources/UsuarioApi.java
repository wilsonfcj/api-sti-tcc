package ifsc.sti.tcc.resources;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

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
import ifsc.sti.tcc.modelos.usuario.Professor;
import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.props.EDisciplina;
import ifsc.sti.tcc.props.EPerfilUsuario;
import ifsc.sti.tcc.repository.DisciplinaRepository;
import ifsc.sti.tcc.repository.UsuarioRepository;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.usuario.cadastro.UsuarioRequest;
import ifsc.sti.tcc.resources.rest.models.usuario.login.request.LoginRequest;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.DisciplinaResponse;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.ProfessorResponse;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.UsuarioBaseResponse;
import ifsc.sti.tcc.resources.rest.models.usuario.mappers.AlunoMapper;
import ifsc.sti.tcc.resources.rest.models.usuario.mappers.CadastroMapper;
import ifsc.sti.tcc.resources.rest.models.usuario.mappers.DisciplinaMapper;
import ifsc.sti.tcc.resources.rest.models.usuario.mappers.ProfessorMapper;
import ifsc.sti.tcc.utilidades.ValidatedField;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST STI")
public class UsuarioApi {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private DisciplinaRepository disciplinaRepository;
	
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
				if(usuarioRequest.getPerfilUsuario() == EPerfilUsuario.PROFESSOR.codigo) {
					salvarDisciplinas(usuario, usuarioRequest.getDisciplinas());
				}
				if(usuario != null) {
					baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Usuario cadastrado com sucesso", converterUsuario(usuario));
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
	
	
//	@ApiOperation(value = "Realiza o cadastro dos usuários")
//	@RequestMapping(value = "/DeletarUsuario", method = RequestMethod.POST)
//	public ResponseEntity<ResponseBase<UsuarioBaseResponse>> deletar(@RequestBody @Valid DeletarRequest deletarRequest) {
//		ResponseBase<UsuarioBaseResponse> baseResponse = new ResponseBase<>();
//		Usuario usuario = usuarioRepository.findByCpf(deletarRequest.getCpf());
//		if(usuario != null) {
//			if(Usuario.autenticarUsuario(usuario, deletarRequest.getSenha())) {
//				Usuario usuarioRemovido = usuarioRepository.deleteByCpf(deletarRequest.getCpf());
//				if(usuarioRemovido != null) {
//					baseResponse = new ResponseBase<>(true, "Usuário removido do sistema com sucesso", converterUsuario(usuarioRemovido));
//				} else {
//					baseResponse = new ResponseBase<>(true, "Não foi possível remover o usuário, tente novamente mais tarde", converterUsuario(usuarioRemovido));
//				}
//			} else {
//				baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Usuário ou Senha inválida", null);
//			}
//		} else {
//			baseResponse = new ResponseBase<UsuarioBaseResponse>(false, "Não foi possível remover o usuário, tente novamente mais tarde", null);
//		}
//		return new ResponseEntity<ResponseBase<UsuarioBaseResponse>>(baseResponse, HttpStatus.OK);
//	}
	
	private UsuarioBaseResponse converterUsuario(Usuario usuario) {
		if(usuario instanceof Aluno) {
			AlunoMapper mappper = new AlunoMapper();
			return mappper.transform((Aluno) usuario);
		} else {
			ProfessorMapper mappper = new ProfessorMapper();
			ProfessorResponse professorResponse = mappper.transform((Professor) usuario);
			professorResponse.setDisciplinas(consultarDisplinas(usuario.getId()));
			return professorResponse;
		}
	}
	
	private List<DisciplinaResponse> consultarDisplinas(Long idUsuario) {
		List<DisciplinaInteresse> disciplinaInteresses = disciplinaRepository.findByIdUsuario((long)idUsuario);
		return new DisciplinaMapper().transform(disciplinaInteresses);
	}
	
	private Usuario salvarUsuario(UsuarioRequest usuarioRequest) {
		Usuario usuarioCadastro = new CadastroMapper().transform(usuarioRequest);
		Usuario usuario = usuarioRepository.save(usuarioCadastro);
		return usuario;
	}
	
	private void salvarDisciplinas(Usuario usuario, List<Integer> disciplinas) {
		for(Integer cod : disciplinas) {
			disciplinaRepository.save(new DisciplinaInteresse(cod, usuario.getId(), EDisciplina.getEnum(cod).descricao));
		}
	}

}
