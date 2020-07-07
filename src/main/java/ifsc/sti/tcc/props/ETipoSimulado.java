package ifsc.sti.tcc.props;

public enum ETipoSimulado {
	
	DEFAULT(0, "Personalizado"),
	ENADE(1, "ENADE"),
	POSCOMP(2, "POSCOMP");
	
	ETipoSimulado(int aCodigo, String descricao) {
		this.codigo = aCodigo;
		this.situacao = descricao;
	}
	
	public int codigo;
	public String situacao;
	
	public ETipoSimulado getSituacao(int aCod) {
		for (ETipoSimulado lSituacao :  ETipoSimulado.values()) {
			if(lSituacao.codigo == aCod) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}
	
	public ETipoSimulado getSituacao(String descricao) {
		for (ETipoSimulado lSituacao :  ETipoSimulado.values()) {
			if(lSituacao.situacao.equalsIgnoreCase(descricao)) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}
}
