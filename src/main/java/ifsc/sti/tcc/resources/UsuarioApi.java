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
import ifsc.sti.tcc.resources.rest.models.login.request.LoginRequest;
import ifsc.sti.tcc.resources.rest.models.login.response.AlunoResponse;
import ifsc.sti.tcc.resources.rest.models.login.response.ProfessorResponse;
import ifsc.sti.tcc.resources.rest.models.login.response.UsuarioBaseResponse;
import ifsc.sti.tcc.resources.rest.models.login.response.mappers.AlunoMapper;
import ifsc.sti.tcc.resources.rest.models.login.response.mappers.ProfessorMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST STI")
public class UsuarioApi {
	
	/*@ApiOperation(value = "Consulta todos os projetos de pesquisa do Campus-Lages")
	@RequestMapping(value = "/projetos", method = RequestMethod.GET)
	public ResponseEntity<ResponseBase<List<Projeto>>> login() {
		List<Projeto> listProjetos = new ArrayList<Projeto>();
		ResponseBase<List<Projeto>> baseResponse = new ResponseBase<>();
		try {
			listProjetos.addAll(ProjetosUtil.criarProjetos());
			baseResponse = new ResponseBase<>(true, "Informações carregadas com sucesso", listProjetos);
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível carregar as informações", listProjetos);
		}
		return new ResponseEntity<ResponseBase<List<Projeto>>>(baseResponse, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Consulta o total de projetos e a quantidade por situação")
	@RequestMapping(value = "/dashBoard", method = RequestMethod.GET)
	public ResponseEntity<ResponseBase<DashboardInfos>> dashBoard() {
		ResponseBase<DashboardInfos> baseResponse = new ResponseBase<>();
		try {
			baseResponse = new ResponseBase<>(true, "Informações carregadas com sucesso", ProjetosUtil.montarDashBoard());
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível carregar as informações", null);
		}
		return new ResponseEntity<ResponseBase<DashboardInfos>>(baseResponse, HttpStatus.OK);
	}*/
	
	
	@ApiOperation(value = "Realiza a autenticação dos usuários")
	@RequestMapping(value = "/Login", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<UsuarioBaseResponse>> projetosPorSituacao(@RequestBody @Valid LoginRequest loginRequest) {
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
	

}
