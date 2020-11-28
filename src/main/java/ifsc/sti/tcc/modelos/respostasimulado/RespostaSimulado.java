package ifsc.sti.tcc.modelos.respostasimulado;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import ifsc.sti.tcc.modelos.simulado.Simulado;
import ifsc.sti.tcc.modelos.usuario.Usuario;

@Entity
@Table(name = "RespostaSimulado")
public class RespostaSimulado {
	
	@Id
	@Column(name = "id_resposta_simulado")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_simulado")
	private Simulado idSimulado;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_usuario")
	private Usuario idUsuario;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_resposta_questao")
	private List<RespostaQuestao> respostas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Simulado getIdSimulado() {
		return idSimulado;
	}

	public void setIdSimulado(Simulado idSimulado) {
		this.idSimulado = idSimulado;
	}

	public List<RespostaQuestao> getRespostas() {
		return respostas;
	}

	public void setRespostas(List<RespostaQuestao> respostas) {
		this.respostas = respostas;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
		this.idUsuario = idUsuario;
	}
}
