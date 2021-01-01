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

import ifsc.sti.tcc.repository.QuestaoRepository;
import ifsc.sti.tcc.repository.RespostaSimuladoRepository;
import ifsc.sti.tcc.repository.SimuladoRepository;
import ifsc.sti.tcc.repository.UsuarioRepository;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.question.QuestaoResponse;
import ifsc.sti.tcc.resources.rest.models.resultado.ResultadoGeralUsuarioResponse;
import ifsc.sti.tcc.resources.rest.models.resultado.ResultadoSimuladoProvaRequest;
import ifsc.sti.tcc.resources.rest.models.resultado.ResultadoSimuladoRequest;
import ifsc.sti.tcc.resources.rest.models.resultado.ResultadoSimuladoResponse;
import ifsc.sti.tcc.resources.rest.models.resultado.ResultadoSimuladoSalaCompletoResponse;
import ifsc.sti.tcc.resources.rest.models.resultado.ResultadoSimuladoSalaRequest;
import ifsc.sti.tcc.resources.rest.models.resultado.ResultadoSimuladoSalaResponse;
import ifsc.sti.tcc.resources.rest.models.resultado.base.ResultadoDisciplinaQuantitativo;
import ifsc.sti.tcc.service.ResultadoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST STI Resultado")
public class ResultadoApi {
	
	@Autowired
	private QuestaoRepository questaoRepository;
	@Autowired
	private SimuladoRepository simuladoRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;
	@Autowired
	private RespostaSimuladoRepository respostaSimuladoRepository;

    @ApiOperation(value = "Busca o resultado de um simulado confomre o simulado e o id do usuário")
    @RequestMapping(value = "/BuscarResultadoSimulado", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<ResultadoSimuladoResponse>> buscarResultadoSimulado(@RequestBody ResultadoSimuladoRequest request) {
    	ResultadoService service = new ResultadoService
				.Instance(respostaSimuladoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSimuladoRepository(simuladoRepository)
				.build();
		return service.buscarRepostaSimulado(request);
    }
    
    @ApiOperation(value = "[*NOVO] Busca todas as respostadas de um determinado simulado, ou seja, varias respostas de alunos")
    @RequestMapping(value = "/BuscarResultadosSalaSimulado", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<List<ResultadoSimuladoSalaResponse>>> buscarResultadosSimulado(@RequestBody ResultadoSimuladoRequest request) {
    	ResultadoService service = new ResultadoService
				.Instance(respostaSimuladoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSimuladoRepository(simuladoRepository)
				.build();
		return service.buscarRepostaSimuladoPorSala(request);
    }
    
    @ApiOperation(value = "[*NOVO] Busca o resultado de um simulado conforme o simulado e o id do usuário")
    @RequestMapping(value = "/BuscarResultadoSalaSimulado", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<ResultadoSimuladoSalaCompletoResponse>> buscarResultadoSimulado(@RequestBody ResultadoSimuladoSalaRequest request) {
    	ResultadoService service = new ResultadoService
				.Instance(respostaSimuladoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSimuladoRepository(simuladoRepository)
				.build();
		return service.buscarRepostaSimulado(request);
    }
    
    
    @ApiOperation(value = "Busca o resultado geral conforme a prova Enade, Poscomp ou Personalizada")
    @RequestMapping(value = "/BuscarResultadoGeralPorProva", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<ResultadoGeralUsuarioResponse>> buscarResultadoGeralPorProva(@RequestBody ResultadoSimuladoProvaRequest request) {
		ResultadoService service = new ResultadoService
				.Instance(respostaSimuladoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSimuladoRepository(simuladoRepository)
				.build();
		return service.buscarRepostaGeralPorProvas(request);
    }
    
    @ApiOperation(value = "Busca as metricas gerais de um usuário")
    @GetMapping("/BuscarResultadoGeral")
	public ResponseEntity<ResponseBase<ResultadoGeralUsuarioResponse>> buscarResultadoGeral(long idUsuario) {
		ResultadoService service = new ResultadoService
				.Instance(respostaSimuladoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSimuladoRepository(simuladoRepository)
				.build();
		return service.buscarRepostaGeralTodos(idUsuario);
    }
    
    @ApiOperation(value = "Busca o resultados dos ultimos simulados de um usuário")
    @GetMapping("/BuscarUltimosResultados")
	public ResponseEntity<ResponseBase<List<ResultadoSimuladoResponse>>> buscarResultadoSimulado(long idUsuario) {
		ResultadoService service = new ResultadoService
				.Instance(respostaSimuladoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSimuladoRepository(simuladoRepository)
				.build();
		return service.buscarUltimosResultados(idUsuario);
    }
    
    @ApiOperation(value = "Busca o gabarito do simulado com  as respostas de usuário")
    @RequestMapping(value = "/BuscarGabaritoPorSimulado", method = RequestMethod.POST)
    public ResponseEntity<ResponseBase<List<QuestaoResponse>>> buscarGabaritoProva(@RequestBody ResultadoSimuladoRequest request) {
    	ResultadoService service = new ResultadoService
				.Instance(respostaSimuladoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withQuestaoRepository(questaoRepository)
				.withSimuladoRepository(simuladoRepository)
				.build();
    	return service.buscarGabaritoUsuario(request.getIdSimulado(), request.getIdUsuario());
    }
    
    @ApiOperation(value = "[*NOVO] Busca o gabarito de simulado com as questões corretas, sem a resposta do usuário")
    @RequestMapping(value = "/BuscarGabaritoSemResposta", method = RequestMethod.POST)
    public ResponseEntity<ResponseBase<List<QuestaoResponse>>> buscarGabaritoSimulado(@RequestBody ResultadoSimuladoRequest request) {
    	ResultadoService service = new ResultadoService
				.Instance(respostaSimuladoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withQuestaoRepository(questaoRepository)
				.withSimuladoRepository(simuladoRepository)
				.build();
    	return service.buscarGabaritoSimulado(request.getIdSimulado(), request.getIdUsuario());
    }
 
    @ApiOperation(value = "Busca o desempenho das discplinas de um simulado")
    @GetMapping("/BuscarDesempenhoDisciplinas")
	public ResponseEntity<ResponseBase<List<ResultadoDisciplinaQuantitativo>>> buscarDesempenhoDisciplinas(long idUsuario) {
		ResultadoService service = new ResultadoService
				.Instance(respostaSimuladoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSimuladoRepository(simuladoRepository)
				.build();
		return service.buscarDesempenhoDisciplinas(idUsuario);
    }
    
    @ApiOperation(value = "Busca o desempenho das discplinas de um simulado")
    @RequestMapping(value = "/BuscarDesempenhoDisciplinasSimulado", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<List<ResultadoDisciplinaQuantitativo>>> buscarDesempenhoDisciplinasSimulado(@RequestBody ResultadoSimuladoRequest request) {
		ResultadoService service = new ResultadoService
				.Instance(respostaSimuladoRepository)
				.withUsuarioRepository(usuarioRepository)
				.withSimuladoRepository(simuladoRepository)
				.build();
		return service.buscarDesempenhoDisciplinas(request.getIdUsuario(), request.getIdSimulado());
    }
    
}
