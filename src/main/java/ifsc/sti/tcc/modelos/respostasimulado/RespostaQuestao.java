package ifsc.sti.tcc.modelos.respostasimulado;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "RespostaQuestao")
public abstract class RespostaQuestao {
	
	@Id
	@Column(name = "id_resposta_questao")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long idQuestao;
	private Boolean respondida;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdQuestao() {
		return idQuestao;
	}

	public void setIdQuestao(Long idQuestao) {
		this.idQuestao = idQuestao;
	}

	public Boolean getRespondida() {
		return respondida;
	}

	public void setRespondida(Boolean respondida) {
		this.respondida = respondida;
	}
}
