package ifsc.sti.tcc.resources.mappers.viewtodomain;

import java.util.ArrayList;
import java.util.List;

import ifsc.sti.tcc.modelos.questao.Questao;
import ifsc.sti.tcc.modelos.questao.QuestaoAlternativa;
import ifsc.sti.tcc.modelos.respostasimulado.RepostaAlternativa;
import ifsc.sti.tcc.modelos.respostasimulado.RepostaDiscursiva;
import ifsc.sti.tcc.modelos.respostasimulado.RespostaQuestao;
import ifsc.sti.tcc.props.ETipoQuestao;
import ifsc.sti.tcc.repository.QuestaoRepository;
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
		if(aObject.getRespostaQuestao() != null && !aObject.getRespostaQuestao().isEmpty()) {
			respostaSimulado.setRespondida(true);
		}
		return respostaSimulado;
	}
	
	protected RespostaQuestao transform(RespostaQuestaoRequest aObject, QuestaoRepository questaoRepository) {
		RespostaQuestao respostaSimulado = transform(aObject);
		String resposta = "";
		Questao questao = questaoRepository.findById((long) respostaSimulado.getIdQuestao());
		if (respostaSimulado instanceof RepostaAlternativa) {
			resposta = ((RepostaAlternativa) respostaSimulado).getAlternativasSelecionada();
			if(((QuestaoAlternativa)questao).getAlternativaCorreta().equalsIgnoreCase(resposta)) {
				((RepostaAlternativa) respostaSimulado).setCorreta(true);
			}
		} else {
//			TODO realizar a validação aqui, se a resposta está correta
			resposta = ((RepostaDiscursiva) respostaSimulado).getRespostaDiscursiva();
			if(!resposta.isEmpty()) {
				((RepostaDiscursiva) respostaSimulado).setCorreta(true);
			} else {
				((RepostaDiscursiva) respostaSimulado).setRespondida(false);
			}
		}
		return respostaSimulado;
	}
	
	public List<RespostaQuestao> transform(List<RespostaQuestaoRequest> aFromList, QuestaoRepository questaoRepository) {
        List<RespostaQuestao> lList = new ArrayList<>();
        for (RespostaQuestaoRequest lFrom : aFromList) {
            lList.add(transform(lFrom, questaoRepository));
        }
        return lList;
    }
}
