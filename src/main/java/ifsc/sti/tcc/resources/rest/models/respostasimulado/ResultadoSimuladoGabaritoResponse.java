package ifsc.sti.tcc.resources.rest.models.respostasimulado;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultadoSimuladoGabaritoResponse extends ResultadoSimuladoResponse {
	
	@JsonProperty(value="Gabarito")
	List<QuestaoGabaritoResponse> gabarito;

}
