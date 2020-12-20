package ifsc.sti.tcc.resources.rest.models.respostasimulado;

import com.fasterxml.jackson.annotation.JsonProperty;

import ifsc.sti.tcc.resources.rest.models.respostasimulado.respostaarea.ResultadoSimuladoGeral;

public class ResultadoGeralUsuarioResponse {
	
	@JsonProperty(value="IdUsuario")
	private Long idUsuario;
	
	@JsonProperty(value="Nome")
	private String nome;
	
	@JsonProperty(value="ResultadoGeral")
	private ResultadoSimuladoGeral resultadoGeral;
	
	@JsonProperty(value="ResultadoMatematica")
	private ResultadoSimuladoGeral resultadoMatematica;
	
	@JsonProperty(value="ResultadoFundamentos")
	private ResultadoSimuladoGeral resultadoFundamentoComputacao;
	
	@JsonProperty(value="ResultadoTecnologia")
	private ResultadoSimuladoGeral resultadoTecnologiaComputacao;
	
	public ResultadoSimuladoGeral getResultadoGeral() {
		return resultadoGeral;
	}

	public void setResultadoGeral(ResultadoSimuladoGeral resultadoGeral) {
		this.resultadoGeral = resultadoGeral;
	}

	public ResultadoSimuladoGeral getResultadoMatematica() {
		return resultadoMatematica;
	}

	public void setResultadoMatematica(ResultadoSimuladoGeral resultadoMatematica) {
		this.resultadoMatematica = resultadoMatematica;
	}

	public ResultadoSimuladoGeral getResultadoFundamentoComputacao() {
		return resultadoFundamentoComputacao;
	}

	public void setResultadoFundamentoComputacao(ResultadoSimuladoGeral resultadoFundamentoComputacao) {
		this.resultadoFundamentoComputacao = resultadoFundamentoComputacao;
	}

	public ResultadoSimuladoGeral getResultadoTecnologiaComputacao() {
		return resultadoTecnologiaComputacao;
	}

	public void setResultadoTecnologiaComputacao(ResultadoSimuladoGeral resultadoTecnologiaComputacao) {
		this.resultadoTecnologiaComputacao = resultadoTecnologiaComputacao;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
}
