package ifsc.sti.tcc.resources.rest.models.resultado;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import ifsc.sti.tcc.resources.rest.models.resultado.base.ResultadoSimuladoBase;

public class ResultadoSimuladoResponse extends ResultadoSimuladoBase {
	
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
	
	@JsonProperty(value="TipoSimulado")
	private Integer tipoSimulado;
	
	public Long getIdSimulado() {
		return idSimulado;
	}

	public void setIdSimulado(Long idSimulado) {
		this.idSimulado = idSimulado;
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

	public Integer getTipoSimulado() {
		return tipoSimulado;
	}

	public void setTipoSimulado(Integer tipoSimulado) {
		this.tipoSimulado = tipoSimulado;
	}
	
}
