package ifsc.sti.tcc.resources.rest.models.mappers;

import ifsc.sti.tcc.modelos.usuario.Aluno;
import ifsc.sti.tcc.props.EPerfilUsuario;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.AlunoResponse;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class AlunoMapper extends MapperUtil<Aluno, AlunoResponse> {

	@Override
	public AlunoResponse transform(Aluno aObject) {
		AlunoResponse alunoResponse = new AlunoResponse();
		alunoResponse.setId(aObject.getId());
		alunoResponse.setCpf(aObject.getCpf());
		alunoResponse.setEmail(aObject.getEmail());
		alunoResponse.setAnoIngresso(aObject.getAnoIngresso());
		alunoResponse.setFone(aObject.getFone());
		alunoResponse.setNascimento(aObject.getNascimento());
		alunoResponse.setMatricula(aObject.getMatricula());
		alunoResponse.setNome(aObject.getNome());
//		alunoResponse.setInstituicao(aObject.getInstituicao());
		alunoResponse.setPerfilUsuario(EPerfilUsuario.ALUNO.codigo);
		return alunoResponse;
	}

}