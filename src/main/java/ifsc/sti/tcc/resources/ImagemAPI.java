package ifsc.sti.tcc.resources;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ifsc.sti.tcc.modelos.usuario.Imagem;
import ifsc.sti.tcc.repository.ImagemRepository;
import ifsc.sti.tcc.resources.rest.ResponseBase;
import ifsc.sti.tcc.resources.rest.models.usuario.login.request.ImageUpdateRequest;
import ifsc.sti.tcc.resources.rest.models.usuario.login.response.ImagemResponse;
import ifsc.sti.tcc.resources.rest.models.usuario.mappers.ImagemMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST STI Imagem")
public class ImagemAPI {
	
	@Autowired
	private ImagemRepository imagemRepository;
	
	@ApiOperation(value = "Deleta a imagem por id usuário")
	@GetMapping("/DeletarImagemPorIdUsuario")
	public ResponseEntity<ResponseBase<ImagemResponse>> deletarImagemIdUsuario(@RequestParam Long id) {
		ResponseBase<ImagemResponse> baseResponse = new ResponseBase<>();
		try {
			Imagem imagem = imagemRepository.findByIdUsuario((long) id);
			if(imagem != null) {
				imagemRepository.delete(imagem);
				baseResponse = new ResponseBase<>(true, "Imagem deletada com com sucesso",  new ImagemMapper().transform(imagem));
			} else {
				baseResponse = new ResponseBase<>(false, "Nenhuma imagem encontrada para este usuário", null);
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Nenhuma imagem encontrada para este usuário", null);
		}
		return new ResponseEntity<ResponseBase<ImagemResponse>>(baseResponse, HttpStatus.OK);
	}

	@ApiOperation(value = "Deleta a imagem por seu id")
	@GetMapping("/DeletarImagemPorId")
	public ResponseEntity<ResponseBase<ImagemResponse>> deletarImagemId(@RequestParam Long id) {
		ResponseBase<ImagemResponse> baseResponse = new ResponseBase<>();
		try {
			Imagem imagem = imagemRepository.findById((long) id);
			if(imagem != null) {
				imagemRepository.delete(imagem);
				baseResponse = new ResponseBase<>(true, "Imagem deletada com sucesso",  new ImagemMapper().transform(imagem));
			} else {
				baseResponse = new ResponseBase<>(false, "Nenhuma imagem encontrada", null);
			}
		} catch (Exception e) {
			baseResponse = new ResponseBase<>(false, "Não foi possível remover a imagem", null);
		}
		return new ResponseEntity<ResponseBase<ImagemResponse>>(baseResponse, HttpStatus.OK);
	}

	@ApiOperation(value = "Consultar imagem por id usuário")
	@GetMapping("/BuscarImagemPorIdUsuario")
	public ResponseEntity<ResponseBase<ImagemResponse>> buscarImagemIdUsuario(@RequestParam Long idUsuario) {
		ResponseBase<ImagemResponse> baseResponse = new ResponseBase<>();
		Imagem imagem = imagemRepository.findByIdUsuario((long) idUsuario);
		if(imagem != null) {
			baseResponse = new ResponseBase<>(true, "Imagem consultada com sucesso",  new ImagemMapper().transform(imagem));
		} else {
			baseResponse = new ResponseBase<>(false, "Nenhuma Imagem encontrada para este usuário", null);
		}
		return new ResponseEntity<ResponseBase<ImagemResponse>>(baseResponse, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Consultar imagem por id")
	@GetMapping("/BuscarImagemPorId")
	public ResponseEntity<ResponseBase<ImagemResponse>> buscarImagemId(@RequestParam Long idUsuario) {
		ResponseBase<ImagemResponse> baseResponse = new ResponseBase<>();
		Imagem imagem = imagemRepository.findById((long) idUsuario);
		if(imagem != null) {
			baseResponse = new ResponseBase<>(true, "Imagem consultada com sucesso",  new ImagemMapper().transform(imagem));
		} else {
			baseResponse = new ResponseBase<>(false, "Nenhuma Imagem encontrada para este usuário", null);
		}
		return new ResponseEntity<ResponseBase<ImagemResponse>>(baseResponse, HttpStatus.OK);
	}
	
	@ApiOperation(value = "Alterar imagem por ID usuário")
	@RequestMapping(value = "/AlterarImagemPorId", method = RequestMethod.POST)
	public ResponseEntity<ResponseBase<ImagemResponse>> alterarImagemId(@RequestBody @Valid ImageUpdateRequest idUsuario) {
		ResponseBase<ImagemResponse> baseResponse = new ResponseBase<>();
		Imagem imagem = alterarImagem(idUsuario);
		if(imagem != null) {
			baseResponse = new ResponseBase<>(true, "Imagem alterada com sucesso",  new ImagemMapper().transform(imagem));
		} else {
			baseResponse = new ResponseBase<>(false, "Não foi possivel alterar a imagem", null);
		}
		return new ResponseEntity<ResponseBase<ImagemResponse>>(baseResponse, HttpStatus.OK);
	}
	
	private Imagem alterarImagem(ImageUpdateRequest idUsuario) {
		Imagem imagem = imagemRepository.findByIdUsuario(idUsuario.getIdUsuario());
		if(imagem == null) {
			imagem = new Imagem(idUsuario.getIdUsuario()); 
		}
		imagem.setPerfil(idUsuario.getImagem());
		return imagemRepository.save(imagem);
	}
}
