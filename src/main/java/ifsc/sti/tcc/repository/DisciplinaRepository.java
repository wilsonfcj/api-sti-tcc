package ifsc.sti.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ifsc.sti.tcc.modelos.disciplina.DisciplinaInteresse;

public interface DisciplinaRepository extends JpaRepository<DisciplinaInteresse, Long>  {
	
  List<DisciplinaInteresse> findByDescricao(String descricao);
  List<DisciplinaInteresse> findByIdUsuario(long idUsuario);
  
  @Query(value = "DELETE FROM disciplina_interesse WHERE id_usuario = ?1", nativeQuery = true)
  List<DisciplinaInteresse> deleteByIdUsuario(long idUsuario);
  
  @Query(value = "DELETE FROM disciplina_interesse WHERE id_usuario = ?1 and cod = ?2", nativeQuery = true)
  List<DisciplinaInteresse> deleteByParans(long idUsuario, int cod);
  
  @Query(value = "DELETE FROM disciplina_interesse WHERE id_usuario = ?1 and descricao = ?2", nativeQuery = true)
  List<DisciplinaInteresse> deleteByParans(long idUsuario, String descricao);
  
}
