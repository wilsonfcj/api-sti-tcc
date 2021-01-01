package ifsc.sti.tcc.resources.rest.models.simulado;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SimuladoRequest {
	
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
		
	@JsonProperty(value="TipoSimulado")
	private Integer tipoSimulado;
	
	@JsonProperty(value="AnoProva")
	private Integer anoProva;
	
	@JsonProperty(value="ConfiguracaoPoscomp")
	SimuladoPoscompRequest sumuladoConfigPoscomp;
	
	@JsonProperty(value="ConfiguracaoEnade")
	SimuladoEnadeRequest sumuladoConfigEnade;
	
	@JsonProperty(value="IdSala")
	Integer idSala;

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

	public Integer getTipoSimulado() {
		return tipoSimulado;
	}

	public void setTipoSimulado(Integer tipoSimulado) {
		this.tipoSimulado = tipoSimulado;
	}

	public Integer getAnoProva() {
		return anoProva;
	}

	public void setAnoProva(Integer anoProva) {
		this.anoProva = anoProva;
	}

	public SimuladoPoscompRequest getSumuladoConfigPoscomp() {
		return sumuladoConfigPoscomp;
	}

	public void setSumuladoConfigPoscomp(SimuladoPoscompRequest sumuladoConfigPoscomp) {
		this.sumuladoConfigPoscomp = sumuladoConfigPoscomp;
	}

	public SimuladoEnadeRequest getSumuladoConfigEnade() {
		return sumuladoConfigEnade;
	}

	public void setSumuladoConfigEnade(SimuladoEnadeRequest sumuladoConfigEnade) {
		this.sumuladoConfigEnade = sumuladoConfigEnade;
	}

	public Integer getIdSala() {
		return idSala;
	}

	public void setIdSala(Integer idSala) {
		this.idSala = idSala;
	}
}
