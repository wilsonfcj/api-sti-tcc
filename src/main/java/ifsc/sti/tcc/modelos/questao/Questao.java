package ifsc.sti.tcc.modelos.questao;

import ifsc.sti.tcc.props.EArea;
import ifsc.sti.tcc.props.EAssunto;
import ifsc.sti.tcc.props.EDificuldade;
import ifsc.sti.tcc.props.EDisciplina;
import ifsc.sti.tcc.props.ETipoQuestao;

public abstract class Questao {
	
//	Identificação
	private Long id;
	private Integer ano;
	private String descricao;
	
//	Configuração prova
	private EArea area;
	private EAssunto assunto;
	private ETipoQuestao prova;
	private EDisciplina disciplina;
	private EDificuldade dificuldade;
	
	public Questao() {
		super();
	}

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
	
	public EArea getArea() {
		return area;
	}
	
	public void setArea(EArea area) {
		this.area = area;
	}
	
	public EAssunto getAssunto() {
		return assunto;
	}
	
	public void setAssunto(EAssunto assunto) {
		this.assunto = assunto;
	}
	
	public ETipoQuestao getProva() {
		return prova;
	}
	
	public void setProva(ETipoQuestao prova) {
		this.prova = prova;
	}
	
	public EDisciplina getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(EDisciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public EDificuldade getDificuldade() {
		return dificuldade;
	}

	public void setDificuldade(EDificuldade dificuldade) {
		this.dificuldade = dificuldade;
	}

}
