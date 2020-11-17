package ifsc.sti.tcc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ifsc.sti.tcc.repository.DesempenhoRepository;
import ifsc.sti.tcc.repository.service.DesempenhoService;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.usuario.desempenho.response.DesempenhoResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST STI Desempenho")
public class DesempenhoAPI {
	
	@Autowired
	private DesempenhoRepository jpaRepository;
	
	@ApiOperation(value = "Consulta o desempenho por id usuário")
	@GetMapping("/BuscarDesempenho")
	public ResponseEntity<ResponseBase<DesempenhoResponse>> buscarDesempenho(@RequestParam Long idUsuario){
		DesempenhoService desempenhoService = new DesempenhoService.Instance(jpaRepository).build();
		return desempenhoService.buscarDesempenho(idUsuario);
	}
	

}
