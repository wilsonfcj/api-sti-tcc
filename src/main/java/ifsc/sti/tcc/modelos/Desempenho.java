package ifsc.sti.tcc.modelos;

public class Desempenho {

	private int id;
	private int acertos;
	private int erros;
	// FIXME o tipo do atributo respondidas
	private int respondidas;

	public Desempenho() {
		
	}

	public Desempenho(int id, int acertos, int erros, int respondidas) {
		super();
		this.id = id;
		this.acertos = acertos;
		this.erros = erros;
		this.respondidas = respondidas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAcertos() {
		return acertos;
	}

	public void setAcertos(int acertos) {
		this.acertos = acertos;
	}

	public int getErros() {
		return erros;
	}

	public void setErros(int erros) {
		this.erros = erros;
	}

	public int getRespondidas() {
		return respondidas;
	}

	public void setRespondidas(int respondidas) {
		this.respondidas = respondidas;
	}

}
