package ifsc.sti.tcc.modelos.usuario;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "A")
public class Aluno extends Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6398912528631742102L;

	private Long matricula;
	private Integer anoIngresso;

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public Integer getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(Integer anoIngresso) {
		this.anoIngresso = anoIngresso;
	}
}
