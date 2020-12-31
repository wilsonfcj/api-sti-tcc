package ifsc.sti.tcc.resources.rest.models.simulado;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import ifsc.sti.tcc.resources.rest.models.question.QuestaoResponse;

public class SimuladoGabaritoResponse extends SimuladoBaseResponse{

	@JsonProperty(value="Questoes")
	private List<QuestaoResponse> questoes;
	

	public List<QuestaoResponse> getQuestoes() {
		return questoes;
	}
	
	public void setQuestoes(List<QuestaoResponse> questoes) {
		this.questoes = questoes;
	}
}
