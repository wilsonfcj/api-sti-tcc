package ifsc.sti.tcc.modelos.usuario;

import java.util.Date;

public class Usuario {

	private Long id;
	private String cpf;
	private Date nascimento;
	private String nome;
	private String email;
	private String fone;	
	private String senha;
	private String instituicao;
	private Imagem imagemPerfil;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public Date getNascimento() {
		return nascimento;
	}
	
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFone() {
		return fone;
	}
	
	public void setFone(String fone) {
		this.fone = fone;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getInstituicao() {
		return instituicao;
	}
	
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	
	public Imagem getImagemPerfil() {
		return imagemPerfil;
	}
	
	public void setImagemPerfil(Imagem imagemPerfil) {
		this.imagemPerfil = imagemPerfil;
	}
	
}
