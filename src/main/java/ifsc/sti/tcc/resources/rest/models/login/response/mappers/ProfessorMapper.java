package ifsc.sti.tcc.resources.rest.models.login.response.mappers;

import java.util.ArrayList;
import java.util.List;

import ifsc.sti.tcc.modelos.usuario.Professor;
import ifsc.sti.tcc.props.EDisciplina;
import ifsc.sti.tcc.props.EPerfilUsuario;
import ifsc.sti.tcc.resources.rest.mapers.MapperUtil;
import ifsc.sti.tcc.resources.rest.models.login.response.DisciplinaResponse;
import ifsc.sti.tcc.resources.rest.models.login.response.ProfessorResponse;

public class ProfessorMapper extends MapperUtil<Professor, ProfessorResponse> {

	@Override
	public ProfessorResponse transform(Professor aObject) {
		ProfessorResponse professorResponse = new ProfessorResponse();
		professorResponse.setId(aObject.getId());
		professorResponse.setCpf(aObject.getCpf());
		professorResponse.setEmail(aObject.getEmail());
		professorResponse.setFone(aObject.getFone());
		professorResponse.setImagemPerfil(aObject.getImagemPerfil());
		professorResponse.setNascimento(aObject.getNascimento());
		professorResponse.setNome(aObject.getNome());
		
		List<DisciplinaResponse> disciplinas = new ArrayList<DisciplinaResponse>();
		for (EDisciplina disciplina : aObject.getDisciplinas()) {
			disciplinas.add(new DisciplinaResponse(disciplina.codigo, disciplina.descricao));
		}
		professorResponse.setDisciplinas(disciplinas);
		professorResponse.setPerfilUsuario(EPerfilUsuario.PROFESSOR.codigo);
		return professorResponse;
	}
}