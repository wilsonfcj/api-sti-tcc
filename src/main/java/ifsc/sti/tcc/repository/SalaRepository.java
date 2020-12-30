package ifsc.sti.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ifsc.sti.tcc.modelos.simulado.Sala;
import ifsc.sti.tcc.modelos.usuario.Usuario;

public interface SalaRepository extends JpaRepository<Sala, Long> {
	
	Sala findById(long id);
	
	List<Sala> findByUsuario(Usuario usuario);
	
	@Query(value = "select * from sala where id_instituicao = ?1", nativeQuery = true)
	List<Sala> buscarSalasPorInstituicao(Long idInstituicao);
}