package ifsc.sti.tcc.resources.rest.models.resultado;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultadoSimuladoSalaRequest {
	
	@JsonProperty(value="IdProfessor")
	private long idProfessor;
	
	@JsonProperty(value="IdAluno")
	private long idAluno;
	
	@JsonProperty(value="IdSimulado")
	private long idSimulado;

	public long getIdProfessor() {
		return idProfessor;
	}

	public void setIdProfessor(long idProfessor) {
		this.idProfessor = idProfessor;
	}

	public long getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(long idAluno) {
		this.idAluno = idAluno;
	}

	public long getIdSimulado() {
		return idSimulado;
	}

	public void setIdSimulado(long idSimulado) {
		this.idSimulado = idSimulado;
	}
	
	

}
