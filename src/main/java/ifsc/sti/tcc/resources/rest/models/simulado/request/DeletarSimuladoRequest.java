package ifsc.sti.tcc.resources.rest.models.simulado.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DeletarSimuladoRequest {
	
	@JsonProperty(value="IdUsuario")
	private Long idUsuario;
	
	@JsonProperty(value="IdSimulado")
	private Long idSimulado;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getIdSimulado() {
		return idSimulado;
	}

	public void setIdSimulado(Long idSimulado) {
		this.idSimulado = idSimulado;
	}

	
}
