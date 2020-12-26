package ifsc.sti.tcc.resources.rest.models.resultado;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BuscarRespostaSimuladoRequest {
	
	@JsonProperty(value="IdSimulado")
	private Long idSimulado;
	
	@JsonProperty(value="IdUsuario")
	private Long idUsuario;
	
	public Long getIdSimulado() {
		return idSimulado;
	}
	
	public void setIdSimulado(Long idSimulado) {
		this.idSimulado = idSimulado;
	}
	
	public Long getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

}
