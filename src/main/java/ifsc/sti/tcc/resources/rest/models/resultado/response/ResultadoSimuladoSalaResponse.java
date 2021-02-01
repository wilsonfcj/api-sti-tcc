package ifsc.sti.tcc.resources.rest.models.resultado.response;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import ifsc.sti.tcc.resources.rest.models.resultado.base.ResultadoDisciplinaQuantitativo;
import ifsc.sti.tcc.resources.rest.models.resultado.base.ResultadoSimuladoBase;

public class ResultadoSimuladoSalaResponse extends ResultadoSimuladoBase {
	
	@JsonProperty(value="IdUsuario")
	private Long idUsuario;
	
	@JsonProperty(value="IdSimulado")
	private Long idSimulado;
	
	@JsonProperty(value="Nome")
	private String nome;
	
	@JsonProperty(value="DataEnvio")
	private Date dataEnvio;
	
	@JsonProperty(value="TipoSimulado")
	private Integer tipoSimulado;
	
	@JsonProperty(value="ResultadoDisciplinas")
	private List<ResultadoDisciplinaQuantitativo> disciplinas;
	
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
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
	
}
