package ifsc.sti.tcc.modelos.respostasimulado;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "D")
public class RepostaDiscursiva extends RespostaQuestao {
	
	@Column(columnDefinition="TEXT")
	private String respostaDiscursiva;

	public String getRespostaDiscursiva() {
		return respostaDiscursiva;
	}

	public void setRespostaDiscursiva(String respostaDiscursiva) {
		this.respostaDiscursiva = respostaDiscursiva;
	}
}
