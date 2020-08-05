package ifsc.sti.tcc.resources.rest.models.usuario.mappers;

import ifsc.sti.tcc.modelos.usuario.Aluno;
import ifsc.sti.tcc.modelos.usuario.Professor;
import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.props.EPerfilUsuario;
import ifsc.sti.tcc.resources.rest.models.usuario.cadastro.UsuarioRequest;
import ifsc.sti.tcc.utilidades.mappers.MapperUtil;

public class CadastroMapper extends MapperUtil<UsuarioRequest, Usuario> {

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
}