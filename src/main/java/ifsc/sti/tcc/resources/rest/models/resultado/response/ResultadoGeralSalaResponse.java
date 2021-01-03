package ifsc.sti.tcc.resources.rest.models.resultado.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import ifsc.sti.tcc.resources.rest.models.resultado.base.ResultadoDisciplinaQuantitativo;

public class ResultadoGeralSalaResponse extends ResultadoGeralUsuarioResponse {
	
	@JsonProperty(value="QuantidadeSimulados")
	private Integer quantidadeSimulados;
	
	@JsonProperty(value="ResultadoDisciplinas")
	private List<ResultadoDisciplinaQuantitativo> disciplinas;

	public List<ResultadoDisciplinaQuantitativo> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<ResultadoDisciplinaQuantitativo> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Integer getQuantidadeSimulados() {
		return quantidadeSimulados;
	}

	public void setQuantidadeSimulados(Integer quantidadeSimulados) {
		this.quantidadeSimulados = quantidadeSimulados;
	}

}
