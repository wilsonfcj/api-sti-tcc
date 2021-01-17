package ifsc.sti.tcc.utilidades.questaoenade;

import java.util.ArrayList;
import java.util.List;

import ifsc.sti.tcc.modelos.questao.Questao;
import ifsc.sti.tcc.modelos.questao.QuestaoAlternativa;
import ifsc.sti.tcc.modelos.questao.QuestaoDiscusiva;
import ifsc.sti.tcc.props.EArea;
import ifsc.sti.tcc.props.EDisciplina;
import ifsc.sti.tcc.props.EFormacao;
import ifsc.sti.tcc.props.ETipoQuestaoProva;

public class QuestaoEnade2005 {

    final static Integer ANO = 2005;
    static Integer INICIOQUESTAO = 1271;
    static Integer NUMEROQUESTAO = 1;

    public static List<Questao> register() {

        QuestaoAlternativa questaoAlternativa1 = new QuestaoAlternativa();
        questaoAlternativa1.setId(INICIOQUESTAO.longValue());
        questaoAlternativa1.setAno(ANO);
        questaoAlternativa1.setDescricao("Está em discussão, na sociedade brasileira, a possibilidade de uma reforma política e eleitoral. Fala-se, entre outras propostas, em financiamento público de campanhas, fidelidade partidária, lista eleitoral fechada e voto distrital. Os dispositivos ligados à obrigatoriedade de os candidatos fazerem declaração pública de bens e prestarem contas dos gastos devem ser aperfeiçoados, os órgãos públicos de fiscalização e controle podem ser equipados e reforçados.\n" +
                "Com base no exposto, mudanças na legislação eleitoral poderão representar, como principal aspecto, um reforço da");
        questaoAlternativa1.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa1.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa1.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa1.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa1.setAlternativaCorreta("d");

        questaoAlternativa1.setAlternativasA("política, porque garantirão a seleção de políticos experientes\n" +
                "e idôneos.");
        questaoAlternativa1.setAlternativasB("economia, porque incentivarão gastos das empresas públicas e privadas.");
        questaoAlternativa1.setAlternativasC("moralidade, porque inviabilizarão candidaturas despreparadas intelectualmente. ");
        questaoAlternativa1.setAlternativasD("ética, porque facilitarão o combate à corrupção e o estímulo à transparência");
        questaoAlternativa1.setAlternativasE("cidadania, porque permitirão a ampliação do número de cidadãos com direito ao voto.");
        questaoAlternativa1.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa2 = new QuestaoAlternativa();
        questaoAlternativa2.setId(INICIOQUESTAO.longValue());
        questaoAlternativa2.setAno(ANO);
        questaoAlternativa2.setDescricao("Leia e relacione os textos apresentados abaixo.\n" +
                "Comparando a proposta acima com a charge, pode-se concluir que");
        questaoAlternativa2.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa2.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa2.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa2.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa2.setAlternativaCorreta("e");
        questaoAlternativa2.setImagem(true);

        questaoAlternativa2.setAlternativasA("o conhecimento da tecnologia digital está democratizado no\n" +
                "Brasil.");
        questaoAlternativa2.setAlternativasB("a preocupação social é preparar quadros para o domínio da informática.");
        questaoAlternativa2.setAlternativasC("o apelo à inclusão digital atrai os jovens para o universo da computação.");
        questaoAlternativa2.setAlternativasD("o acesso à tecnologia digital está perdido para as comunidades\n" +
                "carentes.");
        questaoAlternativa2.setAlternativasE("a dificuldade de acesso ao mundo digital torna o cidadão um excluído social.");
        questaoAlternativa2.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa2.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa3 = new QuestaoAlternativa();
        questaoAlternativa3.setId(INICIOQUESTAO.longValue());
        questaoAlternativa3.setAno(ANO);
        questaoAlternativa3.setDescricao("As ações terroristas cada vez mais se propagam pelo mundo, havendo ataques em várias cidades, em todos os continentes. Nesse contexto, analise a seguinte notícia apresentada abaixo.\n" +
                "A principal razão, indicada pelo governante espanhol, para que haja tais iniciativas do terror está explicitada na seguinte afirmação:");
        questaoAlternativa3.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa3.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa3.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa3.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa3.setAlternativaCorreta("c");
        questaoAlternativa3.setImagem(true);
        questaoAlternativa3.setAlternativasA("O desejo de vingança desencadeia atos de barbárie dos\n" +
                "terroristas.");
        questaoAlternativa3.setAlternativasB("A democracia permite que as organizações terroristas se desenvolvam.");
        questaoAlternativa3.setAlternativasC("A desigualdade social existente em alguns países alimenta o terrorismo.\n");
        questaoAlternativa3.setAlternativasD("O choque de civilizações aprofunda os abismos culturais\n" +
                "entre os países.");
        questaoAlternativa3.setAlternativasE("A intolerância gera medo e insegurança criando condições\n" +
                "para o terrorismo.");
        questaoAlternativa3.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa3.setNumeroQuestao(NUMEROQUESTAO);


//		FEITO

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa4 = new QuestaoAlternativa();
        questaoAlternativa4.setId(INICIOQUESTAO.longValue());
        questaoAlternativa4.setAno(ANO);
        questaoAlternativa4.setDescricao("As duas charges de Laerte são críticas a dois problemas atuais da sociedade brasileira, que podem ser identificados");
        questaoAlternativa4.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa4.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa4.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa4.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa4.setAlternativaCorreta("a");
        questaoAlternativa4.setImagem(true);
        questaoAlternativa4.setAlternativasA("pela crise na saúde e na segurança pública.\n");
        questaoAlternativa4.setAlternativasB("pela crise na assistência social e na habitação.\n");
        questaoAlternativa4.setAlternativasC("pela crise na educação básica e na comunicação");
        questaoAlternativa4.setAlternativasD("pela crise na previdência social e pelo desemprego.");
        questaoAlternativa4.setAlternativasE("pela crise nos hospitais e pelas epidemias urbanas.");
        questaoAlternativa4.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa4.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa5 = new QuestaoAlternativa();
        questaoAlternativa5.setId(INICIOQUESTAO.longValue());
        questaoAlternativa5.setAno(ANO);
        questaoAlternativa5.setDescricao("Leia trechos da carta-resposta de um cacique indígena à sugestão, feita pelo governo do estado da Virgínia (EUA), de que uma tribo de índios enviasse alguns jovens para estudar nas escolas dos brancos.\n" +
                "A relação entre os dois principais temas do texto da carta e a forma de abordagem da educação privilegiada pelo cacique está representada por:");
        questaoAlternativa5.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa5.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa5.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa5.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa5.setAlternativaCorreta("e");
        questaoAlternativa5.setImagem(true);

        questaoAlternativa5.setAlternativasA("sabedoria e política / educação difusa.");
        questaoAlternativa5.setAlternativasB("identidade e história / educação formal.");
        questaoAlternativa5.setAlternativasC("ideologia e filosofia / educação superior.\n");
        questaoAlternativa5.setAlternativasD("ciência e escolaridade / educação técnica.");
        questaoAlternativa5.setAlternativasE("educação e cultura / educação assistemática");
        questaoAlternativa5.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa5.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa6 = new QuestaoAlternativa();
        questaoAlternativa6.setId(INICIOQUESTAO.longValue());
        questaoAlternativa6.setAno(ANO);
        questaoAlternativa6.setDescricao("O referendo popular é uma prática democrática que vem sendo exercida em alguns países, como exemplificado, na charge, pelo caso espanhol, por ocasião da votação sobre a aprovação ou não da Constituição Européia. Na charge abaixo, pergunta-se com destaque: “Você aprova o tratado da Constituição Européia?”, sendo apresentadas várias opções, além de haver a possibilidade de dupla marcação.\n" +
                "A crítica contida na charge indica que a prática do referendo deve");
        questaoAlternativa6.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa6.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa6.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa6.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa6.setAlternativaCorreta("c");
        questaoAlternativa6.setImagem(true);
        questaoAlternativa6.setAlternativasA("ser recomendada nas situações em que o plebiscito já tenha\n" +
                "ocorrido.");
        questaoAlternativa6.setAlternativasB("apresentar uma vasta gama de opções para garantir se caráter democrático.\n");
        questaoAlternativa6.setAlternativasC("ser precedida de um amplo debate prévio para o esclarecimento da população.");
        questaoAlternativa6.setAlternativasD("significar um tipo de consulta que possa inviabilizar os rumos políticos de uma nação.");
        questaoAlternativa6.setAlternativasE("ser entendida como uma estratégia dos governos para manter o exercício da soberania.");
        questaoAlternativa6.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa6.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa7 = new QuestaoAlternativa();
        questaoAlternativa7.setId(INICIOQUESTAO.longValue());
        questaoAlternativa7.setAno(ANO);
        questaoAlternativa7.setDescricao("A “cidade” retratada na pintura de Alberto da Veiga Guignard está tematizada nos versos");
        questaoAlternativa7.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa7.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa7.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa7.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa7.setAlternativaCorreta("b");
        questaoAlternativa7.setImagem(true);
        questaoAlternativa7.setAlternativaImagem(true);
        questaoAlternativa7.setAlternativasA("COLOCAR IMAGEM ALTERNATIVA AQUI");
        questaoAlternativa7.setAlternativasB("COLOCAR IMAGEM ALTERNATIVA AQUI");
        questaoAlternativa7.setAlternativasC("COLOCAR IMAGEM ALTERNATIVA AQUI");
        questaoAlternativa7.setAlternativasD("COLOCAR IMAGEM ALTERNATIVA AQUI");
        questaoAlternativa7.setAlternativasE("COLOCAR IMAGEM ALTERNATIVA AQUI");
        questaoAlternativa7.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa7.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoDiscusiva questaoDiscursiva8 = new QuestaoDiscusiva();
        questaoDiscursiva8.setId(INICIOQUESTAO.longValue());
        questaoDiscursiva8.setAno(ANO);
        questaoDiscursiva8.setDescricao("A partir das idéias presentes nos textos abaixo, expresse a sua opinião, fundamentada em dois argumentos, sobre a melhor maneira de se preservar a maior floresta equatorial do planeta.");
        questaoDiscursiva8.setTipoFormcao(EFormacao.GERAL);
        questaoDiscursiva8.setProva(ETipoQuestaoProva.ENADE);
        questaoDiscursiva8.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoDiscursiva8.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoDiscursiva8.setResposta("$\\newline$1. Articulação entre o aspecto ecológico e econômico da preservação da Amazônia.\n" +
                "$\\newline$2. A Amazônia é uma das nossas principais riquezas naturais. Os países ricos acabaram com as suas florestas e agora querem preservar a nossa a qualquer custo. Internacionalizar a Floresta Amazônica é romper com a soberania nacional, uma vez que ela é parte integrante do território brasileiro.\n" +
                "$\\newline$3. A Floresta Amazônica é tão importante para o Brasil quanto para o mundo e, como o nosso país não tem conseguido preservá-la, a internacionalização tornou-se uma necessidade.\n" +
                "$\\newline$4. Para preservar a floresta amazônica deve-se adotar uma política de auto-sustentabilidade que valorize, ao mesmo tempo a produção para a sobrevivência e a geração de riquezas sem destruir as árvores.\n" +
                "$\\newline$5. Na política de valorização da Amazônia, deve-se reflorestar o que tiver sido destruído, sobretudo a vegetação dos mananciais hídricos.\n" +
                "$\\newline$6. Criar condições para que a população da floresta possa sobreviver dignamente com os recursos oferecidos pela região. \n" +
                "$\\newline$7. Propor políticas ambientais, numa parceria público-privada, para aproveitar o potencial da região.\n" +
                "$\\newline$8. Despertar a consciência ecológica na população local, para ela aprender a defender o seu próprio patrimônio/desenvolver o turismo ecológico.\n" +
                "$\\newline$9. Promover, em todo o País, campanhas em defesa da Floresta Amazônica.\n" +
                "$\\newline$10. Criar incentivos financeiros para aqueles que cumprirem a legislação ambiental.");
        questaoDiscursiva8.setImagem(true);
        questaoDiscursiva8.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoDiscursiva8.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoDiscusiva questaoDiscursiva9 = new QuestaoDiscusiva();
        questaoDiscursiva9.setId(INICIOQUESTAO.longValue());
        questaoDiscursiva9.setAno(ANO);
        questaoDiscursiva9.setDescricao("Nos dias atuais, as novas tecnologias se desenvolvem de forma acelerada e a Internet ganha papel importante na dinâmica do cotidiano das pessoas e da economia mundial. No entanto, as conquistas tecnológicas, ainda que representem avanços, promovem conseqüências ameaçadoras.\n" +
                "Leia os gráficos e a situação-problema expressa por meio de um diálogo entre uma mulher desempregada, à procura de uma vaga no mercado de trabalho, e um empregador.\n" +
                "Apresente uma conclusão que pode ser extraída da análise\n" +
                "$\\newline$a) dos dois gráficos;\n" +
                "$\\newline$b) da situação-problema, em relação aos gráficos.");
        questaoDiscursiva9.setTipoFormcao(EFormacao.GERAL);
        questaoDiscursiva9.setProva(ETipoQuestaoProva.ENADE);
        questaoDiscursiva9.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoDiscursiva9.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoDiscursiva9.setResposta("$\\newline$a) Poderá ser apresentada uma das conclusões:\n" +
                "$\\newline$· O Brasil, que é uma das nações mais populosas do mundo, tem um número absoluto de internautas alto, correspondendo a 22,3 milhões em 2004, o que coloca o país na 10ª posição no ranking mundial. Porém, isso representa uma pequena parcela da população, pois, para cada 10 habitantes, em 2003, havia menos de 1 internauta.\n" +
                "$\\newline$· O Brasil reflete um panorama global de desigualdade no acesso às novas tecnologias de informática, como o uso da internet, o que caracteriza um índice considerável de exclusão digital: em números absolutos somos o 10º país com maior quantidade de internautas, mas em números relativos o quadro muda, visto que mais de 80% dos brasileiros ainda não têm acesso à Internet.\n" +
                "· leitura comparativa dos países que aparecem no gráfico, levando em conta os valores absolutos e relativo/tamanho da população.\n" +
                "$\\newline$b) Poderá ser apresentada uma das conclusões:\n" +
                "$\\newline$· Com a introdução das novas tecnologias de informática, o desemprego estrutural é uma realidade no Brasil e no mundo, reduzindo os postos de trabalho e de tarefas no mundo do trabalho e exigindo pessoas preparadas para o uso dessas novas tecnologias.\n" +
                "$\\newline$· A pequena oferta de trabalho pelo desemprego estrutural gera o deslocamento de pessoas com bom nível de educação formal, mas sem preparo para o uso das novas tecnologias de informática, para atividades que exigem baixa qualificação profissional.\n" +
                "$\\newline$· No mundo atual, a camada mais pobre da população precisa, além de outros fatores, se preocupar com mais um obstáculo para ter uma vida digna: a exclusão digital.\n" +
                "$\\newline$· Não possuir acesso à rede mundial na área de informática significa mais dificuldade para conseguir emprego e perda em aspectos primordiais da cidadania. Assim, dominar recursos básicos de informática torna-se exigência para quem quer ingressar no mercado de trabalho.\n" +
                "$\\newline$· Na atualidade, além da exigência de qualificação para o uso das novas tecnologias de informática, a discriminação da mulher no mercado de trabalho, com o aumento do desemprego estrutural, é facilitada, colocando-a numa situação subalterna, mesmo quando ela tem bom nível de educação formal.");
        questaoDiscursiva9.setImagem(true);
        questaoDiscursiva9.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoDiscursiva9.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoDiscusiva questaoDiscursiva10 = new QuestaoDiscusiva();
        questaoDiscursiva10.setId(INICIOQUESTAO.longValue());
        questaoDiscursiva10.setAno(ANO);
        questaoDiscursiva10.setDescricao("O aquecimento global é um fenômeno cada vez mais evidente devido a inúmeros acontecimentos que, como os descritos no texto, têm afetado toda a humanidade. Apresente duas sugestões de providências a serem tomadas pelos governos que tenham como objetivo minimizar o processo de aquecimento global.");
        questaoDiscursiva10.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoDiscursiva10.setTipoFormcao(EFormacao.GERAL);
        questaoDiscursiva10.setProva(ETipoQuestaoProva.ENADE);
        questaoDiscursiva10.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoDiscursiva10.setResposta("Uma sugestão que pode ser feita é a repressão ao desmatamento, especialmente àquele feito através das queimadas, garantindo que as florestas mantenham ou ampliem suas dimensões atuais para restabelecer a emissão de oxigênio na atmosfera e garantir o equilíbrio do regime de chuvas.\n" +
                "A outra é o controle da emissão de gases poluentes de automóveis e indústrias, especialmente os de origem fóssil, com o objetivo de minimizar o efeito estufa, um dos fatores que contribuem para o aquecimento global.");
        questaoDiscursiva10.setImagem(true);
        questaoDiscursiva10.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoDiscursiva10.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa11 = new QuestaoAlternativa();
        questaoAlternativa11.setId(INICIOQUESTAO.longValue());
        questaoAlternativa11.setAno(ANO);
        questaoAlternativa11.setDescricao("Apesar de todo o desenvolvimento, a construção de computadores e processadores continua, basicamente, seguindo a arquitetura clássica de von Neumann. As exceções a essa regra encontram-se em computadores de propósitos específicos e nos desenvolvidos em centros de pesquisa. Assinale a opção em que estão corretamente apresentadas características da operação básica de um processador clássico.");
        questaoAlternativa11.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa11.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa11.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa11.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa11.setAlternativaCorreta("a");

        questaoAlternativa11.setAlternativasA("Instruções e dados estão em uma memória física única; um programa é constituído de uma sequência de instruções de máquina; uma instrução é lida da memória de acordo com a ordem dessa seqüência e, quando é executada, passa-se, então,\n" +
                "para a próxima instrução na seqüência.");
        questaoAlternativa11.setAlternativasB("Instruções e dados estão em memórias físicas distintas; um programa é constituído de um conjunto de instruções de máquina; uma instrução é lida da memória quando o seu operando-destino necessita ser recalculado; essa instrução é executada e o resultado é escrito no operando de destino, passando-se, então, para o próximo operando a ser recalculado.");
        questaoAlternativa11.setAlternativasC("Instruções e dados estão em uma memória física única; um programa é constituído de um conjunto de instruções de máquina; uma instrução é lida da memória quando todos os seus operandos-fonte estiverem prontos e disponíveis; essa instrução é executada e o resultado é escrito no operando de destino, passando-se, então, para a instrução seguinte que tiver\n" +
                "todos seus operandos disponíveis.");
        questaoAlternativa11.setAlternativasD("Instruções e dados estão em memórias físicas distintas; um programa é constituído de um conjunto de instruções de máquina; uma instrução é lida da memória quando todos os seus operandos-fonte estiverem prontos e disponíveis; essa instrução é executada e o resultado é escrito no operando de destino, passando-se, então, para a instrução seguinte que estiver com todos os seus operandos disponíveis.");
        questaoAlternativa11.setAlternativasE("Instruções e dados estão em memórias físicas distintas; um programa é constituído de uma seqüência de instruções de máquina; uma instrução é lida da memória de acordo com a ordem dessa seqüência e, quando é executada, passa-se, então, para a próxima instrução na seqüência");
        questaoAlternativa11.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa12 = new QuestaoAlternativa();
        questaoAlternativa12.setId(INICIOQUESTAO.longValue());
        questaoAlternativa12.setAno(ANO);
        questaoAlternativa12.setDescricao("Um elemento imprescindível em um computador é o sistema de memória, componente que apresenta grande variedade de tipos, tecnologias e organizações. Com relação a esse assunto, julgue os itens seguintes.\n" +
                "$\\newline$I Para endereçar um máximo de 2 palavras distintas, uma E memória semicondutora necessita de, no mínimo, E bits de endereço.\n" +
                "$\\newline$II Em memórias secundárias constituídas por discos magnéticos, as palavras estão organizadas em blocos, e cada bloco possui um endereço único, com base na sua localização física no disco.\n" +
                "$\\newline$III A tecnologia de memória dinâmica indica que o conteúdo dessa memória pode ser alterado (lido e escrito), ao contrário da tecnologia de memória estática, cujo conteúdo pode apenas ser lido, mas não pode ser alterado.\n" +
                "$\\newline$Assinale a opção correta.");
        questaoAlternativa12.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa12.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa12.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa12.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa12.setAlternativaCorreta("b");

        questaoAlternativa12.setAlternativasA("Apenas um item está certo.\n");
        questaoAlternativa12.setAlternativasB("Apenas os itens I e II estão certos.");
        questaoAlternativa12.setAlternativasC("Apenas os itens I e III estão certos.");
        questaoAlternativa12.setAlternativasD("Apenas os itens II e III estão certos.");
        questaoAlternativa12.setAlternativasE("Todos os itens estão certos.\n");
        questaoAlternativa12.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa13 = new QuestaoAlternativa();
        questaoAlternativa13.setId(INICIOQUESTAO.longValue());
        questaoAlternativa13.setAno(ANO);
        questaoAlternativa13.setDescricao("Julgue os itens a seguir, acerca de algoritmos para ordenação.\n" +
                "$\\newline$I O algoritmo de ordenação por inserção tem complexidade O(n × log n).\n" +
                "$\\newline$II Um algoritmo de ordenação é dito estável caso ele não altere a posição relativa de elementos de mesmo valor.\n" +
                "$\\newline$III No algoritmo quicksort, a escolha do elemento pivô influencia o desempenho do algoritmo.\n" +
                "$\\newline$IV O bubble-sort e o algoritmo de ordenação por inserção\n" +
                "fazem, em média, o mesmo número de comparações.\n" +
                "$\\newline$Estão certos apenas os itens");
        questaoAlternativa13.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa13.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa13.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa13.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa13.setAlternativaCorreta("e");

        questaoAlternativa13.setAlternativasA("I e II.");
        questaoAlternativa13.setAlternativasB("I e III.");
        questaoAlternativa13.setAlternativasC("II e IV.");
        questaoAlternativa13.setAlternativasD("I, III e IV.");
        questaoAlternativa13.setAlternativasE("II, III e IV.");
        questaoAlternativa13.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa14 = new QuestaoAlternativa();
        questaoAlternativa14.setId(INICIOQUESTAO.longValue());
        questaoAlternativa14.setAno(ANO);
        questaoAlternativa14.setDescricao("Os proprietários de um teatro necessitam de uma ferramenta de software para reserva de lugares.\n" +
                "O desenvolvedor contratado verificou que as poltronas disponíveis para reserva são referenciadas pelo número da fila (a partir do n. 1) e pelo número da cadeira (a partir do n. o o 1) em cada fila, em uma representação matricial em que as linhas e colunas da matriz correspondem, respectivamente, às filas e às colunas de cadeiras. Embora o contexto seja o da organização matricial — N filas de cadeiras (linhas), cada uma contendo M cadeiras (colunas) —, a solução a ser implementada utilizará uma estrutura linear unidimensional (vetor), sendo, portanto, necessária uma conversão entre o lugar referenciado (número f da fila, número c da cadeira) e a posição real na estrutura de armazenamento (posição p no vetor).\n" +
                "Na situação apresentada, considere que a referida matriz seja armazenada no vetor segundo sua seqüência de linhas, da primeira para a última, e, em cada linha, da primeira coluna para a última, e que a primeira posição no vetor tenha índice 0. Nessa situação, a posição p da poltrona do teatro localizada à fila de número f e à coluna de número c, é igual a ");
        questaoAlternativa14.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa14.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa14.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa14.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa14.setAlternativaCorreta("c");

        questaoAlternativa14.setAlternativasA("c + f × M");
        questaoAlternativa14.setAlternativasB("f + c × M.");
        questaoAlternativa14.setAlternativasC("M × (f – 1) + (c – 1).");
        questaoAlternativa14.setAlternativasD("M × (c – 1) + (f – 1).");
        questaoAlternativa14.setAlternativasE("M × (c – 1) + M × f.");
        questaoAlternativa14.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa15 = new QuestaoAlternativa();
        questaoAlternativa15.setId(INICIOQUESTAO.longValue());
        questaoAlternativa15.setAno(ANO);
        questaoAlternativa15.setDescricao("Considere o algoritmo que implementa o seguinte processo: uma coleção desordenada de elementos é dividida em duas metades e cada metade é utilizada como argumento para a reaplicação recursiva do procedimento. Os resultados das duas reaplicações são, então, combinados pela intercalação dos elementos de ambas, resultando em uma coleção ordenada. Qual é a complexidade desse algoritmo?");
        questaoAlternativa15.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa15.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa15.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa15.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa15.setAlternativaCorreta("e");

        questaoAlternativa15.setAlternativasA("$O(n^{2})$");
        questaoAlternativa15.setAlternativasB("$O(n^{2n})$");
        questaoAlternativa15.setAlternativasC("$O(2^{n})$");
        questaoAlternativa15.setAlternativasD("$O(log\\,\\,n \\times log\\,\\,n)$");
        questaoAlternativa15.setAlternativasE("$O(n \\times log\\,\\,n)$");
        questaoAlternativa15.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa16 = new QuestaoAlternativa();
        questaoAlternativa16.setId(INICIOQUESTAO.longValue());
        questaoAlternativa16.setAno(ANO);
        questaoAlternativa16.setDescricao("No processo unificado, cinco workflows acompanham o conjunto das fases de desenvolvimento de software. Cada workflow é um conjunto de atividades executadas por vários membros do projeto. Considerando o desenvolvimento de um sistema integrado de gestão (ERP), o empacotamento em componentes de software dos elementos do modelo de projeto — tais como arquivo de códigofonte, biblioteca de ligação dinâmica e componentes executáveis — é descrito pelo workflow de");
        questaoAlternativa16.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa16.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa16.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa16.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa16.setAlternativaCorreta("d");

        questaoAlternativa16.setAlternativasA("teste.");
        questaoAlternativa16.setAlternativasB("análise.");
        questaoAlternativa16.setAlternativasC("projeto.");
        questaoAlternativa16.setAlternativasD("implementação.");
        questaoAlternativa16.setAlternativasE("requisito.");
        questaoAlternativa16.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa17 = new QuestaoAlternativa();
        questaoAlternativa17.setId(INICIOQUESTAO.longValue());
        questaoAlternativa17.setAno(ANO);
        questaoAlternativa17.setDescricao("No processo de desenvolvimento de um sistema de controle de materiais (matérias-primas) para uma metalúrgica, a equipe de projeto, responsável pelo mapeamento dos requisitos, desenvolveu seus trabalhos seguindo os quatro subprocessos da engenharia de requisitos. Inicialmente, foram feitas a análise e a avaliação\n" +
                "para se verificar se o sistema seria útil ao negócio. Em um segundo momento, os requisitos foram identificados e analisados e, logo em seguida, foram documentados.\n" +
                "Finalmente, foi verificado se os requisitos identificados atendiam às demandas dos usuários. Tendo sido executado esse procedimento, uma empresa independente de auditoria, após análise, identificou dois problemas no processo: a documentação dos requisitos (formulários e padrões utilizados) estava inadequada e não possibilitava\n" +
                "o entendimento correto dos requisitos; o processo de checagem entre as demandas dos usuários e as especificações relatadas não foi bem conduzido e seus resultados eram insatisfatórios.\n" +
                "Considerando o relatório da auditoria independente, quais foram as duas fases do processo de engenharia de requisitos que apresentaram problemas?");
        questaoAlternativa17.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa17.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa17.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa17.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa17.setAlternativaCorreta("d");

        questaoAlternativa17.setAlternativasA("Entendimento do domínio e especificação.");
        questaoAlternativa17.setAlternativasB("Elicitação e validação.");
        questaoAlternativa17.setAlternativasC("Validação e entendimento do domínio.");
        questaoAlternativa17.setAlternativasD("Especificação e validação.");
        questaoAlternativa17.setAlternativasE("Validação e elicitação.");
        questaoAlternativa17.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa18 = new QuestaoAlternativa();
        questaoAlternativa18.setId(INICIOQUESTAO.longValue());
        questaoAlternativa18.setAno(ANO);
        questaoAlternativa18.setDescricao("No processo de desenvolvimento de um sistema de tomada de decisões a ser implementado por uma instituição financeira de natureza privada, um profissional de sistemas de informações, contratado por prestação de serviços, recebeu a incumbência de garantir que o novo sistema operasse com uma função de concessão de crédito para clientes com maior probabilidade de honrar compromissos e que representassem menor risco para a instituição. Para a análise do perfil de cada cliente, o projetista definiu uma função de pesquisa e cruzamento de informações obtidas de terceiros e referentes a dados bancários, pessoais, comerciais, de previdência e saúde, e gastos com cartão de crédito. Em pouco tempo de operação, o novo sistema elevou os indicadores de desempenho da instituição financeira, apesar de ter diminuído o número de pessoas atendidas com o programa de concessão de créditos.\n" +
                "Quanto às questões éticas associadas à prática profissional, no contexto da situação apresentada, julgue os itens abaixo.\n" +
                "$\\newline$I É direito da empresa utilizar qualquer informação disponível, desde que seja para benefício corporativo.\n" +
                "$\\newline$II A empresa deve controlar, notificar e solicitar consentimento para armazenar e usar informações dos clientes.\n" +
                "$\\newline$III A responsabilidade pelo uso correto de informações é de quem as fornece, de quem as adquire e dos profissionais que as utilizam na construção de sistemas.\n" +
                "$\\newline$Assinale a opção correta.");
        questaoAlternativa18.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa18.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa18.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa18.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa18.setAlternativaCorreta("d");

        questaoAlternativa18.setAlternativasA("Apenas um item está certo.");
        questaoAlternativa18.setAlternativasB("Apenas os itens I e II estão certos.");
        questaoAlternativa18.setAlternativasC("Apenas os itens I e III estão certos.");
        questaoAlternativa18.setAlternativasD("Apenas os itens II e III estão certos.");
        questaoAlternativa18.setAlternativasE("Todos os itens estão certos.");
        questaoAlternativa18.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa19 = new QuestaoAlternativa();
        questaoAlternativa19.setId(INICIOQUESTAO.longValue());
        questaoAlternativa19.setAno(ANO);
        questaoAlternativa19.setDescricao("Julgue os itens seguintes.\n" +
                "$\\newline$I $(\\forall x\\,\\,P(x))\\vee(\\forall x\\,\\neg P(x))$ é uma sentença válida porque existe uma interpretação que a torna verdadeira.\n" +
                "$\\newline$II A frase “Se um carro é mais caro que todos os carros nacionais, ele deve ser alemão” pode ser traduzida pela seguinte sentença: $\\forall x\\,\\, carro(x)\\wedge \\forall y[carro(y)\\wedge fabricado(y,Brasil)\\wedge (preco(x) > preco(y)) \\Rightarrow fabricado(x, Alemanha).$\n" +
                "$\\newline$III A frase “Existe um aluno que gosta de todas as disciplinas difíceis” pode ser traduzida por: $\\exists x \\,\\, aluno(x) \\wedge \\forall y[ disciplina(y) \\wedge dificil(y) \\wedge gosta(x,y).$\n" +
                "$\\newline$Assinale a opção correta.");
        questaoAlternativa19.setArea(EArea.MATEMATICA);
        questaoAlternativa19.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa19.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa19.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa19.setAlternativaCorreta("a");

        questaoAlternativa19.setAlternativasA("Apenas um item está certo.");
        questaoAlternativa19.setAlternativasB("Apenas os itens I e II estão certos.");
        questaoAlternativa19.setAlternativasC("Apenas os itens I e III estão certos.");
        questaoAlternativa19.setAlternativasD("Apenas os itens II e III estão certos.");
        questaoAlternativa19.setAlternativasE("Todos os itens estão certos.");
        questaoAlternativa19.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa20 = new QuestaoAlternativa();
        questaoAlternativa20.setId(INICIOQUESTAO.longValue());
        questaoAlternativa20.setAno(ANO);
        questaoAlternativa20.setDescricao("A orientação a objetos é uma forma abstrata de pensar um problema utilizando-se conceitos do mundo real e não, apenas, conceitos computacionais. Nessa perspectiva, a adoção do paradigma orientado a objetos implica necessariamente que");
        questaoAlternativa20.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa20.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa20.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa20.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa20.setAlternativaCorreta("e");

        questaoAlternativa20.setAlternativasA("os usuários utilizem as aplicações de forma mais simples.");
        questaoAlternativa20.setAlternativasB("os sistemas sejam encapsulados por outros sistemas.");
        questaoAlternativa20.setAlternativasC("os programadores de aplicações sejam mais especializados.");
        questaoAlternativa20.setAlternativasD("os objetos sejam implementados de maneira eficiente e\n" +
                "simples.");
        questaoAlternativa20.setAlternativasE("a computação seja acionada por troca de mensagens entre objetos.");
        questaoAlternativa20.setNumeroQuestao(NUMEROQUESTAO);

//		PAREI AQUI

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa21 = new QuestaoAlternativa();
        questaoAlternativa21.setId(INICIOQUESTAO.longValue());
        questaoAlternativa21.setAno(ANO);
        questaoAlternativa21.setDescricao("No modo recursivo de representação, a descrição de um conceito faz referência ao próprio conceito. Julgue os itens abaixo, com relação à recursividade como paradigma de programação.\n" +
                "$\\newline$I São elementos fundamentais de uma definição recursiva: o caso-base (base da recursão) e a reaplicação da definição.\n" +
                "$\\newline$II O uso da recursão não é possível em linguagens com estruturas para orientação a objetos.\n" +
                "$\\newline$III As linguagens de programação funcionais têm, na recursão, seu principal elemento de repetição.\n" +
                "$\\newline$IV No que diz respeito ao poder computacional, as estruturas iterativas e recursivas são equivalentes.\n" +
                "$\\newline$V Estruturas iterativas e recursivas não podem ser misturadas em um mesmo programa.\n" +
                "$\\newline$Estão certos apenas os itens");
        questaoAlternativa21.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa21.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa21.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa21.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa21.setAlternativaCorreta("c");

        questaoAlternativa21.setAlternativasA("I e IV.");
        questaoAlternativa21.setAlternativasB("II e III.");
        questaoAlternativa21.setAlternativasC("I, III e IV.");
        questaoAlternativa21.setAlternativasD("I, III e V.");
        questaoAlternativa21.setAlternativasE("II, IV e V.");
        questaoAlternativa21.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa22 = new QuestaoAlternativa();
        questaoAlternativa22.setId(INICIOQUESTAO.longValue());
        questaoAlternativa22.setAno(ANO);
        questaoAlternativa22.setDescricao("Com relação ao gerenciamento de memória com paginação em sistemas operacionais, assinale a opção correta.");
        questaoAlternativa22.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa22.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa22.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa22.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa22.setAlternativaCorreta("d");

        questaoAlternativa22.setAlternativasA("As páginas utilizadas por um processo, sejam de código ou de dados, devem ser obrigatoriamente armazenadas na partição de swap do disco, quando o processo não estiver sendo executado.");
        questaoAlternativa22.setAlternativasB("Todas as páginas de um processo em execução devem ser\n" +
                "mantidas na memória física enquanto o processo não tiver terminado.");
        questaoAlternativa22.setAlternativasC("Um processo somente pode ser iniciado se o sistema operacional conseguir alocar um bloco contíguo de páginas do tamanho da memória necessária para execução do processo.\n");
        questaoAlternativa22.setAlternativasD("O espaço de endereçamento virtual disponível para os processos pode ser maior que a memória física disponível.");
        questaoAlternativa22.setAlternativasE("Um processo somente pode ser iniciado se o sistema operacional conseguir alocar todas as páginas de código desse processo.");
        questaoAlternativa22.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa23 = new QuestaoAlternativa();
        questaoAlternativa23.setId(INICIOQUESTAO.longValue());
        questaoAlternativa23.setAno(ANO);
        questaoAlternativa23.setDescricao("Em uma perspectiva instrumental clássica, é possível considerar que uma organização empresarial esteja dividida em funções e em níveis hierárquicos ou decisórios. Considere as seguintes definições.\n" +
                "$\\newline$I Nível responsável pelas decisões mais abrangentes da organização que possuem impacto no longo prazo e permitem direcionar e caracterizar o futuro da organização.\n" +
                "$\\newline$II Nível da rotina diária da organização, caracterizado por decisões de impacto a curto prazo.\n" +
                "$\\newline$III Nível responsável pelas decisões setoriais da organização, focado na concretização das estratégias a partir do acompanhamento e do controle das atividades que irão concretizar os objetivos estabelecidos.\n" +
                "$\\newline$As definições acima correspondem, respectivamente, aos níveis");
        questaoAlternativa23.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa23.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa23.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa23.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa23.setAlternativaCorreta("a");

        questaoAlternativa23.setAlternativasA("estratégico, operacional e tático.");
        questaoAlternativa23.setAlternativasB("tático, operacional e estratégico.");
        questaoAlternativa23.setAlternativasC("operacional, estratégico e tático.");
        questaoAlternativa23.setAlternativasD("estratégico, tático e operacional.");
        questaoAlternativa23.setAlternativasE("tático, estratégico e operacional.\n");
        questaoAlternativa23.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa24 = new QuestaoAlternativa();
        questaoAlternativa24.setId(INICIOQUESTAO.longValue());
        questaoAlternativa24.setAno(ANO);
        questaoAlternativa24.setDescricao("Na definição da aquisição de um novo software de banco de dados (SGBD) para uma empresa da área de transporte coletivo urbano, a direção da área de Informática conduziu o processo de decisão da seguinte forma: foi designado um profissional da área de banco de dados (aquele com maior experiência na área) e atribuída a ele a tarefa de decidir qual seria o melhor SGBD a ser adquirido. Esse profissional desenvolveu uma série de estudos sobre as opções disponíveis utilizando técnicas de simulação e testes específicos para cada SGBD analisado. Ao final, apresentou ao diretor um relatório em que indicava claramente qual o melhor SGBD (solução ótima) disponível no mercado. Com base nessa informação, o diretor da empresa disparou o processo de compra do software (SGBD) indicado.\n" +
                "Esse processo decisório classifica-se na abordagem");
        questaoAlternativa24.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa24.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa24.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa24.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa24.setAlternativaCorreta("a");

        questaoAlternativa24.setAlternativasA("racional.\n");
        questaoAlternativa24.setAlternativasB("de racionalidade limitada.");
        questaoAlternativa24.setAlternativasC("política");
        questaoAlternativa24.setAlternativasD("do incrementalismo.");
        questaoAlternativa24.setAlternativasE("do componente subjetivo.");
        questaoAlternativa24.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa25 = new QuestaoAlternativa();
        questaoAlternativa25.setId(INICIOQUESTAO.longValue());
        questaoAlternativa25.setAno(ANO);
        questaoAlternativa25.setDescricao("Entre os aspectos importantes relativos à segurança de sistemas de informação, inclui-se\n" +
                "$\\newline$I a proteção de dados por meio de senhas e criptografia forte.\n" +
                "$\\newline$II a existência de um plano de recuperação de desastres associado a backups frequentes.\n" +
                "$\\newline$III a utilização de firewalls associada a mecanismos de detecção de intrusão.\n" +
                "$\\newline$Assinale a opção correta.");
        questaoAlternativa25.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa25.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa25.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa25.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa25.setAlternativaCorreta("e");

        questaoAlternativa25.setAlternativasA("Apenas um item está certo.\n");
        questaoAlternativa25.setAlternativasB("Apenas os itens I e II estão certos.");
        questaoAlternativa25.setAlternativasC("Apenas os itens I e III estão certos.");
        questaoAlternativa25.setAlternativasD("Apenas os itens II e III estão certos.\n");
        questaoAlternativa25.setAlternativasE("Todos os itens estão certos.\n");
        questaoAlternativa25.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa26 = new QuestaoAlternativa();
        questaoAlternativa26.setId(INICIOQUESTAO.longValue());
        questaoAlternativa26.setAno(ANO);
        questaoAlternativa26.setDescricao("Todo jogador deve pertencer a um único clube.\n" +
                "Assinale a opção que representa corretamente, no modelo\n" +
                "entidade-relacionamento, a especificação apresentada acima.\n");
        questaoAlternativa26.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa26.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa26.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa26.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa26.setAlternativaCorreta("e");
        questaoAlternativa26.setAlternativaImagem(true);
        questaoAlternativa26.setAlternativasA("COLOCAR IMAGEM ALTERNATIVA AQUI");
        questaoAlternativa26.setAlternativasB("COLOCAR IMAGEM ALTERNATIVA AQUI");
        questaoAlternativa26.setAlternativasC("COLOCAR IMAGEM ALTERNATIVA AQUI");
        questaoAlternativa26.setAlternativasD("COLOCAR IMAGEM ALTERNATIVA AQUI");
        questaoAlternativa26.setAlternativasE("COLOCAR IMAGEM ALTERNATIVA AQUI");
        questaoAlternativa26.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa27 = new QuestaoAlternativa();
        questaoAlternativa27.setId(INICIOQUESTAO.longValue());
        questaoAlternativa27.setAno(ANO);
        questaoAlternativa27.setDescricao("Na etapa de projeto orientado a objetos, no contexto de um processo de desenvolvimento de software, são desenvolvidas as atividades de");
        questaoAlternativa27.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa27.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa27.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa27.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa27.setAlternativaCorreta("b");

        questaoAlternativa27.setAlternativasA("definição da arquitetura do sistema e conversão das bases de\n" +
                "dados do sistema.");
        questaoAlternativa27.setAlternativasB("identificação dos objetos do sistema e definição da\n" +
                "arquitetura do sistema");
        questaoAlternativa27.setAlternativasC("conversão das bases de dados do sistema e teste de\n" +
                "integração do sistema.");
        questaoAlternativa27.setAlternativasD("teste de integração do sistema e análise de requisitos do\n" +
                "sistema.");
        questaoAlternativa27.setAlternativasE("análise de requisitos do sistema e definição da arquitetura\n" +
                "do sistema.");
        questaoAlternativa27.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa28 = new QuestaoAlternativa();
        questaoAlternativa28.setId(INICIOQUESTAO.longValue());
        questaoAlternativa28.setAno(ANO);
        questaoAlternativa28.setDescricao("O gerente de tecnologia de uma empresa de TI recebeu a incumbência de especificar a arquitetura de um sistema de informação para atender a um cliente na área de diagnóstico por imagem (raio X, tomografia computadorizada e ressonância magnética). O cliente está interessado em agilizar o diagnóstico por armazenamento e recuperação de imagens digitalizadas e em se manter na vanguarda do mercado, dada a melhoria contínua de sua solução em TI.\n" +
                "O cliente pretende iniciar digitalizando 1.000 imagens por mês, cada imagem com tamanho médio de 20 kilobytes, até chegar, em 12 meses, a 20.000 imagens por mês. Considerando essas informações, julgue os seguintes itens.\n" +
                "$\\newline$I Um SBD orientado a objeto é adequado para a arquitetura do SI do cliente porque é voltado justamente para aplicações que tratam objetos complexos e tem alta integração com linguagens de programação orientadas a objetos.\n" +
                "$\\newline$II Um SBD relacional não é adequado para a arquitetura do SI do cliente porque não constitui ainda uma tecnologia bem estabelecida e bem testada, apesar de ser uma linguagem de consulta poderosa.\n" +
                "$\\newline$III Um SBD objeto-relacional é adequado para a arquitetura do SI do cliente porque alia estruturas não-normalizadas, capazes de representar objetos complexos, a uma linguagem de consulta poderosa.\n" +
                "$\\newline$Assinale a opção correta.");
        questaoAlternativa28.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa28.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa28.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa28.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa28.setAlternativaCorreta("c");

        questaoAlternativa28.setAlternativasA("Apenas um item está certo.");
        questaoAlternativa28.setAlternativasB("Apenas os itens I e II estão certos.");
        questaoAlternativa28.setAlternativasC("Apenas os itens I e III estão certos.");
        questaoAlternativa28.setAlternativasD("Apenas os itens II e III estão certos.");
        questaoAlternativa28.setAlternativasE("Todos os itens estão certos.");
        questaoAlternativa28.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa29 = new QuestaoAlternativa();
        questaoAlternativa29.setId(INICIOQUESTAO.longValue());
        questaoAlternativa29.setAno(ANO);
        questaoAlternativa29.setDescricao("Considere um sistema bancário simplificado e uma transação T1, que transfira R$ 100,00 da conta X para a conta Y e é definida pelas operações listadas acima. Considere ainda que uma transação T2 esteja sendo executada simultaneamente com T1. Caso a transação T2 realize a operação Escrita(Y) depois da execução da operação 4 e antes da execução da operação 6 por T1, qual propriedade de transações será violada no banco de dados do referido sistema bancário?");
        questaoAlternativa29.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa29.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa29.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa29.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa29.setAlternativaCorreta("b");
        questaoAlternativa29.setImagem(true);
        questaoAlternativa29.setAlternativasA("Atomicidade.");
        questaoAlternativa29.setAlternativasB("Isolamento.");
        questaoAlternativa29.setAlternativasC("Distributividade.");
        questaoAlternativa29.setAlternativasD("Consistência.");
        questaoAlternativa29.setAlternativasE("Durabilidade.");
        questaoAlternativa29.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa29.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa30 = new QuestaoAlternativa();
        questaoAlternativa30.setId(INICIOQUESTAO.longValue());
        questaoAlternativa30.setAno(ANO);
        questaoAlternativa30.setDescricao("O desenvolvimento global de software GSD — global software development — tem-se firmado como uma das grandes tendências na área de sistemas de informação nas organizações. Considere que uma organização da área de varejo e distribuição sediada na Europa tenha implantado três unidades de desenvolvimento de software espalhadas no mundo: uma no Brasil, uma na Índia e outra na China. Considere ainda que nenhuma dessas unidades possua qualquer tipo de certificação e que o principal problema da organização esteja relacionado ao desenvolvimento de sistemas que atendam às necessidades da organização e que reflitam as expectativas dos clientes globais.\n" +
                "Nessa situação, o nível do modelo SW-CMM e a KPA (área chave de processo) mais adequados para a situação apresentada são, respectivamente,");
        questaoAlternativa30.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa30.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa30.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa30.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa30.setAlternativaCorreta("a");

        questaoAlternativa30.setAlternativasA("nível 2, KPA RM – gestão de requisitos.");
        questaoAlternativa30.setAlternativasB("nível 2, KPA SPP – planejamento.");
        questaoAlternativa30.setAlternativasC("nível 2, KPA SPTO – acompanhamento de projeto.");
        questaoAlternativa30.setAlternativasD("nível 3, KPA OPD – definição do processo da organização.");
        questaoAlternativa30.setAlternativasE("nível 3, KPA SPE – engenharia de produtos de software.");
        questaoAlternativa30.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa31 = new QuestaoAlternativa();
        questaoAlternativa31.setId(INICIOQUESTAO.longValue());
        questaoAlternativa31.setAno(ANO);
        questaoAlternativa31.setDescricao("O modelo de gerenciamento de projetos do PMI (Project Management Institute), descrito no PMBOK, envolve um conjunto de nove áreas de conhecimento a serem consideradas com vistas a melhorar o processo de gestão de um projeto, ampliando-se, conseqüentemente, suas chances de sucesso. Considere que, no desenvolvimento de um sistema de vendas de uma empresa que atua no segmento industrial, o orçamento inicial tenha sido extrapolado em 120% e que a equipe da área de sistemas tenha concluído o sistema com mais de quatro meses de atraso. Nas reuniões com os usuários para a entrega do sistema, foi constatado que este não atendia às especificações esperadas pelos usuários.\n" +
                "Nessa situação, evidenciam-se áreas de conhecimento que compõem a chamada tripla restrição, que são as áreas de gerenciamento de");
        questaoAlternativa31.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa31.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa31.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa31.setDisciplina(EDisciplina.GERENCIA_DE_PROJETOS);
        questaoAlternativa31.setAlternativaCorreta("c");

        questaoAlternativa31.setAlternativasA("escopo, contratação e custo.");
        questaoAlternativa31.setAlternativasB("tempo, contratação e risco.");
        questaoAlternativa31.setAlternativasC("custo, tempo e escopo.");
        questaoAlternativa31.setAlternativasD("contratação, custo e tempo.");
        questaoAlternativa31.setAlternativasE("risco, tempo e escopo.");
        questaoAlternativa31.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa32 = new QuestaoAlternativa();
        questaoAlternativa32.setId(INICIOQUESTAO.longValue());
        questaoAlternativa32.setAno(ANO);
        questaoAlternativa32.setDescricao("O planejamento estratégico de sistemas de informação pode ser entendido como o processo de identificação de um porta-fólio computadorizado de aplicações que dá suporte ao plano de negócios das organizações e auxilia na concretização dos objetivos organizacionais. Os principais objetivos do processo de planejamento estratégico de sistemas de informação não incluem");
        questaoAlternativa32.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa32.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa32.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa32.setDisciplina(EDisciplina.GERENCIA_DE_PROJETOS);
        questaoAlternativa32.setAlternativaCorreta("e");

        questaoAlternativa32.setAlternativasA("o alinhamento das estratégias da área de SI com as estratégias\n" +
                "do negócio.");
        questaoAlternativa32.setAlternativasB("o comprometimento da alta administração, pela alocação dos\n" +
                "recursos e resultados intermediários e incrementais.");
        questaoAlternativa32.setAlternativasC("a melhoria do desempenho da área de SI, seja pela alocação mais eficaz de recursos, seja pelo aumento de produtividade dos profissionais.");
        questaoAlternativa32.setAlternativasD("a antecipação de tendências, envolvendo inovação tecnológica\n" +
                "contínua.");
        questaoAlternativa32.setAlternativasE("a identificação, a avaliação e a validação dos controles relacionados aos sistemas de informação existentes, do ponto de vista de sua eficiência e eficácia.");
        questaoAlternativa32.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa33 = new QuestaoAlternativa();
        questaoAlternativa33.setId(INICIOQUESTAO.longValue());
        questaoAlternativa33.setAno(ANO);
        questaoAlternativa33.setDescricao("Considere que a rede de uma empresa usará os protocolos TCP/IP para facilitar o acesso do público às informações dessa empresa a partir de máquinas conectadas à Internet. Considere ainda que, ao serem descritos os protocolos que serão usados na rede, alguns erros foram cometidos. As descrições estão apresentadas nos itens a seguir.\n" +
                "$\\newline$I O Internet Protocol (IP) provê serviço não-orientado a conexão, e garante a entrega dos datagramas enviados. Além de garantir a entrega dos datagramas enviados, outra importante responsabilidade do IP é rotear os datagramas por meio de redes interligadas. O roteamento é feito usandose endereços IP.\n" +
                "ao serem descritos os protocolos que serão usados na rede, alguns erros foram cometidos. As descrições estão apresentadas nos itens a seguir.\n" +
                "$\\newline$II O Internet Control Message Protocol (ICMP) possibilita que mensagens de erro e de controle sejam trocadas entre máquinas. As mensagens ICMP são transferidas como dados em datagramas do IP.\n" +
                "ao serem descritos os protocolos que serão usados na rede, alguns erros foram cometidos. As descrições estão apresentadas nos itens a seguir.\n" +
                "$\\newline$III O Transmission Control Protocol (TCP) provê um serviço orientado a conexão. Os dados são transferidos por meio de uma conexão em unidades conhecidas como segmentos.\n" +
                "O TCP espera que a recepção dos segmentos transmitidos seja confirmada pelo destino e retransmite segmentos cuja recepção não seja confirmada.\n" +
                "ao serem descritos os protocolos que serão usados na rede, alguns erros foram cometidos. As descrições estão apresentadas nos itens a seguir.\n" +
                "$\\newline$IV O User Datagram Protocol (UDP) provê um mecanismo para que aplicações possam comunicar-se usando datagramas. O UDP provê um protocolo de transporte orientado a conexão e não garante a entrega dos datagramas.\n" +
                "ao serem descritos os protocolos que serão usados na rede, alguns erros foram cometidos. As descrições estão apresentadas nos itens a seguir.\n" +
                "$\\newline$V A emulação de terminal usará o protocolo TELNET, e a transferência de arquivos, o File Transfer Protocol (FTP). O correio eletrônico será provido pelo Simple Mail Transfer Protocol (SMTP) e as mensagens serão transferidas dos servidores de correio eletrônico para as máquinas dos usuários via Internet Mail Access Protocol (IMAP).\n" +
                "ao serem descritos os protocolos que serão usados na rede, alguns erros foram cometidos. As descrições estão apresentadas nos itens a seguir.\n" +
                "$\\newline$Estão corretas apenas as descrições");
        questaoAlternativa33.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa33.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa33.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa33.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa33.setAlternativaCorreta("d");

        questaoAlternativa33.setAlternativasA("I, II e IV.");
        questaoAlternativa33.setAlternativasB("I, II e V.");
        questaoAlternativa33.setAlternativasC("I, III e IV.");
        questaoAlternativa33.setAlternativasD("II, III e V.");
        questaoAlternativa33.setAlternativasE("III, IV e V.");
        questaoAlternativa33.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa34 = new QuestaoAlternativa();
        questaoAlternativa34.setId(INICIOQUESTAO.longValue());
        questaoAlternativa34.setAno(ANO);
        questaoAlternativa34.setDescricao("Julgue os seguintes itens referentes a teste de software.\n" +
                "$\\newline$I A técnica de teste funcional, que estabelece os requisitos de teste com base em determinada implementação, permite verificar se são atendidos os detalhes do código e solicita a execução de partes ou de componentes elementares do programa; a técnica de teste estrutural aborda o software de um ponto de vista macroscópico e estabelece os requisitos de teste, com base em determinada implementação.\n" +
                "$\\newline$II Na fase de teste de unidade, o objetivo é explorar-se a menor unidade de projeto, procurando-se identificar erros de lógica e de implementação de cada módulo; na fase de teste de integração, o objetivo é descobrir erros associados às interfaces entre os módulos quando esses são integrados, para se construir a estrutura do software, estabelecida na fase de projeto.\n" +
                "$\\newline$III Critérios com base na complexidade, em fluxo de controle e em fluxo de dados, são utilizados pela técnica estrutural de teste.\n" +
                "$\\newline$Assinale a opção correta.");
        questaoAlternativa34.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa34.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa34.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa34.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa34.setAlternativaCorreta("d");

        questaoAlternativa34.setAlternativasA("Apenas um item está certo.\n");
        questaoAlternativa34.setAlternativasB("Apenas os itens I e II estão certos.");
        questaoAlternativa34.setAlternativasC("Apenas os itens I e III estão certos.\n");
        questaoAlternativa34.setAlternativasD("Apenas os itens II e III estão certos.\n");
        questaoAlternativa34.setAlternativasE("Todos os itens estão certos.\n");
        questaoAlternativa34.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa35 = new QuestaoAlternativa();
        questaoAlternativa35.setId(INICIOQUESTAO.longValue());
        questaoAlternativa35.setAno(ANO);
        questaoAlternativa35.setDescricao("Uma empresa tem a sua sede em Natal e filiais em Brasília e Florianópolis. Em cada cidade, a empresa possui computadores que serão interligados. A seguir, encontram-se os requisitos que devem ser observados no projeto da rede.\n" +
                "$\\newline$Requisito A: Em Natal, existem dois prédios. Para interligá-los, devem ser usados dispositivos que dividam o tráfego entre os prédios. Os dispositivos devem atuar na camada de enlace e a presença dos mesmos deve ser transparente às máquinas na rede.\n" +
                "$\\newline$Requisito B: Em Brasília, há computadores em vários departamentos. Para interligar os departamentos, devem ser usados dispositivos que dividam o tráfego entre os departamentos e que possibilitem a comunicação simultânea entre esses departamentos.\n" +
                "$\\newline$Requisito C: As redes em Natal, Brasília e Florianópolis devem ser interligadas por dispositivos que dividam o tráfego e que possibilitem a interligação de redes com diferentes protocolos da camada física. Para decidir os destinos dos dados, devem ser usados endereços de rede. Os dispositivos devem possibilitar que o tráfego seja filtrado.\n" +
                "$\\newline$Requisito D: A rede deve usar TCP/IP. O endereço da rede será da classe B e um dos bytes identificará o segmento da rede localizado em cada cidade. Em cada segmento, servidores distribuirão automaticamente os endereços IP entre as máquinas.\n" +
                "$\\newline$Requisito E: Os nomes das máquinas serão traduzidos em endereços IP por servidores em cada cidade. Esses servidores estarão organizados em uma hierarquia. Cada servidor será responsável por um ou por vários subdomínios.\n" +
                "$\\newline$A seguir, encontram-se as decisões que foram tomadas para cada requisito.\n" +
                "$\\newline$I Usar repetidores para atender ao requisito A.\n" +
                "$\\newline$II Usar comutadores (switches) para atender ao requisito B.\n" +
                "$\\newline$III Usar roteadores para atender ao requisito C.\n" +
                "$\\newline$IV Usar o endereço de rede 164.41.0.0, a máscara 255.255.0.0 e servidores DHCP para atender ao requisito D.\n" +
                "$\\newline$V Configurar servidores Domain Name System (DNS) para atender ao requisito E.\n" +
                "$\\newline$Estão corretas apenas as decisões");
        questaoAlternativa35.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa35.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa35.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa35.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa35.setAlternativaCorreta("d");

        questaoAlternativa35.setAlternativasA("I, II e IV.");
        questaoAlternativa35.setAlternativasB("I, II e V. ");
        questaoAlternativa35.setAlternativasC("I, III e IV.");
        questaoAlternativa35.setAlternativasD("II, III e V.");
        questaoAlternativa35.setAlternativasE("III, IV e V.");
        questaoAlternativa35.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa36 = new QuestaoAlternativa();
        questaoAlternativa36.setId(INICIOQUESTAO.longValue());
        questaoAlternativa36.setAno(ANO);
        questaoAlternativa36.setDescricao("João, ao tentar consertar o módulo eletrônico de um carrinho de brinquedos, levantou as características de um pequeno circuito digital incluso no módulo. Verificou que o circuito tinha dois bits de entrada, $x_{0}\\,\\,e\\,\\,x_{1}$, e um bit de saída. Os bits $x_{0}\\,\\,e\\,\\,x_{1}$ eram utilizados para representar valores de inteiros de 0 a 3($x_{0}$ , o bit menos significativo e $x_{1}$, o bit mais significativo). Após testes, João verificou que a saída do circuito é 0 para todos os valores de entrada, exceto para o valor 2.\n" +
                "Qual das expressões a seguir representa adequadamente o circuito analisado por João?");
        questaoAlternativa36.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa36.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa36.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa36.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
        questaoAlternativa36.setAlternativaCorreta("c");

        questaoAlternativa36.setAlternativasA("$x_{0}\\,\\,and(not\\,\\,x_{1})$");
        questaoAlternativa36.setAlternativasB("$(not\\,\\,x_{0})\\,or\\,(not\\,\\,x_{1})$");
        questaoAlternativa36.setAlternativasC("$(not\\,\\,x_{0})\\,\\,and\\,\\,x_{1}$");
        questaoAlternativa36.setAlternativasD("$x_{0}\\,\\,and\\,\\,x_{1}$");
        questaoAlternativa36.setAlternativasE("$x_{0}\\,\\,or\\,\\,(not\\,\\,x_{1})$");
        questaoAlternativa36.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa37 = new QuestaoAlternativa();
        questaoAlternativa37.setId(INICIOQUESTAO.longValue());
        questaoAlternativa37.setAno(ANO);
        questaoAlternativa37.setDescricao("O gerente de desenvolvimento de uma empresa de TI examinou a seguinte planilha sobre andamento de projetos." +
                "Com base na planilha abaixo e com relação aos conceitos de dado, informação e conhecimento, julgue os itens que se seguem.\n" +
                "$\\newline$I O número 65, na célula inferior direita, é um dado.\n" +
                "$\\newline$II Associar o número 80 (célula inferior central) ao percentual completado (em %) e a P2, e concluir que o projeto P2 está 80% completado é um conhecimento.\n" +
                "$\\newline$III Dizer que P1 está adiantado ou atrasado é uma informação.\n" +
                "$\\newline$IV Dizer o quanto P1 vai precisar a mais do que foi inicialmente previsto no orçamento é um conhecimento.\n" +
                "$\\newline$Estão certos apenas os itens");
        questaoAlternativa37.setArea(EArea.MATEMATICA);
        questaoAlternativa37.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa37.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa37.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa37.setAlternativaCorreta("b");
        questaoAlternativa37.setImagem(true);
        questaoAlternativa37.setAlternativasA("I e II.");
        questaoAlternativa37.setAlternativasB("I e IV.");
        questaoAlternativa37.setAlternativasC("II e III.");
        questaoAlternativa37.setAlternativasD("II e IV.");
        questaoAlternativa37.setAlternativasE("III e IV.");
        questaoAlternativa37.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa37.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa38 = new QuestaoAlternativa();
        questaoAlternativa38.setId(INICIOQUESTAO.longValue());
        questaoAlternativa38.setAno(ANO);
        questaoAlternativa38.setDescricao("O objetivo da Teoria Geral dos Sistemas (TGS) é a formulação dos princípios válidos para os sistemas em geral, qualquer que seja a natureza dos elementos que os compõem e as relações ou forças existentes entre eles. Na área de sistemas de informação, diversos problemas requerem abordagem multidisciplinar para serem resolvidos. Por exemplo, na área de desenvolvimento de software, a especificação de requisitos apresenta vários desafios desse tipo, tais como aspectos de relacionamento interpessoal, conhecimento do negócio, resolução de conflitos, diferenças culturais etc. Os propósitos da TGS que podem contribuir para a resolução desses problemas incluem\n" +
                "$\\newline$I o incentivo à especialização total das áreas do conhecimento.\n" +
                "$\\newline$II o desenvolvimento dos princípios unificadores que transcendem o universo das ciências individuais.\n" +
                "$\\newline$III a integração de contribuições de várias ciências na busca de solução dos problemas.\n" +
                "$\\newline$IV o desenvolvimento de princípios únicos para cada área do conhecimento.\n" +
                "$\\newline$V o desenvolvimento de estudos que visem à ampliação da separação entre as ciências naturais e sociais.\n" +
                "$\\newline$Estão certos apenas os itens");
        questaoAlternativa38.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa38.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa38.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa38.setDisciplina(EDisciplina.GERENCIA_DE_PROJETOS);
        questaoAlternativa38.setAlternativaCorreta("c");

        questaoAlternativa38.setAlternativasA("I e II.");
        questaoAlternativa38.setAlternativasB("I e V.");
        questaoAlternativa38.setAlternativasC("II e III.");
        questaoAlternativa38.setAlternativasD("III e IV.");
        questaoAlternativa38.setAlternativasE("IV e V.");
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
        questaoAlternativa39.setDisciplina(EDisciplina.GRAFOS);
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
        questaoAlternativa40.setDisciplina(EDisciplina.GRAFOS);
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
        questaoAlternativa41.setDescricao("Processadores atuais incluem mecanismos para o tratamento de situações especiais, conhecidas como interrupções. Em uma interrupção, o fluxo normal de instruções é interrompido para que a causa da interrupção seja tratada. Com relação a esse assunto, assinale a opção correta.");
        questaoAlternativa41.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa41.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa41.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa41.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa41.setAlternativaCorreta("c");

        questaoAlternativa41.setAlternativasA("Controladores de entrada e saída geram interrupções de forma síncrona à execução do processador, para que nenhuma instrução fique incompleta devido à ocorrência da interrupção.");
        questaoAlternativa41.setAlternativasB("Quando uma interrupção ocorre, o próprio processador salva todo o seu contexto atual, tais como registradores de dados e endereço e códigos de condição, para que esse mesmo contexto possa ser restaurado pela rotina de atendimento da interrupção.");
        questaoAlternativa41.setAlternativasC("O processador pode auto-interromper-se para tratar exceções de execução, tais como um erro em uma operação aritmética, uma tentativa de execução de instrução ilegal ou uma falha de página em memória virtual.");
        questaoAlternativa41.setAlternativasD("Rotinas de tratamento de interrupção devem ser executadas com o mecanismo de interrupção inibido, pois esse tipo de rotina não permite aninhamento.");
        questaoAlternativa41.setAlternativasE("O uso de interrupção para realizar entrada ou saída de dados somente é eficiente quando o periférico trata grandes quantidades de dados, como é o caso de discos\n" +
                "magnéticos e discos ópticos. Para periféricos com pouco volume de dados, como teclados e mouses, o uso de interrupção é ineficiente.");
        questaoAlternativa41.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa42 = new QuestaoAlternativa();
        questaoAlternativa42.setId(INICIOQUESTAO.longValue());
        questaoAlternativa42.setAno(ANO);
        questaoAlternativa42.setDescricao("Duas possibilidades para a construção de sistemas com múltiplos processadores são: processadores idênticos com um único espaço de endereçamento interligados por um barramento único (SMP); e máquinas monoprocessadas conectadas por uma rede (cluster). Com\n" +
                "relação a esses sistemas, assinale a opção correta.");
        questaoAlternativa42.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa42.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa42.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa42.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa42.setAlternativaCorreta("e");

        questaoAlternativa42.setAlternativasA("A comunicação entre processadores de um cluster é, potencialmente, muito mais rápida que a comunicação entre processadores de um sistema SMP, pois redes atuais possuem taxa de transmissão da ordem de gigabits/s, enquanto as melhores memórias operam somente com freqüências da ordem de centenas de megahertz.\n");
        questaoAlternativa42.setAlternativasB("Comunicação entre processos pode ser implementada de forma muito mais eficiente em um cluster que em um sistema SMP, pois, nesse último, todos os processos precisam compartilhar os mesmos dispositivos de entrada e saída.");
        questaoAlternativa42.setAlternativasC("Em um sistema SMP, é mais simples substituir um processador defeituoso, pois, em um cluster, toda a rede de comunicação deve ser desabilitada para que a troca seja efetuada sem\n" +
                "prejudicar a troca de mensagens entre os processos.");
        questaoAlternativa42.setAlternativasD("Alocação de memória para processos é muito mais simples em um cluster, pois cada  processador executa um único processo na\n" +
                "sua memória exclusiva e, dessa forma, não existe o problema de distribuição de processos no espaço de endereçamento único da\n" +
                "máquina SMP.");
        questaoAlternativa42.setAlternativasE("Em um cluster, o custo da escalabilidade é muito menor, pois, para a interconexão entre as máquinas, podem ser utilizados equipamentos comuns usados em uma rede local de computadores, ao passo que um sistema SMP exige conexões extras no barramento e gabinetes especiais.");
        questaoAlternativa42.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa43 = new QuestaoAlternativa();
        questaoAlternativa43.setId(INICIOQUESTAO.longValue());
        questaoAlternativa43.setAno(ANO);
        questaoAlternativa43.setDescricao("No processo de pesquisa binária em um vetor ordenado, os números máximos de comparações necessárias para se determinar se um elemento faz parte de vetores com tamanhos 50, 1.000 e 300 são, respectivamente, iguais a");
        questaoAlternativa43.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa43.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa43.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa43.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa43.setAlternativaCorreta("b");

        questaoAlternativa43.setAlternativasA("5, 100 e 30.");
        questaoAlternativa43.setAlternativasB("6, 10 e 9.");
        questaoAlternativa43.setAlternativasC("8, 31 e 18.");
        questaoAlternativa43.setAlternativasD("10, 100 e 30.");
        questaoAlternativa43.setAlternativasE("25, 500 e 150.");
        questaoAlternativa43.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa44 = new QuestaoAlternativa();
        questaoAlternativa44.setId(INICIOQUESTAO.longValue());
        questaoAlternativa44.setAno(ANO);
        questaoAlternativa44.setDescricao("Deseja-se supervisionar as redes de comunicação de dados de um conjunto de empresas. Cada empresa tem a sua própria rede, que é independente das redes das outras empresas e é constituída de ramos de fibra óptica. Cada ramo conecta duas filiais distintas (ponto-aponto) da empresa. Há, no máximo, um ramo de fibra interligando diretamente um mesmo par de filiais.\n" +
                "A comunicação entre duas filiais pode ser feita diretamente por um ramo de fibra que as interliga, se este existir, ou, indiretamente, por meio de uma seqüência de ramos e filiais. A rede de cada empresa permite a comunicação entre todas as suas filiais.\n" +
                "A tabela abaixo apresenta algumas informações acerca das redes dessas empresas.\n" +
                "$\\newline$Com relação à situação apresentada abaixo, é correto deduzir que,\n" +
                "$\\newline$I no caso da empresa E1, a falha de um ramo de rede certamente fará que, ao menos, uma filial não possa mais comunicar-se diretamente com todas as outras filiais da empresa.\n" +
                "$\\newline$II na rede da empresa E2, a introdução de um novo ramo de rede certamente violará a informação de que há somente um par de fibras entre duas filiais.\n" +
                "$\\newline$III no caso da empresa E3, a falha de um único ramo de rede certamente fará que, ao menos, uma filial não possa mais comunicar-se, direta ou indiretamente, com todas as outras filiais da empresa.\n" +
                "$\\newline$IV na rede da empresa E4, todas as filiais da empresa comunicam-se entre si diretamente.\n" +
                "$\\newline$Estão certos apenas os itens");
        questaoAlternativa44.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa44.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa44.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa44.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa44.setAlternativaCorreta("c");
        questaoAlternativa44.setImagem(true);
        questaoAlternativa44.setAlternativasA("I e II.");
        questaoAlternativa44.setAlternativasB("I e IV.");
        questaoAlternativa44.setAlternativasC("II e III.");
        questaoAlternativa44.setAlternativasD("II e IV.");
        questaoAlternativa44.setAlternativasE("III e IV.");
        questaoAlternativa44.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa44.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------


        QuestaoAlternativa questaoAlternativa45 = new QuestaoAlternativa();
        questaoAlternativa45.setId(INICIOQUESTAO.longValue());
        questaoAlternativa45.setAno(ANO);
        questaoAlternativa45.setDescricao("Requisitos de um sistema são freqüentemente classificados como funcionais, não-funcionais e de domínio. Qual a definição que melhor descreve requisitos não-funcionais?");
        questaoAlternativa45.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa45.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa45.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa45.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa45.setAlternativaCorreta("d");

        questaoAlternativa45.setAlternativasA("São ferramentas automatizadas de apoio ao processo de\n" +
                "desenvolvimento de sistemas");
        questaoAlternativa45.setAlternativasB("São requisitos que descrevem o que o sistema deve fazer, como deve reagir a determinadas entradas e como deve comportar-se em situações particulares");
        questaoAlternativa45.setAlternativasC("São requisitos que derivam do domínio da aplicação e que refletem características e restrições desse domínio.");
        questaoAlternativa45.setAlternativasD("São requisitos que não estão diretamente relacionados com as\n" +
                "funções específicas do sistema.");
        questaoAlternativa45.setAlternativasE("São requisitos que especificam como deve ser testada uma parte\n" +
                "do sistema, incluindo-se as entradas, os resultados esperados e as\n" +
                "condições sob as quais os testes devem ocorrer.");
        questaoAlternativa45.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa46 = new QuestaoAlternativa();
        questaoAlternativa46.setId(INICIOQUESTAO.longValue());
        questaoAlternativa46.setAno(ANO);
        questaoAlternativa46.setDescricao("O Processo Unificado (RUP – rational unified process) é um moderno processo de desenvolvimento de software constituído de quatro fases. Assinale a opção que apresenta as quatro fases do RUP, na ordem em que elas devem ser executadas.");
        questaoAlternativa46.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa46.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa46.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa46.setDisciplina(EDisciplina.GERENCIA_DE_PROJETOS);
        questaoAlternativa46.setAlternativaCorreta("e");

        questaoAlternativa46.setAlternativasA("concepção, elaboração, construção, teste");
        questaoAlternativa46.setAlternativasB("elaboração, transição, concepção, construção");
        questaoAlternativa46.setAlternativasC("elaboração, concepção, teste, transição\n");
        questaoAlternativa46.setAlternativasD("elaboração, concepção, transição, construção");
        questaoAlternativa46.setAlternativasE("concepção, elaboração, construção, transição");
        questaoAlternativa46.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa47 = new QuestaoAlternativa();
        questaoAlternativa47.setId(INICIOQUESTAO.longValue());
        questaoAlternativa47.setAno(ANO);
        questaoAlternativa47.setDescricao("Um estudo recente realizado pela Associação Brasileira das Empresas de Software (ABES) e a Business Software Alliance\n" +
                "(BSA) mostra uma redução na pirataria de software no mundo e no Brasil, de 1994 a 2002. Com relação a esse assunto, julgue os itens a seguir.\n" +
                "$\\newline$I A redução da pirataria de software no contexto brasileiro traz benefícios para a criação de empregos, aumento da arrecadação\n" +
                "de impostos e aumento no faturamento da economia.\n" +
                "$\\newline$II A reprodução de software original ou autorizado para fins de segurança ou backup é também considerada pirataria de software.\n" +
                "$\\newline$III As iniciativas antipirataria devem incluir ações de conscientização, educação e atuação direta sobre os\n" +
                "contraventores.\n" +
                "$\\newline$IV A pirataria de software é uma atividade criminosa, contudo não há no Brasil, ainda, legislação específica que regulamente essa questão.\n" +
                "$\\newline$Estão certos apenas os itens");
        questaoAlternativa47.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa47.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa47.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa47.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa47.setAlternativaCorreta("b");

        questaoAlternativa47.setAlternativasA("I e II.");
        questaoAlternativa47.setAlternativasB("I e III.");
        questaoAlternativa47.setAlternativasC("II e III.");
        questaoAlternativa47.setAlternativasD("II e IV.");
        questaoAlternativa47.setAlternativasE("III e IV.");
        questaoAlternativa47.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa48 = new QuestaoAlternativa();
        questaoAlternativa48.setId(INICIOQUESTAO.longValue());
        questaoAlternativa48.setAno(ANO);
        questaoAlternativa48.setDescricao("Considerando o diagrama de Hasse apresentado abaixo, assinale a opção que apresenta uma lista ordenada, da esquerda para a direita, que preserva a ordem do diagrama.");
        questaoAlternativa48.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa48.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa48.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa48.setDisciplina(EDisciplina.GRAFOS);
        questaoAlternativa48.setAlternativaCorreta("a");
        questaoAlternativa48.setImagem(true);
        questaoAlternativa48.setAlternativasA("Marcos, José Roberto, Emerson, Ronaldo, Adriano");
        questaoAlternativa48.setAlternativasB("Emerson, Marcos, Ronaldo, Adriano, José Roberto");
        questaoAlternativa48.setAlternativasC("Adriano, Ronaldo, José Roberto, Marcos, Emerson");
        questaoAlternativa48.setAlternativasD("Ronaldo, Marcos, Emerson, Adriano, José Roberto");
        questaoAlternativa48.setAlternativasE("Marcos, Adriano, Emerson, José Roberto, Ronaldo");
        questaoAlternativa48.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa48.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa49 = new QuestaoAlternativa();
        questaoAlternativa49.setId(INICIOQUESTAO.longValue());
        questaoAlternativa49.setAno(ANO);
        questaoAlternativa49.setDescricao("Para o desenvolvimento de um projeto, determinada organização precisa definir dois grupos de trabalho, um com três membros e outro com quatro\n" +
                "membros. Para o grupo de três elementos, o primeiro indivíduo nomeado será o presidente, o segundo, o relator, e o terceiro será o auxiliar, enquanto que, para\n" +
                "o de quatro elementos, a ordem de nomeação não é relevante. Essa organização conta com um quadro de quatorze funcionários, todos igualmente aptos a compor\n" +
                "qualquer um dos grupos de trabalho, em qualquer função, sendo que cada um deles integrará, no máximo, um desses grupos.\n" +
                "Nessa situação, representando por C(m, p) a combinação de m elementos p a p e por A(m, p) o arranjo de m elementos p a p, conclui-se que a quantidade de maneiras distintas que a organização citada dispõe para compor os seus dois grupos de trabalho é igual a ");
        questaoAlternativa49.setArea(EArea.MATEMATICA);
        questaoAlternativa49.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa49.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa49.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa49.setAlternativaCorreta("c");

        questaoAlternativa49.setAlternativasA("$A(14,4) \\times A(14,3).$");
        questaoAlternativa49.setAlternativasB("$A(14,4) \\times C(14,3).$");
        questaoAlternativa49.setAlternativasC("$C(14,4) \\times A(10,3).$");
        questaoAlternativa49.setAlternativasD("$C(10,3) \\times A(14,4).$");
        questaoAlternativa49.setAlternativasE("$C(14,4) \\times C(10,3).$");
        questaoAlternativa49.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa50 = new QuestaoAlternativa();
        questaoAlternativa50.setId(INICIOQUESTAO.longValue());
        questaoAlternativa50.setAno(ANO);
        questaoAlternativa50.setDescricao("Acerca de paradigmas de linguagens de programação, julgue os itens a seguir.\n" +
                "$\\newline$I Linguagens procedurais facilitam a legibilidade e a documentação do software.\n" +
                "$\\newline$II Linguagens declarativas facilitam o desenvolvimento de sistemas de apoio à decisão.\n" +
                "$\\newline$III Linguagens funcionais facilitam a definição de requisitos e a decomposição funcional.\n" +
                "$\\newline$IV Linguagens estruturadas promovem o forte acoplamento entre dados e funções.\n" +
                "$\\newline$V Linguagens orientadas a objeto permitem reduzir custos de desenvolvimento e manutenção.\n" +
                "$\\newline$Estão certos apenas os itens");
        questaoAlternativa50.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa50.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa50.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa50.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa50.setAlternativaCorreta("d");

        questaoAlternativa50.setAlternativasA("I e II.");
        questaoAlternativa50.setAlternativasB("I e IV.");
        questaoAlternativa50.setAlternativasC("II e III.");
        questaoAlternativa50.setAlternativasD("III e V.");
        questaoAlternativa50.setAlternativasE("IV e V.");
        questaoAlternativa50.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa51 = new QuestaoAlternativa();
        questaoAlternativa51.setId(INICIOQUESTAO.longValue());
        questaoAlternativa51.setAno(ANO);
        questaoAlternativa51.setDescricao("No famoso jogo da Torre de Hanoi, é dada uma torre com discos de raios diferentes, empilhados por tamanho decrescente em um dos três pinos dados, como ilustra a figura acima. O objetivo do jogo é transportar-se toda a torre para um dos outros pinos, de acordo com as seguintes regras: apenas um disco pode ser deslocado por vez, e, em todo instante, todos os discos precisam estar em um dos três pinos; além disso, em nenhum momento, um disco pode ser colocado\n" +
                "sobre um disco de raio menor que o dele; é claro que o terceiro pino pode ser usado como local temporário para os discos.\n" +
                "Imaginando que se tenha uma situação em que a torre inicial tenha um conjunto de 5 discos, qual o número mínimo de movimentações de discos que deverão ser realizadas para se atingir o objetivo do jogo?");
        questaoAlternativa51.setArea(EArea.MATEMATICA);
        questaoAlternativa51.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa51.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa51.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa51.setAlternativaCorreta("c");
        questaoAlternativa51.setImagem(true);
        questaoAlternativa51.setAlternativasA("");
        questaoAlternativa51.setAlternativasB("");
        questaoAlternativa51.setAlternativasC("");
        questaoAlternativa51.setAlternativasD("");
        questaoAlternativa51.setAlternativasE("");
        questaoAlternativa51.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa51.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa52 = new QuestaoAlternativa();
        questaoAlternativa52.setId(INICIOQUESTAO.longValue());
        questaoAlternativa52.setAno(ANO);
        questaoAlternativa52.setDescricao("O método de alocação de espaço de disco utilizado para armazenamento de informações em um sistema de arquivos determina o desempenho desse sistema. Com relação a esse assunto, julgue os itens seguintes.\n" +
                "$\\newline$I A alocação contígua é um método adequado para sistemas em que inserções e remoções de arquivos são freqüentes.\n" +
                "$\\newline$II Na alocação indexada, o tamanho máximo de um arquivo depende do número de bits utilizados para representar um índice e do tamanho dos blocos de índices.\n" +
                "$\\newline$III Na alocação encadeada, o tamanho máximo de um arquivo depende do tamanho dos blocos de dados.\n" +
                "$\\newline$Assinale a opção correta");
        questaoAlternativa52.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa52.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa52.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa52.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa52.setAlternativaCorreta("a");

        questaoAlternativa52.setAlternativasA("Apenas um item está certo.\n");
        questaoAlternativa52.setAlternativasB("Apenas os itens I e II estão certos.");
        questaoAlternativa52.setAlternativasC("Apenas os itens I e III estão certos.");
        questaoAlternativa52.setAlternativasD("Apenas os itens II e III estão certos.\n");
        questaoAlternativa52.setAlternativasE("Todos os itens estão certos.");
        questaoAlternativa52.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa53 = new QuestaoAlternativa();
        questaoAlternativa53.setId(INICIOQUESTAO.longValue());
        questaoAlternativa53.setAno(ANO);
        questaoAlternativa53.setDescricao("O problema do buffer limitado de tamanho N é um problema clássico de sincronização de processos: um grupo de processos utiliza um buffer de tamanho N para armazenar temporariamente itens produzidos; processos produtores produzem os itens, um a um, e os armazenam no buffer; processos consumidores retiram os itens do buffer, um a um, para processamento. O problema do buffer limitado de tamanho N pode ser resolvido com a utilização de semáforos, que são mecanismos de software para controle de concorrência entre processos. Duas operações são definidas para um semáforo s: wait(s) e signal(s).\n" +
                "Considere o problema do buffer limitado de tamanho N cujos pseudocódigos dos processos produtor e consumidor estão mostrados na tabela abaixo. Pode-se resolver esse problema com a utilização dos semáforos mutex, cheio e vazio, inicializados, respectivamente, com 1, 0 e N.\n" +
                "A partir dessas informações, para que o problema do buffer limitado de tamanho N cujos pseudocódigos foram apresentados possa ser resolvido a partir do uso dos semáforos mutex, cheio e vazio, é necessário que comando_a, comando_b, comando_c, comando_d, comando_e, comando_f, comando_g e comando_h correspondam, respectivamente, às operações");
        questaoAlternativa53.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa53.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa53.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa53.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa53.setAlternativaCorreta("a");
        questaoAlternativa53.setImagem(true);
        questaoAlternativa53.setAlternativasA("wait(vazio), wait(mutex), signal(mutex), signal(cheio), wait(cheio), wait(mutex), signal(mutex) e signal(vazio).");
        questaoAlternativa53.setAlternativasB("wait(cheio), wait(mutex), signal(mutex),\n" +
                "signal(vazio), wait(vazio), signal(mutex),\n" +
                "signal(mutex) e wait(cheio).\n");
        questaoAlternativa53.setAlternativasC("wait(mutex), wait(vazio), signal(cheio),\n" +
                "signal(mutex), wait(mutex), wait(vazio),\n" +
                "signal(cheio) e signal(mutex).");
        questaoAlternativa53.setAlternativasD("wait(mutex), wait(vazio), signal(cheio),\n" +
                "signal(mutex), wait(mutex), wait(cheio),\n" +
                "signal(vazio) e signal(mutex).");
        questaoAlternativa53.setAlternativasE("wait(vazio), signal(mutex), signal(cheio),\n" +
                "wait(mutex), wait(cheio), signal(mutex),\n" +
                "signal(vazio) e signal(mutex).");
        questaoAlternativa53.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa53.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa54 = new QuestaoAlternativa();
        questaoAlternativa54.setId(INICIOQUESTAO.longValue());
        questaoAlternativa54.setAno(ANO);
        questaoAlternativa54.setDescricao("Considere que, durante a análise de um problema de programação, tenha sido obtida a seguinte fórmula recursiva que descreve a solução para o problema.\n" +
                "$\\newline$ $C(i,j) = \\begin{cases} 0 & se\\,\\,\\,i = 0 \\,\\, ou \\,\\, j=0\\\\ 1 +C(i-1,j-1) & se\\,\\,\\,0<i\\leq M,0<j\\leq N\\,\\,e\\,\\,i=j \\\\ max\\left\\{ C(i,j-1),C(i-1,j)\\right\\} & se\\,\\,\\,0<i\\leq M,0<j\\leq N\\,\\,e\\,\\,i\\neq j \\end{cases}$ $\\newline$ Qual a complexidade da solução encontrada?");
        questaoAlternativa54.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa54.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa54.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa54.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa54.setAlternativaCorreta("b");

        questaoAlternativa54.setAlternativasA("$O(n \\times log\\,\\,n)$");
        questaoAlternativa54.setAlternativasB("$O(n^{2})$");
        questaoAlternativa54.setAlternativasC("$O(n^{2} \\times log\\,\\,n)$");
        questaoAlternativa54.setAlternativasD("$O(2^{n})$");
        questaoAlternativa54.setAlternativasE("$O(n^{3})$");
        questaoAlternativa54.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoDiscusiva questaoDiscusiva55 = new QuestaoDiscusiva();
        questaoDiscusiva55.setId(INICIOQUESTAO.longValue());
        questaoDiscusiva55.setAno(ANO);
        questaoDiscusiva55.setDescricao("O grande desejo de todos os desenvolvedores de programas é utilizar quantidades ilimitadas de memória que, por sua vez, seja extremamente rápida. Infelizmente, isso não corresponde à realidade, como tenta representar a figura abaixo, que descreve uma hierarquia de memória: para cada elemento, estão indicados os tamanhos típicos disponíveis para armazenamento de informação e o tempo típico de acesso à informação armazenada." +
                "Como pode ser visto no diagrama abaixo, registradores do processador e memória cache operam com tempos distintos, o mesmo ocorrendo com a memória principal com relação à memória cache, e com a memória secundária com relação à memória principal.\n" +
                "Considerando as informações acima apresentadas, responda às seguintes perguntas.\n" +
                "a) Que características um programa deve ter para que o uso de memória cache seja muito vantajoso?\n" +
                "b) Se registradores do processador e a memória cache operassem com os mesmos tempos de acesso, ainda haveria vantagem em se utilizar a memória cache? E se a memória cache e a memória principal operassem com os mesmos tempos de acesso, ainda haveria vantagem em se utilizar a memória cache? Justifique suas respostas.");
        questaoDiscusiva55.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoDiscusiva55.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoDiscusiva55.setProva(ETipoQuestaoProva.ENADE);
        questaoDiscusiva55.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoDiscusiva55.setResposta("a) O programa deve ter trechos pequenos que sejam executados várias vezes, e os dados devem estar\n" +
                "localizados próximos uns dos outros OU dados e instruções devem ter localidade espacial (próximos\n" +
                "uns dos outros) e localidade temporal (serem usados várias vezes em um certo instante de tempo).\n" +
                "b) Se cache e processador operassem com os mesmos tempos, ainda assim seria vantajoso utilizar\n" +
                "cache, porque o seu objetivo é justamente fornecer dados e instruções na velocidade do processador,\n" +
                "\n" +
                "simulando uma memória principal rápida. Se cache e memória operassem com os mesmos tempos, não\n" +
                "haveria mais razão para se usar o cache, quer estivessem no cache ou na memória principal.\n" +
                "Muitas são as formas de respostas diferentes que indicariam que os estudantes compreenderam a\n" +
                "questão e a responderam de forma adequada.\n" +
                "No item ‘a’ era necessário que o estudante demonstrasse a compreensão de que o cache é um\n" +
                "hardware de armazenamento de dados menor do que a memória principal. Assim sendo, para tornar o uso\n" +
                "do cache mais vantajoso, é conveniente que os dados e instruções mais utilizados fiquem sempre no cache,\n" +
                "evitando acessos à memória principal, que tem velocidade de acesso mais lenta, embora seja maior.\n" +
                "Partindo dessas informações, existem várias formas de indicar este tipo de comportamento.\n" +
                "Nesse item, foram atribuídos três níveis de pontuação (0, 1 e 2). A pontuação 0 corresponde aos\n" +
                "casos em que houve fuga total ao tema. Também obtiveram pontuação 0 no item aqueles estudantes que\n" +
                "demonstraram claramente não terem entendido o que foi solicitado ou que deram respostas totalmente\n" +
                "erradas.\n" +
                "A pontuação 1 foi atribuída aos estudantes que responderam apenas um dos quesitos para a\n" +
                "utilização vantajosa do cache, ou seja, os que responderam apenas localidade temporal ou apenas\n" +
                "localidade espacial ou outra resposta que tenha evidenciado apenas um destes conceitos.\n" +
                "A pontuação máxima foi atribuída aos estudantes que responderam dois ou mais conceitos que\n" +
                "evidenciaram os princípios de localidade temporal e espacial.\n" +
                "No item b, houve a divisão em dois subitens pontuados separadamente:\n" +
                "(i) o subitem b1 avalia o conhecimento acerca da vantagem e da desvantagem do cache em relação ao\n" +
                "processador. Os registradores do processador são de acesso mais rápido do que as informações no cache,\n" +
                "mas podem armazenar poucos dados. Assim, mesmo com a mesma velocidade de acesso, existe a\n" +
                "vantagem do espaço de armazenamento extra. O estudante deveria mostrar de alguma forma o\n" +
                "entendimento deste conceito. Nesse subitem, existem três níveis de pontuação (0, 1 e 2), distribuídos da\n" +
                "seguinte forma: a pontuação 0 corresponde aos estudantes que não apresentaram nenhuma evidência de\n" +
                "domínio de quaisquer dos conteúdos avaliados; a pontuação 1 foi atribuída aos estudantes que\n" +
                "demonstraram claramente que entenderam a vantagem da utilização da memória cache e foi concedida\n" +
                "pontuação 2 àqueles que apresentaram a vantagem do uso de espaço de armazenamento do cache com\n" +
                "justificativa adequada, relacionando as características de tamanho e tempo de acesso.\n" +
                "(ii) o subitem b2 avalia se o estudante compreende a principal vantagem da memória cache e os seus\n" +
                "mecanismos de velocidade de acesso. Se esta é igual à da memória principal, o cache torna-se\n" +
                "desnecessário, pois é, em geral, muito menor do que a memória principal. Nesse subitem foram\n" +
                "contemplados três níveis de pontuação (0, 1 e 2), assim distribuídos: a pontuação 0 corresponde aos\n" +
                "estudantes que não apresentaram evidência de domínio dos conteúdos avaliados neste subitem; a\n" +
                "pontuação 1 foi concedida àqueles que apresentaram evidências de compreensão da principal utilidade do\n" +
                "cache e de seus mecanismos de tempo de acesso e a foi atribuída a pontuação máxima aos que\n" +
                "demonstraram o reconhecimento da vantagem do tempo de acesso da memória cache e foram capazes de\n" +
                "relacionar justificativas adequadas na resolução deste subitem.\n" +
                "O critério de pontuação para os subitens b1 e b2 foi modificado em relação àquele originalmente\n" +
                "estabelecido. O total de pontos foi modificado de 3 para 2, embora o valor total dos subitens tenha\n" +
                "continuado o mesmo. Essa mudança foi necessária para tornar o critério de correção mais justo, de forma a\n" +
                "diminuir a possibilidade de interpretações destoantes entre os membros da banca.");
        questaoDiscusiva55.setImagem(true);
        questaoDiscusiva55.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoDiscusiva55.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa56 = new QuestaoAlternativa();
        questaoAlternativa56.setId(INICIOQUESTAO.longValue());
        questaoAlternativa56.setAno(ANO);
        questaoAlternativa56.setDescricao("Considere um sistema bancário simplificado e uma transação T1, que, por meio das 6 operações apresentadas na tabela abaixo, transfere R$ 100,00 da conta X para a conta Y. A partir dessas informações, julgue os itens que se seguem." +
                "$\\newline$I Se, durante a execução de T1, ocorrer uma falha depois da operação 3 e antes da operação 6, e o sistema de banco de dados restabelecer o valor original de X, estará garantida a atomicidade de T1.\n" +
                "$\\newline$II Se ocorrer uma falha de sistema após a transação T1 ser completada com sucesso, mas, ao ser reiniciado o sistema, o usuário que a tiver disparado for notificado da transferência de fundos e o sistema de banco de dados reconstruir as atualizações feitas pela transação, estará garantida a durabilidade de T1.\n" +
                "$\\newline$III Se outra transação, T2, que estiver sendo executada simultaneamente a T1, tentar executar a operação escrita(Y) depois de T1 ter executado a operação 4 e ainda não ter executado a operação 6, e o sistema de banco de dados impedir essa escrita, estará garantida a consistência de T1.\n" +
                "$\\newline$Assinale a opção correta.\n");
        questaoAlternativa56.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa56.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa56.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa56.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa56.setAlternativaCorreta("b");
        questaoAlternativa56.setImagem(true);
        questaoAlternativa56.setAlternativasA("Apenas um item está certo.\n");
        questaoAlternativa56.setAlternativasB("Apenas os itens I e II estão certos.\n");
        questaoAlternativa56.setAlternativasC("Apenas os itens I e III estão certos.");
        questaoAlternativa56.setAlternativasD("Apenas os itens II e III estão certos.\n");
        questaoAlternativa56.setAlternativasE("Todos os itens estão certos.\n");
        questaoAlternativa56.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa56.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa57 = new QuestaoAlternativa();
        questaoAlternativa57.setId(INICIOQUESTAO.longValue());
        questaoAlternativa57.setAno(ANO);
        questaoAlternativa57.setDescricao("A escolha de uma boa representação de conhecimento é tarefa fundamental na resolução de problemas que envolvem inteligência artificial. Acerca desse assunto, assinale a opção correta.\n");
        questaoAlternativa57.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa57.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa57.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa57.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa57.setAlternativaCorreta("b");

        questaoAlternativa57.setAlternativasA("O encadeamento regressivo, por utilizar busca em largura para resolução de conflitos, é menos usado que o progressivo.");
        questaoAlternativa57.setAlternativasB("O encadeamento progressivo utiliza busca gulosa para fazer a comparação entre os fatos armazenados na memória de trabalho do sistema e os antecedentes das regras a disparar.");
        questaoAlternativa57.setAlternativasC("As redes semânticas, mecanismo mais expressivo que a lógica de primeira ordem, foram desenvolvidas para se superar uma dificuldade dos sistemas embasados em lógica\n" +
                "de representar categorias.");
        questaoAlternativa57.setAlternativasD("A representação de conhecimento frames é uma boa\n" +
                "alternativa para esse tipo de problema, por incluir, além de\n" +
                "um mecanismo de inferência semanticamente bem definido,\n" +
                "mecanismos de encapsulamento e componentes, comuns ao\n" +
                "paradigma orientado a objeto.");
        questaoAlternativa57.setAlternativasE("Tanto redes semânticas quanto frames representam\n" +
                "facilmente conhecimento estrutural, comportamental e\n" +
                "procedural.");
        questaoAlternativa57.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa58 = new QuestaoAlternativa();
        questaoAlternativa58.setId(INICIOQUESTAO.longValue());
        questaoAlternativa58.setAno(ANO);
        questaoAlternativa58.setDescricao("Uma forma de analisar e comparar o desempenho de algoritmos de busca heurística é utilizar um problema bem conhecido como referência. Um exemplo desse tipo de problema é o cálculo de rotas entre diferentes cidades. No grafo ilustrado abaixo, cada nó representa uma cidade distinta, e cada ramo, uma rodovia que interliga as cidades representadas pelos nós que ele une, cujo peso indica a distância, em km, entre essas cidades pela rodovia.\n" +
                "$\\newline$Suponha que se deseje encontrar a melhor rota entre as cidades A e M, indicadas nesse grafo. Considere, ainda, os valores indicados na tabela abaixo como distância em linha reta, em km, de cada cidade para a cidade M.\n" +
                "$\\newline$A partir dessas informações, julgue os itens seguintes, relativos a algoritmos de busca.\n" +
                "$\\newline$I Utilizando-se o algoritmo A*, a rota ente A e M encontrada no problema acima é ACDFLM e o custo do caminho é 56,18.\n" +
                "$\\newline$II Utilizando-se a busca gulosa, a rota encontrada no problema acima é ACDFLM.\n" +
                "$\\newline$III Para utilizar algoritmos de busca heurística, deve-se definir uma heurística que superestime o custo da solução.\n" +
                "$\\newline$IV O A* é um algoritmo ótimo e completo quando heurísticas admissíveis são utilizadas.\n" +
                "$\\newline$V No simulated annealing, é possível haver movimentos para um estado com avaliação pior do que a do estado corrente, dependendo da temperatura do processo e da probabilidade de escolha.\n" +
                "$\\newline$Estão certos apenas os itens ");
        questaoAlternativa58.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa58.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa58.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa58.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa58.setAlternativaCorreta("b");
        questaoAlternativa58.setImagem(true);
        questaoAlternativa58.setAlternativasA("I, II e III.");
        questaoAlternativa58.setAlternativasB("I, IV e V.");
        questaoAlternativa58.setAlternativasC("I, III, e V.");
        questaoAlternativa58.setAlternativasD("II, III, e IV.");
        questaoAlternativa58.setAlternativasE("II, IV e V.");
        //WARNING essa questão possui duas imagens, acredito que temos que unir as duas em uam só
        questaoAlternativa58.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa58.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa59 = new QuestaoAlternativa();
        questaoAlternativa59.setId(INICIOQUESTAO.longValue());
        questaoAlternativa59.setAno(ANO);
        questaoAlternativa59.setDescricao("Considere o seguinte esquema relacional para o banco de dados de um grande banco com cobertura nacional.\n" +
                "$\\newline$AGENCIAS($\\underline{NOME\\_AGENCIA}$, CIDADE_AGENCIA, FUNDOS);\n" +
                "$\\newline$CONTAS(NOME_AGENCIA, $\\underline{NUMERO\\_CONTA}$, SALDO) NOME_AGENCIA REFERENCIA AGENCIAS;\n" +
                "$\\newline$CLIENTES($\\underline{NOME\\_CLIENTE}$, CIDADE_NASCIMENTO, NUMERO_CONTA) NUMERO_CONTA REFERENCIA CONTAS;\n" +
                "$\\newline$Considere, ainda, que os atributos sublinhados correspondam às chaves primárias das respectivas relações e, após as definições das relações CONTAS e CLIENTES, sejam descritas as regras de integridade referenciais. Suponha que o banco de dados armazene informações de 500 agências, de 1.000.000 de contas e de 1.500.000 clientes, sendo que 200.000 contas são de agências da cidade de São Paulo e 100.000 clientes nasceram em Recife. Considere, finalmente, que esse sistema de banco de dados tenha um otimizador de consultas embasado em heurísticas e que se precise realizar a seguinte consulta.\n" +
                "$\\newline$SELECT *\n" +
                "FROM AGENCIAS, CONTAS, CLIENTES\n" +
                "$\\newline$WHERE CONTAS.NOME_AGENCIA = AGENCIAS.NOME_AGENCIA\n" +
                "$\\newline$ AND CLIENTES.NUMERO_CONTA = CONTAS.NUMERO_CONTA\n" +
                "$\\newline$ AND CIDADE_AGENCIA = ‘SAO PAULO’\n" +
                "$\\newline$ AND CIDADE_NASCIMENTO = ‘RECIFE’\n" +
                "$\\newline$ AND SALDO > 1000;\n" +
                "$\\newline$A partir dessas informações e considerando $| \\times |$ o operador de junção natural e $\\sigma$ o operador de seleção, assinale a opção que apresenta o melhor plano de avaliação de consultas para a consulta apresentada acima.");
        questaoAlternativa59.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa59.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa59.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa59.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa59.setAlternativaCorreta("c");
        questaoAlternativa59.setAlternativaImagem(true);
        questaoAlternativa59.setAlternativasA("COLOCAR IMAGEM ALTERNATIVA");
        questaoAlternativa59.setAlternativasB("COLOCAR IMAGEM ALTERNATIVA");
        questaoAlternativa59.setAlternativasC("COLOCAR IMAGEM ALTERNATIVA");
        questaoAlternativa59.setAlternativasD("COLOCAR IMAGEM ALTERNATIVA");
        questaoAlternativa59.setAlternativasE("COLOCAR IMAGEM ALTERNATIVA");
        questaoAlternativa59.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa60 = new QuestaoAlternativa();
        questaoAlternativa60.setId(INICIOQUESTAO.longValue());
        questaoAlternativa60.setAno(ANO);
        questaoAlternativa60.setDescricao("Considere o circuito combinacional ilustrado abaixo, que apresenta a, b e c como sinais de entrada e s como sinal de saída. A equação booleana mínima que descreve a função desse circuito é igual a");
        questaoAlternativa60.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa60.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa60.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa60.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
        questaoAlternativa60.setAlternativaCorreta("a");
        questaoAlternativa60.setImagem(true);
        questaoAlternativa60.setAlternativasA("s = a or not(b) or c.\n");
        questaoAlternativa60.setAlternativasB("s = a and not(b) and c.\n");
        questaoAlternativa60.setAlternativasC("s = not(a) or b or not(c).");
        questaoAlternativa60.setAlternativasD("s = not(a) and b and not(c).");
        questaoAlternativa60.setAlternativasE("s = (not(a) and b) or c.\n");
        questaoAlternativa60.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa60.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa61 = new QuestaoAlternativa();
        questaoAlternativa61.setId(INICIOQUESTAO.longValue());
        questaoAlternativa61.setAno(ANO);
        questaoAlternativa61.setDescricao("Considere o volume de visualização e os objetos identificados como 1, 2 e 3 na figura abaixo. Considere, ainda, que todos os objetos têm o mesmo tamanho, que o objeto 1 está localizado fora do volume de visualização e que os objetos 2 e 3 estão dentro dele. A partir desses dados, no que concerne à execução do pipeline de visualização na situação acima representada, é correto inferir que\n" +
                "$\\newline$I o objeto 1 está na linha de visão do observador, mas não aparece na imagem final.\n" +
                "$\\newline$II é suficiente, para a determinação das faces visíveis, realizar o recorte contra o volume canônico.\n" +
                "$\\newline$III a remoção de faces traseiras (back face culling) utiliza informação de posição e orientação do observador.\n" +
                "$\\newline$IV o processo de visualização garante que os objetos 2 e 3 sejam totalmente visíveis na imagem final.\n" +
                "$\\newline$Estão certos apenas os itens");
        questaoAlternativa61.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa61.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa61.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa61.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa61.setAlternativaCorreta("b");
        questaoAlternativa61.setImagem(true);
        questaoAlternativa61.setAlternativasA("I e II.");
        questaoAlternativa61.setAlternativasB("I e III.\n");
        questaoAlternativa61.setAlternativasC("II e III.\n");
        questaoAlternativa61.setAlternativasD("III e IV.");
        questaoAlternativa61.setAlternativasE("III e IV.");
        questaoAlternativa61.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa61.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa62 = new QuestaoAlternativa();
        questaoAlternativa62.setId(INICIOQUESTAO.longValue());
        questaoAlternativa62.setAno(ANO);
        questaoAlternativa62.setDescricao("Considere que um colega seu tenha ganhado uma máquina fotográfica digital e tenha tirado a foto identificada por I abaixo. Na sequência, a partir da imagem I, considere que ele tenha gerado a imagem II abaixo. Nessa situação, o processamento realizado sobre a imagem I que melhor explica a geração da imagem II envolve a aplicação de");
        questaoAlternativa62.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa62.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa62.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa62.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa62.setAlternativaCorreta("d");
        questaoAlternativa62.setImagem(true);
        questaoAlternativa62.setAlternativasA("filtro passa-baixas.");
        questaoAlternativa62.setAlternativasB("quantizador.\n");
        questaoAlternativa62.setAlternativasC("reamostragem.\n");
        questaoAlternativa62.setAlternativasD("filtro passa-altas");
        questaoAlternativa62.setAlternativasE("compressão.");
        questaoAlternativa62.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa62.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa63 = new QuestaoAlternativa();
        questaoAlternativa63.setId(INICIOQUESTAO.longValue());
        questaoAlternativa63.setAno(ANO);
        questaoAlternativa63.setDescricao("");
        questaoAlternativa63.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa63.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa63.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa63.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa63.setAlternativaCorreta("e");
        questaoAlternativa63.setImagem(true);
        questaoAlternativa63.setAlternativaImagem(true);
        questaoAlternativa63.setAlternativasA("COLOCAR ALTERNATIVA IMAGEM");
        questaoAlternativa63.setAlternativasB("COLOCAR ALTERNATIVA IMAGEM");
        questaoAlternativa63.setAlternativasC("COLOCAR ALTERNATIVA IMAGEM");
        questaoAlternativa63.setAlternativasD("COLOCAR ALTERNATIVA IMAGEM");
        questaoAlternativa63.setAlternativasE("COLOCAR ALTERNATIVA IMAGEM");
        questaoAlternativa63.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa63.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa64 = new QuestaoAlternativa();
        questaoAlternativa64.setId(INICIOQUESTAO.longValue());
        questaoAlternativa64.setAno(ANO);
        questaoAlternativa64.setDescricao("Considere a necessidade de se implementar um componente de software que realiza cálculos de expressões matemáticas simples para as operações básicas (soma, subtração, multiplicação, divisão e exponenciação). O software reproduz na tela do computador a entrada, os resultados parciais e o resultado final da expressão e, ainda, trata os operadores de exponenciação, multiplicação e divisão com precedência sobre os operadores de soma e subtração. Para obter o referido software, é correto que o projetista\n" +
                "$\\newline$I defina uma cadeia de caracteres para armazenar e imprimir toda a expressão de entrada.\n" +
                "$\\newline$II defina uma gramática regular para identificar as expressões aritméticas válidas.\n" +
                "$\\newline$III defina um reconhecedor de linguagem regular com autômato finito determinístico.\n" +
                "$\\newline$IV especifique a ordem de precedência dos operadores com uma notação de gramática livre de contexto.\n" +
                "$\\newline$Estão certos apenas os itens");
        questaoAlternativa64.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa64.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa64.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa64.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa64.setAlternativaCorreta("d");

        questaoAlternativa64.setAlternativasA("I e II.");
        questaoAlternativa64.setAlternativasB("III e IV.");
        questaoAlternativa64.setAlternativasC("I, II e IV.");
        questaoAlternativa64.setAlternativasD("I, III e IV");
        questaoAlternativa64.setAlternativasE("II, III e IV.");
        questaoAlternativa64.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa65 = new QuestaoAlternativa();
        questaoAlternativa65.setId(INICIOQUESTAO.longValue());
        questaoAlternativa65.setAno(ANO);
        questaoAlternativa65.setDescricao("A análise de complexidade provê critérios para a classificação de problemas com base na computabilidade de suas soluções, utilizando-se a máquina de Turing como modelo referencial e possibilitando o agrupamento de problemas em classes. Nesse contexto, julgue os itens a seguir.\n" +
                "$\\newline$I É possível demonstrar que P $\\subseteq$ NP e NP $\\subseteq$ P.\n" +
                "$\\newline$II É possível demonstrar que se P $\\neq$ NP, então\n" +
                "P $\\cap$ NP-Completo = $\\varnothing$.\n" +
                "$\\newline$III Se um problema Q é NP-difícil e Q $\\in$ NP, então Q é\n" +
                "NP-completo.\n" +
                "$\\newline$IV O problema da satisfatibilidade de uma fórmula booleana F (uma fórmula é satisfatível, se é verdadeira em algum modelo) foi provado ser NP-difícil e NP-Completo.\n" +
                "$\\newline$V Encontrar o caminho mais curto entre dois vértices dados em um grafo de N vértices e M arestas não é um problema da classe P.\n" +
                "$\\newline$Estão certos apenas os itens");
        questaoAlternativa65.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa65.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa65.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa65.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa65.setAlternativaCorreta("b");

        questaoAlternativa65.setAlternativasA("I, III e IV.");
        questaoAlternativa65.setAlternativasB("II, III, e IV.");
        questaoAlternativa65.setAlternativasC("III, IV e V.");
        questaoAlternativa65.setAlternativasD("I, II, III, e IV.");
        questaoAlternativa65.setAlternativasE("II, III, IV e V.");
        questaoAlternativa65.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa66 = new QuestaoAlternativa();
        questaoAlternativa66.setId(INICIOQUESTAO.longValue());
        questaoAlternativa66.setAno(ANO);
        questaoAlternativa66.setDescricao("Considere que, em uma empresa que desenvolve aplicações distribuídas, tenha sido elaborado um manual destinado ao treinamento de empregados e que o responsável por elaborar o manual tenha cometido alguns erros. Analise os seguintes trechos do referido manual.\n" +
                "$\\newline$I Uma aplicação que usa o User Datagram Protocol (UDP) para transporte dos dados pode ter de tratar os problemas decorrentes de perdas de mensagens, mensagens recebidas fora de ordem e duplicações de mensagens.\n" +
                "$\\newline$II Um mecanismo de chamada a procedimento remoto (remote procedure call) ou de invocação a método remoto (remote method invocation) possibilita que programas chamem procedimentos ou métodos em diferentes computadores e que se abstraiam de todos os detalhes relacionados à distribuição.\n" +
                "$\\newline$III Em um sistema de comunicação embasado na chamada a procedimento remoto ou na invocação de método remoto, os serviços remotos são definidos por meio de interfaces. Uma interface é tipicamente processada por um compilador que gera códigos (stubs), que, nos clientes, se fazem passar pelos códigos remotos que são chamados.\n" +
                "$\\newline$IV Sistemas de chamada a procedimentos remotos ou de invocação a métodos remotos tipicamente implementam as semânticas at-most-once ou at-least-once, pois é mais difícil implementar a semântica exactly-once, segundo a qual quem chama o procedimento sabe que ele é executado exatamente uma vez.\n" +
                "$\\newline$Estão certos apenas os trechos");
        questaoAlternativa66.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa66.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa66.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa66.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa66.setAlternativaCorreta("d");

        questaoAlternativa66.setAlternativasA("I e II.\n");
        questaoAlternativa66.setAlternativasB("III e IV.");
        questaoAlternativa66.setAlternativasC("I, II e III.");
        questaoAlternativa66.setAlternativasD("I, III e IV.\n");
        questaoAlternativa66.setAlternativasE("II, III e IV.");
        questaoAlternativa66.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa67 = new QuestaoAlternativa();
        questaoAlternativa67.setId(INICIOQUESTAO.longValue());
        questaoAlternativa67.setAno(ANO);
        questaoAlternativa67.setDescricao("A redução da pirataria de software no Brasil e no mundo é resultado de esforços advindos da iniciativa privada e das entidades representativas do setor. Um estudo objetivando mensurar o índice de pirataria no mundo e os benefícios de sua redução apresentou os gráficos abaixo, obtidos de uma amostra de 57 países, incluindo-se o Brasil.\n" +
                "Com base nas informações apresentadas, é correto afirmar que I a taxa de redução do índice de pirataria de software no mundo manteve-se constante ano após ano no período mostrado.\n" +
                "$\\newline$II o Brasil reduziu em torno de 25% seu índice de pirataria de software, comparando os anos de 1994 e 2002.\n" +
                "$\\newline$III o Brasil foi, entre os países mostrados, o que apresentou a maior redução do índice de pirataria no período estudado.\n" +
                "$\\newline$IV países com maior participação do setor de TI no PIB apresentam, normalmente, menores índices de pirataria.\n" +
                "$\\newline$V o Brasil apresentou aumento de faturamento no período de 2000 a 2002, apesar do aumento de pirataria.\n" +
                "$\\newline$Estão certos apenas os itens");
        questaoAlternativa67.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa67.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa67.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa67.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa67.setAlternativaCorreta("c");
        questaoAlternativa67.setImagem(true);
        questaoAlternativa67.setAlternativasA("I e II.");
        questaoAlternativa67.setAlternativasB("I e III.\n");
        questaoAlternativa67.setAlternativasC("II e IV.");
        questaoAlternativa67.setAlternativasD("III e V.");
        questaoAlternativa67.setAlternativasE("IV e V.");
        questaoAlternativa67.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa67.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa68 = new QuestaoAlternativa();
        questaoAlternativa68.setId(INICIOQUESTAO.longValue());
        questaoAlternativa68.setAno(ANO);
        questaoAlternativa68.setDescricao("Suponha que uma empresa esteja projetando um protocolo de transporte orientado a conexão. Suponha, ainda, que os projetistas tenham pouca experiência e que alguns requisitos originalmente listados não sejam típicos de um protocolo de transporte orientado a conexão. A seguir, apresenta-se a lista dos requisitos propostos pela equipe de projetistas.\n" +
                "$\\newline$I O protocolo deve controlar a transmissão por meio de mecanismo de janela deslizante (sliding window). Vários pacotes poderão ser enviados antes de a origem aguardar uma confirmação de recepção. O número máximo de pacotes transmitidos antes de uma confirmação ser recebida será variável, o que possibilitará o controle do fluxo dos dados.\n" +
                "$\\newline$II O protocolo deve rotear os pacotes entre redes interligadas. O roteamento deve ser realizado a partir das informações em tabelas de roteamento. Em uma tabela de roteamento, cada entrada deve conter o endereço de um destino e o endereço da próxima máquina para a qual os pacotes devem ser enviados, de modo a serem encaminhados para o destino.\n" +
                "$\\newline$III Uma comunicação passará por três fases: estabelecimento da conexão, transferência dos dados e término da conexão. O protocolo manterá informações sobre uma conexão em uma estrutura de dados. Uma instância dessa estrutura será alocada quando uma conexão for estabelecida e será liberada quando a conexão for terminada.\n" +
                "$\\newline$IV O protocolo deve calcular dinamicamente o tempo (timeout) que a origem de um pacote deve aguardar até retransmitir a informação caso a recepção não seja confirmada, possibilitando que atrasos variáveis sejam acomodados. Isso deverá ser feito por meio de um algoritmo de retransmissão adaptativo que periodicamente ajuste o timeout.\n" +
                "$\\newline$Para um protocolo de transporte orientado a conexão, são adequados apenas os requisitos");
        questaoAlternativa68.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa68.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa68.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa68.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa68.setAlternativaCorreta("d");

        questaoAlternativa68.setAlternativasA("I e II.");
        questaoAlternativa68.setAlternativasB("I e IV.");
        questaoAlternativa68.setAlternativasC("II e III.\n");
        questaoAlternativa68.setAlternativasD("I, III e IV");
        questaoAlternativa68.setAlternativasE("II, III e IV.");
        questaoAlternativa68.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa69 = new QuestaoAlternativa();
        questaoAlternativa69.setId(INICIOQUESTAO.longValue());
        questaoAlternativa69.setAno(ANO);
        questaoAlternativa69.setDescricao("A partir dessas informações apresentadas na imagem abaixo, julgue os itens a seguir, relativos à rede da referida empresa, considerando o seu correto funcionamento.\n" +
                "$\\newline$I É correto utilizar a máscara 255.255.0.0 para segmentar a rede.\n" +
                "$\\newline$II Os endereços de E1 a E9 podem ser endereços na rede 10.0.0.0.\n" +
                "$\\newline$III Os endereços E2, E4, E5 e E7 devem estar em uma mesma sub-rede.\n" +
                "$\\newline$IV O endereço E10 deve ser um endereço na rede 164.41.0.0.\n" +
                "$\\newline$V O firewall deve traduzir entre os endereços na rede 10.0.0.0 e os endereços na rede 164.41.0.0.\n" +
                "$\\newline$VI Os pacotes X.25 são transferidos dentro de pacotes IP.\n" +
                "$\\newline$VII Não devem ter sido atribuídos endereços X.25 aos roteadores 1, 2, 3 e 4.\n" +
                "$\\newline$VIII A rota default nas tabelas de roteamento dos roteadores 1, 3 e 4 é o endereço E4.\n" +
                "$\\newline$IX A rota default na tabela de roteamento do roteador 2 é o endereço E10.\n" +
                "$\\newline$X Os endereços na rede 10.0.0.0 são visíveis pelas máquinas que estiverem na Internet.\n" +
                "$\\newline$Estão certos apenas os itens");
        questaoAlternativa69.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa69.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa69.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa69.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa69.setAlternativaCorreta("b");
        questaoAlternativa69.setImagem(true);
        questaoAlternativa69.setAlternativasA("I, II, III, V, VIII e X.");
        questaoAlternativa69.setAlternativasB("I, II, III, IV, V e VIII.\n");
        questaoAlternativa69.setAlternativasC("II, IV, V, VIII, IX e X.");
        questaoAlternativa69.setAlternativasD("III, V, VI, VII, VIII e IX.");
        questaoAlternativa69.setAlternativasE("III, IV, V, VII, VIII e IX.");
        questaoAlternativa69.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa69.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa70 = new QuestaoAlternativa();
        questaoAlternativa70.setId(INICIOQUESTAO.longValue());
        questaoAlternativa70.setAno(ANO);
        questaoAlternativa70.setDescricao("Anulada");
        questaoAlternativa70.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa70.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa70.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa70.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
        questaoAlternativa70.setAlternativaCorreta("*");

        questaoAlternativa70.setAlternativasA("Anulada");
        questaoAlternativa70.setAlternativasB("Anulada");
        questaoAlternativa70.setAlternativasC("Anulada");
        questaoAlternativa70.setAlternativasD("Anulada");
        questaoAlternativa70.setAlternativasE("Anulada");
        questaoAlternativa70.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa71 = new QuestaoAlternativa();
        questaoAlternativa71.setId(INICIOQUESTAO.longValue());
        questaoAlternativa71.setAno(ANO);
        questaoAlternativa71.setDescricao("Sistemas operacionais de tempo real são utilizados em controle de processos automatizados, em que o tempo de resposta a determinados eventos é um fator crítico. Com relação a esse assunto, julgue os itens seguintes.\n" +
                "$\\newline$I Sistemas de tempo real estritos (hard real-time) não utilizam dispositivos de memória secundária (como discos), pois estes não oferecem garantia de término das operações dentro de uma quantidade máxima de tempo.\n" +
                "$\\newline$II Um sistema operacional de propósito geral pode ser modificado para ser de tempo real atribuindo-se prioridades fixas para cada um dos processos.\n" +
                "$\\newline$III O escalonamento mais utilizado por sistemas operacionais de tempo real é o shortest-job-first (tarefa mais curta primeiro).\n" +
                "$\\newline$Assinale a opção correta.");
        questaoAlternativa71.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa71.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa71.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa71.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa71.setAlternativaCorreta("a");

        questaoAlternativa71.setAlternativasA("Apenas um item está certo.\n");
        questaoAlternativa71.setAlternativasB("Apenas os itens I e II estão certos.");
        questaoAlternativa71.setAlternativasC("Apenas os itens I e III estão certos.");
        questaoAlternativa71.setAlternativasD("Apenas os itens II e III estão certos.\n");
        questaoAlternativa71.setAlternativasE("Todos os itens estão certos.\n");
        questaoAlternativa71.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa72 = new QuestaoAlternativa();
        questaoAlternativa72.setId(INICIOQUESTAO.longValue());
        questaoAlternativa72.setAno(ANO);
        questaoAlternativa72.setDescricao("A execução de duas transações, $T_{i}$ e $T_{j}$ , em um banco de dados, é serializável se produz o mesmo resultado para a execução serial de qualquer intercalação de operações dessas transações($T_{i}$ seguida de $T_{j}$ ou $T_{j}$ seguida de $T_{i}$). O uso de bloqueios (locks) é uma maneira de se garantir que transações concorrentes sejam serializáveis. A tabela acima mostra informações relativas a três transações, $T_{1}$, $T_{2}$ e $T_{3}$ , que operam sobre dois dados compartilhados, A e B, e utilizam bloqueios para controle de concorrência. Com relação às transações $T_{1}$, $T_{2}$ e $T_{3}$, julgue os itens seguintes.\n" +
                "$\\newline$I O conjunto (T , T ) não é serializável, e há o perigo de\n" +
                "ocorrer deadlock durante a execução concorrente dessas\n" +
                "transações.\n" +
                "$\\newline$II O conjunto ($T_{1},T_{2}$) não é serializável, mas não há o perigo de ocorrer deadlock durante a execução concorrente dessas transações.\n" +
                "$\\newline$III O conjunto ($T_{2},T_{3}$) é serializável, e não há o perigo de ocorrer deadlock durante a execução concorrente dessas transações.\n" +
                "$\\newline$Assinale a opção correta.");
        questaoAlternativa72.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa72.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa72.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa72.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa72.setAlternativaCorreta("d");
        questaoAlternativa72.setImagem(true);
        questaoAlternativa72.setAlternativasA("Apenas um item está certo.\n");
        questaoAlternativa72.setAlternativasB("Apenas os itens I e II estão certos.");
        questaoAlternativa72.setAlternativasC("Apenas os itens I e III estão certos.");
        questaoAlternativa72.setAlternativasD("Apenas os itens II e III estão certos.\n");
        questaoAlternativa72.setAlternativasE("Todos os itens estão certos.\n");
        questaoAlternativa72.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa72.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa73 = new QuestaoAlternativa();
        questaoAlternativa73.setId(INICIOQUESTAO.longValue());
        questaoAlternativa73.setAno(ANO);
        questaoAlternativa73.setDescricao("Considere o seguinte script SQL de criação de um banco de dados.\n" +
                "$\\newline$CREATE TABLE PECAS (CODIGO NUMERIC(5) NOT NULL,\n" +
                "$\\newline$ DESCRICAO VARCHAR(20) NOT NULL,\n" +
                "$\\newline$ ESTOQUE NUMERIC(5) NOT NULL,\n" +
                "$\\newline$ PRIMARY KEY(CODIGO));\n" +
                "$\\newline$CREATE TABLE FORNECEDORES\n" +
                "$\\newline$(COD_FORN NUMERIC(3) NOT NULL,\n" +
                "$\\newline$ NOME VARCHAR(30) NOT NULL,\n" +
                "$\\newline$ PRIMARY KEY(COD_FORN));\n" +
                "$\\newline$CREATE TABLE FORNECIMENTOS\n" +
                "$\\newline$(COD_PECA NUMERIC(5) NOT NULL,\n" +
                "$\\newline$ COD_FORN NUMERIC(3) NOT NULL,\n" +
                "$\\newline$ QUANTIDADE NUMERIC(4) NOT NULL,\n" +
                "$\\newline$ PRIMARY KEY(COD_PECA, COD_FORN),\n" +
                "$\\newline$ FOREIGN KEY (COD_PECA) REFERENCES PECAS,\n" +
                "$\\newline$ FOREIGN KEY (COD_FORN) REFERENCES\n" +
                "$\\newline$ FORNECEDORES);\n" +
                "$\\newline$A partir desse script, assinale a opção que apresenta comando SQL que permite obter uma lista que contenha o nome de cada fornecedor que tenha fornecido alguma peça, o código da peça fornecida, a descrição dessa peça e a  uantidade fornecida da referida peça.");
        questaoAlternativa73.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa73.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa73.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa73.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa73.setAlternativaCorreta("d");

        questaoAlternativa73.setAlternativasA("SELECT * FROM PECAS, FORNECEDORES, FORNECIMENTOS;");
        questaoAlternativa73.setAlternativasB("SELECT * FROM PECAS, FORNECEDORES,\n" +
                "FORNECIMENTOS WHERE PECAS.CODIGO =\n" +
                "FORNECIMENTOS.COD_PECA AND\n" +
                "FORNECEDORES.COD_FORN =\n" +
                "FORNECIMENTOS.COD_FORN;");
        questaoAlternativa73.setAlternativasC("SELECT NOME, CODIGO, DESCRICAO, QUANTIDADE\n" +
                "FROM PECAS, FORNECEDORES, FORNECIMENTOS;\n");
        questaoAlternativa73.setAlternativasD("SELECT NOME, CODIGO, DESCRICAO, QUANTIDADE FROM PECAS, FORNECEDORES, FORNECIMENTOS WHERE PECAS.CODIGO = FORNECIMENTOS.COD_PECA AND FORNECEDORES.COD_FORN =\n" +
                "FORNECIMENTOS.COD_FORN;");
        questaoAlternativa73.setAlternativasE("SELECT DISTINCT NOME, CODIGO, DESCRICAO,\n" +
                "QUANTIDADE\n" +
                "FROM PECAS, FORNECEDORES, FORNECIMENTOS\n" +
                "WHERE CODIGO = COD_PECA;\n");
        questaoAlternativa73.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa74 = new QuestaoAlternativa();
        questaoAlternativa74.setId(INICIOQUESTAO.longValue());
        questaoAlternativa74.setAno(ANO);
        questaoAlternativa74.setDescricao("No que diz respeito às redes neurais, assinale a opção correta.\n");
        questaoAlternativa74.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa74.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa74.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa74.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa74.setAlternativaCorreta("d");

        questaoAlternativa74.setAlternativasA("O treinamento de uma rede neural tem tempo determinado de\n" +
                "execução.");
        questaoAlternativa74.setAlternativasB("Não há problemas em realizar o teste de desempenho de uma rede neural com o mesmo conjunto de dados usado para o treinamento.");
        questaoAlternativa74.setAlternativasC("O número de pesos de uma rede neural não influencia a rapidez com que ela processa dados.");
        questaoAlternativa74.setAlternativasD("O aprendizado supervisionado é o paradigma de treinamento mais utilizado para desenvolver aplicações de redes neurais para classificação e predição.");
        questaoAlternativa74.setAlternativasE("O número de camadas ocultas de uma rede de alimentação direta é inversamente proporcional ao aumento do espaço de hipóteses que ela pode representar.");
        questaoAlternativa74.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa75 = new QuestaoAlternativa();
        questaoAlternativa75.setId(INICIOQUESTAO.longValue());
        questaoAlternativa75.setAno(ANO);
        questaoAlternativa75.setDescricao("Um engenheiro de uma companhia fabricante de memórias semicondutoras estudou o comportamento do custo em função do número de bits da fabricação de um chip de memória RAM com determinada tecnologia. Ele chegou à conclusão de que, considerando-se a evolução tecnológica, o custo C(x), expresso em determinada unidade monetária, de um chip de memória RAM com x bits, na data de conclusão do processo de fabricação, seria determinado pela equação $\\\\C(x)= \\frac{25 \\times 10^{-3}}{1.024}\\left[x^{2} - (2.048 \\times 10^{6})x + 2(1.024 \\times 10^{6})^{2}\\right].\\\\$ \n" +
                "Considerando-se que o modelo desenvolvido pelo engenheiro esteja correto, caso a empresa decida pelo chip de menor custo, ela deverá optar por um chip com memória de capacidade de ");
        questaoAlternativa75.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa75.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa75.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa75.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa75.setAlternativaCorreta("c");

        questaoAlternativa75.setAlternativasA("256 megabits.");
        questaoAlternativa75.setAlternativasB("512 megabits.");
        questaoAlternativa75.setAlternativasC("1.024 megabits.");
        questaoAlternativa75.setAlternativasD("2.048 megabits.\n");
        questaoAlternativa75.setAlternativasE("4.096 megabits.");
        questaoAlternativa75.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa76 = new QuestaoAlternativa();
        questaoAlternativa76.setId(INICIOQUESTAO.longValue());
        questaoAlternativa76.setAno(ANO);
        questaoAlternativa76.setDescricao("O termo imagem designa uma função intensidade luminosa bidimensional f, em que um valor de intensidade é associado a coordenadas espaciais (x, y). Uma imagem digital é obtida pela digitalização das coordenadas espaciais por meio de um processo conhecido como amostragem da imagem. Dessa forma, uma imagem contínua monocromática f(x, y) é aproximada por amostras igualmente espaçadas, arranjadas na forma de uma matriz N $\\times$ M, em que cada\n" +
                "elemento é um va min max lor inteiro g. O intervalo [$G_{min},G_{max}$], do menor ao maior valor de intensidade g, é denom min inado escala de cinza. Normalmente, $G_{min}$ = 0 corresponde a preto, e $G_{max}$ = G corresponde ao branco.\n" +
                "Considerando os conceitos apresentados acima, assinale a opção correta.");
        questaoAlternativa76.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa76.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa76.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa76.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa76.setAlternativaCorreta("c");

        questaoAlternativa76.setAlternativasA("O processo de digitalização da imagem requer que as\n" +
                "dimensões N e M da matriz mencionada acima sejam\n" +
                "múltiplas do número de tons de cinza na imagem.");
        questaoAlternativa76.setAlternativasB("Para imagens binárias, se L for o número de tons de cinza representáveis, e L = $2^{k}$ , então k = 2.");
        questaoAlternativa76.setAlternativasC("Os métodos para realce de imagens que operam no domínio espacial fazem uso do conceito de vizinhança de pixel.");
        questaoAlternativa76.setAlternativasD("Métodos de filtragem normalmente usam máscaras para impedir a transformação dos níveis de cinza dos pixels da imagem. ");
        questaoAlternativa76.setAlternativasE("Limiarização é um tipo de processamento de imagens que amplia o número de níveis de cinza da imagem.");
        questaoAlternativa76.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa77 = new QuestaoAlternativa();
        questaoAlternativa77.setId(INICIOQUESTAO.longValue());
        questaoAlternativa77.setAno(ANO);
        questaoAlternativa77.setDescricao("Observe a situação representada abaixo, em que o triângulo identificado por A sofre transformações geométricas que o levam para a situação identificada por A’. Considerando-se dx e dy parâmetros de translação e s, parâmetro fator de escala, então o triângulo A’ pode ser obtido a partir da aplicação da seguinte sequência de transformações aos vértices do triângulo A:");
        questaoAlternativa77.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa77.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa77.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa77.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa77.setAlternativaCorreta("e");
        questaoAlternativa77.setImagem(true);
        questaoAlternativa77.setAlternativasA("rotação em torno do ponto ($x_{c}, y_{c}$); escala com fator uniforme\n" +
                "s = 2.");
        questaoAlternativa77.setAlternativasB("rotação em torno do ponto ($x_{c}, y_{c}$); escala com fator uniforme s = 0,5.");
        questaoAlternativa77.setAlternativasC("rotação em torno do ponto ($x'_{c}, y'_{c}$); escala com fator uniforme s = 0,5; translação com parâmetros de deslocamento dx = $-x_{c}$ e dy = $-y_{c}$.");
        questaoAlternativa77.setAlternativasD("escala com fator uniforme s = 0,5; translação com parâmetros de deslocamento dx = $x'_{c}$ e dy = $y'_{c}$; rotação em torno do ponto ($x_{c}, y_{c}$).");
        questaoAlternativa77.setAlternativasE("translação com parâmetros de deslocamento dx = $-x_{c}$ e dy = $-y_{c}$; rotação em torno do ponto ($x_{c}, y_{c}$); translação com parâmetros de deslocamento dx = $x_{c}$ e dy = $y_{c}$ ; escala com fator uniforme s = 0,5.");
        questaoAlternativa77.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa77.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa78 = new QuestaoAlternativa();
        questaoAlternativa78.setId(INICIOQUESTAO.longValue());
        questaoAlternativa78.setAno(ANO);
        questaoAlternativa78.setDescricao("Dispositivos Lógicos Programáveis (DLP, ou PLD — programmable logic devices) são muito utilizados hoje em dia para o projeto de circuitos digitais especiais. Com relação a esse assunto, julgue os itens a seguir.\n" +
                "$\\newline$I Como um PLA (programmable logic array) somente implementa equações booleanas descritas na forma de soma de termosproduto, e não implementa portas lógicas multinível, então nem todas as funções booleanas podem ser implementadas em um PLA.\n" +
                "$\\newline$II Em uma PROM (programmable ROM), o arranjo de portas AND é fixo, e somente o arranjo de portas OR pode ser programado; em um PAL (programmable array logic), o arranjo de portas OR é fixo, e somente o array de portas AND é programável; e, em um PLA (programmable logic array), tanto o arranjo de portas AND como o de portas OR são programáveis.\n" +
                "$\\newline$III Um circuito digital implementado por meio de um dispositivo lógico programável ocupa mais área e consome mais potência do que um circuito integrado dedicado, mas, em compensação, ele pode operar em freqüências maiores, pois seus transistores e portas lógicas são projetados de forma a otimizar o chaveamento de estados.\n" +
                "$\\newline$Assinale a opção correta.");
        questaoAlternativa78.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa78.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa78.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa78.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
        questaoAlternativa78.setAlternativaCorreta("a");

        questaoAlternativa78.setAlternativasA("Apenas o item II está certo.");
        questaoAlternativa78.setAlternativasB("Apenas o item III está certo.");
        questaoAlternativa78.setAlternativasC("Apenas os itens I e II estão certos.");
        questaoAlternativa78.setAlternativasD("Apenas os itens I e III estão certos.");
        questaoAlternativa78.setAlternativasE("Apenas os itens II e III estão certos.");
        questaoAlternativa78.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa79 = new QuestaoAlternativa();
        questaoAlternativa79.setId(INICIOQUESTAO.longValue());
        questaoAlternativa79.setAno(ANO);
        questaoAlternativa79.setDescricao("$\\newline$xpto( [ ], R, R ).\n" +
                "$\\newline$xpto( [H | T1], Y, [H | T2] ) :- xpto( T1, Y, T2 ).\n" +
                "$\\newline$zpto( X, [X|Y] ).\n" +
                "$\\newline$zpto( X, [Y|Z] ) :- zpto( X, Z ).\n" +
                "$\\newline$Com relação aos predicados escritos em Prolog acima, julgue os itens a seguir.\n" +
                "$\\newline$I A execução de xpto([1,2,3],[ ], F) conclui com sucesso instanciando F para [1,2,3].\n" +
                "$\\newline$II A execução de zpto(5,[1,2,3] ) conclui sem sucesso.\n" +
                "$\\newline$III A execução de zpto(X,[1,2,3]) conclui com sucesso, instanciando X para 1.\n" +
                "$\\newline$Assinale a opção correta.");
        questaoAlternativa79.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa79.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa79.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa79.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa79.setAlternativaCorreta("e");

        questaoAlternativa79.setAlternativasA("Apenas um item está certo.\n");
        questaoAlternativa79.setAlternativasB("Apenas os itens I e II estão certos.");
        questaoAlternativa79.setAlternativasC("Apenas os itens I e III estão certos.");
        questaoAlternativa79.setAlternativasD("Apenas os itens II e III estão certos.\n");
        questaoAlternativa79.setAlternativasE("Todos os itens estão certos.");
        questaoAlternativa79.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa80 = new QuestaoAlternativa();
        questaoAlternativa80.setId(INICIOQUESTAO.longValue());
        questaoAlternativa80.setAno(ANO);
        questaoAlternativa80.setDescricao("Que cadeia é reconhecida pelo autômato representado pelo diagrama de estados abaixo?");
        questaoAlternativa80.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa80.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa80.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa80.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa80.setAlternativaCorreta("b");
        questaoAlternativa80.setImagem(true);
        questaoAlternativa80.setAlternativasA("101010");
        questaoAlternativa80.setAlternativasB("111011000");
        questaoAlternativa80.setAlternativasC("11111000");
        questaoAlternativa80.setAlternativasD("10100");
        questaoAlternativa80.setAlternativasE("00110011");
        questaoAlternativa80.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa80.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa81 = new QuestaoAlternativa();
        questaoAlternativa81.setId(INICIOQUESTAO.longValue());
        questaoAlternativa81.setAno(ANO);
        questaoAlternativa81.setDescricao("O estudo de dimensionamento e de desempenho de redes de comunicação é uma ciência que usa constantemente os resultados da teoria de filas. Nesse tipo de análise, é comum a adoção de modelos de filas M/M/1 para a análise de enlaces de roteadores e comutadores. Nesse tipo de modelo, a chegada de pacotes para transmissão e a transmissão deles são processos de Poisson. Assim, as características da fila que se forma em cada enlace podem ser determinadas em função da taxa de chegada (tempo médio decorrido entre a chegada de pacotes sucessivos encaminhados para transmissão pelo enlace) e da taxa de serviço (tempo médio para transmissão de um pacote). Acerca do modelo M/M/1 aplicado ao estudo de capacidade e desempenho de enlaces de redes, por comutação de pacotes, assinale a opção correta.");
        questaoAlternativa81.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa81.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa81.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa81.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa81.setAlternativaCorreta("a");

        questaoAlternativa81.setAlternativasA("Caso a taxa de chegada seja maior que a taxa de serviço (taxa de saída), conclui-se que o enlace está subdimensionado e haverá perda de pacotes.");
        questaoAlternativa81.setAlternativasB("A taxa de serviço é independente do tamanho do pacote.");
        questaoAlternativa81.setAlternativasC("Em um roteador com múltiplos enlaces, a taxa de chegada para cada enlace é igual ao somatório das capacidades de todos os enlaces dividido pelo número de enlaces do roteador.");
        questaoAlternativa81.setAlternativasD("O modelo M/M/1 apresenta instabilidade numérica sempre que a taxa de chegada for próxima de zero.");
        questaoAlternativa81.setAlternativasE("Quando a taxa de chegada é menor que a taxa de serviço, pode-se esperar que o número médio de pacotes na fila seja igual a zero.");
        questaoAlternativa81.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa82 = new QuestaoAlternativa();
        questaoAlternativa82.setId(INICIOQUESTAO.longValue());
        questaoAlternativa82.setAno(ANO);
        questaoAlternativa82.setDescricao("Considere que, em uma rede WLAN, a função de densidade de probabilidade (PDF) de erro de bit na transmissão entre um computador conectado à rede e o pon erro to de acesso (access point) — $p_{erro}$(d) — seja dada pela função cujo gráfico está mostrado abaixo, em que $d\\geq 0$ é a distância entre o ponto de acesso e o computador.\n" +
                "$\\newline$Considerando essas informações, julgue os itens a seguir.\n" +
                "$\\newline$I A probabilidade de erro de bit na transmissão no caso de o computador estar localizado à distância $d_{0}$ é dada por $\\int_{0}^{d_{0}} P_{erro}(S)ds $.\n" +
                "$\\newline$II Sabendo-se que a média da distribuição correspondente à PDF acima mencionada é igual a x, conclui-se que é de 0,5 a probabilidade de erro de bit na transmissão no caso de o computador estar localizado à distância d = x.\n" +
                "$\\newline$III Supondo-se que o sistema de transmissão seja binário, as informações apresentadas são suficientes para se concluir que a probabilidade de erro dado que foi enviado um bit 1 é igual à probabilidade de erro dado que foi enviado um bit 0.\n" +
                "$\\newline$Assinale a opção correta.");
        questaoAlternativa82.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa82.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa82.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa82.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa82.setAlternativaCorreta("b");
        questaoAlternativa82.setImagem(true);
        questaoAlternativa82.setAlternativasA("Apenas um item está certo.");
        questaoAlternativa82.setAlternativasB("Apenas os itens I e II estão certos.\n");
        questaoAlternativa82.setAlternativasC("Apenas os itens I e III estão certos.");
        questaoAlternativa82.setAlternativasD("Apenas os itens II e III estão certos.");
        questaoAlternativa82.setAlternativasE("Todos os itens estão certos.");
        questaoAlternativa82.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa82.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa83 = new QuestaoAlternativa();
        questaoAlternativa83.setId(INICIOQUESTAO.longValue());
        questaoAlternativa83.setAno(ANO);
        questaoAlternativa83.setDescricao("Com relação à tecnologia bluetooth, que possibilita a comunicação sem fios entre dispositivos, assinale a opção correta");
        questaoAlternativa83.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa83.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa83.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa83.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa83.setAlternativaCorreta("b");

        questaoAlternativa83.setAlternativasA("Essa tecnologia utiliza a transmissão em enlace via rádio na banda de freqüência VHF.");
        questaoAlternativa83.setAlternativasB("Essa tecnologia possibilita a transmissão de voz e dados a curtas distâncias.");
        questaoAlternativa83.setAlternativasC("Um dispositivo pode assumir, simultaneamente, o papel de mestre e de escravo em uma mesma piconet que utiliza essa tecnologia.");
        questaoAlternativa83.setAlternativasD("Uma piconet pode ser formada por até 255 mestres e 255 escravos.");
        questaoAlternativa83.setAlternativasE("Um dispositivo pode participar, simultaneamente, de duas piconets, desde que ele seja mestre em ambas.");
        questaoAlternativa83.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa84 = new QuestaoAlternativa();
        questaoAlternativa84.setId(INICIOQUESTAO.longValue());
        questaoAlternativa84.setAno(ANO);
        questaoAlternativa84.setDescricao("Considere que uma empresa esteja projetando um protocolo da camada de rede. Considere, ainda, que a equipe de projeto tenha proposto o seguinte conjunto de requisitos.\n" +
                "$\\newline$I O protocolo deve prover um serviço de comunicação não-orientado a conexão e sem garantia da entrega. O protocolo não é responsável por ordenar os datagramas que, embora recebidos com sucesso, estejam fora da ordem em que foram transmitidos.\n" +
                "$\\newline$II Os datagramas devem conter, além dos endereços de rede das máquinas, números que identifiquem as entidades nas máquinas de\n" +
                "origem e destino para distinguirem as entidades nas máquinas envolvidas em uma comunicação.\n" +
                "$\\newline$III O protocolo deve evitar que as aplicações tenham de definir os formatos usados para representar os dados nas máquinas. Na\n" +
                "transmissão, o protocolo deve converter os dados de um formato específico de máquina para um formato independente de máquina.\n" +
                "Na recepção, deve converter de um formato independente de máquina para um formato específico de máquina.\n" +
                "$\\newline$IV O protocolo poderá fragmentar um datagrama na origem e remontá-lo no destino, para que dados sejam transmitidos por meio de\n" +
                "redes cujas camadas físicas tenham tamanhos variados para as unidades máximas de transferência (maximum transfer unit).\n" +
                "$\\newline$V O protocolo deve implementar o controle de acesso ao meio de transmissão. Antes de transmitir, deve aguardar o meio de\n" +
                "transmissão ficar livre. Se outras máquinas tentarem transmitir ao mesmo tempo, ele deve enviar um sinal para garantir que as\n" +
                "máquinas detectem a colisão. Em seguida, deve aguardar e novamente tentar transmitir.\n" +
                "$\\newline$Entre os requisitos propostos pela equipe de projeto, estão adequados para um um protocolo da camada de rede os requisitos");
        questaoAlternativa84.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa84.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa84.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa84.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa84.setAlternativaCorreta("a");

        questaoAlternativa84.setAlternativasA("I, II e IV.");
        questaoAlternativa84.setAlternativasB("I, III e V.");
        questaoAlternativa84.setAlternativasC("I, IV e V. ");
        questaoAlternativa84.setAlternativasD(" II, III e IV.");
        questaoAlternativa84.setAlternativasE("II, IV e V.");
        questaoAlternativa84.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoDiscusiva questaoDiscusiva85 = new QuestaoDiscusiva();
        questaoDiscusiva85.setId(INICIOQUESTAO.longValue());
        questaoDiscusiva85.setAno(ANO);
        questaoDiscusiva85.setDescricao("Em sistemas distribuídos, é necessário, muitas vezes, resolver problemas decorrentes do fato de diferentes plataformas poderem adotar diferentes formas para representar os dados.\n" +
                "A respeito de sistemas distribuídos heterogêneos, faça o que se pede a seguir.\n" +
                "$\\newline$a) Apresente exemplos das diferenças nas formas de representação dos dados que podem causar problemas em sistemas distribuídos.\n" +
                "$\\newline$b) Explique o que é eXternal Data Representation (XDR) e como uma biblioteca XDR pode ser usada em chamadas a procedimentos remotos.");
        questaoDiscusiva85.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoDiscusiva85.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoDiscusiva85.setProva(ETipoQuestaoProva.ENADE);
        questaoDiscusiva85.setDisciplina(EDisciplina.SISTEMAS_DISTRIBUIDOS);
        questaoDiscusiva85.setResposta("Item a: nesse item, foram atribuídos três níveis de pontuação (0, 1 e 2). A pontuação máxima (5,0 pontos)\n" +
                "foi atribuída aos estudantes que fizeram corretamente a apresentação das diferenças nas formas de\n" +
                "representação dos dados.\n" +
                "Esperava-se que o estudante mencionasse a existência de diferenças nas representações dos tipos de\n" +
                "dados nas diversas arquiteturas de computadores, por exemplo, relacionadas a: ordem dos bytes,\n" +
                "tamanho de inteiros, representações dos números ponto-flutuantes, cadeias de caracteres (strings ).\n" +
                "$\\newline$Item b: nesse item, houve a divisão em dois subitens pontuados separadamente:\n" +
                "$\\newline$(i) o subitem b1 avalia se o estudante sabe o que é XDR. Para a descrição correta da definição de XDR foi\n" +
                "atribuída nota máxima (2,0 pontos).\n" +
                "Resposta esperada:\n" +
                "ß O eXternal Data Representation (XDR) é um formato padronizado para a representação de dados.\n" +
                "\n" +
                "$\\newline$(ii) o subitem b2 avalia se o estudante sabe como uma biblioteca XDR pode ser utilizada em chamadas a\n" +
                "procedimentos remotos. Para a descrição correta da utilização da bibliot eca XDR foi atribuída nota\n" +
                "máxima (3,0 pontos).\n" +
                "Resposta esperada:\n" +
                "ß Uma biblioteca XDR converte formatos específicos em formato padronizado.\n" +
                "ß A chamada a procedimentos remotos usa uma biblioteca XDR para resolver problemas resultantes\n" +
                "de diferentes formatos de representação.");

        questaoAlternativa60.setNumeroQuestao(NUMEROQUESTAO);

        List<Questao> questoes = new ArrayList<>();
        questoes.add(questaoAlternativa1);
        questoes.add(questaoAlternativa2);
        questoes.add(questaoAlternativa3);
        questoes.add(questaoAlternativa4);
        questoes.add(questaoAlternativa5);
        questoes.add(questaoAlternativa6);
        questoes.add(questaoAlternativa7);
        questoes.add(questaoDiscursiva8);
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
        questoes.add(questaoDiscusiva55);
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
        questoes.add(questaoAlternativa79);
        questoes.add(questaoAlternativa80);
        questoes.add(questaoAlternativa81);
        questoes.add(questaoAlternativa82);
        questoes.add(questaoAlternativa83);
        questoes.add(questaoAlternativa84);
        questoes.add(questaoDiscusiva85);

        return questoes;
    }

}
