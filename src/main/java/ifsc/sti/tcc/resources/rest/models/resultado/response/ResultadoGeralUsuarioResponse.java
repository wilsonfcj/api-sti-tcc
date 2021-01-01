package ifsc.sti.tcc.resources.rest.models.resultado.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import ifsc.sti.tcc.resources.rest.models.resultado.base.ResultadoSimuladoBase;

public class ResultadoGeralUsuarioResponse extends ResultadoSimuladoBase {
	
	@JsonProperty(value="IdUsuario")
	private Long idUsuario;
	
	@JsonProperty(value="Nome")
	private String nome;
	
	@JsonProperty(value="SimuladosRespondidos")
	private Integer simuladosRespondidos;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getSimuladosRespondidos() {
		return simuladosRespondidos;
	}

	public void setSimuladosRespondidos(Integer simuladosRespondidos) {
		this.simuladosRespondidos = simuladosRespondidos;
	}
}
