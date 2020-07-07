package ifsc.sti.tcc.props;

public enum EDificuldade {
	
	FACIL(0, "Não Informado"),
	MUITO_FACIL(1, "Não Informado"),
	MEDIA(2, "Não Informado"),
	DIFICIL(3, "Não Informado"),
	MUITO_DIFICIL(4, "ENADE");

	EDificuldade(int aCodigo, String descricao) {
		this.codigo = aCodigo;
		this.descricao = descricao;
	}
	
	public int codigo;
	public String descricao;
	
	public EDificuldade getSituacao(int aCod) {
		for (EDificuldade lSituacao :  EDificuldade.values()) {
			if(lSituacao.codigo == aCod) {
				return lSituacao;
			}
		}
		return FACIL;
	}
	
	public EDificuldade getSituacao(String adescricao) {
		for (EDificuldade lSituacao :  EDificuldade.values()) {
			if(lSituacao.descricao.equalsIgnoreCase(adescricao)) {
				return lSituacao;
			}
		}
		return FACIL;
	}
}
