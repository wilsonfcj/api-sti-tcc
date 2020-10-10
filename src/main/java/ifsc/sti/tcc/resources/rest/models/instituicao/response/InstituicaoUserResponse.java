package ifsc.sti.tcc.resources.rest.models.instituicao.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InstituicaoUserResponse {
	
	@JsonProperty(value="Id")
	private Long id;
	@JsonProperty(value="Nome")
	private String nome;
	
	public InstituicaoUserResponse() {
		super();
	}
	public InstituicaoUserResponse(Long id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

}
