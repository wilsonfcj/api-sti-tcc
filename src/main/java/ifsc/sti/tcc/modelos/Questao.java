package ifsc.sti.tcc.modelos;

import java.util.List;

public class Questao {

	// FIXME os tipos dos atributos
	private int id;
	private List<String> alternativas;
	private int correta;
	private String descricao;

	public Questao() {

	}

	public Questao(int id, List<String> alternativas, int correta, String descricao) {
		super();
		this.id = id;
		this.alternativas = alternativas;
		this.correta = correta;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getAlternativas() {
		return alternativas;
	}

	public void setAlternativas(List<String> alternativas) {
		this.alternativas = alternativas;
	}

	public int getCorreta() {
		return correta;
	}

	public void setCorreta(int correta) {
		this.correta = correta;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
