package ifsc.sti.tcc.resources.rest.models.mappers;

import ifsc.sti.tcc.modelos.usuario.Aluno;
import ifsc.sti.tcc.modelos.usuario.Professor;
import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.props.EPerfilUsuario;
import ifsc.sti.tcc.resources.rest.models.usuario.cadastro.UsuarioRequest;
import ifsc.sti.tcc.utilidades.ValidateUtil;
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
		usuario.setCpf(ValidateUtil.unmask(aObject.getCpf()));
		usuario.setEmail(aObject.getEmail());
		usuario.setFone(ValidateUtil.unmask(aObject.getFone()));
//		usuario.setInstituicao(aObject.getInstituicao());
		usuario.setNascimento(aObject.getNascimento());
		usuario.setNome(aObject.getNome());
		usuario.setSenha(aObject.getSenha());
		usuario.setInstituicao(aObject.getInstituicao());
		return usuario;
	}


}