package ifsc.sti.tcc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ifsc.sti.tcc.repository.InstituicaoRepository;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.instituicao.request.InstituicaoRequest;
import ifsc.sti.tcc.resources.rest.models.instituicao.response.InstituicaoResponse;
import ifsc.sti.tcc.service.InstituicaoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST STI Instituição")
public class InstituicaoAPI {
	
	@Autowired
	private InstituicaoRepository repository;
	
	@ApiOperation(value = "Cadastra Instituição")
	@RequestMapping(value = "/CadastrarInstituicao", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<InstituicaoResponse>> cadastrarInstituicao(@RequestBody InstituicaoRequest request) {
		InstituicaoService lUsuarioService = new InstituicaoService.Instance(repository).build();
		return lUsuarioService.cadastrarInstituicao(request);
	}

	@ApiOperation(value = "Remove a Instituição por ID")
	@GetMapping("/RemoverInstituicao")
	public ResponseEntity<ResponseBase<InstituicaoResponse>> removerInstituicao(@RequestParam Long id) {
		InstituicaoService lUsuarioService = new InstituicaoService.Instance(repository).build();
		return lUsuarioService.removerInstituicao(id);
	}

	@ApiOperation(value = "Consulta todas as instituições")
	@GetMapping("/BuscarTodasInstituicao")
	public ResponseEntity<ResponseBase<List<InstituicaoResponse>>> buscarTodasInstituicao() {
		InstituicaoService lUsuarioService = new InstituicaoService.Instance(repository).build();
		return lUsuarioService.buscarTodasInstituicao();
	}
	
	@ApiOperation(value = "Consulta a instituição por ID")
	@GetMapping("/BuscarInstituicaoPorId")
	public ResponseEntity<ResponseBase<InstituicaoResponse>> buscarInstituicaoPorId(@RequestParam Long id) {
		InstituicaoService lUsuarioService = new InstituicaoService.Instance(repository).build();
		return lUsuarioService.buscarInstituicaoPorId(id);
	}
	
	@ApiOperation(value = "Consulta a instituição por Nome")
	@GetMapping("/BuscarInstituicaoPorNome")
	public ResponseEntity<ResponseBase<InstituicaoResponse>> buscarInstituicaoPorNome(@RequestParam String nome) {
		InstituicaoService lUsuarioService = new InstituicaoService.Instance(repository).build();
		return lUsuarioService.buscarInstituicaoPorNome(nome);
	}
}
