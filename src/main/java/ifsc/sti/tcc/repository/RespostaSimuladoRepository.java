package ifsc.sti.tcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ifsc.sti.tcc.modelos.respostasimulado.RespostaSimulado;
import ifsc.sti.tcc.modelos.simulado.Simulado;

public interface RespostaSimuladoRepository extends JpaRepository<RespostaSimulado, Long> {
	
	Simulado findById(long id);
	
	@Query(value = "SELECT * FROM resposta_simulado WHERE id_simulado = ?1 and id_usuario = ?2", nativeQuery = true)
	RespostaSimulado consultarRespostaSimulado(long idSimulado, long id_usuario);
}
