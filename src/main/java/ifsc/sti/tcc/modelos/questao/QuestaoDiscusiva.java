package ifsc.sti.tcc.modelos.questao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "D")
public class QuestaoDiscusiva extends Questao implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7983031669542302834L;
	
	@Column(columnDefinition="TEXT")
	private String resposta;
	
	public QuestaoDiscusiva() {
		super();
	}

	public QuestaoDiscusiva(String resposta) {
		super();
		this.resposta = resposta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
}
