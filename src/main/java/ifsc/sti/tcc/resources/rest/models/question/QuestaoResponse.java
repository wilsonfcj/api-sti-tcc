package ifsc.sti.tcc.resources.rest.models.question;

public class QuestaoResponse {
	
	private Long id;
	private Integer ano;
	private String descricao;

	private Integer area;
	private Integer prova;
	private Integer disciplina;

	private Boolean imagem = false;
	
	private String alternativasA;
	private String alternativasB;
	private String alternativasC;
	private String alternativasD;
	private String alternativasE;
	
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
	public String getAlternativasA() {
		return alternativasA;
	}
	
	public void setAlternativasA(String alternativasA) {
		this.alternativasA = alternativasA;
	}
	
	public String getAlternativasB() {
		return alternativasB;
	}
	
	public void setAlternativasB(String alternativasB) {
		this.alternativasB = alternativasB;
	}
	
	public String getAlternativasC() {
		return alternativasC;
	}
	
	public void setAlternativasC(String alternativasC) {
		this.alternativasC = alternativasC;
	}
	
	public String getAlternativasD() {
		return alternativasD;
	}
	
	public void setAlternativasD(String alternativasD) {
		this.alternativasD = alternativasD;
	}
	
	public String getAlternativasE() {
		return alternativasE;
	}
	
	public void setAlternativasE(String alternativasE) {
		this.alternativasE = alternativasE;
	}
	
	
}
