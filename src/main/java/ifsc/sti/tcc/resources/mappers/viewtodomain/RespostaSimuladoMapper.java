package ifsc.sti.tcc.resources.mappers.viewtodomain;

import java.util.Date;
import java.util.List;

import ifsc.sti.tcc.modelos.respostasimulado.RespostaQuestao;
import ifsc.sti.tcc.modelos.respostasimulado.RespostaSimulado;
import ifsc.sti.tcc.modelos.simulado.Simulado;
import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.repository.QuestaoRepository;
import ifsc.sti.tcc.resources.rest.models.simulado.RespostaSimuladoRequest;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class RespostaSimuladoMapper extends MapperUtil<RespostaSimuladoRequest, RespostaSimulado> {

	@Override
	protected RespostaSimulado transform(RespostaSimuladoRequest aObject) {
		RespostaSimulado respostaSimulado = new RespostaSimulado();
		RespostaQuestaoMapper respostaQuestaoMapper = new RespostaQuestaoMapper();
		List<RespostaQuestao> respostas = respostaQuestaoMapper.transform(aObject.getRespostas());
		respostaSimulado.setRespostas(respostas);
		return respostaSimulado;
	}
	
	public RespostaSimulado transformRepository(RespostaSimuladoRequest aObject,  QuestaoRepository questaoRepository) {
		RespostaSimulado respostaSimulado = new RespostaSimulado();
		RespostaQuestaoMapper respostaQuestaoMapper = new RespostaQuestaoMapper();
		List<RespostaQuestao> respostas = respostaQuestaoMapper.transform(aObject.getRespostas(), questaoRepository);
		respostaSimulado.setRespostas(respostas);
		return respostaSimulado;
	}
	
	public RespostaSimulado transform(RespostaSimuladoRequest aObject, Simulado simulado, Usuario usuario, QuestaoRepository questaoRepository) {
		RespostaSimulado respostaSimulado = transformRepository(aObject, questaoRepository);
		respostaSimulado.setDataEntrega(new Date());
		respostaSimulado.setIdSimulado(simulado);
		respostaSimulado.setIdUsuario(usuario);
		return respostaSimulado;
	}

}
