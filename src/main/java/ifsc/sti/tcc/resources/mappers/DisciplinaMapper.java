package ifsc.sti.tcc.resources.mappers;

import ifsc.sti.tcc.modelos.disciplina.DisciplinaInteresse;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.DisciplinaResponse;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class DisciplinaMapper extends MapperUtil<DisciplinaInteresse, DisciplinaResponse> {

	@Override
	public DisciplinaResponse transform(DisciplinaInteresse aObject) {
		DisciplinaResponse objeto = new DisciplinaResponse();
		objeto.setId(aObject.getCod());
		objeto.setNome(aObject.getDescricao());
		return objeto;
	}

}