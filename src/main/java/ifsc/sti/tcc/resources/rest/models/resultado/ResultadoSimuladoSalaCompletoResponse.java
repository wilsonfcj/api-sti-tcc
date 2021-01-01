package ifsc.sti.tcc.resources.rest.models.resultado;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import ifsc.sti.tcc.resources.rest.models.resultado.base.ResultadoDisciplinaQuantitativo;

public class ResultadoSimuladoSalaCompletoResponse extends ResultadoSimuladoSalaResponse {
	
	@JsonProperty(value="ResultadoDisciplinas")
	private List<ResultadoDisciplinaQuantitativo> disciplinas;
	
	public List<ResultadoDisciplinaQuantitativo> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<ResultadoDisciplinaQuantitativo> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
}
