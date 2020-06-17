package ifsc.sti.tcc.modelos.simulado;

public class Desempenho {

	private Long id;
	private Long idSimulado;
	private Long idUsuario;
	private Integer acertos;
	private Integer erros;
	private Integer respondidas;
	private Integer total;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getIdSimulado() {
		return idSimulado;
	}
	
	public void setIdSimulado(Long idSimulado) {
		this.idSimulado = idSimulado;
	}
	
	public Long getIdUsuario() {
		return idUsuario;
	}
	
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	public Integer getAcertos() {
		return acertos;
	}
	
	public void setAcertos(Integer acertos) {
		this.acertos = acertos;
	}
	
	public Integer getErros() {
		return erros;
	}
	public void setErros(Integer erros) {
		this.erros = erros;
	}
	
	public Integer getRespondidas() {
		return respondidas;
	}
	
	public void setRespondidas(Integer respondidas) {
		this.respondidas = respondidas;
	}
	
	public Integer getTotal() {
		return total;
	}
	
	public void setTotal(Integer total) {
		this.total = total;
	}
}
