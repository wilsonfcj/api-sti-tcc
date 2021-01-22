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

public class QuestaoEnade2014 {

    final static Integer ANO = 2014;
    static Integer INICIOQUESTAO = 1486;
    static Integer NUMEROQUESTAO = 1;

    public static List<Questao> register() {

        QuestaoDiscusiva questaoDiscusiva1 = new QuestaoDiscusiva();
        questaoDiscusiva1.setId(INICIOQUESTAO.longValue());
        questaoDiscusiva1.setAno(ANO);
        questaoDiscusiva1.setDescricao("Os desafios da mobilidade urbana associam-se à necessidade de desenvolvimento urbano sustentável. A ONU define esse desenvolvimento como aquele que assegura qualidade de vida, incluídos os componentes ecológicos, culturais, políticos, institucionais, sociais e econômicos que não comprometam a qualidade de vida das futuras gerações. O espaço urbano brasileiro é marcado por inúmeros problemas cotidianos e por várias contradições. Uma das grandes questões em debate diz respeito à mobilidade urbana, uma vez que o momento é de motorização dos deslocamentos da população, por meio de transporte coletivo e individual. Considere os dados do seguinte quadro abaixo. \n" +
                "$\\newline$Tendo em vista o texto e o quadro de mobilidade urbana apresentados, redija um texto dissertativo, contemplando os seguintes aspectos: \n" +
                "\n" +
                "$\\newline$a) consequências, para o desenvolvimento sustentável, do uso mais frequente do transporte motorizado; \n" +
                "$\\newline$b) duas ações de intervenção que contribuam para a consolidação de política pública de incremento ao uso de bicicleta na cidade mencionada, assegurandorse o desenvolvimento sustentável.");
        questaoDiscusiva1.setTipoFormcao(EFormacao.GERAL);
        questaoDiscusiva1.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoDiscusiva1.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoDiscusiva1.setProva(ETipoQuestaoProva.ENADE);
        questaoDiscusiva1.setResposta("O estudante deve redigir um texto dissertativo, em que:\n" +
                "$\\newline$a) aborde pelo menos duas das seguintes consequências:\n" +
                "$\\newline$ - aumento da emissão de poluentes atmosféricos;\n" +
                "$\\newline$ - aumento da emissão de gases de efeito estufa (CO2 – dióxido de carbono, CO –\n" +
                "monóxido de carbono, O3 – ozônio);\n" +
                "$\\newline$ - aumento da poluição visual e sonora;\n" +
                "$\\newline$ - aumento da temperatura local e global;\n" +
                "$\\newline$ - aumento do consumo de combustíveis;\n" +
                "$\\newline$ - aumento de problemas de saúde (cardíaco, respiratório, dermatológico);\n" +
                "$\\newline$ - aumento da frota de veículos promovendo congestionamentos urbanos;\n" +
                "$\\newline$ - diminuição de áreas verdes;\n" +
                "$\\newline$ - desmatamento;\n" +
                "$\\newline$ - aumento das áreas impermeabilizadas resultando em enchentes, diminuição da\n" +
                "infiltração da água e recarga de lençóis freáticos;\n" +
                "$\\newline$ - elevação dos custos de manutenção das cidades (metroferrovias, rodovias,\n" +
                "tratamento de água, limpeza da cidade, etc);\n" +
                "$\\newline$ - necessidade de ampliação de vias trafegáveis;\n" +
                "$\\newline$ - necessidade de ampliação de áreas de estacionamento.\n" +
                "$\\newline$b) aborde duas das seguintes intervenções:\n" +
                "$\\newline$ - construção de vias exclusivas para bicicletas (ciclovias e ciclofaixas);\n" +
                "$\\newline$ - proposição de formas de integração entre o transporte por bicicletas, o\n" +
                "metroviário e os ônibus coletivos, a fim de garantir segurança e conforto em\n" +
                "momentos de adversidades climáticas e relevo acidentado;\n" +
                "$\\newline$ - pontos de aluguel e/ou empréstimo de bicicleta;\n" +
                "$\\newline$ - construção de bicicletários;\n" +
                "$\\newline$ - investimento na segurança pública;\n" +
                "$\\newline$ - políticas de incentivo ao uso de bicicleta (educação ambiental, qualidade de\n" +
                "vida, saúde, propaganda);\n" +
                "$\\newline$ - implementação de políticas de crédito e de redução do custo das bicicletas.");
        questaoDiscusiva1.setImagem(true);
        questaoDiscusiva1.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoDiscusiva1.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoDiscusiva questaoDiscusiva2 = new QuestaoDiscusiva();
        questaoDiscusiva2.setId(INICIOQUESTAO.longValue());
        questaoDiscusiva2.setAno(ANO);
        questaoDiscusiva2.setDescricao("Três jovens de 19 anos de idade, moradores de rua, foram presos em flagrante, nesta quarta feira, por terem ateado fogo em um jovem de 17 anos, guardador de carros. O motivo, segundo a 14.a DP, foi uma 'briga por pont0͛. Um motorista deu 'um trocado' ao menor, o que irritou os três moradores de rua, que também guardavam carros no local. O menor foi levado ao Hospital das Clínicas (HC) por PMs que passavam pelo local. Segundo o HC, ele teve queimaduras leves no ombro esquerdo, foi medicado e, em seguida, liberado. Os indiciados podem pegar de 12 a 30 anos de prisão, se ficar comprovado que a intenção era matar o menor. Caso contrário, conforme a 14.a DP, os três poderão pegar de um a três anos de cadeia.\n" +
                "\n" +
                "$\\newline$A partir da situação narrada, elabore um texto dissertativo sobre violência urbana, apresentando:\n" +
                "\n" +
                "$\\newline$a) análise de duas causas do tipo de violência descrita no texto; \n" +
                "$\\newline$b) dois fatores que contribuíram para se evitar o fato descrito na notícia.");
        questaoDiscusiva2.setTipoFormcao(EFormacao.GERAL);
        questaoDiscusiva2.setProva(ETipoQuestaoProva.ENADE);
        questaoDiscusiva2.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoDiscusiva2.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoDiscusiva2.setResposta("O estudante deve redigir um texto dissertativo, em que:\n" +
                "$\\newline$a) aborde duas das seguintes causas:\n" +
                "$\\newline$ - problemas relacionados à educação (baixa escolaridade, evasão escolar, qualidade\n" +
                "da educação, distanciamento entre a escola e a realidade social, tempo de\n" +
                "permanência na escola);\n" +
                "$\\newline$ - desigualdades socioculturais (gênero, etnia, economia, etc);\n" +
                "$\\newline$ - desemprego e falta de qualificação profissional;\n" +
                "$\\newline$ - precariedade da segurança pública;\n" +
                "$\\newline$ - uso de drogas;\n" +
                "$\\newline$ - desvalorização da vida humana;\n" +
                "$\\newline$ - banalização da violência;\n" +
                "$\\newline$ - sensação de impunidade;\n" +
                "$\\newline$ - ausência de políticas sociais;\n" +
                "$\\newline$ - degradação da vida urbana;\n" +
                "$\\newline$ - desconhecimento e/ou desrespeito aos direitos humanos e constitucionais;\n" +
                "$\\newline$ - desestruturação familiar;\n" +
                "$\\newline$ - desvalorização de princípios éticos e morais.\n" +
                "$\\newline$b) mencione dois dos seguintes fatores:\n" +
                "$\\newline$ - políticas de segurança mais efetivas;\n" +
                "$\\newline$ - políticas públicas de melhoria das condições socioeconômicas;\n" +
                "$\\newline$ - maior consciência cidadã e respeito à vida;\n" +
                "$\\newline$ - melhor distribuição de renda;\n" +
                "\n" +
                "$\\newline$ - melhoria da educação (aumento da escolaridade, redução da evasão escolar,\n" +
                "qualidade da educação, aproximação entre a escola e a realidade social, aumento do\n" +
                "tempo de permanência na escola);\n" +
                "$\\newline$ - aumento da oferta de emprego e melhoria da qualificação profissional;\n" +
                "$\\newline$ - medidas preventivas ao uso de drogas;\n" +
                "$\\newline$ - maior eficácia do sistema judiciário;\n" +
                "$\\newline$ - revisão da legislação penal;\n" +
                "$\\newline$ - valorização de princípios éticos, morais e familiares.");
        questaoDiscusiva2.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa3 = new QuestaoAlternativa();
        questaoAlternativa3.setId(INICIOQUESTAO.longValue());
        questaoAlternativa3.setAno(ANO);
        questaoAlternativa3.setDescricao("O trecho da música \"Nos Bailes da Vida”, de Milton Nascimento, “todo artista tem de ir aonde o povo está”, é antigo, e a música, de tão tocada, acabou por se tornar um estereótipo de tocadores de violões e de rodas de amigos em Visconde de Mauá, nos anos 1970. Em tempos digitais, porém, ela ficou mais atual do que nunca. É fácil entender o porquê: antigamente, quando a informação se concentrava em centros de exposição, veículos de comunicação, editoras, museus e gravadoras, era preciso passar por uma série de curadores, para garantir a publicação de um artigo ou livro, a gravação de um disco ou a produção de uma exposição. O mesmo funil, que poderia ser injusto e deixar grandes talentos de fora, simplesmente porque não tinham acesso às ferramentas, às pessoas ou às fontes de informação, também servia como filtro de qualidade. Tocar violão ou encenar uma peça de teatro em um grande auditório costumava ter um peso muito maior do que fazê-lo em um bar, um centro cultural ou uma calçada. Nas raras ocasiões em que esse valor se invertia, era justamente porque, para uso do espaço “alternativo”, havia mecanismos de seleção tão ou mais rígidos que os do espaço oficial.\n" +
                "$\\newline$I. O processo de evolução tecnológica da atualidade democratiza a produção e a divulgação de obras artísticas, reduzindo a importância que os centros de exposição tinham nos anos 1970. \n" +
                "$\\newline$PORQUE \n" +
                "$\\newline$II. As novas tecnologias possibilitam que artistas sejam independentes, montem seus próprios ambientes de produção e disponibilizem seus trabalhos, de forma simples, para um grande número de pessoas.\n" +
                "$\\newline$A respeito dessas asserções, assinale a opção correta. ");
        questaoAlternativa3.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa3.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa3.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa3.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa3.setAlternativaCorreta("a");

        questaoAlternativa3.setAlternativasA("As asserções I e II são proposições verdadeiras, e a II é uma jusificaiva correta da I. ");
        questaoAlternativa3.setAlternativasB("As asserções I e II são proposições verdadeiras, mas a II não é uma jusificaiva correta da I. ");
        questaoAlternativa3.setAlternativasC("A asserção I é uma proposição verdadeira, e a II é uma proposição falsa. \n");
        questaoAlternativa3.setAlternativasD("A asserção I é uma proposição falsa, e a II é uma proposição verdadeira. \n");
        questaoAlternativa3.setAlternativasE("As asserções I e II são proposições falsas. \n");
        questaoAlternativa3.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa4 = new QuestaoAlternativa();
        questaoAlternativa4.setId(INICIOQUESTAO.longValue());
        questaoAlternativa4.setAno(ANO);
        questaoAlternativa4.setDescricao("Com a globalização da economia social por meio das organizações não governamentais, surgiu uma discussão do conceito de empresa, de sua forma de concepção junto às organizações brasileiras e de suas práticas. Cada vez mais, é necessário combinar as políticas públicas que priorizam modernidade e competitividade com o esforço de incorporação dos setores atrasados, mais intensivos de mão de obra. \n" +
                "\n" +
                "$\\newline$A respeito dessa temática, avalie as afirmações a seguir.\n" +
                "\n" +
                "$\\newline$I. O terceiro setor é uma mistura dos dois setores econômicos clássicos da sociedade: o público, representado pelo Estado, e o privado, representado pelo empresariado em geral.  \n" +
                "$\\newline$II. É o terceiro setor que viabiliza o acesso da sociedade à educação e ao desenvolvimento de técnicas industriais, econômicas, financeiras, políticas e ambientais.    \n" +
                "$\\newline$III. A responsabilidade social tem resultados na alteração do perfil corporativo e estratégico das empresas, que têm reformulado a cultura e a filosofia que orientam as ações institucionais.");
        questaoAlternativa4.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa4.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa4.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa4.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa4.setAlternativaCorreta("c");

        questaoAlternativa4.setAlternativasA("I, apenas. ");
        questaoAlternativa4.setAlternativasB("II, apenas. \n");
        questaoAlternativa4.setAlternativasC("I e III, apenas. \n");
        questaoAlternativa4.setAlternativasD("II e III, apenas. \n");
        questaoAlternativa4.setAlternativasE("I, II e III. \n");
        questaoAlternativa4.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa5 = new QuestaoAlternativa();
        questaoAlternativa5.setId(INICIOQUESTAO.longValue());
        questaoAlternativa5.setAno(ANO);
        questaoAlternativa5.setDescricao("Pegada ecológica é um indicador que estima a demanda ou a exigência humana sobre o meio ambiente, considerando-se o nível de atividade para atender ao padrão de consumo atual (com a tecnologia atual). É, de certa forma, uma maneira de medir o fluxo de ativos ambientais de que necessitamos para sustentar nosso padrão de consumo. Esse indicador é medido em hectare global, medida de área equivalente a 10 000 mϸ. Na medida hectare global, são consideradas apenas as áreas produtivas do planeta. A biocapacidade do planeta, indicador que reflete a regeneração (natural) do meio ambiente, é medida também em hectare global. Uma razão entre pegada ecológica e biocapacidade do planeta igual a 1 indica que a exigência humana sobre os recursos do meio ambiente é reposta na sua totalidade pelo planeta, devido à capacidade natural de regeneração. Se for maior que 1, a razão indica que a demanda humana é superior à capacidade do planeta de se recuperar e, se for menor que 1, indica que o planeta se recupera mais rapidamente. \n" +
                "O aumento da razão entre pegada ecológica e biocapacidade representado no gráfico evidencia \n");
        questaoAlternativa5.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa5.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa5.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa5.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa5.setAlternativaCorreta("e");
        questaoAlternativa5.setImagem(true);
        questaoAlternativa5.setAlternativasA("redução das áreas de plantio do planeta para valores inferiores a 10 000 $m^2$ devido ao padrão atual de consumo de produtos agrícolas. \n");
        questaoAlternativa5.setAlternativasB("aumento gradual da capacidade natural de regeneração do planeta em relação às exigências humanas. ");
        questaoAlternativa5.setAlternativasC("reposição dos recursos naturais pelo planeta em sua totalidade frente às exigências humanas. ");
        questaoAlternativa5.setAlternativasD("incapacidade de regeneração natural do planeta ao longo do período 1961-2008. \n");
        questaoAlternativa5.setAlternativasE("tendência a desequilíbrio gradual e contínuo da sustentabilidade do planeta. ");
        questaoAlternativa5.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa5.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa6 = new QuestaoAlternativa();
        questaoAlternativa6.setId(INICIOQUESTAO.longValue());
        questaoAlternativa6.setAno(ANO);
        questaoAlternativa6.setDescricao("Importante website de relacionamento caminha para 700 milhões de usuários. Outro conhecido servidor de microblogging acumula 140 milhões de mensagens ao dia. É como se 75% da população brasileira postasse um comentário a cada 24 horas. Com as redes sociais cada vez mais presentes no dia a dia das pessoas, é inevitável que muita gente encontre nelas uma maneira fácil, rápida e abrangente de se manifestar. \n" +
                "Uma rede social de recrutamento revelou que 92% das empresas americanas já usaram ou planejam usar as redes sociais no processo de contratação. Destas, 60% assumem que bisbilhotam a vida dos candidatos em websites de rede social. \n" +
                "Realizada por uma agência de recrutamento, uma pesquisa com 2 500 executivos brasileiros mostrou que 44% desclassificariam, no processo de seleção, um candidato por seu comportamento em uma rede social. \n" +
                "Muitas pessoas já enfrentaram problemas por causa de informações online, tanto no campo pessoal quanto no profissional. Algumas empresas e instituições, inclusive, já adotaram cartilhas de conduta em redes sociais. ");
        questaoAlternativa6.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa6.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa6.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa6.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa6.setAlternativaCorreta("b");

        questaoAlternativa6.setAlternativasA("mais da metade das empresas americanas evita acessar websites de redes sociais de candidatos a emprego. \n");
        questaoAlternativa6.setAlternativasB("empresas e instituições estão atentas ao comportamento de seus funcionários em websites de redes sociais. \n");
        questaoAlternativa6.setAlternativasC("a complexidade dos procedimentos de rastreio e monitoramento de uma rede social impede que as empresas tenham acesso ao perfil de seus funcionários. \n");
        questaoAlternativa6.setAlternativasD("as cartilhas de conduta adotadas nas empresas proíbem o uso de redes sociais pelos funcionários, em vez de recomendar mudanças de comportamento. \n");
        questaoAlternativa6.setAlternativasE("a maioria dos executivos brasileiros utilizaria informações obtidas em websites de redes sociais, para desclassificar um candidato em processo de seleção.");
        questaoAlternativa6.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa7 = new QuestaoAlternativa();
        questaoAlternativa7.setId(INICIOQUESTAO.longValue());
        questaoAlternativa7.setAno(ANO);
        questaoAlternativa7.setDescricao("Uma ideia e um aparelho simples devem, em breve, ajudar a salvar vidas de recém-nascidos. Idealizado pelo mecânico argentino Jorge Odón, o dispositivo que leva seu sobrenome desentala um bebê preso no canal vaginal —e, por mais inusitado que pareça, foi criado com base em técnica usada para remover rolhas de dentro de garrafas. O aparelho consiste em uma bolsa plástica inserida em uma proteção feita do mesmo material e que envolve a cabeça da criança. Estando o dispositivo devidamente posicionado, a bolsa é inflada para aderir à cabeça do bebê e ser puxada aos poucos, de forma a não machucá-lo. O método de Odón deve substituir outros já arcaicos, como o de fórceps e o de tubos de sucção, os quais, se usados por mãos mal treinadas, podem comprometer a vida do bebê, o que, segundo especialistas, não deve acontecer com o novo equipamento. \n" +
                "$\\newline$Segundo o The New York Times, a ideia recebeu apoio da Organização Mundial de Saúde (OMS) e já foi até licenciada por uma empresa norte-americana de tecnologia médica. Não se sabe quando o equipamento começará a ser produzido nem o preço a ser cobrado, mas presume-se que ele não passará de 50 dólares, com redução do preço em países mais pobres. \n" +
                "$\\newline$Com relação ao texto acima, avalie as afirmações a seguir. \n" +
                "$\\newline$I. A utilização do método de Odón poderá reduzir a taxa de mortalidade de crianças ao nascer, mesmo em países pobres. \n" +
                "$\\newline$II. Por ser uma variante dos tubos de sucção, o aparelho desenvolvido por Odón é resultado de aperfeiçoamento de equipamentos de parto. \n" +
                "$\\newline$III. Por seu uso simples, o dispositivo de Ódon tem grande potencial de ser usado em países onde o parto é usualmente realizado por parteiras. \n" +
                "$\\newline$IV. A possibilidade de, em países mais pobres, reduzir-se o preço do aparelho idealizado por Odón evidencia preocupação com a responsabilidade social. \n" +
                "$\\newline$É correto apenas o que se afirma em");
        questaoAlternativa7.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa7.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa7.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa7.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa7.setAlternativaCorreta("d");

        questaoAlternativa7.setAlternativasA("I e II. ");
        questaoAlternativa7.setAlternativasB("I e IV. ");
        questaoAlternativa7.setAlternativasC("II e III. ");
        questaoAlternativa7.setAlternativasD("I, III e IV. ");
        questaoAlternativa7.setAlternativasE("II, III e IV. ");
        questaoAlternativa7.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa8 = new QuestaoAlternativa();
        questaoAlternativa8.setId(INICIOQUESTAO.longValue());
        questaoAlternativa8.setAno(ANO);
        questaoAlternativa8.setDescricao("As mulheres frequentam mais os bancos escolares que os homens, dividem seu tempo entre o trabalho e os cuidados com a casa, geram renda familiar, porém continuam ganhando menos e trabalhando mais que os homens. \n" +
                "As políticas de benefícios implementadas por empresas preocupadas em facilitar a vida das funcionárias que têm criança pequena em casa já estão chegando ao Brasil. Acordos de horários flexíveis, programas como auxílio-creche, auxílio-babá e auxílio-amamentação são alguns dos benefícios oferecidos. \n" +
                "$\\newline$Considerando o texto e o gráfico, avalie as afirmações a seguir. \n" +
                "$\\newline$I. O somatório do tempo dedicado pelas mulheres aos afazeres domésticos e ao trabalho remunerado é superior ao dedicado pelos homens, independentemente do formato da família. \n" +
                "$\\newline$II. O fragmento de texto e os dados do gráfico apontam para a necessidade de criação de políticas que promovam a igualdade entre os gêneros no que concerne, por exemplo, a tempo médio dedicado ao trabalho e remuneração recebida. \n" +
                "$\\newline$III. No fragmento de reportagem apresentado, ressalta-se a diferença entre o tempo dedicado por mulheres e homens ao trabalho remunerado, sem alusão aos afazeres domésticos.");
        questaoAlternativa8.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa8.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa8.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa8.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa8.setAlternativaCorreta("c");
        questaoAlternativa8.setImagem(true);
        questaoAlternativa8.setAlternativasA("I, apenas. ");
        questaoAlternativa8.setAlternativasB("III, apenas.");
        questaoAlternativa8.setAlternativasC("I e II, apenas.");
        questaoAlternativa8.setAlternativasD("II e III, apenas. ");
        questaoAlternativa8.setAlternativasE("I, II e III.");
        questaoAlternativa8.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa8.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa9 = new QuestaoAlternativa();
        questaoAlternativa9.setId(INICIOQUESTAO.longValue());
        questaoAlternativa9.setAno(ANO);
        questaoAlternativa9.setDescricao("O quadro a abaixo apresenta a proporção (%) de trabalhadores por faixa de tempo gasto no deslocamento casa-trabalho, no Brasil e em tres cidades brasileiras. \n" +
                "$\\newline$Com base nos dados apresentados e considerando a distribuição da população trabalhadora nas cidades e as políticos pálicas direcionadas a mobilidade urbana, avalie as afirma Goes a seguir. \n" +
                "\n" +
                "$\\newline$I. A distribuição das pessoas por faixa de tempo de deslocamento casa-trabalho na região metropolitana do Rio de Janeiro é próxima a que se verifica em São Paulo, mas não ern Curitiba e na media brasileira. \n" +
                "$\\newline$II. Nas metrópoles, em geral, a maioria dos postos de trabalho esta localizada nas áreas urbanas centrais, e as residencias da população de baixa renda estão concentradas em áreas irregulares ou na periferia, o que aumenta o tempo gasto por esta população no deslocamento casa-trabalho e o custo do transporte.\n" +
                "$\\newline$III. As politicas publicas referentes a transportes urbanos, como, por exemplo, Bilhete Único e Veiculo Leve sobre Trilhos (VLT), ao serem implementadas, contribuem para redução do tempo gasto no deslocamento casa-trabalho e do custo do transporte. \n" +
                "$\\newline$correto o que se afirma em ");
        questaoAlternativa9.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa9.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa9.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa9.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa9.setAlternativaCorreta("e");
        questaoAlternativa9.setImagem(true);
        questaoAlternativa9.setAlternativasA("I, apenas.");
        questaoAlternativa9.setAlternativasB("III, apenas.");
        questaoAlternativa9.setAlternativasC("I e II, apenas.");
        questaoAlternativa9.setAlternativasD("II e III, apenas.");
        questaoAlternativa9.setAlternativasE("I, II e III.");
        questaoAlternativa9.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa9.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa10 = new QuestaoAlternativa();
        questaoAlternativa10.setId(INICIOQUESTAO.longValue());
        questaoAlternativa10.setAno(ANO);
        questaoAlternativa10.setDescricao("Constantes transformações ocorreram nos meios rural e urbano, a partir do século XX. Com o advento da industrialização, houve mudanças importantes no modo de vida das pessoas, em seus padrões culturais, valores e tradições. O conjunto de acontecimentos provocou, tanto na zona urbana quanto na rural, problemas como explosão demográfica, prejuízo nas atividades agrícolas e violência. \n" +
                "Iniciaram-se inúmeras transformações na natureza, criando-se técnicas para objetos até então sem utilidade para o homem. Isso só foi possível em decorrência dos recursos naturais existentes, que propiciaram estrutura de crescimento e busca de prosperidade, o que faz da experimentação um método de transformar os recursos em beneficio próprio. \n" +
                "A partir das ideias expressas no texto acima, conclui-se que, no Brasil do século XX, ");
        questaoAlternativa10.setTipoFormcao(EFormacao.GERAL);
        questaoAlternativa10.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa10.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa10.setDisciplina(EDisciplina.INFORMATICA_E_SOCIEDADE);
        questaoAlternativa10.setAlternativaCorreta("d");

        questaoAlternativa10.setAlternativasA("a industrialização ocorreu independentemente do êxodo rural e dos recursos naturais disponíveis.");
        questaoAlternativa10.setAlternativasB("\n" +
                "o êxodo rural para as cidades não prejudicou as atividades agrícolas nem o meio rural porque novas tecnologias haviam sido introduzidas no campo.");
        questaoAlternativa10.setAlternativasC("\n" +
                "homens e mulheres advindos do campo deixaram sua cultura e se adaptaram a outra, citadina, totalmente diferente e oposta aos seus valores.");
        questaoAlternativa10.setAlternativasD("tanto o espaço urbano quanto o rural sofreram transformações decorrentes da aplicação de novas tecnologias às atividades industriais e agrícolas. ");
        questaoAlternativa10.setAlternativasE("os migrantes chegaram às grandes cidades trazendo consigo valores e tradições, que lhes possibilitaram manter intacta sua cultura, tal como se manifestava nas pequenas cidades e no meio rural. ");
        questaoAlternativa10.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        //WARNING Questão precisa que o usuário desenhe a resposta, não sendo possivel implementar
        QuestaoAlternativa questaoAlternativa11 = new QuestaoAlternativa();
        questaoAlternativa11.setId(INICIOQUESTAO.longValue());
        questaoAlternativa11.setAno(ANO);
        questaoAlternativa11.setDescricao("Anulada");
        questaoAlternativa11.setArea(EArea.MATEMATICA);
        questaoAlternativa11.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa11.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa11.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa11.setAlternativaCorreta("*");

        questaoAlternativa11.setAlternativasA("Anulada");
        questaoAlternativa11.setAlternativasB("Anulada");
        questaoAlternativa11.setAlternativasC("Anulada");
        questaoAlternativa11.setAlternativasD("Anulada");
        questaoAlternativa11.setAlternativasE("Anulada");
        questaoAlternativa11.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

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

        QuestaoDiscusiva questaoDiscusiva13 = new QuestaoDiscusiva();
        questaoDiscusiva13.setId(INICIOQUESTAO.longValue());
        questaoDiscusiva13.setAno(ANO);
        questaoDiscusiva13.setDescricao("As técnicas de projeto de algoritmos são essenciais para que os desenvolvedores possam implementar software de qualidade. Essas técnicas descrevem os princípios que devem ser adotados para se projetar soluções algorítmicas para um dado problema. Entre as principais técnicas, destacam-se os projetos de algoritmos por tentativa e erro, divisão e conquista, programação dinâmica e algoritmos gulosos. \n" +
                "$\\newline$Nesse contexto, faça o que se pede nos itens a seguir. \n" +
                "$\\newline$a) Descreva o que caracteriza o projeto de algoritmos por divisão e conquista.\n" +
                "$\\newline$b) Apresente uma situação de uso da técnica de projeto de algoritmos por divisão e conquista.");
        questaoDiscusiva13.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoDiscusiva13.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoDiscusiva13.setProva(ETipoQuestaoProva.ENADE);
        questaoDiscusiva13.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoDiscusiva13.setResposta("O estudante deve:\n" +
                "$\\newline$a) explicar que o projeto de algoritmos por divisão e conquista envolve a divisão do\n" +
                "problema em partes menores, que serão solucionadas com o mesmo procedimento,\n" +
                "sendo que ao final existe um processo de integração dos resultados (conquista).\n" +
                "$\\newline$b) mostrar conhecimento prático do uso da técnica de divisão e conquista no projeto\n" +
                "de algoritmos, apresentando situações simples, como por exemplo, os algoritmos de\n" +
                "ordenação quicksort e mergesort.");
        questaoDiscusiva13.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa14 = new QuestaoAlternativa();
        questaoAlternativa14.setId(INICIOQUESTAO.longValue());
        questaoAlternativa14.setAno(ANO);
        questaoAlternativa14.setDescricao("A figura a seguir apresenta duas telas de um sistema de venda de passagens aéreas de uma empresa. Na tela 1, o usuário selecionou sua origem, seu destino, e, logo em seguida, sua data de ida. Ao mudar o foco para o campo de preenchimento da data de retorno, a ferramenta de calendário apresentou automaticamente a data do dia da compra (01/09/2014), conforme exibido na tela 2. \n" +
                "$\\newline$Com base nas telas apresentadas e em dimensões de qualidade, tais como facilidade de aprendizagem, prevenção de erros, eficiência, memorização e satisfação subjetiva, avalie as afirmações a seguir. $\\newline$I. O botão \"Ir\" apresenta uma metáfora adequada com o mundo real, facilitando a aprendizagem. $\\newline$II. Na tela 1, o uso do calendário clicável não auxilia na prevenção de erros, visto que a entrada de datas pode ser realizada manualmente pelos usuários. $\\newline$III. Na tela 2, o fato de o calendário selecionar a data da compra prejudica a eficiência da interface, já que a data preenchida é anterior à data de ida. $\\newline$IV. A memorização é prejudicada pois a interface apresenta elementos gráficos em demasia. \n" +
                "$\\newline$É correto apenas o que se afirma em ");
        questaoAlternativa14.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa14.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa14.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa14.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa14.setAlternativaCorreta("b");
        questaoAlternativa14.setImagem(true);
        questaoAlternativa14.setAlternativasA("I e II. ");
        questaoAlternativa14.setAlternativasB("I e III. ");
        questaoAlternativa14.setAlternativasC("II e IV.");
        questaoAlternativa14.setAlternativasD("I,III e IV.");
        questaoAlternativa14.setAlternativasE("II, III e IV. ");
        questaoAlternativa14.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa14.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa15 = new QuestaoAlternativa();
        questaoAlternativa15.setId(INICIOQUESTAO.longValue());
        questaoAlternativa15.setAno(ANO);
        questaoAlternativa15.setDescricao("O gerenciamento de um projeto inclui atividades com o objetivo de garantir que todos os produtos definidos no seu escopo sejam entregues no prazo estimado. \n" +
                "\n" +
                "Nesse contexto, avalie as afirmações a seguir. \n" +
                "\n" +
                "$\\newline$I. Técnicas como PERT e CPM são utilizadas para obtenção de estimativas de esforço e como apoio para definição de atividades. \n" +
                "$\\newline$II. Séries históricas, quando utilizadas para obter estimativas de esforço no desenvolvimento de um novo sistema, levam à obtenção de estimativas consistentes, independentemente do domínio de aplicação dos sistemas que deram origem às séries históricas. \n" +
                "$\\newline$III. No caso de atraso na execução do cronograma, a contratação de novos desenvolvedores assegura que o produto será entregue de acordo com o cronograma inicialmente proposto. \n" +
                "\n" +
                "$\\newline$É correto o que se afirma em ");
        questaoAlternativa15.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa15.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa15.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa15.setDisciplina(EDisciplina.GERENCIA_DE_PROJETOS);
        questaoAlternativa15.setAlternativaCorreta("a");

        questaoAlternativa15.setAlternativasA("I, apenas. ");
        questaoAlternativa15.setAlternativasB("II, apenas.");
        questaoAlternativa15.setAlternativasC("I e III, apenas.");
        questaoAlternativa15.setAlternativasD("II e III, apenas. ");
        questaoAlternativa15.setAlternativasE("I, II e III. ");
        questaoAlternativa15.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa16 = new QuestaoAlternativa();
        questaoAlternativa16.setId(INICIOQUESTAO.longValue());
        questaoAlternativa16.setAno(ANO);
        questaoAlternativa16.setDescricao("Considere um esquema de gerência de memória por paginação simples, onde a memória física é dividida em quadros (trames) de 1 Kbyte e endereçada por byte. Os espaços de endereçamento dos processos são múltiplos de 1 Kbyte. A tabela de páginas para um determinado processo P é apresentada a seguir, em que o primeiro bit (6V) mostra se a página é válida (1) ou inválida (0). \n" +
                "$\\newline$Com base na tabela apresentada, avalie as afirmações a seguir. $\\newline$I. O endereço físico é composto por 13 bits. $\\newline$II. O esquema de gerência de memória apresentado reduz a fragmentação externa. $\\newline$III.A tradução do endereço lógico 0110000000110 para endereço físico causa exceção. \n" +
                "$\\newline$É correto o que se afirma em ");
        questaoAlternativa16.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa16.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa16.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa16.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa16.setAlternativaCorreta("b");
        questaoAlternativa16.setImagem(true);
        questaoAlternativa16.setAlternativasA("I, apenas. ");
        questaoAlternativa16.setAlternativasB("II, apenas. ");
        questaoAlternativa16.setAlternativasC("I e III, apenas. ");
        questaoAlternativa16.setAlternativasD("II e III, apenas. ");
        questaoAlternativa16.setAlternativasE("I, II e III. ");
        questaoAlternativa16.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa16.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa17 = new QuestaoAlternativa();
        questaoAlternativa17.setId(INICIOQUESTAO.longValue());
        questaoAlternativa17.setAno(ANO);
        questaoAlternativa17.setDescricao("Com base nos algoritmos 1 e 2, avalie as asserções a seguir e a relação proposta entre elas. \n" +
                "$\\newline$I. Os algoritmos possuem a mesma complexidade assintótica. \n" +
                "$\\newline$PORQUE \n" +
                "$\\newline$II. Para o melhor caso, ambos os algoritmos possuem complexidade 0(n). \n" +
                "$\\newline$A respeito dessas asserções, assinale a opção correta.");
        questaoAlternativa17.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa17.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa17.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa17.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa17.setAlternativaCorreta("d");
        questaoAlternativa17.setImagem(true);
        questaoAlternativa17.setAlternativasA("As asserções 1 e II são proposições verdadeiras, e a II é uma justificativa correta da 1. ");
        questaoAlternativa17.setAlternativasB("As asserções 1 e II são proposições verdadeiras, mas a II não é uma justificativa correta da 1.");
        questaoAlternativa17.setAlternativasC("A asserção I é uma proposição verdadeira, e a II é uma proposição falsa. ");
        questaoAlternativa17.setAlternativasD("A asserção I é uma proposição falsa, e a II é uma proposição verdadeira. ");
        questaoAlternativa17.setAlternativasE("As asserções 1 e II são proposições falsas. \n");
        questaoAlternativa17.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa17.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa18 = new QuestaoAlternativa();
        questaoAlternativa18.setId(INICIOQUESTAO.longValue());
        questaoAlternativa18.setAno(ANO);
        questaoAlternativa18.setDescricao("A figura abaixo apresenta uma árvore binária de pesquisa, que mantém a seguinte propriedade fundamental: o valor associado à raiz é sempre menor do que o valor de todos os nós da subárvore à direita e sempre maior do que o valor de todos os nós da subárvore à esquerda. \n" +
                "$\\newline$Em relação à árvore apresentada na figura, avalie as afirmações a seguir. \n" +
                "\n" +
                "$\\newline$I. A árvore possui a vantagem de realizar a busca de elementos de forma eficiente, como a busca binária em um vetor. \n" +
                "$\\newline$II. A árvore está desbalanceada, pois a subárvore da esquerda possui um número de nós maior do que a subárvore da direita. \n" +
                "$\\newline$III. Quando a árvore é percorrida utilizando o método de caminhamento pós-ordem, os valores são encontrados em ordem decrescente. \n" +
                "$\\newline$IV. O número de comparações realizadas em função do número n de elementos na árvore em uma busca binária realizada com sucesso é 0(log n). \n" +
                "\n" +
                "$\\newline$É correto apenas o que se afirma em ");
        questaoAlternativa18.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa18.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa18.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa18.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa18.setAlternativaCorreta("b");
        questaoAlternativa18.setImagem(true);
        questaoAlternativa18.setAlternativasA("I e III.");
        questaoAlternativa18.setAlternativasB("I e IV.");
        questaoAlternativa18.setAlternativasC("II e III.");
        questaoAlternativa18.setAlternativasD("I, II e IV. ");
        questaoAlternativa18.setAlternativasE("II, III e IV. ");
        questaoAlternativa18.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa18.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa19 = new QuestaoAlternativa();
        questaoAlternativa19.setId(INICIOQUESTAO.longValue());
        questaoAlternativa19.setAno(ANO);
        questaoAlternativa19.setDescricao("Seja o universo U = {10, 20, 30, 40} e o conjunto dos números naturais N. Com base no conhecimento sobre a lógica de predicados, avalie as afirmações a seguir. \n" +
                "\n" +
                "$\\newline$I. H = ($\\forall x \\in$ N)(3y $\\in$ U)(x < y) é válida.\n" +
                "$\\newline$II. H = ($\\forall x \\in$ N)(3y $\\in$ N)(y < x) é válida. \n" +
                "$\\newline$III. H = ($\\forall x \\in$ U)(3y $\\in$ U)(x > y) é inválida, sendo.\n" +
                "x = 10 um contra-exemplo. \n" +
                "\n" +
                "$\\newline$É correto o que se afirma em");
        questaoAlternativa19.setArea(EArea.MATEMATICA);
        questaoAlternativa19.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa19.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa19.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa19.setAlternativaCorreta("b");

        questaoAlternativa19.setAlternativasA("I, apenas. ");
        questaoAlternativa19.setAlternativasB("III, apenas. ");
        questaoAlternativa19.setAlternativasC("I e II, apenas.");
        questaoAlternativa19.setAlternativasD("II e III, apenas. ");
        questaoAlternativa19.setAlternativasE("I, II e III.");
        questaoAlternativa19.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa20 = new QuestaoAlternativa();
        questaoAlternativa20.setId(INICIOQUESTAO.longValue());
        questaoAlternativa20.setAno(ANO);
        questaoAlternativa20.setDescricao("Considere as seguintes expressões regulares cujo alfabeto é {a, b}. \n" +
                "$\\newline$R1 = $a(a U b)^*$ \n" +
                "$\\newline$R2 = $b(a 11 b)^*$ \n" +
                "$\\newline$Se L(R) é a linguagem associada a uma expressão regular R, é correto afirmar que ");
        questaoAlternativa20.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa20.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa20.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa20.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa20.setAlternativaCorreta("c");

        questaoAlternativa20.setAlternativasA("L(R1) = L(R2).");
        questaoAlternativa20.setAlternativasB("L(R2) = $\\left\\{w I w termina com b\\right\\}$. ");
        questaoAlternativa20.setAlternativasC("existe um autômato finito determinístico cuja linguagem é igual a L(R1) $\\cup$ L(R2). ");
        questaoAlternativa20.setAlternativasD("se R3 é uma expressão regular tal que L(R3) = L(R1) n L(R2), então L(R3) é uma linguagem infinita. ");
        questaoAlternativa20.setAlternativasE("um autômato finito não determinístico que reconheça L(R1) $\\cup$ L(R2) tem, pelo menos, quatro estados. ");
        questaoAlternativa20.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa21 = new QuestaoAlternativa();
        questaoAlternativa21.setId(INICIOQUESTAO.longValue());
        questaoAlternativa21.setAno(ANO);
        questaoAlternativa21.setDescricao("Uma pilha é uma estrutura de dados que armazena uma coleção de itens de dados relacionados e que garante o seguinte funcionamento: o último elemento a ser inserido é o primeiro a ser removido. É comum na literatura utilizar os nomes push e pop para as operações de inserção e remoção de um elemento em uma pilha, respectivamente. O seguinte trecho de código em linguagem C define uma estrutura de dados pilha utilizando um vetor de inteiros, bem como algumas funções para sua manipulação.\n" +
                "$\\newline$A esse respeito, avalie as afirmações a seguir. \n" +
                "$\\newline$I. A complexidade computacional de ambas funções push e pop é 0(1). \n" +
                "$\\newline$II. 0 valor exibido pelo programa seria o mesmo caso a instrução a += pop (p) ; fosse trocada por a += a;\n" +
                "$\\newline$III. Em relação ao vazamento de memória (memory leak), é opcional chamar a função free (p), pois o vetor usado pela pilha é alocado estaticamente. \n" +
                "$\\newline$É correto o que se afirma em");
        questaoAlternativa21.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa21.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa21.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa21.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa21.setAlternativaCorreta("c");
        questaoAlternativa21.setImagem(true);
        questaoAlternativa21.setAlternativasA("I, apenas. ");
        questaoAlternativa21.setAlternativasB("III, apenas. \n");
        questaoAlternativa21.setAlternativasC("I e II, apenas.");
        questaoAlternativa21.setAlternativasD("II e III, apenas. ");
        questaoAlternativa21.setAlternativasE("I, II e III. \n");
        questaoAlternativa21.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa21.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa22 = new QuestaoAlternativa();
        questaoAlternativa22.setId(INICIOQUESTAO.longValue());
        questaoAlternativa22.setAno(ANO);
        questaoAlternativa22.setDescricao("Considerando que o gerente de qualidade é o responsável por definir os meios necessários para se obter um produto com a qualidade desejada, bem como por estabelecer técnicas para aferir a qualidade do produto, avalie as afirmações a seguir. \n" +
                "\n" +
                "$\\newline$I. O uso de processos de desenvolvimento padronizados, sem adaptações, independente do tipo de software a ser desenvolvido, assegura que o produto terá a qualidade desejada. \n" +
                "$\\newline$II. O controle de qualidade pode ser realizado por meio de revisões, incluindo inspeções de programas e de artefatos de projeto. \n" +
                "$\\newline$III. Fatores de qualidade de software estão diretamente relacionados a um único atributo interno de software. \n" +
                "\n" +
                "$\\newline$É correto o que se afirma em ");
        questaoAlternativa22.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa22.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa22.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa22.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa22.setAlternativaCorreta("a");

        questaoAlternativa22.setAlternativasA("II, apenas. ");
        questaoAlternativa22.setAlternativasB("III, apenas. ");
        questaoAlternativa22.setAlternativasC("I e II, apenas. ");
        questaoAlternativa22.setAlternativasD("I e III, apenas. ");
        questaoAlternativa22.setAlternativasE("I, II e III ");
        questaoAlternativa22.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa23 = new QuestaoAlternativa();
        questaoAlternativa23.setId(INICIOQUESTAO.longValue());
        questaoAlternativa23.setAno(ANO);
        questaoAlternativa23.setDescricao("Em relação à aplicação adequada das técnicas de Inteligência Artificial, avalie as afirmações a seguir. \n" +
                "\n" +
                "$\\newline$I. Indução em Árvore de Decisão é utilizada para identificação de fraudes em cartões de crédito. \n" +
                "$\\newline$II. Redes Neurais Artificiais são utilizadas no desenvolvimento de sistemas de análise de risco em aplicações financeiras. \n" +
                "$\\newline$III. Sistemas Especialistas baseados em regras são utilizados no desenvolvimento de sistemas de diagnóstico de falhas em hardware. \n" +
                "\n" +
                "$\\newline$É correto o que se afirma em ");
        questaoAlternativa23.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa23.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa23.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa23.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa23.setAlternativaCorreta("e");

        questaoAlternativa23.setAlternativasA("I, apenas. \n");
        questaoAlternativa23.setAlternativasB("III, apenas. ");
        questaoAlternativa23.setAlternativasC("I e II, apenas. \n");
        questaoAlternativa23.setAlternativasD("II e III, apenas. ");
        questaoAlternativa23.setAlternativasE("I, II e III. ");
        questaoAlternativa23.setNumeroQuestao(NUMEROQUESTAO);


        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa24 = new QuestaoAlternativa();
        questaoAlternativa24.setId(INICIOQUESTAO.longValue());
        questaoAlternativa24.setAno(ANO);
        questaoAlternativa24.setDescricao("O algoritmo de traçado de raios (ray-tracing) é considerado um marco no desenvolvimento de técnicas de computação gráfica para a geração de imagens realistas. \n" +
                "$\\newline$A partir da análise das imagens apresentadas, conclui-se que a técnica de traçado de raios foi utilizada para a geração ");
        questaoAlternativa24.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa24.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa24.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa24.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa24.setAlternativaCorreta("a");
        questaoAlternativa24.setImagem(true);
        questaoAlternativa24.setAlternativasA("apenas da imagem 1.\n");
        questaoAlternativa24.setAlternativasB("apenas da imagem 2. \n");
        questaoAlternativa24.setAlternativasC("apenas das imagens 1 e 3. \n");
        questaoAlternativa24.setAlternativasD("apenas das imagens 2 e 3. \n");
        questaoAlternativa24.setAlternativasE("das imagens 1, 2 e 3. ");
        questaoAlternativa24.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa24.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa25 = new QuestaoAlternativa();
        questaoAlternativa25.setId(INICIOQUESTAO.longValue());
        questaoAlternativa25.setAno(ANO);
        questaoAlternativa25.setDescricao("Um processo tem um ou mais fluxos de execução, normalmente denominados apenas por threads.\n" +
                "\n" +
                "A partir das figuras 1 e 2 apresentadas, avalie as afirmações a seguir. \n" +
                "\n" +
                "$\\newline$I. Tanto na figura 1 quanto na figura 2, existem três threads que utilizam o mesmo espaço de endereçamento. \n" +
                "$\\newline$II. Tanto na figura 1 quanto na figura 2, existem três threads que utilizam três espaços de endereçamento distintos. \n" +
                "$\\newline$III. Na figura 2, existe um processo com um único espaço de endereçamento e três threads de controle. \n" +
                "$\\newline$IV. Na figura 1, existem três processostradicionais, cada qual tem seu espaço de endereçamento e uma única thread de controle. V. As threads permitem que várias execuções ocorram no mesmo ambiente de processo de forma independente uma das outras. \n" +
                "\n" +
                "$\\newline$É correto apenas o que se afirma em ");
        questaoAlternativa25.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa25.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa25.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa25.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa25.setAlternativaCorreta("e");
        questaoAlternativa25.setImagem(true);
        questaoAlternativa25.setAlternativasA("I, II e III.");
        questaoAlternativa25.setAlternativasB("I, II e IV. \n");
        questaoAlternativa25.setAlternativasC("I, III e V.");
        questaoAlternativa25.setAlternativasD("II, IV e V.");
        questaoAlternativa25.setAlternativasE("III, IV e V.");
        questaoAlternativa25.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa25.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa26 = new QuestaoAlternativa();
        questaoAlternativa26.setId(INICIOQUESTAO.longValue());
        questaoAlternativa26.setAno(ANO);
        questaoAlternativa26.setDescricao("O fragmento de código abaixo, escrito em Java, descreve duas implementações diferentes para um lock. Ambas possuem um método denominado acquire e um método denominado release.\n" +
                "Considera-se que: \n" +
                "$\\newline$• as duas implementações de lock são utilizadas por aplicações com, no máximo, duas threads; \n" +
                "$\\newline$• uma aplicação que utilizar qualquer uma destas implementações invocará o método acquire antes de entrar em sua seção crítica e o método release após deixar a seção crítica; \n" +
                "$\\newline$• tanto o método acquire quanto o método release são operações atômicas nas duas implementações de lock; \n" +
                "$\\newline$• para a implementação que requer um t id (thread id), assume-se que ele sempre será O ou 1; \n" +
                "$\\newline$• os métodos disableInterrupts e enableInterrupts são utilizados para desabilitar e habilitar respectivamente as interrupções do processador onde o código for executado. O código desses dois métodos foi desenvolvido para ser utilizado em uma máquina com um ou dois processadores. \n" +
                "$\\newline$A partir das informações apresentadas, avalie as afirmações a seguir. \n" +
                "$\\newline$I. A implementação de LockA garante progresso. \n" +
                "$\\newline$II. A implementação de LockB garante progresso. \n" +
                "$\\newline$III. A implementação de LockA garante exclusão mútua. \n" +
                "$\\newline$IV. A implementação de LockB garante exclusão mútua. \n" +
                "$\\newline$É correto apenas o que se afirma em ");
        questaoAlternativa26.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa26.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa26.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa26.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa26.setAlternativaCorreta("b");
        questaoAlternativa26.setImagem(true);
        questaoAlternativa26.setAlternativasA("I e II.");
        questaoAlternativa26.setAlternativasB("II e III.");
        questaoAlternativa26.setAlternativasC("III e IV.");
        questaoAlternativa26.setAlternativasD("I,II e IV.");
        questaoAlternativa26.setAlternativasE("I. III e IV.");
        questaoAlternativa26.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa26.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa27 = new QuestaoAlternativa();
        questaoAlternativa27.setId(INICIOQUESTAO.longValue());
        questaoAlternativa27.setAno(ANO);
        questaoAlternativa27.setDescricao("Considere o processo de fabricação de um produto siderúrgico que necessita passar por n tratamentos térmicos e químicos para ficar pronto. Cada uma das n etapas de tratamento é realizada uma única vez na mesma caldeira. Além do custo próprio de cada etapa do tratamento, existe o custo de se passar de uma etapa para outra, uma vez que, dependendo da sequência escolhida, pode ser necessário alterar a temperatura da caldeira e limpá-la para evitar a reação entre os produtos químicos utilizados. Assuma que o processo de fabricação inicia e termina com a caldeira limpa. Deseja-se projetar um algoritmo para indicar a sequência de tratamentos que possibilite fabricar o produto com o menor custo total. Nessa situação, conclui-se que ");
        questaoAlternativa27.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa27.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa27.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa27.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa27.setAlternativaCorreta("e");

        questaoAlternativa27.setAlternativasA("a solução do problema é obtida em tempo de ordem 0(nlogn), utilizando-se um algoritmo ótimo de ordenação. ");
        questaoAlternativa27.setAlternativasB("uma heurística para a solução do problema de coloração de grafos solucionará o problema em tempo polinomial. \n");
        questaoAlternativa27.setAlternativasC("o problema se reduz a encontrar a árvore geradora mínima para o conjunto de etapas do processo, requerendo tempo de ordem polinomial para ser solucionado. ");
        questaoAlternativa27.setAlternativasD("a utilização do algoritmo de Dijkstra para se determinar o caminho de custo mínimo entre o estado inicial e o final soluciona o problema em tempo polinomial. \n");
        questaoAlternativa27.setAlternativasE("qualquer algoritmo conhecido para a solução do problema descrito possui ordem de complexidade de tempo não-polinomial, uma vez que o problema do caixeiro viajante se reduz a ele. \n");
        questaoAlternativa27.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa28 = new QuestaoAlternativa();
        questaoAlternativa28.setId(INICIOQUESTAO.longValue());
        questaoAlternativa28.setAno(ANO);
        questaoAlternativa28.setDescricao("Qual o valor de retorno da função a seguir, caso n = 27?");
        questaoAlternativa28.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa28.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa28.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa28.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa28.setAlternativaCorreta("d");
        questaoAlternativa28.setImagem(true);
        questaoAlternativa28.setAlternativasA("8");
        questaoAlternativa28.setAlternativasB("9");
        questaoAlternativa28.setAlternativasC("12");
        questaoAlternativa28.setAlternativasD("16");
        questaoAlternativa28.setAlternativasE("18");
        questaoAlternativa28.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa28.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa29 = new QuestaoAlternativa();
        questaoAlternativa29.setId(INICIOQUESTAO.longValue());
        questaoAlternativa29.setAno(ANO);
        questaoAlternativa29.setDescricao("Considere as seguintes tabelas de um banco de dados: \n" +
                "$\\newline$1. Fornecedor (cod_fornec, nome_fornec, telefone, cidade, UF) \n" +
                "$\\newline$2. Estado (UF, nome_estado) $\\newline$A expressão SQL que obtém os nomes dos estados para os quais não há fornecedores cadastrados é ");
        questaoAlternativa29.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa29.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa29.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa29.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa29.setAlternativaCorreta("c");

        questaoAlternativa29.setAlternativasA("SELECT E.UF FROM Estado AS E WHERE E.nome_estado NOT IN SELECT F.UF FROM Fornecedor AS F); ");
        questaoAlternativa29.setAlternativasB("SELECT E.nome_estado O FROM Estado AS E, FROM Fornecedor AS F WHERE E.UF = F.UF; \n");
        questaoAlternativa29.setAlternativasC("SELECT E.nome estado FROM Estado AS E O WHERE E.UF NOT IN SELECT F.UF FROM Fornecedor AS F); ");
        questaoAlternativa29.setAlternativasD("SELECT E.nome estado O FROM Estado E, FROM gel Fornecedor AS F WHERE E.nome estado = F.UF; ");
        questaoAlternativa29.setAlternativasE("SELECT E.nome_estado FROM Estado AS E (1 WHERE E.UF IN SELECT F.UF FROM Fornecedor AS F); \n");
        questaoAlternativa29.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa30 = new QuestaoAlternativa();
        questaoAlternativa30.setId(INICIOQUESTAO.longValue());
        questaoAlternativa30.setAno(ANO);
        questaoAlternativa30.setDescricao("Uma gramática livre do contexto (GLC) é um modelo computacional geralmente utilizado para definir linguagens de programação e, quando está de acordo com a Forma de Backus-Naur (BNF), permite que alguns operadores sejam utilizados no lado direito de suas produções, como o operador | (pipe) que indica seleção, o operador [ ] que indica que o operando em questão é opcional, e o operador * que indica repetição de 0 ou mais vezes.\n" +
                " \n" +
                "Projetar um compilador para uma determinada linguagem envolve, entre outras coisas, especificar quais são os símbolos válidos nesta linguagem, bem como quais são as regras sintáticas que a definem.\n" +
                "\n" +
                "A linguagem de programação lava é uma linguagem com suporte à orientação a objetos que não permite herança múltipla e que permite que uma classe implemente múltiplas interfaces. A seguir, exibem-se trechos de código sintaticamente válidos na linguagem Java.\n" +
                "\n" +
                "$\\newline$Trecho 1: \n" +
                "$\\newline$class A extends B { } \n" +
                "\n" +
                "$\\newline$Trecho 2: \n" +
                "$\\newline$class F implements C { } \n" +
                "\n" +
                "$\\newline$Trecho 3: \n" +
                "$\\newline$class J extends A implementa C, D { } \n" +
                "\n" +
                "$\\newline$No trecho 1, cria-se uma classe chamada A que herda de uma classe chamada B. No trecho 2, cria-se uma classe chamada F que Implementa uma interface chamada C. No trecho 3, cria-se uma classe chamada J que herda de uma classe chamada A e implementa duas interfaces, chamadas C e D. \n" +
                "$\\newline$Considere que: \n" +
                "$\\newline$• <classdecl> é um não terminal cujo intuito é dar origem a declarações de classes; \n" +
                "$\\newline$• <classbody> é um não terminal cujo intuito é dar origem ao corpo de classes; \n" +
                "$\\newline$• os terminais aparecem entre aspas duplas; \n" +
                "$\\newline$• \"id\" é um símbolo que representa qualquer identificador válido, como nomes de classes ou variáveis. \n" +
                "$\\newline$A gramática que especifica uma linguagem que não permita herança múltipla e que implemente zero ou mais interfaces é \n");
        questaoAlternativa30.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa30.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa30.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa30.setDisciplina(EDisciplina.COMPILADORES);
        questaoAlternativa30.setAlternativaCorreta("d");

        questaoAlternativa30.setAlternativasA("<classdecl> \"class\" \"id\" [ \"extends \" ] \"id\" <classbody> ");
        questaoAlternativa30.setAlternativasB("<classdecl> \"class\" \"id\" (\"extends \" \"id\")* <classbody> ");
        questaoAlternativa30.setAlternativasC("<classdecl> \"class\" \"id\" [ \"extends \" ] \"id\" [\"implements\" ( , |\"id\")*] ");
        questaoAlternativa30.setAlternativasD("<classdecl> \"class\" \"id\" [ \"extends \" \"id\"] [\"implements\" \"id\" (\",\" \"id\")*] <classbody> \n");
        questaoAlternativa30.setAlternativasE("<classdecl> \"class\" \"id\" [\"extends \" \"id\"] \"implements\" \"id\" (\",\" \"id\")* <classbody> \n");
        questaoAlternativa30.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa31 = new QuestaoAlternativa();
        questaoAlternativa31.setId(INICIOQUESTAO.longValue());
        questaoAlternativa31.setAno(ANO);
        questaoAlternativa31.setDescricao("Um conjunto indutivo S é definido de acordo com os seguintes passos: \n" +
                "$\\newline$[Base] Declaração dos elementos iniciais, atômicos. \n" +
                "$\\newline$[Indução] Definição de regras que constroem expressões a partir de elementos já existentes em 5. \n" +
                "$\\newline$[Fecho] Uma declaração de que nada mais está em 5 a não ser os elementos construídos pelos passos Base e Indução. \n" +
                "$\\newline$Os operadores que constroem as expressões nos passos Base e Indução são chamados de construtores do conjunto S. Como um exemplo, a definição abaixo especifica um conjunto indutivo Prop, das proposições booleanas formadas pelos construtores $\\textbf{V}$ (valor verdadeiro), $\\textbf{F}$ (valor falso), ! (para negação de expressões) e $\\textbf{and}$ (para conjunção de expressões). \n" +
                "$\\newline$1. [Base] V, F estão em Prop. \n" +
                "$\\newline$2. [Indução] Se B está em Prop, então (! B) está em Prop. \n" +
                "$\\newline$3. [Indução] Se B1 e B2 estão em Prop, então (and Bl B2) está em Prop. \n" +
                "$\\newline$4. (Fecho] Nada mais está em Prop, a não ser o especificado em Base e Indução. \n" +
                "$\\newline$Expressões (termos) em Prop incluem $\\textbf{V, F, F, 1 V}$, $\\textbf{(and V F)}$, $\\textbf{(and (1 V) (1 F))}$ e assim por diante. De forma análoga, linguagens funcionais permitem a declaração de tipos indutivos com seus respectivos construtores. \n" +
                "$\\newline$Neste contexto, avalie as seguintes afirmações. \n" +
                "$\\newline$I. Conjuntos indutivos são conjuntos enumeráveis. \n" +
                "$\\newline$II. Conjuntos infinitos não podem ser especificados por meio de definições indutivas. \n" +
                "$\\newline$III. Para estender a linguagem Prop de tal forma a considerar expressões para disjunção e implicação de proposição, é necessário acrescentar mais dois construtores à definição de Proa anterior. \n" +
                "$\\newline$É correto o que se afirma em ");
        questaoAlternativa31.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa31.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa31.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa31.setDisciplina(EDisciplina.COMPILADORES);
        questaoAlternativa31.setAlternativaCorreta("c");

        questaoAlternativa31.setAlternativasA("I, apenas.");
        questaoAlternativa31.setAlternativasB("II, apenas.");
        questaoAlternativa31.setAlternativasC("I e III, apenas.");
        questaoAlternativa31.setAlternativasD("II e III, apenas.");
        questaoAlternativa31.setAlternativasE("I, II e III");
        questaoAlternativa31.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa32 = new QuestaoAlternativa();
        questaoAlternativa32.setId(INICIOQUESTAO.longValue());
        questaoAlternativa32.setAno(ANO);
        questaoAlternativa32.setDescricao("Considere o seguinte argumento: \n" +
                "$\\newline$1- Se existe fogo, então existe oxigênio. \n" +
                "$\\newline$2 - Não há oxigênio. \n" +
                "$\\newline$3 - Então não há fogo. \n" +
                "$\\newline$A regra de inferência que justifica a validade do argumento acima é ");
        questaoAlternativa32.setArea(EArea.MATEMATICA);
        questaoAlternativa32.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa32.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa32.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa32.setAlternativaCorreta("b");

        questaoAlternativa32.setAlternativasA("$\\frac{P \\rightarrow Q, \\urcorner P}{\\urcorner Q}$");
        questaoAlternativa32.setAlternativasB("$\\frac{P \\rightarrow Q, \\urcorner Q}{\\urcorner P}$");
        questaoAlternativa32.setAlternativasC("$\\frac{P \\rightarrow Q,  Q}{P}$");
        questaoAlternativa32.setAlternativasD("$\\frac{P \\rightarrow Q,  \\urcorner Q}{\\urcorner \\urcorner P}$");
        questaoAlternativa32.setAlternativasE("$\\frac{P \\rightarrow Q,  P}{ P}$");
        questaoAlternativa32.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa33 = new QuestaoAlternativa();
        questaoAlternativa33.setId(INICIOQUESTAO.longValue());
        questaoAlternativa33.setAno(ANO);
        questaoAlternativa33.setDescricao("Um cientista afirma ter encontrado uma redução polinomial de um problema NP-Completo para um problema pertencente à classe P. Considerando que esta afirmação tem implicações importantes no que diz respeito à complexidade computacional, avalie as seguintes asserções e a relação proposta entre elas. \n" +
                "$\\newline$I. A descoberta do cientista implica P = NP. \n" +
                "$\\newline$PORQUE \n" +
                "$\\newline$II. A descoberta do cientista implica na existência de algoritmos polinomiais para todos os problemas NP-Completos. \n" +
                "$\\newline$A respeito dessas asserções, assinale a opção correta. ");
        questaoAlternativa33.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa33.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa33.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa33.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa33.setAlternativaCorreta("a");

        questaoAlternativa33.setAlternativasA("As asserções I e II são proposições verdadeiras, e a II é uma justificativa correta da I. ");
        questaoAlternativa33.setAlternativasB("As asserções I e 11 são proposições verdadeiras, mas a II não é uma justificativa correta da I. ");
        questaoAlternativa33.setAlternativasC("A asserção I é uma proposição verdadeira, e a II é uma proposição falsa. ");
        questaoAlternativa33.setAlternativasD("A asserção I é uma proposição falsa, e a II é uma proposição verdadeira. ");
        questaoAlternativa33.setAlternativasE("As asserções I e II são proposições falsas. ");
        questaoAlternativa33.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa34 = new QuestaoAlternativa();
        questaoAlternativa34.setId(INICIOQUESTAO.longValue());
        questaoAlternativa34.setAno(ANO);
        questaoAlternativa34.setDescricao("Diferentes implementações da linguagem de programação PROLOG permitem predicados com parâmetros, aceitam as operações de conjunção e disjunção lógica, utilizando os símbolos virgula (conjunção) e ponto e vírgula (disjunção), e a negação lógica com o predicado $\\textbf{not}$. \n" +
                "$\\newline$Considere que um programador propoz as cláusulas mostradas a seguir, definidas em uma linguagem de programação como PROLOG, como parte da verificação de critérios para seleção de candidatos a uma chapa de presidente e vice-presidente de uma empresa. Estas cláusulas apresentam as premissas para chegar às conclusões selecionados, desconsiderados e descartado, a partir da possibilidade da existência de fatos ou regras com o identificador superior. \n" +
                "$\\newline$superior (jorge). \n" +
                "$\\newline$superior (ana). \n" +
                "$\\newline$selecionados (P, Q) :- superior (P) , superior (Q). \n" +
                "$\\newline$desconsiderados (P,Q) :- not (superior (P)); not (superior (Q)). \n" +
                "$\\newline$descartado (P) - not (superior ( P)). \n" +
                "$\\newline$Considerando apenas as colocações e cláusulas acima e a hipótese de mundo fechado (closed world assumption), avalie as afirmações a seguir. \n" +
                "$\\newline$I. Para todos valores dos parâmetros P e Q, o predicado selecionados retornará um valor lógico falso. \n" +
                "$\\newline$II. Para todos valores de P e Q, os predicados selecionados e desconsiderados retornarão valores lógicos diferentes. \n" +
                "$\\newline$III. A conjunção dos predicados selecionados e desconsiderados, para quaisquer valores de P e Q, retornará um valor lógico verdadeiro. \n" +
                "$\\newline$IV. Para qualquer valor do parâmetro P, o predicado descartado retornará um valor verdadeiro. \n" +
                "$\\newline$V. A disjunção dos predicados selecionados e desconsiderados, para quaisquer valores de P e Q, retornará um valor lógico verdadeiro. \n" +
                "$\\newline$É correto apenas o que se afirma em ");
        questaoAlternativa34.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa34.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa34.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa34.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa34.setAlternativaCorreta("c");

        questaoAlternativa34.setAlternativasA("I e II. ");
        questaoAlternativa34.setAlternativasB("I e III. ");
        questaoAlternativa34.setAlternativasC("II e V.");
        questaoAlternativa34.setAlternativasD("III e IV. ");
        questaoAlternativa34.setAlternativasE("IV e V. ");
        questaoAlternativa34.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa35 = new QuestaoAlternativa();
        questaoAlternativa35.setId(INICIOQUESTAO.longValue());
        questaoAlternativa35.setAno(ANO);
        questaoAlternativa35.setDescricao("Uma fazenda possui um único poço artesiano que deve abastecer n bebedouros para o gado. Deseja-se determinar um projeto de ligação entre esses $n+1$ pontos através de encanamentos com a menor extensão total. Um algoritmo proposto para a solução do problema executa os seguintes passos: \n" +
                "$\\newline$1. Crie n+1 conjuntos unitários, cada um contendo um dos pontos a serem ligados entre si e insira esses conjuntos em um conjunto C. \n" +
                "$\\newline$2. Crie um conjunto D contendo um registro para cada combinação possível de dois pontos distintos a serem ligados. Cada registro deve conter os campos ci , cj e d, em que ci e cj são os dois pontos a serem ligados e d é a distância entre eles. \n" +
                "$\\newline$3. Enquanto D não estiver vazio faça: \n" +
                "$\\newline$   3.1.Remova o registro de D com o menor valor de distância d. \n" +
                "$\\newline$ 3.2.Se os valores de c, e do registro removido pertencerem a conjuntos distintos de C, então: \n" +
                "$\\newline$ 3.2.1.Substitua estes dois conjuntos pela união entre eles. \n" +
                "$\\newline$ 3.2.2.Guarde o registro removido em um conjunto-solução.                 \n" +
                "$\\newline$Com base na descrição do problema e do algoritmo proposto, conclui-se que ");
        questaoAlternativa35.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa35.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa35.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa35.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa35.setAlternativaCorreta("a");

        questaoAlternativa35.setAlternativasA("o problema exemplifica a obtenção de uma árvore geradora mínima, portanto está no conjunto P. ");
        questaoAlternativa35.setAlternativasB("o algoritmo é uma heurística para o Problema do Caixeiro Viajante, logo apresenta complexidade polinomial. \n");
        questaoAlternativa35.setAlternativasC("o problema descrito é de otimização, logo pertence ao conjunto NP—difícil, mas não ao conjunto NP—completo. \n");
        questaoAlternativa35.setAlternativasD("uma alternativa para a solução do problema é usar o algoritmo de Dijkstra para obtenção do caminho mínimo entre dois pontos. \n");
        questaoAlternativa35.setAlternativasE("o passo de maior custo do algoritmo é a criação do conjunto D com as combinações de pontos, apresentando complexidade computacional 0(n!). \n");
        questaoAlternativa35.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa36 = new QuestaoAlternativa();
        questaoAlternativa36.setId(INICIOQUESTAO.longValue());
        questaoAlternativa36.setAno(ANO);
        questaoAlternativa36.setDescricao("Na transmissão de dados em sistemas computacionais, o dispositivo de verificação de erros conhecido como bit de paridade consiste da adição de um bit extra durante a transmissão. O valor associado a esse bit é uma função da quantidade de bits de dados iguais a 1 a serem transmitidos. \n" +
                "Nesse contexto, considere a transmissão de 7 bits de dados, com um bit extra de paridade, em um sistema de comunicação no qual a probabilidade de transmitir um bit de forma incorreta é igual a 106e independe de outros erros ocorridos. O bit de paridade também pode sofrer erros. \n" +
                "A probabilidade da ocorrência de transmissão de 2 bits errados, que seria erroneamente detectada como uma transmissão sem erros, é ");
        questaoAlternativa36.setArea(EArea.MATEMATICA);
        questaoAlternativa36.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa36.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa36.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa36.setAlternativaCorreta("c");

        questaoAlternativa36.setAlternativasA("$1,0 x10^{-12}$. ");
        questaoAlternativa36.setAlternativasB("$2,0 x10^{-12}.$");
        questaoAlternativa36.setAlternativasC("$2,8 x10^{-11}.$ ");
        questaoAlternativa36.setAlternativasD("$2,0 x10^{-6}.$ ");
        questaoAlternativa36.setAlternativasE("$2,8 x10^{-5}.$ ");
        questaoAlternativa36.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa37 = new QuestaoAlternativa();
        questaoAlternativa37.setId(INICIOQUESTAO.longValue());
        questaoAlternativa37.setAno(ANO);
        questaoAlternativa37.setDescricao("Considere as proposições lógicas simples P, Q, R: \n" +
                "$\\newline$P: o programador lê a literatura técnica \n" +
                "$\\newline$Q: o programador conhece o idioma inglês \n" +
                "$\\newline$R: o programador será selecionado \n" +
                "$\\newline$Pretende-se demonstrar a validade ou invalidade do seguinte argumento: \n" +
                "$\\newline$Se o programador lê a literatura técnica, então ele conhece inglês. \n" +
                "$\\newline$Se o programador conhece o idioma inglês, então ele será selecionado. \n" +
                "$\\newline$O programador não será selecionado ou ele lê a literatura técnica. \n" +
                "$\\newline$Logo, o programador lê a literatura técnica se e somente se conhece o idioma inglês. \n" +
                "$\\newline$Considerando as colocações acima, avalie as afirmações a seguir. \n" +
                "$\\newline$I. As premissas do argumento podem ser expressas na forma: $P \\rightarrow Q, Q \\rightarrow  R e \\urcorner R v P$. A conclusão do argumento pode ser expressa na forma: $P \\leftrightarrow Q$. \n" +
                "$\\newline$II. A validade do argumento se demostra com os passos: $\\urcorner Q v P$ (equivalente de uma premissa), $P \\rightarrow R$ (transitividade da implicação a partir das premissas) e conclusão $Q \\leftrightarrow R$ (conjunção de duas proposições condicionais e transformação em bicondicional). \n" +
                "$\\newline$III. A validade do argumento se demostra com os passos: $R \\rightarrow P$ (equivalente de uma premissa), $Q \\rightarrow P$ (transitividade da implicação), chegamos à conclusão $P \\leftrightarrow Q$ (conjunção de duas proposições condicionais e transformação em bicondicional). \n" +
                "$\\newline$IV. As premissas do argumento podem ser desta forma: $P \\rightarrow Q, Q \\rightarrow R e \\urcorner R \\rightarrow P$ e a conclusão do argumento acima pode ser expressa na forma $P \\rightarrow Q$\n" +
                "$\\newline$V. A invalidade do argumento acima se demonstra desta forma: a proposição lógica $P \\leftrightarrow Q$ é diferente das premissas $P \\rightarrow Q, Q \\rightarrow R e \\urcorner R v P$\n" +
                "$\\newline$É correto apenas o que se afirma em ");
        questaoAlternativa37.setArea(EArea.MATEMATICA);
        questaoAlternativa37.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa37.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa37.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa37.setAlternativaCorreta("a");

        questaoAlternativa37.setAlternativasA("I e III.");
        questaoAlternativa37.setAlternativasB("II e IV.");
        questaoAlternativa37.setAlternativasC("I, III e V.");
        questaoAlternativa37.setAlternativasD("I,II,IV e V.");
        questaoAlternativa37.setAlternativasE("II, III, IV e V.");
        questaoAlternativa37.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa38 = new QuestaoAlternativa();
        questaoAlternativa38.setId(INICIOQUESTAO.longValue());
        questaoAlternativa38.setAno(ANO);
        questaoAlternativa38.setDescricao("A seguinte sequência de instruções lógicas e aritméticas será executada por um processador em pipeline de 5 estágios: busca da instrução, leitura de registradores, execução, acesso à memória e escrita de registradores. A sequência, no entanto, apresenta conflito de dados.\n" +
                "$\\newline$and R5, R4, R3 \n" +
                "$\\newline$or  R6, R4, R2 \n" +
                "$\\newline$add R1, R2, R2 \n" +
                "$\\newline$mul R3, R2, RI \n" +
                "$\\newline$sub R1, R1, R4 \n" +
                "O pipeline foi implementado sem hardware adicional para a resolução de conflitos, mas os valores dos registradores podem ser escritos na primeira metade do ciclo e lidos na segunda metade. Sabendo-se que o primeiro operando das instruções é o registrador destino, avalie as afirmações a seguir.   \n" +
                "  $\\newline$I. A troca de posição entre as instruções or e odd soluciona o conflito de dados. \n" +
                "$\\newline$Il. A troca de posição entre as instruções add e and soluciona o conflito de dados. \n" +
                "      $\\newline$III. A inserção de uma operação nop (sem operação) entre odd e mui soluciona o conflito de dados.   \n" +
                "$\\newline$É correto o que se afirma em ");
        questaoAlternativa38.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa38.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa38.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa38.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa38.setAlternativaCorreta("b");

        questaoAlternativa38.setAlternativasA("I, apenas. ");
        questaoAlternativa38.setAlternativasB("II, apenas.");
        questaoAlternativa38.setAlternativasC("I e III, apenas.");
        questaoAlternativa38.setAlternativasD("II e III, apenas.");
        questaoAlternativa38.setAlternativasE("I, Il e III.");
        questaoAlternativa38.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa39 = new QuestaoAlternativa();
        questaoAlternativa39.setId(INICIOQUESTAO.longValue());
        questaoAlternativa39.setAno(ANO);
        questaoAlternativa39.setDescricao("Considere a implementação de um compilador em que as etapas de análise léxica e sintática possam compartilhar o mesmo processador de forma concorrente. Considere, ainda, uma solução para o problema, cujo pseudocódigo é mostrado abaixo. O analisador léxico lê os lexemas e identifica os respectivos tokens do arquivo•fonte por meio da chamada ao procedimento Leia. O analisador sintático verifica a sequência dos tokens por meio da chamada ao procedimento Case. Os dois processos compartilham a constante N e as variáveis buf fer, vez e cont. \n" +
                "A partir da análise da solução, avalie as asserções a seguir e a relação proposta entre elas. \n" +
                "$\\newline$I. A eliminação da variável cont e das linhas 4, 7,13 e 16 causa erro de sincronismo entre os processos. \n" +
                "$\\newline$PORQUE \n" +
                "$\\newline$II. A variável cont é responsável pelo controle do acesso à seção crítica do código." +
                "$\\newline$A respeito dessas asserções, assinale a opção correta. ");
        questaoAlternativa39.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa39.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa39.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa39.setDisciplina(EDisciplina.COMPILADORES);
        questaoAlternativa39.setAlternativaCorreta("e");
        questaoAlternativa39.setImagem(true);
        questaoAlternativa39.setAlternativasA("As asserções I e II são proposições verdadeiras, e a II é uma justificativa correta da I.");
        questaoAlternativa39.setAlternativasB("As asserções I e II são proposições verdadeiras, mas a II não é uma justificativa correta da I.");
        questaoAlternativa39.setAlternativasC("A asserção I é uma proposição verdadeira, e a II uma proposição falsa. \n");
        questaoAlternativa39.setAlternativasD("A asserção I é uma proposição falsa, e a II uma proposição verdadeira. ");
        questaoAlternativa39.setAlternativasE("As asserções I e II são proposições falsas.");
        questaoAlternativa39.setImagemQuestao("COLOCAR IMAGEM AQUI");
        questaoAlternativa39.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa40 = new QuestaoAlternativa();
        questaoAlternativa40.setId(INICIOQUESTAO.longValue());
        questaoAlternativa40.setAno(ANO);
        questaoAlternativa40.setDescricao("Um prédio de 4 andares, sendo o primeiro o andar térreo, é servido por 2 elevadores. Por motivo de economia de energia, o elevador 2 só é acionado se for solicitado em mais de 2 andares. Considere um circuito proposto para habilitar o acionamento do elevador 2 conforme é mostrado a seguir. Ele utiliza um multiplexador 4x1, cuja saída é selecionada através da composição dos sinais A e B, que indicam se os andares 1 e 2 solicitaram o serviço do elevador. Assim, o valor $AB=10_{(2)}$ indica que o primeiro andar solicitou elevador, mas não o segundo. Os sinais C e D indicam se os andares 3 e 4 solicitaram o serviço, respectivamente. \n" +
                "$\\newline$Com base na análise do circuito proposto para o problema, avalie as seguintes asserções e a relação proposta entre elas. \n" +
                "$\\newline$I. O circuito não atende às especificações do projeto. \n" +
                "$\\newline$PORQUE \n" +
                "$\\newline$II. A entrada superior do multiplexador com valor constante O indica que a saída será O independentemente dos valores dos sinais A, B, C e D. $\\newline$A respeito dessas asserções, assinale a opção correta. \n");
        questaoAlternativa40.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa40.setTipoFormcao(EFormacao.ESPECIFICA);
        questaoAlternativa40.setProva(ETipoQuestaoProva.ENADE);
        questaoAlternativa40.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
        questaoAlternativa40.setAlternativaCorreta("e");
        questaoAlternativa40.setImagem(true);
        questaoAlternativa40.setAlternativasA("As asserções I e II são proposições verdadeiras, e a II é uma justificativa correta da I. ");
        questaoAlternativa40.setAlternativasB("As asserções I e II são proposições verdadeiras, mas a II não é uma justificativa correta da I.");
        questaoAlternativa40.setAlternativasC("A asserção I é uma proposição verdadeira, e a II é uma proposição falsa. \n");
        questaoAlternativa40.setAlternativasD("A asserção I é uma proposição falsa, e a II é uma proposição verdadeira.");
        questaoAlternativa40.setAlternativasE("A asserções I e II são proposições falsas.");
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
        questoes.add(questaoDiscusiva13);
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
