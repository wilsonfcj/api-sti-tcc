package ifsc.sti.tcc.resources.rest.models.sala;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SalaResponse {
	
	@JsonProperty(value="Id")
	private Long id;

	@JsonProperty(value="Nome")
	private String nome;
	
	@JsonProperty(value="Descricao")
	private String descricao;
	
	@JsonProperty(value="Professor")
	private ProfessorResponse professor;
	
	@JsonProperty(value="MaxParticipantes")
	private Integer maxParticipantes;
	
	@JsonProperty(value="QtdParticipantes")
	private Integer qtdParticipantes = 0;
	
	@JsonProperty(value="DataCriacao")
	private Date dataCriacao;
	
	@JsonProperty(value="Participando")
	private Boolean participando = false;

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

	public Integer getMaxParticipantes() {
		return maxParticipantes;
	}

	public void setMaxParticipantes(Integer maxParticipantes) {
		this.maxParticipantes = maxParticipantes;
	}

	public Integer getQtdParticipantes() {
		return qtdParticipantes;
	}

	public void setQtdParticipantes(Integer qtdParticipantes) {
		this.qtdParticipantes = qtdParticipantes;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public ProfessorResponse getProfessor() {
		return professor;
	}

	public void setProfessor(ProfessorResponse professor) {
		this.professor = professor;
	}

	public Boolean getParticipando() {
		return participando;
	}

	public void setParticipando(Boolean participando) {
		this.participando = participando;
	}
}
