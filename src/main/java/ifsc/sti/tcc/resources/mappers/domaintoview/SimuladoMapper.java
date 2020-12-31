package ifsc.sti.tcc.resources.mappers.domaintoview;

import ifsc.sti.tcc.modelos.simulado.Simulado;
import ifsc.sti.tcc.resources.rest.models.simulado.SimuladoCompletoResponse;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class SimuladoMapper extends MapperUtil<Simulado, SimuladoCompletoResponse> {

	@Override
	public SimuladoCompletoResponse transform(Simulado aObject) {
		SimuladoCompletoResponse simuladoResponse = new SimuladoCompletoResponse();
		simuladoResponse.setId(aObject.getId());
		simuladoResponse.setNome(aObject.getNome());
		simuladoResponse.setDescricao(aObject.getDescricao());
		simuladoResponse.setDataCriacao(aObject.getDataCriacao());
		simuladoResponse.setDataInicio(aObject.getDataInicio());
		simuladoResponse.setDataFimSimulado(aObject.getDataFimSimulado());
		simuladoResponse.setTempoMaximo(aObject.getTempoMaximo());
		simuladoResponse.setIdUsuario(aObject.getIdUsuario().getId());
		simuladoResponse.setQuantidadeQuestoes(aObject.getQuantidadeQuestoes());
		if(aObject.getSala() != null) {
			simuladoResponse.setIdSala(aObject.getSala().getId());
		}
		
		simuladoResponse.setTipoSimulado(aObject.getTipoSimulado().codigo);
		simuladoResponse.setQuestoes(new QuestaoMapper().transform(aObject.getQuestoes()));
		return simuladoResponse;
	}
}
