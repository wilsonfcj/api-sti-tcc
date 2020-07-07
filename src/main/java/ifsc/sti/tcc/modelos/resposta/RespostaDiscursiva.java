package ifsc.sti.tcc.modelos.resposta;

public class RespostaDiscursiva extends Resposta {
	
	private String texto;
	
	public RespostaDiscursiva() {
		super();
	}

	public RespostaDiscursiva(String texto) {
		super();
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
