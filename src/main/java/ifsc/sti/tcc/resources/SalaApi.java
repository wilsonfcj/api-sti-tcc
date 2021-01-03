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
import ifsc.sti.tcc.resources.rest.models.sala.request.DeletarSalaRequest;
import ifsc.sti.tcc.resources.rest.models.sala.request.ParticiparSalaRequest;
import ifsc.sti.tcc.resources.rest.models.sala.request.SalaRequest;
import ifsc.sti.tcc.resources.rest.models.sala.response.SalaResponse;
import ifsc.sti.tcc.resources.rest.models.simulado.response.SimuladoBaseResponse;
import ifsc.sti.tcc.service.SalaService;
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
    	SalaService lSalaService = new SalaService
				.Instance(salaRepository)
				.withQuestaoRepository(questaoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSimuladoRepository(simuladoRepository)
				.withInstituicaoRepository(instituicaoRepository)
				.withRespostaSimuladoRepository(respostaSimuladoRepository)
				.build();
		return lSalaService.criarSalaSimulado(salaRequest);
    }
    
    @ApiOperation(value = "Consulta as salas de simulados dos alunos")
	@GetMapping("/BuscarSalasSimulado")
	public ResponseEntity<ResponseBase<List<SalaResponse>>> buscarMinhasSalasDeSimulado(long idUsuario) {
    	SalaService lSalaService = new SalaService
				.Instance(salaRepository)
				.withQuestaoRepository(questaoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSimuladoRepository(simuladoRepository)
				.withRespostaSimuladoRepository(respostaSimuladoRepository)
				.build();
		return lSalaService.buscarMinhasSalas(idUsuario);
    }
    
    @ApiOperation(value = "Registra questões do simulado na base de dados")
    @RequestMapping(value = "/ParticiparSalaSimulado", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<List<SimuladoBaseResponse>>> participarSalaSimulado(@RequestBody ParticiparSalaRequest request) {
    	SalaService lSalaService = new SalaService
				.Instance(salaRepository)
				.withQuestaoRepository(questaoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSimuladoRepository(simuladoRepository)
				.withInstituicaoRepository(instituicaoRepository)
				.withRespostaSimuladoRepository(respostaSimuladoRepository)
				.build();
		return lSalaService.participarSala(request);
    }
    
//    @ApiOperation(value = "Deleta uma sala de simulado por seu id")
//    @RequestMapping(value = "/DeletarSalaDeSimulado", method = RequestMethod.POST)
// 	public ResponseEntity<ResponseBase<List<QuestaoResponse>>> deletarSalaDeSimulado(@RequestBody SimuladoSalaRequest request) {
//    	SalaService lSalaService = new SalaService
//				.Instance(salaRepository)
//				.withQuestaoRepository(questaoRepository)
//				.withUsuarioRepository(usuarioRepository)
//				.withSimuladoRepository(simuladoRepository)
//				.withInstituicaoRepository(instituicaoRepository)
//				.withRespostaSimuladoRepository(respostaSimuladoRepository)
//				.build();
// 		return lSalaService.deletarSala(request);
//  }
//    
    
//    @ApiOperation(value = "Registra questões do simulado na base de dados")
//   	@GetMapping("/BuscarSalaPorCodigo")
//   	public ResponseEntity<ResponseBase<List<QuestaoResponse>>> buscarSalaPorCodigo() {
//   		SimuladoService lSimuladoService = new SimuladoService
//   				.Instance(simuladoRepository)
//   				.withQuestaoRepository(questaoRepository)
//   				.build();
//   		return null; // lSimuladoService.salvarTodasQuestoes();
//    }

    
    @ApiOperation(value = "Remove o simulado por seu id")
	@RequestMapping(value = "/DeletarSala", method = RequestMethod.DELETE)
	public ResponseEntity<ResponseBase<SalaResponse>> deletarSimulado(@RequestBody DeletarSalaRequest request) {
    	SalaService salaService = new SalaService
    			.Instance(salaRepository)
				.withQuestaoRepository(questaoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSimuladoRepository(simuladoRepository)
				.withInstituicaoRepository(instituicaoRepository)
				.withRespostaSimuladoRepository(respostaSimuladoRepository)
				.build();
		return salaService.deletarSala(request);
	}

}
