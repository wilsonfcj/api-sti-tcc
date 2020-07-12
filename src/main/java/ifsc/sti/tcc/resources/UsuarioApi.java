package ifsc.sti.tcc.resources;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ifsc.sti.tcc.modelos.usuario.Aluno;
import ifsc.sti.tcc.modelos.usuario.Professor;
import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.usuario.cadastro.UsuarioRequest;
import ifsc.sti.tcc.resources.rest.models.usuario.login.request.LoginRequest;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.AlunoResponse;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.ProfessorResponse;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.UsuarioBaseResponse;
import ifsc.sti.tcc.resources.rest.models.usuario.mappers.AlunoMapper;
import ifsc.sti.tcc.resources.rest.models.usuario.mappers.ProfessorMapper;
import ifsc.sti.tcc.utilidades.ValidatedField;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST STI")
public class UsuarioApi {
	
	@ApiOperation(value = "Realiza a autenticação dos usuários")
	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<UsuarioBaseResponse>> login(@RequestBody @Valid LoginRequest loginRequest) {
		ResponseBase<UsuarioBaseResponse> baseResponse = new ResponseBase<>();
		Usuario usuario = Usuario.buscarUsuarioCPF(loginRequest.getCpf());
		if(usuario != null) {
			if(Usuario.autenticarUsuario(usuario, loginRequest.getSenha())) {
				if(usuario instanceof Aluno) {
					AlunoMapper mappper = new AlunoMapper();
					AlunoResponse response = mappper.transform((Aluno) usuario);
					baseResponse = new ResponseBase<>(true, "Informações carredas com sucesso", response);
				} else  {
					ProfessorMapper mappper = new ProfessorMapper();
					ProfessorResponse response = mappper.transform((Professor) usuario);
					baseResponse = new ResponseBase<>(true, "Informações carredas com sucesso", response);
				}
			} else {
				return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			}
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<ResponseBase<UsuarioBaseResponse>>(baseResponse, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Realiza a autenticação dos usuários")
	@RequestMapping(value = "/LoginMob", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<UsuarioBaseResponse>> loginMob(@RequestBody @Valid LoginRequest loginRequest) {
		ResponseBase<UsuarioBaseResponse> baseResponse = new ResponseBase<>();
		Usuario usuario = Usuario.buscarUsuarioCPF(loginRequest.getCpf());
		if(usuario != null) {
			if(Usuario.autenticarUsuario(usuario, loginRequest.getSenha())) {
				if(usuario instanceof Aluno) {
					AlunoMapper mappper = new AlunoMapper();
					AlunoResponse response = mappper.transform((Aluno) usuario);
					baseResponse = new ResponseBase<>(true, "Informações carredas com sucesso", response);
				} else  {
					ProfessorMapper mappper = new ProfessorMapper();
					ProfessorResponse response = mappper.transform((Professor) usuario);
					baseResponse = new ResponseBase<>(true, "Informações carredas com sucesso", response);
				}
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
			Usuario usuario = Usuario.buscarUsuarioCPF("09518747997");
			if(usuario instanceof Aluno) {
				AlunoMapper mappper = new AlunoMapper();
				AlunoResponse response = mappper.transform((Aluno) usuario);
				baseResponse = new ResponseBase<>(true, "Usuário cadastrado com sucesso", response);
			} else  {
				ProfessorMapper mappper = new ProfessorMapper();
				ProfessorResponse response = mappper.transform((Professor) usuario);
				baseResponse = new ResponseBase<>(true, "Usuário cadastrado com sucesso", response);
			}
		} else {
			baseResponse = new ResponseBase<UsuarioBaseResponse>(false, validatedField.getMsm(), null);
		}
		return new ResponseEntity<ResponseBase<UsuarioBaseResponse>>(baseResponse, HttpStatus.OK);
	}

}
