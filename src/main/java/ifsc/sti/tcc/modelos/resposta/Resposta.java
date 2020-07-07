package ifsc.sti.tcc.modelos.resposta;

public abstract class Resposta {
	
	private Long id;
	private Long idAluno;
	private Long idQuestao;
	private Long idSimulado;
	private Boolean correta;
	
	public Resposta() {
		super();
	}
	
	public Resposta(Long id, Long idAluno, Long idQuestao, Long idSimulado, Boolean correta) {
		super();
		this.id = id;
		this.idAluno = idAluno;
		this.idQuestao = idQuestao;
		this.idSimulado = idSimulado;
		this.correta = correta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdAluno() {
		return idAluno;
	}

	public void setIdAluno(Long idAluno) {
		this.idAluno = idAluno;
	}

	public Long getIdQuestao() {
		return idQuestao;
	}

	public void setIdQuestao(Long idQuestao) {
		this.idQuestao = idQuestao;
	}

	public Long getIdSimulado() {
		return idSimulado;
	}

	public void setIdSimulado(Long idSimulado) {
		this.idSimulado = idSimulado;
	}

	public Boolean getCorreta() {
		return correta;
	}

	public void setCorreta(Boolean correta) {
		this.correta = correta;
	}
	
	
	
}
