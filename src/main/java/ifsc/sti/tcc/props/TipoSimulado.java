package ifsc.sti.tcc.props;

public enum TipoSimulado {
	
	DEFAULT(0, "Miturado"),
	ENADE(1, "ENADE"),
	POSCOMP(2, "POSCOMP"),
	PERSONALIZADO(4, "Personalizado");

	TipoSimulado(int aCodigo, String descricao) {
		this.codigo = aCodigo;
		this.situacao = descricao;
	}
	
	public int codigo;
	public String situacao;
	
	public TipoSimulado getSituacao(int aCod) {
		for (TipoSimulado lSituacao :  TipoSimulado.values()) {
			if(lSituacao.codigo == aCod) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}
	
	public TipoSimulado getSituacao(String descricao) {
		for (TipoSimulado lSituacao :  TipoSimulado.values()) {
			if(lSituacao.situacao.equalsIgnoreCase(descricao)) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}
}
