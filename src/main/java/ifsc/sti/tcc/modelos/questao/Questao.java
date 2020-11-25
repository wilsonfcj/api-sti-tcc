package ifsc.sti.tcc.modelos.questao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import ifsc.sti.tcc.props.EArea;
import ifsc.sti.tcc.props.EDisciplina;
import ifsc.sti.tcc.props.ETipoQuestao;

@Entity
@Table(name = "questao")
public abstract class Questao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6327854349745422560L;

	@Id
	@Column(name = "id_questao")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer ano;
	@Column(columnDefinition="TEXT")
	private String descricao;
	
//	Configuração prova
	private Integer area;
	private Integer prova;
	private Integer disciplina;

	private Boolean imagem = false;
	
	public Questao() {
		super();
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Integer getAno() {
		return ano;
	}
	
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public EArea getArea() {
		return EArea.getArea(area);
	}
	
	public void setArea(EArea area) {
		this.area = area.codigo;
	}

	public ETipoQuestao getProva() {
		return ETipoQuestao.getQuestao(prova);
	}
	
	public void setProva(ETipoQuestao prova) {
		this.prova = prova.codigo;
	}
	
	public EDisciplina getDisciplina() {
		return EDisciplina.getEnum(disciplina);
	}
	
	public void setDisciplina(EDisciplina disciplina) {
		this.disciplina = disciplina.codigo;
	}

	public Boolean getImagem() {
		if(imagem == null) {
			return false;
		}
		return imagem;
	}

	public void setImagem(Boolean imagem) {
		this.imagem = imagem;
	}
}
