package ifsc.sti.tcc.resources.rest.models.usuario.cadastro;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import ifsc.sti.tcc.props.EPerfilUsuario;
import ifsc.sti.tcc.utilidades.ValidateUtil;
import ifsc.sti.tcc.utilidades.ValidatedField;

public class UsuarioRequest {

	@JsonProperty(value = "CPF")
	private String cpf;

	@JsonProperty(value = "Nascimento")
	private Date nascimento;

	@JsonProperty(value = "Nome")
	private String nome;

	@JsonProperty(value = "Email")
	private String email;

	@JsonProperty(value = "Telefone")
	private String fone;

	@JsonProperty(value = "Instituicao")
	private String instituicao;

	@JsonProperty(value = "ImagemUsuario")
	private String imagemPerfil;

	@JsonProperty(value = "TipoUsuario")
	private Integer perfilUsuario;
	
	@JsonProperty(value="Matricula")
	private Long matricula;
	
	@JsonProperty(value="AnoIngresso")
	private Integer anoIngresso;
	
	@JsonProperty(value="DisciplinasInteressadas")
	private List<Integer> disciplinas;
	
	@JsonProperty(value = "Senha")
	private String senha;

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

	public String getImagemPerfil() {
		return imagemPerfil;
	}

	public void setImagemPerfil(String imagemPerfil) {
		this.imagemPerfil = imagemPerfil;
	}

	public Integer getPerfilUsuario() {
		return perfilUsuario;
	}

	public void setPerfilUsuario(Integer perfilUsuario) {
		this.perfilUsuario = perfilUsuario;
	}

	public Long getMatricula() {
		return matricula;
	}

	public void setMatricula(Long matricula) {
		this.matricula = matricula;
	}

	public Integer getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(Integer anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public List<Integer> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Integer> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean cpfValido() {
		return ValidateUtil.isCPF(ValidateUtil.unmask(cpf));
	}

	public int nomeValido() {
		return ValidateUtil.validateString(nome, 200);
	}

	public int emailValido() {
		return ValidateUtil.validateStringWithRegex(email, 200, ValidateUtil.REGEX_EMAIL);
	}

	public int foneValido() {
		return ValidateUtil.validateCelular(fone);
	}

	public int instituicaoValida() {
		return ValidateUtil.validateString(instituicao, 200);
	}

	public ValidatedField validarCampos() {
		ValidatedField validatedField;
		if (!cpfValido()) {
			validatedField = new ValidatedField("CPF Inválido", false);
			return validatedField;
		}

		switch (nomeValido()) {
		case ValidateUtil.STRING_LONGA:
			return new ValidatedField("Nome deve conter no máximo 200 caracteres", false);
		case ValidateUtil.STRING_VAZIA:
			return new ValidatedField("Informe um nome válido", false);
		}

		switch (foneValido()) {
		case ValidateUtil.STRING_LONGA:
			return new ValidatedField("O telefone deve conter no máximo 14 caracteres", false);
		case ValidateUtil.STRING_INVALIDA:
			return new ValidatedField("Número de celular inválido", false);
		}
		
		switch (instituicaoValida()) {
		case ValidateUtil.STRING_LONGA:
			return new ValidatedField("O nome da instituição deve conter no máximo 200 caracteres", false);
		case ValidateUtil.STRING_VAZIA:
			return new ValidatedField("Informe o nome da instituição", false);
		}
		
		if(EPerfilUsuario.ALUNO.codigo == perfilUsuario) {
			if(matricula == null) {
				return new ValidatedField("Informe a matricula", false);
			}
			
			if(matricula <= 0) {
				return new ValidatedField("Informe uma matricula válida", false);
			}
		
			if(anoIngresso == null) {
				return new ValidatedField("Informe o ano ingresso", false);
			}
			
			if(anoIngresso <= 1990) {
				return new ValidatedField("Informe o ano em que você ingressou no curso", false);
			}
		} else {
			if(disciplinas == null) {
				return new ValidatedField("Informe pelo menos uma disciplina de interesse", false);
			}
		}
		
		return new ValidatedField("Campos informados com sucesso", true);
	}
}
