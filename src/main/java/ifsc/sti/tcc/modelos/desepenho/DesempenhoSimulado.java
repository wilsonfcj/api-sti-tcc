package ifsc.sti.tcc.modelos.desepenho;

import java.util.List;

public class DesempenhoSimulado {
	
	private Long idSimulado;
	private Long idUsuario;
	private List<DesempenhoArea> desempenhoPorArea;
	private List<DesempenhoDisciplina> desempenhoDisciplina;
	
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
	
	public List<DesempenhoArea> getDesempenhoPorArea() {
		return desempenhoPorArea;
	}
	
	public void setDesempenhoPorArea(List<DesempenhoArea> desempenhoPorArea) {
		this.desempenhoPorArea = desempenhoPorArea;
	}
	
	public List<DesempenhoDisciplina> getDesempenhoDisciplina() {
		return desempenhoDisciplina;
	}
	
	public void setDesempenhoDisciplina(List<DesempenhoDisciplina> desempenhoDisciplina) {
		this.desempenhoDisciplina = desempenhoDisciplina;
	}
}
