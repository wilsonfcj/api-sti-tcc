package ifsc.sti.tcc.modelos.respostasimulado;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "A")
public class RepostaAlternativa extends RespostaQuestao {
	
	private String alternativasSelecionada;

	public String getAlternativasSelecionada() {
		return alternativasSelecionada;
	}

	public void setAlternativasSelecionada(String alternativasSelecionada) {
		this.alternativasSelecionada = alternativasSelecionada;
	}
}
