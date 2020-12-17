package ifsc.sti.tcc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ifsc.sti.tcc.modelos.respostasimulado.RespostaSimulado;
import ifsc.sti.tcc.modelos.simulado.Simulado;

public interface RespostaSimuladoRepository extends JpaRepository<RespostaSimulado, Long> {
	
	Simulado findById(long id);
	
	@Query(value = "SELECT * FROM resposta_simulado WHERE id_simulado = ?1 and id_usuario = ?2", nativeQuery = true)
	RespostaSimulado consultarRespostaSimulado(long idSimulado, long id_usuario);
	
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao where id_usuario = ?1 and rq.correta = false and rs.id_simulado = ?2", nativeQuery = true)
	int consultarErrosSimulado(long idUsuario, long idSimulado);
	
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao where id_usuario = ?1 and rq.correta and rs.id_simulado = ?2", nativeQuery = true)
	int consultarAcertosSimulado(long idUsuario, long idSimulado);
	
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao where id_usuario = ?1 and rq.respondida = false and rs.id_simulado = ?2", nativeQuery = true)
	int consultarQuantidadeNaoRespondiasSimulado(long idUsuario, long idSimulado);
	
	@Query(value = "select count(*) from simulado as s inner join simulado_questoes as sq ON sq.simulado_id_simulado = s.id_simulado where s.id_simulado = ?1", nativeQuery = true)
	int consultarTotalQuestaoes(long idSimulado);
}
