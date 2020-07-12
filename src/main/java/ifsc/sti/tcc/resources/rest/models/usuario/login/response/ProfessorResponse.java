package ifsc.sti.tcc.resources.rest.models.usuario.login.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfessorResponse extends UsuarioBaseResponse {

	@JsonProperty(value="DisciplinasInteressadas")
	private List<DisciplinaResponse> disciplinas;
	
	public ProfessorResponse() {
		super();
	}

	public ProfessorResponse(List<DisciplinaResponse> disciplinas) {
		super();
		this.disciplinas = disciplinas;
	}

	public List<DisciplinaResponse> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<DisciplinaResponse> disciplinas) {
		this.disciplinas = disciplinas;
	}
}
