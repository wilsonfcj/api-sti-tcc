package ifsc.sti.tcc.resources.rest.models.simulado;

import java.util.Date;
import java.util.List;

import ifsc.sti.tcc.resources.rest.models.question.QuestaoResponse;

public class SimuladoResponse {

	private Integer id;
	private String nome;
	private String descricao;
	
	private Date dataInicio;
	private Date dataCriacao;
	private Date dataFimSimulado;
	
	private Long tempoMaximo;
	private Long idUsuario;
	private Integer quantidadeQuestoes;
	private Integer tipoSimulado;
	private List<QuestaoResponse> questoes;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
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
	
	public List<QuestaoResponse> getQuestoes() {
		return questoes;
	}
	
	public void setQuestoes(List<QuestaoResponse> questoes) {
		this.questoes = questoes;
	}

}
