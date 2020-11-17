package ifsc.sti.tcc.repository.service;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import ifsc.sti.tcc.modelos.disciplina.DisciplinaInteresse;
import ifsc.sti.tcc.modelos.usuario.Usuario;
import ifsc.sti.tcc.props.EDisciplina;
import ifsc.sti.tcc.repository.DisciplinaRepository;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.usuario.login.request.DisciplinaCodRequest;
import ifsc.sti.tcc.resources.rest.models.usuario.login.request.DisciplinaDescricaoRequest;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.DisciplinaResponse;

public class DisciplinaService   {
	
	private DisciplinaRepository jpaRepository;
	private static Logger logger = LoggerFactory.getLogger(ImagemService.class);
	
	
	public static class Instance extends BaseService<DisciplinaRepository> implements BaseService.BaseObject<DisciplinaService> {

		public Instance(DisciplinaRepository jpaRepository) {
			super(jpaRepository);
		}

		@Override
		public DisciplinaService build() {
			DisciplinaService disciplinaService = new DisciplinaService();
			disciplinaService.setJpaRepository(jpaRepository);
			return disciplinaService;
		}
		
	}
	
	public List<DisciplinaResponse> consultarDisplinas(Long idUsuario) {
		List<DisciplinaInteresse> disciplinaInteresses = jpaRepository.findByIdUsuario((long)idUsuario);
		return DisciplinaResponse.convertDisciplinas(disciplinaInteresses);
	}
	
	public void salvarDisciplinas(Usuario usuario, List<String> disciplinas) {
		for(String cod : disciplinas) {
			jpaRepository.save(new DisciplinaInteresse(EDisciplina.getEnum(cod.trim()).codigo, usuario.getId(), EDisciplina.getEnum(cod.trim()).descricao));
		}
	}
	
	public void alterarDisciplinas(Usuario usuario, List<String> disciplinas) {
		try {
			jpaRepository.deleteByIdUsuario(usuario.getId());
		} catch (Exception e) {
			logger.info("Usuário não possui disciplinas");
		}
		for(String cod : disciplinas) {
			jpaRepository.save(new DisciplinaInteresse(EDisciplina.getEnum(cod.trim()).codigo, usuario.getId(), EDisciplina.getEnum(cod.trim()).descricao));
		}
	}

	public DisciplinaRepository getJpaRepository() {
		return jpaRepository;
	}

	public void setJpaRepository(DisciplinaRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}
	
	public ResponseEntity<ResponseBase<List<DisciplinaResponse>>> deletar(@RequestParam Long id) {
		ResponseBase<List<DisciplinaResponse>> baseResponse = new ResponseBase<>();
		try {
			List<DisciplinaInteresse> disciplinaInteresses = jpaRepository.deleteByIdUsuario((long) id);
			if(disciplinaInteresses != null) {
				baseResponse = new ResponseBase<>(true, "Disciplinas deletadas com sucesso",  DisciplinaResponse.convertDisciplinas(disciplinaInteresses));
			} else {
				baseResponse = new ResponseBase<>(false, "Nenhuma disciplina encontrada para este usuário", null);
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Nenhuma disciplina encontrada para este usuário", null);
		}
		return new ResponseEntity<ResponseBase<List<DisciplinaResponse>>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<List<DisciplinaResponse>>> deletar(@RequestBody @Valid DisciplinaCodRequest request) {
		ResponseBase<List<DisciplinaResponse>> baseResponse = new ResponseBase<>();
		try {
			List<DisciplinaInteresse> disciplinaInteresses = jpaRepository.deleteByParans(request.getIdUsuario(), request.getCod());
			if(disciplinaInteresses != null) {
				baseResponse = new ResponseBase<>(true, "Disciplinas deletadas com sucesso",  DisciplinaResponse.convertDisciplinas(disciplinaInteresses));
			} else {
				baseResponse = new ResponseBase<>(false, "Nenhuma disciplina encontrada para este usuário", null);
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Nenhuma disciplina encontrada para este usuário", null);
		}
		return new ResponseEntity<ResponseBase<List<DisciplinaResponse>>>(baseResponse, HttpStatus.OK);
	}
	
	public ResponseEntity<ResponseBase<List<DisciplinaResponse>>> deletar(@RequestBody @Valid DisciplinaDescricaoRequest request) {
		ResponseBase<List<DisciplinaResponse>> baseResponse = new ResponseBase<>();
		try {
			List<DisciplinaInteresse> disciplinaInteresses = jpaRepository.deleteByParans(request.getIdUsuario(), request.getDescricao());
			if(disciplinaInteresses != null) {
				baseResponse = new ResponseBase<>(true, "Disciplinas deletadas com sucesso",  DisciplinaResponse.convertDisciplinas(disciplinaInteresses));
			} else {
				baseResponse = new ResponseBase<>(false, "Nenhuma disciplina encontrada para este usuário", null);
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Nenhuma disciplina encontrada para este usuário", null);
		}
		return new ResponseEntity<ResponseBase<List<DisciplinaResponse>>>(baseResponse, HttpStatus.OK);
	}
	
	
	public ResponseEntity<ResponseBase<List<DisciplinaResponse>>> buscar(@RequestParam Long idUsuario) {
		List<DisciplinaInteresse> disciplinaInteresses = jpaRepository.findByIdUsuario((long) idUsuario);
		ResponseBase<List<DisciplinaResponse>> baseResponse = new ResponseBase<>();
		if(disciplinaInteresses != null && disciplinaInteresses.size() > 0) {
			baseResponse = new ResponseBase<>(true, "Disciplinas consultadas com sucesso",  DisciplinaResponse.convertDisciplinas(disciplinaInteresses));
		} else {
			baseResponse = new ResponseBase<>(false, "Nenhuma disciplina encontrada para este usuário", null);
		}
		return new ResponseEntity<ResponseBase<List<DisciplinaResponse>>>(baseResponse, HttpStatus.OK);
	}
}


