package ifsc.sti.tcc.utilidades.questaoenade;

import ifsc.sti.tcc.modelos.questao.Questao;
import ifsc.sti.tcc.modelos.questao.QuestaoAlternativa;
import ifsc.sti.tcc.modelos.questao.QuestaoDiscusiva;
import ifsc.sti.tcc.props.EArea;
import ifsc.sti.tcc.props.EDisciplina;
import ifsc.sti.tcc.props.EFormacao;
import ifsc.sti.tcc.props.ETipoQuestaoProva;

import java.util.ArrayList;
import java.util.List;

public class QuestaoEnade2008 {

    final static Integer ANO = 2008;
    static Integer INICIOQUESTAO = 1356;
    static Integer NUMEROQUESTAO = 1;

    public static List<Questao> register() {

        QuestaoAlternativa questaoAlternativa1 = new QuestaoAlternativa();
        questaoAlternativa1.setId(INICIOQUESTAO.longValue());
        questaoAlternativa1.setAno(ANO);
        questaoAlternativa1.setDescricao("O escritor Machado de Assis (1839-1908), cujo centenário de morte está sendo celebrado no presente ano, retratou na sua obra de ficção as grandes transformações políticas que aconteceram no Brasil nas últimas décadas do século XIX. O fragmento do romance Esaú e Jacó, a seguir transcrito, reflete o clima político-social vivido naquela época." +
                "Das imagens acima, as figuras referidas no fragmento do romance Esaú e Jacó são");
        questaoAlternativa1.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa1.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa1.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa1.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa1.setAlternativaCorreta("c");
        questaoAlternativa1.setImagem(true);
        questaoAlternativa1.setAlternativasA("I e III. ");
        questaoAlternativa1.setAlternativasB("I e V. ");
        questaoAlternativa1.setAlternativasC("II e III. ");
        questaoAlternativa1.setAlternativasD("II e IV.");
        questaoAlternativa1.setAlternativasE("II e V.");
        questaoAlternativa1.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa1.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa2 = new QuestaoAlternativa();
        questaoAlternativa2.setId(INICIOQUESTAO.longValue());
        questaoAlternativa2.setAno(ANO);
        questaoAlternativa2.setDescricao("Quando o homem não trata bem a natureza, a natureza não trata bem o homem.\n" +
                "Essa afirmativa reitera a necessária interação das diferentes espécies, representadas na imagem a seguir.\n" +
                "Depreende-se dessa imagem a");
        questaoAlternativa2.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa2.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa2.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa2.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa2.setAlternativaCorreta("e");
        questaoAlternativa2.setImagem(true);
        questaoAlternativa2.setAlternativasA("atuação do homem na clonagem de animais\n" +
                "pré-históricos. ");
        questaoAlternativa2.setAlternativasB("exclusão do homem na ameaça efetiva à sobrevivência\n" +
                "do planeta. ");
        questaoAlternativa2.setAlternativasC("ingerência do homem na reprodução de espécies em cativeiro.");
        questaoAlternativa2.setAlternativasD("mutação das espécies pela ação predatória do homem.");
        questaoAlternativa2.setAlternativasE("responsabilidade do homem na manutenção da\n" +
                "biodiversidade.");
        questaoAlternativa2.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa2.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa3 = new QuestaoAlternativa();
        questaoAlternativa3.setId(INICIOQUESTAO.longValue());
        questaoAlternativa3.setAno(ANO);
        questaoAlternativa3.setDescricao("A exposição aos raios ultravioleta tipo B (UVB) causa queimaduras na pele, que podem ocasionar lesões graves ao longo do tempo. Por essa razão, recomenda-se a utilização de filtros solares, que deixam passar apenas certa fração desses raios, indicada pelo Fator de Proteção Solar (FPS). Por exemplo, um protetor com FPS igual a 10 deixa passar apenas 1/10 (ou seja, retém 90%) dos raios UVB. Um protetor que retenha 95% dos raios UVB possui um FPS igual a");
        questaoAlternativa3.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa3.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa3.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa3.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa3.setAlternativaCorreta("d");

        questaoAlternativa3.setAlternativasA("95.");
        questaoAlternativa3.setAlternativasB("90.");
        questaoAlternativa3.setAlternativasC("50.");
        questaoAlternativa3.setAlternativasD("20.");
        questaoAlternativa3.setAlternativasE("5.");
        questaoAlternativa3.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa4 = new QuestaoAlternativa();
        questaoAlternativa4.setId(INICIOQUESTAO.longValue());
        questaoAlternativa4.setAno(ANO);
        questaoAlternativa4.setDescricao("CIDADÃS DE SEGUNDA CLASSE?\n" +
                "As melhores leis a favor das mulheres de cada país-membro da União Européia estão sendo reunidas por especialistas. O objetivo é compor uma legislação continental capaz de contemplar temas que vão da\n" +
                "contracepção à eqüidade salarial, da prostituição à aposentadoria. Contudo, uma legislação que assegure a inclusão social das cidadãs deve contemplar outros temas, além dos citados.\n" +
                "São dois os temas mais específicos para essa legislação:");
        questaoAlternativa4.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa4.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa4.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa4.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa4.setAlternativaCorreta("a");

        questaoAlternativa4.setAlternativasA("aborto e violência doméstica.");
        questaoAlternativa4.setAlternativasB("cotas raciais e assédio moral.\n");
        questaoAlternativa4.setAlternativasC("educação moral e trabalho.");
        questaoAlternativa4.setAlternativasD("estupro e imigração clandestina.");
        questaoAlternativa4.setAlternativasE("liberdade de expressão e divórcio.");
        questaoAlternativa4.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa5 = new QuestaoAlternativa();
        questaoAlternativa5.setId(INICIOQUESTAO.longValue());
        questaoAlternativa5.setAno(ANO);
        questaoAlternativa5.setDescricao("A foto abaixo, da americana Margaret Bourke-White (1904-71), apresenta desempregados na fila de alimentos durante a Grande Depressão, que se iniciou em 1929.\n" +
                "Além da preocupação com a perfeita composição, a artista, nessa foto, revela ");
        questaoAlternativa5.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa5.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa5.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa5.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa5.setAlternativaCorreta("d");
        questaoAlternativa5.setImagem(true);
        questaoAlternativa5.setAlternativasA("a capacidade de organização do operariado.");
        questaoAlternativa5.setAlternativasB("a esperança de um futuro melhor para negros.");
        questaoAlternativa5.setAlternativasC("a possibilidade de ascensão social universal.");
        questaoAlternativa5.setAlternativasD("as contradições da sociedade capitalista.");
        questaoAlternativa5.setAlternativasE("o consumismo de determinadas classes sociais.");
        questaoAlternativa5.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa5.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa6 = new QuestaoAlternativa();
        questaoAlternativa6.setId(INICIOQUESTAO.longValue());
        questaoAlternativa6.setAno(ANO);
        questaoAlternativa6.setDescricao("No mapa abaixo, registra-se uma prática exemplar para que as cidades se tornem sustentáveis de fato, favorecendo as trocas horizontais, ou seja, associando e conectando territórios entre si, evitando desperdícios no uso de energia.\n" +
                "Essa prática exemplar apóia-se, fundamentalmente, na");
        questaoAlternativa6.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa6.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa6.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa6.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa6.setAlternativaCorreta("b");
        questaoAlternativa6.setImagem(true);
        questaoAlternativa6.setAlternativasA("centralização de decisões políticas.");
        questaoAlternativa6.setAlternativasB("atuação estratégica em rede.");
        questaoAlternativa6.setAlternativasC("fragmentação de iniciativas institucionais.");
        questaoAlternativa6.setAlternativasD("hierarquização de autonomias locais.");
        questaoAlternativa6.setAlternativasE("unificação regional de impostos.");
        questaoAlternativa6.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa6.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa7 = new QuestaoAlternativa();
        questaoAlternativa7.setId(INICIOQUESTAO.longValue());
        questaoAlternativa7.setAno(ANO);
        questaoAlternativa7.setDescricao("Apesar do progresso verificado nos últimos anos, o Brasil continua sendo um país em que há uma grande desigualdade de renda entre os cidadãos. Uma forma de se constatar este fato é por meio da Curva de Lorenz, que fornece, para cada valor de x entre 0 e 100, o percentual da renda total do País auferido pelos x% de brasileiros de menor renda. Por exemplo, na Curva de Lorenz para 2004, apresentada ao lado, constata-se que a renda total dos 60% de menor renda representou apenas 20% da renda total.\n" +
                "De acordo com o mesmo gráfico, o percentual da renda total correspondente aos 20% de maior renda foi, aproximadamente, igual a");
        questaoAlternativa7.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa7.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa7.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa7.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa7.setAlternativaCorreta("d");
        questaoAlternativa7.setImagem(true);
        questaoAlternativa7.setAlternativasA("20%.");
        questaoAlternativa7.setAlternativasB("40%.");
        questaoAlternativa7.setAlternativasC("50%.");
        questaoAlternativa7.setAlternativasD("60%.");
        questaoAlternativa7.setAlternativasE("80%.");
        questaoAlternativa7.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa7.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa8 = new QuestaoAlternativa();
        questaoAlternativa8.setId(INICIOQUESTAO.longValue());
        questaoAlternativa8.setAno(ANO);
        questaoAlternativa8.setDescricao("O filósofo alemão Friedrich Nietzsche (1844-1900), talvez o pensador moderno mais incômodo e provocativo, influenciou várias gerações e movimentos artísticos. O Expressionismo, que teve forte influência desse filósofo, contribuiu para o pensamento contrário ao racionalismo moderno e ao trabalho mecânico, através do embate entre a razão e a fantasia. As obras desse movimento deixam de priorizar o padrão de beleza tradicional para enfocar a instabilidade da vida, marcada por angústia, dor, inadequação do artista diante da realidade.\n" +
                "Das obras a seguir, a que reflete esse enfoque artístico é");
        questaoAlternativa8.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa8.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa8.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa8.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa8.setAlternativaCorreta("c");
        questaoAlternativa8.setAlternativaImagem(true);
        questaoAlternativa7.setAlternativasA("COLOCAR IMAGEM ALTERNATIVA");
        questaoAlternativa7.setAlternativasB("COLOCAR IMAGEM ALTERNATIVA");
        questaoAlternativa7.setAlternativasC("COLOCAR IMAGEM ALTERNATIVA");
        questaoAlternativa7.setAlternativasD("COLOCAR IMAGEM ALTERNATIVA");
        questaoAlternativa7.setAlternativasE("COLOCAR IMAGEM ALTERNATIVA");
        questaoAlternativa8.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoDiscusiva questaoDiscursiva9 = new QuestaoDiscusiva();
        questaoDiscursiva9.setId(INICIOQUESTAO.longValue());
        questaoDiscursiva9.setAno(ANO);
        questaoDiscursiva9.setDescricao("DIREITOS HUMANOS EM QUESTÃO\n" +
                "$\\newline$O caráter universalizante dos direitos do homem (...) não é da ordem do saber teórico, mas do operatório ou prático: eles são invocados para agir, desde o princípio, em qualquer situação dada.\n" +
                "$\\newline$François JULIEN, filósofo e sociólogo.\n" +
                "$\\newline$Neste ano, em que são comemorados os 60 anos da Declaração Universal dos Direitos Humanos, novas perspectivas e concepções incorporam-se à agenda pública brasileira. Uma das novas perspectivas em foco é a visão mais integrada dos direitos econômicos, sociais, civis, políticos e, mais recentemente, ambientais, ou seja, trata-se da integralidade ou indivisibilidade dos direitos humanos. Dentre as novas concepções de direitos, destacam-se:\n" +
                "$\\newline$- a habitação como moradia digna e não apenas como necessidade de abrigo e proteção;\n" +
                "$\\newline$- a segurança como bem-estar e não apenas como necessidade de vigilância e punição;\n" +
                "$\\newline$- o trabalho como ação para a vida e não apenas como necessidade de emprego e renda.\n" +
                "$\\newline$Tendo em vista o exposto abaixo, selecione uma das concepções destacadas e esclareça por que ela representa um avanço para o exercício pleno da cidadania, na perspectiva da integralidade dos direitos humanos.\n" +
                "$\\newline$Seu texto deve ter entre 8 e 10 linhas.");
        questaoDiscursiva9.setTipoFormcao(EFormacao.GERAL);
        questaoDiscursiva9.setProva(ETipoQuestaoProva.ENADE);
        questaoDiscursiva9.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoDiscursiva9.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoDiscursiva9.setResposta("A concepção que foi destacada nos três itens corresponde à ultrapassagem da mera noção de\n" +
                "necessidade humana básica para aquela de direito humano, como um princípio de ação, na medida\n" +
                "\n" +
                "em que não se trata de reconhecer apenas uma carência a ser suprida, mas a possibilidade de exi-\n" +
                "gência da dignidade e qualidade de vida, através da efetivação do direito (à habitação/à segurança/ao\n" +
                "\n" +
                "trabalho). Assim, o trabalho como ação qualificada está em correspondência com a possibilidade de\n" +
                "uma moradia adequada, dentro de uma ambiência de bem-estar cidadão, numa perspectiva integrada,\n" +
                "isto é, remetendo-se esses direitos uns aos outros.");
        questaoDiscursiva9.setImagem(true);
        questaoDiscursiva9.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoDiscursiva9.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoDiscusiva questaoDiscursiva10 = new QuestaoDiscusiva();
        questaoDiscursiva10.setId(INICIOQUESTAO.longValue());
        questaoDiscursiva10.setAno(ANO);
        questaoDiscursiva10.setDescricao("");
        questaoDiscursiva10.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoDiscursiva10.setTipoFormcao(EFormacao.GERAL);
        questaoDiscursiva10.setProva(ETipoQuestaoProva.ENADE);
        questaoDiscursiva10.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoDiscursiva10.setResposta("Com base nos dados veiculados pelos textos motivadores versando sobre o fraco desempenho dos alunos nas avaliações internacionais (PISA) e a opinião favorável dos professores quanto à sua preparação para o desempenho docente, dos pais em relação ao que auferem das escolas onde seus filhos estudam e dos próprios discentes que consideram o ensino recebido como de boa qualidade, espera-se que seja apontada a contradição existente entre esses pontos de vista e os dados oficiais.\n" +
                "Assim, o estudante deve produzir um texto dissertativo, fundamentado em argumentos (texto opinativo), no padrão escrito formal da Língua Portuguesa, sobre a contradição aludida (opinião dos pais, professores e alunos vs dados oficiais) e as suas causas. ");
        questaoDiscursiva10.setImagem(true);
        questaoDiscursiva10.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoDiscursiva10.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa11 = new QuestaoAlternativa();
        questaoAlternativa11.setId(INICIOQUESTAO.longValue());
        questaoAlternativa11.setAno(ANO);
        questaoAlternativa11.setDescricao("Com relação às diferentes tecnologias de armazenamento de dados, julgue os itens a seguir.\n" +
                "$\\newline$I Quando a tensão de alimentação de uma memória ROM é desligada, os dados dessa memória são apagados. Por isso, esse tipo de memória é denominado volátil.\n" +
                "$\\newline$II O tempo de acesso à memória RAM é maior que o tempo de acesso a um registrador da unidade central de processamento (UCP).\n" +
                "$\\newline$III O tempo de acesso à memória cache da UCP é menor que o tempo de acesso a um disco magnético.\n" +
                "$\\newline$IV O tempo de acesso à memória cache da UCP é maior que o tempo de acesso à memória RAM.\n" +
                "$\\newline$Estão certos apenas os itens");
        questaoAlternativa11.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa11.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa11.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa11.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa11.setAlternativaCorreta("c");

        questaoAlternativa11.setAlternativasA("I e III.");
        questaoAlternativa11.setAlternativasB("II e III.");
        questaoAlternativa11.setAlternativasC("II e III.");
        questaoAlternativa11.setAlternativasD("II e IV.");
        questaoAlternativa11.setAlternativasE("III e IV.");
        questaoAlternativa11.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa12 = new QuestaoAlternativa();
        questaoAlternativa12.setId(INICIOQUESTAO.longValue());
        questaoAlternativa12.setAno(ANO);
        questaoAlternativa12.setDescricao("Ao longo de todo o desenvolvimento do software, devem ser aplicadas atividades de garantia de qualidade de software (GQS), entre as quais se encontra a atividade de teste. Um dos critérios de teste utilizados para gerar casos de teste é o denominado critério dos caminhos básicos, cujo número de caminhos pode ser determinado com\n" +
                "base na complexidade ciclomática. Considerando-se o grafo de fluxo de controle apresentado na figura abaixo, no qual os nós representam os blocos de comandos e as arestas representam a transferência de controle, qual a quantidade de caminhos básicos que devem ser testados no programa associado a esse grafo de fluxo de controle, sabendo-se que essa quantidade é igual à complexidade ciclomática mais um?");
        questaoAlternativa12.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa12.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa12.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa12.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa12.setAlternativaCorreta("c");
        questaoAlternativa12.setImagem(true);
        questaoAlternativa12.setAlternativasA("1.");
        questaoAlternativa12.setAlternativasB("3.");
        questaoAlternativa12.setAlternativasC("4.");
        questaoAlternativa12.setAlternativasD("7.");
        questaoAlternativa12.setAlternativasE("8.");
        questaoAlternativa12.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa12.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa13 = new QuestaoAlternativa();
        questaoAlternativa13.setId(INICIOQUESTAO.longValue());
        questaoAlternativa13.setAno(ANO);
        questaoAlternativa13.setDescricao("Considerando o conjunto A = {1, 2, 3, 4, 5, 6}, qual opção\n" +
                "corresponde a uma partição desse conjunto?");
        questaoAlternativa13.setArea(EArea.MATEMATICA);
        questaoAlternativa13.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa13.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa13.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa13.setAlternativaCorreta("a");

        questaoAlternativa13.setAlternativasA("{{1}, {2}, {3}, {4}, {5}, {6}}\n");
        questaoAlternativa13.setAlternativasB("{{1}, {1,2}, {3,4}, {5, 6}}");
        questaoAlternativa13.setAlternativasC("{{ }, {1, 2, 3}, {4, 5, 6}}");
        questaoAlternativa13.setAlternativasD("{{1, 2, 3}, {5, 6}}");
        questaoAlternativa13.setAlternativasE("{{1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}}");
        questaoAlternativa13.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa14 = new QuestaoAlternativa();
        questaoAlternativa14.setId(INICIOQUESTAO.longValue());
        questaoAlternativa14.setAno(ANO);
        questaoAlternativa14.setDescricao("Um programador propôs um algoritmo não-recursivo para o percurso em preordem de uma árvore binária com as seguintes características.\n" +
                "$\\newline$- Cada nó da árvore binária é representado por um registro com três campos: chave, que armazena seu identificador; esq e dir, ponteiros para os filhos esquerdo e direito, respectivamente.\n" +
                "$\\newline$- O algoritmo deve ser invocado inicialmente tomando o ponteiro para o nó raiz da árvore binária como argumento.\n" +
                "$\\newline$- O algoritmo utiliza push() e pop() como funções auxiliares de empilhamento e desempilhamento de ponteiros para nós de árvore binária, respectivamente.\n" +
                "$\\newline$A seguir, está apresentado o algoritmo proposto, em que 8 representa o ponteiro nulo.\n" +
                "$\\newline$Procedimento preordem (ptraiz : PtrNoArvBin)\n" +
                "$\\newline$ Var ptr : PtrNoArvBin;\n" +
                "$\\newline$ ptr := ptraiz;\n" +
                "$\\newline$ Enquanto (ptr … 8) Faça\n" +
                "$\\newline$ escreva (ptr8.chave);\n" +
                "$\\newline$ Se (ptr8.dir … 8) Então\n" +
                "$\\newline$ push(ptr8.dir);\n" +
                "$\\newline$ Se (ptr8.esq … 8) Então\n" +
                "$\\newline$ push(ptr8.esq);\n" +
                "$\\newline$ ptr := pop();\n" +
                "$\\newline$ Fim_Enquanto\n" +
                "$\\newline$Fim_Procedimento\n" +
                "$\\newline$Com base nessas informações e supondo que a raiz de uma árvore binária com n nós seja passada ao procedimento preordem(), julgue os itens seguintes.\n" +
                "$\\newline$I O algoritmo visita cada nó da árvore binária exatamente uma vez ao longo do percurso.\n" +
                "$\\newline$II O algoritmo só funcionará corretamente se o procedimento pop() for projetado de forma a retornar 8 caso a pilha esteja vazia.\n" +
                "$\\newline$III Empilhar e desempilhar ponteiros para nós da árvore são operações que podem ser implementadas com custo constante.\n" +
                "$\\newline$IV A complexidade do pior caso para o procedimento preordem() é O(n).\n" +
                "$\\newline$Assinale a opção correta.");
        questaoAlternativa14.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa14.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa14.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa14.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa14.setAlternativaCorreta("e");

        questaoAlternativa14.setAlternativasA("Apenas um item está certo.");
        questaoAlternativa14.setAlternativasB("Apenas os itens I e IV estão certos.");
        questaoAlternativa14.setAlternativasC("Apenas os itens I, II e III estão certos.");
        questaoAlternativa14.setAlternativasD("Apenas os itens II, III e IV estão certos.");
        questaoAlternativa14.setAlternativasE("Todos os itens estão certos.");
        questaoAlternativa14.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa15 = new QuestaoAlternativa();
        questaoAlternativa15.setId(INICIOQUESTAO.longValue());
        questaoAlternativa15.setAno(ANO);
        questaoAlternativa15.setDescricao("Além do acesso a páginas html, a Internet tem sido usada\n" +
                "cada vez mais para a cópia e troca de arquivos de\n" +
                "músicas, filmes, jogos e programas. Muitos desses\n" +
                "arquivos possuem direitos autorais e restrições de uso.\n" +
                "Considerando o uso das redes ponto-a-ponto para a troca\n" +
                "de arquivos de músicas, filmes, jogos e programas na\n" +
                "Internet, a quem cabe a identificação e o cumprimento das\n" +
                "restrições de uso associados a esses arquivos?");
        questaoAlternativa15.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa15.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa15.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa15.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa15.setAlternativaCorreta("b");

        questaoAlternativa15.setAlternativasA("aos programas de troca de arquivo");
        questaoAlternativa15.setAlternativasB("aos usuários");
        questaoAlternativa15.setAlternativasC("ao sistema operacional");
        questaoAlternativa15.setAlternativasD("aos produtores dos arquivos");
        questaoAlternativa15.setAlternativasE("aos equipamentos roteadores da Internet");
        questaoAlternativa15.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa16 = new QuestaoAlternativa();
        questaoAlternativa16.setId(INICIOQUESTAO.longValue());
        questaoAlternativa16.setAno(ANO);
        questaoAlternativa16.setDescricao("O gerenciamento de configuração de software (GCS) é\n" +
                "uma atividade que deve ser realizada para identificar,\n" +
                "controlar, auditar e relatar as modificações que ocorrem\n" +
                "durante todo o desenvolvimento ou mesmo durante a fase\n" +
                "de manutenção, depois que o software for entregue ao\n" +
                "cliente. O GCS é embasado nos chamados itens de\n" +
                "configuração, que são produzidos como resultado das\n" +
                "atividades de engenharia de software e que ficam\n" +
                "armazenados em um repositório. Com relação ao GCS,\n" +
                "analise as duas asserções apresentadas a seguir.\n" +
                "No GCS, o processo de controle das modificações\n" +
                "obedece ao seguinte fluxo: começa com um pedido de\n" +
                "modificação de um item de configuração, que leva à\n" +
                "aceitação ou não desse pedido e termina com a\n" +
                "atualização controlada desse item no repositório\n" +
                "porque\n" +
                "o controle das modificações dos itens de configuração\n" +
                "baseia-se nos processos de check-in e check-out que\n" +
                "fazem, respectivamente, a inserção de um item de\n" +
                "configuração no repositório e a retirada de itens de\n" +
                "configuração do repositório para efeito de realização das\n" +
                "modificações.\n" +
                "Acerca dessas asserções, assinale a opção correta.");
        questaoAlternativa16.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa16.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa16.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa16.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa16.setAlternativaCorreta("b");

        questaoAlternativa16.setAlternativasA("As duas asserções são proposições verdadeiras, e a\n" +
                "segunda é uma justificativa correta da primeira.");
        questaoAlternativa16.setAlternativasB("As duas asserções são proposições verdadeiras, e a\n" +
                "segunda não é uma justificativa correta da primeira.");
        questaoAlternativa16.setAlternativasC("A primeira asserção é uma proposição verdadeira, e a\n" +
                "segunda é uma proposição falsa.");
        questaoAlternativa16.setAlternativasD("A primeira asserção é uma proposição falsa, e a segunda é uma proposição verdadeira.\n");
        questaoAlternativa16.setAlternativasE("As duas asserções são proposições falsas.");
        questaoAlternativa16.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa17 = new QuestaoAlternativa();
        questaoAlternativa17.setId(INICIOQUESTAO.longValue());
        questaoAlternativa17.setAno(ANO);
        questaoAlternativa17.setDescricao("Uma fórmula bem formada da lógica de predicados é válida\n" +
                "se ela é verdadeira para todas as interpretações possíveis.\n" +
                "Considerando essa informação, analise as duas asserções\n" +
                "apresentadas a seguir.\n" +
                "A fórmula bem formada $(\\exists x)P(x)\\rightarrow(\\forall x)P(x)$ é válida\n" +
                "porque,\n" +
                "em qualquer interpretação de uma fórmula da lógica de\n" +
                "predicados, se todo elemento do conjunto universo tem a\n" +
                "propriedade P, então existe um elemento do conjunto que\n" +
                "tem essa propriedade.\n" +
                "Assinale a opção correta com relação a essas asserções.");
        questaoAlternativa17.setArea(EArea.MATEMATICA);
        questaoAlternativa17.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa17.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa17.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa17.setAlternativaCorreta("d");

        questaoAlternativa17.setAlternativasA("As duas asserções são proposições verdadeiras, e a\n" +
                "segunda é uma justificativa correta da primeira.");
        questaoAlternativa17.setAlternativasB("As duas asserções são proposições verdadeiras, e a\n" +
                "segunda não é uma justificativa correta da primeira.");
        questaoAlternativa17.setAlternativasC("A primeira asserção é uma proposição verdadeira, e a\n" +
                "segunda é uma proposição falsa.");
        questaoAlternativa17.setAlternativasD("A primeira asserção é uma proposição falsa, e a\n" +
                "segunda é uma proposição verdadeira.");
        questaoAlternativa17.setAlternativasE("As duas asserções são proposições falsas.");
        questaoAlternativa17.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa18 = new QuestaoAlternativa();
        questaoAlternativa18.setId(INICIOQUESTAO.longValue());
        questaoAlternativa18.setAno(ANO);
        questaoAlternativa18.setDescricao("Os números de Fibonacci constituem uma seqüência\n" +
                "de números na qual os dois primeiros elementos são 0 e 1\n" +
                "e os demais, a soma dos dois elementos imediatamente\n" +
                "anteriores na seqüência. Como exemplo, a seqüência\n" +
                "formada pelos 10 primeiros números de Fibonacci é: 0, 1,\n" +
                "1, 2, 3, 5, 8, 13, 21, 34. Mais precisamente, é possível\n" +
                "definir os números de Fibonacci pela seguinte relação de\n" +
                "recorrência:\n" +
                "$\\newline$fib (n) = 0, se n = 0\n" +
                "$\\newline$fib (n) = 1, se n = 1\n" +
                "$\\newline$fib (n) = fib (n ! 1) + fib (n ! 2), se n > 1\n" +
                "$\\newline$Abaixo, apresenta-se uma implementação em\n" +
                "linguagem funcional para essa relação de recorrência:\n" +
                "$\\newline$fib :: Integer -> Integer\n" +
                "$\\newline$fib 0 = 0\n" +
                "$\\newline$fib 1 = 1\n" +
                "$\\newline$fib n = fib (n ! 1) + fib (n ! 2)\n" +
                "$\\newline$Considerando que o programa acima não reutilize\n" +
                "resultados previamente computados, quantas chamadas\n" +
                "são feitas à função fib para computar fib 5?");
        questaoAlternativa18.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa18.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa18.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa18.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa18.setAlternativaCorreta("c");

        questaoAlternativa18.setAlternativasA("11");
        questaoAlternativa18.setAlternativasB("12");
        questaoAlternativa18.setAlternativasC("15");
        questaoAlternativa18.setAlternativasD("24");
        questaoAlternativa18.setAlternativasE("25");
        questaoAlternativa18.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa19 = new QuestaoAlternativa();
        questaoAlternativa19.setId(INICIOQUESTAO.longValue());
        questaoAlternativa19.setAno(ANO);
        questaoAlternativa19.setDescricao("Uma alternativa para o aumento de desempenho de sistemas computacionais é o uso de processadores com múltiplos núcleos, chamados multicores. Nesses sistemas, cada núcleo, normalmente, tem as funcionalidades completas de um processador, já sendo comuns, atualmente, configurações com 2, 4 ou mais núcleos. Com relação ao uso de processadores multicores, e sabendo que threads são estruturas de execução associadas a um processo, que compartilham suas áreas de código e dados, mas mantêm contextos independentes, analise as seguintes asserções.\n" +
                "Ao dividirem suas atividades em múltiplas threads que podem ser executadas paralelamente, aplicações podem se beneficiar mais efetivamente dos diversos núcleos dos processadores multicores\n" +
                "porque\n" +
                "o sistema operacional nos processadores multicores pode alocar os núcleos existentes para executar simultaneamente diversas seqüências de código, sobrepondo suas execuções e, normalmente, reduzindo o tempo de resposta das aplicações às quais estão associadas.\n" +
                "Acerca dessas asserções, assinale a opção correta.");
        questaoAlternativa19.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa19.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa19.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa19.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa19.setAlternativaCorreta("a");

        questaoAlternativa19.setAlternativasA("As duas asserções são proposições verdadeiras, e a segunda é uma justificativa correta da primeira.");
        questaoAlternativa19.setAlternativasB("As duas asserções são proposições verdadeiras, mas a segunda não é uma justificativa correta da primeira.");
        questaoAlternativa19.setAlternativasC("A primeira asserção é uma proposição verdadeira, e a segunda, uma proposição falsa.");
        questaoAlternativa19.setAlternativasD("A primeira asserção é uma proposição falsa, e a segunda, uma proposição verdadeira.");
        questaoAlternativa19.setAlternativasE("Tanto a primeira quanto a segunda asserções são proposições falsas.");
        questaoAlternativa19.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        //WARNING Questão precisa que o usuário desenhe a resposta, não sendo possivel implementar
        QuestaoAlternativa questaoAlternativa20 = new QuestaoAlternativa();
        questaoAlternativa20.setId(INICIOQUESTAO.longValue());
        questaoAlternativa20.setAno(ANO);
        questaoAlternativa20.setDescricao("Anulada");
        questaoAlternativa20.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa20.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa20.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa20.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa20.setAlternativaCorreta("*");

        questaoAlternativa20.setAlternativasA("Anulada");
        questaoAlternativa20.setAlternativasB("Anulada");
        questaoAlternativa20.setAlternativasC("Anulada");
        questaoAlternativa20.setAlternativasD("Anulada");
        questaoAlternativa20.setAlternativasE("Anulada");
        questaoAlternativa20.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa21 = new QuestaoAlternativa();
        questaoAlternativa21.setId(INICIOQUESTAO.longValue());
        questaoAlternativa21.setAno(ANO);
        questaoAlternativa21.setDescricao("Considere a relação EMPREGADO ($\\underline{NumeroEmp}$, RG, nome, sobrenome, salario, endereco), em que o atributo grifado corresponde à chave primária da relação. Suponha que se deseje realizar as seguintes consultas:\n" +
                "$\\newline$1 Listar o nome dos empregados com sobrenome Silva;\n" +
                "$\\newline$2 Listar o nome dos empregados em ordem crescente de seus sobrenomes.\n" +
                "$\\newline$Em relação à definição de um índice sobre o atributo sobrenome para melhorar o desempenho das consultas acima, julgue os itens a seguir.\n" +
                "$\\newline$I Um índice que implemente Árvore-B+ será adequado para melhorar o desempenho da consulta 1.\n" +
                "$\\newline$II Um índice que implemente Árvore-B+ será adequado para melhorar o desempenho da consulta 2.\n" +
                "$\\newline$III Um índice que implemente uma função hash será adequado para melhorar o desempenho da consulta 1.\n" +
                "$\\newline$IV Um índice que implemente uma função hash será adequado para melhorar o desempenho da consulta 2.\n" +
                "$\\newline$Assinale a opção correta.");
        questaoAlternativa21.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa21.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa21.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa21.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa21.setAlternativaCorreta("d");

        questaoAlternativa21.setAlternativasA("Apenas um item está certo.");
        questaoAlternativa21.setAlternativasB("Apenas os itens I e II estão certos.");
        questaoAlternativa21.setAlternativasC("Apenas os itens III e IV estão certos.\n");
        questaoAlternativa21.setAlternativasD("Apenas os itens I, II e III estão certos.");
        questaoAlternativa21.setAlternativasE("Todos os itens estão certos.");
        questaoAlternativa21.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa22 = new QuestaoAlternativa();
        questaoAlternativa22.setId(INICIOQUESTAO.longValue());
        questaoAlternativa22.setAno(ANO);
        questaoAlternativa22.setDescricao("Qual tipo de software tradutor deve ser utilizado para\n" +
                "programas em geral, quando a velocidade de execução é\n" +
                "uma exigência de alta prioridade?");
        questaoAlternativa22.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa22.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa22.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa22.setDisciplina(EDisciplina.COMPILADORES);
        questaoAlternativa22.setAlternativaCorreta("a");

        questaoAlternativa22.setAlternativasA("compiladores");
        questaoAlternativa22.setAlternativasB("interpretadores");
        questaoAlternativa22.setAlternativasC("tradutores híbridos");
        questaoAlternativa22.setAlternativasD("macroprocessadores");
        questaoAlternativa22.setAlternativasE("interpretadores de macroinstruções");
        questaoAlternativa22.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa23 = new QuestaoAlternativa();
        questaoAlternativa23.setId(INICIOQUESTAO.longValue());
        questaoAlternativa23.setAno(ANO);
        questaoAlternativa23.setDescricao("Considere o esquema de banco de dados relacional apresentado a seguir, formado por 4 relações, que representa o conjunto de estudantes de uma universidade que podem, ou não, morar em repúblicas (moradias compartilhadas por estudantes). A relação Estudante foi modelada como um subconjunto da relação Pessoa.\n" +
                "Considere que os atributos grifados correspondam à chave primária da respectiva relação e os atributos que são seguidos da palavra referencia sejam chaves estrangeiras.\n" +
                "$\\newline$Pessoa($\\underline{IdPessoa}$:integer, Nome:varchar(40),\n" +
                "$\\newline$Endereco:varchar(40))\n" +
                "$\\newline$FonePessoa($\\underline{IdPessoa}$:integer referencia Pessoa,\n" +
                "$\\underline{DDD}$:varchar(3), $\\underline{Prefixo}$:char(4), $\\underline{Nro}$:char(4))\n" +
                "$\\newline$Republica($\\underline{IdRep}$:integer, Nome:varchar(30),\n" +
                "$\\newline$Endereco:varchar(40))\n" +
                "$\\newline$Estudante($\\underline{RA}$:integer, Email:varchar(30),\n" +
                "$\\newline$IdPessoa:integer referencia Pessoa,\n" +
                "$\\newline$IdRep:integer referencia Republica)\n" +
                "$\\newline$Suponha que existam as seguintes tuplas no banco de dados:\n" +
                "$\\newline$Pessoa(1, ‘José Silva’, ‘Rua 1, 20’);\n" +
                "$\\newline$Republica(20, ‘Várzea’, ‘Rua Chaves, 2001’)\n" +
                "$\\newline$Qual opção apresenta apenas tuplas válidas para esse esquema de banco de dados relacional?");
        questaoAlternativa23.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa23.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa23.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa23.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa23.setAlternativaCorreta("e");

        questaoAlternativa23.setAlternativasA("Estudante(10, ‘jsilva@ig.com.br’, null, 20);\n" +
                "FonePessoa(10, ‘019’, ‘3761’, ‘1370’)");
        questaoAlternativa23.setAlternativasB("Estudante(10, ‘jsilva@ig.com.br’, 1, null);\n" +
                "FonePessoa(10, ‘019’, ‘3761’, ‘1370’)");
        questaoAlternativa23.setAlternativasC("Estudante(10, ‘jsilva@ig.com.br’, 1, 20);\n" +
                "FonePessoa(1, null, ‘3761’, ‘1370’)");
        questaoAlternativa23.setAlternativasD("Estudante(10, ‘jsilva@ig.com.br’, 1, 50);\n" +
                "FonePessoa(1, ‘019’, ‘3761’, ‘1370’)");
        questaoAlternativa23.setAlternativasE("Estudante(10, ‘jsilva@ig.com.br’, 1, null);\n" +
                "FonePessoa(1, ‘019’, ‘3761’, ‘1370’)");
        questaoAlternativa23.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa24 = new QuestaoAlternativa();
        questaoAlternativa24.setId(INICIOQUESTAO.longValue());
        questaoAlternativa24.setAno(ANO);
        questaoAlternativa24.setDescricao("Assinale a opção correta.");
        questaoAlternativa24.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa24.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa24.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa24.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
        questaoAlternativa24.setAlternativaCorreta("e");
        questaoAlternativa24.setImagem(true);
        questaoAlternativa24.setAlternativasA("Apenas um item está certo.");
        questaoAlternativa24.setAlternativasB("Apenas os itens I e II estão certos.");
        questaoAlternativa24.setAlternativasC("Apenas os itens I e III estão certos.");
        questaoAlternativa24.setAlternativasD("Apenas os itens II e III estão certos.");
        questaoAlternativa24.setAlternativasE("Todos os itens estão certos.");
        questaoAlternativa24.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa24.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa25 = new QuestaoAlternativa();
        questaoAlternativa25.setId(INICIOQUESTAO.longValue());
        questaoAlternativa25.setAno(ANO);
        questaoAlternativa25.setDescricao("A figura abaixo ilustra uma imagem binária com pixels brancos formando retas sobre um fundo preto. Com relação à aplicação de transformadas sobre essa imagem, assinale a opção correta. ");
        questaoAlternativa25.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa25.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa25.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa25.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa25.setAlternativaCorreta("e");
        questaoAlternativa25.setImagem(true);
        questaoAlternativa25.setAlternativasA("A transformada de Fourier, quando aplicada à imagem descrita, produz como resultado um mapa de freqüências que equivale ao histograma dos níveis de cinza das retas presentes.");
        questaoAlternativa25.setAlternativasB("A transformada de Hadamard da imagem\n" +
                "apresentada tem resultado equivalente à aplicação de um filtro passa-baixas, o que destaca as retas existentes.");
        questaoAlternativa25.setAlternativasC("Ao se aplicar a transformada da distância à imagem binária, considerando pixels brancos como objetos, são geradas as distâncias entre as retas presentes e o centro da imagem, o que permite identificar as equações das retas formadas na imagem.");
        questaoAlternativa25.setAlternativasD("O uso da transformada dos cossenos produz uma lista dos coeficientes lineares e angulares das diversas retas existentes nessa imagem binária.");
        questaoAlternativa25.setAlternativasE("O resultado da aplicação da transformada de Hough usando parametrização de retas é um mapa cujos picos indicam os pixels colineares, permitindo que sejam identificados coeficientes que descrevem as\n" +
                "diversas retas formadas na imagem.");
        questaoAlternativa25.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa25.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa26 = new QuestaoAlternativa();
        questaoAlternativa26.setId(INICIOQUESTAO.longValue());
        questaoAlternativa26.setAno(ANO);
        questaoAlternativa26.setDescricao("As figuras I e II apresentam duas imagens, ambas com resolução de 246 pixels × 300 pixels, sendo que a figura I apresenta 256 níveis de cinza e a figura II, 4 níveis de cinza. Considere que a imagem da figura I seja a original, tendo sido manipulada em um único atributo para gerar a imagem da figura II. Nessa situação, em qual atributo se diferenciam as imagens I e II acima?");
        questaoAlternativa26.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa26.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa26.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa26.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa26.setAlternativaCorreta("b");
        questaoAlternativa26.setImagem(true);
        questaoAlternativa26.setAlternativasA("resolução");
        questaoAlternativa26.setAlternativasB("quantização");
        questaoAlternativa26.setAlternativasC("iluminação");
        questaoAlternativa26.setAlternativasD("escala");
        questaoAlternativa26.setAlternativasE("amostragem espacial");
        questaoAlternativa26.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa26.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa27 = new QuestaoAlternativa();
        questaoAlternativa27.setId(INICIOQUESTAO.longValue());
        questaoAlternativa27.setAno(ANO);
        questaoAlternativa27.setDescricao("Em redes locais de computadores, o protocolo de controle de acesso ao meio define um conjunto de regras que devem ser adotadas pelos múltiplos dispositivos para compartilhar o meio físico de transmissão. No caso de uma rede Ethernet IEEE 802.3 conectada fisicamente a um concentrador (hub), em que abordagem se baseia o protocolo de controle de acesso ao meio?");
        questaoAlternativa27.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa27.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa27.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa27.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa27.setAlternativaCorreta("d");

        questaoAlternativa27.setAlternativasA("na passagem de permissão em anel");
        questaoAlternativa27.setAlternativasB("na ordenação com contenção");
        questaoAlternativa27.setAlternativasC("na ordenação sem contenção");
        questaoAlternativa27.setAlternativasD("na contenção com detecção de colisão");
        questaoAlternativa27.setAlternativasE("na arbitragem centralizada");
        questaoAlternativa27.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa28 = new QuestaoAlternativa();
        questaoAlternativa28.setId(INICIOQUESTAO.longValue());
        questaoAlternativa28.setAno(ANO);
        questaoAlternativa28.setDescricao("A que classes corresponderiam, respectivamente, os objetos O1, O2 e O3?");
        questaoAlternativa28.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa28.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa28.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa28.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa28.setAlternativaCorreta("a");
        questaoAlternativa28.setImagem(true);
        questaoAlternativa28.setAlternativasA("1, 1 e 2");
        questaoAlternativa28.setAlternativasB("1, 2 e 1");
        questaoAlternativa28.setAlternativasC("2, 1 e 2");
        questaoAlternativa28.setAlternativasD("2, 2 e 1");
        questaoAlternativa28.setAlternativasE("1, 1 e 1");
        questaoAlternativa28.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa28.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa29 = new QuestaoAlternativa();
        questaoAlternativa29.setId(INICIOQUESTAO.longValue());
        questaoAlternativa29.setAno(ANO);
        questaoAlternativa29.setDescricao("Com relação a gramática abaixo, é correto afirmar que");
        questaoAlternativa29.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa29.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa29.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa29.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa29.setAlternativaCorreta("d");
        questaoAlternativa29.setImagem(true);
        questaoAlternativa29.setAlternativasA("a gramática G é ambígua.");
        questaoAlternativa29.setAlternativasB("a gramática G é uma gramática livre de contexto.");
        questaoAlternativa29.setAlternativasC("a cadeia aabbb é gerada por essa gramática");
        questaoAlternativa29.setAlternativasD("é possível encontrar uma gramática regular\n" +
                "equivalente a G.");
        questaoAlternativa29.setAlternativasE("a gramática G gera a cadeia nula.");
        questaoAlternativa29.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa29.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa30 = new QuestaoAlternativa();
        questaoAlternativa30.setId(INICIOQUESTAO.longValue());
        questaoAlternativa30.setAno(ANO);
        questaoAlternativa30.setDescricao("Na comunicação sem fio, o espectro de radiofreqüência\n" +
                "adotado é um recurso finito e apenas determinada\n" +
                "banda de freqüência está disponível para cada serviço.\n" +
                "Dessa forma, torna-se crítico explorar técnicas de\n" +
                "múltiplo acesso que permitam o compartilhamento da\n" +
                "banda de freqüência do serviço entre os usuários. Qual\n" +
                "opção apresenta apenas técnicas de múltiplo acesso\n" +
                "para o compartilhamento da banda de freqüência\n" +
                "alocada a um serviço?");
        questaoAlternativa30.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa30.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa30.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa30.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa30.setAlternativaCorreta("d");

        questaoAlternativa30.setAlternativasA("Bluetooth, WiFi e WiMax");
        questaoAlternativa30.setAlternativasB("CDMA, GSM, TDMA");
        questaoAlternativa30.setAlternativasC("3G, WAP e ZigBee");
        questaoAlternativa30.setAlternativasD("CDMA, FDMA e TDMA");
        questaoAlternativa30.setAlternativasE("CCMP, TKIP e WEP");
        questaoAlternativa30.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa31 = new QuestaoAlternativa();
        questaoAlternativa31.setId(INICIOQUESTAO.longValue());
        questaoAlternativa31.setAno(ANO);
        questaoAlternativa31.setDescricao("Julgue os itens a seguir, relativos a métodos de busca com informação (busca heurística) e sem informação (busca cega), aplicados a problemas em que todas as ações têm o mesmo custo, o grafo de busca tem fator de ramificação finito e as ações não retornam a estados já visitados.\n" +
                "$\\newline$I A primeira solução encontrada pela estratégia de busca em largura é a solução ótima.\n" +
                "$\\newline$II A primeira solução encontrada pela estratégia de busca em profundidade é a solução ótima.\n" +
                "$\\newline$III As estratégias de busca com informação usam funções heurísticas que, quando bem definidas, permitem melhorar a eficiência da busca.\n" +
                "$\\newline$IV A estratégia de busca gulosa é eficiente porque expande apenas os nós que estão no caminho da solução.\n" +
                "$\\newline$Estão certos apenas os itens");
        questaoAlternativa31.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa31.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa31.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa31.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa31.setAlternativaCorreta("b");

        questaoAlternativa31.setAlternativasA("I e II.");
        questaoAlternativa31.setAlternativasB("I e III.");
        questaoAlternativa31.setAlternativasC("I e IV.");
        questaoAlternativa31.setAlternativasD("II e IV.");
        questaoAlternativa31.setAlternativasE("III e IV.");
        questaoAlternativa31.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa32 = new QuestaoAlternativa();
        questaoAlternativa32.setId(INICIOQUESTAO.longValue());
        questaoAlternativa32.setAno(ANO);
        questaoAlternativa32.setDescricao("Uma empresa realizou uma avaliação de desempenho de um sistema web. Nessa avaliação, foram determinados o desvio padrão e a média do tempo de resposta do referido sistema, tendo como base 10\n" +
                "consultas realizadas. Constatou-se que o tempo de resposta do sistema web possui distribuição normal. Para um nível de confiança de 95%, identificou-se o intervalo de confiança para a média do tempo de resposta das consultas.\n" +
                "$\\newline$Com relação a essa avaliação de desempenho, julgue os itens abaixo.\n" +
                "$\\newline$I Com a medição do tempo de resposta do sistema para 10 consultas adicionais, é possível que a média e o desvio padrão do tempo de resposta para o conjunto das 20 consultas aumente ou diminua.\n" +
                "$\\newline$II Com a medição do tempo de resposta do sistema para 15 consultas adicionais, com nível de confiança de 95%, o intervalo de confiança para o conjunto das 25 consultas é maior que o intervalo de confiança para o\n" +
                "conjunto das 10 consultas iniciais.\n" +
                "$\\newline$III Na medição do tempo de resposta das 10 consultas iniciais, o intervalo de confiança com nível de confiança de 99% é maior que o intervalo de confiança com nível de confiança de 95%.\n" +
                "$\\newline$Assinale a opção correta.");
        questaoAlternativa32.setArea(EArea.MATEMATICA);
        questaoAlternativa32.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa32.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa32.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa32.setAlternativaCorreta("c");

        questaoAlternativa32.setAlternativasA("Apenas um item está certo.");
        questaoAlternativa32.setAlternativasB("Apenas os itens I e II estão certos.");
        questaoAlternativa32.setAlternativasC("Apenas os itens I e III estão certos.");
        questaoAlternativa32.setAlternativasD("Apenas os itens II e III estão certos.");
        questaoAlternativa32.setAlternativasE("Todos os itens estão certos.");
        questaoAlternativa32.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa33 = new QuestaoAlternativa();
        questaoAlternativa33.setId(INICIOQUESTAO.longValue());
        questaoAlternativa33.setAno(ANO);
        questaoAlternativa33.setDescricao("Compiladores de linguagens de programação traduzem programas-fonte, em uma linguagem de entrada, para programas-objeto, em uma linguagem de saída. Durante o processo de tradução, o compilador deve verificar se as sentenças do programa-fonte estão sintaticamente corretas.\n" +
                "Esse processo de análise sintática pode ser realizado construindo-se uma árvore de análise segundo duas principais abordagens: top-down, quando a árvore é investigada da raiz às folhas; ou bottom-up, das folhas à raiz. Acerca desse assunto, julgue os itens seguintes.\n" +
                "$\\newline$I A análise top-down é adequada quando a linguagem de entrada é definida por uma gramática recursiva à esquerda.\n" +
                "$\\newline$II Independentemente da abordagem adotada, top-down ou bottom-up, o analisador sintático utiliza informações resultantes da análise léxica.\n" +
                "$\\newline$III Se os programas em uma linguagem podem ser analisados tanto em abordagem top-down como em bottom-up, a gramática dessa linguagem é ambígua.\n" +
                "$\\newline$IV A análise bottom-up utiliza ações comumente conhecidas como deslocamentos e reduções sobre as sentenças do programa-fonte.\n" +
                "$\\newline$Estão certos apenas os itens");
        questaoAlternativa33.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa33.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa33.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa33.setDisciplina(EDisciplina.COMPILADORES);
        questaoAlternativa33.setAlternativaCorreta("c");

        questaoAlternativa33.setAlternativasA("I e II.");
        questaoAlternativa33.setAlternativasB("I e III.");
        questaoAlternativa33.setAlternativasC("II e IV.");
        questaoAlternativa33.setAlternativasD("I, III e IV.");
        questaoAlternativa33.setAlternativasE("II, III e IV.");
        questaoAlternativa33.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa34 = new QuestaoAlternativa();
        questaoAlternativa34.setId(INICIOQUESTAO.longValue());
        questaoAlternativa34.setAno(ANO);
        questaoAlternativa34.setDescricao("Modems são dispositivos capazes de converter um sinal\n" +
                "digital em um sinal analógico e vice-versa. No processo de\n" +
                "modulação, para representar o sinal digital, o modem pode\n" +
                "manipular as características de uma onda portadora\n" +
                "(amplitude, freqüência e fase), derivando diferentes técnicas\n" +
                "de modulação, por exemplo: chaveamento da amplitude\n" +
                "(ASK), chaveamento da freqüência (FSK) e chaveamento\n" +
                "da fase (PSK). Com relação a técnicas de modulação,\n" +
                "julgue os itens a seguir.\n" +
                "$\\newline$I A modulação ASK é suscetível a ruídos.\n" +
                "$\\newline$II A modulação FSK possui maior imunidade a ruídos\n" +
                "quando comparada à modulação ASK.\n" +
                "$\\newline$III Na modulação PSK, a fase da portadora é modificada\n" +
                "durante o intervalo de sinalização.\n" +
                "$\\newline$IV Existem técnicas híbridas de modulação digital que\n" +
                "modificam tanto a amplitude quanto a fase da portadora.\n" +
                "$\\newline$V As diversas técnicas de modulação transmitem, no\n" +
                "mínimo, um único bit e, no máximo, 2 bits, por intervalo\n" +
                "de sinalização.\n" +
                "$\\newline$Estão certos apenas os itens");
        questaoAlternativa34.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa34.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa34.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa34.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa34.setAlternativaCorreta("a");

        questaoAlternativa34.setAlternativasA("I, II e IV.");
        questaoAlternativa34.setAlternativasB("I, II e V");
        questaoAlternativa34.setAlternativasC("I, III e IV.");
        questaoAlternativa34.setAlternativasD("II, III e V.");
        questaoAlternativa34.setAlternativasE("III, IV e V.");
        questaoAlternativa34.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa35 = new QuestaoAlternativa();
        questaoAlternativa35.setId(INICIOQUESTAO.longValue());
        questaoAlternativa35.setAno(ANO);
        questaoAlternativa35.setDescricao("Uma arquitetura de rede é usualmente organizada em um conjunto de camadas e protocolos com o propósito de estruturar o hardware e o software de comunicação. Como exemplos, têm-se as arquiteturas OSI e TCP/IP. A arquitetura TCP/IP, adotada na Internet, é um exemplo concreto de tecnologia de interconexão de redes e sistemas heterogêneos usada em escala global. Com relação à arquitetura TCP/IP, assinale a opção correta.");
        questaoAlternativa35.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa35.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa35.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa35.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa35.setAlternativaCorreta("b");

        questaoAlternativa35.setAlternativasA("A camada de interface de rede, também denominada intrarede, adota o conceito de portas para identificar os dispositivos da rede física. Cada porta é associada à interface de rede do dispositivo e os quadros enviados transportam o número das portas para identificar os dispositivos de origem e de destino.");
        questaoAlternativa35.setAlternativasB("A camada de rede, também denominada inter-rede, adota endereços IP para identificar as redes e seus dispositivos.\n" +
                "Para interconectar redes físicas que adotam diferentes tamanhos máximos de quadros, a camada de rede adota os conceitos de fragmentação e remontagem de datagramas.");
        questaoAlternativa35.setAlternativasC("A camada de transporte é responsável pelo processo de roteamento de datagramas. Nesse processo, a camada de transporte deve selecionar os caminhos ou rotas que os\n" +
                "datagramas devem seguir entre os dispositivos de origem e de destino, passando assim através das várias redes interconectadas.");
        questaoAlternativa35.setAlternativasD("A camada de aplicação é composta por um conjunto de protocolos, que são implementados pelos processos executados nos dispositivos. Cada protocolo de aplicação\n" +
                "deve especificar a interface gráfica ou textual oferecida pelo respectivo processo para permitir a interação com os usuários\n" +
                "da aplicação.");
        questaoAlternativa35.setAlternativasE("A arquitetura TCP/IP é uma implementação concreta da\n" +
                "arquitetura conceitual OSI. Portanto, a arquitetura TCP/IP é\n" +
                "também estruturada em 7 camadas, que são as camadas:\n" +
                "física, de enlace, de rede, de transporte, de sessão, de\n" +
                "apresentação e de aplicação.");
        questaoAlternativa35.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa36 = new QuestaoAlternativa();
        questaoAlternativa36.setId(INICIOQUESTAO.longValue());
        questaoAlternativa36.setAno(ANO);
        questaoAlternativa36.setDescricao("Redes locais sem fio que utilizam tecnologia IEEE 802.11, comumente referenciada como Wi-Fi, estão se tornando cada vez mais populares. Julgue os itens abaixo, relativos a essa tecnologia.\n" +
                "$\\newline$I Computadores em redes IEEE 802.11 podem-se comunicar por dois modos básicos: usando uma infra-estrutura coordenada por pontos de acesso à rede (access points — AP), ou no modo ad hoc, em que cada computador troca informações diretamente com os demais.\n" +
                "$\\newline$II Para poder transmitir por meio de um ponto de acesso, uma interface de rede deve realizar um procedimento de associação, que inclui o conhecimento de um campo identificador (service set identifier — SSI).\n" +
                "$\\newline$III Um mecanismo de detecção de colisão durante a transmissão\n" +
                "indica a necessidade de retransmissão e evita o envio de mensagens de confirmação.\n" +
                "$\\newline$IV Um mecanismo de requisição para transmissão (request to send — RTS) e de liberação para transmissão (clear to send — CTS) pode ser usado para evitar colisões.\n" +
                "$\\newline$V O protocolo WEP (wired equivalent privacy) impede que interfaces não-autorizadas recebam sinais propagados pelo meio.\n" +
                "$\\newline$Estão certos apenas os itens");
        questaoAlternativa36.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa36.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa36.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa36.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa36.setAlternativaCorreta("a");

        questaoAlternativa36.setAlternativasA("I, II e IV.");
        questaoAlternativa36.setAlternativasB("I, III e V.");
        questaoAlternativa36.setAlternativasC("I, IV e V.");
        questaoAlternativa36.setAlternativasD("II, III e IV.");
        questaoAlternativa36.setAlternativasE("II, III e IV.");
        questaoAlternativa36.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa37 = new QuestaoAlternativa();
        questaoAlternativa37.setId(INICIOQUESTAO.longValue());
        questaoAlternativa37.setAno(ANO);
        questaoAlternativa37.setDescricao("Considere que a correlação linear entre o número de erros de código de programação (Y) e o respectivo tamanho de um programa (X), em número de linhas de código, seja igual a 0,7. A variável aleatória Y segue uma distribuição Normal com média e desvio padrão iguais a 0,1 erro de código, enquanto que a variável X segue uma distribuição Normal com média 15 e desvio padrão 5 linhas de código. A reta de regressão linear é uma esperança condicional na forma E(Y|X = x) = ax – 0,11, em que x > 10 é um dado valor para o tamanho do programa e a é o coeficiente angular da reta de regressão. Nessa situação, para um\n" +
                "programa cujo tamanho é x = 20, pela reta de regressão linear, qual é o número esperado de erros de código de programação?");
        questaoAlternativa37.setArea(EArea.MATEMATICA);
        questaoAlternativa37.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa37.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa37.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa37.setAlternativaCorreta("c");

        questaoAlternativa37.setAlternativasA("0,1");
        questaoAlternativa37.setAlternativasB("0,12");
        questaoAlternativa37.setAlternativasC("0,17");
        questaoAlternativa37.setAlternativasD("0,2");
        questaoAlternativa37.setAlternativasE("0,22");
        questaoAlternativa37.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa38 = new QuestaoAlternativa();
        questaoAlternativa38.setId(INICIOQUESTAO.longValue());
        questaoAlternativa38.setAno(ANO);
        questaoAlternativa38.setDescricao("No circuito abaixo, que possui cinco entradas — A, B, C, D e E — e uma saída f (A, B, C, D, E), qual opção apresenta uma expressão lógica equivalente\n" +
                "à função f (A, B, C, D, E)?");
        questaoAlternativa38.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa38.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa38.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa38.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
        questaoAlternativa38.setAlternativaCorreta("e");
        questaoAlternativa38.setImagem(true);
        questaoAlternativa38.setAlternativasA("$\\overline{A.B} + \\overline{C.D} + D.E$");
        questaoAlternativa38.setAlternativasB("$(A + B).(C + D) + D.E$");
        questaoAlternativa38.setAlternativasC("$\\overline{A.B} + \\overline{C.D} + D + E$");
        questaoAlternativa38.setAlternativasD("$A.B + C.D + D + E$");
        questaoAlternativa38.setAlternativasE("$A.B + C.D + \\overline{D}.\\overline{E}$");
        questaoAlternativa38.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa38.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        //WARNING Questão precisa que o usuário desenhe a resposta, não sendo possivel implementar
        QuestaoAlternativa questaoAlternativa39 = new QuestaoAlternativa();
        questaoAlternativa39.setId(INICIOQUESTAO.longValue());
        questaoAlternativa39.setAno(ANO);
        questaoAlternativa39.setDescricao("Anulada");
        questaoAlternativa39.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa39.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa39.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa39.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa39.setAlternativaCorreta("*");

        questaoAlternativa39.setAlternativasA("Anulada");
        questaoAlternativa39.setAlternativasB("Anulada");
        questaoAlternativa39.setAlternativasC("Anulada");
        questaoAlternativa39.setAlternativasD("Anulada");
        questaoAlternativa39.setAlternativasE("Anulada");
        questaoAlternativa39.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        //WARNING Questão precisa que o usuário desenhe a resposta, não sendo possivel implementar
        QuestaoAlternativa questaoAlternativa40 = new QuestaoAlternativa();
        questaoAlternativa40.setId(INICIOQUESTAO.longValue());
        questaoAlternativa40.setAno(ANO);
        questaoAlternativa40.setDescricao("Anulada");
        questaoAlternativa40.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa40.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa40.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa40.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa40.setAlternativaCorreta("*");

        questaoAlternativa40.setAlternativasA("Anulada");
        questaoAlternativa40.setAlternativasB("Anulada");
        questaoAlternativa40.setAlternativasC("Anulada");
        questaoAlternativa40.setAlternativasD("Anulada");
        questaoAlternativa40.setAlternativasE("Anulada");
        questaoAlternativa40.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa41 = new QuestaoAlternativa();
        questaoAlternativa41.setId(INICIOQUESTAO.longValue());
        questaoAlternativa41.setAno(ANO);
        questaoAlternativa41.setDescricao("Em ambientes de manufatura integrada, utilizam-se computadores para conectar processos concorrentes separados fisicamente, isto é, um sistema integrado requer dois ou mais computadores conectados para trocar informações. Quando integrados, os processos podem compartilhar informações e iniciar ações, permitindo decisões mais rápidas com menoserros. A automação também permite a  execução\n" +
                "de processos de manufatura sem necessidade de intervenções. Um exemplo simples pode ser um controlador de um robô e um controlador lógico programável trabalhando juntos em uma única máquina. Um exemplo complexo é uma planta inteira de manufatura envolvendo centenas de estações conectadas a bancos de\n" +
                "dados com instruções e planejamento de operações e tarefas em tempo real, envolvendo sensores, atuadores, transdutores, conversores etc. Entender, projetar e construir esses sistemas\n" +
                "é um grande desafio que impõe uma abordagem sistemática pelo uso de ferramentas e conhecimento conceitual de modelagem lógica,\n" +
                "manipulação matemática, abstração, decomposição, concorrência etc. Nesse contexto, julgue os seguintes itens.\n" +
                "$\\newline$I Controladores lógicos programáveis são computadores para processamento de entradas e saídas, sendo que a maioria\n" +
                "permite múltiplos programas que podem ser utilizados como sub-rotinas.\n" +
                "$\\newline$II Para leituras de um sinal analógico que varia entre ± 10 volts, com precisão de ± 0,05 volts, é necessário um conversor AD com, no\n" +
                "mínimo, 9 bits.\n" +
                "$\\newline$III O principal objetivo das redes de Petri Coloridas é a redução do tamanho do modelo, permitindo que tokens individualizados\n" +
                "(coloridos) representem diferentes processos ou recursos em uma mesma sub-rede.\n" +
                "$\\newline$Assinale a opção correta.");
        questaoAlternativa41.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa41.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa41.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa41.setDisciplina(EDisciplina.MODELAGEM_E_SIMULACAO);
        questaoAlternativa41.setAlternativaCorreta("c");

        questaoAlternativa41.setAlternativasA("Apenas um item está certo.");
        questaoAlternativa41.setAlternativasB("Apenas os itens I e II estão certos.");
        questaoAlternativa41.setAlternativasC("Apenas os itens I e III estão certos.");
        questaoAlternativa41.setAlternativasD("Apenas os itens II e III estão certos.");
        questaoAlternativa41.setAlternativasE("Todos os itens estão certos.");
        questaoAlternativa41.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa42 = new QuestaoAlternativa();
        questaoAlternativa42.setId(INICIOQUESTAO.longValue());
        questaoAlternativa42.setAno(ANO);
        questaoAlternativa42.setDescricao("Ao se realizar o acesso a um servidor WWW usando o protocolo HTTPS, uma sessão SSL é estabelecida sobre a conexão TCP, entre o programa navegador do usuário e o processo servidor. Para tanto, usam-se mecanismos baseados em criptografia simétrica e assimétrica para prover serviços de segurança. Em relação ao acesso HTTP, sem SSL, que serviços de segurança são providos\n" +
                "para o usuário?");
        questaoAlternativa42.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa42.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa42.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa42.setDisciplina(EDisciplina.SEGURANÇA_COMPUTACIONAL);
        questaoAlternativa42.setAlternativaCorreta("d");

        questaoAlternativa42.setAlternativasA("autenticação do servidor e controle de acesso do cliente");
        questaoAlternativa42.setAlternativasB("autenticação do cliente e controle da velocidade de transmissão");
        questaoAlternativa42.setAlternativasC("autenticação da rede e proteção contra vírus");
        questaoAlternativa42.setAlternativasD("autenticação do servidor e confidencialidade das transmissões");
        questaoAlternativa42.setAlternativasE("autenticação do cliente e temporização das ações executadas\n");
        questaoAlternativa42.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa43 = new QuestaoAlternativa();
        questaoAlternativa43.setId(INICIOQUESTAO.longValue());
        questaoAlternativa43.setAno(ANO);
        questaoAlternativa43.setDescricao("Considere que seja necessário escrever um código para um microcontrolador capaz de identificar teclas acionadas em um teclado conectado como mostrado abaixo. O microcontrolador atribui valores lógicos às linhas $X_{3},X_{2},X_{1}\\,\\,e\\,\\,X_{0}$ de uma porta de saída do tipo coletor aberto, e lê os valores lógicos das linhas $Y_{3},Y_{2},Y_{1}\\,\\,e\\,\\,Y_{0}$ em uma porta\n" +
                "de entrada." +
                "Caso apenas a tecla 9 do teclado esteja pressionada e o microcontrolador esteja atribuindo os valores lógicos 1011 às linhas $X_{3},X_{2},X_{1}\\,\\,e\\,\\,X_{0}$ , respectivamente, qual o padrão binário que deverá ser lido nas linhas $Y_{3},Y_{2},Y_{1}\\,\\,e\\,\\,Y_{0}$, respectivamente?");
        questaoAlternativa43.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa43.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa43.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa43.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
        questaoAlternativa43.setAlternativaCorreta("b");

        questaoAlternativa43.setAlternativasA("0111");
        questaoAlternativa43.setAlternativasB("1011");
        questaoAlternativa43.setAlternativasC("1101");
        questaoAlternativa43.setAlternativasD("1110");
        questaoAlternativa43.setAlternativasE("1111");
        questaoAlternativa43.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa44 = new QuestaoAlternativa();
        questaoAlternativa44.setId(INICIOQUESTAO.longValue());
        questaoAlternativa44.setAno(ANO);
        questaoAlternativa44.setDescricao("Anulada");
        questaoAlternativa44.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa44.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa44.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa44.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa44.setAlternativaCorreta("*");

        questaoAlternativa44.setAlternativasA("Anulada");
        questaoAlternativa44.setAlternativasB("Anulada");
        questaoAlternativa44.setAlternativasC("Anulada");
        questaoAlternativa44.setAlternativasD("Anulada");
        questaoAlternativa44.setAlternativasE("Anulada");
        questaoAlternativa44.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa45 = new QuestaoAlternativa();
        questaoAlternativa45.setId(INICIOQUESTAO.longValue());
        questaoAlternativa45.setAno(ANO);
        questaoAlternativa45.setDescricao("Considere y = f(x) uma função contínua e não-negativa (f $ 0), definida em um intervalo [a, b], e R a região delimitada pelo eixo x, o gráfico de f e as retas x = a e x = b. Considere S o sólido obtido pela rotação do conjunto R em torno do eixo das abscissas, conforme ilustram as\n" +
                "figuras abaixo. O volume V do sólido S pode ser obtido como resultado da integral $\\int_{a}^{b} \\pi(f(x))^{2}dx." +
                "Com base nessas informações, julgue os itens a seguir.\n" +
                "$\\newline$I Cada seção transversal do sólido S obtida quando este é interceptado em x = c por um plano paralelo ao plano yOz é um círculo centrado no ponto (c, 0, 0) e de raio medindo f(x) e, portanto, de área igual a $\\pi(f(x))^{2}$.\n" +
                "$\\newline$II Se P é uma partição uniforme do intervalo [a, b], sendo\n" +
                "$P = \\left\\{a = x_{0} < x_{1} < x_{2} < ... < x_{n} = b \\right\\}$, tal que $\\Delta x = x_{i} - x_{i - 1}$,\n" +
                "então $V = \\lim_{ n \\rightarrow \\infty} \\sum_{i =1}^{n} \\pi(f(c_{i}))^{2} \\Delta x,\\,para\\,\\,\\,c_{i} \\in [x_{i},x_{i-1}],1 < i < n.$\n" +
                "$\\newline$III É igual a $2\\pi$ o volume do sólido gerado pela rotação em torno do eixo x da região do plano delimitada pelo eixo x, o gráfico de $f(x) = \\sqrt{x}$ e as retas x = 0 e x = 2.\n" +
                "$\\newline$Assinale a opção correta");
        questaoAlternativa45.setArea(EArea.MATEMATICA);
        questaoAlternativa45.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa45.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa45.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa45.setAlternativaCorreta("e");
        questaoAlternativa45.setImagem(true);
        questaoAlternativa45.setAlternativasA("Apenas o item I está certo.");
        questaoAlternativa45.setAlternativasB("Apenas o item III está certo");
        questaoAlternativa45.setAlternativasC("Apenas os itens I e II estão certos");
        questaoAlternativa45.setAlternativasD("Apenas os itens II e III estão certos.");
        questaoAlternativa45.setAlternativasE("Todos os itens estão certos.");
        questaoAlternativa45.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa45.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa46 = new QuestaoAlternativa();
        questaoAlternativa46.setId(INICIOQUESTAO.longValue());
        questaoAlternativa46.setAno(ANO);
        questaoAlternativa46.setDescricao("No plano de coordenadas cartesianas xOy abaixo, está representado o gráfico de uma função contínua e derivável y = f(x). A partir dessas informações, qual opção apresenta características corretas acerca da função y?");
        questaoAlternativa46.setArea(EArea.MATEMATICA);
        questaoAlternativa46.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa46.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa46.setDisciplina(EDisciplina.CALCULO);
        questaoAlternativa46.setAlternativaCorreta("d");
        questaoAlternativa46.setImagem(true);
        questaoAlternativa46.setAlternativasA("A função y possui derivada de primeira ordem positiva\n" +
                "em todo o seu domínio.");
        questaoAlternativa46.setAlternativasB("A função y possui derivada de segunda ordem positiva\n" +
                "em todo o seu domínio.\n");
        questaoAlternativa46.setAlternativasC("A função y possui exatamente dois pontos críticos de primeira ordem em todo o seu domínio.");
        questaoAlternativa46.setAlternativasD("A função y possui exatamente dois pontos de inflexão\n" +
                "em todo o seu domínio.");
        questaoAlternativa46.setAlternativasE("A função y tem exatamente dois zeros em todo o seu\n" +
                "domínio.");
        questaoAlternativa46.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa46.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa47 = new QuestaoAlternativa();
        questaoAlternativa47.setId(INICIOQUESTAO.longValue());
        questaoAlternativa47.setAno(ANO);
        questaoAlternativa47.setDescricao("A transmissão em fibra óptica é realizada pelo envio de\n" +
                "feixes de luz através de um cabo óptico que consiste em\n" +
                "um filamento de sílica ou plástico. A fibra óptica funciona\n" +
                "com base nos princípios de refração e reflexão dos feixes\n" +
                "de luz no interior do filamento condutor. Para controlar a\n" +
                "direção da propagação dos feixes de luz, o núcleo e a\n" +
                "casca do filamento condutor são produzidos com diferentes\n" +
                "índices de refração. Variando-se os índices de refração do\n" +
                "núcleo e da casca, diferentes categorias de fibras ópticas\n" +
                "são produzidas. Qual opção apresenta três categorias de\n" +
                "fibras ópticas?");
        questaoAlternativa47.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa47.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa47.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa47.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa47.setAlternativaCorreta("c");

        questaoAlternativa47.setAlternativasA("monomodo, bimodo e multimodo");
        questaoAlternativa47.setAlternativasB("monomodo refratário, monomodo reflexivo e\n" +
                "multimodo");
        questaoAlternativa47.setAlternativasC("monomodo, multimodo degrau e multimodo gradual");
        questaoAlternativa47.setAlternativasD("monomodo, multimodo sílico e multimodo plástico\n");
        questaoAlternativa47.setAlternativasE("monomodo digital, monomodo analógico e multimodo");
        questaoAlternativa47.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa48 = new QuestaoAlternativa();
        questaoAlternativa48.setId(INICIOQUESTAO.longValue());
        questaoAlternativa48.setAno(ANO);
        questaoAlternativa48.setDescricao("Considere $f(x) = x^{3} + 3x - 1$, em que $x \\in \\mathbb{R}$. A fim de que sejam obtidas as raízes da função f, vários métodos de cálculo numérico podem ser aplicados, sendo a maioria deles embasada em processos iterativos, o que exige uma primeira aproximação para cada raiz que se deseje determinar e para o intervalo em que ela deva ser encontrada. Suponha que se esteja aplicando o princípio da bissecção para a determinação de uma raiz aproximada para a função f descrita acima e que, para isso, seja necessária a definição de um intervalo de busca inicial I, bem como uma primeira aproximação para a raiz $x_{o}$ de f que se encontra em I. Nesse sentido, qual das opções a seguir apresenta uma definição correta de I e a aproximação $x_{o}$ associada, de acordo com o método da bissecção?");
        questaoAlternativa48.setArea(EArea.MATEMATICA);
        questaoAlternativa48.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa48.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa48.setDisciplina(EDisciplina.CALCULO_NUMERICO);
        questaoAlternativa48.setAlternativaCorreta("d");

        questaoAlternativa48.setAlternativasA("$I = [-1,-1/2], x_{o} = -61/16$");
        questaoAlternativa48.setAlternativasB("$I = [-1/2, 0], x_{o} = -1/4$");
        questaoAlternativa48.setAlternativasC("$I = [-1, 0], x_{o} = -1/2$");
        questaoAlternativa48.setAlternativasD("$I = [0, 1/2], x_{o} = 1/4$");
        questaoAlternativa48.setAlternativasE("$I = [-1, 1], x_{o} = 1/4$");
        questaoAlternativa48.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa49 = new QuestaoAlternativa();
        questaoAlternativa49.setId(INICIOQUESTAO.longValue());
        questaoAlternativa49.setAno(ANO);
        questaoAlternativa49.setDescricao("A segmentação de imagens é uma das partes essenciais\n" +
                "na área de processamento de imagens. Assinale a opção\n" +
                "incorreta em relação à detecção de bordas no contexto da\n" +
                "segmentação de imagens.");
        questaoAlternativa49.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa49.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa49.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa49.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa49.setAlternativaCorreta("d");

        questaoAlternativa49.setAlternativasA("A detecção de bordas é a determinação dos limites de\n" +
                "um objeto em uma imagem, envolvendo a avaliação da\n" +
                "variação nos níveis de cinza dos pixels em uma\n" +
                "vizinhança, sendo uma das formas de segmentação de\n" +
                "imagens.");
        questaoAlternativa49.setAlternativasB("Sobel, Prewitt e Roberts são operadores usados para detecção de bordas, todos embasados em gradientes calculados sobre os níveis de cinza de uma imagem.");
        questaoAlternativa49.setAlternativasC("A detecção de bordas é um processo de segmentação de imagens, mas com princípio diferente das técnicas que agrupam pixels vizinhos que compartilham determinado atributo.");
        questaoAlternativa49.setAlternativasD("Crescimento de regiões é um método de detecção de bordas embasado em gradientes, usando como critério a disparidade de valores entre pixels vizinhos.");
        questaoAlternativa49.setAlternativasE("O operador LoG (laplacian of gaussian) é empregado para detecção de bordas, usando os cruzamentos de zero na determinação dos pixels que formam o limiar entre um objeto e outro em uma imagem.\n");
        questaoAlternativa49.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa50 = new QuestaoAlternativa();
        questaoAlternativa50.setId(INICIOQUESTAO.longValue());
        questaoAlternativa50.setAno(ANO);
        questaoAlternativa50.setDescricao("Considere, a seguir, o circuito combinatório apresentado na imagem abaixo, a tensão analógica $V_{A}$ definida pela tabela I, e a tabela lógica definida pela tabela II.\n" +
                "Analise o circuito, os dados das tabelas I e II e as seguintes asserções.\n" +
                "O circuito apresentado converte a tensão analógica $V_{A}$ em uma palavra de três bits cujo valor binário é uma representação quantizada da tensão $V_{A}$, conforme apresentado na tabela I\n" +
                "porque\n" +
                "o circuito combinatório formado pelas portas lógicas apresenta o comportamento dado pela tabela lógica II quando o circuito de comparação é excitado com uma tensão $V_{A}$ adequada.\n" +
                "Assinale a opção correta, com relação às asserções acima.");
        questaoAlternativa50.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa50.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa50.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa50.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
        questaoAlternativa50.setAlternativaCorreta("a");
        questaoAlternativa50.setImagem(true);
        questaoAlternativa50.setAlternativasA("As duas asserções são proposições verdadeiras, e a segunda é uma justificativa correta da primeira.");
        questaoAlternativa50.setAlternativasB("As duas asserções são proposições verdadeiras, mas a segunda não é uma justificativa correta da primeira.");
        questaoAlternativa50.setAlternativasC("A primeira asserção é uma proposição verdadeira, e a segunda, uma proposição falsa.\n");
        questaoAlternativa50.setAlternativasD("A primeira asserção é uma proposição falsa, e a segunda, uma proposição verdadeira.");
        questaoAlternativa50.setAlternativasE("Tanto a primeira quanto a segunda asserções são proposições falsas.");
        questaoAlternativa50.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa50.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa51 = new QuestaoAlternativa();
        questaoAlternativa51.setId(INICIOQUESTAO.longValue());
        questaoAlternativa51.setAno(ANO);
        questaoAlternativa51.setDescricao("Considere um jogo do tipo 8-puzzle, cujo objetivo é conduzir o tabuleiro esquematizado na figura abaixo para o seguinte estado final.\n" +
                "Considere uma função heurística h embasada na soma das distâncias das peças em relação ao estado final desejado, em que a distância d a que uma peça p está da posição final é dada pela soma do número de linhas com o número de colunas que a separam da posição final desejada. Por exemplo, em E1, d(1) = 2 + 1 = 3. A partir dessas informações analise as asserções a seguir.\n" +
                "Utilizando-se um algoritmo de busca gulosa pela melhor escolha que utiliza a função h, o próximo estado no desenvolvimento do jogo a partir do estado E0 tem de ser E3\n" +
                "porque,\n" +
                "dos três estados E1, E2 e E3 possíveis, o estado com menor soma das distâncias entre a posição atual das peças e a posição final é o estado E3.\n" +
                "Assinale a opção correta a respeito dessas asserções.");
        questaoAlternativa51.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa51.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa51.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa51.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa51.setAlternativaCorreta("a");
        questaoAlternativa51.setImagem(true);
        questaoAlternativa51.setAlternativasA("As duas asserções são proposições verdadeiras, e a segunda é uma justificativa correta da primeira.");
        questaoAlternativa51.setAlternativasB("As duas asserções são proposições verdadeiras, e a\n" +
                "segunda não é uma justificativa correta da primeira.");
        questaoAlternativa51.setAlternativasC("A primeira asserção é uma proposição verdadeira, e a\n" +
                "segunda é uma proposição falsa.");
        questaoAlternativa51.setAlternativasD("A primeira asserção é uma proposição falsa, e a segunda é uma proposição verdadeira.");
        questaoAlternativa51.setAlternativasE("As duas asserções são proposições falsas.");
        questaoAlternativa51.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa51.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa52 = new QuestaoAlternativa();
        questaoAlternativa52.setId(INICIOQUESTAO.longValue());
        questaoAlternativa52.setAno(ANO);
        questaoAlternativa52.setDescricao("A identificação e o tratamento de erros em programas de computador estão entre as tarefas dos compiladores. Os erros de um programa podem ter variados tipos e precisam ser identificados e tratados em\n" +
                "diferentes fases da compilação. Considere uma linguagem de programação que exige que as variáveis manipuladas por seus programas sejam previamente declaradas, não podendo haver duplicidade de identificadores para variáveis em um mesmo escopo. Considere, ainda, que a sintaxe dessa linguagem tenha sido definida por meio de uma gramática livre de contexto e as produções seguintes definam a forma das declarações de variáveis em seus programas.$\\newline$\n" +
                "$D \\rightarrow TL; | TL; D \\newline\n" +
                "T \\rightarrow int | real | char \\newline\n" +
                "L \\rightarrow id | id,L$\n" +
                "$\\newline$Considere os exemplos de sentenças — I e II — a seguir, com a indicação — entre os delimitadores /* e */ — de diferentes tipos de erros.\n" +
                "$\\newline$I int: a, b; /* dois pontos após a palavra int */\n" +
                "$\\newline$II int a,b; real a; /* declaração dupla da variável a */\n" +
                "$\\newline$A partir dessas informações, assinale a opção correta.");
        questaoAlternativa52.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa52.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa52.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa52.setDisciplina(EDisciplina.COMPILADORES);
        questaoAlternativa52.setAlternativaCorreta("e");

        questaoAlternativa52.setAlternativasA("A identificação e a comunicação do erro em qualquer uma das sentenças são funções do analisador léxico.");
        questaoAlternativa52.setAlternativasB("O compilador não tem meios para identificar e relatar erros como o da sentença I.");
        questaoAlternativa52.setAlternativasC("A identificação e a comunicação do erro na sentença I são funções da geração de código intermediário.");
        questaoAlternativa52.setAlternativasD("A identificação e a comunicação do erro na sentença\n" +
                "II são funções do analisador léxico.");
        questaoAlternativa52.setAlternativasE("A identificação e a comunicação do erro na sentença\n" +
                "II são funções da análise semântica");
        questaoAlternativa52.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa53 = new QuestaoAlternativa();
        questaoAlternativa53.setId(INICIOQUESTAO.longValue());
        questaoAlternativa53.setAno(ANO);
        questaoAlternativa53.setDescricao("Um sinal a ser registrado por um dispositivo, em intervalos regulares de tempo t = 1, 2, 3, ..., n, resultará em uma sequência de variáveis aleatórias contínuas $X_{1},X_{2}, ...,X_{n}$. Considere, nessa sequência, os eventos A e B apresentados a seguir, em que t = 2, 3, ..., n – 1.$\\newline$\n" +
                "$A = X_{t-1} - X_{t} < 0\\,\\,e\\,\\,X_{t} - X_{t+1} > 0 \\newline\n" +
                "B = X_{t-1} - X_{t} > 0\\,\\,e\\,\\,X_{t} - X_{t+1} < 0 $\n" +
                "$\\newline$Na hipótese de a seqüência $X_{1},X_{2}, ...,X_{n}$ ser independente e que seja impossível que $X_{t} = X_{t-1}(t = 2,3,...,n)$, julgue os seguintes itens.\n" +
                "$\\newline$I A probabilidade de ocorrer o evento A em uma subseqüência\n" +
                "$\\left\\{ X_{t-1},X_{t},X_{t+1} \\right\\}$ é inferior a 0,3.\n" +
                "$\\newline$II O número esperado das ocorrências dos eventos A ou B na\n" +
                "seqüência $X_{1},X_{2}, ...,X_{n}$ é igual a $\\frac{2(n-2)}{3}$.\n" +
                "$\\newline$III Os eventos A e B são mutuamente exclusivos e, por isso, são independentes.\n" +
                "$\\newline$Assinale a opção correta.");
        questaoAlternativa53.setArea(EArea.MATEMATICA);
        questaoAlternativa53.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa53.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa53.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa53.setAlternativaCorreta("a");

        questaoAlternativa53.setAlternativasA("Apenas um item está certo.");
        questaoAlternativa53.setAlternativasB("Apenas os itens I e II estão certos.");
        questaoAlternativa53.setAlternativasC("Apenas os itens I e III estão certos.");
        questaoAlternativa53.setAlternativasD("Apenas os itens II e III estão certos.");
        questaoAlternativa53.setAlternativasE("Todos os itens estão certos.");
        questaoAlternativa53.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa54 = new QuestaoAlternativa();
        questaoAlternativa54.setId(INICIOQUESTAO.longValue());
        questaoAlternativa54.setAno(ANO);
        questaoAlternativa54.setDescricao("No encaminhamento de pacotes na Internet, cabe a cada nó determinar se é possível entregar um pacote diretamente ao destino ou se é preciso encaminhá-lo a um nó intermediário. Para tanto, usa-se uma tabela de rotas. Um exemplo de tabela de rotas simplificada é apresentado a seguir e pertence a um computador com endereço IP 192.0.2.100 e máscara de rede 255.255.255.0.\n" +
                "Na situação em que o referido computador precise enviar pacotes para os endereços 192.0.2.50 e 192.168.0.100, de acordo com a tabela de rotas apresentada, como ocorrerá a entrega desses pacotes?");
        questaoAlternativa54.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa54.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa54.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa54.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa54.setAlternativaCorreta("c");
        questaoAlternativa54.setImagem(true);
        questaoAlternativa54.setAlternativasA("Diretamente para 192.0.2.50 e diretamente para\n" +
                "192.168.0.100, respectivamente.");
        questaoAlternativa54.setAlternativasB("Diretamente para 192.0.2.50 e encaminhando para\n" +
                "192.0.2.254, respectivamente.");
        questaoAlternativa54.setAlternativasC("Diretamente para 192.0.2.50 e encaminhando para 192.0.2.1,\n" +
                "respectivamente.");
        questaoAlternativa54.setAlternativasD("Encaminhando para 192.0.2.50 e encaminhando para\n" +
                "192.0.2.50, respectivamente.");
        questaoAlternativa54.setAlternativasE("Encaminhado para 192.0.2.254 e diretamente para\n" +
                "192.168.0.100, respectivamente.");
        questaoAlternativa54.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa54.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa55 = new QuestaoAlternativa();
        questaoAlternativa55.setId(INICIOQUESTAO.longValue());
        questaoAlternativa55.setAno(ANO);
        questaoAlternativa55.setDescricao("Considere que um sistema seja constituído por três componentes montados em paralelo que funcionam independentemente. Para cada um desses componentes, a probabilidade de que uma falha ocorra até o tempo t é dada por $1-e^{-0,1t}$, em que t > 0. Os componentes, após falharem, são irrecuperáveis. Como os componentes estão montados em paralelo, o sistema falha no instante em que todos os três componentes tiverem falhado. O sistema é também irrecuperável. Considerando a situação apresentada, qual é a probabilidade de que o sistema falhe até o tempo t ?");
        questaoAlternativa55.setArea(EArea.MATEMATICA);
        questaoAlternativa55.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa55.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa55.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa55.setAlternativaCorreta("e");

        questaoAlternativa55.setAlternativasA("$[1-e^{-0,3t}]^{3}$");
        questaoAlternativa55.setAlternativasB("$1 - [1-e^{-0,1t}]^{3}$");
        questaoAlternativa55.setAlternativasC("$e^{-0,3t}$");
        questaoAlternativa55.setAlternativasD("$1 - e^{-0,3t}$");
        questaoAlternativa55.setAlternativasE("$[1 - e^{-0,1t}]^{3}$");
        questaoAlternativa55.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa56 = new QuestaoAlternativa();
        questaoAlternativa56.setId(INICIOQUESTAO.longValue());
        questaoAlternativa56.setAno(ANO);
        questaoAlternativa56.setDescricao("Julgue os itens abaixo, relativos à transmissão de dados em redes de computadores que utilizam fios metálicos.\n" +
                "$\\newline$I Diferentes níveis de tensão no fio, como !5 V e +5 V, e transições entre os níveis definidos de tensão podem ser usados para representar bits durante a transmissão.\n" +
                "$\\newline$II Diferentes tipos de modulação, com mudanças de fase e de amplitude, podem ser aplicados a uma onda portadora para representar bits durante a transmissão.\n" +
                "$\\newline$III A taxa máxima de transmissão suportada por um canal é definida como função, entre outros parâmetros, do nível máximo de tensão suportado no canal.\n" +
                "$\\newline$IV Largura de banda é definida como a freqüência mais alta que pode ser transmitida através de um meio de transmissão.\n" +
                "$\\newline$V Informações transmitidas por meio de sinais modulados podem ser recuperadas no receptor usando-se taxa de\n" +
                "amostragem com o dobro da freqüência máxima do sinal\n" +
                "transmitido.\n" +
                "$\\newline$Estão certos apenas os itens");
        questaoAlternativa56.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa56.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa56.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa56.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa56.setAlternativaCorreta("b");

        questaoAlternativa56.setAlternativasA("I, II e IV.");
        questaoAlternativa56.setAlternativasB("I, II e V.");
        questaoAlternativa56.setAlternativasC("I, III e IV.");
        questaoAlternativa56.setAlternativasD("II, III e V.");
        questaoAlternativa56.setAlternativasE("III, IV e V. ");
        questaoAlternativa56.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa57 = new QuestaoAlternativa();
        questaoAlternativa57.setId(INICIOQUESTAO.longValue());
        questaoAlternativa57.setAno(ANO);
        questaoAlternativa57.setDescricao("Deseja-se projetar um bloco lógico do tipo look-up table que fará parte de um dispositivo lógico programável. O bloco lógico, ilustrado abaixo, deve produzir em sua saída qualquer uma das diferentes funções lógicas possíveis envolvendo três entradas de dados, dependendo dos valores lógicos aplicados a n sinais\n" +
                "binários de controle. Para esse bloco lógico, qual é o menor valor de n que pode ser usado para selecionar uma das diferentes funções lógicas possíveis?");
        questaoAlternativa57.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa57.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa57.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa57.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
        questaoAlternativa57.setAlternativaCorreta("b");
        questaoAlternativa57.setImagem(true);
        questaoAlternativa57.setAlternativasA("4");
        questaoAlternativa57.setAlternativasB("8");
        questaoAlternativa57.setAlternativasC("16");
        questaoAlternativa57.setAlternativasD("256");
        questaoAlternativa57.setAlternativasE("65.536");
        questaoAlternativa57.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa57.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa58 = new QuestaoAlternativa();
        questaoAlternativa58.setId(INICIOQUESTAO.longValue());
        questaoAlternativa58.setAno(ANO);
        questaoAlternativa58.setDescricao("Considerando o mecanismo de tradução de endereços e portas (network address port translation – NAPT), para redes que utilizam os endereços IP privados (10.0.0.0/8, 172.16.0.0/12 e\n" +
                "192.168.0.0/16), analise as asserções a seguir.\n" +
                "Ao passar por um roteador com NAPT, os endereços de origem nos pacotes originados pelas estações da rede privada são substituídos pelo endereço externo desse roteador\n" +
                "porque\n" +
                "não há rotas na Internet para o encaminhamento de pacotes destinados a endereços IP privados, de forma que pacotes destinados a esses endereços são descartados ou rejeitados.\n" +
                "Em relação às asserções acima, assinale a opção correta.");
        questaoAlternativa58.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa58.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa58.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa58.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa58.setAlternativaCorreta("a");

        questaoAlternativa58.setAlternativasA("As duas asserções são proposições verdadeiras, e a segunda é uma justificativa correta da primeira.");
        questaoAlternativa58.setAlternativasB("As duas asserções são proposições\n" +
                "verdadeiras, e a segunda não é uma justificativa\n" +
                "correta da primeira.");
        questaoAlternativa58.setAlternativasC("A primeira asserção é uma proposição\n" +
                "verdadeira, e a segunda é uma proposição falsa.");
        questaoAlternativa58.setAlternativasD("A primeira asserção é uma proposição falsa, e a segunda é uma proposição verdadeira.");
        questaoAlternativa58.setAlternativasE("As duas asserções são proposições falsas.");
        questaoAlternativa58.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        //WARNING Questão precisa que o usuário desenhe a resposta, não sendo possivel implementar
        QuestaoAlternativa questaoAlternativa59 = new QuestaoAlternativa();
        questaoAlternativa59.setId(INICIOQUESTAO.longValue());
        questaoAlternativa59.setAno(ANO);
        questaoAlternativa59.setDescricao("Anulada");
        questaoAlternativa59.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa59.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa59.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa59.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
        questaoAlternativa59.setAlternativaCorreta("*");

        questaoAlternativa59.setAlternativasA("Anulada");
        questaoAlternativa59.setAlternativasB("Anulada");
        questaoAlternativa59.setAlternativasC("Anulada");
        questaoAlternativa59.setAlternativasD("Anulada");
        questaoAlternativa59.setAlternativasE("Anulada");
        questaoAlternativa59.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        //WARNING Questão precisa que o usuário desenhe a resposta, não sendo possivel implementar
        QuestaoAlternativa questaoAlternativa60 = new QuestaoAlternativa();
        questaoAlternativa60.setId(INICIOQUESTAO.longValue());
        questaoAlternativa60.setAno(ANO);
        questaoAlternativa60.setDescricao("Anulada");
        questaoAlternativa60.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa60.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa60.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa60.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
        questaoAlternativa60.setAlternativaCorreta("*");

        questaoAlternativa60.setAlternativasA("Anulada");
        questaoAlternativa60.setAlternativasB("Anulada");
        questaoAlternativa60.setAlternativasC("Anulada");
        questaoAlternativa60.setAlternativasD("Anulada");
        questaoAlternativa60.setAlternativasE("Anulada");
        questaoAlternativa60.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa61 = new QuestaoAlternativa();
        questaoAlternativa61.setId(INICIOQUESTAO.longValue());
        questaoAlternativa61.setAno(ANO);
        questaoAlternativa61.setDescricao("A figura abaixo, adaptada do documento que descreve o gerenciamento de serviços de tecnologia da informação do modelo ITIL (Information Technology Infra-Structure Library), apresenta as relações entre elementos que participam dos estágios do ciclo de vida de um serviço de TI. Com base no modelo abaixo descrito, qual elemento detém maior responsabilidade por definir as necessidades de informação da organização que utilizará um serviço de TI?");
        questaoAlternativa61.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa61.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa61.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa61.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa61.setAlternativaCorreta("b");
        questaoAlternativa61.setImagem(true);
        questaoAlternativa61.setAlternativasA("usuário");
        questaoAlternativa61.setAlternativasB("cliente");
        questaoAlternativa61.setAlternativasC("operador de suporte técnico");
        questaoAlternativa61.setAlternativasD("gerente de serviços");
        questaoAlternativa61.setAlternativasE("gerente de desenvolvimento de aplicações");
        questaoAlternativa61.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa61.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa62 = new QuestaoAlternativa();
        questaoAlternativa62.setId(INICIOQUESTAO.longValue());
        questaoAlternativa62.setAno(ANO);
        questaoAlternativa62.setDescricao("O código de ética da Organização Internacional de Instituições Supremas de Auditoria (INTOSAI) define como valores e princípios básicos da atuação da auditoria a independência, a objetividade, a imparcialidade, o segredo profissional e a competência. Ao iniciar um trabalho de auditoria sem definir claramente a finalidade da auditoria e o modelo de conformidade no qual a auditoria se apóia, qual valor ou princípio um auditor estaria primariamente falhando em atender?");
        questaoAlternativa62.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa62.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa62.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa62.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa62.setAlternativaCorreta("b");

        questaoAlternativa62.setAlternativasA("independência");
        questaoAlternativa62.setAlternativasB("objetividade");
        questaoAlternativa62.setAlternativasC("imparcialidade");
        questaoAlternativa62.setAlternativasD("segredo profissional");
        questaoAlternativa62.setAlternativasE("competência");
        questaoAlternativa62.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa63 = new QuestaoAlternativa();
        questaoAlternativa63.setId(INICIOQUESTAO.longValue());
        questaoAlternativa63.setAno(ANO);
        questaoAlternativa63.setDescricao("Considere a seguinte representação de abstração de generalização/especialização, com\n" +
                "propriedade de cobertura parcial e sobreposta, segundo notação do diagrama entidade relacionamento estendido.\n" +
                "Qual opção apresenta um esquema de banco de dados relacional que representa corretamente a referida abstração?");
        questaoAlternativa63.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa63.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa63.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa63.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa63.setAlternativaCorreta("c");
        questaoAlternativa63.setImagem(true);
        questaoAlternativa63.setAlternativasA("A($\\underline{pkA}$, atrA) B($\\underline{atrB}$) C($\\underline{atrC}$).");
        questaoAlternativa63.setAlternativasB("A($\\underline{pkA}$, atrA, atrB, atrC, tipoBouC), em que tipoBouC é booleano.");
        questaoAlternativa63.setAlternativasC("A($\\underline{pkA}$, atrA, atrB, atrC, tipoB, tipoC), em que tipoB e tipoC são\n" +
                "booleanos.");
        questaoAlternativa63.setAlternativasD("B($\\underline{pkA}$, atrA, atrB) C($\\underline{pkA}$, atrA, atrC).\n");
        questaoAlternativa63.setAlternativasE("A($\\underline{pkA}$, atrA) B($\\underline{pkB}$, atrB) C($\\underline{pkC}$,\n" +
                "atrC), em que pkB e pkC são atributos\n" +
                "artificiais criados para ser a chave primária das relações B e C, respectivamente.");
        questaoAlternativa63.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa63.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa64 = new QuestaoAlternativa();
        questaoAlternativa64.setId(INICIOQUESTAO.longValue());
        questaoAlternativa64.setAno(ANO);
        questaoAlternativa64.setDescricao("A figura abaixo apresenta uma proposta de classificação de sistemas de informação, organizada tanto no que se refere ao nível hierárquico, no qual atuam os sistemas no âmbito de uma organização, quanto no que se refere às áreas funcionais nas quais esses sistemas são aplicados." +
                "Considere a situação hipotética em que uma rede de supermercados deverá tomar uma decisão com relação à substituição do sistema de automação de “frente de loja”, que apóia as atividades dos caixas nos check-outs.\n" +
                "A decisão envolve substituir o sistema atual, que emprega tecnologia de terminais “burros”, por um que emprega computadores pessoais e redes sem fio. Nesse sentido e\n" +
                "considerando a proposta de classificação apresentada, qual das opções a seguir apresenta uma classificação adequada de nível hierárquico, área funcional e grupo atendido pelo sistema de informações, que oferece apoio direto à referida tomada de decisão?");
        questaoAlternativa64.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa64.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa64.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa64.setDisciplina(EDisciplina.GERENCIA_DE_PROJETOS);
        questaoAlternativa64.setAlternativaCorreta("a");
        questaoAlternativa64.setImagem(true);
        questaoAlternativa64.setAlternativasA("estratégico, vendas e marketing, gerentes seniores");
        questaoAlternativa64.setAlternativasB("conhecimento, finanças, trabalhadores do conhecimento");
        questaoAlternativa64.setAlternativasC("gerencial, contabilidade, gerentes médios");
        questaoAlternativa64.setAlternativasD("operacional, vendas e marketing, gerentes\n" +
                "operacionais");
        questaoAlternativa64.setAlternativasE("estratégico, recursos humanos, gerentes médios");
        questaoAlternativa64.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa64.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa65 = new QuestaoAlternativa();
        questaoAlternativa65.setId(INICIOQUESTAO.longValue());
        questaoAlternativa65.setAno(ANO);
        questaoAlternativa65.setDescricao("Considere os seguintes itens: $\\newline$(i) características do produto;\n" +
                "$\\newline$(ii) o modelo de maturidade e capacidade; $\\newline$(iii) o paradigma\n" +
                "e os métodos de desenvolvimento.$\\newline$ A quais níveis de\n" +
                "abstração de processos esses itens estão, respectivamente, associados?");
        questaoAlternativa65.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa65.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa65.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa65.setDisciplina(EDisciplina.GERENCIA_DE_PROJETOS);
        questaoAlternativa65.setAlternativaCorreta("c");

        questaoAlternativa65.setAlternativasA("processo padrão, processo especializado e processo\n" +
                "instanciado");
        questaoAlternativa65.setAlternativasB("processo padrão, processo instanciado e processo\n" +
                "especializado");
        questaoAlternativa65.setAlternativasC("processo instanciado, processo padrão e processo\n" +
                "especializado");
        questaoAlternativa65.setAlternativasD("processo instanciado, processo especializado e\n" +
                "processo padrão");
        questaoAlternativa65.setAlternativasE("processo especializado, processo padrão e processo\n" +
                "instanciado");
        questaoAlternativa65.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa66 = new QuestaoAlternativa();
        questaoAlternativa66.setId(INICIOQUESTAO.longValue());
        questaoAlternativa66.setAno(ANO);
        questaoAlternativa66.setDescricao("Segundo o modelo COBIT (control objectives for information technology), os processos de TI devem ser auditados por meio de um processo composto pelas etapas de: $\\newline$(i) COMPREENSÃO dos riscos relacionados aos requisitos de negócios e das medidas de controle relevantes; $\\newline$(ii) avaliação da ADEQUABILIDADE (PROPRIEDADE) dos controles declarados; $\\newline$(iii) avaliação de CONFORMIDADE por meio do teste de funcionamento consistente e contínuo dos controles, conforme prescritos; $\\newline$e (iv) SUBSTANCIAÇÃO do risco dos objetivos de controle não serem alcançados por meio de técnicas analíticas\n" +
                "e(ou) consulta a fontes alternativas. $\\newline$Com relação a essas etapas, assinale a opção correta");
        questaoAlternativa66.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa66.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa66.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa66.setDisciplina(EDisciplina.GERENCIA_DE_PROJETOS);
        questaoAlternativa66.setAlternativaCorreta("e");

        questaoAlternativa66.setAlternativasA("Durante a etapa de SUBSTANCIAÇÃO, são realizadas entrevistas com o gestor e os empregados que desempenham o processo de TI, visando identificar leis e regulamentos aplicáveis.");
        questaoAlternativa66.setAlternativasB("Durante a etapa de CONFORMIDADE, são documentadas as fraquezas dos controles em prática, com a indicação das ameaças e vulnerabilidades presentes.");
        questaoAlternativa66.setAlternativasC("Durante a etapa de ADEQUABILIDADE, são obtidas evidências diretas e indiretas aplicáveis a determinados artefatos e períodos de tempo diretamente relacionados ao processo de TI, visandose garantir que os procedimentos em prática sejam\n" +
                "compatíveis com os controles declarados.");
        questaoAlternativa66.setAlternativasD("Durante a etapa de COMPREENSÃO, são identificados e documentados impactos reais e potenciais para a organização, empregando-se análises de causa-raiz.");
        questaoAlternativa66.setAlternativasE("Durante a etapa de ADEQUABILIDADE, é avaliada a conveniência das medidas de controle adotadas para o processo de TI, por meio da consideração de critérios bem definidos, práticas padronizadas da\n" +
                "indústria, fatores críticos de sucesso para as medidas de controle, bem como o julgamento profissional pelo auditor.");
        questaoAlternativa66.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa67 = new QuestaoAlternativa();
        questaoAlternativa67.setId(INICIOQUESTAO.longValue());
        questaoAlternativa67.setAno(ANO);
        questaoAlternativa67.setDescricao("No desenvolvimento e na programação de aplicações em\n" +
                "redes TCP/IP, qual tipo de protocolo de transporte libera o\n" +
                "programador da responsabilidade de detectar e corrigir\n" +
                "erros durante a transmissão, objetivando tornar a\n" +
                "programação da aplicação mais simples?");
        questaoAlternativa67.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa67.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa67.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa67.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa67.setAlternativaCorreta("b");

        questaoAlternativa67.setAlternativasA("sem conexão");
        questaoAlternativa67.setAlternativasB("orientado a conexão");
        questaoAlternativa67.setAlternativasC("orientado a bit");
        questaoAlternativa67.setAlternativasD("orientado a byte");
        questaoAlternativa67.setAlternativasE("datagrama confirmado");
        questaoAlternativa67.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa68 = new QuestaoAlternativa();
        questaoAlternativa68.setId(INICIOQUESTAO.longValue());
        questaoAlternativa68.setAno(ANO);
        questaoAlternativa68.setDescricao("Quando as consultas abaixo são realizadas, o que é recuperado em cada uma delas?");
        questaoAlternativa68.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa68.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa68.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa68.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa68.setAlternativaCorreta("a");
        questaoAlternativa68.setImagem(true);
        questaoAlternativa68.setAlternativasA("I: os nomes dos departamentos que possuem mais de 5 empregados que ganham mais de 10.000 reais e o\n" +
                "número de empregados nessa condição.\n" +
                "$\\newline$II: os nomes dos departamentos que possuem mais de 5 empregados e o número de empregados que ganham\n" +
                "mais de 10.000 reais.");
        questaoAlternativa68.setAlternativasB("I: os nomes dos departamentos que possuem mais de 5 empregados e o número de empregados que ganham\n" +
                "mais de 10.000 reais.\n" +
                "$\\newline$II: os nomes dos departamentos que possuem mais de 5 empregados que ganham mais de 10.000 reais e o\n" +
                "número de empregados nessa condição.");
        questaoAlternativa68.setAlternativasC("I: os nomes dos departamentos que possuem mais de 5 empregados que ganham mais de 10.000 reais e o\n" +
                "número total de funcionários do departamento.\n" +
                "$\\newline$II: os nomes dos departamentos que possuem mais de 5 empregados que ganham mais de 10.000 reais e o\n" +
                "número de empregados nessa condição.\n");
        questaoAlternativa68.setAlternativasD("I: os nomes dos departamentos que possuem mais de 5 empregados que ganham mais de 10.000 reais e o\n" +
                "número de empregados nessa condição.\n" +
                "$\\newline$II: os nomes dos departamentos que possuem mais de 5 empregados que ganham mais de 10.000 reais e o\n" +
                "número total de funcionários do departamento.");
        questaoAlternativa68.setAlternativasE("I: os nomes dos departamentos que possuem mais de 5 empregados que ganham mais de 10.000 reais e o\n" +
                "número de empregados nessa condição.\n" +
                "$\\newline$II: os nomes dos departamentos que possuem mais de 5 empregados que ganham mais de 10.000 reais e o\n" +
                "número de empregados nessa condição.");
        questaoAlternativa68.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa68.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa69 = new QuestaoAlternativa();
        questaoAlternativa69.setId(INICIOQUESTAO.longValue());
        questaoAlternativa69.setAno(ANO);
        questaoAlternativa69.setDescricao("Um ponto crítico para as organizações é a gerência de seus sistemas legados. Quanto a esses sistemas, é importante decidir se eles devem sofrer uma reengenharia, sendo reimplementados, ou não. Essa decisão é tomada após se\n" +
                "avaliarem os sistemas legados com base em dois parâmetros: valor estratégico para a organização, ou seja, o valor que ele agrega para os serviços e produtos da organização; e qualidade do sistema, ou seja, o custo de manutenção uma vez que sistemas de baixa qualidade possuem alto custo de manutenção. Essa avaliação classifica esses sistemas de acordo com as situações de I a IV indicadas abaixo." +
                "Em qual(ais) dessas situações um sistema legado deve ser\n" +
                "classificado para ser indicado a uma reengenharia? ");
        questaoAlternativa69.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa69.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa69.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa69.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa69.setAlternativaCorreta("a");
        questaoAlternativa69.setImagem(true);
        questaoAlternativa69.setAlternativasA("Apenas na situação I.");
        questaoAlternativa69.setAlternativasB("Apenas na situação IV");
        questaoAlternativa69.setAlternativasC("Apenas nas situações I e II.");
        questaoAlternativa69.setAlternativasD("Apenas nas situações II e III.");
        questaoAlternativa69.setAlternativasE("Apenas nas situações III e IV.");
        questaoAlternativa69.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa69.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa70 = new QuestaoAlternativa();
        questaoAlternativa70.setId(INICIOQUESTAO.longValue());
        questaoAlternativa70.setAno(ANO);
        questaoAlternativa70.setDescricao("Ethernet e suas evoluções de 100 Mbps e 1 Gbps são tecnologias padronizadas para comunicações em redes locais com infra-estrutura de transmissão compartilhada. Acerca das transmissões que usam essas tecnologias, assinale a opção incorreta.");
        questaoAlternativa70.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa70.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa70.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa70.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa70.setAlternativaCorreta("c");

        questaoAlternativa70.setAlternativasA("Embora diversos segmentos de uma rede possam ser definidos com o uso de equipamentos de comutação (switches), transmissões de pacotes com endereço de broadcast (difusão) atingem todos os computadores na mesma rede");
        questaoAlternativa70.setAlternativasB("O mecanismo de controle de acesso ao meio utilizado é\n" +
                "distribuído e, nas redes com concentradores (hubs), cada\n" +
                "interface de rede deve determinar quando é possível\n" +
                "realizar uma transmissão.");
        questaoAlternativa70.setAlternativasC("Comutadores (switches) realizam o encaminhamento\n" +
                "seletivo de quadros com base nos endereços IP de cada\n" +
                "estação.");
        questaoAlternativa70.setAlternativasD("A escuta do meio durante as transmissões permite\n" +
                "detectar colisões em segmentos compartilhados e a\n" +
                "necessidade de retransmissões, mas não há envio de\n" +
                "quadros (frames) de confirmação de recebimento.");
        questaoAlternativa70.setAlternativasE("Um mecanismo de controle de consistência é usado para verificar a integridade de cada quadro (frame) transmitido.");
        questaoAlternativa70.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa71 = new QuestaoAlternativa();
        questaoAlternativa71.setId(INICIOQUESTAO.longValue());
        questaoAlternativa71.setAno(ANO);
        questaoAlternativa71.setDescricao("Coesão e acoplamento são dois conceitos fundamentais para a qualidade do projeto modular de um software. A coesão diz respeito à funcionalidade dos módulos que compõem o software e é relacionada ao conceito de ocultação de informação. O acoplamento está relacionado aos dados e representa a interconexão entre os módulos. Suponha que determinado sistema possa ter a arquitetura de seus módulos projetada por meio das duas alternativas diferentes mostradas na figura acima, sendo a funcionalidade de um módulo a mesma nas duas alternativas. Nessa figura, os retângulos representam os módulos e as arestas representam chamadas a funcionalidades de outros módulos. A partir dessas informações, assinale a opção correta.");
        questaoAlternativa71.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa71.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa71.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa71.setDisciplina(EDisciplina.GERENCIA_DE_PROJETOS);
        questaoAlternativa71.setAlternativaCorreta("b");
        questaoAlternativa71.setImagem(true);
        questaoAlternativa71.setAlternativasA("A coesão e o acoplamento de todos os módulos\n" +
                "são iguais nas duas alternativas.");
        questaoAlternativa71.setAlternativasB("Em relação à alternativa 1, na alternativa 2, a coesão do módulo A é menor, a dos módulos B e C é maior e o acoplamento do projeto é maior.");
        questaoAlternativa71.setAlternativasC("Em relação à alternativa 1, na alternativa 2, a coesão do módulo A é maior, a dos módulos B e C é menor e o acoplamento do projeto é maior.");
        questaoAlternativa71.setAlternativasD("Em relação à alternativa 1, na alternativa 2, a coesão do módulo A é maior, a dos módulos B e C é maior e o acoplamento do projeto é menor.");
        questaoAlternativa71.setAlternativasE("Em relação à alternativa 1, na alternativa 2, a coesão do módulo A é menor, a dos módulos B e C é maior e o acoplamento do projeto é menor.");
        questaoAlternativa71.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa71.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa72 = new QuestaoAlternativa();
        questaoAlternativa72.setId(INICIOQUESTAO.longValue());
        questaoAlternativa72.setAno(ANO);
        questaoAlternativa72.setDescricao("Uma empresa de crédito e financiamento utiliza um sistema de informação para analisar simulações, com base em cenários, e determinar como as variações da taxa básica de juros do país afetam seus lucros.\n" +
                "Como deve ser classificado esse sistema de informação?");
        questaoAlternativa72.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa72.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa72.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa72.setDisciplina(EDisciplina.GERENCIA_DE_PROJETOS);
        questaoAlternativa72.setAlternativaCorreta("d");

        questaoAlternativa72.setAlternativasA("sistema de processamento de transações");
        questaoAlternativa72.setAlternativasB("sistema de controle de processos\n");
        questaoAlternativa72.setAlternativasC("sistema de informação gerencial");
        questaoAlternativa72.setAlternativasD("sistema de apoio à decisão");
        questaoAlternativa72.setAlternativasE("sistema de informação executivo");
        questaoAlternativa72.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa73 = new QuestaoAlternativa();
        questaoAlternativa73.setId(INICIOQUESTAO.longValue());
        questaoAlternativa73.setAno(ANO);
        questaoAlternativa73.setDescricao("Uma das técnicas que auxiliam na gerência de projetos de software é o gráfico de atividades, por meio do qual é possível calcular, por exemplo, a duração de um projeto, as atividades críticas e as atividades que possuem folga para sua execução. Nesse gráfico, os círculos representam os eventos iniciais e finais de cada atividade, as arestas representam as atividades, e os números associados às arestas representam a duração dessas atividades.\n" +
                "Considerando-se o gráfico de atividades acima e a tabela de custo de aceleração das atividades da rede que podem ser aceleradas, qual(is) atividade(s) deve(m) ser acelerada(s) para que o tempo do projeto associado a esse gráfico seja reduzido em uma unidade de tempo e para que o custo total de aceleração seja o menor possível?");
        questaoAlternativa73.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa73.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa73.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa73.setDisciplina(EDisciplina.GERENCIA_DE_PROJETOS);
        questaoAlternativa73.setAlternativaCorreta("d");
        questaoAlternativa73.setImagem(true);
        questaoAlternativa73.setAlternativasA("apenas a atividade (C-F)");
        questaoAlternativa73.setAlternativasB("apenas as atividades (D-E) e (E-G)");
        questaoAlternativa73.setAlternativasC("apenas a atividade (E-G) ");
        questaoAlternativa73.setAlternativasD("apenas as atividades (E-G) e (F-H)\n");
        questaoAlternativa73.setAlternativasE("apenas a atividade (E-H)\n");
        questaoAlternativa73.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa73.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa74 = new QuestaoAlternativa();
        questaoAlternativa74.setId(INICIOQUESTAO.longValue());
        questaoAlternativa74.setAno(ANO);
        questaoAlternativa74.setDescricao("No processo de desenvolvimento de software, todo software passa pelas fases de análise e projeto, associadas, respectivamente, com o que deve ser feito e como deve ser feito. A partir dessa informação, avalie a opções correta.");
        questaoAlternativa74.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa74.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa74.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa74.setDisciplina(EDisciplina.GERENCIA_DE_PROJETOS);
        questaoAlternativa74.setAlternativaCorreta("a");

        questaoAlternativa74.setAlternativasA("Na fase de análise, três modelos que devem ser\n" +
                "considerados são: do domínio da informação, o\n" +
                "funcional e o comportamental.");
        questaoAlternativa74.setAlternativasB("Na fase de projeto, dois níveis de projeto devem ser considerados: o projeto detalhado, que se preocupa com uma transformação dos requisitos em um projeto de dados e arquitetural; e o projeto preliminar, que se preocupa em aprimorar o projeto detalhado para que a implementação\n" +
                "possa ser realizada em seguida. ");
        questaoAlternativa74.setAlternativasC("O objetivo do projeto arquitetural é desenvolver uma estrutura de programa e representar os diversos fluxos de dados entre os módulos. ");
        questaoAlternativa74.setAlternativasD("O projeto arquitetural independe do paradigma de\n" +
                "desenvolvimento. ");
        questaoAlternativa74.setAlternativasE("Para lidar com a complexidade do software, pode-se aplicar o princípio do particionamento, quebrando o problema em problemas menores.\n" +
                "Esse princípio não é aplicado nas outras fases de desenvolvimento e ele não causa impacto nos custos de desenvolvimento.");
        questaoAlternativa74.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa75 = new QuestaoAlternativa();
        questaoAlternativa75.setId(INICIOQUESTAO.longValue());
        questaoAlternativa75.setAno(ANO);
        questaoAlternativa75.setDescricao("Considere que a figura abaixo ilustre o cenário de NAPT em uma empresa cujos equipamentos de rede interna (LAN) usam endereços IP privados.\n" +
                "Considere, ainda, que haja apenas um endereço IP válido nas redes dessa empresa, que é atribuído à interface externa do roteador. Considerando que os computadores A e B façam acessos simultâneos a um servidor WWW externo (www.inep.gov.br, por exemplo), quais deverão ser os endereços IP de origem contidos nos pacotes de A e B, respectivamente, que chegarão a esse servidor?");
        questaoAlternativa75.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa75.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa75.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa75.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa75.setAlternativaCorreta("c");
        questaoAlternativa75.setImagem(true);
        questaoAlternativa75.setAlternativasA("10.0.0.1 e 10.0.0.2");
        questaoAlternativa75.setAlternativasB("10.0.0.254 e 10.0.0.254");
        questaoAlternativa75.setAlternativasC("138.76.28.4 e 138.76.28.4");
        questaoAlternativa75.setAlternativasD("138.76.28.1 e 138.76.28.2");
        questaoAlternativa75.setAlternativasE("169.254.1.1 e 169.254.1.2");
        questaoAlternativa75.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa75.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa76 = new QuestaoAlternativa();
        questaoAlternativa76.setId(INICIOQUESTAO.longValue());
        questaoAlternativa76.setAno(ANO);
        questaoAlternativa76.setDescricao("Considere o esquema de relação Cliente(CPF, nome, RGemissor, RGnro, endereco, loginemail, dominioemail) e as seguintes dependências funcionais (DF) válidas sobre o esquema:\n" +
                "$\\newline$DF1: CPF $\\rightarrow$ nome, RGemissor, RGnro, endereco, loginemail, dominioemail\n" +
                "$\\newline$DF2: RGemissor, RGnro $\\rightarrow$ CPF, nome, endereco, loginemail, dominioemail\n" +
                "$\\newline$DF3: loginemail, dominioemail $\\rightarrow$ CPF\n" +
                "$\\newline$Qual é o conjunto completo de chaves candidatas de Cliente e em que forma normal mais alta essa relação está?");
        questaoAlternativa76.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa76.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa76.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa76.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa76.setAlternativaCorreta("d");

        questaoAlternativa76.setAlternativasA("{(RGemissor, RGnro), (CPF)}, na Forma Normal de BoyceCodd (FNBC).");
        questaoAlternativa76.setAlternativasB("{(RGemissor, RGnro), (CPF)}, na Segunda Forma Normal\n" +
                "(2FN).");
        questaoAlternativa76.setAlternativasC("{(loginemail, dominioemail)}, na Forma Normal de BoyceCodd (FNBC).");
        questaoAlternativa76.setAlternativasD("{(RGemissor, RGnro), (loginemail, dominioemail),\n" +
                "(CPF)}, na Forma Normal de Boyce-Codd (FNBC).");
        questaoAlternativa76.setAlternativasE("{(RGemissor, RGnro), (loginemail, dominioemail),\n" +
                "(CPF)}, na Segunda Forma Normal (2FN).\n");
        questaoAlternativa76.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa77 = new QuestaoAlternativa();
        questaoAlternativa77.setId(INICIOQUESTAO.longValue());
        questaoAlternativa77.setAno(ANO);
        questaoAlternativa77.setDescricao("Considere que você trabalhe em uma empresa de desenvolvimento de software e que a empresa tenha decidido desenvolver um novo editor de texto para colocar no mercado. Esse editor deve ser um software que forneça recursos adicionais de apoio à autoria, embasado no estilo de escrita do usuário, o que o torna um software de funcionalidade mais complexa. Considere que a empresa deseje disponibilizar o produto no mercado em versões que agreguem esse suporte de forma gradativa, fazendo análise de risco para avaliar a viabilidade de desenvolvimento de uma nova versão. Tendo de escolher um modelo de processo para desenvolver esse editor, e conhecendo as características dos modelos existentes, entre os modelos abaixo, qual é o modelo apropriado para esse caso?");
        questaoAlternativa77.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa77.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa77.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa77.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa77.setAlternativaCorreta("b");

        questaoAlternativa77.setAlternativasA("cascata");
        questaoAlternativa77.setAlternativasB("espiral");
        questaoAlternativa77.setAlternativasC("RAD (rapid application development)");
        questaoAlternativa77.setAlternativasD("prototipação");
        questaoAlternativa77.setAlternativasE("prototipação");
        questaoAlternativa77.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa78 = new QuestaoAlternativa();
        questaoAlternativa78.setId(INICIOQUESTAO.longValue());
        questaoAlternativa78.setAno(ANO);
        questaoAlternativa78.setDescricao("Considerando o contexto abaixo, julgue os seguintes itens.\n" +
                "$\\newline$I No contexto do projeto acima descrito, aquele que desempenha o papel de usuário do sistema de informação\n" +
                "automatizado não é apenas o paciente, e aquele que desempenha o papel de cliente pode não ser um médico.\n" +
                "$\\newline$II O sistema de informação manual atualmente em uso na referida secretaria de saúde não dá suporte aos processos de negócio dessa secretaria.\n" +
                "$\\newline$III O projeto de automação dos serviços de saúde não é uma solução de outsourcing.\n" +
                "$\\newline$IV No sistema abaixo, os riscos de não-repúdio são aumentados com a automação.\n" +
                "$\\newline$V Para o gestor do sistema de informação a ser automatizado, a acessibilidade é uma característica de menor importância jurídica frente à necessidade de ampliar a confidencialidade.\n" +
                "$\\newline$Estão certos apenas os itens");
        questaoAlternativa78.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa78.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa78.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa78.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa78.setAlternativaCorreta("b");
        questaoAlternativa78.setImagem(true);
        questaoAlternativa78.setAlternativasA("I e II.");
        questaoAlternativa78.setAlternativasB("I e III.");
        questaoAlternativa78.setAlternativasC("II e IV.");
        questaoAlternativa78.setAlternativasD("III e V.");
        questaoAlternativa78.setAlternativasE("IV e V.");
        questaoAlternativa78.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa78.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoDiscusiva questaoDiscusiva79 = new QuestaoDiscusiva();
        questaoDiscusiva79.setId(INICIOQUESTAO.longValue());
        questaoDiscusiva79.setAno(ANO);
        questaoDiscusiva79.setDescricao("Considerando as informações apresentadas no texto e considerando ainda que entre os principais benefícios de um projeto de melhoria de sistema de informação destacam-se o aumento da: (I) eficiência; (II) eficácia; (III) integridade; e (IV) disponibilidade, faça o que se pede a seguir.\n" +
                "$\\newline$A Cite 4 vantagens da solução proposta, frente à atual, para tratar a interação entre pacientes e os serviços de saúde, sendo duas delas relativas à eficiência e duas relativas à eficácia.\n" +
                "$\\newline$B Descreva 2 riscos de segurança da informação que aumentam quando se substitui o sistema atual pelo sistema proposto, e que são relativos à interação entre pacientes e os serviços da referida secretaria de saúde. $\\newline$Um dos riscos deve ser relativo à perda de disponibilidade e o outro, à perda de integridade.");
        questaoDiscusiva79.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoDiscusiva79.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoDiscusiva79.setProva(ETipoQuestaoProva.ENADE);
        questaoDiscusiva79.setDisciplina(EDisciplina.SEGURANÇA_COMPUTACIONAL);
        questaoDiscusiva79.setResposta("A. Eficiência: o estudante deve apresentar qualquer vantagem que aumente a eficiência dos\n" +
                "processos de marcação de consulta, manutenção de prontuário do paciente, além do pedido e\n" +
                "registro de resultados de exame laboratorial. O aumento da eficiência se dá através da redução\n" +
                "de custos e(ou) do tempo em qualquer dos serviços da secretaria de saúde. São exemplos de\n" +
                "redução de custos: menor quantidade de pessoas no atendimento à marcação de consultas,\n" +
                "maior quantidade de consultas realizadas por um médico em um mesmo período de tempo. São\n" +
                "exemplos de redução de tempo: menor tempo para marcação de consultas, menor tempo para\n" +
                "registro do prontuário pelo médico, menor tempo de pedido de exames, menor tempo no\n" +
                "processamento do pedido de exame pelo laboratório, menor tempo no registro do exame pelo\n" +
                "laboratório. Eficácia: O estudante deve apresentar qualquer vantagem que atenda ao\n" +
                "cumprimento dos objetivos estabelecidos para o projeto. No caso específico, foi dito que o\n" +
                "objetivo do projeto é aumento da satisfação dos usuários dos serviços da secretaria. Por\n" +
                "exemplo: O paciente se sentirá mais confortável por não precisar se deslocar até o posto ao\n" +
                "marcar consultas através da web ou de telefone. O paciente não precisa se deslocar para o\n" +
                "laboratório para ter acesso aos resultados dos exames.\n" +
                "$\\newline$B. Risco de Disponibilidade: os riscos devem ser descritos em termos de ameaças explorando\n" +
                "vulnerabilidades, que reduzem a disponibilidade do acesso à informação. São exemplos de\n" +
                "riscos aumentados com o novo sistema: (i) a falta de energia elétrica, por exemplo, poderá levar\n" +
                "ao não funcionamento do servidor ou das máquinas clientes web, fazendo com que as\n" +
                "informações sobre prontuários, pacientes, consultas e exames fiquem inacessíveis; (ii) falhas de\n" +
                "conectividade à internet poderão levar o sistema à indisponibilidade, e impedir que o médico\n" +
                "acesse as informações do paciente, que os atendentes marquem consultas, que os laboratórios\n" +
                "recebam e processem pedidos de exame etc. Cada cenário específico de forma individualizada\n" +
                "ou agregada é contabilizado como um risco de indisponibilidade. Risco de Perda de Integridade:\n" +
                "os riscos devem ser descritos em termos de ameaças explorando vulnerabilidades e que\n" +
                "reduzem a integridade (funcionamento, propriedade, perda da característica de funcionamento\n" +
                "adequado) dos ativos de informação. São exemplos de riscos de integridade aumentados com o\n" +
                "novo sistema: (i) quebra de equipamentos de armazenamento, como discos rígidos e outras\n" +
                "mídias que poderão levar a perda de informações sobre pacientes, médicos, exames,\n" +
                "laboratórios etc; (ii) incêndios em postos de saúde poderão prejudicar o sistema elétrico e\n" +
                "conseqüentemente inviabilizar o uso dos computadores que apóiam o funcionamento dos\n" +
                "serviços. Outros riscos poderão ser descritos.");
        questaoDiscusiva79.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        //WARNING Questão precisa que o usuário desenhe a resposta, não sendo possivel implementar
        QuestaoAlternativa questaoAlternativa80 = new QuestaoAlternativa();
        questaoAlternativa80.setId(INICIOQUESTAO.longValue());
        questaoAlternativa80.setAno(ANO);
        questaoAlternativa80.setDescricao("Anulada");
        questaoAlternativa80.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa80.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa80.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa80.setDisciplina(EDisciplina.GERENCIA_DE_PROJETOS);
        questaoAlternativa80.setAlternativaCorreta("*");

        questaoAlternativa80.setAlternativasA("Anulada");
        questaoAlternativa80.setAlternativasB("Anulada");
        questaoAlternativa80.setAlternativasC("Anulada");
        questaoAlternativa80.setAlternativasD("Anulada");
        questaoAlternativa80.setAlternativasE("Anulada");
        questaoAlternativa80.setNumeroQuestao(NUMEROQUESTAO);

        List<Questao> questoes = new ArrayList<>();
        questoes.add(questaoAlternativa1);
        questoes.add(questaoAlternativa2);
        questoes.add(questaoAlternativa3);
        questoes.add(questaoAlternativa4);
        questoes.add(questaoAlternativa5);
        questoes.add(questaoAlternativa6);
        questoes.add(questaoAlternativa7);
        questoes.add(questaoAlternativa8);
        questoes.add(questaoDiscursiva9);
        questoes.add(questaoDiscursiva10);
        questoes.add(questaoAlternativa11);
        questoes.add(questaoAlternativa12);
        questoes.add(questaoAlternativa13);
        questoes.add(questaoAlternativa14);
        questoes.add(questaoAlternativa15);
        questoes.add(questaoAlternativa16);
        questoes.add(questaoAlternativa17);
        questoes.add(questaoAlternativa18);
        questoes.add(questaoAlternativa19);
        questoes.add(questaoAlternativa20);
        questoes.add(questaoAlternativa21);
        questoes.add(questaoAlternativa22);
        questoes.add(questaoAlternativa23);
        questoes.add(questaoAlternativa24);
        questoes.add(questaoAlternativa25);
        questoes.add(questaoAlternativa26);
        questoes.add(questaoAlternativa27);
        questoes.add(questaoAlternativa28);
        questoes.add(questaoAlternativa29);
        questoes.add(questaoAlternativa30);
        questoes.add(questaoAlternativa31);
        questoes.add(questaoAlternativa32);
        questoes.add(questaoAlternativa33);
        questoes.add(questaoAlternativa34);
        questoes.add(questaoAlternativa35);
        questoes.add(questaoAlternativa36);
        questoes.add(questaoAlternativa37);
        questoes.add(questaoAlternativa38);
        questoes.add(questaoAlternativa39);
        questoes.add(questaoAlternativa40);
        questoes.add(questaoAlternativa41);
        questoes.add(questaoAlternativa42);
        questoes.add(questaoAlternativa43);
        questoes.add(questaoAlternativa44);
        questoes.add(questaoAlternativa45);
        questoes.add(questaoAlternativa46);
        questoes.add(questaoAlternativa47);
        questoes.add(questaoAlternativa48);
        questoes.add(questaoAlternativa49);
        questoes.add(questaoAlternativa50);
        questoes.add(questaoAlternativa51);
        questoes.add(questaoAlternativa52);
        questoes.add(questaoAlternativa53);
        questoes.add(questaoAlternativa54);
        questoes.add(questaoAlternativa55);
        questoes.add(questaoAlternativa56);
        questoes.add(questaoAlternativa57);
        questoes.add(questaoAlternativa58);
        questoes.add(questaoAlternativa59);
        questoes.add(questaoAlternativa60);
        questoes.add(questaoAlternativa61);
        questoes.add(questaoAlternativa62);
        questoes.add(questaoAlternativa63);
        questoes.add(questaoAlternativa64);
        questoes.add(questaoAlternativa65);
        questoes.add(questaoAlternativa66);
        questoes.add(questaoAlternativa67);
        questoes.add(questaoAlternativa68);
        questoes.add(questaoAlternativa69);
        questoes.add(questaoAlternativa70);
        questoes.add(questaoAlternativa71);
        questoes.add(questaoAlternativa72);
        questoes.add(questaoAlternativa73);
        questoes.add(questaoAlternativa74);
        questoes.add(questaoAlternativa75);
        questoes.add(questaoAlternativa76);
        questoes.add(questaoAlternativa77);
        questoes.add(questaoAlternativa78);
        questoes.add(questaoDiscusiva79);
        questoes.add(questaoAlternativa80);

        return questoes;
    }

}
