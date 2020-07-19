package ifsc.sti.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ifsc.sti.tcc.modelos.disciplina.DisciplinaInteresse;

public interface DisciplinaRepository extends JpaRepository<DisciplinaInteresse, Long>  {
	
  List<DisciplinaInteresse> findByDescricao(String descricao);
  List<DisciplinaInteresse> findByIdUsuario(long idUsuario);
  
    
}
