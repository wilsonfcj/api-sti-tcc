package ifsc.sti.tcc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ifsc.sti.tcc.modelos.respostasimulado.RespostaSimulado;

public interface RespostaSimuladoRepository extends JpaRepository<RespostaSimulado, Long> {
	
	List<RespostaSimulado> findById(long id);
	
	@Query(value = "SELECT * FROM resposta_simulado WHERE id_simulado = ?1 and id_usuario = ?2", nativeQuery = true)
	RespostaSimulado consultarRespostaSimulado(long idSimulado, long idUsuario);
	
	@Query(value = "SELECT count(*) FROM resposta_simulado WHERE id_usuario = ?1", nativeQuery = true)
	int consultarQtdSimuladosRespondidos(long idUsuario);
	
	@Query(value = "SELECT count(*) FROM resposta_simulado as rs inner join simulado s on s.id_simulado = rs.id_simulado WHERE rs.id_usuario = ?1 and s.tipo_simulado = ?2", nativeQuery = true)
	int consultarQtdSimuladosRespondidos(long idUsuario, int idSimulado);
	
	@Query(value = "SELECT * FROM resposta_simulado WHERE id_usuario = ?1 order by data_resposta desc limit 5", nativeQuery = true)
	List<RespostaSimulado> buscarRespostaSimulados(long idUsuario);
	
//	Geral
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao where id_usuario = ?1 and rq.correta = false and rs.id_simulado = ?2", nativeQuery = true)
	int consultarErrosSimulado(long idUsuario, long idSimulado);
	
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao where id_usuario = ?1 and rq.correta and rs.id_simulado = ?2", nativeQuery = true)
	int consultarAcertosSimulado(long idUsuario, long idSimulado);
	
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao where id_usuario = ?1 and rq.respondida = false and rs.id_simulado = ?2", nativeQuery = true)
	int consultarQuantidadeNaoRespondiasSimulado(long idUsuario, long idSimulado);
	
	@Query(value = "select count(*) from simulado as s inner join simulado_questoes as sq ON sq.simulado_id_simulado = s.id_simulado where s.id_simulado = ?1", nativeQuery = true)
	int consultarTotalQuestaoes(long idSimulado);
	
//	Por Area
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join questao as q on q.id_questao = rq.id_questao where id_usuario = ?1 and rq.correta = false and rs.id_simulado = ?2 and q.area = ?3", nativeQuery = true)
	int consultarErrosSimuladoPorArea(long idUsuario, long idSimulado, int area);
	
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join questao as q on q.id_questao = rq.id_questao where id_usuario = ?1 and rq.correta and rs.id_simulado = ?2 and q.area = ?3", nativeQuery = true)
	int consultarAcertosSimuladoPorArea(long idUsuario, long idSimulado, int area);
	
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join questao as q on q.id_questao = rq.id_questao where id_usuario = ?1 and rq.respondida = false and rs.id_simulado = ?2 and q.area = ?3", nativeQuery = true)
	int consultarQuantidadeNaoRespondiasSimuladoPorArea(long idUsuario, long idSimulado, int area);
	
	@Query(value = "select count(*) from simulado as s inner join simulado_questoes as sq ON sq.simulado_id_simulado = s.id_simulado inner join questao as q on q.id_questao = sq.questoes_id_questao where s.id_simulado = ?1 and q.area = ?2", nativeQuery = true)
	int consultarTotalQuestaoesPorArea(long idSimulado, int area);
	
//	Geral Total
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao where id_usuario = ?1 and rq.correta = false", nativeQuery = true)
	int consultarErrosSimuladoTotal(long idUsuario);
	
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao where id_usuario = ?1 and rq.correta", nativeQuery = true)
	int consultarAcertosSimuladoTotal(long idUsuario);
	
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao where id_usuario = ?1 and rq.respondida = false", nativeQuery = true)
	int consultarQuantidadeNaoRespondiasSimuladoTotal(long idUsuario);
	
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao where id_usuario = ?1", nativeQuery = true)
	int consultarTotalQuestaoesRespondidas(long idUsuario);
	
//	Por Area Total
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join questao as q on q.id_questao = rq.id_questao where id_usuario = ?1 and rq.correta = false and q.area = ?2", nativeQuery = true)
	int consultarErrosSimuladoPorAreaTotal(long idUsuario, int area);
	
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join questao as q on q.id_questao = rq.id_questao where id_usuario = ?1 and rq.correta and q.area = ?2", nativeQuery = true)
	int consultarAcertosSimuladoPorAreaTotal(long idUsuario, int area);
	
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join questao as q on q.id_questao = rq.id_questao where id_usuario = ?1 and rq.respondida = false and q.area = ?2", nativeQuery = true)
	int consultarQuantidadeNaoRespondiasSimuladoPorAreaTotal(long idUsuario, int area);
	
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join questao as q on q.id_questao = rq.id_questao where rs.id_usuario = ?1 and q.area = ?2", nativeQuery = true)
	int consultarTotalQuestaoesPorAreaTotal(long idUsuario, int area);
	
	
//	Geral Total Tipo Prova
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join simulado as s on s.id_simulado = rs.id_simulado where rs.id_usuario = ?1 and rq.correta = false and s.tipo_simulado = ?2", nativeQuery = true)
	int consultarErrosSimuladoTotal(long idUsuario, int tipoProva);
	
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join simulado as s on s.id_simulado = rs.id_simulado where rs.id_usuario = ?1 and rq.correta and s.tipo_simulado = ?2", nativeQuery = true)
	int consultarAcertosSimuladoTotal(long idUsuario, int tipoProva);
	
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join simulado as s on s.id_simulado = rs.id_simulado where rs.id_usuario = ?1 and rq.respondida = false and s.tipo_simulado = ?2", nativeQuery = true)
	int consultarQuantidadeNaoRespondiasSimuladoTotal(long idUsuario , int tipoProva);
	
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join simulado as s on s.id_simulado = rs.id_simulado where rs.id_usuario = ?1 and s.tipo_simulado = ?2", nativeQuery = true)
	int consultarTotalQuestaoesRespondidas(long idUsuario, int tipoProva);
	
//	Por Area Total Tipo Prova
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join questao as q on q.id_questao = rq.id_questao inner join simulado as s on s.id_simulado = rs.id_simulado where rs.id_usuario = ?1 and rq.correta = false and q.area = ?2 and s.tipo_simulado = ?3", nativeQuery = true)
	int consultarErrosSimuladoPorAreaTotal(long idUsuario, int area, int tipoProva);
	
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join questao as q on q.id_questao = rq.id_questao inner join simulado as s on s.id_simulado = rs.id_simulado where rs.id_usuario = ?1 and rq.correta and q.area = ?2 and s.tipo_simulado = ?3", nativeQuery = true)
	int consultarAcertosSimuladoPorAreaTotal(long idUsuario, int area, int tipoProva);
	
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join questao as q on q.id_questao = rq.id_questao inner join simulado as s on s.id_simulado = rs.id_simulado where rs.id_usuario = ?1 and rq.respondida = false and q.area = ?2 and s.tipo_simulado = ?3", nativeQuery = true)
	int consultarQuantidadeNaoRespondiasSimuladoPorAreaTotal(long idUsuario, int area, int tipoProva);
	
