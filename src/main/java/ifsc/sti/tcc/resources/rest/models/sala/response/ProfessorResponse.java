package ifsc.sti.tcc.resources.rest.models.sala.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfessorResponse {
	
	@JsonProperty(value="Id")
	private Long id;
	
	@JsonProperty(value="Nome")
	private String nome;
	
	public ProfessorResponse() {
		super();
	}

	public ProfessorResponse(Long id, String nome) {
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
