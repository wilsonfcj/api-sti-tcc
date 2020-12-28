package ifsc.sti.tcc.modelos.simulado;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import ifsc.sti.tcc.modelos.usuario.Usuario;

//@Entity
//@Table(name = "sala")
public class Sala {
//	
//	@Id
//	@Column(name = "id_simulado")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String senha;
	
	private String descricao;
	
	private Date dataCriacao;
	
	private Usuario usuario;
	
	private Integer qtdParticipantes;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	@OnDelete(action = OnDeleteAction.CASCADE)
//    @JoinColumn(name = "id_simulado")
	private List<Simulado> simulados;
	
//	@ManyToMany(cascade = CascadeType.ALL)
//	@OnDelete(action = OnDeleteAction.CASCADE)
//    @JoinColumn(name = "id_aluno")
	private List<Usuario> alunos;
}
