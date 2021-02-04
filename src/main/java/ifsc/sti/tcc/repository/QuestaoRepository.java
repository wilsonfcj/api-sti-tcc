package ifsc.sti.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ifsc.sti.tcc.modelos.questao.Questao;
import ifsc.sti.tcc.modelos.questao.QuestaoAlternativa;
import ifsc.sti.tcc.modelos.questao.QuestaoDiscusiva;

public interface QuestaoRepository extends JpaRepository<Questao, Long> {
	
  
  Questao findById(long id);
		
  @Query(value = "SELECT * FROM questao WHERE area = ?1 and prova = ?2 and alternativa_correta <> '*' ORDER BY random() LIMIT ?3", nativeQuery = true)
  List<QuestaoAlternativa> consultPoscomp(int area, int prova, int limit);
  
  @Query(value = "SELECT * FROM questao WHERE area = ?1 and prova = ?2 and ano = ?3 and alternativa_correta <> '*' ORDER BY random() LIMIT ?4", nativeQuery = true)
  List<QuestaoAlternativa> consultPoscompByAno(int area, int prova, int ano, int limit);
  
  @Query(value = "SELECT * FROM questao WHERE prova = ?1 and ano = ?2 and alternativa_correta <> '*' ORDER BY random() LIMIT ?3", nativeQuery = true)
  List<QuestaoAlternativa> consultPoscompOnlyAno(int prova, int ano, int limit);
  
  @Query(value = "SELECT * FROM questao WHERE prova = ?1 and ano = ?2 and alternativa_correta <> '*' ORDER BY random() LIMIT ?3", nativeQuery = true)
  List<Questao> consultPoscompOnlyAnoQ(int prova, int ano, int limit);
  
//Questão alternativa enade
  
  @Query(value = "SELECT * FROM questao WHERE tipo_formcao = ?1 and prova = ?2 and alternativa_correta <> '*' ORDER BY random() LIMIT ?3", nativeQuery = true)
  List<QuestaoAlternativa> consultEnade(int formacao, int prova, int limit);
  
  @Query(value = "SELECT * FROM questao WHERE tipo_formcao = ?1 and prova = ?2 and ano = ?3 and alternativa_correta <> '*' ORDER BY random() LIMIT ?4", nativeQuery = true)
  List<QuestaoAlternativa> consultEnadeByAno(int formacao, int prova, int ano, int limit);
  
//  Questão discursivas
  
  @Query(value = "SELECT * FROM questao WHERE tipo_formcao = ?1 and dtype = 'D' ORDER BY random() LIMIT ?2", nativeQuery = true)
  List<QuestaoDiscusiva> consultEnadeDiscursiva(int formacao, int limit);
  
  @Query(value = "SELECT * FROM questao WHERE tipo_formcao = ?1 and dtype = 'D' and ano = ?2 ORDER BY random() LIMIT ?3", nativeQuery = true)
  List<QuestaoDiscusiva> consultEnadeDiscursivaByAno(int formacao, int ano, int limit);
}
