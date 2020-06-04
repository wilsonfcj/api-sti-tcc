package ifsc.sti.tcc.modelos;

import java.util.Date;
import java.util.List;

public class Simulado {

	private int id;
	private String nome;
	private Date data;
	private String descricao;
	private List<Questao> questoes;

	public Simulado() {
	}

	public Simulado(int id, String nome, Date data, String descricao, List<Questao> questoes) {
		super();
		this.id = id;
		this.nome = nome;
		this.data = data;
		this.descricao = descricao;
		this.questoes = questoes;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
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

}
