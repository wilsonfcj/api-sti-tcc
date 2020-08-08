package ifsc.sti.tcc.resources;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ifsc.sti.tcc.repository.DisciplinaRepository;
import ifsc.sti.tcc.repository.service.DisciplinaService;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.usuario.login.request.DisciplinaCodRequest;
import ifsc.sti.tcc.resources.rest.models.usuario.login.request.DisciplinaDescricaoRequest;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.DisciplinaResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST STI Discplina")
public class DisciplinaAPI {
	
	@Autowired
	private DisciplinaRepository jpaRepository;
	
	@ApiOperation(value = "Deleta as discplinas por id usuário")
	@GetMapping("/DeletarDisciplinasPorId")
	public ResponseEntity<ResponseBase<List<DisciplinaResponse>>> deletarDisciplina(@RequestParam Long id) {
		DisciplinaService disciplinaService = new DisciplinaService.Instance(jpaRepository).build();
		return disciplinaService.deletar(id);
	}
	
	@ApiOperation(value = "Deleta a disciplina por código e id do usuário")
	@RequestMapping(value = "/DeletarDisciplinaPorCod", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<List<DisciplinaResponse>>> deletarDisciplina(@RequestBody @Valid DisciplinaCodRequest request) {
		DisciplinaService disciplinaService = new DisciplinaService.Instance(jpaRepository).build();
		return disciplinaService.deletar(request);
	}
	
	@ApiOperation(value = "Deleta a disciplina por descrição e id do usuário")
	@RequestMapping(value = "/DeletarDisciplinaPorDescricao", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<List<DisciplinaResponse>>> deletarDisciplina(@RequestBody @Valid DisciplinaDescricaoRequest request) {
		DisciplinaService disciplinaService = new DisciplinaService.Instance(jpaRepository).build();
		return disciplinaService.deletar(request);
	}
	
	
	@ApiOperation(value = "Consulta as discplinas por id usuário")
	@GetMapping("/BuscarDisciplinasPorId")
	public ResponseEntity<ResponseBase<List<DisciplinaResponse>>> buscarDisciplina(@RequestParam Long idUsuario) {
		DisciplinaService disciplinaService = new DisciplinaService.Instance(jpaRepository).build();
		return disciplinaService.buscar(idUsuario);
	}
	
}
