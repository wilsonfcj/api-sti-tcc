package ifsc.sti.tcc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ifsc.sti.tcc.repository.InstituicaoRepository;
import ifsc.sti.tcc.repository.QuestaoRepository;
import ifsc.sti.tcc.repository.RespostaSimuladoRepository;
import ifsc.sti.tcc.repository.SalaRepository;
import ifsc.sti.tcc.repository.SimuladoRepository;
import ifsc.sti.tcc.repository.UsuarioRepository;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.question.QuestaoResponse;
import ifsc.sti.tcc.resources.rest.models.sala.SalaRequest;
import ifsc.sti.tcc.resources.rest.models.sala.SalaResponse;
import ifsc.sti.tcc.service.SalaService;
import ifsc.sti.tcc.service.SimuladoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST STI Simulado")
public class SalaApi {
	
	@Autowired
	private QuestaoRepository questaoRepository;
	
	@Autowired
	private SalaRepository salaRepository;
	
	@Autowired
	private SimuladoRepository simuladoRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private RespostaSimuladoRepository respostaSimuladoRepository;
	
	@Autowired
	private InstituicaoRepository instituicaoRepository;

    @ApiOperation(value = "Cria uma sala de simulado para os alunos")
    @RequestMapping(value = "/CriarSalaSimulado", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<SalaResponse>> criarSalaSimulado(@RequestBody SalaRequest salaRequest) {
    	SalaService lSimuladoService = new SalaService
				.Instance(salaRepository)
				.withQuestaoRepository(questaoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSimuladoRepository(simuladoRepository)
				.withInstituicaoRepository(instituicaoRepository)
				.withRespostaSimuladoRepository(respostaSimuladoRepository)
				.build();
		return lSimuladoService.criarSalaSimulado(salaRequest);
    }
    
    @ApiOperation(value = "Registra questões do simulado na base de dados")
	@GetMapping("/BuscarSalasSimulado")
	public ResponseEntity<ResponseBase<List<SalaResponse>>> buscarMinhasSalasDeSimulado(long idUsuario) {
    	SalaService lSimuladoService = new SalaService
				.Instance(salaRepository)
				.withQuestaoRepository(questaoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSimuladoRepository(simuladoRepository)
				.withRespostaSimuladoRepository(respostaSimuladoRepository)
				.build();
		return lSimuladoService.buscarMinhasSalas(idUsuario);
    }
    
    @ApiOperation(value = "Registra questões do simulado na base de dados")
	@GetMapping("/ParticiparSalaSimulado")
	public ResponseEntity<ResponseBase<List<QuestaoResponse>>> participarSalaSimulado() {
		SimuladoService lSimuladoService = new SimuladoService
				.Instance(simuladoRepository)
				.withQuestaoRepository(questaoRepository)
				.build();
		return null; // lSimuladoService.salvarTodasQuestoes();
    }
    
    @ApiOperation(value = "Registra questões do simulado na base de dados")
	@GetMapping("/BuscarAlunosParticipantes")
	public ResponseEntity<ResponseBase<List<QuestaoResponse>>> buscarAlunosParticipantes() {
		SimuladoService lSimuladoService = new SimuladoService
				.Instance(simuladoRepository)
				.withQuestaoRepository(questaoRepository)
				.build();
		return null; // lSimuladoService.salvarTodasQuestoes();
    }
    
    @ApiOperation(value = "Registra questões do simulado na base de dados")
   	@GetMapping("/BuscarSalaPorCodigo")
   	public ResponseEntity<ResponseBase<List<QuestaoResponse>>> buscarSalaPorCodigo() {
   		SimuladoService lSimuladoService = new SimuladoService
   				.Instance(simuladoRepository)
   				.withQuestaoRepository(questaoRepository)
   				.build();
   		return null; // lSimuladoService.salvarTodasQuestoes();
    }


//    @ApiOperation(value = "Registra questões do simulado na base de dados")
//   	@GetMapping("/BuscarSalaPorCodigo")
//   	public ResponseEntity<ResponseBase<List<QuestaoResponse>>> buscarSalaPorCodigo() {
//   		SimuladoService lSimuladoService = new SimuladoService
//   				.Instance(simuladoRepository)
//   				.withQuestaoRepository(questaoRepository)
//   				.build();
//   		return null; // lSimuladoService.salvarTodasQuestoes();
//    }

}
