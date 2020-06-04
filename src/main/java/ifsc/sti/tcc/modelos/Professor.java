package ifsc.sti.tcc.modelos;

import java.util.List;

public class Professor extends Usuario {

	private List<Disciplinas> disciplinas;

	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Professor(List<Disciplinas> disciplinas) {
		super();
		this.disciplinas = disciplinas;
	}

	public List<Disciplinas> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplinas> disciplinas) {
		this.disciplinas = disciplinas;
	}

}
