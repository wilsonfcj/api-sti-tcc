package ifsc.sti.tcc.resources.rest.models.resultado.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuestaoGabaritoResponse {

	@JsonProperty(value="IdQuestao")
	private Long idQuestao;
	
	@JsonProperty(value="Respondida")
	private Boolean respondida;
	
	@JsonProperty(value="RespostaQuestao")
	private String respostaCorreta;
	
	@JsonProperty(value="RespostaQuestao")
	private String respostaSelecionada;
	
	@JsonProperty(value="RespostaQuestao")
	private String respostaCorretaDes;
	
	@JsonProperty(value="RespostaQuestao")
	private String respostaSelecionadaDes;

}
