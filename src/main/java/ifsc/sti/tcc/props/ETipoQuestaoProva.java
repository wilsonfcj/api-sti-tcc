package ifsc.sti.tcc.props;

public enum ETipoQuestaoProva {
	
	ENADE(1, "ENADE"),
	POSCOMP(2, "POSCOMP");

	ETipoQuestaoProva(int aCodigo, String descricao) {
		this.codigo = aCodigo;
		this.descricao = descricao;
	}
	
	public int codigo;
	public String descricao;
	
	public static ETipoQuestaoProva getQuestao(int aCod) {
		for (ETipoQuestaoProva lSituacao :  ETipoQuestaoProva.values()) {
			if(lSituacao.codigo == aCod) {
				return lSituacao;
			}
		}
		return POSCOMP;
	}
	
	public static ETipoQuestaoProva getQuestao(String adescricao) {
		for (ETipoQuestaoProva lSituacao :  ETipoQuestaoProva.values()) {
			if(lSituacao.descricao.equalsIgnoreCase(adescricao)) {
				return lSituacao;
			}
		}
		return POSCOMP;
	}
	
	
}
