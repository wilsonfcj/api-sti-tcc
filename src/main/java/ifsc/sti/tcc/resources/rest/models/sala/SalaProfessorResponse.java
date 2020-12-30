package ifsc.sti.tcc.resources.rest.models.sala;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SalaProfessorResponse extends SalaResponse  {
	
	@JsonProperty(value="Senha")
	private String senha;
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
