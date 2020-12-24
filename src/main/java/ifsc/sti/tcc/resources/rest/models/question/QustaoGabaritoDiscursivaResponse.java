package ifsc.sti.tcc.resources.rest.models.question;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QustaoGabaritoDiscursivaResponse extends QuestaoResponse {
	
	@JsonProperty(value="RespostaUsuario")
	private String respostaUsuario;

	public String getRespostaUsuario() {
		return respostaUsuario;
	}

	public void setRespostaUsuario(String respostaUsuario) {
		this.respostaUsuario = respostaUsuario;
	} 
}
