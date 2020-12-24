package ifsc.sti.tcc.resources.rest.models.question;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QustaoGabaritoAlternativaResponse extends QuestaoAlternativaResponse {

	@JsonProperty(value="RespostaCorreta")
	private String respostaCorreta;
	
	@JsonProperty(value="RespostaUsuario")
	private String respostaUsuario;

	public String getRespostaCorreta() {
		return respostaCorreta;
	}

	public void setRespostaCorreta(String respostaCorreta) {
		this.respostaCorreta = respostaCorreta;
	}

	public String getRespostaUsuario() {
		return respostaUsuario;
	}

	public void setRespostaUsuario(String respostaUsuario) {
		this.respostaUsuario = respostaUsuario;
	} 
}
