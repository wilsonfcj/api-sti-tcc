package ifsc.sti.tcc.modelos;

public class Sala {

	// FIXME verificar se precisa do atributo com a lista das questões
	private int id;
	private String nome;
	private String descricao;
	private String senha;

	public Sala() {

	}

	public Sala(int id, String nome, String descricao, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
