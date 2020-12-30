package ifsc.sti.tcc.resources.mappers.domaintoview;

import java.util.ArrayList;
import java.util.List;

import ifsc.sti.tcc.modelos.simulado.Sala;
import ifsc.sti.tcc.modelos.usuario.Aluno;
import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.resources.rest.models.sala.ProfessorResponse;
import ifsc.sti.tcc.resources.rest.models.sala.SalaProfessorResponse;
import ifsc.sti.tcc.resources.rest.models.sala.SalaResponse;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class SalaResponseMapper extends  MapperUtil<Sala, SalaResponse> {

	@Override
	public SalaResponse transform(Sala aObject) {
		SalaResponse sala = new SalaResponse();
		sala.setId(aObject.getId());
		sala.setNome(aObject.getNome());
		
		sala.setProfessor(new ProfessorResponse(aObject.getUsuario().getId(),
				aObject.getUsuario().getNome()));
		sala.setDescricao(aObject.getDescricao());
		sala.setDataCriacao(aObject.getDataCriacao());
		sala.setMaxParticipantes(aObject.getMaxParticipantes());
		if(aObject.getAlunos() != null) {
			sala.setQtdParticipantes(aObject.getAlunos().size());
		}
		return sala;
	}
	
	public SalaResponse transform(Sala aObject, Usuario usuario) {
		SalaResponse sala = transform(aObject);
		if(usuario instanceof Aluno) {
			if(aObject.getAlunos().contains(usuario))
				sala.setParticipando(true);
			return sala;
		} else {
			SalaProfessorResponse salaProfessorResponse;
			salaProfessorResponse = (SalaProfessorResponse) sala;
			salaProfessorResponse.setSenha(aObject.getSenha());
			salaProfessorResponse.setParticipando(true);
			return sala;
		}
		
	}
	

	public List<SalaResponse> transform(List<Sala> aFromList, Usuario usuario) {
        List<SalaResponse> lList = new ArrayList<>();
        for (Sala lFrom : aFromList) {
            lList.add(transform(lFrom, usuario));
        }
        return lList;
    }
}
