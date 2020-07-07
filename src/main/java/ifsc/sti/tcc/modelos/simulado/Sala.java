package ifsc.sti.tcc.modelos.simulado;

import java.util.Date;

public class Sala {
	
	private Long id;
	private String nome;
	private String descricao;
	private String senha;
	private Date dataCriacao;
	private Date dataTermino;
	private Integer IdSimulado;
	private Integer idProfessor;
	private Integer qtdParticipantes;
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
	
	public Date getDataTermino() {
		return dataTermino;
	}
	
	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}
	
	public Integer getIdSimulado() {
		return IdSimulado;
	}
	
	public void setIdSimulado(Integer idSimulado) {
		IdSimulado = idSimulado;
	}
	
	public Integer getIdProfessor() {
		return idProfessor;
	}
	
	public void setIdProfessor(Integer idProfessor) {
		this.idProfessor = idProfessor;
	}
	
	public Integer getQtdParticipantes() {
		return qtdParticipantes;
	}
	
	public void setQtdParticipantes(Integer qtdParticipantes) {
		this.qtdParticipantes = qtdParticipantes;
	}
	
	public String getUrlCompartilhamento() {
		return urlCompartilhamento;
	}
	
	public void setUrlCompartilhamento(String urlCompartilhamento) {
		this.urlCompartilhamento = urlCompartilhamento;
	}
	
	
}
