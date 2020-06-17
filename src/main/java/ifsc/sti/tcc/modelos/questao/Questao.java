package ifsc.sti.tcc.modelos.questao;

import java.util.List;

import ifsc.sti.tcc.props.Area;
import ifsc.sti.tcc.props.Assunto;
import ifsc.sti.tcc.props.Disciplina;
import ifsc.sti.tcc.props.TipoQuestao;

public class Questao {
	
	private Long id;
	private Area area;
	private String correta;
	private Assunto assunto;
	private String descricao;
	private Disciplina disciplina;
	private TipoQuestao tipoQuestao;
	private List<String> alternativas;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Area getArea() {
		return area;
	}
	
	public void setArea(Area area) {
		this.area = area;
	}
	
	public String getCorreta() {
		return correta;
	}
	
	public void setCorreta(String correta) {
		this.correta = correta;
	}
	
	public Assunto getAssunto() {
		return assunto;
	}
	
	public void setAssunto(Assunto assunto) {
		this.assunto = assunto;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public TipoQuestao getTipoQuestao() {
		return tipoQuestao;
	}
	
	public void setTipoQuestao(TipoQuestao tipoQuestao) {
		this.tipoQuestao = tipoQuestao;
	}
	
	public List<String> getAlternativas() {
		return alternativas;
	}
	
	public void setAlternativas(List<String> alternativas) {
		this.alternativas = alternativas;
	}
	
	
	
}
