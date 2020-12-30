package ifsc.sti.tcc.resources.rest.models.sala;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SalaRequest {

	@JsonProperty(value="Nome")
	private String nome;
	
	@JsonProperty(value="Senha")
	private String senha;
	
	@JsonProperty(value="Descricao")
	private String descricao;
	
	@JsonProperty(value="IdProfessor")
	private Integer idProfessor;
	
	@JsonProperty(value="MaxParticipantes")
	private Integer qtdParticipantes;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
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
}
