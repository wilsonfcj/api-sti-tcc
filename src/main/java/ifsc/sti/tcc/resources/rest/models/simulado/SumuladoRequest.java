package ifsc.sti.tcc.resources.rest.models.simulado;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SumuladoRequest {
	
	@JsonProperty(value="Nome")
	private String nome;
	
	@JsonProperty(value="Descricao")
	private String descricao;
	
	@JsonProperty(value="DataInicio")
	private Date dataInicio;
	
	@JsonProperty(value="DataFimSimulado")
	private Date dataFimSimulado;
	
	@JsonProperty(value="TempoMaximo")
	private Long tempoMaximo;
	
	@JsonProperty(value="IdUsuario")
	private Long idUsuario;
	
	@JsonProperty(value="QuantidadeQuestoes")
	private Integer quantidadeQuestoes;
	
	@JsonProperty(value="TipoSimulado")
	private Integer tipoSimulado;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFimSimulado() {
		return dataFimSimulado;
	}

	public void setDataFimSimulado(Date dataFimSimulado) {
		this.dataFimSimulado = dataFimSimulado;
	}

	public Long getTempoMaximo() {
		return tempoMaximo;
	}

	public void setTempoMaximo(Long tempoMaximo) {
		this.tempoMaximo = tempoMaximo;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getQuantidadeQuestoes() {
		return quantidadeQuestoes;
	}

	public void setQuantidadeQuestoes(Integer quantidadeQuestoes) {
		this.quantidadeQuestoes = quantidadeQuestoes;
	}

	public Integer getTipoSimulado() {
		return tipoSimulado;
	}

	public void setTipoSimulado(Integer tipoSimulado) {
		this.tipoSimulado = tipoSimulado;
	}

	
}
