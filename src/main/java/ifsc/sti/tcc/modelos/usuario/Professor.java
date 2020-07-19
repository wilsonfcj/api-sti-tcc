package ifsc.sti.tcc.modelos.usuario;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "P")
public class Professor extends Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	private List<Disciplina> disciplinas;
	
	public Professor() {
		super();
	}

//	public Professor(List<Disciplina> disciplinas) {
//		super();
//		this.disciplinas = disciplinas;
//	}
//
//	public List<Disciplina> getDisciplinas() {
//		return disciplinas;
//	}
//
//	public void setDisciplinas(List<Disciplina> disciplinas) {
//		this.disciplinas = disciplinas;
//	}
}
