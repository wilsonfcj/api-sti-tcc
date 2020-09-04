package ifsc.sti.tcc.utilidades;

import java.util.ArrayList;
import java.util.List;

import ifsc.sti.tcc.modelos.usuario.Aluno;
import ifsc.sti.tcc.modelos.usuario.Professor;
import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.props.EDisciplina;

public class UserUtil {
	
	public static List<Usuario> criarUsuarios() {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		Aluno aluno1 = new Aluno();
		aluno1.setAnoIngresso(2017);
		aluno1.setMatricula(1710085622l);
		
		aluno1.setCpf("09518747997");
		aluno1.setFone("49988810393");
		aluno1.setEmail("wilsonfernandes382@gmail.com");
		aluno1.setNome("Wilson Fernandes Cordova Junior");
		aluno1.setNascimento(DateUtil.criarData(23, 10, 1995));
//		aluno1.setInstituicao("Instituto Federal De Santa Catarina");;
		aluno1.setSenha("123456");
		aluno1.setId(1l);
		
		
		Aluno aluno2 = new Aluno();
		aluno2.setAnoIngresso(2017);
		aluno2.setMatricula(1710088722l);
		
		aluno2.setCpf("41643824066");
		aluno2.setFone("49988566008");
		aluno2.setEmail("correiaribeirotiago@gmail.com");
		aluno2.setNome("Tiago Correia Ribeiro");
		aluno2.setNascimento(DateUtil.criarData(11, 01, 1999));
//		aluno2.setInstituicao("Instituto Federal De Santa Catarina");;
		aluno2.setSenha("123456");
		aluno2.setId(2l);
		
		
		Professor professor = new Professor();

		professor.setCpf("96631069050");
		professor.setFone("49988976065");
		professor.setEmail("professorteste@gmail.com");
		professor.setNome("Professor Teste WebService");
		professor.setNascimento(DateUtil.criarData(11, 01, 1999));
//		professor.setInstituicao("Instituto Federal De Santa Catarina");;
		professor.setSenha("1234567");
		professor.setId(3l);
		
		List<EDisciplina> disciplinas = new ArrayList<>();
		disciplinas.add(EDisciplina.COMPILADORES);
		disciplinas.add(EDisciplina.ESTRUTURAS_DE_DADOS);
		disciplinas.add(EDisciplina.INTELIGENCIA_ARTIFICIAL);
		disciplinas.add(EDisciplina.INTRODUCAO_A_PROGRAMACAO);
		disciplinas.add(EDisciplina.MODELAGEM_E_SIMULACAO);
//		professor.setDisciplinas(disciplinas);
		
		usuarios.add(aluno1);
		usuarios.add(aluno2);
		usuarios.add(professor);
		
		return usuarios;
	}
	
	public static Usuario buscarUsuarioCPF(String cpf) {
		for (Usuario usuario : criarUsuarios()) {
			if(usuario.getCpf().equalsIgnoreCase(cpf)) {
				return usuario;
			}
		}
		return null;
	}
	
}
