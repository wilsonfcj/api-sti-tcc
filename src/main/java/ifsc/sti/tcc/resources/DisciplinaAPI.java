package ifsc.sti.tcc.resources;

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
import ifsc.sti.tcc.repository.DisciplinaRepository;
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
	private DisciplinaRepository disciplinaRepository;
	
	@ApiOperation(value = "Deleta as discplinas por id usuário")
	@GetMapping("/DeletarDisciplinasPorId")
	public ResponseEntity<ResponseBase<List<DisciplinaResponse>>> deletarDisciplina(@RequestParam Long id) {
		ResponseBase<List<DisciplinaResponse>> baseResponse = new ResponseBase<>();
		try {
			List<DisciplinaInteresse> disciplinaInteresses = disciplinaRepository.deleteByIdUsuario((long) id);
			if(disciplinaInteresses != null) {
				baseResponse = new ResponseBase<>(true, "Disciplnas deletadas com sucesso",  DisciplinaResponse.convertDisciplinas(disciplinaInteresses));
			} else {
				baseResponse = new ResponseBase<>(false, "Nenhuma disciplina encontrada para este usuário", null);
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Nenhuma disciplina encontrada para este usuário", null);
		}
		return new ResponseEntity<ResponseBase<List<DisciplinaResponse>>>(baseResponse, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Deleta a disciplina por código e id do usuário")
	@RequestMapping(value = "/DeletarDisciplinaPorCod", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<List<DisciplinaResponse>>> deletarDisciplina(@RequestBody @Valid DisciplinaCodRequest request) {
		ResponseBase<List<DisciplinaResponse>> baseResponse = new ResponseBase<>();
		try {
			List<DisciplinaInteresse> disciplinaInteresses = disciplinaRepository.deleteByParans(request.getIdUsuario(), request.getCod());
			if(disciplinaInteresses != null) {
				baseResponse = new ResponseBase<>(true, "Disciplnas deletadas com sucesso",  DisciplinaResponse.convertDisciplinas(disciplinaInteresses));
			} else {
				baseResponse = new ResponseBase<>(false, "Nenhuma disciplina encontrada para este usuário", null);
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Nenhuma disciplina encontrada para este usuário", null);
		}
		return new ResponseEntity<ResponseBase<List<DisciplinaResponse>>>(baseResponse, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Deleta a disciplina por descrição e id do usuário")
	@RequestMapping(value = "/DeletarDisciplinaPorDescricao", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<List<DisciplinaResponse>>> deletarDisciplina(@RequestBody @Valid DisciplinaDescricaoRequest request) {
		ResponseBase<List<DisciplinaResponse>> baseResponse = new ResponseBase<>();
		try {
			List<DisciplinaInteresse> disciplinaInteresses = disciplinaRepository.deleteByParans(request.getIdUsuario(), request.getDescricao());
			if(disciplinaInteresses != null) {
				baseResponse = new ResponseBase<>(true, "Disciplnas deletadas com sucesso",  DisciplinaResponse.convertDisciplinas(disciplinaInteresses));
			} else {
				baseResponse = new ResponseBase<>(false, "Nenhuma disciplina encontrada para este usuário", null);
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Nenhuma disciplina encontrada para este usuário", null);
		}
		return new ResponseEntity<ResponseBase<List<DisciplinaResponse>>>(baseResponse, HttpStatus.OK);
	}
	
	
	@ApiOperation(value = "Consulta as discplinas por id usuário")
	@GetMapping("/BuscarDisciplinasPorId")
	public ResponseEntity<ResponseBase<List<DisciplinaResponse>>> buscarDisciplina(@RequestParam Long idUsuario) {
		List<DisciplinaInteresse> disciplinaInteresses = disciplinaRepository.findByIdUsuario((long) idUsuario);
		ResponseBase<List<DisciplinaResponse>> baseResponse = new ResponseBase<>();
		if(disciplinaInteresses != null && disciplinaInteresses.size() > 1) {
			baseResponse = new ResponseBase<>(true, "Disciplnas consultadas com sucesso",  DisciplinaResponse.convertDisciplinas(disciplinaInteresses));
		} else {
			baseResponse = new ResponseBase<>(false, "Nenhuma disciplina encontrada para este usuário", null);
		}
		return new ResponseEntity<ResponseBase<List<DisciplinaResponse>>>(baseResponse, HttpStatus.OK);
	}
	
}
