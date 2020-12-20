package ifsc.sti.tcc.resources.rest.models.respostasimulado;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultadoSimuladoProvaRequest {
	
	@JsonProperty(value="IdUsuario")
	private long idUsuario;
	
	@JsonProperty(value="TipoSimulado")
	private int tipoSimulado;

	public long getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getTipoSimulado() {
		return tipoSimulado;
	}

	public void setTipoSimulado(int tipoSimulado) {
		this.tipoSimulado = tipoSimulado;
	}
}
