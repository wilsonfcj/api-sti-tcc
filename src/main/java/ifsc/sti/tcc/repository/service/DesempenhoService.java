package ifsc.sti.tcc.repository.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;

import ifsc.sti.tcc.modelos.desepenho.Desempenho;
import ifsc.sti.tcc.repository.DesempenhoRepository;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.usuario.desempenho.response.DesempenhoResponse;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.DisciplinaResponse;

public class DesempenhoService {
	
	private DesempenhoRepository jpaRepository;
	private static Logger logger = LoggerFactory.getLogger(DesempenhoService.class);
	
	public static class Instance extends BaseService<DesempenhoRepository> implements BaseService.BaseObject<DesempenhoService>{
		
		public Instance(DesempenhoRepository jpaRepository) {
			super(jpaRepository);
		}
		
		@Override
		public DesempenhoService build() {
			DesempenhoService desempenhoService = new DesempenhoService();
			desempenhoService.setJpaRepository(jpaRepository);
			return desempenhoService;
		}
	}
	
	public DesempenhoRepository getJpaRepository() {
		return jpaRepository;
	}
	
	public void setJpaRepository(DesempenhoRepository jpaRepository) {
		this.jpaRepository = jpaRepository;
	}
	
	public ResponseEntity<ResponseBase<DesempenhoResponse>> buscarDesempenho(@RequestParam Long idUsuario){
		Desempenho desempenho = jpaRepository.buscarDesempenho(idUsuario);
		ResponseBase<DesempenhoResponse> baseResponse = new ResponseBase<>();
		if(desempenho != null) {
			//FIXME erro no construtor
			baseResponse = new ResponseBase<>(true, "Desempenho consultado com sucesso",  desempenho);
		}else {
			baseResponse = new ResponseBase<>(false, "Nenhuma desempenho encontrado para este usuário", null);
		}
		
		return new ResponseEntity<ResponseBase<DesempenhoResponse>>(baseResponse, HttpStatus.OK);
	}

}
