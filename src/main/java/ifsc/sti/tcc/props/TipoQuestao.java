package ifsc.sti.tcc.props;

public enum TipoQuestao {
	
	DEFAULT(0, "Não Informado"),
	ENADE(1, "ENADE"),
	POSCOMP(2, "POSCOMP");

	TipoQuestao(int aCodigo, String descricao) {
		this.codigo = aCodigo;
		this.descricao = descricao;
	}
	
	public int codigo;
	public String descricao;
	
	public TipoQuestao getSituacao(int aCod) {
		for (TipoQuestao lSituacao :  TipoQuestao.values()) {
			if(lSituacao.codigo == aCod) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}
	
	public TipoQuestao getSituacao(String adescricao) {
		for (TipoQuestao lSituacao :  TipoQuestao.values()) {
			if(lSituacao.descricao.equalsIgnoreCase(adescricao)) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}
}
