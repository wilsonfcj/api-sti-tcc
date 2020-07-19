package ifsc.sti.tcc.modelos.usuario;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "imagem")
public class Imagem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5488394787476016982L;
	
	@Id
	@Column(name = "id_imagem")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String perfil;

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
	
}