	@Query(value = "select count(*) from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join questao as q on q.id_questao = rq.id_questao inner join simulado as s on s.id_simulado = rs.id_simulado where rs.id_usuario = ?1 and q.area = ?2 and s.tipo_simulado = ?3", nativeQuery = true)
	int consultarTotalQuestaoesPorAreaTotal(long idUsuario, int area, int tipoProva);

	
//	Simulado
	@Query(value = "select count(*), q.disciplina from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join questao as q on q.id_questao = rq.id_questao where id_usuario = ?1 and rs.id_simulado = ?2 group by q.disciplina", nativeQuery = true)
	List<Object[]> disciplinaSimulado(long idUsuario, long idSimulado);
	
	@Query(value = "select count(*), q.disciplina from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join questao as q on q.id_questao = rq.id_questao where id_usuario = ?1 and rq.correta = false and rq.respondida and rs.id_simulado = ?2 group by q.disciplina", nativeQuery = true)
	List<Object[]> resultadoDisciplinaSimuladoErro(long idUsuario, long idSimulado);
	
	@Query(value = "select count(*) as valor, q.disciplina from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join questao as q on q.id_questao = rq.id_questao where id_usuario = ?1 and rq.correta and rs.id_simulado = ?2 group by q.disciplina", nativeQuery = true)
	List<Object[]> resultadoDisciplinaSimuladoAcerto(long idUsuario, long idSimulado);
	
	@Query(value = "select count(*) as valor, q.disciplina from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join questao as q on q.id_questao = rq.id_questao where id_usuario = ?1 and rq.respondida = false and rs.id_simulado = ?2 group by q.disciplina", nativeQuery = true)
	List<Object[]> resultadoDisciplinaSimuladoNaoRespondida(long idUsuario, long idSimulado);
	
	
//	GEral
	@Query(value = "select count(*), q.disciplina from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join questao as q on q.id_questao = rq.id_questao where id_usuario = ?1 group by q.disciplina", nativeQuery = true)
	List<Object[]> disciplinaSimulado(long idUsuario);
	
	@Query(value = "select count(*), q.disciplina from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join questao as q on q.id_questao = rq.id_questao where id_usuario = ?1 and rq.correta = false and rq.respondida group by q.disciplina", nativeQuery = true)
	List<Object[]> resultadoDisciplinaSimuladoErro(long idUsuario);
	
	@Query(value = "select count(*) as valor, q.disciplina from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join questao as q on q.id_questao = rq.id_questao where id_usuario = ?1 and rq.correta group by q.disciplina", nativeQuery = true)
	List<Object[]> resultadoDisciplinaSimuladoAcerto(long idUsuario);
	
	@Query(value = "select count(*) as valor, q.disciplina from resposta_simulado_respostas as rsp inner join resposta_simulado rs on rs.id_resposta_simulado = rsp.resposta_simulado_id_resposta_simulado inner join resposta_questao as rq on rq.id_resposta_questao = rsp.respostas_id_resposta_questao inner join questao as q on q.id_questao = rq.id_questao where id_usuario = ?1 and rq.respondida = false group by q.disciplina", nativeQuery = true)
	List<Object[]> resultadoDisciplinaSimuladoNaoRespondida(long idUsuario);
}

