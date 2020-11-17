package ifsc.sti.tcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ifsc.sti.tcc.modelos.desepenho.Desempenho;

public interface DesempenhoRepository extends JpaRepository<Desempenho, Long>{
	
   @Query(value = "SELECT FROM desempenho WHERE id_usuario = ?1", nativeQuery = true)
   Desempenho buscarDesempenho(long idUsuario);
}
