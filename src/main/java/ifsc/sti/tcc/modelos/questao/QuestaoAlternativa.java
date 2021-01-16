package ifsc.sti.tcc.modelos.questao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "A")
public class QuestaoAlternativa extends Questao implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1416514724525559920L;
	
	@Column(columnDefinition="TEXT")
	private String alternativasA;
	@Column(columnDefinition="TEXT")
	private String alternativasB;
	@Column(columnDefinition="TEXT")
	private String alternativasC;
	@Column(columnDefinition="TEXT")
	private String alternativasD;
	@Column(columnDefinition="TEXT")
	private String alternativasE;

	private Boolean alternativaImagem = false;
	
	private String alternativaCorreta;
	
	public QuestaoAlternativa() {
		super();
	}
	public String getAlternativaCorreta() {
		return alternativaCorreta;
	}

	public void setAlternativaCorreta(String alternativaCorreta) {
		this.alternativaCorreta = alternativaCorreta.toLowerCase();
	}
	
	public String getAlternativasA() {
		return alternativasA;
	}
	
	public void setAlternativasA(String alternativasA) {
		this.alternativasA = alternativasA.replace("data:image/png;base64,", "").replace("data:image/jpg;base64,", "");
	}
	
	public String getAlternativasB() {
		return alternativasB;
	}
	
	public void setAlternativasB(String alternativasB) {
		this.alternativasB = alternativasB.replace("data:image/png;base64,", "").replace("data:image/jpg;base64,", "");
	}
	
	public String getAlternativasC() {
		return alternativasC;
	}
	
	public void setAlternativasC(String alternativasC) {
		this.alternativasC = alternativasC.replace("data:image/png;base64,", "").replace("data:image/jpg;base64,", "");
	}
	
	public String getAlternativasD() {
		return alternativasD;
	}
	
	public void setAlternativasD(String alternativasD) {
		this.alternativasD = alternativasD.replace("data:image/png;base64,", "").replace("data:image/jpg;base64,", "");
	}
	
	public String getAlternativasE() {
		return alternativasE;
	}
	
	public void setAlternativasE(String alternativasE) {
		this.alternativasE = alternativasE.replace("data:image/png;base64,", "").replace("data:image/jpg;base64,", "");
	}
	public Boolean getAlternativaImagem() {
		return alternativaImagem;
	}
	public void setAlternativaImagem(Boolean alternativaImagem) {
		this.alternativaImagem = alternativaImagem;
	}
	
	
}