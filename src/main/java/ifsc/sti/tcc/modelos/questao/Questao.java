package ifsc.sti.tcc.modelos.questao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import ifsc.sti.tcc.props.EArea;
import ifsc.sti.tcc.props.EDisciplina;
import ifsc.sti.tcc.props.EFormacao;
import ifsc.sti.tcc.props.ETipoQuestaoProva;

@Entity
@Table(name = "questao")

public abstract class Questao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6327854349745422560L;

	@Id
	@Column(name = "id_questao")
	private Long id;
	private Integer ano;
	
	@Column(columnDefinition="TEXT")
	private String descricao;
	
	
	private Integer area;
	private Integer prova;
	private Integer disciplina;
	private Integer tipoFormcao = EFormacao.ESPECIFICA.codigo;
	private Boolean imagem = false;
	
	@Column(columnDefinition="TEXT")
	private String imagemQuestao;
	private Integer numeroQuestao;
	
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
		this.descricao = descricao.replace("[MT]", "").replace("[FU]", "").replace("[TE]", "").trim();
	}
	
	public EArea getArea() {
		return EArea.getArea(area);
	}
	
	public void setArea(EArea area) {
		this.area = area.codigo;
	}

	public ETipoQuestaoProva getProva() {
		return ETipoQuestaoProva.getQuestao(prova);
	}
	
	public void setProva(ETipoQuestaoProva prova) {
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

	public String getImagemQuestao() {
		return imagemQuestao;
	}

	public void setImagemQuestao(String imagemQuestao) {
		this.imagemQuestao = imagemQuestao.replace("data:image/png;base64,", "").replace("data:image/jpg;base64,", "");
	}

	public Integer getNumeroQuestao() {
		return numeroQuestao;
	}

	public void setNumeroQuestao(Integer numeroQuestao) {
		this.numeroQuestao = numeroQuestao;
	}

	public EFormacao getTipoFormcao() {
		return EFormacao.getEnum(tipoFormcao);
	}

	public void setTipoFormcao(EFormacao tipoFormcao) {
		this.tipoFormcao = tipoFormcao.codigo;
	}
}
