package ifsc.sti.tcc.resources.rest.models.simulado.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimuladoEnadeRequest {
	
	@JsonProperty(value="QtdFormacaoGeral")
	private int qtdFormacaoGeral;
	
	@JsonProperty(value="QtdFormacaoEspecifica")
	private int qtdFormacaoEspecifica;

	public int getQtdFormacaoGeral() {
		return qtdFormacaoGeral;
	}

	public void setQtdFormacaoGeral(int qtdFormacaoGeral) {
		this.qtdFormacaoGeral = qtdFormacaoGeral;
	}

	public int getQtdFormacaoEspecifica() {
		return qtdFormacaoEspecifica;
	}

	public void setQtdFormacaoEspecifica(int qtdFormacaoEspecifica) {
		this.qtdFormacaoEspecifica = qtdFormacaoEspecifica;
	}
}
