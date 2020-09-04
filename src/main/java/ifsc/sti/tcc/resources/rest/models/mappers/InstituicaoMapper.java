package ifsc.sti.tcc.resources.rest.models.mappers;

import java.util.ArrayList;
import java.util.List;

import ifsc.sti.tcc.modelos.intituicao.Instituicao;
import ifsc.sti.tcc.resources.rest.models.instituicao.request.InstituicaoRequest;
import ifsc.sti.tcc.resources.rest.models.instituicao.response.InstituicaoResponse;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class InstituicaoMapper extends MapperUtil<InstituicaoRequest, Instituicao> {

	@Override
	public Instituicao transform(InstituicaoRequest aObject) {
		Instituicao instituicao = new Instituicao();
		instituicao.setNome(aObject.getNome());
		instituicao.setCidade(aObject.getCidade());
		instituicao.setUF(aObject.getUF());
		return instituicao;
	}

	public InstituicaoResponse transformResponse (Instituicao aObject) {
		InstituicaoResponse instituicaoResponse = new InstituicaoResponse();
		instituicaoResponse.setId(aObject.getId());
		instituicaoResponse.setCidade(aObject.getCidade());
		instituicaoResponse.setNome(aObject.getNome());
		instituicaoResponse.setUF(aObject.getUF());
		return instituicaoResponse;
	}
	
	public List<InstituicaoResponse> transformResponse(List<Instituicao> aFromList) {
        List<InstituicaoResponse> lList = new ArrayList<>();
        for (Instituicao lFrom : aFromList) {
            lList.add(transformResponse(lFrom));
        }
        return lList;
    }
}