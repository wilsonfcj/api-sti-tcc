package ifsc.sti.tcc.resources.mappers.domaintoview;

import ifsc.sti.tcc.modelos.simulado.Simulado;
import ifsc.sti.tcc.resources.rest.models.simulado.SimuladoBaseResponse;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class SimuladoResumoMapper extends MapperUtil<Simulado, SimuladoBaseResponse> {

	@Override
	public SimuladoBaseResponse transform(Simulado aObject) {
		SimuladoBaseResponse simuladoResponse = new SimuladoBaseResponse();
		simuladoResponse.setId(aObject.getId());
		simuladoResponse.setNome(aObject.getNome());
		simuladoResponse.setDescricao(aObject.getDescricao());
		simuladoResponse.setDataCriacao(aObject.getDataCriacao());
		simuladoResponse.setDataInicio(aObject.getDataInicio());
		simuladoResponse.setDataFimSimulado(aObject.getDataFimSimulado());
		simuladoResponse.setTempoMaximo(aObject.getTempoMaximo());
		simuladoResponse.setIdUsuario(aObject.getIdUsuario().getId());
		simuladoResponse.setQuantidadeQuestoes(aObject.getQuantidadeQuestoes());
		simuladoResponse.setTipoSimulado(aObject.getTipoSimulado().codigo);
		if(aObject.getSala() != null)
			simuladoResponse.setIdSala(aObject.getSala().getId());
		return simuladoResponse;
	}
}
