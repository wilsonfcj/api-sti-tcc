package ifsc.sti.tcc.resources.rest.models.respostasimulado;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultadoSimuladoRequest {
	
	@JsonProperty(value="IdUsuario")
	private long idUsuario;
	
	@JsonProperty(value="IdSimulado")
	private long idSimulado;
	
	public long getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public long getIdSimulado() {
		return idSimulado;
	}
	
	public void setIdSimulado(long idSimulado) {
		this.idSimulado = idSimulado;
	}

}
