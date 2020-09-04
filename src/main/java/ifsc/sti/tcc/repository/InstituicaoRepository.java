package ifsc.sti.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ifsc.sti.tcc.modelos.intituicao.Instituicao;

public interface InstituicaoRepository extends JpaRepository<Instituicao, Long> {
	
	Instituicao findById(long id);
	Instituicao findByNome(String nome);
	List<Instituicao> findAll();
	
	@Query(value = "DELETE FROM instituicao WHERE id_instituicao = ?1", nativeQuery = true)
	Instituicao deleteById(long idImamge);

}
