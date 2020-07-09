package ifsc.sti.tcc.resources.rest.models.login.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import ifsc.sti.tcc.modelos.usuario.Imagem;

public abstract class UsuarioBaseResponse {
	
	@JsonProperty(value="IdUsuario")
	private Long id;
	
	@JsonProperty(value="CPF")
	private String cpf;
	
	@JsonProperty(value="Nascimento")
	private Date nascimento;
	
	@JsonProperty(value="Nome")
	private String nome;
	
	@JsonProperty(value="Email")
	private String email;
	
	@JsonProperty(value="Telefone")
	private String fone;
	
	@JsonProperty(value="Instituicao")
	private String instituicao;
	
	@JsonProperty(value="ImagemUsuario")
	private Imagem imagemPerfil;
	
	@JsonProperty(value="TipoUsuario")
	private Integer perfilUsuario;
	
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

	public Integer getPerfilUsuario() {
		return perfilUsuario;
	}

	public void setPerfilUsuario(Integer perfilUsuario) {
		this.perfilUsuario = perfilUsuario;
	}
}
