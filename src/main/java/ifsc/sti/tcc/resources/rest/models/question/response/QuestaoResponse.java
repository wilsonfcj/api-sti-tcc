package ifsc.sti.tcc.resources.rest.models.question.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuestaoResponse {
	
	@JsonProperty(value="Id")
	private Long id;
	
	@JsonProperty(value="Ano")
	private Integer ano;
	
	@JsonProperty(value="Descricao")
	private String descricao;

	@JsonProperty(value="Area")
	private Integer area;
	
	@JsonProperty(value="Prova")
	private Integer prova;
	
	@JsonProperty(value="Disciplina")
	private Integer disciplina;

	@JsonProperty(value="ComImagem")
	private Boolean imagem = false;
	
	@JsonProperty(value="ImagemQuestao")
	private String imagemQuestao;
	
	@JsonProperty(value="NumeroQuestao")
	private Integer numeroQuestao;
	
	@JsonProperty(value="TipoQuestao")
	private Integer tipoQuestao;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Integer getAno() {
		return ano;
	}
	
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Integer getArea() {
		return area;
	}
	
	public void setArea(Integer area) {
		this.area = area;
	}
	
	public Integer getProva() {
		return prova;
	}
	
	public void setProva(Integer prova) {
		this.prova = prova;
	}
	
	public Integer getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(Integer disciplina) {
		this.disciplina = disciplina;
	}
	
	public Boolean getImagem() {
		return imagem;
	}
	
	public void setImagem(Boolean imagem) {
		this.imagem = imagem;
	}

	public String getImagemQuestao() {
		return imagemQuestao;
	}

	public void setImagemQuestao(String imagemQuestao) {
		this.imagemQuestao = imagemQuestao;
	}

	public Integer getNumeroQuestao() {
		return numeroQuestao;
	}

	public void setNumeroQuestao(Integer numeroQuestao) {
		this.numeroQuestao = numeroQuestao;
	}

	public Integer getTipoQuestao() {
		return tipoQuestao;
	}

	public void setTipoQuestao(Integer tipoQuestao) {
		this.tipoQuestao = tipoQuestao;
	}
}
