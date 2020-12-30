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

import ifsc.sti.tcc.modelos.questao.Questao;
import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.props.ETipoSimulado;

@Entity
@Table(name = "simulado")
public class Simulado {

	@Id
	@Column(name = "id_simulado")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	
	private Date dataInicio;
	private Date dataCriacao;
	private Date dataFimSimulado;
	
	private Long tempoMaximo;
	private Integer quantidadeQuestoes;
	private Integer tipoSimulado;
	
	@Column(columnDefinition="TEXT")
	private String descricao;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario")
	private Usuario idUsuario;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_simulado")
	private List<Questao> questoes;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_sala")
	private Sala sala;
	
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
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Date getDataInicio() {
		return dataInicio;
	}
	
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	
	public Date getDataCriacao() {
		return dataCriacao;
	}
	
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
	public Date getDataFimSimulado() {
		return dataFimSimulado;
	}
	
	public void setDataFimSimulado(Date dataFimSimulado) {
		this.dataFimSimulado = dataFimSimulado;
	}
	
	public Long getTempoMaximo() {
		return tempoMaximo;
	}
	
	public void setTempoMaximo(Long tempoMaximo) {
		this.tempoMaximo = tempoMaximo;
	}
	
	public Usuario getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(Usuario idProfessor) {
		this.idUsuario = idProfessor;
	}
	
	public Integer getQuantidadeQuestoes() {
		return quantidadeQuestoes;
	}
	
	public void setQuantidadeQuestoes(Integer quantidadeQuestoes) {
		this.quantidadeQuestoes = quantidadeQuestoes;
	}
	
	public ETipoSimulado getTipoSimulado() {
		return ETipoSimulado.getEnun(tipoSimulado);
	}
	
	public void setTipoSimulado(ETipoSimulado tipoSimulado) {
		this.tipoSimulado = tipoSimulado.codigo;
	}
	
	public List<Questao> getQuestoes() {
		return questoes;
	}
	
	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public void setTipoSimulado(Integer tipoSimulado) {
		this.tipoSimulado = tipoSimulado;
	}
}
