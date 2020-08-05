package ifsc.sti.tcc.resources.rest.models.usuario.mappers;

import java.util.ArrayList;
import java.util.List;

import ifsc.sti.tcc.modelos.usuario.Professor;
import ifsc.sti.tcc.props.EPerfilUsuario;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.DisciplinaResponse;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.ProfessorResponse;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class ProfessorMapper extends MapperUtil<Professor, ProfessorResponse> {

	@Override
	public ProfessorResponse transform(Professor aObject) {
		ProfessorResponse professorResponse = new ProfessorResponse();
		professorResponse.setId(aObject.getId());
		professorResponse.setCpf(aObject.getCpf());
		professorResponse.setEmail(aObject.getEmail());
		professorResponse.setFone(aObject.getFone());
		professorResponse.setNascimento(aObject.getNascimento());
		professorResponse.setNome(aObject.getNome());
		professorResponse.setInstituicao(aObject.getInstituicao());
		
		List<DisciplinaResponse> disciplinas = new ArrayList<DisciplinaResponse>();
		professorResponse.setDisciplinas(disciplinas);
		professorResponse.setPerfilUsuario(EPerfilUsuario.PROFESSOR.codigo);
		return professorResponse;
	}
}