package ifsc.sti.tcc.resources.rest.models.resultado.base;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResultadoDisciplinaQuantitativo {
	
	@JsonProperty(value="Disciplina")
	Integer disciplina;
	
	@JsonProperty(value="DisciplinaNome")
	String nomeDisciplina; 
	
	@JsonProperty(value="Erros")
	Integer erros = 0; 
	
	@JsonProperty(value="Acertos")
	Integer acertos = 0;
	
	@JsonProperty(value="NaoRespondidas")
	Integer naoRespondidas = 0;
	
	@JsonProperty(value="TotalQuestao")
	Integer total;
	
	public Integer getErros() {
		return erros;
	}

	public void setErros(Integer erros) {
		this.erros = erros;
	}

	public Integer getAcertos() {
		return acertos;
	}

	public void setAcertos(Integer acertos) {
		this.acertos = acertos;
	}

	public Integer getNaoRespondidas() {
		return naoRespondidas;
	}

	public void setNaoRespondidas(Integer naoRespondidas) {
		this.naoRespondidas = naoRespondidas;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}
	
	public void addErros(Integer valor) {
		this.erros += valor;
	}
	
	public void addAcertos(Integer valor) {
		this.acertos += valor;
	}
	
	public void addNaoRespondidas(Integer valor) {
		this.naoRespondidas += valor;
	}

	public Integer getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Integer disciplina) {
		this.disciplina = disciplina;
	}

	public String getNomeDisciplina() {
		return nomeDisciplina;
	}

	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
}
