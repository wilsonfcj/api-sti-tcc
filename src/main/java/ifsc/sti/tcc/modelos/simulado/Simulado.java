package ifsc.sti.tcc.modelos.simulado;

import java.util.Date;
import java.util.List;

import ifsc.sti.tcc.modelos.questao.Questao;
import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.props.TipoSimulado;

public class Simulado {

	private Integer id;
	private String nome;
	private Date dataFim;
	private Date dataInicio;
	private Date dataCriacao;
	private Usuario criador;
	private String descricao;
	private List<Questao> questoes;
	private TipoSimulado tipoSimulado;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataFim() {
		return dataFim;
	}
	
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
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
	
	public Usuario getCriador() {
		return criador;
	}
	
	public void setCriador(Usuario criador) {
		this.criador = criador;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public List<Questao> getQuestoes() {
		return questoes;
	}
	
	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}
	
	public TipoSimulado getTipoSimulado() {
		return tipoSimulado;
	}
	
	public void setTipoSimulado(TipoSimulado tipoSimulado) {
		this.tipoSimulado = tipoSimulado;
	}
	
	
	
	
	
	
}
