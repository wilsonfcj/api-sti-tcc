package ifsc.sti.tcc.modelos.simulado;

import java.util.Date;
import java.util.List;

import ifsc.sti.tcc.modelos.usuario.Aluno;
import ifsc.sti.tcc.modelos.usuario.Professor;

public class Sala {
	
	private Long id;
	private String nome;
	private String descricao;
	private String senha;
	private Date dataCriacao;
	private Simulado simulado;
	private Professor criador;
	private Integer qtdParticipantes;
	private List<Aluno> participantes;
	private String urlCompartilhamento;
	
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
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public Date getDataCriacao() {
		return dataCriacao;
	}
	
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	public Simulado getSimulado() {
		return simulado;
	}
	
	public void setSimulado(Simulado simulado) {
		this.simulado = simulado;
	}
	
	public Professor getCriador() {
		return criador;
	}
	
	public void setCriador(Professor criador) {
		this.criador = criador;
	}
	
	public Integer getQtdParticipantes() {
		return qtdParticipantes;
	}
	
	public void setQtdParticipantes(Integer qtdParticipantes) {
		this.qtdParticipantes = qtdParticipantes;
	}
	
	public List<Aluno> getParticipantes() {
		return participantes;
	}
	
	public void setParticipantes(List<Aluno> participantes) {
		this.participantes = participantes;
	}
	
	public String getUrlCompartilhamento() {
		return urlCompartilhamento;
	}
	
	public void setUrlCompartilhamento(String urlCompartilhamento) {
		this.urlCompartilhamento = urlCompartilhamento;
	}

	
	
}
