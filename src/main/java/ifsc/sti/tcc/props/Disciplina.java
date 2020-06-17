package ifsc.sti.tcc.props;

public enum Disciplina {
	
	/*DEFAULT(-1, "Situação não cadastrada"),
	CADSTRO_EM_ANDAMENTO(0,"Cadastro em andamento"),
	SUBMETIDO(1,"Submetido"),
	CADASTRADO(2,"Cadastrado"),
	DISTRIBUIDO_PARA_AVALIACAO_AUTOMATICAMENTE(3,"Distribuído para avaliação (Automaticamente)"),
	AVALIAÇAO_INSUFICIENTE(4,"Avaliação insuficiente"),
	DISTRIBUIDO_PARA_AVALIACAO_MANUALEMTE(5,"Distribuído para avaliação (Manualmente)"),
	APROVADO(6,"Aprovado"),
	EM_EXECUCAO(7,"Em execução"),
	FINALIZADO_RENOVADO(8,"Finalizado (Renovado)"),
	FINALIZADO(9,"Finalizado"),
	REPROVADO(10,"Reprovado"),
	DESATIVADO(11,"Desativado"),
	EXCLUIDO(12,"Excluído"),
	FINALIZADO_COM_PENDENCIAS(13,"Finalizado com Pendências");

	Disciplina(int aCodigo, String aSituacao) {
		this.codigo = aCodigo;
		this.situacao = aSituacao;
	}
	
	public int codigo;
	public String situacao;
	
	public Disciplina getSituacao(int aCod) {
		for (Disciplina lSituacao :  Disciplina.values()) {
			if(lSituacao.codigo == aCod) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}
	
	public Disciplina getSituacao(String aSituacao) {
		for (Disciplina lSituacao :  Disciplina.values()) {
			if(lSituacao.situacao.equalsIgnoreCase(aSituacao)) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}*/
}
