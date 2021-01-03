package ifsc.sti.tcc.resources.rest.models.sala.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeletarSalaRequest {
	
	@JsonProperty(value="IdUsuario")
	private Long idUsuario;
	
	@JsonProperty(value="IdSala")
	private Long idSala;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getIdSala() {
		return idSala;
	}

	public void setIdSala(Long idSala) {
		this.idSala = idSala;
	}
	
	
}
