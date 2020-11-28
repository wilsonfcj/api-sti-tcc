package ifsc.sti.tcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ifsc.sti.tcc.modelos.simulado.Simulado;

public interface SimuladoRepository extends JpaRepository<Simulado, Long> {
	
	Simulado findById(long id);
}
