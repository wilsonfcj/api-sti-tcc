package ifsc.sti.tcc.resources.mappers.domaintoview;

import ifsc.sti.tcc.modelos.simulado.Sala;
import ifsc.sti.tcc.resources.rest.models.sala.ProfessorResponse;
import ifsc.sti.tcc.resources.rest.models.sala.SalaResponse;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class SalaResponseMapper extends  MapperUtil<Sala, SalaResponse> {

	@Override
	public SalaResponse transform(Sala aObject) {
		SalaResponse sala = new SalaResponse();
		sala.setId(aObject.getId());
		sala.setNome(aObject.getNome());
		sala.setSenha(aObject.getSenha());
		sala.setProfessor(new ProfessorResponse(aObject.getUsuario().getId(),
				aObject.getUsuario().getNome()));
		sala.setDescricao(aObject.getDescricao());
		sala.setDataCriacao(aObject.getDataCriacao());
		sala.setMaxParticipantes(aObject.getMaxParticipantes());
		return sala;
	}

}
