package ifsc.sti.tcc.resources.mappers.domaintoview;

import java.util.ArrayList;
import java.util.List;

import ifsc.sti.tcc.modelos.questao.Questao;
import ifsc.sti.tcc.modelos.questao.QuestaoAlternativa;
import ifsc.sti.tcc.modelos.respostasimulado.RepostaAlternativa;
import ifsc.sti.tcc.modelos.respostasimulado.RepostaDiscursiva;
import ifsc.sti.tcc.modelos.respostasimulado.RespostaQuestao;
import ifsc.sti.tcc.props.ETipoQuestao;
import ifsc.sti.tcc.resources.rest.models.question.QuestaoResponse;
import ifsc.sti.tcc.resources.rest.models.question.QustaoGabaritoAlternativaResponse;
import ifsc.sti.tcc.resources.rest.models.question.QustaoGabaritoDiscursivaResponse;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class QuestaoGabaritoMapper extends MapperUtil<Questao, QuestaoResponse> {

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
		} else {
			objeto = new QustaoGabaritoDiscursivaResponse();
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
	
	public QuestaoResponse transform(Questao aObject, RespostaQuestao resposta) {
		QuestaoResponse response = transform(aObject);
		if(response.getTipoQuestao() == ETipoQuestao.ALTERNATIVA.codigo) {
			((QustaoGabaritoAlternativaResponse)response).setRespostaUsuario(((RepostaAlternativa) resposta).getAlternativasSelecionada().toUpperCase());
			((QustaoGabaritoAlternativaResponse)response).setRespostaCorreta(((QuestaoAlternativa) aObject).getAlternativaCorreta().toUpperCase());
			((QustaoGabaritoAlternativaResponse)response).isCorreta(((RepostaAlternativa) resposta).getCorreta());
		} else {
			((QustaoGabaritoDiscursivaResponse)response).isCorreta(((RepostaAlternativa) resposta).getCorreta());
			((QustaoGabaritoDiscursivaResponse)response).setRespostaUsuario(((RepostaDiscursiva) resposta).getRespostaDiscursiva());
		}
		return response;
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