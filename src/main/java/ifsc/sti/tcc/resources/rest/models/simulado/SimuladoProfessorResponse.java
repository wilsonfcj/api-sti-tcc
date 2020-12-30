package ifsc.sti.tcc.resources.rest.models.simulado;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import ifsc.sti.tcc.resources.rest.models.resultado.ResultadoSimuladoResponse;

public class SimuladoProfessorResponse {

	@JsonProperty(value="Id")
	private Long id;
	
	@JsonProperty(value="idSala")
	private Long idSala;
	
	@JsonProperty(value="Nome")
	private String nome;
	
	@JsonProperty(value="Descricao")
	private String descricao;
	
	@JsonProperty(value="DataInicio")
	private Date dataInicio;
	
	@JsonProperty(value="dataCriacao")
	private Date dataCriacao;
	
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
	
	@JsonProperty(value="ResultadoSimulado")
	private ResultadoSimuladoResponse simuladoResultado;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
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
	
	public Date getDataCriacao() {
		return dataCriacao;
	}
	
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
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

	public ResultadoSimuladoResponse getSimuladoResultado() {
		return simuladoResultado;
	}

	public void setSimuladoResultado(ResultadoSimuladoResponse simuladoResultado) {
		this.simuladoResultado = simuladoResultado;
	}

	public Long getIdSala() {
		return idSala;
	}

	public void setIdSala(Long idSala) {
		this.idSala = idSala;
	}
	
	
}
