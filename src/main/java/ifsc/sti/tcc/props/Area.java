package ifsc.sti.tcc.props;

public enum Area {
	
	DEFAULT(0, "Indefinda"),
	MATEMATICA(1, "Matemática"),
	FUNDAMENTOS_DE_COMPUTACAO(2, "Fundamentos de Computação"),
	TECNOLOGIA_DA_COMPUTACAO(3, "Tecnologia da Computação");

	Area(int aCodigo, String descricao) {
		this.codigo = aCodigo;
		this.situacao = descricao;
	}
	
	public int codigo;
	public String situacao;
	
	public Area getSituacao(int aCod) {
		for (Area lSituacao :  Area.values()) {
			if(lSituacao.codigo == aCod) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}
	
	public Area getSituacao(String descricao) {
		for (Area lSituacao :  Area.values()) {
			if(lSituacao.situacao.equalsIgnoreCase(descricao)) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}
}
