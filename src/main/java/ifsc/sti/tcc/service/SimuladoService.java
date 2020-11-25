package ifsc.sti.tcc.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import ifsc.sti.tcc.modelos.questao.QuestaoAlternativa;
import ifsc.sti.tcc.props.EArea;
import ifsc.sti.tcc.props.ETipoSimulado;
import ifsc.sti.tcc.repository.QuestaoRepository;
import ifsc.sti.tcc.resources.mappers.QuestaoMapper;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.question.QuestaoResponse;
import ifsc.sti.tcc.resources.rest.models.simulado.SimuladoResponse;
import ifsc.sti.tcc.utilidades.DateUtil;
import ifsc.sti.tcc.utilidades.QuestionUtil;

public class SimuladoService {

	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(SimuladoService.class);

	private QuestaoRepository jpaRepository;

	public static class Instance extends BaseService<QuestaoRepository> implements BaseService.BaseObject<SimuladoService> {

		public Instance(QuestaoRepository jpaRepository) {
			super(jpaRepository);
		}

		@Override
		public SimuladoService build() {
			SimuladoService service = new SimuladoService();
			service.setJpaRepository(jpaRepository);
			return service;
		}
	}
	
	public List<QuestaoAlternativa> saveQuestions() {
	   List<QuestaoAlternativa> questoes = QuestionUtil.registerPoscomp2002();
	   jpaRepository.saveAll(questoes);
	   return questoes;
	}
	
	public QuestaoRepository getJpaRepository() {
		return jpaRepository;
	}

	public void setJpaRepository(QuestaoRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}

	public ResponseEntity<ResponseBase<List<QuestaoResponse>>> salvarTodasQuestoes() {
		ResponseBase<List<QuestaoResponse>> baseResponse = new ResponseBase<>();
		try {
			List<QuestaoResponse> response = new QuestaoMapper().transform(saveQuestions());
			baseResponse = new ResponseBase<>(response.size() > 0, response.size() > 0 ? "Informações cadastradas com sucesso" :
				"Nenhum questão cadastrada",
							response);
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Erro ao realizar o cadastro", null);
		}
		return new ResponseEntity<ResponseBase<List<QuestaoResponse>>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<SimuladoResponse>> gerarSimulado() {
		ResponseBase<SimuladoResponse> baseResponse = new ResponseBase<>();
		try {
			QuestaoMapper questaoMapper = new QuestaoMapper();
			List<QuestaoAlternativa> questaoPart1 = jpaRepository.consultPoscomp(EArea.MATEMATICA.codigo, 10);
			List<QuestaoAlternativa> questaoPart2 = jpaRepository.consultPoscomp(EArea.FUNDAMENTOS_DE_COMPUTACAO.codigo, 10);
			List<QuestaoAlternativa> questaoPart3 = jpaRepository.consultPoscomp(EArea.TECNOLOGIA_DA_COMPUTACAO.codigo, 10);
			
			List<QuestaoResponse> questaoResponse = new ArrayList<QuestaoResponse>();
			questaoResponse.addAll(questaoMapper.transform(questaoPart1));
			questaoResponse.addAll(questaoMapper.transform(questaoPart2));
			questaoResponse.addAll(questaoMapper.transform(questaoPart3));
			
			SimuladoResponse simuladoResponse = new SimuladoResponse();
			simuladoResponse.setId(1);
			simuladoResponse.setNome("Simulado");
			simuladoResponse.setDescricao("Simulado padrão");
			simuladoResponse.setDataCriacao(new Date());
			simuladoResponse.setDataInicio(new Date());
			simuladoResponse.setDataFimSimulado(DateUtil.adicionarDiasNoAtual(10));
			simuladoResponse.setTempoMaximo(240l);
			simuladoResponse.setIdUsuario(11l);
			simuladoResponse.setQuantidadeQuestoes(questaoResponse.size());
			simuladoResponse.setTipoSimulado(ETipoSimulado.POSCOMP.codigo);
			simuladoResponse.setQuestoes(questaoResponse);
			baseResponse = new ResponseBase<>(true, "Simulado gerado com sucesso", simuladoResponse);
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível gerar o simulado", null);
		}
		return new ResponseEntity<ResponseBase<SimuladoResponse>>(baseResponse, HttpStatus.OK);
	}
}
