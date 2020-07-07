package ifsc.sti.tcc.modelos.resposta;

public class RespostaAlternativa extends Resposta {
	
	private String alternativa;
	
	public RespostaAlternativa() {
		super();
	}

	public RespostaAlternativa(String texto) {
		super();
		this.alternativa = texto;
	}
	
	public String getTexto() {
		return alternativa;
	}

	public void setTexto(String texto) {
		this.alternativa = texto;
	}

}
