package ifsc.sti.tcc.resources.rest.models.usuario.login.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import ifsc.sti.tcc.modelos.disciplina.DisciplinaInteresse;
import ifsc.sti.tcc.resources.rest.models.usuario.mappers.DisciplinaMapper;

public class DisciplinaResponse {

	@JsonProperty(value="Codigo")
	private Integer id;
	
	@JsonProperty(value="Nome")
	private String nome;
	
	public DisciplinaResponse() {
		super();
	}

	public DisciplinaResponse(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public static List<DisciplinaResponse> convertDisciplinas(final List<DisciplinaInteresse> disciplinaInteresses) {
		return new DisciplinaMapper().transform(disciplinaInteresses);
	}
}
