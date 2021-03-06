package ifsc.sti.tcc.props;

public enum ETipoQuestao {
	
	DEFAULT(0, "Não Informado"),
	ENADE(1, "ENADE"),
	POSCOMP(2, "POSCOMP");

	ETipoQuestao(int aCodigo, String descricao) {
		this.codigo = aCodigo;
		this.descricao = descricao;
	}
	
	public int codigo;
	public String descricao;
	
	public ETipoQuestao getSituacao(int aCod) {
		for (ETipoQuestao lSituacao :  ETipoQuestao.values()) {
			if(lSituacao.codigo == aCod) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}
	
	public ETipoQuestao getSituacao(String adescricao) {
		for (ETipoQuestao lSituacao :  ETipoQuestao.values()) {
			if(lSituacao.descricao.equalsIgnoreCase(adescricao)) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}
}
