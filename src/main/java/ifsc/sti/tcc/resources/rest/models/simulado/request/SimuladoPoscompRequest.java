package ifsc.sti.tcc.resources.rest.models.simulado.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimuladoPoscompRequest {
	
	@JsonProperty(value="QtdFundamentos")
	private int qtdFundamentos;
	
	@JsonProperty(value="QtdMatematica")
	private int qtdMatematica;
	
	@JsonProperty(value="QtdTecnologia")
	private int qtdTecnologia;

	public int getQtdFundamentos() {
		return qtdFundamentos;
	}

	public void setQtdFundamentos(int qtdFundamentos) {
		this.qtdFundamentos = qtdFundamentos;
	}

	public int getQtdMatematica() {
		return qtdMatematica;
	}

	public void setQtdMatematica(int qtdMatematica) {
		this.qtdMatematica = qtdMatematica;
	}

	public int getQtdTecnologia() {
		return qtdTecnologia;
	}

	public void setQtdTecnologia(int qtdTecnologia) {
		this.qtdTecnologia = qtdTecnologia;
	}

	
}
