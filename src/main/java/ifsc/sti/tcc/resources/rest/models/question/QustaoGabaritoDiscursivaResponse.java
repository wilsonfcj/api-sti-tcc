package ifsc.sti.tcc.resources.rest.models.question;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QustaoGabaritoDiscursivaResponse extends QuestaoResponse {
	
	@JsonProperty(value="RespostaUsuario")
	private String respostaUsuario;
	
	@JsonProperty(value="Correta")
	private Boolean isCorreta;

	public String getRespostaUsuario() {
		return respostaUsuario;
	}

	public void setRespostaUsuario(String respostaUsuario) {
		this.respostaUsuario = respostaUsuario;
	} 
	
	public Boolean getIsCorreta() {
		return isCorreta;
	}

	public void isCorreta(Boolean isCorreta) {
		this.isCorreta = isCorreta;
	} 
}
