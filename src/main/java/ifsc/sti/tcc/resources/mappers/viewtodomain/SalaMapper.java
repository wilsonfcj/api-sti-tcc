package ifsc.sti.tcc.resources.mappers.viewtodomain;

import java.util.Date;

import ifsc.sti.tcc.modelos.simulado.Sala;
import ifsc.sti.tcc.resources.rest.models.sala.request.SalaRequest;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class SalaMapper extends  MapperUtil<SalaRequest, Sala> {

	@Override
	public Sala transform(SalaRequest aObject) {
		Sala sala = new Sala();
		sala.setNome(aObject.getNome());
		sala.setSenha(aObject.getSenha());
		sala.setDescricao(aObject.getDescricao());
		sala.setDataCriacao(new Date());
		sala.setMaxParticipantes(aObject.getQtdParticipantes());
		return sala;
	}

}
