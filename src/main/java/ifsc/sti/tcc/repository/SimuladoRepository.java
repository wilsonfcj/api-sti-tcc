package ifsc.sti.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ifsc.sti.tcc.modelos.simulado.Simulado;

public interface SimuladoRepository extends JpaRepository<Simulado, Long> {
	
	Simulado findById(long id);
	
	@Query(value = "select * from simulado where id_usuario = ?1 order by data_criacao desc", nativeQuery = true)
	List<Simulado> buscarSimuladosPorId(long idUsuario);
	
	@Query(value = "select * from simulado where id_sala = ?1 order by data_criacao desc", nativeQuery = true)
	List<Simulado> buscarSimuladosPorIdSala(long idSala);
}
