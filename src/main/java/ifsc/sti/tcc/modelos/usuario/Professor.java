package ifsc.sti.tcc.modelos.usuario;

import java.util.List;

import ifsc.sti.tcc.props.EDisciplina;

public class Professor extends Usuario {

	private List<EDisciplina> disciplinas;
	
	public Professor() {
		super();
	}

	public Professor(List<EDisciplina> disciplinas) {
		super();
		this.disciplinas = disciplinas;
	}

	public List<EDisciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<EDisciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
}
