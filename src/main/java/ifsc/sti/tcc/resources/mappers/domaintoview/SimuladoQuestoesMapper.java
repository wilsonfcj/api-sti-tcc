package ifsc.sti.tcc.resources.mappers.domaintoview;

import java.util.List;

import ifsc.sti.tcc.modelos.simulado.Simulado;
import ifsc.sti.tcc.resources.rest.models.question.response.QuestaoResponse;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class SimuladoQuestoesMapper extends MapperUtil<Simulado, List<QuestaoResponse>> {

	@Override
	public List<QuestaoResponse> transform(Simulado aObject) {
		return new QuestaoMapper().transform(aObject.getQuestoes());
	}
}
