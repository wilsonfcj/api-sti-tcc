package ifsc.sti.tcc.resources.rest.models.instituicao.request;

public class InstituicaoRequest {
	
	private String nome;
	private String cidade;
	private String uf;
	
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
