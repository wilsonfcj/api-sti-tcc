package ifsc.sti.tcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ifsc.sti.tcc.modelos.usuario.Imagem;

public interface ImagemRepository extends JpaRepository<Imagem, Long>  {
	
	Imagem findById(long id);
}
