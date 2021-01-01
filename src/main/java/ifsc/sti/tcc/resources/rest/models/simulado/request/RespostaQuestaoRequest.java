package ifsc.sti.tcc.resources.rest.models.simulado.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RespostaQuestaoRequest {
	
	@JsonProperty(value="IdQuestao")
	private Long idQuestao;
	
	@JsonProperty(value="Respondida")
	private Boolean respondida;
	
	@JsonProperty(value="RespostaQuestao")
	private String respostaQuestao;
	
	@JsonProperty(value="TipoQuestao")
	private Integer tipoQuestao;
	
	public Long getIdQuestao() {
		return idQuestao;
	}
	
	public void setIdQuestao(Long idQuestao) {
		this.idQuestao = idQuestao;
	}
	
	public Boolean getRespondida() {
		return respondida;
	}
	
	public void setRespondida(Boolean respondida) {
		this.respondida = respondida;
	}

	public String getRespostaQuestao() {
		return respostaQuestao;
	}

	public void setRespostaQuestao(String respostaQuestao) {
		this.respostaQuestao = respostaQuestao;
	}

	public Integer getTipoQuestao() {
		return tipoQuestao;
	}

	public void setTipoQuestao(Integer tipoQuestao) {
		this.tipoQuestao = tipoQuestao;
	}

}
