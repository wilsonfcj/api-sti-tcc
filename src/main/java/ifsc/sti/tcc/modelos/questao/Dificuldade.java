package ifsc.sti.tcc.modelos.questao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dificuldade")
public class Dificuldade implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9069824736736446317L;
	
	@Id
	@Column(name = "id_dificuldade")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long idQuestao;
	private Long idAluno;
	private Integer dificuldade;
	
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
	
	public Long getIdAluno() {
		return idAluno;
	}
	
	public void setIdAluno(Long idAluno) {
		this.idAluno = idAluno;
	}
	
	public Integer getDificuldade() {
		return dificuldade;
	}
	
	public void setDificuldade(Integer dificuldade) {
		this.dificuldade = dificuldade;
	}

}
