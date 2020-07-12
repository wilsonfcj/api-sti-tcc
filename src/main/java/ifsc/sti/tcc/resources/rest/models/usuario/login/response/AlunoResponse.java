package ifsc.sti.tcc.resources.rest.models.usuario.login.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AlunoResponse extends UsuarioBaseResponse {

	@JsonProperty(value="Matricula")
	private Long matricula;
	
	@JsonProperty(value="AnoIngresso")
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
