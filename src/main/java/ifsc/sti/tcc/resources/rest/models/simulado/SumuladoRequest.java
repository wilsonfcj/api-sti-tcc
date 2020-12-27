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
		
	@JsonProperty(value="TipoSimulado")
	private Integer tipoSimulado;
	
	@JsonProperty(value="AnoProva")
	private Integer anoProva;
	
	@JsonProperty(value="ConfiguracaoPoscomp")
	SumuladoPoscompRequest sumuladoConfigPoscomp;
	
	@JsonProperty(value="ConfiguracaoEnade")
	SumuladoEnadeRequest sumuladoConfigEnade;

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

	public SumuladoPoscompRequest getSumuladoConfigPoscomp() {
		return sumuladoConfigPoscomp;
	}

	public void setSumuladoConfigPoscomp(SumuladoPoscompRequest sumuladoConfigPoscomp) {
		this.sumuladoConfigPoscomp = sumuladoConfigPoscomp;
	}

	public SumuladoEnadeRequest getSumuladoConfigEnade() {
		return sumuladoConfigEnade;
	}

	public void setSumuladoConfigEnade(SumuladoEnadeRequest sumuladoConfigEnade) {
		this.sumuladoConfigEnade = sumuladoConfigEnade;
	}
}
