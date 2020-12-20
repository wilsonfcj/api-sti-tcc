package ifsc.sti.tcc.props;

public enum EFormacao {
	
	GERAL(1, "Formação Geral"),
	ESPECIFICA(2, "Formação Específica");

	EFormacao(int aCodigo, String descricao) {
		this.codigo = aCodigo;
		this.situacao = descricao;
	}
	
	public int codigo;
	public String situacao;
	
	public static EFormacao getEnum(int aCod) {
		for (EFormacao lSituacao :  EFormacao.values()) {
			if(lSituacao.codigo == aCod) {
				return lSituacao;
			}
		}
		return GERAL;
	}
	
	public static EFormacao getEnum(String descricao) {
		for (EFormacao lSituacao :  EFormacao.values()) {
			if(lSituacao.situacao.equalsIgnoreCase(descricao)) {
				return lSituacao;
			}
		}
		return GERAL;
	}
}
