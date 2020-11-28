package ifsc.sti.tcc.resources.rest.models.respostasimulado;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RespostaSimuladoRequest {
	
	@JsonProperty(value="IdSimulado")
	private Long idSimulado;
	
	@JsonProperty(value="IdUsuario")
	private Long idUsuario;
	
	@JsonProperty(value="Respostas")
	private List<RespostaQuestaoRequest> respostas;
	
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
	
	public List<RespostaQuestaoRequest> getRespostas() {
		return respostas;
	}
	
	public void setRespostas(List<RespostaQuestaoRequest> respostas) {
		this.respostas = respostas;
	}
}
