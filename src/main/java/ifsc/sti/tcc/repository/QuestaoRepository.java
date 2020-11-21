package ifsc.sti.tcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ifsc.sti.tcc.modelos.questao.Questao;

public interface QuestaoRepository extends JpaRepository<Questao, Long> {
	
}
