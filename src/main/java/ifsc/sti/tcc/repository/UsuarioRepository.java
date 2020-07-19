package ifsc.sti.tcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ifsc.sti.tcc.modelos.usuario.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	Usuario findById(long id);
	Usuario findByCpf(String cpf);
//	List<Usuario> finddType(String a);
}
