package ifsc.sti.tcc.props;

public enum EResposta {
	
	DEFAULT(0, "Indefinda"),
	MATEMATICA(1, "Matemática"),
	FUNDAMENTOS_DE_COMPUTACAO(2, "Fundamentos de Computação"),
	TECNOLOGIA_DA_COMPUTACAO(3, "Tecnologia da Computação");

	EResposta(int aCodigo, String descricao) {
		this.codigo = aCodigo;
		this.situacao = descricao;
	}
	
	public int codigo;
	public String situacao;
	
	public static EResposta getArea(int aCod) {
		for (EResposta lSituacao :  EResposta.values()) {
			if(lSituacao.codigo == aCod) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}
	
	public static EResposta getArea(String descricao) {
		for (EResposta lSituacao :  EResposta.values()) {
			if(lSituacao.situacao.equalsIgnoreCase(descricao)) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}
}
