package ifsc.sti.tcc.modelos.questao;

public class QuestaoDiscusiva extends Questao {
	
	private String resposta;
	
	public QuestaoDiscusiva() {
		super();
	}

	public QuestaoDiscusiva(String resposta) {
		super();
		this.resposta = resposta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
}
