package ifsc.sti.tcc.modelos.questao;

import java.util.List;

public class QuestaoAlternativa extends Questao {
	
	private List<String> alternativas;
	private String alternativaCorreta;
	
	
	public QuestaoAlternativa() {
		super();
	}

	public QuestaoAlternativa(List<String> alternativas, String alternativaCorreta) {
		super();
		this.alternativas = alternativas;
		this.alternativaCorreta = alternativaCorreta;
	}

	public List<String> getAlternativas() {
		return alternativas;
	}
	
	public void setAlternativas(List<String> alternativas) {
		this.alternativas = alternativas;
	}

	public String getAlternativaCorreta() {
		return alternativaCorreta;
	}

	public void setAlternativaCorreta(String alternativaCorreta) {
		this.alternativaCorreta = alternativaCorreta;
	}
}
