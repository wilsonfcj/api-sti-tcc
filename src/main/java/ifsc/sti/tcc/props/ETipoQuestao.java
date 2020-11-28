package ifsc.sti.tcc.props;

public enum ETipoQuestao {
	
	ALTERNATIVA(1, "Alternativa"),
	DISCURSIVA(2, "Discursiva");

	ETipoQuestao(int aCodigo, String descricao) {
		this.codigo = aCodigo;
		this.descricao = descricao;
	}
	
	public int codigo;
	public String descricao;
	
	public static ETipoQuestao getQuestao(int aCod) {
		for (ETipoQuestao lSituacao :  ETipoQuestao.values()) {
			if(lSituacao.codigo == aCod) {
				return lSituacao;
			}
		}
		return ALTERNATIVA;
	}
	
	public static ETipoQuestao getQuestao(String adescricao) {
		for (ETipoQuestao lSituacao :  ETipoQuestao.values()) {
			if(lSituacao.descricao.equalsIgnoreCase(adescricao)) {
				return lSituacao;
			}
		}
		return ALTERNATIVA;
	}
}
