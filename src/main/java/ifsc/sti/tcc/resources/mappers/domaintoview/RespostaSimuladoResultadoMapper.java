package ifsc.sti.tcc.resources.mappers.domaintoview;

import java.util.Date;
import java.util.List;

import ifsc.sti.tcc.modelos.respostasimulado.RespostaQuestao;
import ifsc.sti.tcc.modelos.respostasimulado.RespostaSimulado;
import ifsc.sti.tcc.modelos.simulado.Simulado;
import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.repository.QuestaoRepository;
import ifsc.sti.tcc.resources.rest.models.respostasimulado.RespostaSimuladoRequest;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class RespostaSimuladoResultadoMapper extends MapperUtil<RespostaSimuladoRequest, RespostaSimulado> {

	@Override
	protected RespostaSimulado transform(RespostaSimuladoRequest aObject) {
		RespostaSimulado respostaSimulado = new RespostaSimulado();
		RespostaQuestaoResultadoMapper respostaQuestaoMapper = new RespostaQuestaoResultadoMapper();
		List<RespostaQuestao> respostas = respostaQuestaoMapper.transform(aObject.getRespostas());
		respostaSimulado.setRespostas(respostas);
		return respostaSimulado;
	}
}
