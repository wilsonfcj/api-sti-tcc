package ifsc.sti.tcc.resources.rest.models.resultado.base;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultadoSimuladoBase {

	@JsonProperty(value="ResultadoGeral")
	private ResultadoQuantitativo resultadoGeral;
	
	@JsonProperty(value="ResultadoMatematica")
	private ResultadoQuantitativo resultadoMatematica;
	
	@JsonProperty(value="ResultadoFundamentos")
	private ResultadoQuantitativo resultadoFundamentoComputacao;
	
	@JsonProperty(value="ResultadoTecnologia")
	private ResultadoQuantitativo resultadoTecnologiaComputacao;

	public ResultadoQuantitativo getResultadoGeral() {
		return resultadoGeral;
	}

	public void setResultadoGeral(ResultadoQuantitativo resultadoGeral) {
		this.resultadoGeral = resultadoGeral;
	}

	public ResultadoQuantitativo getResultadoMatematica() {
		return resultadoMatematica;
	}

	public void setResultadoMatematica(ResultadoQuantitativo resultadoMatematica) {
		this.resultadoMatematica = resultadoMatematica;
	}

	public ResultadoQuantitativo getResultadoFundamentoComputacao() {
		return resultadoFundamentoComputacao;
	}

	public void setResultadoFundamentoComputacao(ResultadoQuantitativo resultadoFundamentoComputacao) {
		this.resultadoFundamentoComputacao = resultadoFundamentoComputacao;
	}

	public ResultadoQuantitativo getResultadoTecnologiaComputacao() {
		return resultadoTecnologiaComputacao;
	}

	public void setResultadoTecnologiaComputacao(ResultadoQuantitativo resultadoTecnologiaComputacao) {
		this.resultadoTecnologiaComputacao = resultadoTecnologiaComputacao;
	}
	
	
}
