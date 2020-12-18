package ifsc.sti.tcc.resources.rest.models.respostasimulado;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultadoSimuladoGabaritoResponse extends ResultadoSimuladoResponse {
	
	@JsonProperty(value="Gabarito")
	List<QuestaoGabaritoResponse> gabarito;
	
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
