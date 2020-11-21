package ifsc.sti.tcc.props;

public enum EDisciplina {
	
	DEFAULT (-1, "Sem disciplina", "Sem disciplina"),
	
	INTRODUCAO_A_PROGRAMACAO(0, "PROGRAMAÇÃO", "Programação"),
    ELETRONICA_DIGITAL(1, "ELETRÔNICA DIGITAL", "Eletrônica digital"),
    MATEMÁTICA_DISCRETA(2, "MATEMÁTICA DISCRETA", "Matemática discreta"),

    //	FASE 2
//    PROGRAMACAO_ORIENTADA_A_OBJETOS(3, "PROGRAMAÇÃO ORIENTADA A OBJETOS" , "P.O.O"),
    ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA(4, "ÁLGEBRA LINEAR E GEOMETRIA ANALÍTICA", "Álgebra Linear e Geometria analítica"),
    ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES(5, "ARQUITETURA E ORGANIZAÇÃO DE COMPUTADORES", "Arquitetura de computadores"),
//	    INTRODUCAO_AS_REDES_DE_COMPUTADORES(6, "INTRODUÇÃO ÀS REDES DE COMPUTADORES", "Intr"),
    LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO(7, "LINGUAGENS E PARADIGMAS DE PROGRAMAÇÃO", "Linguagem e paradigamas de programação"),

//	FASE 3
    ESTRUTURAS_DE_DADOS(8, "ESTRUTURAS DE DADOS", "Estrutura de dados"),
    SISTEMAS_OPERACIONAIS(9, "SISTEMAS OPERACIONAIS", "S.O"),
//	    DESENVOLVIMENTO_DE_APLICAÇÕES_ORIENTADAS_A_OBJETOS(10, "DESENVOLVIMENTO DE APLICAÇÕES ORIENTADAS A OBJETOS"),
    REDES_DE_COMPUTADORES(11, "REDES DE COMPUTADORES", "Redes de computadores"),
    CALCULO(12, "CÁLCULO", "Cálculo"),

//	FASE 3
//    LABORATORIO_DE_PROGRAMACAO(13, "LABORATÓRIO DE PROGRAMAÇÃO", "Programação"),
    BANCO_DE_DADOS(14, "BANCO DE DADOS", "Banco de dados"),
    COMPILADORES(15, "COMPILADORES", "Compiladores"),
    ENGENHARIA_DE_SOFTWARE(16, "ENGENHARIA DE SOFTWARE", "Engenharia de Software"),
    ESTATÍSTICA_E_PROBABILIDADE(17, "ESTATÍSTICA E PROBABILIDADE", "Estatística e probabilidade"),

    //	Fase 6
    COMPUTACAO_GRAFICA(18, "COMPUTAÇÃO GRÁFICA", "Computação Gráfica"),
    SEGURANÇA_COMPUTACIONAL(19, "SEGURANÇA COMPUTACIONAL", "Segurança computacional"),
    INTELIGENCIA_ARTIFICIAL(20, "INTELIGÊNCIAARTIFICIAL", "I.A"),
    SISTEMAS_DISTRIBUÍDOS(21, "SISTEMAS DISTRIBUÍDOS", "Sistemas Distribuídos"),

    //	Fase 7
    MODELAGEM_E_SIMULACAO(22, "MODELAGEM E SIMULAÇÃO", "Modelagem e simulação"),
    GERENCIA_DE_PROJETOS(23, "GERÊNCIA DE PROJETOS", "Gerência de projetos");


	EDisciplina(int aCodigo, String aDescricao, String aNome) {
		this.codigo = aCodigo;
		this.descricao = aDescricao;
		this.nome = aNome;
	}
	
	public int codigo;
	public String descricao;
	public String nome;
	
	public static EDisciplina getEnum(int aCod) {
		for (EDisciplina lSituacao :  EDisciplina.values()) {
			if(lSituacao.codigo == aCod) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}
	
	public static EDisciplina getEnum(String aSituacao) {
		for (EDisciplina lSituacao :  EDisciplina.values()) {
			if(lSituacao.descricao.equalsIgnoreCase(aSituacao)) {
				return lSituacao;
			}
		}
		return DEFAULT;
	}
	
}
