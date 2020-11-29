package ifsc.sti.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ifsc.sti.tcc.modelos.simulado.Simulado;
import ifsc.sti.tcc.modelos.usuario.Usuario;

public interface SimuladoRepository extends JpaRepository<Simulado, Long> {
	
	Simulado findById(long id);
	List<Simulado> findByIdUsuario(Usuario idUsuario);
	
}
