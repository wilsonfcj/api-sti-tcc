package ifsc.sti.tcc.modelos.disciplina;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Disciplina_Interesse")
public class DisciplinaInteresse implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3490867811992136869L;

	@Id
	@Column(name = "id_di")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer cod;
	private Long idUsuario;
	private String descricao;

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCod() {
		return cod;
	}

	public void setCod(Integer cod) {
		this.cod = cod;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
}
