package ifsc.sti.tcc.props;

public enum EArea {
	
	DEFAULT(0, "Indefinda"),
	MATEMATICA(1, "Matemática"),
	FUNDAMENTOS_DE_COMPUTACAO(2, "Fundamentos de Computação"),
	TECNOLOGIA_DA_COMPUTACAO(3, "Tecnologia da Computação");

	EArea(int aCodigo, String descricao) {
		this.codigo = aCodigo;
		this.situacao = descricao;
	}
	
	public int codigo;
	public String situacao;
	
	public static EArea getArea(int aCod) {
		for (EArea lSituacao :  EArea.values()) {
			if(lSituacao.codigo == aCod) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}
	
	public static EArea getArea(String descricao) {
		for (EArea lSituacao :  EArea.values()) {
			if(lSituacao.situacao.equalsIgnoreCase(descricao)) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}
}
