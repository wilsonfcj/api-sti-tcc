package ifsc.sti.tcc.resources.mappers.domaintoview;

import ifsc.sti.tcc.modelos.questao.Questao;
import ifsc.sti.tcc.modelos.questao.QuestaoAlternativa;
import ifsc.sti.tcc.props.ETipoQuestao;
import ifsc.sti.tcc.resources.rest.models.question.QuestaoResponse;
import ifsc.sti.tcc.resources.rest.models.question.QustaoGabaritoAlternativaResponse;
import ifsc.sti.tcc.resources.rest.models.question.QustaoGabaritoDiscursivaResponse;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class QuestaoRespostaMapper extends MapperUtil<Questao, QuestaoResponse> {

	@Override
	public QuestaoResponse transform(Questao aObject) {
		QuestaoResponse objeto = null;
		if(aObject instanceof QuestaoAlternativa) {
			objeto = new QustaoGabaritoAlternativaResponse();
			objeto.setTipoQuestao(ETipoQuestao.ALTERNATIVA.codigo);
			((QustaoGabaritoAlternativaResponse)objeto).setAlternativasA(((QuestaoAlternativa) aObject).getAlternativasA());
			((QustaoGabaritoAlternativaResponse)objeto).setAlternativasB(((QuestaoAlternativa) aObject).getAlternativasB());
			((QustaoGabaritoAlternativaResponse)objeto).setAlternativasC(((QuestaoAlternativa) aObject).getAlternativasC());
			((QustaoGabaritoAlternativaResponse)objeto).setAlternativasD(((QuestaoAlternativa) aObject).getAlternativasD());
			((QustaoGabaritoAlternativaResponse)objeto).setAlternativasE(((QuestaoAlternativa) aObject).getAlternativasE());
			((QustaoGabaritoAlternativaResponse)objeto).setAlternativaImagem(((QuestaoAlternativa) aObject).getAlternativaImagem());
			((QustaoGabaritoAlternativaResponse)objeto).setRespostaCorreta(((QuestaoAlternativa) aObject).getAlternativaCorreta().toUpperCase());
			((QustaoGabaritoAlternativaResponse)objeto).setRespostaUsuario(((QuestaoAlternativa) aObject).getAlternativaCorreta().toUpperCase());
			((QustaoGabaritoAlternativaResponse)objeto).isCorreta(true);
		} else {
			objeto = new QustaoGabaritoDiscursivaResponse();
			objeto.setTipoQuestao(ETipoQuestao.DISCURSIVA.codigo);
			((QustaoGabaritoDiscursivaResponse)objeto).isCorreta(true);
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
		((QustaoGabaritoAlternativaResponse)objeto).isCorreta(true);
		return objeto;
	}
	
}