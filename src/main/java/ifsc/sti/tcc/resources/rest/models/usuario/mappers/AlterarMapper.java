package ifsc.sti.tcc.resources.rest.models.usuario.mappers;

import ifsc.sti.tcc.modelos.usuario.Aluno;
import ifsc.sti.tcc.modelos.usuario.Professor;
import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.props.EPerfilUsuario;
import ifsc.sti.tcc.resources.rest.models.usuario.cadastro.UsuarioRequest;
import ifsc.sti.tcc.utilidades.mappers.MapperUpdateUtil;

public class AlterarMapper extends MapperUpdateUtil<UsuarioRequest, Usuario> {

	@Override
	public Usuario transform(UsuarioRequest aObject) {
		Usuario usuario;
		if(aObject.getPerfilUsuario() == EPerfilUsuario.ALUNO.codigo) {
			usuario = new Aluno();
			((Aluno) usuario).setMatricula(aObject.getMatricula());
			((Aluno) usuario).setAnoIngresso(aObject.getAnoIngresso());
		} else {
			usuario = new Professor();
		}
		usuario.setCpf(aObject.getCpf());
		usuario.setEmail(aObject.getEmail());
		usuario.setFone(aObject.getFone());
		usuario.setInstituicao(aObject.getInstituicao());
		usuario.setNascimento(aObject.getNascimento());
		usuario.setNome(aObject.getNome());
		usuario.setSenha(aObject.getSenha());
		return usuario;
	}

	@Override
	public Usuario transform(Usuario aObject, UsuarioRequest aObject2) {
		aObject.setNome(aObject2.getNome());
		aObject.setEmail(aObject2.getEmail());
		aObject.setFone(aObject2.getFone());
		aObject.setInstituicao(aObject2.getInstituicao());
		aObject.setNascimento(aObject2.getNascimento());
		aObject.setSenha(aObject2.getSenha());
		
		if(aObject instanceof Aluno) {
			((Aluno) aObject).setMatricula(aObject2.getMatricula());
			((Aluno) aObject).setAnoIngresso(aObject2.getAnoIngresso());
		} 
		return aObject;
	}


}