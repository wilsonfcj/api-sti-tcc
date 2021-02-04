package ifsc.sti.tcc.resources.rest.models.question.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QustaoGabaritoDiscursivaResponse extends QuestaoResponse {
	
	@JsonProperty(value="PossivelResposta")
	private String possivelResposta;
	
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

	public String getPossivelResposta() {
		return possivelResposta;
	}

	public void setPossivelResposta(String possivelResposta) {
		this.possivelResposta = possivelResposta;
	} 
	
	
}
