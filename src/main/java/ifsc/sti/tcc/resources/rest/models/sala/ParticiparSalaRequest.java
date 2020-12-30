package ifsc.sti.tcc.resources.rest.models.sala;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParticiparSalaRequest {
	@JsonProperty(value="IdUsuario")
	private Long idUsuario;
	
	@JsonProperty(value="IdSala")
	private Long idSala;
	
	@JsonProperty(value="Senha")
	private String senha;
}
