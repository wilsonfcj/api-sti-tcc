package ifsc.sti.tcc.resources.rest.models.respostasimulado;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import ifsc.sti.tcc.resources.rest.models.respostasimulado.respostaarea.ResultadoSimuladoGeral;

public class ResultadoSimuladoResponse {
	
	@JsonProperty(value="IdSimulado")
	private Long idSimulado;
	
	@JsonProperty(value="Nome")
	private String nome;
	
	@JsonProperty(value="Descricao")
	private String descricao;
	
	@JsonProperty(value="DataCriacao")
	private Date dataCriacao;
	
	@JsonProperty(value="DataEnvio")
	private Date dataEnvio;
	
	@JsonProperty(value="ResultadoGeral")
	private ResultadoSimuladoGeral resultadoGeral;
	
	@JsonProperty(value="ResultadoMatematica")
	private ResultadoSimuladoGeral resultadoMatematica;
	
	@JsonProperty(value="ResultadoFundamentos")
	private ResultadoSimuladoGeral resultadoFundamentoComputacao;
	
	@JsonProperty(value="ResultadoTecnologia")
	private ResultadoSimuladoGeral resultadoTecnologiaComputacao;
	
	public Long getIdSimulado() {
		return idSimulado;
	}

	public void setIdSimulado(Long idSimulado) {
		this.idSimulado = idSimulado;
	}

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

}
