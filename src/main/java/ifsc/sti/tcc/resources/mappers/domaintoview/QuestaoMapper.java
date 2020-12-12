package ifsc.sti.tcc.resources.mappers.domaintoview;

import java.util.ArrayList;
import java.util.List;

import ifsc.sti.tcc.modelos.questao.Questao;
import ifsc.sti.tcc.modelos.questao.QuestaoAlternativa;
import ifsc.sti.tcc.props.ETipoQuestao;
import ifsc.sti.tcc.resources.rest.models.question.QuestaoAlternativaResponse;
import ifsc.sti.tcc.resources.rest.models.question.QuestaoResponse;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class QuestaoMapper extends MapperUtil<Questao, QuestaoResponse> {

	@Override
	public QuestaoResponse transform(Questao aObject) {
		QuestaoResponse objeto = null;
		if(aObject instanceof QuestaoAlternativa) {
			objeto = new QuestaoAlternativaResponse();
			objeto.setTipoQuestao(ETipoQuestao.ALTERNATIVA.codigo);
			((QuestaoAlternativaResponse)objeto).setAlternativasA(((QuestaoAlternativa) aObject).getAlternativasA());
			((QuestaoAlternativaResponse)objeto).setAlternativasB(((QuestaoAlternativa) aObject).getAlternativasB());
			((QuestaoAlternativaResponse)objeto).setAlternativasC(((QuestaoAlternativa) aObject).getAlternativasC());
			((QuestaoAlternativaResponse)objeto).setAlternativasD(((QuestaoAlternativa) aObject).getAlternativasD());
			((QuestaoAlternativaResponse)objeto).setAlternativasE(((QuestaoAlternativa) aObject).getAlternativasE());
			((QuestaoAlternativaResponse)objeto).setAlternativaImagem(((QuestaoAlternativa) aObject).getAlternativaImagem());
		} else {
			objeto = new QuestaoResponse();
			objeto.setTipoQuestao(ETipoQuestao.DISCURSIVA.codigo);
		}
		
		objeto.setId(aObject.getId());
		objeto.setAno(aObject.getAno());
		objeto.setDescricao(aObject.getDescricao());
		objeto.setArea(aObject.getArea().codigo);
		objeto.setProva(aObject.getProva().codigo);
		objeto.setDisciplina(aObject.getDisciplina().codigo);
		objeto.setImagem(aObject.getImagem());
		objeto.setImagemQuestao(aObject.getImagemQuestao());
		objeto.setNumeroQuestao(aObject.getNumeroQuestao());
		return objeto;
	}
	
	public List<QuestaoResponse> transform(List<Questao> aObject) {
		List<QuestaoResponse> questoes = new ArrayList<QuestaoResponse>();
		for(Questao lQuestao : aObject) {
			QuestaoResponse lQuestaoResponse = transform(lQuestao);
			questoes.add(lQuestaoResponse);
		}
		return questoes;
	}

}