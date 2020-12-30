package ifsc.sti.tcc.resources.rest.models.simulado;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SumuladoSalaRequest {
	
	@JsonProperty(value="IdSala")
	private Long idSala;
	
	@JsonProperty(value="IdUsuario")
	private Long idUsuario;

	public Long getIdSala() {
		return idSala;
	}

	public void setIdSala(Long idSala) {
		this.idSala = idSala;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
