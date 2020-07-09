package ifsc.sti.tcc.props;

public enum EPerfilUsuario {
	
	ALUNO(1, "Aluno"),
	PROFESSOR(2, "Professor");

	EPerfilUsuario(int aCodigo, String descricao) {
		this.codigo = aCodigo;
		this.situacao = descricao;
	}
	
	public int codigo;
	public String situacao;
	
	public EPerfilUsuario getSituacao(int aCod) {
		for (EPerfilUsuario lSituacao :  EPerfilUsuario.values()) {
			if(lSituacao.codigo == aCod) {
				return lSituacao;
			}
		}
		return ALUNO;
	}
	
	public EPerfilUsuario getSituacao(String descricao) {
		for (EPerfilUsuario lSituacao :  EPerfilUsuario.values()) {
			if(lSituacao.situacao.equalsIgnoreCase(descricao)) {
				return lSituacao;
			}
		}
		return ALUNO;
	}
}
