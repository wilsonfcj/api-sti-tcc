package ifsc.sti.tcc.modelos.simulado;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import ifsc.sti.tcc.modelos.intituicao.Instituicao;
import ifsc.sti.tcc.modelos.usuario.Usuario;

@Entity
@Table(name = "sala")
public class Sala {

	@Id
	@Column(name = "id_simulado")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String senha;
	
	private String descricao;
	
	private Date dataCriacao;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_instituicao")
	private Instituicao instituicao;
	
	private Integer maxParticipantes;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_aluno")
	private List<Usuario> alunos;

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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Usuario> alunos) {
		this.alunos = alunos;
	}

	public Instituicao getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(Instituicao instituicao) {
		this.instituicao = instituicao;
	}

	public Integer getMaxParticipantes() {
		return maxParticipantes;
	}

	public void setMaxParticipantes(Integer maxParticipantes) {
		this.maxParticipantes = maxParticipantes;
	}
	
	
	
}
