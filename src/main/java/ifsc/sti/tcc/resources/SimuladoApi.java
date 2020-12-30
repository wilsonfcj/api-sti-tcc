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

import ifsc.sti.tcc.repository.QuestaoRepository;
import ifsc.sti.tcc.repository.RespostaSimuladoRepository;
import ifsc.sti.tcc.repository.SalaRepository;
import ifsc.sti.tcc.repository.SimuladoRepository;
import ifsc.sti.tcc.repository.UsuarioRepository;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.question.QuestaoResponse;
import ifsc.sti.tcc.resources.rest.models.resultado.ResultadoSimuladoResponse;
import ifsc.sti.tcc.resources.rest.models.simulado.RespostaSimuladoRequest;
import ifsc.sti.tcc.resources.rest.models.simulado.SimuladoBaseResponse;
import ifsc.sti.tcc.resources.rest.models.simulado.SimuladoCompletoResponse;
import ifsc.sti.tcc.resources.rest.models.simulado.SumuladoRequest;
import ifsc.sti.tcc.resources.rest.models.simulado.SumuladoSalaRequest;
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
	@Autowired
	private SimuladoRepository simuladoRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private RespostaSimuladoRepository respostaSimuladoRepository;
	@Autowired
	private SalaRepository salaRepository;

    @ApiOperation(value = "Registra questões do simulado na base de dados")
	@GetMapping("/CadastrarQuestoes")
	public ResponseEntity<ResponseBase<List<QuestaoResponse>>> registrarQuestoes() {
		SimuladoService lSimuladoService = new SimuladoService
				.Instance(simuladoRepository)
				.withQuestaoRepository(questaoRepository)
				.build();
		return lSimuladoService.salvarTodasQuestoes();
    }
    
    @ApiOperation(value = "Gera um simulado para ser respondido")
	@RequestMapping(value = "/GerarSimulado", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<SimuladoCompletoResponse>> salvarRespostaSimulado(@RequestBody SumuladoRequest request) {
		SimuladoService lSimuladoService = new SimuladoService
				.Instance(simuladoRepository)
				.withQuestaoRepository(questaoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withRespostaSimuladoRepository(respostaSimuladoRepository)
				.withSalaRepository(salaRepository)
				.build();
		return lSimuladoService.gerarSimulado(request);
	}
	
	@ApiOperation(value = "Busca um simulado por seu Identificador")
	@GetMapping("/BuscarSimuladoPorId")
	public ResponseEntity<ResponseBase<SimuladoCompletoResponse>> buscarSimuladoPorId(@RequestParam Integer idSimulado) {
		SimuladoService lSimuladoService = new SimuladoService
				.Instance(simuladoRepository)
				.withQuestaoRepository(questaoRepository)
				.withSalaRepository(salaRepository)
				.build();
		return lSimuladoService.buscarSimuladoId(idSimulado);
	}
	
	@ApiOperation(value = "Busca as questões de um simulado por seu Identificador")
	@GetMapping("/BuscarQuestoesSimuladoPorId")
	public ResponseEntity<ResponseBase<SimuladoCompletoResponse>> buscarQuestoesSimuladoPorId(@RequestParam Integer idSimulado) {
		SimuladoService lSimuladoService = new SimuladoService
				.Instance(simuladoRepository)
				.withQuestaoRepository(questaoRepository)
				.withSalaRepository(salaRepository)
				.build();
		return lSimuladoService.buscarQuestoesSimuladoId(idSimulado);
	}
	
	@ApiOperation(value = "Busca um simulado por seu Identificador")
	@GetMapping("/BuscarSimuladosUsuario")
	public ResponseEntity<ResponseBase<List<SimuladoBaseResponse>>> buscarUsuarioPorIdUsuario(@RequestParam Integer idUsuario) {
		SimuladoService lSimuladoService = new SimuladoService
				.Instance(simuladoRepository)
				.withQuestaoRepository(questaoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSalaRepository(salaRepository)
				.withRespostaSimuladoRepository(respostaSimuladoRepository)
				.build();
		return lSimuladoService.buscarSimuladoIdUsuario(idUsuario);
	}
	
	@ApiOperation(value = "Busca um simulado por seu Identificador")
	@RequestMapping(value = "/BuscarSimuladosPorSala", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<List<SimuladoBaseResponse>>> buscarUsuarioPorIdUsuario(@RequestBody SumuladoSalaRequest sumuladoSalaRequest) {
		SimuladoService lSimuladoService = new SimuladoService
				.Instance(simuladoRepository)
				.withQuestaoRepository(questaoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSalaRepository(salaRepository)
				.withRespostaSimuladoRepository(respostaSimuladoRepository)
				.build();
		return lSimuladoService.buscarSimuladoIdSala(sumuladoSalaRequest.getIdUsuario(), sumuladoSalaRequest.getIdSala());
	}
	
	@ApiOperation(value = "Salva as respostas do simulado e gera o resultado")
	@RequestMapping(value = "/SalvarRespostaSimulado", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<ResultadoSimuladoResponse>> salvarRespostaSimulado(@RequestBody RespostaSimuladoRequest respostaSimuladoRequest) {
		SimuladoService lSimuladoService = new SimuladoService
				.Instance(simuladoRepository)
				.withQuestaoRepository(questaoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSalaRepository(salaRepository)
				.withRespostaSimuladoRepository(respostaSimuladoRepository)
				.build();
		return lSimuladoService.salvarRespostaSimulado(respostaSimuladoRequest);
	}

}
