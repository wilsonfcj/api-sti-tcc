package ifsc.sti.tcc.resources.rest.models.instituicao.response;

public class InstituicaoResponse {
	
	private Long id;
	private String nome;
	private String cidade;
	private String uf;
	
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

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUF() {
		return uf;
	}

	public void setUF(String uF) {
		this.uf = uF;
	}
}
