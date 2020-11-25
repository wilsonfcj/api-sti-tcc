package ifsc.sti.tcc.resources.mappers;

import java.util.ArrayList;
import java.util.List;

import ifsc.sti.tcc.modelos.questao.QuestaoAlternativa;
import ifsc.sti.tcc.resources.rest.models.question.QuestaoResponse;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class QuestaoMapper extends MapperUtil<QuestaoAlternativa, QuestaoResponse> {

	@Override
	public QuestaoResponse transform(QuestaoAlternativa aObject) {
		QuestaoResponse objeto = new QuestaoResponse();
		objeto.setId(aObject.getId());
		objeto.setAno(aObject.getAno());
		objeto.setDescricao(aObject.getDescricao());
		objeto.setArea(aObject.getArea().codigo);
		objeto.setProva(aObject.getProva().codigo);
		objeto.setDisciplina(aObject.getDisciplina().codigo);
		objeto.setImagem(aObject.getImagem());
		
		objeto.setAlternativasA(aObject.getAlternativasA());
		objeto.setAlternativasB(aObject.getAlternativasB());
		objeto.setAlternativasC(aObject.getAlternativasC());
		objeto.setAlternativasD(aObject.getAlternativasD());
		objeto.setAlternativasE(aObject.getAlternativasE());
		return objeto;
	}
	
	public List<QuestaoResponse> transform(List<QuestaoAlternativa> aObject) {
		List<QuestaoResponse> questoes = new ArrayList<QuestaoResponse>();
		for(QuestaoAlternativa lQuestao : aObject) {
			QuestaoResponse lQuestaoResponse = transform(lQuestao);
			questoes.add(lQuestaoResponse);
		}
		return questoes;
	}

}