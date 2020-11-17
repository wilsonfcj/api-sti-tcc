package ifsc.sti.tcc.resources.rest.models.usuario.desempenho.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DesempenhoResponse {
	
	@JsonProperty(value = "TotalErros")
	private Integer totalErros;
	
	@JsonProperty(value = "TotalAcertos")
	private Integer totalAcertos;
	
	@JsonProperty(value = "TotalRespondidas")
	private Integer totalRespondidas;
	
	@JsonProperty(value = "TotalQuestoes")
	private Integer quantidadeQuestoes;
	
	public DesempenhoResponse() {
		super();
	}

	public DesempenhoResponse(Integer totalErros, Integer totalAcertos, Integer totalRespondidas,
			Integer quantidadeQuestoes) {
		super();
		this.totalErros = totalErros;
		this.totalAcertos = totalAcertos;
		this.totalRespondidas = totalRespondidas;
		this.quantidadeQuestoes = quantidadeQuestoes;
	}

	public Integer getTotalErros() {
		return totalErros;
	}

	public void setTotalErros(Integer totalErros) {
		this.totalErros = totalErros;
	}

	public Integer getTotalAcertos() {
		return totalAcertos;
	}

	public void setTotalAcertos(Integer totalAcertos) {
		this.totalAcertos = totalAcertos;
	}

	public Integer getTotalRespondidas() {
		return totalRespondidas;
	}

	public void setTotalRespondidas(Integer totalRespondidas) {
		this.totalRespondidas = totalRespondidas;
	}

	public Integer getQuantidadeQuestoes() {
		return quantidadeQuestoes;
	}

	public void setQuantidadeQuestoes(Integer quantidadeQuestoes) {
		this.quantidadeQuestoes = quantidadeQuestoes;
	}
	
}
