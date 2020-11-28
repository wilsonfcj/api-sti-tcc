package ifsc.sti.tcc.resources.rest.models.question;

import com.fasterxml.jackson.annotation.JsonProperty;

public class QuestaoAlternativaResponse extends QuestaoResponse {
	
	@JsonProperty(value="AlternativasA")
	private String alternativasA;
	
	@JsonProperty(value="AlternativasB")
	private String alternativasB;
	
	@JsonProperty(value="AlternativasC")
	private String alternativasC;
	
	@JsonProperty(value="AlternativasD")
	private String alternativasD;
	
	@JsonProperty(value="AlternativasE")
	private String alternativasE;
	
	public String getAlternativasA() {
		return alternativasA;
	}
	
	public void setAlternativasA(String alternativasA) {
		this.alternativasA = alternativasA;
	}
	
	public String getAlternativasB() {
		return alternativasB;
	}
	
	public void setAlternativasB(String alternativasB) {
		this.alternativasB = alternativasB;
	}
	
	public String getAlternativasC() {
		return alternativasC;
	}
	
	public void setAlternativasC(String alternativasC) {
		this.alternativasC = alternativasC;
	}
	
	public String getAlternativasD() {
		return alternativasD;
	}
	
	public void setAlternativasD(String alternativasD) {
		this.alternativasD = alternativasD;
	}
	
	public String getAlternativasE() {
		return alternativasE;
	}
	
	public void setAlternativasE(String alternativasE) {
		this.alternativasE = alternativasE;
	}
}
