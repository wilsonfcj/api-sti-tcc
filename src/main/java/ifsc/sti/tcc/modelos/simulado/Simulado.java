package ifsc.sti.tcc.modelos.simulado;

import java.util.Date;
import java.util.List;

import ifsc.sti.tcc.modelos.questao.Questao;
import ifsc.sti.tcc.props.ETipoSimulado;

public class Simulado {

//	Identificação
	private Integer id;
	private String nome;
	private String descricao;
	
//	Tempos e Configurações
	private Date dataInicio;
	private Date dataCriacao;
	private Date dataFimSimulado;
	
	private Long tempoMaximo;
	private Long idProfessor;
	private Integer quantidadeQuestoes;
	private ETipoSimulado tipoSimulado;
	private List<Questao> questoes;
	
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
	
	public Long getIdProfessor() {
		return idProfessor;
	}
	
	public void setIdProfessor(Long idProfessor) {
		this.idProfessor = idProfessor;
	}
	
	public Integer getQuantidadeQuestoes() {
		return quantidadeQuestoes;
	}
	
	public void setQuantidadeQuestoes(Integer quantidadeQuestoes) {
		this.quantidadeQuestoes = quantidadeQuestoes;
	}
	
	public ETipoSimulado getTipoSimulado() {
		return tipoSimulado;
	}
	
	public void setTipoSimulado(ETipoSimulado tipoSimulado) {
		this.tipoSimulado = tipoSimulado;
	}
	
	public List<Questao> getQuestoes() {
		return questoes;
	}
	
	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}
	
	
	
	
	
}
