package ifsc.sti.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ifsc.sti.tcc.modelos.questao.Questao;
import ifsc.sti.tcc.modelos.questao.QuestaoAlternativa;

public interface QuestaoRepository extends JpaRepository<Questao, Long> {
	
  
  Questao findById(long id);
		
  @Query(value = "SELECT * FROM questao WHERE area = ?1 and prova = ?2 and alternativa_correta <> '*' ORDER BY random() LIMIT ?3", nativeQuery = true)
  List<QuestaoAlternativa> consultPoscomp(int area, int prova, int limit);
  
  @Query(value = "SELECT * FROM questao WHERE area = ?1 and prova = ?2 and ano = ?3 and alternativa_correta <> '*' ORDER BY random() LIMIT ?4", nativeQuery = true)
  List<QuestaoAlternativa> consultPoscompByAno(int area, int prova, int ano, int limit);
}
