package ifsc.sti.tcc.modelos.usuario;

import java.util.List;

import ifsc.sti.tcc.props.Disciplina;

public class Professor extends Usuario {

	private List<Disciplina> disciplinas;

	public Professor(List<Disciplina> disciplinas) {
		super();
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

}
