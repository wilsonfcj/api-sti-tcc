package ifsc.sti.tcc.resources.rest.models.resultado.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import ifsc.sti.tcc.resources.rest.models.resultado.base.ResultadoDisciplinaQuantitativo;
import ifsc.sti.tcc.resources.rest.models.resultado.base.ResultadoSimuladoBase;

public class ResultadoSimuladoSalaGeralResponse extends ResultadoSimuladoBase {
	
	@JsonProperty(value="IdSimulado")
	private Long idSimulado;
	
	@JsonProperty(value="Nome")
	private String nome;
	
	@JsonProperty(value="Descrição")
	private String descrição;
	
	@JsonProperty(value="TipoSimulado")
	private Integer tipoSimulado;
	
	@JsonProperty(value="QtdRespostas")
	private Integer qtdRespostas;
	
	@JsonProperty(value="QtdAlunos")
	private Integer qtdAlunos;
	
	@JsonProperty(value="ResultadoDisciplinas")
	private List<ResultadoDisciplinaQuantitativo> disciplinas;
	
	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Integer getTipoSimulado() {
		return tipoSimulado;
	}

	public void setTipoSimulado(Integer tipoSimulado) {
		this.tipoSimulado = tipoSimulado;
	}

	public Long getIdSimulado() {
		return idSimulado;
	}

	public void setIdSimulado(Long idSimulado) {
		this.idSimulado = idSimulado;
	}

	public List<ResultadoDisciplinaQuantitativo> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<ResultadoDisciplinaQuantitativo> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Integer getQtdRespostas() {
		return qtdRespostas;
	}

	public void setQtdRespostas(Integer qtdRespostas) {
		this.qtdRespostas = qtdRespostas;
	}

	public Integer getQtdAlunos() {
		return qtdAlunos;
	}

	public void setQtdAlunos(Integer qtdAlunos) {
		this.qtdAlunos = qtdAlunos;
	}
}
