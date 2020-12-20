package ifsc.sti.tcc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ifsc.sti.tcc.repository.QuestaoRepository;
import ifsc.sti.tcc.repository.RespostaSimuladoRepository;
import ifsc.sti.tcc.repository.SimuladoRepository;
import ifsc.sti.tcc.repository.UsuarioRepository;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.respostasimulado.ResultadoGeralUsuarioResponse;
import ifsc.sti.tcc.resources.rest.models.respostasimulado.ResultadoSimuladoProvaRequest;
import ifsc.sti.tcc.resources.rest.models.respostasimulado.ResultadoSimuladoRequest;
import ifsc.sti.tcc.resources.rest.models.respostasimulado.ResultadoSimuladoResponse;
import ifsc.sti.tcc.service.ResultadoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST STI Resultado")
public class ResultadoApi {
	
	@SuppressWarnings("unused")
	@Autowired
	private QuestaoRepository questaoRepository;
	@Autowired
	private SimuladoRepository simuladoRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private RespostaSimuladoRepository respostaSimuladoRepository;

    @ApiOperation(value = "Busca o resultado do usuário em um determinado simulado por Id do Usuário e o Id do Simulado")
    @RequestMapping(value = "/BuscarResultadoSimulado", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<ResultadoSimuladoResponse>> buscarResultadoSimulado(@RequestBody ResultadoSimuladoRequest request) {
		ResultadoService service = new ResultadoService
				.Instance(respostaSimuladoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSimuladoRepository(simuladoRepository)
				.build();
		return service.buscarRepostaSimulado(request);
    }
    
    @ApiOperation(value = "Registra questões do simulado na base de dados")
    @RequestMapping(value = "/BuscarResultadoGeralPorProva", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<ResultadoGeralUsuarioResponse>> buscarResultadoGeralPorProva(@RequestBody ResultadoSimuladoProvaRequest request) {
		ResultadoService service = new ResultadoService
				.Instance(respostaSimuladoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSimuladoRepository(simuladoRepository)
				.build();
		return service.buscarRepostaGeralProva(request);
    }
    
    @ApiOperation(value = "Registra questões do simulado na base de dados")
    @GetMapping("/BuscarResultadoGeral")
	public ResponseEntity<ResponseBase<ResultadoGeralUsuarioResponse>> buscarResultadoGeral(long idUsuario) {
		ResultadoService service = new ResultadoService
				.Instance(respostaSimuladoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSimuladoRepository(simuladoRepository)
				.build();
		return service.buscarRepostaGeralTodos(idUsuario);
    }
 
}
