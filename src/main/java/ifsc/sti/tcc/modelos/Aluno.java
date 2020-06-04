package ifsc.sti.tcc.modelos;

public class Aluno extends Usuario {

	private int matricula;

	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aluno(int matricula) {
		super();
		this.matricula = matricula;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

}
