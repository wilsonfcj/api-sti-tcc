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

public class QuestaoEnade2011 {

    final static Integer ANO = 2011;
    static Integer INICIOQUESTAO = 1356;
    static Integer NUMEROQUESTAO = 1;

    public static List<Questao> register() {

        QuestaoAlternativa questaoAlternativa1 = new QuestaoAlternativa();
        questaoAlternativa1.setId(INICIOQUESTAO.longValue());
        questaoAlternativa1.setAno(ANO);
        questaoAlternativa1.setDescricao("No poema abaixo, a autora sugere que");
        questaoAlternativa1.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa1.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa1.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa1.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa1.setAlternativaCorreta("d");
        questaoAlternativa1.setImagem(true);
        questaoAlternativa1.setAlternativasA("os príncipes e as princesas são naturalmente belos.");
        questaoAlternativa1.setAlternativasB("os príncipes generosos cultivavam a beleza da princesa.");
        questaoAlternativa1.setAlternativasC("a beleza da princesa é desperdiçada pela miscigenação racial.");
        questaoAlternativa1.setAlternativasD("o trabalho compulsório de escravos proporcionou privilégios aos príncipes");
        questaoAlternativa1.setAlternativasE("o exílio e a solidão são os responsáveis pela manutenção do corpo esbelto da princesa.");
        questaoAlternativa1.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa1.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa2 = new QuestaoAlternativa();
        questaoAlternativa2.setId(INICIOQUESTAO.longValue());
        questaoAlternativa2.setAno(ANO);
        questaoAlternativa2.setDescricao("Exclusão digital é um conceito que diz respeito às extensas camadas sociais que ficaram à margem do fenômeno da sociedade da informação e da extensão das redes digitais. O problema da exclusão digital se apresenta como um dos maiores desafios dos dias de hoje, com implicações diretas e indiretas sobre os mais variados aspectos da sociedade contemporânea.\n" +
                "Nessa nova sociedade, o conhecimento é essencial para aumentar a produtividade e a competição global. É fundamental para a invenção, para a inovação e para a geração de riqueza. As tecnologias de informação e comunicação (TICs) proveem uma fundação para a construção e aplicação do conhecimento nos setores públicos e privados. É nesse contexto que se aplica o termo exclusão digital, referente à falta de acesso às vantagens e aos benefícios trazidos por essas novas tecnologias, por motivos sociais, econômicos, políticos ou culturais.\n" +
                "$\\newline$Considerando as ideias do texto acima, avalie as afirmações a seguir.\n" +
                "$\\newline$I. Um mapeamento da exclusão digital no Brasil permite aos gestores de políticas públicas escolherem o públicoalvo de possíveis ações de inclusão digital.\n" +
                "$\\newline$II. O uso das TICs pode cumprir um papel social, ao prover informações àqueles que tiveram esse direito negado\n" +
                "ou negligenciado e, portanto, permitir maiores graus de mobilidade social e econômica.\n" +
                "$\\newline$III. O direito à informação diferencia-se dos direitos sociais, uma vez que esses estão focados nas relações entre\n" +
                "os indivíduos e, aqueles, na relação entre o indivíduo e o conhecimento.\n" +
                "$\\newline$IV. O maior problema de acesso digital no Brasil está na deficitária tecnologia existente em território nacional, muito\n" +
                "aquém da disponível na maior parte dos países do primeiro mundo.\n" +
                "$\\newline$É correto apenas o que se afirma em");
        questaoAlternativa2.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa2.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa2.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa2.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa2.setAlternativaCorreta("a");

        questaoAlternativa2.setAlternativasA("I e II.");
        questaoAlternativa2.setAlternativasB("II e IV");
        questaoAlternativa2.setAlternativasC("III e IV.");
        questaoAlternativa2.setAlternativasD("I, II e III.");
        questaoAlternativa2.setAlternativasE("I, III e IV.");
        questaoAlternativa2.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa3 = new QuestaoAlternativa();
        questaoAlternativa3.setId(INICIOQUESTAO.longValue());
        questaoAlternativa3.setAno(ANO);
        questaoAlternativa3.setDescricao("O desenvolvimento de redes de relacionamento por meio de computadores e a expansão da Internet abriram novas perspectivas para a cultura, a comunicação e a educação.\n" +
                "De acordo com as ideias do texto acima, a cibercultura");
        questaoAlternativa3.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa3.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa3.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa3.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa3.setAlternativaCorreta("e");
        questaoAlternativa3.setImagem(true);
        questaoAlternativa3.setAlternativasA("representa uma modalidade de cultura pós-moderna\n" +
                "de liberdade de comunicação e ação.\n");
        questaoAlternativa3.setAlternativasB("constituiu negação dos valores progressistas defendidos pelos filósofos do Iluminismo.");
        questaoAlternativa3.setAlternativasC("banalizou a ciência ao disseminar o conhecimento nas\n" +
                "redes sociais");
        questaoAlternativa3.setAlternativasD("valorizou o isolamento dos indivíduos pela produção de softwares de codificação");
        questaoAlternativa3.setAlternativasE("incorpora valores do Iluminismo ao favorecer o\n" +
                "compartilhamento de informações e conhecimentos.");
        questaoAlternativa3.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa3.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa4 = new QuestaoAlternativa();
        questaoAlternativa4.setId(INICIOQUESTAO.longValue());
        questaoAlternativa4.setAno(ANO);
        questaoAlternativa4.setDescricao("Com o advento da República, a discussão sobre a questão\n" +
                "educacional torna-se pauta significativa nas esferas dos\n" +
                "Poderes Executivo e Legislativo, tanto no âmbito Federal\n" +
                "quanto no Estadual. Já na Primeira República, a expansão\n" +
                "da demanda social se propaga com o movimento da escolanovista; no período getulista, encontram-se as reformas\n" +
                "de Francisco Campos e Gustavo Capanema; no momento\n" +
                "de crítica e balanço do pós-1946, ocorre a promulgação\n" +
                "da primeira Lei de Diretrizes e Bases da Educação\n" +
                "Nacional, em 1961. É somente com a Constituição de\n" +
                "1988, no entanto, que os brasileiros têm assegurada a\n" +
                "educação de forma universal, como um direito de todos,\n" +
                "tendo em vista o pleno desenvolvimento da pessoa no que\n" +
                "se refere a sua preparação para o exercício da cidadania\n" +
                "e sua qualificação para o trabalho. O artigo 208 do texto\n" +
                "constitucional prevê como dever do Estado a oferta da\n" +
                "educação tanto a crianças como àqueles que não tiveram\n" +
                "acesso ao ensino em idade própria à escolarização cabida.\n" +
                "Nesse contexto, avalie as seguintes asserções e a relação\n" +
                "proposta entre elas.\n" +
                "A relação entre educação e cidadania se estabelece na\n" +
                "busca da universalização da educação como uma das\n" +
                "condições necessárias para a consolidação da democracia\n" +
                "no Brasil.\n" +
                "$\\newline$PORQUE\n" +
                "$\\newline$Por meio da atuação de seus representantes nos Poderes\n" +
                "Executivos e Legislativo, no decorrer do século XX,\n" +
                "passou a ser garantido no Brasil o direito de acesso à\n" +
                "educação, inclusive aos jovens e adultos que já estavam\n" +
                "fora da idade escolar.\n" +
                "$\\newline$A respeito dessas asserções, assinale a opção correta.");
        questaoAlternativa4.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa4.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa4.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa4.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa4.setAlternativaCorreta("a");

        questaoAlternativa4.setAlternativasA("As duas são proposições verdadeiras, e a segunda é\n" +
                "uma justificativa correta da primeira.");
        questaoAlternativa4.setAlternativasB("As duas são proposições verdadeiras, mas a segunda\n" +
                "não é uma justificativa correta da primeira");
        questaoAlternativa4.setAlternativasC("A primeira é uma proposição verdadeira, e a segunda, falsa.");
        questaoAlternativa4.setAlternativasD("A primeira é uma proposição falsa, e a segunda, verdadeira");
        questaoAlternativa4.setAlternativasE("Tanto a primeira quanto a segunda asserções são\n" +
                "proposições falsas.");
        questaoAlternativa4.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa5 = new QuestaoAlternativa();
        questaoAlternativa5.setId(INICIOQUESTAO.longValue());
        questaoAlternativa5.setAno(ANO);
        questaoAlternativa5.setDescricao("De acordo com as informações do mapa e do texto,");
        questaoAlternativa5.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa5.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa5.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa5.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa5.setAlternativaCorreta("c");
        questaoAlternativa5.setImagem(true);
        questaoAlternativa5.setAlternativasA("foram desmatados 1 534 $km^{2}$ na Amazônia Legal nos últimos dois anos.");
        questaoAlternativa5.setAlternativasB("não houve aumento do desmatamento no último ano na Amazônia Legal.");
        questaoAlternativa5.setAlternativasC("três estados brasileiros responderam por 84% do desmatamento na Amazônia Legal entre agosto de 2010 e junho de 2011.");
        questaoAlternativa5.setAlternativasD("o estado do Amapá apresenta alta taxa de desmatamento em comparação aos demais estados da Amazônia Legal.");
        questaoAlternativa5.setAlternativasE("o desmatamento na Amazônia Legal, em junho de 2010, foi de 140 $km^{2}$, comparando-se o índice de junho de 2011\n" +
                "ao índice de junho de 2010.");
        questaoAlternativa5.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa5.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa6 = new QuestaoAlternativa();
        questaoAlternativa6.setId(INICIOQUESTAO.longValue());
        questaoAlternativa6.setAno(ANO);
        questaoAlternativa6.setDescricao("A expressão “o Xis da questão” usada no título do infográfico diz respeito");
        questaoAlternativa6.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa6.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa6.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa6.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa6.setAlternativaCorreta("b");
        questaoAlternativa6.setImagem(true);
        questaoAlternativa6.setAlternativasA("à quantidade de anos de estudos necessários para\n" +
                "garantir um emprego estável com salário digno.");
        questaoAlternativa6.setAlternativasB("às oportunidades de melhoria salarial que surgem à medida\n" +
                "que aumenta o nível de escolaridade dos indivíduos.");
        questaoAlternativa6.setAlternativasC("à influência que o ensino de língua estrangeira nas escolas tem exercido na vida profissional dos indivíduos.");
        questaoAlternativa6.setAlternativasD("aos questionamentos que são feitos acerca da quantidade mínima de anos de estudo que os indivíduos precisam para ter boa educação.");
        questaoAlternativa6.setAlternativasE("à redução da taxa de desemprego em razão da política atual de controle da evasão escolar e de aprovação automática de ano de acordo com a idade.");
        questaoAlternativa6.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa6.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa7 = new QuestaoAlternativa();
        questaoAlternativa7.setId(INICIOQUESTAO.longValue());
        questaoAlternativa7.setAno(ANO);
        questaoAlternativa7.setDescricao("A definição de desenvolvimento sustentável mais\n" +
                "usualmente utilizada é a que procura atender às\n" +
                "necessidades atuais sem comprometer a capacidade das\n" +
                "gerações futuras. O mundo assiste a um questionamento\n" +
                "crescente de paradigmas estabelecidos na economia e\n" +
                "também na cultura política. A crise ambiental no planeta,\n" +
                "quando traduzida na mudança climática, é uma ameaça real ao pleno desenvolvimento das potencialidades dos países.\n" +
                "O Brasil está em uma posição privilegiada para enfrentar\n" +
                "os enormes desafios que se acumulam. Abriga elementos\n" +
                "fundamentais para o desenvolvimento: parte significativa\n" +
                "da biodiversidade e da água doce existentes no planeta;\n" +
                "grande extensão de terras cultiváveis; diversidade étnica e\n" +
                "cultural e rica variedade de reservas naturais.\n" +
                "O campo do desenvolvimento sustentável pode ser\n" +
                "conceitualmente dividido em três componentes:\n" +
                "sustentabilidade ambiental, sustentabilidade econômica e\n" +
                "sustentabilidade sociopolítica.\n" +
                "Nesse contexto, o desenvolvimento sustentável pressupõe");
        questaoAlternativa7.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa7.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa7.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa7.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa7.setAlternativaCorreta("b");

        questaoAlternativa7.setAlternativasB("a preservação do equilíbrio global e do valor das reservas de capital natural, o que não justifica a desaceleração do desenvolvimento econômico e político de uma sociedade.");
        questaoAlternativa7.setAlternativasB("a redefinição de critérios e instrumentos de\n" +
                "avaliação de custo-benefício que reflitam os efeitos\n" +
                "socioeconômicos e os valores reais do consumo e da\n" +
                "preservação.");
        questaoAlternativa7.setAlternativasC("o reconhecimento de que, apesar de os recursos\n" +
                "naturais serem ilimitados, deve ser traçado um\n" +
                "novo modelo de desenvolvimento econômico para a\n" +
                "humanidade.");
        questaoAlternativa7.setAlternativasD("a redução do consumo das reservas naturais com\n" +
                "a consequente estagnação do desenvolvimento\n" +
                "econômico e tecnológico.");
        questaoAlternativa7.setAlternativasE("a distribuição homogênea das reservas naturais entre as nações e as regiões em nível global e regional.");
        questaoAlternativa7.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa8 = new QuestaoAlternativa();
        questaoAlternativa8.setId(INICIOQUESTAO.longValue());
        questaoAlternativa8.setAno(ANO);
        questaoAlternativa8.setDescricao("Considerando as ideias do texto abaixo, avalie as afirmações a seguir.\n" +
                "$znewline$I. Chavs é um apelido que exalta hábitos de consumo de parcela da população britânica.\n" +
                "$znewline$II. Os distúrbios ocorridos na Inglaterra serviram para atribuir deslizes de comportamento individual como causas\n" +
                "de problemas sociais.\n" +
                "$znewline$III. Indivíduos da classe trabalhadora britânica são responsabilizados pela falta de oportunidades decorrente da ausência de políticas públicas.\n" +
                "$znewline$IV. As manifestações de rua na Inglaterra reivindicavam formas de inclusão nos padrões de consumo vigente.\n" +
                "$znewline$É correto apenas o que se afirma em");
        questaoAlternativa8.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa8.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa8.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa8.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa8.setAlternativaCorreta("e");
        questaoAlternativa8.setImagem(true);
        questaoAlternativa7.setAlternativasB("I e II.");
        questaoAlternativa7.setAlternativasB("I e IV.");
        questaoAlternativa7.setAlternativasC("II e III.");
        questaoAlternativa7.setAlternativasD("I, III e IV.");
        questaoAlternativa7.setAlternativasE("II, III e IV.");
        questaoAlternativa7.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa8.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoDiscusiva questaoDiscursiva9 = new QuestaoDiscusiva();
        questaoDiscursiva9.setId(INICIOQUESTAO.longValue());
        questaoDiscursiva9.setAno(ANO);
        questaoDiscursiva9.setDescricao("A Educação a Distância (EaD) é a modalidade de ensino que permite que a comunicação e a construção do conhecimento entre os usuários envolvidos possam acontecer em locais e tempos distintos. São necessárias tecnologias cada vez mais sofisticadas para essa modalidade de ensino não presencial, com vistas à crescente necessidade de uma pedagogia que se desenvolva por meio de novas relações de ensino-aprendizagem.\n" +
                "O Censo da Educação Superior de 2009, realizado pelo MEC/INEP, aponta para o aumento expressivo do número de matrículas nessa modalidade. Entre 2004 e 2009, a participação da EaD na Educação Superior passou de 1,4%\n" +
                "para 14,1%, totalizando 838 mil matrículas, das quais 50% em cursos de licenciatura. Levantamentos apontam ainda que 37% dos estudantes de EaD estão na pós-graduação e que 42% estão fora do seu estado de origem.\n" +
                "Considerando as informações acima, enumere três vantagens de um curso a distância, justificando brevemente cada uma delas");
        questaoDiscursiva9.setTipoFormcao(EFormacao.GERAL);
        questaoDiscursiva9.setProva(ETipoQuestaoProva.ENADE);
        questaoDiscursiva9.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoDiscursiva9.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoDiscursiva9.setResposta("O estudante deve ser capaz de apontar algumas vantagens dentre as seguintes, quanto à modalidade EaD:\n" +
                "$\\newline$(i) flexibilidade de horário e de local, pois o aluno estabelece o seu ritmo de estudo;  \n" +
                "$\\newline$(ii) valor do curso, em geral, é mais baixo que do ensino presencial;  \n" +
                "$\\newline$(iii) capilaridade ou possibilidade de acesso em locais não atendidos pelo ensino presencial;\n" +
                "$\\newline$(iv) democratização de acesso à educação, pois atende a um público maior e mais variado que os cursos presenciais; além de contribuir para o desenvolvimento local e regional;\n" +
                "$\\newline$(v) troca de experiência e conhecimento entre os participantes, sobretudo quando dificilmente de forma presencial isso seria possível (exemplo, de pontos geográficos longínquos);  \n" +
                "$\\newline$(vi) incentivo à educação permanente em virtude da significativa diversidade de cursos e de níveis de ensino;\n" +
                "$\\newline$(vii) inclusão digital,permitindo a familiarização com as mais diversas tecnologias;\n" +
                "$\\newline$(viii) aperfeiçoamento/formação pessoal e profissional de pessoas que, por distintos motivos, não poderiam frequentar as escolas regulares;  \n" +
                "$\\newline$(ix) formação/qualificação/habilitação de professores, suprindo  demandas em vastas áreas do país;\n" +
                "$\\newline$(x) inclusão de pessoas com comprometimento motor reduzindo os deslocamentos diários.");
        questaoDiscursiva9.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoDiscusiva questaoDiscursiva10 = new QuestaoDiscusiva();
        questaoDiscursiva10.setId(INICIOQUESTAO.longValue());
        questaoDiscursiva10.setAno(ANO);
        questaoDiscursiva10.setDescricao("Com base nos dados apresentados abaixo, redija um texto dissertativo acerca da importância de políticas e programas educacionais para a erradicação do analfabetismo e para a empregabilidade, considerando as disparidades sociais e as dificuldades de obtenção de emprego provocadas pelo analfabetismo. Em seu texto, apresente uma proposta para a superação do analfabetismo e para o aumento da empregabilidade. ");
        questaoDiscursiva10.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoDiscursiva10.setTipoFormcao(EFormacao.GERAL);
        questaoDiscursiva10.setProva(ETipoQuestaoProva.ENADE);
        questaoDiscursiva10.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoDiscursiva10.setResposta("O estudante deve abordar em seu texto:\n" +
                "$\\newline$• identificação e análise das desigualdades sociais acentuadas pelo analfabetismo,\n" +
                "demonstrando capacidade de examinar e interpretar criticamente o quadro atual da\n" +
                "educação com ênfase no analfabetismo;\n" +
                "$\\newline$• abordagem do analfabetismo numa perspectiva crítica, participativa, apontando\n" +
                "agentes sociais e   alternativas que viabilizem a realização de esforços para sua\n" +
                "superação, estabelecendo relação entre o analfabetismo e a dificuldade para a\n" +
                "obtenção de emprego;\n" +
                "$\\newline$• indicação de avanços e deficiências de políticas e de programas de erradicação do\n" +
                "analfabetismo, assinalando iniciativas realizadas ao longo do período tratado e seus\n" +
                "resultados, expressando que estas ações, embora importantes para a eliminação do\n" +
                "analfabetismo, ainda se mostram insuficientes.");
        questaoDiscursiva10.setImagem(true);
        questaoDiscursiva10.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoDiscursiva10.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa11 = new QuestaoAlternativa();
        questaoAlternativa11.setId(INICIOQUESTAO.longValue());
        questaoAlternativa11.setAno(ANO);
        questaoAlternativa11.setDescricao("eja A um conjunto e seja ~ uma relação entre pares de\n" +
                "elementos de A.\n" +
                "Diz-se que ~ é uma relação de equivalência entre pares\n" +
                "de elementos de A se as seguintes propriedades são\n" +
                "verifi cadas, para quaisquer elementos a, a’ e a’’ de A:\n" +
                "$\\newline$(i) a ~ a;\n" +
                "$\\newline$(ii) se a ~ a’, então a’ ~ a;\n" +
                "$\\newline$(iii) se a ~ a’ e a’ ~ a’’, então a ~ a’’.\n" +
                "$\\newline$Uma classe de equivalência do elemento a de A com\n" +
                "respeito à relação ~ é o conjunto $\\overline{a} = \\left\\{x \\in A:x \\sim a\\right\\}$\n" +
                "O conjunto quociente de A pela relação de equivalência ~ é o conjunto de todas as classes de equivalência relativamente à relação ~, definido e denotado como a seguir: $\\\\A/\\sim = \\left\\{ \\overline{a}: a \\in A\\right\\}\\\\$\n" +
                "$\\newline$A função $\\pi : A \\rightarrow A/ \\sim$ é chamada projeção canônica e é definida como $\\pi (a) = \\overline{a},\\forall a \\in A$\n" +
                "$\\newline$Considerando as definições acima, analise as afi rmações\n" +
                "a seguir.\n" +
                "$\\newline$I. A relação de equivalência ~ no conjunto A\n" +
                "particiona o conjunto A em subconjuntos disjuntos:\n" +
                "as classes de equivalência.\n" +
                "$\\newline$II. A união das classes de equivalência da relação de\n" +
                "equivalência ~ no conjunto A resulta no conjunto\n" +
                "das partes de A.\n" +
                "$\\newline$III. As três relações seguintes $\\\\ = \\\\ \\equiv (mod\\,\\,\\,n) \\\\ \\geq\\\\$ são relações de equivalência no conjunto dos\n" +
                "números inteiros $\\mathbb{Z}$.\n" +
                "$\\newline$IV. Qualquer relação de equivalência no conjunto A é\n" +
                "proveniente de sua projeção canônica.\n" +
                "É correto apenas o que se afirma em");
        questaoAlternativa11.setArea(EArea.MATEMATICA);
        questaoAlternativa11.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa11.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa11.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa11.setAlternativaCorreta("d");

        questaoAlternativa11.setAlternativasA("II.");
        questaoAlternativa11.setAlternativasB("III.");
        questaoAlternativa11.setAlternativasC("I e III.");
        questaoAlternativa11.setAlternativasD("I e IV.");
        questaoAlternativa11.setAlternativasE("II e IV.");
        questaoAlternativa11.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa12 = new QuestaoAlternativa();
        questaoAlternativa12.setId(INICIOQUESTAO.longValue());
        questaoAlternativa12.setAno(ANO);
        questaoAlternativa12.setDescricao("Em determinado período letivo, cada estudante de um curso universitário tem aulas com um de três professores, esses identificados pelas letras X, Y e Z. As quantidades de estudantes (homens e mulheres) que têm aulas com cada professor é apresentada na tabela de contingência abaixo.\n" +
                "A partir do grupo de estudantes desse curso universitário, escolhe-se um estudante ao acaso. Qual é a probabilidade de que esse estudante seja mulher, dado que ele tem aulas apenas com o professor X?");
        questaoAlternativa12.setArea(EArea.MATEMATICA);
        questaoAlternativa12.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa12.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa12.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa12.setAlternativaCorreta("e");
        questaoAlternativa12.setImagem(true);
        questaoAlternativa12.setAlternativasA("$\\frac{61}{73}$");
        questaoAlternativa12.setAlternativasB("$\\frac{61}{155}$");
        questaoAlternativa12.setAlternativasC("$\\frac{67}{155}$");
        questaoAlternativa12.setAlternativasD("$\\frac{22}{112}$");
        questaoAlternativa12.setAlternativasE("$\\frac{67}{112}$");
        questaoAlternativa12.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa12.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa13 = new QuestaoAlternativa();
        questaoAlternativa13.setId(INICIOQUESTAO.longValue());
        questaoAlternativa13.setAno(ANO);
        questaoAlternativa13.setDescricao("O problema da parada para máquinas de Turing, ou\n" +
                "simplesmente problema da parada, pode ser assim\n" +
                "descrito: determinar, para quaisquer máquina de Turing M\n" +
                "e palavra w, se M irá eventualmente parar com entrada w.\n" +
                "Mais informalmente, o mesmo problema também pode\n" +
                "ser assim descrito: dados um algoritmo e uma entrada\n" +
                "finita, decidir se o algoritmo termina ou se executará\n" +
                "indefinidamente.\n" +
                "Para o problema da parada,");
        questaoAlternativa13.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa13.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa13.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa13.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa13.setAlternativaCorreta("c");

        questaoAlternativa13.setAlternativasA("existe algoritmo exato de tempo de execução\n" +
                "polinomial para solucioná-lo.");
        questaoAlternativa13.setAlternativasB("existe algoritmo exato de tempo de execução\n" +
                "exponencial para solucioná-lo.");
        questaoAlternativa13.setAlternativasC("não existe algoritmo que o solucione, não importa quanto tempo seja disponibilizado.");
        questaoAlternativa13.setAlternativasD("não existe algoritmo exato, mas existe algoritmo de aproximação de tempo de execução polinomial que o soluciona, fornecendo respostas aproximadas.");
        questaoAlternativa13.setAlternativasE("não existe algoritmo exato, mas existe algoritmo de aproximação de tempo de execução exponencial que o soluciona, fornecendo respostas aproximadas. ");
        questaoAlternativa13.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa14 = new QuestaoAlternativa();
        questaoAlternativa14.setId(INICIOQUESTAO.longValue());
        questaoAlternativa14.setAno(ANO);
        questaoAlternativa14.setDescricao("Considere a gramática a seguir, em que S, A e B são símbolos não terminais, 0 e 1 são terminais e $\\varepsilon$ é a cadeia vazia. $\\\\ S \\rightarrow 1S|0A|\\varepsilon \\\\ A \\rightarrow $\\newline$1S|0B|$\\varepsilon$ $\\newline$ B $\\rightarrow$ 1S|$\\varepsilon\\\\$\n" +
                "$\\newline$A respeito dessa gramática, analise as afirmações a seguir.\n" +
                "$\\newline$I. Nas cadeias geradas por essa gramática, o último\n" +
                "símbolo é 1.\n" +
                "$\\newline$II. O número de zeros consecutivos nas cadeias\n" +
                "geradas pela gramática é, no máximo, dois.\n" +
                "$\\newline$III. O número de uns em cada cadeia gerada pela\n" +
                "gramática é maior que o número de zeros.\n" +
                "$\\newline$IV. Nas cadeias geradas por essa gramática, todos os\n" +
                "uns estão à esquerda de todos os zeros.\n" +
                "$\\newline$É correto apenas o que se afirma em");
        questaoAlternativa14.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa14.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa14.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa14.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa14.setAlternativaCorreta("b");

        questaoAlternativa14.setAlternativasA("I.");
        questaoAlternativa14.setAlternativasB("II.");
        questaoAlternativa14.setAlternativasC("I e III.");
        questaoAlternativa14.setAlternativasD("II e IV.");
        questaoAlternativa14.setAlternativasE("III e IV.");
        questaoAlternativa14.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa15 = new QuestaoAlternativa();
        questaoAlternativa15.setId(INICIOQUESTAO.longValue());
        questaoAlternativa15.setAno(ANO);
        questaoAlternativa15.setDescricao("Anulada");
        questaoAlternativa15.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa15.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa15.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa15.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa15.setAlternativaCorreta("*");

        questaoAlternativa15.setAlternativasA("Anulada");
        questaoAlternativa15.setAlternativasB("Anulada");
        questaoAlternativa15.setAlternativasC("Anulada");
        questaoAlternativa15.setAlternativasD("Anulada");
        questaoAlternativa15.setAlternativasE("Anulada");
        questaoAlternativa15.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa16 = new QuestaoAlternativa();
        questaoAlternativa16.setId(INICIOQUESTAO.longValue());
        questaoAlternativa16.setAno(ANO);
        questaoAlternativa16.setDescricao("Observe o diagrama de Venn abaixo.\n" +
                "A função representada em azul no diagrama também poderia ser expressa pela função lógica $f(x,y,z) = $");
        questaoAlternativa16.setArea(EArea.MATEMATICA);
        questaoAlternativa16.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa16.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa16.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa16.setAlternativaCorreta("e");
        questaoAlternativa16.setImagem(true);
        questaoAlternativa16.setAlternativasA("$(x+z)y+x\\overline{y}z$");
        questaoAlternativa16.setAlternativasB("$(x+z)y+\\overline{x}y\\overline{z}$");
        questaoAlternativa16.setAlternativasC("$(x+z)y+\\overline{x}\\overline{y}\\overline{z}$");
        questaoAlternativa16.setAlternativasD("$(x+z)\\overline{y}+x\\overline{y}z$");
        questaoAlternativa16.setAlternativasE("$(x+z)\\overline{y}+\\overline{x}y\\overline{z}$");
        questaoAlternativa16.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa16.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa17 = new QuestaoAlternativa();
        questaoAlternativa17.setId(INICIOQUESTAO.longValue());
        questaoAlternativa17.setAno(ANO);
        questaoAlternativa17.setDescricao("Suponha que seja necessário desenvolver uma ferramenta\n" +
                "que apresente o endereço IP dos múltiplos roteadores,\n" +
                "salto a salto, que compõem o caminho do hospedeiro em\n" +
                "que a ferramenta é executada até um determinado destino\n" +
                "(segundo seu endereço IP), assim como o round-trip time\n" +
                "até cada roteador. Tal ferramenta precisa funcionar na\n" +
                "Internet atual, sem demandar mudanças em roteadores\n" +
                "nem a introdução de novos protocolos.\n" +
                "Considerando o problema acima, qual dos seguintes\n" +
                "protocolos representaria a melhor (mais simples e eficiente) solução?");
        questaoAlternativa17.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa17.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa17.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa17.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa17.setAlternativaCorreta("d");

        questaoAlternativa17.setAlternativasA("IP: Internet Protocol.");
        questaoAlternativa17.setAlternativasB("UDP: User Datagram Protocol.");
        questaoAlternativa17.setAlternativasC("TCP: Transmission Control Protocol.");
        questaoAlternativa17.setAlternativasD("ICMP: Internet Control Message Protocol.");
        questaoAlternativa17.setAlternativasE("DHCP: Dynamic Host Confi guration Protocol. ");
        questaoAlternativa17.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa18 = new QuestaoAlternativa();
        questaoAlternativa18.setId(INICIOQUESTAO.longValue());
        questaoAlternativa18.setAno(ANO);
        questaoAlternativa18.setDescricao("Um navegador Web executa em um hospedeiro A, em\n" +
                "uma rede de uma organização, e acessa uma página\n" +
                "localizada de um servidor Web em um hospedeiro B,\n" +
                "situado em outra rede na Internet. A rede em que A se\n" +
                "situa conta com um servidor DNS local. Um profi ssional\n" +
                "deseja fazer uma lista com a sequência de protocolos\n" +
                "empregados e comparar com o resultado apresentado\n" +
                "por uma ferramenta de monitoramento executada no\n" +
                "hospedeiro A. A lista assume que\n" +
                "$\\newline$i) todas as tabelas com informações temporárias e\n" +
                "caches estão vazias;\n" +
                "$\\newline$ii) o hospedeiro cliente está confi gurado com o\n" +
                "endereço IP do servidor DNS local.\n" +
                "$\\newline$Qual das sequências a seguir representa a ordem em que\n" +
                "mensagens, segmentos e pacotes serão observados em\n" +
                "um meio físico ao serem enviados pelo hospedeiro A?");
        questaoAlternativa18.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa18.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa18.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa18.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa18.setAlternativaCorreta("a");

        questaoAlternativa18.setAlternativasA("ARP, DNS/UDP/IP, TCP/IP e HTTP/TCP/IP.");
        questaoAlternativa18.setAlternativasB("ARP, DNS/UDP/IP, HTTP/TCP/IP e TCP/IP");
        questaoAlternativa18.setAlternativasC("DNS/UDP/IP, ARP, HTTP/TCP/IP e TCP/IP");
        questaoAlternativa18.setAlternativasD("DNS/UDP/IP, ARP, TCP/IP e HTTP/TCP/IP");
        questaoAlternativa18.setAlternativasE("HTTP/TCP/IP, TCP/IP, DNS/UDP/IP e ARP.");
        questaoAlternativa18.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa19 = new QuestaoAlternativa();
        questaoAlternativa19.setId(INICIOQUESTAO.longValue());
        questaoAlternativa19.setAno(ANO);
        questaoAlternativa19.setDescricao("A tabela abaixo apresenta a relação de mintermos e maxtermos para três variáveis.\n" +
                "Considerando esse circuito, as funções f e g são, respectivamente");
        questaoAlternativa19.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa19.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa19.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa19.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
        questaoAlternativa19.setAlternativaCorreta("b");
        questaoAlternativa19.setImagem(true);
        questaoAlternativa19.setAlternativasA("$\\sum m(0,1,2,3,6,7,8,9) e \\sum m(2,3,6,7,10,14).$");
        questaoAlternativa19.setAlternativasB("$\\sum m(4,5,10,11,12,13,14,15) e \\sum m(0,1,4,5,8,9,11,12,13,15).$");
        questaoAlternativa19.setAlternativasC("$\\Pi \\,M(0,1,2,3,6,7,8,9)\\,\\, e \\,\\,\\Pi \\,M(0,1,4,5,8,9,11,12,13,15).$");
        questaoAlternativa19.setAlternativasD("$\\Pi \\,M(4,5,10,11,12,13,14,15) \\,\\,e\\,\\, \\sum m(2,3,6,7,10,14).$");
        questaoAlternativa19.setAlternativasE("$\\Pi \\,M(4,5,10,11,12,13,14,15) \\,\\,e\\,\\, \\Pi\\,M(2,3,6,7,10,14)$");
        questaoAlternativa19.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa19.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa20 = new QuestaoAlternativa();
        questaoAlternativa20.setId(INICIOQUESTAO.longValue());
        questaoAlternativa20.setAno(ANO);
        questaoAlternativa20.setDescricao("Um vendedor de artigos de pesca obteve com um amigo\n" +
                "o código executável (já compilado) de um programa que\n" +
                "gerencia vendas e faz o controle de estoque, com o intuito\n" +
                "de usá-lo em sua loja. Segundo o seu amigo, o referido\n" +
                "programa foi compilado em seu sistema computacional\n" +
                "pessoal (sistema A) e funciona corretamente. O vendedor\n" +
                "constatou que o programa excecutável também funciona\n" +
                "corretamente no sistema computacional de sua loja\n" +
                "(sistema B). Considerando a situação relatada, analise as\n" +
                "afi rmações a seguir.\n" +
                "$\\newline$I. Os computadores poderiam ter quantidades\n" +
                "diferentes de núcleos (cores).\n" +
                "$\\newline$II. As chamadas ao sistema (system call) do sistema\n" +
                "operacional no sistema A devem ser compatíveis\n" +
                "com as do sistema B.\n" +
                "$\\newline$III. O conjunto de instruções do sistema A poderia ser\n" +
                "diferente do conjunto de instruções do sistema B.\n" +
                "$\\newline$IV. Se os registradores do sistema A forem de 64 bits, os\n" +
                "registradores do sistema B poderiam ser de 32 bits.\n" +
                "$\\newline$É correto o que se afirma em");
        questaoAlternativa20.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa20.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa20.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa20.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa20.setAlternativaCorreta("b");

        questaoAlternativa20.setAlternativasA("III, apenas.");
        questaoAlternativa20.setAlternativasB("I e II, apenas.");
        questaoAlternativa20.setAlternativasC("III e IV, apenas.");
        questaoAlternativa20.setAlternativasD("I, II e IV, apenas");
        questaoAlternativa20.setAlternativasE("I, II, III e IV");
        questaoAlternativa20.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa21 = new QuestaoAlternativa();
        questaoAlternativa21.setId(INICIOQUESTAO.longValue());
        questaoAlternativa21.setAno(ANO);
        questaoAlternativa21.setDescricao("Uma equipe está realizando testes com base nos\n" +
                "códigos-fonte de um sistema. Os testes envolvem a\n" +
                "verifi cação de diversos componentes individualmente,\n" +
                "bem como das interfaces entre os componentes.\n" +
                "No contexto apresentado, essa equipe está realizando\n" +
                "testes em nível de");
        questaoAlternativa21.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa21.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa21.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa21.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa21.setAlternativaCorreta("e");

        questaoAlternativa21.setAlternativasA("unidade.");
        questaoAlternativa21.setAlternativasB("aceitação.");
        questaoAlternativa21.setAlternativasC("sistema e aceitação.\n");
        questaoAlternativa21.setAlternativasD("integração e sistema.");
        questaoAlternativa21.setAlternativasE("unidade e integração.");
        questaoAlternativa21.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa22 = new QuestaoAlternativa();
        questaoAlternativa22.setId(INICIOQUESTAO.longValue());
        questaoAlternativa22.setAno(ANO);
        questaoAlternativa22.setDescricao("Considere que G é um grafo qualquer e que V e E são os\n" +
                "conjuntos de vértices e de arestas de G, respectivamente.\n" +
                "Considere também que grau (v) é o grau de um vértice\n" +
                "v pertencente ao conjunto V. Nesse contexto, analise as\n" +
                "seguintes asserções.\n" +
                "$\\newline$Em G, a quantidade de vértices com grau ímpar é ímpar.\n" +
                "$\\newline$PORQUE\n" +
                "$\\newline$Para G, vale a identidade dada pela expressão $\\sum_{v \\in V} grau(v) = 2|E| $\n" +
                "$\\newline$Acerca dessas asserções, assinale a opção correta.");
        questaoAlternativa22.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa22.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa22.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa22.setDisciplina(EDisciplina.GRAFOS);
        questaoAlternativa22.setAlternativaCorreta("d");

        questaoAlternativa22.setAlternativasA("As duas asserções são proposições verdadeiras, e a segunda é uma justifi cativa correta da primeira.");
        questaoAlternativa22.setAlternativasB("As duas asserções são proposições verdadeiras, mas\n" +
                "a segunda não é uma justificativa correta da primeira.");
        questaoAlternativa22.setAlternativasC("A primeira asserção é uma proposição verdadeira, e a\n" +
                "segunda uma proposição falsa.");
        questaoAlternativa22.setAlternativasD("A primeira asserção é uma proposição falsa, e a segunda uma proposição verdadeira.");
        questaoAlternativa22.setAlternativasE("Tanto a primeira quanto a segunda asserções são proposições falsas. ");
        questaoAlternativa22.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa23 = new QuestaoAlternativa();
        questaoAlternativa23.setId(INICIOQUESTAO.longValue());
        questaoAlternativa23.setAno(ANO);
        questaoAlternativa23.setDescricao("No desenvolvimento de um software que analisa bases de\n" +
                "DNA, representadas pelas letras A, C, G, T, utilizou-se as\n" +
                "estruturas de dados: pilha e fila. Considere que, se uma\n" +
                "sequência representa uma pilha, o topo é o elemento mais\n" +
                "à esquerda; e se uma sequência representa uma fila, a\n" +
                "sua frente é o elemento mais à esquerda.\n" +
                "Analise o seguinte cenário: “a sequência inicial ficou\n" +
                "armazenada na primeira estrutura de dados na seguinte\n" +
                "ordem: (A,G,T,C,A,G,T,T). Cada elemento foi retirado\n" +
                "da primeira estrutura de dados e inserido na segunda\n" +
                "estrutura de dados, e a sequência ficou armazenada na\n" +
                "seguinte ordem: (T,T,G,A,C,T,G,A). Finalmente, cada\n" +
                "elemento foi retirado da segunda estrutura de dados e\n" +
                "inserido na terceira estrutura de dados e a sequência ficou\n" +
                "armazenada na seguinte ordem: (T,T,G,A,C,T,G,A)”.\n" +
                "Qual a única sequência de estruturas de dados\n" +
                "apresentadas a seguir pode ter sido usada no cenário\n" +
                "descrito acima?");
        questaoAlternativa23.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa23.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa23.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa23.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa23.setAlternativaCorreta("a");

        questaoAlternativa23.setAlternativasA("Fila - Pilha - Fila.");
        questaoAlternativa23.setAlternativasB("Fila - Fila - Pilha.");
        questaoAlternativa23.setAlternativasC("Fila - Pilha - Pilha.");
        questaoAlternativa23.setAlternativasD("Pilha - Fila - Pilha.");
        questaoAlternativa23.setAlternativasE("Pilha - Pilha - Pilha.");
        questaoAlternativa23.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa24 = new QuestaoAlternativa();
        questaoAlternativa24.setId(INICIOQUESTAO.longValue());
        questaoAlternativa24.setAno(ANO);
        questaoAlternativa24.setDescricao("Considere a seguinte tabela verdade, na qual estão\n" +
                "definidas quatro entradas – A, B, C e D – e uma saída S.\n" +
                "A menor expressão de chaveamento representada por\n" +
                "uma soma de produtos correspondente à saída S é");
        questaoAlternativa24.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa24.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa24.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa24.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
        questaoAlternativa24.setAlternativaCorreta("c");
        questaoAlternativa24.setImagem(true);
        questaoAlternativa24.setAlternativasA("AB’(D+C’)+A’D’+ABC.");
        questaoAlternativa24.setAlternativasB("AD + A’BD’+A’BC+A’B’C’.");
        questaoAlternativa24.setAlternativasC("A’D’ + AB’D+AB’C’+ABC.");
        questaoAlternativa24.setAlternativasD("(A’+D)(A+B+C’)(A+B’+C+D’).");
        questaoAlternativa24.setAlternativasE("(A+D’)(A’+B’+C)(A’+B+C’+D).");
        questaoAlternativa24.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa24.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa25 = new QuestaoAlternativa();
        questaoAlternativa25.setId(INICIOQUESTAO.longValue());
        questaoAlternativa25.setAno(ANO);
        questaoAlternativa25.setDescricao("Autômatos finitos possuem diversas aplicações práticas, como na detecção de sequências de caracteres em um texto. A figura abaixo apresenta um autômato que reconhece sequências sobre o alfabeto $\\sum = \\left\\{a,b,c\\right\\}$ e uma gramática livre de contexto que gera um subconjunto de $\\sum *$, em que $\\lambda$ representa o string vazio.\n" +
                " Analisando a gramática e o autômato abaixo, conclui-se que");
        questaoAlternativa25.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa25.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa25.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa25.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa25.setAlternativaCorreta("c");
        questaoAlternativa25.setImagem(true);
        questaoAlternativa25.setAlternativasA("a linguagem gerada pela gramática é inerentemente\n" +
                "ambígua.");
        questaoAlternativa25.setAlternativasB("a gramática é regular e gera uma linguagem livre de contexto.");
        questaoAlternativa25.setAlternativasC("a linguagem reconhecida pelo autômato é a mesma gerada pela gramática.\n");
        questaoAlternativa25.setAlternativasD("o autômato reconhece a linguagem sobre $\\sum$ em que os strings possuem o prefixo ababc.");
        questaoAlternativa25.setAlternativasE("a linguagem reconhecida pelo autômato é a mesma que a representada pela expressão regular (a+b+c)*(ab)*abc(a+b+c)*.");
        questaoAlternativa25.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa25.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa26 = new QuestaoAlternativa();
        questaoAlternativa26.setId(INICIOQUESTAO.longValue());
        questaoAlternativa26.setAno(ANO);
        questaoAlternativa26.setDescricao("As filas de prioridades (heaps) são estruturas de dados\n" +
                "importantes no projeto de algoritmos. Em especial, heaps\n" +
                "podem ser utilizados na recuperação de informação\n" +
                "em grandes bases de dados constituídos por textos.\n" +
                "Basicamente, para se exibir o resultado de uma consulta,\n" +
                "os documentos recuperados são ordenados de acordo\n" +
                "com a relevância presumida para o usuário. Uma consulta\n" +
                "pode recuperar milhões de documentos que certamente\n" +
                "não serão todos examinados. Na verdade, o usuário\n" +
                "examina os primeiros m documentos dos n recuperados,\n" +
                "em que m é da ordem de algumas dezenas.\n" +
                "Considerando as características dos heaps e sua\n" +
                "aplicação no problema descrito acima, avalie as\n" +
                "seguintes afirmações.\n" +
                "$\\newline$I. Uma vez que o heap é implementado como\n" +
                "uma árvore binária de pesquisa essencialmente\n" +
                "completa, o custo computacional para sua\n" +
                "construção é O(n log n).\n" +
                "$\\newline$II. A implementação de heaps utilizando-se vetores\n" +
                "é eficiente em tempo de execução e em espaço\n" +
                "de armazenamento, pois o pai de um elemento\n" +
                "armazenado na posição i se encontra armazenado\n" +
                "na posição 2i+1.\n" +
                "$\\newline$III. O custo computacional para se recuperar\n" +
                "de forma ordenada os m documentos mais\n" +
                "relevantes armazenados em um heap de\n" +
                "tamanho n é O(m log n).\n" +
                "$\\newline$IV. Determinar o documento com maior valor de\n" +
                "relevância armazenado em um heap tem custo\n" +
                "computacional O(1).\n" +
                "$\\newline$Está correto apenas o que se afirma em");
        questaoAlternativa26.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa26.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa26.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa26.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa26.setAlternativaCorreta("c");

        questaoAlternativa26.setAlternativasA("I e II.");
        questaoAlternativa26.setAlternativasB("II e III.");
        questaoAlternativa26.setAlternativasC("III e IV.");
        questaoAlternativa26.setAlternativasD("I, II e IV.");
        questaoAlternativa26.setAlternativasE("I, III e IV.");
        questaoAlternativa26.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa27 = new QuestaoAlternativa();
        questaoAlternativa27.setId(INICIOQUESTAO.longValue());
        questaoAlternativa27.setAno(ANO);
        questaoAlternativa27.setDescricao("Em relação a Padrões de Projeto, analise as afirmações a seguir.\n" +
                "$\\newline$I. Prototype é um tipo de padrão estrutural.\n" +
                "$\\newline$II. Singleton tem por objetivos garantir que uma classe tenha ao menos uma instância e fornecer um ponto global de acesso para ela.\n" +
                "$\\newline$III. Template Method tem por objetivo definir o esqueleto de um algoritmo em uma operação, postergando a definição de alguns passos para subclasses.\n" +
                "$\\newline$IV. Iterator fornece uma maneira de acessar sequencialmente os elementos de um objeto agregado sem expor sua representação subjacente.\n" +
                "$\\newline$É correto apenas o que se afirma em");
        questaoAlternativa27.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa27.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa27.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa27.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa27.setAlternativaCorreta("e");
        questaoAlternativa27.setImagem(true);
        questaoAlternativa27.setAlternativasB("I.");
        questaoAlternativa27.setAlternativasB("II.");
        questaoAlternativa27.setAlternativasC("I e IV.");
        questaoAlternativa27.setAlternativasD("II e III.");
        questaoAlternativa27.setAlternativasE("III e IV. ");
        questaoAlternativa27.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa27.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa28 = new QuestaoAlternativa();
        questaoAlternativa28.setId(INICIOQUESTAO.longValue());
        questaoAlternativa28.setAno(ANO);
        questaoAlternativa28.setDescricao("Um baralho tem 52 cartas, organizadas em 4 naipes, com 13 valores diferentes para cada naipe.\n" +
                "$\\newline$Os valores possíveis são: Ás, 2, 3, ..., 10, J, Q, K.\n" +
                "$\\newline$No jogo de poker, uma das combinações de 5 cartas mais valiosas é o full house, que é formado por três cartas de mesmo valor e outras duas cartas de mesmo valor. São exemplos de full houses: i) três cartas K e duas 10 (como visto na figura) ou ii) três cartas 4 e duas Ás.\n" +
                "$\\newline$Quantas possibilidades para full house existem em um baralho de 52 cartas?");
        questaoAlternativa28.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa28.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa28.setArea(EArea.MATEMATICA);
        questaoAlternativa28.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa28.setAlternativaCorreta("d");
        questaoAlternativa28.setImagem(true);
        questaoAlternativa28.setAlternativasB("156.");
        questaoAlternativa28.setAlternativasB("624.");
        questaoAlternativa28.setAlternativasC("1872.");
        questaoAlternativa28.setAlternativasD("3744.");
        questaoAlternativa28.setAlternativasE("7488.");
        questaoAlternativa28.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa28.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa29 = new QuestaoAlternativa();
        questaoAlternativa29.setId(INICIOQUESTAO.longValue());
        questaoAlternativa29.setAno(ANO);
        questaoAlternativa29.setDescricao("Um dos problemas clássicos da computação científica é a\n" +
                "multiplicação de matrizes. Assuma que foram declaradas\n" +
                "e inicializadas três matrizes quadradas de ponto flutuante,\n" +
                "a, b e c, cujos índices variam entre 0 e n - 1. O seguinte\n" +
                "trecho de código pode ser usado para multiplicar matrizes\n" +
                "de forma sequencial:\n" +
                "$\\newline$1. for [i = 0 to n - 1] {\n" +
                "$\\newline$2. for [j = 0 to n - 1] {\n" +
                "$\\newline$3. c[i, j] = 0.0;\n" +
                "$\\newline$4. for [k = 0 to n - 1]\n" +
                "$\\newline$5. c[i, j] = c[i, j] + a[i, k] * b[k, j];\n" +
                "$\\newline$6. }\n" +
                "$\\newline$7. }\n" +
                "$\\newline$O objetivo é paralelizar esse código para que o tempo de\n" +
                "execução seja reduzido em uma máquina com múltiplos\n" +
                "processadores e memória compartilhada. Suponha que\n" +
                "o comando “co” seja usado para definição de comandos\n" +
                "concorrentes, da seguinte forma: “co [i = 0 to n - 1] { x; y; z;}”\n" +
                "cria n processos concorrentes, cada um executando\n" +
                "sequencialmente uma instância dos comandos x, y, z\n" +
                "contidos no bloco.\n" +
                "$\\newline$Avalie as seguintes afirmações sobre o problema.\n" +
                "$\\newline$I. Esse problema é exemplo do que se chama\n" +
                "“embaraçosamente paralelo”, porque pode\n" +
                "ser decomposto em um conjunto de várias\n" +
                "operações menores que podem ser executadas\n" +
                "independentemente.\n" +
                "$\\newline$II. O programa produziria resultados corretos e em\n" +
                "tempo menor do que o sequencial, trocando-se o\n" +
                "“for” na linha 1 por um “co”.\n" +
                "$\\newline$III. O programa produziria resultados corretos e em\n" +
                "tempo menor do que o sequencial, trocando-se o\n" +
                "“for” na linha 2 por um “co”.\n" +
                "$\\newline$IV. O programa produziria resultados corretos e em\n" +
                "tempo menor do que o sequencial, trocando-se\n" +
                "ambos “for”, nas linhas 1 e 2, por “co”.\n" +
                "$\\newline$É correto o que se afirma em");
        questaoAlternativa29.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa29.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa29.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa29.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa29.setAlternativaCorreta("e");

        questaoAlternativa29.setAlternativasA("I, II e III, apenas.");
        questaoAlternativa29.setAlternativasB("I, II e IV, apenas.");
        questaoAlternativa29.setAlternativasC("I, III e IV, apenas");
        questaoAlternativa29.setAlternativasD("II, III e IV, apenas.");
        questaoAlternativa29.setAlternativasE("I, II, III, IV.");
        questaoAlternativa29.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa30 = new QuestaoAlternativa();
        questaoAlternativa30.setId(INICIOQUESTAO.longValue());
        questaoAlternativa30.setAno(ANO);
        questaoAlternativa30.setDescricao("Algoritmos criados para resolver um mesmo problema\n" +
                "podem diferir de forma drástica quanto a sua eficiência.\n" +
                "Para evitar este fato, são utilizadas técnicas algorítmicas,\n" +
                "isto é, conjunto de técnicas que compreendem os métodos\n" +
                "de codificação de algoritmos de forma a salientar sua\n" +
                "complexidade, levando-se em conta a forma pela qual\n" +
                "determinado algoritmo chega à solução desejada.\n" +
                "Considerando os diferentes paradigmas e técnicas de\n" +
                "projeto de algoritmos, analise as afirmações abaixo.\n" +
                "$\\newline$I. A técnica de tentativa e erro (backtracking) efetua\n" +
                "uma escolha ótima local, na esperança de obter\n" +
                "uma solução ótima global.\n" +
                "$\\newline$II. A técnica de divisão e conquista pode ser dividida\n" +
                "em três etapas: dividir a instância do problema\n" +
                "em duas ou mais instâncias menores; resolver\n" +
                "as instâncias menores recursivamente; obter a\n" +
                "solução para as instâncias originais (maiores) por\n" +
                "meio da combinação dessas soluções.\n" +
                "$\\newline$III. A técnica de programação dinâmica\n" +
                "decompõe o processo em um número finito de\n" +
                "subtarefas parciais que devem ser exploradas\n" +
                "exaustivamente.\n" +
                "$\\newline$IV. O uso de heurísticas (ou algoritmos aproximados)\n" +
                "é caracterizado pela ação de um procedimento\n" +
                "chamar a si próprio, direta ou indiretamente.\n" +
                "$\\newline$É correto apenas o que se afirma em\n");
        questaoAlternativa30.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa30.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa30.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa30.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa30.setAlternativaCorreta("b");

        questaoAlternativa30.setAlternativasA("I.");
        questaoAlternativa30.setAlternativasB("II.");
        questaoAlternativa30.setAlternativasC("I e IV.");
        questaoAlternativa30.setAlternativasD("II e III.");
        questaoAlternativa30.setAlternativasE("III e IV. ");
        questaoAlternativa30.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa31 = new QuestaoAlternativa();
        questaoAlternativa31.setId(INICIOQUESTAO.longValue());
        questaoAlternativa31.setAno(ANO);
        questaoAlternativa31.setDescricao("Uma antiga empresa de desenvolvimento de software\n" +
                "resolveu atualizar toda sua infraestrutura computacional\n" +
                "adquirindo um sistema operacional multitarefa,\n" +
                "processadores multi-core (múltiplos núcleos) e o uso de\n" +
                "uma linguagem de programação com suporte a threads.\n" +
                "O sistema operacional multitarefa de um computador\n" +
                "é capaz de executar vários processos (programas) em\n" +
                "paralelo. Considerando esses processos implementados\n" +
                "com mais de uma thread (multi-threads), analise as\n" +
                "afirmações abaixo.\n" +
                "$\\newline$I. Os ciclos de vida de processos e threads são idênticos.\n" +
                "$\\newline$II. Threads de diferentes processos compartilham\n" +
                "memória.\n" +
                "$\\newline$III. Somente processadores multi-core são capazes\n" +
                "de executar programas multi-threads.\n" +
                "$\\newline$IV. Em sistemas operacionais multitarefa, threads\n" +
                "podem migrar de um processo para outro.\n" +
                "$\\newline$É correto apenas o que se afirma em");
        questaoAlternativa31.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa31.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa31.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa31.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa31.setAlternativaCorreta("a");

        questaoAlternativa31.setAlternativasA("I.");
        questaoAlternativa31.setAlternativasB("II.");
        questaoAlternativa31.setAlternativasC("I e III.");
        questaoAlternativa31.setAlternativasD("I e IV.");
        questaoAlternativa31.setAlternativasE("II e IV.");
        questaoAlternativa31.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa32 = new QuestaoAlternativa();
        questaoAlternativa32.setId(INICIOQUESTAO.longValue());
        questaoAlternativa32.setAno(ANO);
        questaoAlternativa32.setDescricao("Suponha que se queira pesquisar a chave 287 em uma\n" +
                "árvore binária de pesquisa com chaves entre 1 e 1000.\n" +
                "Durante uma pesquisa como essa, uma sequência de\n" +
                "chaves é examinada. Cada sequência abaixo é uma\n" +
                "suposta sequência de chaves examinadas em uma busca\n" +
                "da chave 287.\n" +
                "$\\newline$I. 7, 342, 199, 201, 310, 258, 287\n" +
                "$\\newline$II. 110, 132, 133, 156, 289, 288, 287\n" +
                "$\\newline$III. 252, 266, 271, 294, 295, 289, 287\n" +
                "$\\newline$IV. 715, 112, 530, 249, 406, 234, 287\n" +
                "$\\newline$É válido apenas o que se apresenta em");
        questaoAlternativa32.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa32.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa32.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa32.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa32.setAlternativaCorreta("c");

        questaoAlternativa32.setAlternativasA("I.");
        questaoAlternativa32.setAlternativasB("III.");
        questaoAlternativa32.setAlternativasC("I e II.");
        questaoAlternativa32.setAlternativasD("II e IV.");
        questaoAlternativa32.setAlternativasE("III e IV.");
        questaoAlternativa32.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoDiscusiva questaoDiscursiva33 = new QuestaoDiscusiva();
        questaoDiscursiva33.setId(INICIOQUESTAO.longValue());
        questaoDiscursiva33.setAno(ANO);
        questaoDiscursiva33.setDescricao("Os números de Fibonacci correspondem à uma sequência infinita na qual os dois primeiros termos são 0 e 1. Cada termo da sequência, à exceção dos dois primeiros, é igual à soma dos dois anteriores, conforme a relação de recorrência abaixo. $\\newline$ $\\\\f_{n} = f_{n-1} + f_{n-2}\\\\$ $\\newline$\n" +
                "Desenvolva dois algoritmos, um iterativo e outro recursivo, que, dado um número natural n > 0, retorna o n-ésimo termo da sequência de Fibonacci. Apresente as vantagens e desvantagens de cada algoritmo.");
        questaoDiscursiva33.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoDiscursiva33.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoDiscursiva33.setProva(ETipoQuestaoProva.ENADE);
        questaoDiscursiva33.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoDiscursiva33.setResposta("Algoritmo iterativo\n" +
                "$\\newline$int fibonacci(n) {\n" +
                "$\\newline$prevFib $\\leftarrow$ 0,\n" +
                "$\\newline$currFib $\\leftarrow$ 1\n" +
                "$\\newline$if n == 1\n" +
                "$\\newline$return 0\n" +
                "$\\newline$if n == 2\n" +
                "$\\newline$return 1\n" +
                "$\\newline$for i $\\leftarrow$ 1 to n − 2 /* repetir n‐2 vezes */ {\n" +
                "$\\newline$temp $\\leftarrow$ prevFib + currFib\n" +
                "$\\newline$prevFib $\\leftarrow$ currFib\n" +
                "$\\newline$currFib $\\leftarrow$ temp\n" +
                "$\\newline$}\n" +
                "$\\newline$\n" +
                "$\\newline$return currFib\n" +
                "$\\newline$}\n" +
                "$\\newline$Algoritmo recursivo\n" +
                "$\\newline$int fibonacci(n) {\n" +
                "$\\newline$if n == 1\n" +
                "$\\newline$return 0\n" +
                "$\\newline$if n == 2\n" +
                "$\\newline$return 1\n" +
                "$\\newline$else\n" +
                "$\\newline$return fibonacci(n‐1) + fibonacci(n‐2)\n" +
                "$\\newline$}\n" +
                "$\\newline$Discussão:\n" +
                "$\\newline$A solução recursiva clássica possui a vantagem de ser implementada diretamente a partir da\n" +
                "definição do problema, mas tem a grande desvantagem de possuir uma ordem de\n" +
                "complexidade exponencial. A versão iterativa tem complexidade linear o que a torna mais\n" +
                "vantajosa em termos de eficiência, mas exige mais atenção na implementação.");
        questaoDiscursiva33.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoDiscusiva questaoDiscursiva34 = new QuestaoDiscusiva();
        questaoDiscursiva34.setId(INICIOQUESTAO.longValue());
        questaoDiscursiva34.setAno(ANO);
        questaoDiscursiva34.setDescricao("Listas ordenadas implementadas com vetores são estruturas de dados adequadas para a busca binária, mas possuem o inconveniente de exigirem custo computacional de ordem linear para a inserção de novos elementos. Se as operações de inserção ou remoção de elementos forem frequentes, uma alternativa é transformar a lista em uma árvore binária de pesquisa balanceada, que permitirá a execução dessas operações com custo logarítmico.\n" +
                "Considerando essas informações, escreva um algoritmo recursivo que construa uma árvore binária de pesquisa\n" +
                "completa, implementada por estruturas auto-referenciadas ou apontadores, a partir de um vetor ordenado, v, de n\n" +
                "inteiros, em que $n = 2^{m} - 1, m > 0$. O algoritmo deve construir a árvore em tempo linear, sem precisar fazer qualquer\n" +
                "comparação entre os elementos do vetor, uma vez que este já está ordenado. Para isso,\n" +
                "$\\newline$a) descreva a estrutura de dados utilizada para a implementação da árvore\n" +
                "$\\newlineb) escreva o algoritmo para a construção da árvore. A chamada principal à função recursiva deve passar, como\n" +
                "parâmetros, o vetor, índice do primeiro e último elementos, retornando a referência ou apontador para a raiz da\n" +
                "árvore criada.\n" +
                "$\\newlineObservação: Qualquer notação em português estruturado, de forma imperativa ou orientada a objetos deve ser\n" +
                "considerada, assim como em uma linguagem de alto nível, como o Pascal, C e Java.");
        questaoDiscursiva34.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoDiscursiva34.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoDiscursiva34.setProva(ETipoQuestaoProva.ENADE);
        questaoDiscursiva34.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoDiscursiva34.setResposta("a) registro nodo com campos: chave do tipo inteiro; esq e dir do tipo apontadores para\n" +
                "registro nodo.\n" +
                "Qualquer notação em português estruturado, de forma imperativa ou orientada a\n" +
                "objetos deve ser considerada, assim como em uma linguagem de alto nível como o\n" +
                "Pascal, C e Java. O importante é a presença dos campos sublinhados e do uso de\n" +
                "apontadores ou autoreferências.\n" +
                "$\\newline$b) função CriaABP(v: vetor de inteiros; i, j: inteiros) retorna apontador para registro\n" +
                "nodo // i,j são os índices inicial e final do vetor\n" +
                "$\\newline$| Cria novo nodo apontado por p, o qual deve ser uma variável local\n" +
                "$\\newline$| pos = (i + j) / 2 // determina a posição central do vetor\n" +
                "$\\newline$| p‐>chave = v[pos] // guarda o elemento v[pos] no novo nodo criado\n" +
                "$\\newline$| se i < j entao // ainda não se está no nível das folhas\n" +
                "$\\newline$| | p‐>esq = CriaABP(v, i, pos‐1 ) // chama recursivamente para a sub‐árvore da\n" +
                "esquerda\n" +
                "$\\newline$| | p‐>dir = CriaABP(v, pos+1, j ) // chama recursivamente para a sub‐árvore da\n" +
                "direita\n" +
                "$\\newline$| senão p‐>esq = p‐>dir = NULL // nível das folhas\n" +
                "$\\newline$| retorna p\n" +
                "\n" +
                "$\\newline$Chamada principal: raiz = CriaABP(v, 1,n ) onde raiz aponta para o nodo raiz da árvore.\n" +
                "$\\newline$Qualquer notação em português estruturado, de forma imperativa ou orientada a\n" +
                "objetos deve ser considerada, assim como em uma linguagem de alto nível como o\n" +
                "Pascal, C e Java. A função deve ser recursiva e não pode usar comparações para\n" +
                "encontrar o elemento a ser inserido, nem utilizar operações de inserção que façam\n" +
                "comparações implicitamente. A condição de parada da recursão (nível das folhas) deve\n" +
                "estar clara e os parâmetros para chamada recursiva devem estar corretos. Os\n" +
                "apontadores dos nodos‐folhas devem ser aterrados.");
        questaoDiscursiva34.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoDiscusiva questaoDiscursiva35 = new QuestaoDiscusiva();
        questaoDiscursiva35.setId(INICIOQUESTAO.longValue());
        questaoDiscursiva35.setAno(ANO);
        questaoDiscursiva35.setDescricao("As memórias cache são usadas para diminuir o tempo de acesso à memória principal, mantendo cópias de seus dados. Uma função de mapeamento é usada para determinar em que parte da memória cache um dado da memória principal será mapeado. Em certos casos, é necessário usar um algoritmo de substituição para determinar qual parte da cache será substituída.\n" +
                "Suponha uma arquitetura hipotética com as seguintes características:\n" +
                "$\\newline$- A memória principal possui 4 Gbytes, em que cada byte é diretamente endereçável\n" +
                "com um endereço 32 bits.\n" +
                "$\\newline$- A memória cache possui 512 Kbytes, organizados em 128 K linhas de 4 bytes.\n" +
                "$\\newline$-Os dados são transferidos entre as duas memórias em blocos de 4 bytes.\n" +
                "$\\newline$Considerando os mapeamentos direto, totalmente associativo e associativo por conjuntos (em 4 vias), redija um texto que contemple as organizações dessas memórias, demonstrando como são calculados os endereços das palavras, linhas (blocos), rótulos (tags) e conjunto na memória cache em cada um dos três casos. Cite as vantagens e desvantagens de cada função de mapeamento, bem como a necessidade de algoritmos de substituição em cada uma delas.");
        questaoDiscursiva35.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoDiscursiva35.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoDiscursiva35.setProva(ETipoQuestaoProva.ENADE);
        questaoDiscursiva35.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoDiscursiva35.setResposta("Em cada um dos mapeamentos o participante do exame deve indicar claramente como\n" +
                "calcular o endereço de um determinado bloco da memória principal na memória\n" +
                "cache. Isso pode ser feito pela divisão do endereço de 32 bits em campos (Palavra,\n" +
                "Linha, Rótulo e Conjunto) ou por uma breve descrição de como cada campo é usado,\n" +
                "incluindo seu tamanho. A seguir são apresentadas descrições detalhadas de cada\n" +
                "esquema, visando facilitar a correção do item. A resposta, portanto, não precisa incluir\n" +
                "todas as informações de cada esquema, mas deve diferenciá‐los claramente.\n" +
                "$\\newline$Mapeamento direto:\n" +
                "$\\newline$No mapeamento direto cada bloco da memória principal é mapeado em uma única\n" +
                "posição da cache e seu endereço deve ser dividido da seguinte forma:\n" +
                "$\\newline$Rótulo Linha Palavra\n" +
                "$\\newline$13 17 2\n" +
                "$\\newline$Dois bits são usados para identificar a palavra (byte) dentro do bloco (ou linha). São\n" +
                "necessários 17 bits para determinar em qual das 128K linhas da cache o bloco será\n" +
                "mapeado. Os 13 bits mais significativos do endereço devem ser comparados com o\n" +
                "rótulo da cache naquela linha para saber se aquele é o bloco atualmente mapeado.\n" +
                "$\\newline$Mapeamento totalmente associativo:\n" +
                "$\\newline$No mapeamento totalmente associativo cada bloco da memória principal pode ser\n" +
                "mapeado em qualquer posição da cache e seu endereço deve ser dividido da seguinte\n" +
                "forma:\n" +
                "$\\newline$Rótulo Palavra\n" +
                "$\\newline$30 2\n" +
                "$\\newline$Dois bits são usados para identificar a palavra dentro do bloco. Todos os demais bits\n" +
                "(30) são usados como rótulo para identificar o bloco na memória cache.\n" +
                "Mapeamento associativo por conjunto:\n" +
                "$\\newline$No mapeamento associativo por conjunto (4 vias) cada bloco da memória principal é\n" +
                "mapeado em um conjunto com 4 linhas e seu endereço deve ser dividido da seguinte\n" +
                "forma:\n" +
                "$\\newline$Rótulo Conjunto Palavra\n" +
                "$\\newline$15 15 2\n" +
                "\n" +
                "$\\newline$Dois bits são usados para identificar a palavra dentro do bloco. São necessários 15 bits\n" +
                "para determinar em qual dos 32K conjuntos o bloco será mapeado. Os 15 bits mais\n" +
                "significativos do endereço devem ser comparados com os rótulos da cache naquele\n" +
                "conjunto para saber se o bloco está atualmente mapeado.\n" +
                "Vantagens e desvantagens:\n" +
                "$\\newline$O mapeamento direto é o mais simples de ser implementado e o circuito resultante é\n" +
                "mais rápido e não requer algoritmo de substituição. Entretanto, em geral, as taxas de\n" +
                "acertos (cache hit) são menores.\n" +
                "$\\newline$O mapeamento totalmente associativo é o que tem as maiores taxas de acerto.\n" +
                "Entretanto, é o mais complexo dos três. Os circuitos resultantes são maiores, mais\n" +
                "caros e mais lentos. Além disso, requer um algoritmo de substituição. Normalmente\n" +
                "esse mapeamento é utilizado em memórias cache de pequena capacidade.\n" +
                "$\\newline$O mapeamento associativo por conjunto é uma solução de compromisso (trade‐off)\n" +
                "entre as duas opções anteriores. Tem como vantagens ser mais simples que o\n" +
                "totalmente associativo e, em geral, mais eficiente, em termos de taxas de acerto, do\n" +
                "que o mapeamento direto.");
        questaoDiscursiva35.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa36 = new QuestaoAlternativa();
        questaoAlternativa36.setId(INICIOQUESTAO.longValue());
        questaoAlternativa36.setAno(ANO);
        questaoAlternativa36.setDescricao("O problema P versus NP é um problema ainda não\n" +
                "resolvido e um dos mais estudados em Computação.\n" +
                "Em linhas gerais, deseja-se saber se todo problema\n" +
                "cuja solução pode ser eficientemente verificada por um\n" +
                "computador, também pode ser eficientemente obtida\n" +
                "por um computador. Por “eficientemente” ou “eficiente”\n" +
                "significa “em tempo polinomial”.\n" +
                "A classe dos problemas cujas soluções podem ser\n" +
                "eficientemente obtidas por um computador é chamada de\n" +
                "classe P. Os algoritmos que solucionam os problemas\n" +
                "dessa classe têm complexidade de pior caso polinomial\n" +
                "no tamanho das suas entradas.\n" +
                "Para alguns problemas computacionais, não se conhece\n" +
                "solução eficiente, isto é, não se conhece algoritmo eficiente\n" +
                "para resolvê-los. No entanto, se para uma dada solução\n" +
                "de um problema é possível verificá-la eficientemente,\n" +
                "então o problema é dito estar em NP. Dessa forma, a\n" +
                "classe de problemas para os quais suas soluções podem\n" +
                "ser eficientemente verificadas é chamada de classe NP.\n" +
                "Um problema é dito ser NP-completo se pertence à\n" +
                "classe NP e, além disso, se qualquer outro problema na\n" +
                "classe NP pode ser eficientemente transformado nesse\n" +
                "problema. Essa transformação eficiente envolve as\n" +
                "entradas e saídas dos problemas.\n" +
                "Considerando as noções de complexidade computacional\n" +
                "apresentadas acima, analise as afirmações que se seguem.\n" +
                "$\\newline$I. Existem problemas na classe P que não estão na\n" +
                "classe NP.\n" +
                "$\\newline$II. Se o problema A pode ser eficientemente\n" +
                "transformado no problema B e B está na classe P,\n" +
                "então A está na classe P.\n" +
                "$\\newline$III. Se P = NP, então um problema NP-completo pode\n" +
                "ser solucionado eficientemente.\n" +
                "$\\newline$IV. Se P é diferente de NP, então existem problemas\n" +
                "na classe P que são NP-completos.\n" +
                "$\\newline$É correto apenas o que se afirma em");
        questaoAlternativa36.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa36.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa36.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa36.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa36.setAlternativaCorreta("d");

        questaoAlternativa36.setAlternativasA("I.");
        questaoAlternativa36.setAlternativasB("IV.");
        questaoAlternativa36.setAlternativasC("I e III.");
        questaoAlternativa36.setAlternativasD("II e III.");
        questaoAlternativa36.setAlternativasE("II e IV.");
        questaoAlternativa36.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa37 = new QuestaoAlternativa();
        questaoAlternativa37.setId(INICIOQUESTAO.longValue());
        questaoAlternativa37.setAno(ANO);
        questaoAlternativa37.setDescricao("Suponha que uma linguagem de programação tenha sido projetada com vinculação e verificação estáticas para tipos\n" +
                "de variáveis, além de passagem de parâmetros por valor.\n" +
                "Também é exigido pela especificação da linguagem que\n" +
                "programas sejam compilados integralmente e que não é\n" +
                "permitido compilar bibliotecas separadamente. Durante\n" +
                "uma revisão da especificação da linguagem, alguém\n" +
                "propôs que seja adicionado um mecanismo para suporte\n" +
                "a variáveis com escopo dinâmico.\n" +
                "A respeito da proposta de modificação da linguagem,\n" +
                "analise as seguintes afirmações.\n" +
                "$\\newline$I. As variáveis com escopo dinâmico podem ser\n" +
                "tratadas como se fossem parâmetros para\n" +
                "os subprogramas que as utilizam, sem que o\n" +
                "programador tenha que especificá-las ou declarar\n" +
                "seu tipo (o compilador fará isso). Assim, eliminase a necessidade de polimorfismo e é possível\n" +
                "verificar tipos em tempo de compilação.\n" +
                "$\\newline$II. Como diferentes subprogramas podem declarar\n" +
                "variáveis com o mesmo nome mas com tipos\n" +
                "diferentes, se as variáveis com escopo dinâmico\n" +
                "não forem declaradas no escopo onde são\n" +
                "referenciadas, será necessário que a linguagem\n" +
                "suporte polimorfismo de tipos.\n" +
                "$\\newline$III. Se as variáveis dinâmicas forem declaradas\n" +
                "tanto nos escopos onde são criadas como\n" +
                "nos subprogramas em que são referenciadas,\n" +
                "marcadas como tendo escopo dinâmico, será\n" +
                "possível identificar todos os erros de tipo em\n" +
                "tempo de compilação.\n" +
                "$\\newline$É correto apenas o que se afirma em");
        questaoAlternativa37.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa37.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa37.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa37.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa37.setAlternativaCorreta("d");
        questaoAlternativa37.setImagem(true);
        questaoAlternativa37.setAlternativasA("I.");
        questaoAlternativa37.setAlternativasB("II.");
        questaoAlternativa37.setAlternativasC("I e III.");
        questaoAlternativa37.setAlternativasD("II e III.");
        questaoAlternativa37.setAlternativasE("I, II e III.");
        questaoAlternativa37.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa37.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa38 = new QuestaoAlternativa();
        questaoAlternativa38.setId(INICIOQUESTAO.longValue());
        questaoAlternativa38.setAno(ANO);
        questaoAlternativa38.setDescricao("É comum que linguagens de programação permitam\n" +
                "a descrição textual de constantes em hexadecimal,\n" +
                "além de descrições na base dez. O compilador para\n" +
                "uma linguagem que suporte constantes inteiras em\n" +
                "hexadecimal precisa diferenciar inteiros em base dez dos\n" +
                "números hexadecimais que não usam os dígitos de A a F\n" +
                ". Por exemplo, a sequência de caracteres 12 pode ser\n" +
                "interpretada como doze em base dez ou como dezoito em\n" +
                "hexadecimal. Uma maneira de resolver esse problema\n" +
                "é exigindo que as constantes em hexadecimal terminem\n" +
                "com o caracter “x”. Assim, não há ambiguidade, por\n" +
                "exemplo, no tratamento das sequências 12 e 12x.\n" +
                "A gramática a seguir descreve números inteiros,\n" +
                "possivelmente com o símbolo “x” após os dígitos. Os não\n" +
                "terminais são M, N, e E e os terminais são x e d, em que\n" +
                "d representa um dígito.\n" +
                "$ \\newline M \\rightarrow E \\newline\n" +
                "M \\rightarrow N  \\newline\n" +
                "E \\rightarrow Nx  \\newline\n" +
                "N \\rightarrow Nd  \\newline\n" +
                "N \\rightarrow d  \\newline$\n" +
                "Durante a construção de um autômato LR para essa\n" +
                "gramática, os seguintes estados são definidos:\n" +
                "$ \\newline e_{0}: \\newline\n" +
                "M´ \\rightarrow \\cdot M \\newline\n" +
                "M \\rightarrow \\cdot E  \\newline\n" +
                "M \\rightarrow \\cdot N \\newline\n" +
                "E \\rightarrow \\cdot Nx \\newline\n" +
                "N \\rightarrow \\cdot Nd \\newline\n" +
                "N \\rightarrow \\cdot d \\newline\n" +
                "e_{1}(e_{0}, N): \\newline\n" +
                "M \\rightarrow N \\cdot  \\newline\n" +
                "M \\rightarrow N \\cdot x  \\newline\n" +
                "M \\rightarrow N \\cdot d  \\newline$\n" +
                "A respeito dessa gramática, analise as seguintes\n" +
                "asserções e a relação proposta entre elas.\n" +
                "$\\newline$A gramática descrita é do tipo LR(0).\n" +
                "$\\newline$PORQUE\n" +
                "$\\newline$É possível construir um autômato LR(0), determinístico,\n" +
                "cujos estados incluem $e_{0} \\,\\,e\\,\\,e_{1}$ acima descritos.\n" +
                "$\\newline$Acerca dessas asserções, assinale a opção correta.");
        questaoAlternativa38.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa38.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa38.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa38.setDisciplina(EDisciplina.COMPILADORES);
        questaoAlternativa38.setAlternativaCorreta("e");

        questaoAlternativa38.setAlternativasA("As duas asserções são proposições verdadeiras, e a\n" +
                "segunda é uma justificativa correta da primeira.");
        questaoAlternativa38.setAlternativasB("As duas asserções são proposições verdadeiras, mas\n" +
                "a segunda não é uma justificativa correta da primeira.");
        questaoAlternativa38.setAlternativasC("A primeira asserção é uma proposição verdadeira, e a segunda, uma proposição falsa.");
        questaoAlternativa38.setAlternativasD("A primeira asserção é uma proposição falsa, e a segunda, uma proposição verdadeira.");
        questaoAlternativa38.setAlternativasE("Tanto a primeira quanto a segunda asserções são proposições falsas.");
        questaoAlternativa38.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa39 = new QuestaoAlternativa();
        questaoAlternativa39.setId(INICIOQUESTAO.longValue());
        questaoAlternativa39.setAno(ANO);
        questaoAlternativa39.setDescricao("O conceito de Tipo de Dados Abstrato (TDA) é popular em\n" +
                "linguagens de programação. Nesse contexto, analise as\n" +
                "afirmativas a seguir.\n" +
                "$\\newline$I. A especificação de um TDA é composta das operações aplicáveis a ele, da sua representação interna, e das implementações das operações.\n" +
                "$\\newline$II. Dois mecanismos utilizáveis na implementação de um TDA em programas orientados a objetos são a composição e a herança.\n" +
                "$\\newline$III. Se S é um subtipo de outro T, então entidades do tipo S em um programa podem ser substituídas por entidades do tipo T, sem alterar a corretude desse programa.\n" +
                "$\\newline$IV. O encapsulamento em linguagens de programação orientadas a objetos é um efeito positivo do uso de TDA.\n" +
                "$\\newline$É correto apenas o que se afirma em");
        questaoAlternativa39.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa39.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa39.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa39.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa39.setAlternativaCorreta("d");

        questaoAlternativa39.setAlternativasA("I.");
        questaoAlternativa39.setAlternativasB("II.");
        questaoAlternativa39.setAlternativasC("I e III.");
        questaoAlternativa39.setAlternativasD("II e IV.");
        questaoAlternativa39.setAlternativasE("III e IV. ");
        questaoAlternativa39.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa40 = new QuestaoAlternativa();
        questaoAlternativa40.setId(INICIOQUESTAO.longValue());
        questaoAlternativa40.setAno(ANO);
        questaoAlternativa40.setDescricao("Considere que a figura abaixo corresponde ao cenário de\n" +
                "um jogo de computador. Esse cenário é dividido em 24\n" +
                "quadrados e a movimentação de um personagem entre\n" +
                "cada quadrado tem custo 1, sendo permitida apenas na\n" +
                "horizontal ou na vertical. Os quadrados marcados em preto\n" +
                "correspondem a regiões para as quais os personagens\n" +
                "não podem se mover." +
                "Nesse cenário, o algoritmo A* vai ser usado para determinar\n" +
                "o caminho de custo mínimo pelo qual um personagem\n" +
                "deve se mover desde o quadrado verde até o quadrado\n" +
                "vermelho. Considere que, no A*, o custo f(x) = g(x) + h(x)\n" +
                "de determinado nó x é computado somando-se o custo\n" +
                "real g(x) ao custo da função heurística h(x) e que a função\n" +
                "heurística utilizada é a distância de Manhattan (soma das\n" +
                "distâncias horizontal e vertical de x até o objetivo). Desse\n" +
                "modo, o custo f(x) do quadrado verde é igual a");
        questaoAlternativa40.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa40.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa40.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa40.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa40.setAlternativaCorreta("b");
        questaoAlternativa40.setImagem(true);
        questaoAlternativa40.setAlternativasA("2.");
        questaoAlternativa40.setAlternativasB("3.");
        questaoAlternativa40.setAlternativasC("5.");
        questaoAlternativa40.setAlternativasD("7.");
        questaoAlternativa40.setAlternativasE("9.");
        questaoAlternativa40.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa40.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa41 = new QuestaoAlternativa();
        questaoAlternativa41.setId(INICIOQUESTAO.longValue());
        questaoAlternativa41.setAno(ANO);
        questaoAlternativa41.setDescricao("A figura abaixo ilustra a tentativa de se utilizar um filtro\n" +
                "digital no domínio da frequência, para suavizar o sinal\n" +
                "bidimensional de entrada que está no domínio do espaço.\n" +
                "A partir do resultado obtido no processo de filtragem, analise as seguintes asserções e a relação proposta entre elas.\n" +
                "$\\newline$O sinal de saída possui as características de um sinal\n" +
                "processado por um filtro passa-baixa ideal.\n" +
                "$\\newline$PORQUE\n" +
                "$\\newline$Embora suavizado, o sinal de saída evidencia a presença\n" +
                "do efeito de ringing, que é típico de um sinal convolucionado\n" +
                "pela função sinc no domínio do espaço.\n" +
                "$\\newline$Acerca dessas asserções, assinale a opção correta.");
        questaoAlternativa41.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa41.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa41.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa41.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa41.setAlternativaCorreta("a");
        questaoAlternativa41.setImagem(true);
        questaoAlternativa41.setAlternativasA("As duas asserções são proposições verdadeiras, e a segunda é uma justificativa correta da primeira.");
        questaoAlternativa41.setAlternativasB("As duas asserções são proposições verdadeiras, mas\n" +
                "a segunda não é uma justificativa correta da primeira.");
        questaoAlternativa41.setAlternativasC("A primeira asserção é uma proposição verdadeira e a\n" +
                "segunda, uma proposição falsa.");
        questaoAlternativa41.setAlternativasD("A primeira asserção é uma proposição falsa e a segunda, uma proposição verdadeira.");
        questaoAlternativa41.setAlternativasE("Tanto a primeira quanto a segunda asserções são proposições falsas.\n");
        questaoAlternativa41.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa41.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa42 = new QuestaoAlternativa();
        questaoAlternativa42.setId(INICIOQUESTAO.longValue());
        questaoAlternativa42.setAno(ANO);
        questaoAlternativa42.setDescricao("Sabendo que a principal tarefa de um sistema será de\n" +
                "classificação em domínios complexos, um gerente de\n" +
                "projetos precisa decidir como vai incorporar essa capacidade em um sistema computacional a fim de torná-lo\n" +
                "inteligente. Existem diversas técnicas de inteligência\n" +
                "computacional / artificial que possibilitam isso.\n" +
                "Nesse contexto, a técnica de inteligência artificial mais\n" +
                "indicada para o gerente é\n");
        questaoAlternativa42.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa42.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa42.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa42.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa42.setAlternativaCorreta("c");

        questaoAlternativa42.setAlternativasA("lógica nebulosa.");
        questaoAlternativa42.setAlternativasB("árvores de decisão.");
        questaoAlternativa42.setAlternativasC("redes neurais artificiais.");
        questaoAlternativa42.setAlternativasD("ACO (do inglês, Ant-Colony Optimization).");
        questaoAlternativa42.setAlternativasE("PSO (do inglês, Particle Swarm Optimization).");
        questaoAlternativa42.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa43 = new QuestaoAlternativa();
        questaoAlternativa43.setId(INICIOQUESTAO.longValue());
        questaoAlternativa43.setAno(ANO);
        questaoAlternativa43.setDescricao("Considerando as informações apresentadas na imagem abaixo, analise as afirmações a seguir.\n" +
                "$\\newline$I. Sistemas digitais são tradicionalmente concebidos como sistemas assíncronos regidos por um clock.\n" +
                "$\\newline$II. Better-than-worst-case é um estilo de projeto alternativo em que a lógica detecta e se recupera de erros, permitindo que o circuito possa operar com uma frequência maior.\n" +
                "$\\newline$III. Nos sistemas digitais, o período de clock é determinado por uma análise cuidadosa para que os valores sejam armazenados corretamente nos registradores, com o período de clock alargado para abranger o atraso de pior caso.\n" +
                "$\\newline$É correto o que se afirma em");
        questaoAlternativa43.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa43.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa43.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa43.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa43.setAlternativaCorreta("d");
        questaoAlternativa43.setImagem(true);
        questaoAlternativa43.setAlternativasA("I, apenas.");
        questaoAlternativa43.setAlternativasB("III, apenas.");
        questaoAlternativa43.setAlternativasC("I e II, apenas.");
        questaoAlternativa43.setAlternativasD("II e III, apenas.");
        questaoAlternativa43.setAlternativasE("I, II e III.");
        questaoAlternativa43.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa43.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa44 = new QuestaoAlternativa();
        questaoAlternativa44.setId(INICIOQUESTAO.longValue());
        questaoAlternativa44.setAno(ANO);
        questaoAlternativa44.setDescricao("Anulada");
        questaoAlternativa44.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa44.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa44.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa44.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
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
        questaoAlternativa45.setDescricao("Os amplificadores operacionais, como ilustra a figura abaixo, são componentes úteis em diversas aplicações." +
                "Considerando que o amplificador operacional do circuito é ideal, avalie as seguintes afirmativas.\n" +
                "$\\newline$I. A corrente i1 é idealmente nula.\n" +
                "$\\newline$II. A corrente i2 é idealmente nula.\n" +
                "$\\newline$III. O circuito exemplifica um seguidor de tensão.\n" +
                "$\\newline$IV. A diferença de potencial entre o ponto v1 e o ponto terra do circuito é idealmente nula.\n" +
                "$\\newline$V. A diferença de potencial entre o ponto v2 e o ponto terra do circuito é de +3,6 V.\n" +
                "$\\newline$É correto apenas o que se afirma em");
        questaoAlternativa45.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa45.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa45.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa45.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa45.setAlternativaCorreta("b");
        questaoAlternativa45.setImagem(true);
        questaoAlternativa45.setAlternativasA("I, II e III.");
        questaoAlternativa45.setAlternativasB("I, II e IV.");
        questaoAlternativa45.setAlternativasC("I, III e V.");
        questaoAlternativa45.setAlternativasD("II, IV e V.");
        questaoAlternativa45.setAlternativasE("III, IV e V.");
        questaoAlternativa45.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa45.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa46 = new QuestaoAlternativa();
        questaoAlternativa46.setId(INICIOQUESTAO.longValue());
        questaoAlternativa46.setAno(ANO);
        questaoAlternativa46.setDescricao("Em um modelo de dados que descreve a publicação acadêmica de pesquisadores de diferentes instituições em eventos acadêmicos, considere as tabelas abaixo.\n" +
                "$\\newline$DEPARTAMENTO (#CodDepartamento, NomeDepartamento)\n" +
                "$\\newline$EMPREGADO (#CodEmpregado, NomeEmpregado, CodDepartamento, Salario)\n" +
                "$\\newline$Na linguagem SQL, o comando mais simples para recuperar os códigos dos departamentos cuja média salarial seja maior que 2000 é");
        questaoAlternativa46.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa46.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa46.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa46.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa46.setAlternativaCorreta("a");

        questaoAlternativa46.setAlternativasA("SELECT CodDepartamento\n" +
                "FROM EMPREGADO\n" +
                "GROUP BY CodDepartamento\n" +
                "HAVING AVG (Salario) > 2000");
        questaoAlternativa46.setAlternativasB("SELECT CodDepartamento\n" +
                "FROM EMPREGADO\n" +
                "WHERE AVG (Salario) > 2000\n" +
                "GROUP BY CodDepartamento");
        questaoAlternativa46.setAlternativasC("SELECT CodDepartamento\n" +
                "FROM EMPREGADO\n" +
                "WHERE AVG (Salario) > 2000\n");
        questaoAlternativa46.setAlternativasD("SELECT CodDepartamento\n" +
                "FROM EMPREGADO\n" +
                "WHERE AVG (Salario) > 2000\n");
        questaoAlternativa46.setAlternativasE("SELECT CodDepartamento\n" +
                "FROM EMPREGADO\n" +
                "GROUP BY CodDepartamento\n" +
                "ORDER BY AVG (Salario) > 2000");
        questaoAlternativa46.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa47 = new QuestaoAlternativa();
        questaoAlternativa47.setId(INICIOQUESTAO.longValue());
        questaoAlternativa47.setAno(ANO);
        questaoAlternativa47.setDescricao("Uma empresa de natureza estritamente operacional\n" +
                "deseja implantar um setor de suporte ao processo\n" +
                "de tomada de decisão, já que os resultados que vem\n" +
                "apresentando demonstram contínua queda da margem\n" +
                "de lucro e aumento do custo operacional. Para isso, os\n" +
                "executivos de alto escalão da empresa decidiram investir\n" +
                "na aquisição de uma ferramenta OLAP acoplada a uma\n" +
                "data warehouse.\n" +
                "$\\newline$Nessa situação, avalie as afirmações a seguir.\n" +
                "$\\newline$I. No que tange ao tipo de suporte propiciado, os\n" +
                "sistemas OLAP podem ser classificados como\n" +
                "sistemas de trabalhadores do conhecimento.\n" +
                "$\\newline$II. Ferramentas OLAP apresentam foco orientado a\n" +
                "assunto, em contraposição a sistemas OLTP, que\n" +
                "são orientados a aplicação.\n" +
                "$\\newline$III. Tendo em vista que data marts são construídos\n" +
                "utilizando-se os sistemas legados da empresa,\n" +
                "sem a utilização de dados externos, o processo\n" +
                "de extração, transformação e carga envolve a\n" +
                "integração de dados, suprimindo-se a tarefa de\n" +
                "limpeza.\n" +
                "$\\newline$IV. O projeto de um data warehouse define a forma\n" +
                "com que a base de dados será construída. Uma\n" +
                "das opções é a abordagem data mart, em que os\n" +
                "diversos data marts são integrados, até que se\n" +
                "obtenha, ao final do processo, um data warehouse\n" +
                "da empresa.\n" +
                "$\\newline$É correto o que se afirma em");
        questaoAlternativa47.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa47.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa47.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa47.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa47.setAlternativaCorreta("d");

        questaoAlternativa47.setAlternativasA("I e III, apenas.");
        questaoAlternativa47.setAlternativasB("I e IV, apenas.");
        questaoAlternativa47.setAlternativasC("II e III, apenas.");
        questaoAlternativa47.setAlternativasD("II e IV, apenas.");
        questaoAlternativa47.setAlternativasE("I, II, III e IV.");
        questaoAlternativa47.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa48 = new QuestaoAlternativa();
        questaoAlternativa48.setId(INICIOQUESTAO.longValue());
        questaoAlternativa48.setAno(ANO);
        questaoAlternativa48.setDescricao("No desenvolvimento de um software para um sistema\n" +
                "de venda de produtos nacionais e importados, o analista\n" +
                "gerou o diagrama de casos de uso apresentado abaixo.\n" +
                "Da análise do diagrama, conclui-se que");
        questaoAlternativa48.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa48.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa48.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa48.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa48.setAlternativaCorreta("c");
        questaoAlternativa48.setImagem(true);
        questaoAlternativa48.setAlternativasA("a execução do caso de uso ‘Consultar estoque’ incorpora\n" +
                "opcionalmente o caso de uso ‘Liberar desconto’.\n");
        questaoAlternativa48.setAlternativasB("a execução do caso de uso ‘Liberar desconto’ incorpora opcionalmente o caso de uso ‘Realizar venda’.");
        questaoAlternativa48.setAlternativasC("a execução do caso de uso ‘Realizar venda’ incorpora obrigatoriamente o caso de uso ‘Consultar estoque’.");
        questaoAlternativa48.setAlternativasD("a execução do caso de uso ‘Realizar venda de produto nacional’ incorpora obrigatoriamente o caso\n" +
                "de uso ‘Liberar desconto’.");
        questaoAlternativa48.setAlternativasE("um Gerente pode interagir com o caso de uso ‘Realizar venda’, pois ele é um Usuário.");
        questaoAlternativa48.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa48.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa49 = new QuestaoAlternativa();
        questaoAlternativa49.setId(INICIOQUESTAO.longValue());
        questaoAlternativa49.setAno(ANO);
        questaoAlternativa49.setDescricao("Considerando o conceito de sistema, trazido pela Teoria Geral de Sistemas, um projeto de desenvolvimento de software poderia ser considerado como um sistema aberto.\n" +
                "Nessa perspectiva, solicitações de mudanças originadas de um stakeholder externo e que afetam o projeto podem ser consideradas como");
        questaoAlternativa49.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa49.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa49.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa49.setDisciplina(EDisciplina.GERENCIA_DE_PROJETOS);
        questaoAlternativa49.setAlternativaCorreta("b");

        questaoAlternativa49.setAlternativasA("ambiente.");
        questaoAlternativa49.setAlternativasB("entrada.");
        questaoAlternativa49.setAlternativasC("feedback.");
        questaoAlternativa49.setAlternativasD("processos.");
        questaoAlternativa49.setAlternativasE("saída.");
        questaoAlternativa49.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa50 = new QuestaoAlternativa();
        questaoAlternativa50.setId(INICIOQUESTAO.longValue());
        questaoAlternativa50.setAno(ANO);
        questaoAlternativa50.setDescricao("Uma empresa vem desenvolvendo um programa de\n" +
                "melhoria de seus processos de software utilizando o\n" +
                "modelo de qualidade CMMI. O programa envolveu a\n" +
                "definição de todos os processos padrão da organização,\n" +
                "implementação de técnicas de controle estatístico de\n" +
                "processos e métodos de melhoria contínua. Após a\n" +
                "avaliação SCAMPI, classe A, foi detectado que a área\n" +
                "de processo de PP - Project Planning (Planejamento de\n" +
                "Projeto) não estava aderente ao modelo.\n" +
                "Nesse contexto, considerando a representação por\n" +
                "estágios do CMMI, a empresa seria classificada em que\n" +
                "nível de maturidade?");
        questaoAlternativa50.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa50.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa50.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa50.setDisciplina(EDisciplina.GERENCIA_DE_PROJETOS);
        questaoAlternativa50.setAlternativaCorreta("a");

        questaoAlternativa50.setAlternativasA("Nível 1.");
        questaoAlternativa50.setAlternativasB("Nível 2.");
        questaoAlternativa50.setAlternativasC("Nível 3.");
        questaoAlternativa50.setAlternativasD("Nível 4.");
        questaoAlternativa50.setAlternativasE("Nível 5.");
        questaoAlternativa50.setNumeroQuestao(NUMEROQUESTAO);

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
        questoes.add(questaoDiscursiva33);
        questoes.add(questaoDiscursiva34);
        questoes.add(questaoDiscursiva35);
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

        return questoes;
    }

}
