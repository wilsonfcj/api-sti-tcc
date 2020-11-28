package ifsc.sti.tcc.resources.mappers.viewtodomain;

import ifsc.sti.tcc.modelos.respostasimulado.RepostaAlternativa;
import ifsc.sti.tcc.modelos.respostasimulado.RepostaDiscursiva;
import ifsc.sti.tcc.modelos.respostasimulado.RespostaQuestao;
import ifsc.sti.tcc.props.ETipoQuestao;
import ifsc.sti.tcc.resources.rest.models.respostasimulado.RespostaQuestaoRequest;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class RespostaQuestaoMapper extends MapperUtil<RespostaQuestaoRequest, RespostaQuestao> {

	@Override
	protected RespostaQuestao transform(RespostaQuestaoRequest aObject) {
		// TODO Auto-generated method stub
		RespostaQuestao respostaSimulado = null;
		if(aObject.getTipoQuestao() == ETipoQuestao.ALTERNATIVA.codigo) {
			respostaSimulado = new RepostaAlternativa();
			((RepostaAlternativa) respostaSimulado).setAlternativasSelecionada(aObject.getRespostaQuestao());
		} else {
			respostaSimulado = new RepostaDiscursiva();
			((RepostaDiscursiva) respostaSimulado).setRespostaDiscursiva(aObject.getRespostaQuestao());
		}
		respostaSimulado.setIdQuestao(aObject.getIdQuestao());
		respostaSimulado.setRespondida(aObject.getRespostaQuestao() != null);
		return respostaSimulado;
	}
	
}
