package ifsc.sti.tcc.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import ifsc.sti.tcc.modelos.simulado.Sala;

public interface SalaRepository extends JpaRepository<Sala, Long> {
	
	Sala findById(long id);
	
	@Query(value = "select * from sala where id_usuario = ?1 order by data_criacao desc", nativeQuery = true)
	List<Sala> buscarSalasPorUsuario(long usuario);
	
	@Query(value = "select * from sala where id_instituicao = ?1 order by data_criacao desc", nativeQuery = true)
	List<Sala> buscarSalasPorInstituicao(Long idInstituicao);
	
	@Modifying
	@Transactional
	@Query(value = "delete from sala where id_simulado = ?1", nativeQuery = true)
	void deleteSalaById(long idSimulado);
}