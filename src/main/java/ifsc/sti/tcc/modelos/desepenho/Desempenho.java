package ifsc.sti.tcc.modelos.desepenho;

public abstract class Desempenho {
	
	private Long id;
	private Integer totalErros;
	private Integer totalAcertos;
	private Integer totalRespondidas;
	private Integer totalQuestaoes;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Integer getTotalErros() {
		return totalErros;
	}
	
	public void setTotalErros(Integer totalErros) {
		this.totalErros = totalErros;
	}
	
	public Integer getTotalAcertos() {
		return totalAcertos;
	}
	
	public void setTotalAcertos(Integer totalAcertos) {
		this.totalAcertos = totalAcertos;
	}
	
	public Integer getTotalRespondidas() {
		return totalRespondidas;
	}
	
	public void setTotalRespondidas(Integer totalRespondidas) {
		this.totalRespondidas = totalRespondidas;
	}
	
	public Integer getTotalQuestaoes() {
		return totalQuestaoes;
	}
	
	public void setTotalQuestaoes(Integer totalQuestaoes) {
		this.totalQuestaoes = totalQuestaoes;
	}
	
	
	
}
