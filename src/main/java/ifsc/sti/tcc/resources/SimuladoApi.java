package ifsc.sti.tcc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ifsc.sti.tcc.repository.QuestaoRepository;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.question.QuestaoResponse;
import ifsc.sti.tcc.resources.rest.models.simulado.SimuladoResponse;
import ifsc.sti.tcc.service.SimuladoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST STI Simulado")
public class SimuladoApi {
	
	@Autowired
	private QuestaoRepository questaoRepository;

    @ApiOperation(value = "Registra questões do simulado na base de dados")
	@GetMapping("/CadastrarQuestoes")
	public ResponseEntity<ResponseBase<List<QuestaoResponse>>> registrarQuestoes() {
		SimuladoService lSimuladoService = new SimuladoService
				.Instance(questaoRepository)
				.build();
		return lSimuladoService.salvarTodasQuestoes();
    }
	
	@ApiOperation(value = "Busca a lista de usuários cadastrados")
	@GetMapping("/GerarSimulado")
	public ResponseEntity<ResponseBase<SimuladoResponse>> gerarSimulado() {
		SimuladoService lSimuladoService = new SimuladoService
				.Instance(questaoRepository)
				.build();
		return lSimuladoService.gerarSimulado();
	}
	
	@ApiOperation(value = "Busca a lista de usuários cadastrados")
	@GetMapping("/GerarSimuladoPersonalizado")
	public ResponseEntity<ResponseBase<SimuladoResponse>> gerarSimuladoPersonalizado() {
//		UsuarioService lUsuarioService = new UsuarioService.Instance(usuarioRepository)
//				.withDisciplinaRepository(disciplinaRepository)
//				.withImagemRepository(imagemRepository)
//				.withInstituicaoRepository(instituicaoRepository)
//				.build();
		return null;
	}
	
}
