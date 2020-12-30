package ifsc.sti.tcc.resources.rest.models.sala;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParticiparSalaRequest {
	@JsonProperty(value="IdUsuario")
	private Long idUsuario;
	
	@JsonProperty(value="IdSala")
	private Long idSala;
	
	@JsonProperty(value="Senha")
	private String senha;

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getIdSala() {
		return idSala;
	}

	public void setIdSala(Long idSala) {
		this.idSala = idSala;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
