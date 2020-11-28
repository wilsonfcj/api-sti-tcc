package ifsc.sti.tcc.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import ifsc.sti.tcc.modelos.intituicao.Instituicao;
import ifsc.sti.tcc.repository.InstituicaoRepository;
import ifsc.sti.tcc.resources.mappers.viewtodomain.InstituicaoMapper;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.instituicao.request.InstituicaoRequest;
import ifsc.sti.tcc.resources.rest.models.instituicao.response.InstituicaoResponse;

public class InstituicaoService {
	
	@SuppressWarnings("unused")
	private static Logger logger = LoggerFactory.getLogger(InstituicaoService.class);
	private InstituicaoRepository jpaRepository;
	
	public static class Instance extends BaseService<InstituicaoRepository>  implements BaseService.BaseObject<InstituicaoService> {
		
		public Instance(InstituicaoRepository jpaRepository) {
			super(jpaRepository);
		}
		
		@Override
		public InstituicaoService build() {
			InstituicaoService service = new InstituicaoService();
			service.setJpaRepository(jpaRepository);
			return service;
		}
	}
	
	public void setJpaRepository(InstituicaoRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}
	
	private Instituicao salvarUsuario(InstituicaoRequest request) {
		Instituicao instituicao = new InstituicaoMapper().transform(request);
		Instituicao usuarioResult = jpaRepository.save(instituicao);
		return usuarioResult;
	}
	
	public Instituicao getInstituicaoByName(String nome) {
		return jpaRepository.findByNome(nome);
	}
	
	public Instituicao getInstituicaoById(Long instituicao) {
		return jpaRepository.findById((long) instituicao);
	}
	
	public ResponseEntity<ResponseBase<InstituicaoResponse>> cadastrarInstituicao(InstituicaoRequest request) {
		ResponseBase<InstituicaoResponse> baseResponse = new ResponseBase<>();
		try {
			Instituicao result = salvarUsuario(request);
			if(result != null) {
				baseResponse = new ResponseBase<>(true, "Instituição cadastrada com com sucesso",  new InstituicaoMapper().transformResponse(result));
			} else {
				baseResponse = new ResponseBase<>(false, "Não foi possível cadastrar a instituição", null);
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível cadastrar a instituição", null);
		}
		return new ResponseEntity<ResponseBase<InstituicaoResponse>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<InstituicaoResponse>> removerInstituicao(Long id) {
		ResponseBase<InstituicaoResponse> baseResponse = new ResponseBase<>();
		try {
			Instituicao instituicao = jpaRepository.findById((long) id);
			if(instituicao != null) {
				jpaRepository.delete(instituicao);
				baseResponse = new ResponseBase<>(true, "Instituição removida com sucesso",  new InstituicaoMapper().transformResponse(instituicao));
			} else {
				baseResponse = new ResponseBase<>(false, "Nenhuma instituição encontrada", null);
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possivel remover a instituição", null);
		}
		return new ResponseEntity<ResponseBase<InstituicaoResponse>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<List<InstituicaoResponse>>> buscarTodasInstituicao() {
		ResponseBase<List<InstituicaoResponse>> baseResponse = new ResponseBase<>();
		List<Instituicao> instituicaoes = jpaRepository.findAll();
		if(!instituicaoes.isEmpty()) {
			baseResponse = new ResponseBase<>(true, "Instituições carregadas com sucesso",  new InstituicaoMapper().transformResponse(instituicaoes));
		} else {
			baseResponse = new ResponseBase<>(false, "Nenhuma Instituição encontrada", null);
		}
		return new ResponseEntity<ResponseBase<List<InstituicaoResponse>>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<InstituicaoResponse>> buscarInstituicaoPorId(Long id) {
		ResponseBase<InstituicaoResponse> baseResponse = new ResponseBase<>();
		try {
			Instituicao instituicao = jpaRepository.findById((long) id);
			if(instituicao != null) {
				baseResponse = new ResponseBase<>(true, "Instituição consultada com sucesso",  new InstituicaoMapper().transformResponse(instituicao));
			} else {
				baseResponse = new ResponseBase<>(false, "Nenhuma instituição encontrada", null);
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Nenhuma instituição encontrada", null);
		}
		return new ResponseEntity<ResponseBase<InstituicaoResponse>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<InstituicaoResponse>> buscarInstituicaoPorNome(String nome){
		ResponseBase<InstituicaoResponse> baseResponse = new ResponseBase<>();
		try {
			Instituicao instituicao = jpaRepository.findByNome(nome);
			if(instituicao != null) {
				baseResponse = new ResponseBase<>(true, "Instituição consultada com sucesso",  new InstituicaoMapper().transformResponse(instituicao));
			} else {
				baseResponse = new ResponseBase<>(false, "Nenhuma instituição encontrada", null);
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Nenhuma instituição encontrada", null);
		}
		return new ResponseEntity<ResponseBase<InstituicaoResponse>>(baseResponse, HttpStatus.OK);
	}
}


