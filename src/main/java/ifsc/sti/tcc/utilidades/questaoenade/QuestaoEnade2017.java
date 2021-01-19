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

public class QuestaoEnade2017 {

    final static Integer ANO = 2017;
    static Integer INICIOQUESTAO = 1526;
    static Integer NUMEROQUESTAO = 1;

    public static List<Questao> register() {

        QuestaoDiscusiva questaoDiscusiva1 = new QuestaoDiscusiva();
        questaoDiscusiva1.setId(INICIOQUESTAO.longValue());
        questaoDiscusiva1.setAno(ANO);
        questaoDiscusiva1.setDescricao("A partir das informações apresentadas nos textos abaixo, redija um texto acerca do tema:\n" +
                "$\\newline$Epidemia de sífilis congénita no Brasil e relações de gênero\n" +
                "$\\newline$Em seu texto, aborde os seguintes aspectos:\n" +
                "$\\newline$- a vulnerabilidade das mulheres âs DSTs e o papel social do homem em relação à prevenção dessas doenças;\n" +
                "$\\newline$- duas ações especificamente voltadas para o público masculino, a serem adotadas no âmbito das políticas públicas de saúde ou de educação, para reduzir o problema.");
        questaoDiscusiva1.setTipoFormcao(EFormacao.GERAL);
        questaoDiscusiva1.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoDiscusiva1.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoDiscusiva1.setProva(ETipoQuestaoProva.ENADE);
        questaoDiscusiva1.setResposta("Em seu texto, o estudante deve abordar os seguintes aspectos:\n" +
                "$\\newline$A proporção crescente de casos novos de sífilis no segmento feminino é evidência que tem\n" +
                "sido cada vez mais encontrada no perfil epidemiológico não apenas dessa doença, mas\n" +
                "também de várias outras doenças sexualmente transmissíveis (DST).\n" +
                "$\\newline$A vulnerabilidade desse grupo específico resulta da conjuntura de diversos fatores, sendo os\n" +
                "fatores sociais e culturais de grande relevância. Nesse sentido, questões relacionadas ao\n" +
                "padrão de comportamento de homens e mulheres no contexto das relações sexuais, bem\n" +
                "como crenças morais, valores, relações de poder, entre outras, são muito influentes no grau de\n" +
                "suscetibilidade feminina às DST.\n" +
                "$\\newline$A hierarquia de poder muitas vezes encontrada nas relações afetivas influenciam o papel das\n" +
                "mulheres na tomada de decisões a respeito da relação sexual, afetando o espaço que têm (ou\n" +
                "não) para negociar o uso do preservativo com seus parceiros, bem como as habilidades para\n" +
                "abordar temas de DST junto a eles.\n" +
                "$\\newline$Aspectos culturais e morais afetam as atitudes de homens e mulheres no que diz respeito ao\n" +
                "acesso e porte de preservativos, pois elas muitas vezes se sentem constrangidas tanto para\n" +
                "comprar os preservativos quando para levá-los consigo. Cabe ressaltar que, no contexto dos\n" +
                "cuidados em relação à saúde sexual e reprodutiva, a responsabilidade costumeiramente recai\n" +
                "sobre a mulher. Além disso, culturalmente, o público masculino não costuma buscar os\n" +
                "serviços de atenção primária à saúde e não se sente vulnerável às DST. Ademais, tendo em\n" +
                "vista que os sintomas no público masculino são mais raros e/ou discretos, os homens muitas\n" +
                "vezes sequer têm conhecimento de que estão contaminados, infectando suas parceiras e,\n" +
                "muitas vezes, reinfectando-as, o que no contexto da sífilis congênita é ainda mais perigoso.\n" +
                "$\\newline$Com o intuito de fortalecer as ações de prevenção à sífilis e outras DST, são importantes ações\n" +
                "no âmbito das políticas públicas de saúde e de educação especificamente dirigidas ao público\n" +
                "masculino. O estudante pode citar, pelo menos, duas entre as ações listadas a seguir.\n" +
                "$\\newline$1. Ações de atenção primária voltadas à prevenção, que incentivem que o público masculino\n" +
                "faça exames para detecção precoce de DST regularmente;\n" +
                "$\\newline$2. Programas de incentivo e atendimento ao público masculino no contexto dos exames de\n" +
                "pré-natal, para ajudar a conter a reinfecção das gestantes no caso de parceiros já\n" +
                "contaminados;\n" +
                "$\\newline$3. Programas especializados voltados para atender ao público masculino nos serviços de\n" +
                "atenção primária, considerando suas especificidades e oferecendo serviços voltados à\n" +
                "prevenção;\n" +
                "$\\newline$4. Campanhas de educação voltadas para a problematização da questão em ambiente\n" +
                "escolar, a fim de introduzir uma cultura de responsabilidade com a saúde;\n" +
                "$\\newline$5. Inserção, em materiais didáticos, de textos sensibilizadores direcionados à importância do\n" +
                "papel dos homens em relação à prevenção das DST;\n" +
                "$\\newline$6. Propostas de projetos educacionais em ambiente escolar direcionados ao\n" +
                "desenvolvimento de relações afetivas saudáveis em que o diálogo entre os parceiros a\n" +
                "respeito da saúde sexual seja viabilizado;\n" +
                "$\\newline$7. Campanhas educativas em espaços formais e não formais para desmistificar crenças e\n" +
                "padrões morais de compreensão do protagonismo feminino diante da compra, do porte e\n" +
                "da negociação do uso de preservativo com os parceiros;\n" +
                "$\\newline$8. Propostas de políticas públicas para a promoção de qualidade de vida seja na atenção\n" +
                "primária, seja em campanhas educativas.");
        questaoDiscusiva1.setImagem(true);
        questaoDiscusiva1.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoDiscusiva1.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoDiscusiva questaoDiscusiva2 = new QuestaoDiscusiva();
        questaoDiscusiva2.setId(INICIOQUESTAO.longValue());
        questaoDiscusiva2.setAno(ANO);
        questaoDiscusiva2.setDescricao("Com base nessas falas, discorra sobre a importância do nome para as pessoas trângeneras e, nesse contexto, proponha uma medida, no âmbito das políticas públicas, que tenha como objetivo facilitar o acesso dessas pessoas à cidadania.");
        questaoDiscusiva2.setTipoFormcao(EFormacao.GERAL);
        questaoDiscusiva2.setProva(ETipoQuestaoProva.ENADE);
        questaoDiscusiva2.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoDiscusiva2.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoDiscusiva2.setResposta("O estudante deve mencionar que o nome, materializado nos documentos oficiais de\n" +
                "identificação, quando não condiz com a identidade de gênero, pode gerar diversos problemas\n" +
                "relacionados ao acesso das pessoas à cidadania, tais como: acesso à saúde e educação, direito\n" +
                "ao voto e inserção no mundo do trabalho.\n" +
                "$\\newline$Como política pública, o estudante pode mencionar:\n" +
                "$\\newline$ - Facilitar a mudança dos documentos para pessoas transgêneras, reconhecendo a\n" +
                "autonomia das pessoas em relação à definição de sua identidade de gênero;\n" +
                "$\\newline$ - Elaboração de leis que garantam a mudança do nome e assegurem outros\n" +
                "direitos para as pessoas transexuais;\n" +
                "$\\newline$ - Ampliação do acesso à saúde, através de atendimento pelo SUS e\n" +
                "implementação de núcleos de assistência psicológica para pessoas\n" +
                "transgêneras e familiares;\n" +
                "$\\newline$ - Tornar obrigatório que estabelecimentos comerciais e empresas utilizem o nome\n" +
                "social das pessoas que assim solicitarem, sejam clientes ou empregados;\n" +
                "$\\newline$ - Campanhas de conscientização social contra o preconceito e campanhas\n" +
                "educativas específicas a serem realizadas em ambiente escolar;\n" +
                "$\\newline$ - Desenvolvimento de ações afirmativas de inclusão pessoas transgêneras;\n" +
                "$\\newline$ - Adoção de sanções legais para quem violar o direito à autodeterminação de\n" +
                "gênero.");
        questaoDiscusiva2.setImagem(true);
        questaoDiscusiva2.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoDiscusiva2.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa3 = new QuestaoAlternativa();
        questaoAlternativa3.setId(INICIOQUESTAO.longValue());
        questaoAlternativa3.setAno(ANO);
        questaoAlternativa3.setDescricao("Considerando o texto e as informações apresentadas nos gráficos abaixo, assinale a opção correta.");
        questaoAlternativa3.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa3.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa3.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa3.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa3.setAlternativaCorreta("c");
        questaoAlternativa3.setImagem(true);
        questaoAlternativa3.setAlternativasA("A contribuição dos quatro maiores países do bloco somou 41,13%.");
        questaoAlternativa3.setAlternativasB("O grupo \"Outros países\" contribuiu para esse bloco econômico com 42,1%");
        questaoAlternativa3.setAlternativasC("A diferença da contribuição do Reino Unido em relação ao recebido do bloco econômico foi 38,94%.");
        questaoAlternativa3.setAlternativasD("A soma das participações dos três países com maior contribuição para o bloco econômico supera 50%.");
        questaoAlternativa3.setAlternativasE("O percentual de participação do Reino Unido com o bloco econômico em 2014 foi de 17,8%, oque o colocou entre os quatro maiores participantes.");
        questaoAlternativa3.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa3.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa4 = new QuestaoAlternativa();
        questaoAlternativa4.setId(INICIOQUESTAO.longValue());
        questaoAlternativa4.setAno(ANO);
        questaoAlternativa4.setDescricao("Considerando as informações apresentadas no texto abaixo, avalie as afirmações a seguir. $\\newline$I. Os principais desafios da agricultura familiar estão relacionados à segurança alimentar, à sustentabilidade ambiental e à capacidade produtiva. $\\newline$II. As politicas públicas para o desenvolvimento da agricultura familiar devem fomentar a inovação, respeitando o tamanho das propriedades, as tecnologias utilizadas, a integração de mercados e as configurações ecológicas. $\\newline$III. A maioria das propriedades agricolas no mundo tem caràter familiar, entretanto o trabalho realizado nessas propriedades majoritariamente resultante da contratação mão de obra assalariada. \n" +
                "$\\newline$É correto o que se afirma em ");
        questaoAlternativa4.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa4.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa4.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa4.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa4.setAlternativaCorreta("c");
        questaoAlternativa4.setImagem(true);
        questaoAlternativa4.setAlternativasA("I, apenas.");
        questaoAlternativa4.setAlternativasB("III, apenas.");
        questaoAlternativa4.setAlternativasC("I e II, apenas.");
        questaoAlternativa4.setAlternativasD("II e III, apenas.");
        questaoAlternativa4.setAlternativasE("I, II e III.");
        questaoAlternativa4.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa4.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa5 = new QuestaoAlternativa();
        questaoAlternativa5.setId(INICIOQUESTAO.longValue());
        questaoAlternativa5.setAno(ANO);
        questaoAlternativa5.setDescricao("Considerando as informações do texto, os dados apresentados na tabela, uma tarifa de R$ 0,50 por kWh em bandeira verde e um mês de 30 dias, avalie as afirmações a seguir. $\\newline$I. Em bandeira amarela, o valor mensal da tarifa de energia elétrica para um chuveiro de 3 500 W seria de R$ 1,05, e de R$ 1,65, para um chuveiro de 5 500 W. $\\newline$II. Deixar um carregador de celular e um modem de internet em stand-by conectados na rede de energia durante 24 horas representa um gasto mensal de R$ 5,40 na tarifa de energia elétrica em bandeira verde, e de R$ 5,78, em bandeira amarela. $\\newline$III. Em bandeira verde, o consumidor gastaria mensalmente R$ 3,90 a mais na tarifa de energia elétrica em relação a cada lâmpada incandescente usada no lugar de uma lâmpada LED. $\\newline$É correto o que se afirma em");
        questaoAlternativa5.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa5.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa5.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa5.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa5.setAlternativaCorreta("b");
        questaoAlternativa5.setImagem(true);
        questaoAlternativa5.setAlternativasA("II, apenas.");
        questaoAlternativa5.setAlternativasB("III, apenas.");
        questaoAlternativa5.setAlternativasC("I e II, apenas.");
        questaoAlternativa5.setAlternativasD("II e III, apenas.");
        questaoAlternativa5.setAlternativasE("I, II e III.");
        questaoAlternativa5.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa5.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa6 = new QuestaoAlternativa();
        questaoAlternativa6.setId(INICIOQUESTAO.longValue());
        questaoAlternativa6.setAno(ANO);
        questaoAlternativa6.setDescricao("Com base nos textos 1 e 2, é correto afirmar que o tempo de recepção típico da televisão como veículo de comunicação estimula a");
        questaoAlternativa6.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa6.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa6.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa6.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa6.setAlternativaCorreta("b");
        questaoAlternativa6.setImagem(true);
        questaoAlternativa6.setAlternativasA("contemplação das imagens animadas como meio de reflexão acerca do estado de coisas no mundo contemporâneo, traduzido em forma de espetáculo.  ");
        questaoAlternativa6.setAlternativasB("fragmentação e o excesso de informação, que evidenciam a opacidade do mundo contemporâneo, cada vez mais impregnado de imagens e informações superficiais.");
        questaoAlternativa6.setAlternativasC("especialização do conhecimento, com vistas a promover uma difusão de valores e princípios amplos, com espaço garantido para a diferença cultural como capital simbólico valorizado.");
        questaoAlternativa6.setAlternativasD("atenção concentrada do telespectador em determinado assunto, uma vez que os recursos expresssivos próprios do meio garantem a motivação necessária para o foco em determinado assunto.");
        questaoAlternativa6.setAlternativasE("reflexão crítica do telespectador, uma vez que permite o acesso a uma sequência de assuntos de interesse público que são apresentadors de forma justaposta, o que permite o estabelecimento de comparações.");
        questaoAlternativa6.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa6.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa7 = new QuestaoAlternativa();
        questaoAlternativa7.setId(INICIOQUESTAO.longValue());
        questaoAlternativa7.setAno(ANO);
        questaoAlternativa7.setDescricao("A partir das informações apresentadas, assinale a opção correta.");
        questaoAlternativa7.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa7.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa7.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa7.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa7.setAlternativaCorreta("c");
        questaoAlternativa7.setImagem(true);
        questaoAlternativa7.setAlternativasA("O uso hidrogel, em caso de estiagem, propicia a mortalidade dos pés de café.");
        questaoAlternativa7.setAlternativasB("O hidrogel criado a partir de polímeros naturais deve ter seu uso restrito a solos áridos.");
        questaoAlternativa7.setAlternativasC("Os hidrogéis são usados em culturas agrícolas e florestais e em diferentes tipos de solos.");
        questaoAlternativa7.setAlternativasD("O uso de hidrogéis naturais é economicamente viável em lavouras tradicionais de larga escala.");
        questaoAlternativa7.setAlternativasE("O uso dos hidrogéis permite que as plantas sobrevivam sem a água da irrigação ou das chuvas.");
        questaoAlternativa7.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa7.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa8 = new QuestaoAlternativa();
        questaoAlternativa8.setId(INICIOQUESTAO.longValue());
        questaoAlternativa8.setAno(ANO);
        questaoAlternativa8.setDescricao("A partir das informações do texto, conclui-se que");
        questaoAlternativa8.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa8.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa8.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa8.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa8.setAlternativaCorreta("e");
        questaoAlternativa8.setImagem(true);
        questaoAlternativa8.setAlternativasA("o processo de acolhimento dos imigrantes haitianos tem sido pautado por características fortemente associadas ao povo brasileiro: a solidariedade e o respeito às diferenças.");
        questaoAlternativa8.setAlternativasB("as reações xenogóbicas estão relacionadas ao fato de que os imigrantes são concorrentes diretos para os postos de trabalho de maior prestígio na sociedade, aumentando a disputa por boas vagas de emprego. ");
        questaoAlternativa8.setAlternativasC("o acolhimento promovido pelos brasileiros aos imigrantes oriundos de países do leste europeu tende a ser semelhante ao oferecido aos imigrantes haitianos, pois no Brasil vigora a ideia de democracia recial e do respeito às etnias.");
        questaoAlternativa8.setAlternativasD("o nacionalismo exacerbado de classes sociais mais favorecidas, no Brasil, motiva a rejeição aos imigrantes haitianos e a perseguição contra os brasileiros que pretendem morar fora do seu país em busca de melhores condições de vida.");
        questaoAlternativa8.setAlternativasE("a crescente onda de xenofobia que vem se destacando no Brasil evidencia que o preconceito e a rejeição por parte dos brasileiros em relação aos imigrantes haitianos é pautada pela discriminação social e pelo racismo.");
        questaoAlternativa8.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa8.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa9 = new QuestaoAlternativa();
        questaoAlternativa9.setId(INICIOQUESTAO.longValue());
        questaoAlternativa9.setAno(ANO);
        questaoAlternativa9.setDescricao("Com base nas informações apresentadas, assinale a alternativa correta.");
        questaoAlternativa9.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa9.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa9.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa9.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa9.setAlternativaCorreta("a");
        questaoAlternativa9.setImagem(true);
        questaoAlternativa9.setAlternativasA("A produção das panelas de barro abrange interrelações com natureza local, de onde se extrai a matéria-prima indispensável à confecção das peças ceramistas.");
        questaoAlternativa9.setAlternativasB("A relação entre as tradições das panelas de barro e o prato típico da culinária indígena permanece inalterada, o que viabiliza a manutenção da identidade cultural capixaba.");
        questaoAlternativa9.setAlternativasC("A demanda por bens culturais produzidos por comunidades tradicionais insere o ofício das paneleiras no mercado comercial, com retornos positivos para toda a comunidade.");
        questaoAlternativa9.setAlternativasD("A inserção das panelas de barro no mercado turístico reduz a dimensão histórica, cultural e estética do ofício das paneleiras à dimensão econômica da comercialização de produtos artesanais.");
        questaoAlternativa9.setAlternativasE("O ofício das peneleiras representa uma forma de resistência sociocultural da comunidade tradicional na medida em que o estado do Espírito Santo mantém-se alheio aos modos de produção, divulgação e comercialização dos produtos.");
        questaoAlternativa9.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa9.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa10 = new QuestaoAlternativa();
        questaoAlternativa10.setId(INICIOQUESTAO.longValue());
        questaoAlternativa10.setAno(ANO);
        questaoAlternativa10.setDescricao("Considerando que os ODS devem ser implementados por meio de ações que integrem a economia, a sociedade e a biosfera, avalie as afirmações a seguir.\n" +
                "$\\newline$I. O capital humano deve ser capacitado para atender às demandas por pesquisa e inovação em áreas estratégicas para o desenvolvimento sustentável.\n" +
                "$\\newline$II. A padronização cultural dinamiza a difusão do conhecimento científico e tecnológico entre as nações para a promoção do desenvolvimento sustentável.\n" +
                "$\\newline$III. Os países devem incentivar políticas de desenvolvimento do empreendedirismo e de atividades produtivas com geração de empregos que garantam a dignidade da pessoa humana.\n" +
                "$\\newline$É correto o que se afirma em");
        questaoAlternativa10.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa10.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa10.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa10.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa10.setAlternativaCorreta("d");
        questaoAlternativa10.setImagem(true);
        questaoAlternativa10.setAlternativasA("II, apenas.");
        questaoAlternativa10.setAlternativasB("III, apenas.");
        questaoAlternativa10.setAlternativasC("I e II, apenas.");
        questaoAlternativa10.setAlternativasD("II e III, apenas.");
        questaoAlternativa10.setAlternativasE("I, II e III.");
        questaoAlternativa10.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa10.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        //WARNING Questão precisa que o usuário desenhe a resposta, não sendo possivel implementar
        QuestaoAlternativa questaoAlternativa11 = new QuestaoAlternativa();
        questaoAlternativa11.setId(INICIOQUESTAO.longValue());
        questaoAlternativa11.setAno(ANO);
        questaoAlternativa11.setDescricao("Anulada");
        questaoAlternativa11.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa11.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa11.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa11.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa11.setAlternativaCorreta("*");

        questaoAlternativa11.setAlternativasA("Anulada");
        questaoAlternativa11.setAlternativasB("Anulada");
        questaoAlternativa11.setAlternativasC("Anulada");
        questaoAlternativa11.setAlternativasD("Anulada");
        questaoAlternativa11.setAlternativasE("Anulada");
        questaoAlternativa11.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        //WARNING Questão precisa que o usuário desenhe a resposta, não sendo possivel implementar
        QuestaoAlternativa questaoAlternativa12 = new QuestaoAlternativa();
        questaoAlternativa12.setId(INICIOQUESTAO.longValue());
        questaoAlternativa12.setAno(ANO);
        questaoAlternativa12.setDescricao("Anulada");
        questaoAlternativa12.setArea(EArea.MATEMATICA);
        questaoAlternativa12.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa12.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa12.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa12.setAlternativaCorreta("*");

        questaoAlternativa12.setAlternativasA("Anulada");
        questaoAlternativa12.setAlternativasB("Anulada");
        questaoAlternativa12.setAlternativasC("Anulada");
        questaoAlternativa12.setAlternativasD("$Anulada");
        questaoAlternativa12.setAlternativasE("Anulada");
        questaoAlternativa12.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        //WARNING Questão precisa que o usuário desenhe a resposta, não sendo possivel implementar
        QuestaoAlternativa questaoAlternativa13 = new QuestaoAlternativa();
        questaoAlternativa13.setId(INICIOQUESTAO.longValue());
        questaoAlternativa13.setAno(ANO);
        questaoAlternativa13.setDescricao("Anulada");
        questaoAlternativa13.setArea(EArea.MATEMATICA);
        questaoAlternativa13.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa13.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa13.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa13.setAlternativaCorreta("*");

        questaoAlternativa13.setAlternativasA("Anulada");
        questaoAlternativa13.setAlternativasB("Anulada");
        questaoAlternativa13.setAlternativasC("Anulada");
        questaoAlternativa13.setAlternativasD("$Anulada");
        questaoAlternativa13.setAlternativasE("Anulada");
        questaoAlternativa13.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa14 = new QuestaoAlternativa();
        questaoAlternativa14.setId(INICIOQUESTAO.longValue());
        questaoAlternativa14.setAno(ANO);
        questaoAlternativa14.setDescricao("Pelo exposto no texto abaixo, após a inserção de um nó com valor 3 na árvore AVL exemplificada, é correto afirmar que ela ficará com a seguinte configuração:");
        questaoAlternativa14.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa14.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa14.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa14.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa14.setAlternativaCorreta("a");
        questaoAlternativa14.setImagem(true);
        questaoAlternativa14.setAlternativaImagem(true);
        questaoAlternativa14.setAlternativasA("COLOCAR IMAGEM ALTERNATIVA");
        questaoAlternativa14.setAlternativasB("COLOCAR IMAGEM ALTERNATIVA");
        questaoAlternativa14.setAlternativasC("COLOCAR IMAGEM ALTERNATIVA");
        questaoAlternativa14.setAlternativasD("COLOCAR IMAGEM ALTERNATIVA");
        questaoAlternativa14.setAlternativasE("COLOCAR IMAGEM ALTERNATIVA");
        questaoAlternativa14.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa14.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa15 = new QuestaoAlternativa();
        questaoAlternativa15.setId(INICIOQUESTAO.longValue());
        questaoAlternativa15.setAno(ANO);
        questaoAlternativa15.setDescricao("Considere os seguintes requisitos para desenvolvimento de uma solução para uma rede de restaurantes fost-food:\n" +
                "$\\newline$Quando o status de um pedido é atualizado, todos os dispositivos dos envolvidos devem receber a informação. Os sistemas a ser atualizados incluem os acessados pelo entregador, pela linha de produção e pela central de atendimento. Espera-se ainda que outros sistemas possam ser incluídos futuramente (por exemplo, sistema de pedido on-line do cliente), devendo se comportar da mesma forma.\n" +
                "$\\newline$Considerando esse contexto, avalie as asserções a seguir e a relação proposta entre elas.\n" +
                "$\\newline$I. O requisito apresentado pode ser Implementado com a utilização do padrão de projeto Observer\n" +
                "$\\newline$PORQUE\n" +
                "$\\newline$O padrão de projeto Observer realiza o estilo arquitetural cliente-servidor, no qual o servidor é responsável por enviar notificações aos clientes sempre que houver atualização em alguma informação de interesse.\n" +
                "$\\newline$A respeito dessas asserções, assinale a opção correta.");
        questaoAlternativa15.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa15.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa15.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa15.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa15.setAlternativaCorreta("c");

        questaoAlternativa15.setAlternativasA("As asserções I e II são proposições verdadeiras, e a II é uma justificativa correta da I.");
        questaoAlternativa15.setAlternativasB("As asserções I e II são proposições verdadeiras, mas a II não é uma justificativa correta da I.");
        questaoAlternativa15.setAlternativasC("A asserção I é uma proposição verdadeira, e a II é uma proposição falsa.");
        questaoAlternativa15.setAlternativasD("A asserção I é uma proposição falsa, e a II é uma proposição verdadeira.");
        questaoAlternativa15.setAlternativasE("As asserções I e II são proposições falsas.");
        questaoAlternativa15.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa16 = new QuestaoAlternativa();
        questaoAlternativa16.setId(INICIOQUESTAO.longValue());
        questaoAlternativa16.setAno(ANO);
        questaoAlternativa16.setDescricao("O encapsulamento é um mecanismo da programção orientada a objetos no qual os membros de uma classe (atributos e métodos) constituem uma caixa preta. O nível de visibilidade dos membros pode ser definido pelos modificadores de visibilidade \"privado\", \"público\" e \"protegido\". Com relação ao comportamento gerado pelos modificadores de visibilidade, assinale a opção correta.");
        questaoAlternativa16.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa16.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa16.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa16.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa16.setAlternativaCorreta("e");

        questaoAlternativa16.setAlternativasA("Um atributo privado pode ser acesssado pelos métodos privados da própria classe e pelos métodos protegidos das suas classes descendentes.");
        questaoAlternativa16.setAlternativasB("Um atributo privado pode ser acessado pelos métodos públicos da própria classe e pelos métodos públicos das suas descendentes.");
        questaoAlternativa16.setAlternativasC("Um membro público é visível na classe à qual ele pertence, mas não é visível nas suas classes descendentes.");
        questaoAlternativa16.setAlternativasD("Um método protegido não pode acessar os atributos privados e declarados na própria classe.");
        questaoAlternativa16.setAlternativasE("Um membro protegido é visível na classe à qual pertence e em suas classes descendentes.");
        questaoAlternativa16.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa17 = new QuestaoAlternativa();
        questaoAlternativa17.setId(INICIOQUESTAO.longValue());
        questaoAlternativa17.setAno(ANO);
        questaoAlternativa17.setDescricao("Considere o funciomento de uma memória de acesso aleatório, avalie as afirmações a seguir.\n" +
                "$\\newline$I. Se a largura do registrador de endereços da memória for de 8 bits, o tamanho máximo dessa unidade de memória será de 256 células.\n" +
                "$\\newline$II. Se o registrador de dados da memória tiver 8 bits, será necessária mais que uma operação para armazenar o valor inteiro 2 024 nessa unidade de memória.\n" +
                "$\\newline$III. Se o registrador de dados da memória tiver 12 bits, é possível que a largura da memória seja de 8 bits.\n" +
                "$\\newline$É correto o que se afirma em");
        questaoAlternativa17.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa17.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa17.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa17.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa17.setAlternativaCorreta("c");
        questaoAlternativa17.setImagem(true);
        questaoAlternativa17.setAlternativasA("I, apenas.");
        questaoAlternativa17.setAlternativasB("III, apenas.");
        questaoAlternativa17.setAlternativasC("I e II, apenas.");
        questaoAlternativa17.setAlternativasD("II e III, apenas.");
        questaoAlternativa17.setAlternativasE("I, II e III.");
        questaoAlternativa17.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa17.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa18 = new QuestaoAlternativa();
        questaoAlternativa18.setId(INICIOQUESTAO.longValue());
        questaoAlternativa18.setAno(ANO);
        questaoAlternativa18.setDescricao("Os sistemas de refrigeração de piscinas de combustível em usinas nucleares evitam que a temperatura desses tanques exceda o limite de segurança. O circuito representado na figura a seguir atende aos requisitos necessários para o controle da ativação do sistema de resfriamento quando a temperatura está próxima de seu ponto crítico. O diagrama de tempo ilustrado na figura apresenta uma amostra das temperturas lidas desde o momento $t_{1}\\,\\,\\,ao\\,\\,\\,t_{8}$. Os sinais de entrada Ta, Tb e Tc são termômetros que medem a temperatura da piscina em diferentes pontos ao longo do dia e S é o terminal de acionamento do sistema. Nesse contexto, assinale a opção em que são apresentados os momentos em que o sistema foi acionado.");
        questaoAlternativa18.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa18.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa18.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa18.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa18.setAlternativaCorreta("b");
        questaoAlternativa18.setImagem(true);
        questaoAlternativa18.setAlternativasA("$t_{1},t_{4}\\,\\,e\\,\\,t_{8}$.");
        questaoAlternativa18.setAlternativasB("$t_{1},t_{6}\\,\\,e\\,\\,t_{8}$.");
        questaoAlternativa18.setAlternativasC("$t_{2},t_{4}\\,\\,e\\,\\,t_{6}$.");
        questaoAlternativa18.setAlternativasD("$t_{2},t_{6}\\,\\,e\\,\\,t_{8}$.");
        questaoAlternativa18.setAlternativasE("$t_{3},t_{5}\\,\\,e\\,\\,t_{7}$.");
        questaoAlternativa18.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa18.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa19 = new QuestaoAlternativa();
        questaoAlternativa19.setId(INICIOQUESTAO.longValue());
        questaoAlternativa19.setAno(ANO);
        questaoAlternativa19.setDescricao("Uma relação de equivalência é uma relação binária R em um conjunto A, tal que R é reflexiva, simétrica e transitiva. Considere as relações binárias apresentadas a seguir. $\\newline R1 = \\left\\{(a,b):a,b \\in \\mathbb{N}\\,\\,e\\,\\,a=b\\right\\};\\newline\n" +
                "R2 = \\left\\{(a,b):a,b \\in \\mathbb{N}\\,\\,e\\,\\,a \\leq b\\right\\}; \\newline\n" +
                "R3 = \\left\\{(a,b):a,b \\in \\mathbb{N}\\,\\,e\\,\\,a=b - 1\\right\\}; \\newline\n" +
                "R4 = \\left\\{(a,b):a,b \\in \\mathbb{N}\\,\\,e\\,\\,a+b \\,\\,é\\,\\,um\\,\\,número\\,\\,par\\right\\}. \\newline$ São relações de equivalência apenas o que se apresenta em");
        questaoAlternativa19.setArea(EArea.MATEMATICA);
        questaoAlternativa19.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa19.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa19.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa19.setAlternativaCorreta("c");

        questaoAlternativa19.setAlternativasA("R2 e R3.");
        questaoAlternativa19.setAlternativasB("R1 e R3.");
        questaoAlternativa19.setAlternativasC("R1 e R4.");
        questaoAlternativa19.setAlternativasD("R1, R2 e R4.");
        questaoAlternativa19.setAlternativasE("R2,R3 e R4.");
        questaoAlternativa19.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa20 = new QuestaoAlternativa();
        questaoAlternativa20.setId(INICIOQUESTAO.longValue());
        questaoAlternativa20.setAno(ANO);
        questaoAlternativa20.setDescricao("Considerando um ataque virtual pela técnica \"homem no meio\", por meio de Address Resolution Protocol (ARP) spoofing, avalie as afirmações a seguir.\n" +
                "$\\newline$I. O problema do compartilhamento de chave presente no projeto de segurança do AP pode ser resolvido com a utilização de um protocolo baseado em chave pública para negociar chaves individuais, como é feito no Transport Layer Security (TLS) / Secure Sockets Layer (SSL).\n" +
                "$\\newline$II. O problema do desvio de tráfego causado pelo ataque de homem no meio pode ser evitado com a configuração de um firewall nos pontos de acesso que filtram tráfego entre clientes de uma mesma subrede.\n" +
                "$\\newline$III. O problema da falta de autenticação dos pontos de acesso sem fio pode ser contornado, obrigando-se o ponto de acesso a fornecer um certificado que possa ser autenticado pelo uso de uma chave pública obtida de terceiros.\n" +
                "$\\newline$IV. A vulnerabilidade das chaves de 40 bits ou 64 bits a ataques de força bruta pode ser evitada utilizando-se um AP que permita chaves de 128 bits e limitando-se o tráfego a dispositivos compatíveis com chaves de 128 bits.\n" +
                "$\\newline$É correto apenas o que se afirma em");
        questaoAlternativa20.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa20.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa20.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa20.setDisciplina(EDisciplina.SEGURANÇA_COMPUTACIONAL);
        questaoAlternativa20.setAlternativaCorreta("d");
        questaoAlternativa20.setImagem(true);
        questaoAlternativa20.setAlternativasA("I e II.");
        questaoAlternativa20.setAlternativasB("I e III.");
        questaoAlternativa20.setAlternativasC("II e IV.");
        questaoAlternativa20.setAlternativasD("I, III e IV.");
        questaoAlternativa20.setAlternativasE("II, III e IV.");
        questaoAlternativa20.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa20.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa21 = new QuestaoAlternativa();
        questaoAlternativa21.setId(INICIOQUESTAO.longValue());
        questaoAlternativa21.setAno(ANO);
        questaoAlternativa21.setDescricao("Em relação à segurança da informação, avalie as afirmações a seguir.\n" +
                "$\\newline$I. As empresas sempre estarão vulneráveis, pois o fator humano é o elo mais fraco da segurança da informação.\n" +
                "$\\newline$II. A segurança da informação não é um produto e, sim, um processo.\n" +
                "$\\newline$III. A ética profissional é um importante fator a ser considerado na segurança da informação.\n" +
                "$\\newline$É correto o que se afirma em");
        questaoAlternativa21.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa21.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa21.setDisciplina(EDisciplina.SEGURANÇA_COMPUTACIONAL);
        questaoAlternativa21.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa21.setAlternativaCorreta("e");
        questaoAlternativa21.setImagem(true);
        questaoAlternativa21.setAlternativasA("I, apenas.");
        questaoAlternativa21.setAlternativasB("II, apenas.");
        questaoAlternativa21.setAlternativasC("I e III, apenas. ");
        questaoAlternativa21.setAlternativasD("II e III, apenas.");
        questaoAlternativa21.setAlternativasE("I, II e III.");
        questaoAlternativa21.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa21.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa22 = new QuestaoAlternativa();
        questaoAlternativa22.setId(INICIOQUESTAO.longValue());
        questaoAlternativa22.setAno(ANO);
        questaoAlternativa22.setDescricao("A respeito da adoção de técnicas de IA no processo educacional, avalie as asserções a seguir e a relação proposta entre elas.\n" +
                "$\\newline$I. Algoritmos de IA adaptativos podem auxiliar a experiência de aprendizado da pessoa de acordo com o seu perfil.\n" +
                "$\\newline$PORQUE\n" +
                "$\\newline$II. Os sistemas com algoritmos de IA adaptativos analisam respostas anteriores, buscando determinados padrões que possam indicar pontos de dificuldade ou facilidade da pessoa em relação a determinado assunto.\n" +
                "$\\newline$A respeito dessas asserções, assinale a opção correta.");
        questaoAlternativa22.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa22.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa22.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa22.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa22.setAlternativaCorreta("a");
        questaoAlternativa22.setImagem(true);
        questaoAlternativa22.setAlternativasA("As asserções I e II são proposições verdadeiras, e a II é uma justificativa correta da I.");
        questaoAlternativa22.setAlternativasB("As asserções I e II são proposições verdadeiras, mas a II não é uma justificativa correta da I.");
        questaoAlternativa22.setAlternativasC("A asserção I é uma proposição verdadeira, e a II é uma proposição falsa.");
        questaoAlternativa22.setAlternativasD("A asserção I é uma proposição falsa, e a II é uma proposição verdadeira.");
        questaoAlternativa22.setAlternativasE("As asserções I e II são proposições falsas.");
        questaoAlternativa22.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa22.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa23 = new QuestaoAlternativa();
        questaoAlternativa23.setId(INICIOQUESTAO.longValue());
        questaoAlternativa23.setAno(ANO);
        questaoAlternativa23.setDescricao("O algoritmo a seguir recebe um vetor v de números inteiros e rearranja esse vetor de tal forma que seus elementos, ao final, estejam ordenados de forma crescente. Considerando que nesse algoritmo há erros de lógica que devem ser corrigidos para que os elementos sejam ordenados de forma crescente, assinale a opção correta no que se refere às correções adequadas.");
        questaoAlternativa23.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa23.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa23.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa23.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa23.setAlternativaCorreta("d");
        questaoAlternativa23.setImagem(true);
        questaoAlternativa23.setAlternativasA("A linha 04 deve ser corrigida da seguinte forma: for(i = 1; i < n; i++0) e a linha 13, do seguinte modo: v[j - 1] = chave;");
        questaoAlternativa23.setAlternativasB("A linha 04 deve ser corrigida da seguinte forma: for(i = 1; i < n - 1; i++) e a linha 07, do seguinte modo: j = i + 1;");
        questaoAlternativa23.setAlternativasC("A linha 07 deve ser corrigida da seguinte forma: j = i + 1 e a linha 08, do seguinte modo: while(j >= 0 && v[j] > chave).");
        questaoAlternativa23.setAlternativasD("A linha 08 deve ser corrigida da seguinte forma: while (j >= 0 && v[j] > chave) e a linha 10, do seguinte modo: v[j + 1] = v[j];");
        questaoAlternativa23.setAlternativasE("A linha 10 deve ser corrigida da seguinte forma: v[j + 1] = v[j]; e a linha 13, do seguinte modo: v[j - 1] = chave;");
        questaoAlternativa23.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa23.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa24 = new QuestaoAlternativa();
        questaoAlternativa24.setId(INICIOQUESTAO.longValue());
        questaoAlternativa24.setAno(ANO);
        questaoAlternativa24.setDescricao("Considere o diagrama Entidade-Relacionamento apresentado abaixo. Qual código SQL exibe o nome de todos os deputados que comparecem a pelo menos uma seção e as datas de cada seção em que os deputados participaram?");
        questaoAlternativa24.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa24.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa24.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa24.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa24.setAlternativaCorreta("e");
        questaoAlternativa24.setImagem(true);
        questaoAlternativa24.setAlternativasA("SELECT Deputado.nomeDeputado, Secao.dataSecao FROM Deputado,\n" +
                "Participacao, Secao WHERE Deputado.idDeputado=Participacao.idDeputado;");
        questaoAlternativa24.setAlternativasB("SELECT Deputado.nomeDeputado, Secao.dataSecao FROM Deputado,\n" +
                "Participacao, Secao WHERE Deputado.idDeputado = Participacao.\n" +
                "idDeputado OR Secao.idSecao = Participacao.idSecao;");
        questaoAlternativa24.setAlternativasC("SELECT Deputado.nomeDeputado, Secao.dataSecao FROM Deputado LEFT OUTER\n" +
                "JOIN Participacao ON Deputado.idDeputado = Participacao.idDeputado\n" +
                "LEFT OUTER JOIN Secao ON Secao.idSecao = Participacao.idSecao;");
        questaoAlternativa24.setAlternativasD("SELECT Deputado.nomeDeputado, Secao.dataSecao FROM Deputado RIGHT OUTER\n" +
                "JOIN Participacao ON Deputado.idDeputado = Participacao.idDeputado\n" +
                "RIGHT OUTER JOIN Secao ON Secao.idSecao = Participacao.idSecao;");
        questaoAlternativa24.setAlternativasE("SELECT Deputado.nomeDeputado, Secao.dataSecao FROM Deputado INNER\n" +
                "JOIN Participacao ON Deputado.idDeputado = Participacao.idDeputado\n" +
                "INNER JOIN Secao ON Participacao.idSecao=Secao.idSecao;");
        questaoAlternativa24.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa24.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa25 = new QuestaoAlternativa();
        questaoAlternativa25.setId(INICIOQUESTAO.longValue());
        questaoAlternativa25.setAno(ANO);
        questaoAlternativa25.setDescricao("Em redes de computadores, a camada de transporte é responsável pela tranferência de dados entre máquinas de origem e destino. Dois protocolos tradicionais para essa camada são o Transmission Control Protocol (TCP) e o User Datagram Protocol (UDP). Diferentemente do UDP, o TCP é orientado à conexão.\n" +
                "$\\newline$Com relação a esses protocolos, avalie as afirmações a seguir.\n" +
                "$\\newline$I. O UDP é mais eficiente que o TCP quando o tempo de envio de pacotes é fundamental.\n" +
                "$\\newline$II. O TCP é o mais utilizado em jogos on-line para a apresentação gráfica. \n" +
                "$\\newline$III. O TCP é mais eficiente que o UDP quando a confiabilidade de entrega de dados é fundamental.\n" +
                "$\\newline$É correto o que se afirma em");
        questaoAlternativa25.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa25.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa25.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa25.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa25.setAlternativaCorreta("d");

        questaoAlternativa25.setAlternativasA("II, apenas.");
        questaoAlternativa25.setAlternativasB("III, apenas.");
        questaoAlternativa25.setAlternativasC("I e II, apenas.");
        questaoAlternativa25.setAlternativasD("I e III, apenas.");
        questaoAlternativa25.setAlternativasE("I, II e III.");
        questaoAlternativa25.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa26 = new QuestaoAlternativa();
        questaoAlternativa26.setId(INICIOQUESTAO.longValue());
        questaoAlternativa26.setAno(ANO);
        questaoAlternativa26.setDescricao("Na lógica proposicional, definem-se regras para determinar o valor-verdade (verdadeiro ou falso) de sentenças em relação a um modelo particular. Essas regras permitem representar reciocíonios lógicos comuns das linguagens naturais.\n" +
                "$\\newline$Nesse contexto, considere a sentença e as proposições lógicas a seguir. \n" +
                "$\\newline$\"Um veículo que é elétrico (E) pode ser um robô (R) se for autônomo (A), caso contrário não é um robô (R)\". \n" +
                "$\\newline P1 = (E \\wedge R) \\leftrightarrow A;\\newline P2 = E\\rightarrow (R \\leftrightarrow A);\\newline P3 = E \\rightarrow ((A \\rightarrow R) \\vee \\neg R).$\n" +
                "$\\newline$A sentença pode ser representada pela(s) expressão(ões) lógica(s)");
        questaoAlternativa26.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa26.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa26.setArea(EArea.MATEMATICA);
        questaoAlternativa26.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa26.setAlternativaCorreta("a");

        questaoAlternativa26.setAlternativasA("P2, apenas.");
        questaoAlternativa26.setAlternativasB("P3, apenas.");
        questaoAlternativa26.setAlternativasC("P1 e P2, apenas.");
        questaoAlternativa26.setAlternativasD("P1 e P3, apenas.");
        questaoAlternativa26.setAlternativasE("P1, P2 e P3.");
        questaoAlternativa26.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa27 = new QuestaoAlternativa();
        questaoAlternativa27.setId(INICIOQUESTAO.longValue());
        questaoAlternativa27.setAno(ANO);
        questaoAlternativa27.setDescricao("Um país utiliza moedas de 1, 5, 10, 25 e 50 centavos. Um programador desenvolveu o método a seguir, que implementa a estratégia gulosa para o problema do troco mínimo. Esse método recebe como parâmetro um valor inteiro, em centavos, e retorna um array no qual cada posição indica a quantidade de moedas de cada valor.\n" +
                "$\\newline$public static int[] troco(int valor){\n" +
                "$\\newline$int[] moedas = new int[5];\n" +
                "$\\newline$moedas[4] = valor / 50;\n" +
                "$\\newline$valor = valor % 50;\n" +
                "$\\newline$moedas[3] = valor / 25;\n" +
                "$\\newline$valor = valor % 25;\n" +
                "$\\newline$moedas[2] = valor / 10;\n" +
                "$\\newline$valor = valor % 10;\n" +
                "$\\newline$moedas[1] = valor / 5;\n" +
                "$\\newline$valor = valor % 5;\n" +
                "$\\newline$moedas[0] = valor;\n" +
                "$\\newline$return(moedas);\n" +
                "$\\newline$}\n" +
                "$\\newline$Considerando o método apresentado, avalue as asserções a seguir e a relação proposta entre elas.\n" +
                "$\\newline$I. O método guloso encontra o menor número de moedas para o valor de entrada, considerando as moedas do país.\n" +
                "$\\newline$PORQUE\n" +
                "$\\newline$II. Métodos gulosos sempre encontram a solução global ótima.\n" +
                "$\\newline$A respeito dessas asserções, assinale a opção correta.");
        questaoAlternativa27.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa27.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa27.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa27.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa27.setAlternativaCorreta("c");

        questaoAlternativa27.setAlternativasA("As asserções I e II são proposições verdadeiras, e a II é uma justificativa correta da I.");
        questaoAlternativa27.setAlternativasB("As asserções I e II são proposições verdadeiras, mas a II não é uma justificativa correta da I.");
        questaoAlternativa27.setAlternativasC("A asserção I é uma proposição verdadeira, e a II é uma proposição falsa.");
        questaoAlternativa27.setAlternativasD("A asserção I é uma proposição falsa, e a II é uma proposição verdadeira.");
        questaoAlternativa27.setAlternativasE("As asserções I e II são proposições falsas.");
        questaoAlternativa27.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa28 = new QuestaoAlternativa();
        questaoAlternativa28.setId(INICIOQUESTAO.longValue());
        questaoAlternativa28.setAno(ANO);
        questaoAlternativa28.setDescricao("Considere o seguinte alfabeto: $\\\\ \\sum = \\left\\{(,),0,1,2,3,4,5,6,7,8,9,+,-\\right\\}.\\\\$ Considere, ainda, uma linguagem L definida sobre esse alfabeto.\n" +
                "L = {w | w $\\in \\sum *$, para cada ocorrência de '(' em w, existe uma ocorrência de ')'}\n" +
                "$\\newline$Por exemplo, a cadeia x = (2 + (3 - 4)) pertence a L, mas a cadeia y = (2 + (3 - 4) não pertence a L.\n" +
                "$\\newline$Com relação à linguagem L, avalie as asserções a seguir e a relação proposta entre elas.\n" +
                "$\\newline$I. A linguagem L não pode ser considerada regular.\n" +
                "$\\newline$PORQUE\n" +
                "$\\newline$II. Autômatos finitos não possuem mecanismos que permitam contar infinitamente o número de ocorências de determinado símbolo em uma cadeia.\n" +
                "$\\newline$A respeito dessas asserções, assinale a opção correta.");
        questaoAlternativa28.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa28.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa28.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa28.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa28.setAlternativaCorreta("a");

        questaoAlternativa28.setAlternativasA("As asserções I e II são proposições verdadeiras, e a II é uma justificativa correta da I.");
        questaoAlternativa28.setAlternativasB("As asserções I e II são proposições verdadeiras, mas a II não é uma justificativa correta da I.");
        questaoAlternativa28.setAlternativasC("A asserção I é uma proposição verdadeira, e a II é uma proposição falsa.");
        questaoAlternativa28.setAlternativasD("A asserção I é uma proposição falsa, e a II é uma proposição verdadeira.");
        questaoAlternativa28.setAlternativasE("As asserções I e II são proposições falsas.");
        questaoAlternativa28.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa29 = new QuestaoAlternativa();
        questaoAlternativa29.setId(INICIOQUESTAO.longValue());
        questaoAlternativa29.setAno(ANO);
        questaoAlternativa29.setDescricao("A figura abaixo exibe um grafo que representa um mapa rodoviário, no qual os vértices representam cidades e as arestas representam vias. Os pesos indicam o tempo atual de deslocamento entre duas cidades.$\\newline$Considerando que os tempos de ida e volta são iguais para qualquer via, avalie as afirmações a seguir desse grafo.\n" +
                "$\\newline$I. Dado o vértice de origem i, o algoritmo de Dijkstra encontra o menor tempo de deslocamento dentre a cidade i e todas as demais cidades do grafo.\n" +
                "$\\newline$II. Uma árvore geradora de custo mínimo gerada pelo algoritmo de Kruskal contém um caminho de custo mínimo cuja origem é i e cujo destino é k.\n" +
                "$\\newline$III. Se um caminho de custo mínimo entre os vértices i e k contém o vértice w, então o subcaminho de origem w e destino k deve também ser mínimo.\n" +
                "$\\newline$É correto o que se afirma em");
        questaoAlternativa29.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa29.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa29.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa29.setDisciplina(EDisciplina.GRAFOS);
        questaoAlternativa29.setAlternativaCorreta("e");
        questaoAlternativa29.setImagem(true);
        questaoAlternativa29.setAlternativasA("I, apenas.");
        questaoAlternativa29.setAlternativasB("II, apenas.");
        questaoAlternativa29.setAlternativasC("I e III, apenas.");
        questaoAlternativa29.setAlternativasD("II e III, apenas.");
        questaoAlternativa29.setAlternativasE("I, II e III.");
        questaoAlternativa29.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa29.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa30 = new QuestaoAlternativa();
        questaoAlternativa30.setId(INICIOQUESTAO.longValue());
        questaoAlternativa30.setAno(ANO);
        questaoAlternativa30.setDescricao("A sequência de Fibonacci é uma sequência de números inteiros que começa em 1, a que se segue 1, e na qual cada elemento subsequente é a soma dos dois elementos anteriores. A função fib a seguir calcula o n-ésimo elemento da sequência de Fibonacci:\n" +
                "$\\newline$unsigned int fib (unsigned int n)\f\n" +
                "$\\newline${\n" +
                "$\\newline$if (n < 2)\n" +
                "$\\newline$return 1;\n" +
                "$\\newline$return fib(n - 2) + fib (n - 1);\n" +
                "$\\newline$}\n" +
                "$\\newline$Considerando a implementação acima, avalie as afirmações a seguir.\n" +
                "$\\newline$I. A complexidade de tempo da função fib é exponencial no valor de n.\n" +
                "$\\newline$II. A complexidade de espaço da função fib é exponencial no valor de n.\n" +
                "$\\newline$III. É possível implementar uma versão iterativa de função fib com complexidade de tempo linear no valor de n e complexidade de espaço constante.\n" +
                "$\\newline$É correto o que se afirma em");
        questaoAlternativa30.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa30.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa30.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa30.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa30.setAlternativaCorreta("c");

        questaoAlternativa30.setAlternativasA("I, apenas.");
        questaoAlternativa30.setAlternativasB("II, apenas.");
        questaoAlternativa30.setAlternativasC("I e II, apenas.");
        questaoAlternativa30.setAlternativasD("II e III, apenas.");
        questaoAlternativa30.setAlternativasE("I, II e III.");
        questaoAlternativa30.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa31 = new QuestaoAlternativa();
        questaoAlternativa31.setId(INICIOQUESTAO.longValue());
        questaoAlternativa31.setAno(ANO);
        questaoAlternativa31.setDescricao("A figura a seguir mostra uma imagem de ressonância magnética corrompida por ruído do tipo \"sal e pimenta\". Para que o ruído seja atenuado e as bordas das estruturas representadas sejam preservadas, deve-se aplicar na imagem o filtro");
        questaoAlternativa31.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa31.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa31.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa31.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa31.setAlternativaCorreta("e");
        questaoAlternativa31.setImagem(true);
        questaoAlternativa31.setAlternativasA("Sobel.");
        questaoAlternativa31.setAlternativasB("da média.");
        questaoAlternativa31.setAlternativasC("Laplaciano.");
        questaoAlternativa31.setAlternativasD("do mínimo.");
        questaoAlternativa31.setAlternativasE("da mediana.");
        questaoAlternativa31.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa31.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa32 = new QuestaoAlternativa();
        questaoAlternativa32.setId(INICIOQUESTAO.longValue());
        questaoAlternativa32.setAno(ANO);
        questaoAlternativa32.setDescricao("Em relação aos modelos de iluminação apresentados abaixo, avalie as afirmações a seguir.\n" +
                "$\\newline$I. A aplicação do modelo de sombreamento constante causa na imagem um efeito visual denominado Bandas de Mach.\n" +
                "$\\newline$II. Embora seja útil para gerar imagens realísticas, o modelo de Phong mostra-se pouco eficiente na apresentação das reflexões especulares.\n" +
                "$\\newline$III. O modelo de sombreamento constante não é útil para gerar imagens realísticas porque ele dá destaque ap aspecto facetado da representação poliedral das superfícies.\n" +
                "$\\newline$IV. Para a utilixação do modelo de Phong, é necessário supor que a fonte de luz localiza-se no infinito.\n" +
                "$\\newline$É correto apenas o que se afirma em");
        questaoAlternativa32.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa32.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa32.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa32.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa32.setAlternativaCorreta("b");
        questaoAlternativa32.setImagem(true);
        questaoAlternativa32.setAlternativasA("I e II.");
        questaoAlternativa32.setAlternativasB("I e III.");
        questaoAlternativa32.setAlternativasC("II e IV.");
        questaoAlternativa32.setAlternativasD("I, III e IV.");
        questaoAlternativa32.setAlternativasE("II, III e IV.");
        questaoAlternativa32.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa32.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa33 = new QuestaoAlternativa();
        questaoAlternativa33.setId(INICIOQUESTAO.longValue());
        questaoAlternativa33.setAno(ANO);
        questaoAlternativa33.setDescricao("Os métodos ágeis são fundamentados no desenvolvimento e entrega incremental tendo em vista atender aos requisitos dos clientes. Eles agregam um conjunto de princípios provenientes no manifesto ágil, tais como: \n" +
                "$\\newline$- envolvimento do cliente;\n" +
                "$\\newline$- entrega incremental;\n" +
                "$\\newline$- pessoas, não processos;\n" +
                "$\\newline$- aceitação das mudanças;\n" +
                "$\\newline$- manutenção da simplicidade.\n" +
                "$\\newline$O Scrum é um exemplo de método ágil de gerenciamneto de projetos. Avalie as afirmações a seguir sobre a relação do Scrum com os princípios do manifesto ágil.\n" +
                "$\\newline$I. O Scrum adota a entrega incremental por meio de Sprints..\n" +
                "$\\newline$II. O Scrum adota a simplicidade por meio do uso da programação em pares.\n" +
                "$\\newline$III. O Scrum adota o envolvimento do cliente com a priorização e a negociação dos requisitos na concepção de Sprints.\n" +
                "$\\newline$É correto o que se afirma em");
        questaoAlternativa33.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa33.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa33.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa33.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa33.setAlternativaCorreta("d");

        questaoAlternativa33.setAlternativasA("II, apenas.");
        questaoAlternativa33.setAlternativasB("III, apenas.");
        questaoAlternativa33.setAlternativasC("I e II, apenas.");
        questaoAlternativa33.setAlternativasD("I e III, apenas.");
        questaoAlternativa33.setAlternativasE("I, II e III.");
        questaoAlternativa33.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa34 = new QuestaoAlternativa();
        questaoAlternativa34.setId(INICIOQUESTAO.longValue());
        questaoAlternativa34.setAno(ANO);
        questaoAlternativa34.setDescricao("O projetista do gerenciador de memória de um novo sistema operacional precisa escolher entre os algoritmos de substituição de páginas FIFO(First In First Out - o primeiro a entrar é o primeiro a sair) e LRU(Least Recently Used - menos recentemente usado). Para isso, avaliou o número de faltas de páginas obtidas em ambos os algoritmos para o tamanho de memória de 4 páginas, utilizando a sequência de acessos às páginas 1-2-3-4-1-2-5-1-2-3-4-5 de um processo e memória inicialmente vazia.\n" +
                "$\\newline$Com base nessa simulação, avalie as asserções a seguir e a relação proposta entre elas.\n" +
                "$\\newline$I. Na simulação proposta, é possível observar que os algoritmos FIFO e LRU apresentam o mesmo desempenho.\n" +
                "$\\newline$PORQUE\n" +
                "$\\newline$II. Os parâmetros utilizados na simulação são insuficientes para determinar a diferença de funcionamento entre os algoritmos.\n" +
                "$\\newline$A respeito dessas asserções, assinale a opção correta.");
        questaoAlternativa34.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa34.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa34.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa34.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa34.setAlternativaCorreta("e");

        questaoAlternativa34.setAlternativasA("As asserções I e II são proposições verdadeiras, e a II é uma justificativa correta da I.");
        questaoAlternativa34.setAlternativasB("As asserções I e II são proposições verdadeiras, mas a II não é uma justificativa correta da I.");
        questaoAlternativa34.setAlternativasC("A asserção I é uma proposição verdadeira, e a II é uma proposição falsa.");
        questaoAlternativa34.setAlternativasD("A asserção I é uma proposição falsa, e a II é uma proposição verdadeira.");
        questaoAlternativa34.setAlternativasE("As asserções I e II são proposições falsas.");
        questaoAlternativa34.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa35 = new QuestaoAlternativa();
        questaoAlternativa35.setId(INICIOQUESTAO.longValue());
        questaoAlternativa35.setAno(ANO);
        questaoAlternativa35.setDescricao("Em um compilador, um analisador sintático descendente preditivo pode ser implementado com auxílio de uma tabela construída a partir de uma gramática livre de contexto. Essa tabela, chamada tabela LL(k), indica a regra de produção a ser aplicada olhando-se o k-ésimo próximo símbolo lido, chamado lookahead(k). Por motivp de eficiência, normalmente busca-se utilizar k = 1. Considere a gramática livre de contexto G = (X, Y, Z, a, b, c, d, e, P, X), em que P é composto pelas seguintes regras de produção: $\\\\ X \\rightarrow aZbXY \\, | \\, c \\\\ Y \\rightarrow dX \\, | \\, \\varepsilon \\\\ Z \\rightarrow e \\\\$ Considere, ainda, a seguinte tabela LL(1), construída a partir da grmática G, sendo $ o símbolo que representa o fim da cadeia. Essa tabela possui duas produções distintas na célula (Y, d), gerando, no analisador sintático, uma dúvida na escolha da regra de produção aplicada em determinados momentos da análise. Considerando que o processo de construção dessa tabela LL(1), a partir da gramática G, foi seguido corretamente, a existência de duas regras de produção distintas na célula (Y, d), neste caso específico, resulta");
        questaoAlternativa35.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa35.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa35.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa35.setDisciplina(EDisciplina.COMPILADORES);
        questaoAlternativa35.setAlternativaCorreta("b");
        questaoAlternativa35.setImagem(true);
        questaoAlternativa35.setAlternativasA("da ausência do símbolo de fim de cadeia ($) nas regras de produção.");
        questaoAlternativa35.setAlternativasB("de um não-determinismo causado por uma ambiguidade na gramática.");
        questaoAlternativa35.setAlternativasC("do uso incorreto do símbolo de cadeia vazia ($\\varepsilon$) nas regras de produção.");
        questaoAlternativa35.setAlternativasD("da presença de duas regras de produção com um único terminal no corpo.");
        questaoAlternativa35.setAlternativasE("da presença de duas regras de produção com o mesmo não terminal na cabeça.");
        questaoAlternativa35.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa35.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa36 = new QuestaoAlternativa();
        questaoAlternativa36.setId(INICIOQUESTAO.longValue());
        questaoAlternativa36.setAno(ANO);
        questaoAlternativa36.setDescricao("Considere o programa a seguir, que ilustra a criação, execução e sincronização de duas threads.\n" +
                "$\\newline$#include <stdio.h>\n" +
                "$\\newline$#include <pthread.h>\n" +
                "$\\newline$int x = 0, y = 0; // Variáveis compartilhadas\n" +
                "$\\newline$void funcao1(void *threadarg){\n" +
                "$\\newline$x = 1;\n" +
                "$\\newline$... // várias instruções\n" +
                "$\\newline$if (y == 0)\n" +
                "$\\newline$printf(\"1 \");\n" +
                "$\\newline$pthread_exit(0);\n" +
                "$\\newline$}\n" +
                "$\\newline$void funcao2(void *threadarg){\n" +
                "$\\newline$y = 1;\n" +
                "$\\newline$... // várias instruções\n" +
                "$\\newline$if (x == 0)\n" +
                "$\\newline$printf(\"2 \");\n" +
                "$\\newline$pthread_exit(0);\n" +
                "$\\newline$}\n" +
                "$\\newline$void main(){\n" +
                "$\\newline$pthread_t t1, t2;\n" +
                "$\\newline$// Cria e dispara t1 que executa funcao1\n" +
                "$\\newline$pthread_create(&t1, NULL,(void *)funcao1, NULL);\n" +
                "$\\newline$// Cria e dispara t2 que executa funcao2\n" +
                "$\\newline$pthread_create(&t2, NULL,(void *)funcao2, NULL);\n" +
                "$\\newline$// Pai espera filho terminar\n" +
                "$\\newline$pthread_join(t1, NULL);\n" +
                "$\\newline$// Pai espera filho terminar\n" +
                "$\\newline$pthread_join(t2, NULL);\n" +
                "$\\newline$}\n" +
                "$\\newline$Ao final da execução da função main, será impresso");
        questaoAlternativa36.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa36.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa36.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa36.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa36.setAlternativaCorreta("e");
        questaoAlternativa36.setImagem(true);
        questaoAlternativa36.setAlternativasA("ambos os valores \"1\" e \"2\".");
        questaoAlternativa36.setAlternativasB("o valor \"1\", necessariamente.");
        questaoAlternativa36.setAlternativasC("o valor \"2\", necessariamente.");
        questaoAlternativa36.setAlternativasD("o valor \"1\", ou valor \"2\", mas nunca ambos.");
        questaoAlternativa36.setAlternativasE("o valor \"1\", ou valor \"2\", ou nenhum valor, mas nunca ambos.");
        questaoAlternativa36.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa36.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa37 = new QuestaoAlternativa();
        questaoAlternativa37.setId(INICIOQUESTAO.longValue());
        questaoAlternativa37.setAno(ANO);
        questaoAlternativa37.setDescricao("Com relação aos conceitos envolvendo sistemas multiagentes e o problema do Mundo do Aspirador de Pó, assinale a opção correta.");
        questaoAlternativa37.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa37.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa37.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa37.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa37.setAlternativaCorreta("b");
        questaoAlternativa37.setImagem(true);
        questaoAlternativa37.setAlternativasA("Definidas as localizações do agente e da sujeira como elementos únicos de um estado, no cnário da fugura. há $2^{2} = 4$ estados possíveis para avaliação.");
        questaoAlternativa37.setAlternativasB("O comportamento de um agente é definido por uma ou mais funções que mapeiam uma dada sequência percebida para uma ação definida.");
        questaoAlternativa37.setAlternativasC("A sequência percebida de um agente refere-se ao histórico do resultado de todas as ações tomadas pelo agente até o presente momento.");
        questaoAlternativa37.setAlternativasD("A percepção de um agente refere-se aos resultados das ações tomadas por ele.");
        questaoAlternativa37.setAlternativasE("A opção \"fazer nada\" é uma percepção válida do agente.");
        questaoAlternativa37.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa37.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa38 = new QuestaoAlternativa();
        questaoAlternativa38.setId(INICIOQUESTAO.longValue());
        questaoAlternativa38.setAno(ANO);
        questaoAlternativa38.setDescricao("Considere a função recursiva F a seguir, que em sua execução chama a função G:\n" +
                "$\\newline$1 void F(int n) {\n" +
                "$\\newline$2 if(n > 0) {\n" +
                "$\\newline$3 for(int i = 0; i < n; i++) {\n" +
                "$\\newline$4 G(i);\n" +
                "$\\newline$5 }\n" +
                "$\\newline$6 F(n/2);\n" +
                "$\\newline$7 }\n" +
                "$\\newline$8 }\n" +
                "$\\newline$Com base nos conceitos de teoria da complexidade, avalie as afirmações a seguir.\n" +
                "$\\newline$I. A equação de recorrência que define a complexidade da função F é a mesma do algoritmo clássico de ordenação mergesort.\n" +
                "$\\newline$II. O número de chamadas recursivas da função F é $\\Theta (log\\,n)$.\n" +
                "$\\newline$III. O número de vezes que a função G da linha 4 é chamada é O(n log n).\n" +
                "$\\newline$É correto o que se afirma em");
        questaoAlternativa38.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa38.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa38.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa38.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa38.setAlternativaCorreta("d");

        questaoAlternativa38.setAlternativasA("I, apenas.");
        questaoAlternativa38.setAlternativasB("II, apenas.");
        questaoAlternativa38.setAlternativasC("I e III, apenas.");
        questaoAlternativa38.setAlternativasD("II e III, apenas.");
        questaoAlternativa38.setAlternativasE("I, II e III.");
        questaoAlternativa38.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa39 = new QuestaoAlternativa();
        questaoAlternativa39.setId(INICIOQUESTAO.longValue());
        questaoAlternativa39.setAno(ANO);
        questaoAlternativa39.setDescricao("Quando se trabalha com banco de dados, é possível encontrar redundância de dados e mistura de diferentes assuntos em uma mesma tabela. Para evitar esses tipos de falhas, podem ser aplicadas formas normais, que são regras que compõem o processo chamado normalização. Entre essas regras, as mais utilizadas e que resolvem a maioria das falhas são a Primeira Forma Normal(1FN), a Segunda Forma Normal(2FN) e a Terceira Forma Normal (3FN). A figura a seguir mostra um exemplo de tabela que poderia ser armazenada em um banco de dados. Nela, a coluna Numero contém um valor único, sequencial, que não se repete. Com base no texto e no exemplo de tabela apresentado, avalie as afirmações a seguir.\n" +
                "$\\newline$I. A tabela não está na 1FN e, portanto, pode-se dizer que ela não atende à 2FN nem à 3FN.\n" +
                "$\\newline$II. Se forem criadas duas novas tabelas: Partido(com as colunas Sigla e NomePartido) e Candidato(com as colunas NumCand e NomeCand), pode-se dizer que as três tabelas atendem à 2FN.\n" +
                "$\\newline$III. Se a tabela for transformada em duas: Voto(com as colunas Numero, Sigla, NomePartido, NumCand, NomeCand e Titulo) e Eleitor(com a coluna Titulo e as colunas restantes), pode-se dizer que as duas tabelas atendem à 3FN.\n" +
                "$\\newline$IV. Os atributos Sigla, NomePartido, NumCand e NomeCand não dependem funcionalmente do atributo Numero, mas os atributos restantes, sim.\n" +
                "$\\newline$É correto apenas o que se afirma em");
        questaoAlternativa39.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa39.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa39.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa39.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa39.setAlternativaCorreta("a");
        questaoAlternativa39.setImagem(true);
        questaoAlternativa39.setAlternativasA("I.");
        questaoAlternativa39.setAlternativasB("IV.");
        questaoAlternativa39.setAlternativasC("I e III.");
        questaoAlternativa39.setAlternativasD("II e III.");
        questaoAlternativa39.setAlternativasE("II e IV.");
        questaoAlternativa39.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa39.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa40 = new QuestaoAlternativa();
        questaoAlternativa40.setId(INICIOQUESTAO.longValue());
        questaoAlternativa40.setAno(ANO);
        questaoAlternativa40.setDescricao("Um programador inexperiente está desenvolvendo um sistema multithread que possui duas estruturas de dados diferentes, E1 e E2, as quais armazenam valores inteiros. O acesso concorrente a essas estruturas é controlado por semáforos. Durante sua execução, o sistema dispara threads T1 e T2 simultaneamente. A tabela a seguir possibilita uma visão em linhas gerais dos algoritmos dessas threads. Durante a execução do referido programa, é possível que");
        questaoAlternativa40.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa40.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa40.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa40.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa40.setAlternativaCorreta("e");
        questaoAlternativa40.setImagem(true);
        questaoAlternativa40.setAlternativasA("não ocorra deadlock, porque a sequência de alocação dos recursos impede naturalmente o problema. ");
        questaoAlternativa40.setAlternativasB("ocorra deadlock, que podem ser evitado se o programador tomar o cuidado de não executar cálculos entre um pedido de alocação e outro.");
        questaoAlternativa40.setAlternativasC("ocorra dealock, sendo a probabilidade dessa ocorrência tão baixa e sua consequência tão inócua que não haverá comprometimento do programa.");
        questaoAlternativa40.setAlternativasD("não ocorra dealock, desde que o programador use semáforos para controlar o acesso às estruturas de dados, o que é suficiente para evitar o problema.");
        questaoAlternativa40.setAlternativasE("ocorra dealock, que pode ser avitado se o programador tomar cuidado de solicitar o acesso às estruturas de dados na mesma ordem em ambas as threads.");
        questaoAlternativa40.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa40.setNumeroQuestao(NUMEROQUESTAO);


        List<Questao> questoes = new ArrayList<>();
        questoes.add(questaoDiscusiva1);
        questoes.add(questaoDiscusiva2);
        questoes.add(questaoAlternativa3);
        questoes.add(questaoAlternativa4);
        questoes.add(questaoAlternativa5);
        questoes.add(questaoAlternativa6);
        questoes.add(questaoAlternativa7);
        questoes.add(questaoAlternativa8);
        questoes.add(questaoAlternativa9);
        questoes.add(questaoAlternativa10);
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

        return questoes;
    }

}
