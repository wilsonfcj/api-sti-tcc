package ifsc.sti.tcc.resources.rest.models.respostasimulado;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultadoQuestaoResponse {
	
	@JsonProperty(value="IdQuestao")
	private Long idQuestao;
	
	@JsonProperty(value="IdRespondia")
	private Boolean respondida;
	
	@JsonProperty(value="IdRespondia")
	private Boolean correta;
	
}
