package ifsc.sti.tcc.resources.rest.models.respostasimulado;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultadoSimuladoResponse {
	
	@JsonProperty(value="IdSimulado")
	Long IdSimulado;
	
	@JsonProperty(value="Erros")
	Integer erros; 
	
	@JsonProperty(value="Acertos")
	Integer acertos;
	
	@JsonProperty(value="NaoRespondidas")
	Integer naoRespondidas;
	
	@JsonProperty(value="TotalQuestao")
	Integer total;
	
	public Integer getErros() {
		return erros;
	}

	public Long getIdSimulado() {
		return IdSimulado;
	}

	public void setIdSimulado(Long idSimulado) {
		IdSimulado = idSimulado;
	}

	public void setErros(Integer erros) {
		this.erros = erros;
	}

	public Integer getAcertos() {
		return acertos;
	}

	public void setAcertos(Integer acertos) {
		this.acertos = acertos;
	}

	public Integer getNaoRespondidas() {
		return naoRespondidas;
	}

	public void setNaoRespondidas(Integer naoRespondidas) {
		this.naoRespondidas = naoRespondidas;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}
}
