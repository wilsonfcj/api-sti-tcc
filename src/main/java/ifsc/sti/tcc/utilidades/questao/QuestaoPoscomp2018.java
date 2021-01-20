package ifsc.sti.tcc.utilidades.questao;

import java.util.ArrayList;
import java.util.List;

import ifsc.sti.tcc.modelos.questao.Questao;
import ifsc.sti.tcc.modelos.questao.QuestaoAlternativa;
import ifsc.sti.tcc.props.EArea;
import ifsc.sti.tcc.props.EDisciplina;
import ifsc.sti.tcc.props.ETipoQuestaoProva;

public class QuestaoPoscomp2018 {

    final static Integer ANO = 2018;
    static Integer INICIOQUESTAO = 1131;
    static Integer NUMEROQUESTAO = 1;

    public static List<Questao> registerPoscomp() {

        QuestaoAlternativa questaoAlternativa1 = new QuestaoAlternativa();
        questaoAlternativa1.setId(INICIOQUESTAO.longValue());
        questaoAlternativa1.setAno(ANO);
        questaoAlternativa1.setDescricao("Para quais valores de a, b, c, d, e, f a matriz $\\left(\\begin{array}{c}3 & 0 & 0 & 0\\\\ a & 2 & d & e \\\\ b & 0 & 1 & 0 \\\\ c & 0 & f & 0\\end{array}\\right)$ é diagonalizável?");
        questaoAlternativa1.setArea(EArea.MATEMATICA);
        questaoAlternativa1.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa1.setDisciplina(EDisciplina.CALCULO_NUMERICO);
        questaoAlternativa1.setAlternativaCorreta("d");

        questaoAlternativa1.setAlternativasA("Não pode ser diagonalizável.");
        questaoAlternativa1.setAlternativasB("Apenas para números inteiros");
        questaoAlternativa1.setAlternativasC("Somente para números positivos.");
        questaoAlternativa1.setAlternativasD("Para quaisquer valores.");
        questaoAlternativa1.setAlternativasE("Somente para valores nulos.");
        questaoAlternativa1.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa2 = new QuestaoAlternativa();
        questaoAlternativa2.setId(INICIOQUESTAO.longValue());
        questaoAlternativa2.setAno(ANO);
        questaoAlternativa2.setDescricao("Calcule as coordenadas de $1 + t + t^{2}$ na base $ (1,\uD835\uDC61 − 1, (\uD835\uDC61 − 1)^{2})$ ,  considerando $E = \\mathbb{R}_{2}[t]$ , sendo as coordenadas: $(\\lambda,\\mu,\\eta)$.");
        questaoAlternativa2.setArea(EArea.MATEMATICA);
        questaoAlternativa2.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa2.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa2.setAlternativaCorreta("a");

        questaoAlternativa2.setAlternativasA("$\\eta = 1,\\mu = 3,\\lambda = 3$");
        questaoAlternativa2.setAlternativasB("$\\eta = 0,\\mu = 3,\\lambda = 3$");
        questaoAlternativa2.setAlternativasC("$\\eta = -1,\\mu = 1,\\lambda = 1$");
        questaoAlternativa2.setAlternativasD("$\\eta = 1,\\mu = 2,\\lambda = 1$");
        questaoAlternativa2.setAlternativasE("$\\eta = 3,\\mu = 3,\\lambda = 3$");
        questaoAlternativa2.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa3 = new QuestaoAlternativa();
        questaoAlternativa3.setId(INICIOQUESTAO.longValue());
        questaoAlternativa3.setAno(ANO);
        questaoAlternativa3.setDescricao("O vetor diretor de uma reta r é $\\overrightarrow{v}=(-1,2)$ e passa pelo ponto P(-5, -5). A outra reta s tem pendente m=-2 e passa pelo ponto N(0, 5). Em relação à disposição das retas, elas:\n");
        questaoAlternativa3.setArea(EArea.MATEMATICA);
        questaoAlternativa3.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa3.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa3.setAlternativaCorreta("b");

        questaoAlternativa3.setAlternativasA("São perpendiculares.");
        questaoAlternativa3.setAlternativasB("São paralelas.");
        questaoAlternativa3.setAlternativasC("Se cruzam.");
        questaoAlternativa3.setAlternativasD("São tangentes.");
        questaoAlternativa3.setAlternativasE("Não são retas.");
        questaoAlternativa3.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa4 = new QuestaoAlternativa();
        questaoAlternativa4.setId(INICIOQUESTAO.longValue());
        questaoAlternativa4.setAno(ANO);
        questaoAlternativa4.setDescricao("Dados os vetores $\\overrightarrow{u}=(5,4)$ e $\\overrightarrow{v}=(-3,2)$,calcule o produto escalar e o ângulo que elas formam entre si:\n");
        questaoAlternativa4.setArea(EArea.MATEMATICA);
        questaoAlternativa4.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa4.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa4.setAlternativaCorreta("e");

        questaoAlternativa4.setAlternativasA("7; $107^{\\circ}$");
        questaoAlternativa4.setAlternativasB("7; $-107^{\\circ}$");
        questaoAlternativa4.setAlternativasC("-7; $72^{\\circ}$");
        questaoAlternativa4.setAlternativasD("7; $72^{\\circ}$");
        questaoAlternativa4.setAlternativasE("-7; $107^{\\circ}$");
        questaoAlternativa4.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa5 = new QuestaoAlternativa();
        questaoAlternativa5.setId(INICIOQUESTAO.longValue());
        questaoAlternativa5.setAno(ANO);
        questaoAlternativa5.setDescricao("Calcule o limite de $\\lim_{x \\rightarrow \\infty}(\\sqrt{x^{4}+x^{2}}+\\sqrt{x^{2}+5x}-x^{2}-x)$:");
        questaoAlternativa5.setArea(EArea.MATEMATICA);
        questaoAlternativa5.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa5.setDisciplina(EDisciplina.CALCULO);
        questaoAlternativa5.setAlternativaCorreta("e");

        questaoAlternativa5.setAlternativasA("1");
        questaoAlternativa5.setAlternativasB("5");
        questaoAlternativa5.setAlternativasC("$\\infty$");
        questaoAlternativa5.setAlternativasD("0");
        questaoAlternativa5.setAlternativasE("3");
        questaoAlternativa5.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa6 = new QuestaoAlternativa();
        questaoAlternativa6.setId(INICIOQUESTAO.longValue());
        questaoAlternativa6.setAno(ANO);
        questaoAlternativa6.setDescricao("Determine os valores de a e b para que a função abaixo seja contínua em todo o\n" +
                "seu domínio: $\\begin{cases}-3.sen(x)\\,\\,\\,\\, se\\,\\,\\,\\, x<-\\frac{\\pi}{2}\\\\a.sen(x)+b\\,\\,\\,se -\\frac{\\pi}{2}\\leq x \\leq \\frac{\\pi}{2} \\\\ cos(x)\\,\\,\\, se \\,\\,\\, x>\\frac{\\pi}{2}\\end{cases}$");
        questaoAlternativa6.setArea(EArea.MATEMATICA);
        questaoAlternativa6.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa6.setDisciplina(EDisciplina.CALCULO);
        questaoAlternativa6.setAlternativaCorreta("b");

        questaoAlternativa6.setAlternativasA("$a = \\frac{3}{2};b = \\frac{3}{2}$");
        questaoAlternativa6.setAlternativasB("$a = -\\frac{3}{2};b = \\frac{3}{2}$");
        questaoAlternativa6.setAlternativasC("$a = \\frac{3}{2};b = -\\frac{3}{2}$");
        questaoAlternativa6.setAlternativasD("$a = -\\frac{3}{2};b = -\\frac{3}{2}$");
        questaoAlternativa6.setAlternativasE("$a = \\frac{2}{3};b = \\frac{3}{2}$");
        questaoAlternativa6.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa7 = new QuestaoAlternativa();
        questaoAlternativa7.setId(INICIOQUESTAO.longValue());
        questaoAlternativa7.setAno(ANO);
        questaoAlternativa7.setDescricao("Determine a matriz inversa de $A = \\frac{1}{13}\\left(\\begin{array}{c}1 & 3 & 5\\\\ 0 & -1 & 4 \\\\ 1 & 1 & 0\\end{array}\\right)$");
        questaoAlternativa7.setArea(EArea.MATEMATICA);
        questaoAlternativa7.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa7.setDisciplina(EDisciplina.CALCULO_NUMERICO);
        questaoAlternativa7.setAlternativaCorreta("c");

        questaoAlternativa7.setAlternativasA("$A^{-1} = \\frac{1}{13}\\left(\\begin{array}{c}1 & 0 & 1\\\\ 3 & -1 & 1 \\\\ 5 &4 & 0\\end{array}\\right)$");
        questaoAlternativa7.setAlternativasB("$A^{-1} = \\left(\\begin{array}{c}1 & 3 & 5\\\\ 0 & -1 & 4 \\\\ 1 & 1 & 0\\end{array}\\right)$");
        questaoAlternativa7.setAlternativasC("$A^{-1} = \\left(\\begin{array}{c}-4 & 5 & 17\\\\4 & -5 & -4 \\\\ 1 & 2 & -1\\end{array}\\right)$");
        questaoAlternativa7.setAlternativasD("$A^{-1} = \\frac{1}{13} \\left(\\begin{array}{c}-4 & 5 & 17\\\\4 & -5 & -4 \\\\ 1 & 2 & -1\\end{array}\\right)$");
        questaoAlternativa7.setAlternativasE("$A^{-1} = \\left(\\begin{array}{c}-5 & 3 & 12\\\\ 0 & -1 & 4 \\\\ -1 & 1 & -4\\end{array}\\right)$");
        questaoAlternativa7.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa8 = new QuestaoAlternativa();
        questaoAlternativa8.setId(INICIOQUESTAO.longValue());
        questaoAlternativa8.setAno(ANO);
        questaoAlternativa8.setDescricao(
                "O ponto P $(3,45^{\\circ},60^{\\circ})$ está expresso em coordenadas esféricas. Encontre suas coordenadas cartesianas:\n" +
                        "$\\newline Ax = r.sen(\\theta).cos(\\varphi)$\n" +
                        "$\\newline Ay = r.sen(\\theta).sen(\\varphi)$\n" +
                        "$\\newline Az = r.cos(\\theta)$");
        questaoAlternativa8.setArea(EArea.MATEMATICA);
        questaoAlternativa8.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa8.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa8.setAlternativaCorreta("a");

        questaoAlternativa8.setAlternativasA("P $\\left(\\begin{array}{c}\\frac{3\\sqrt{2}}{4},\\frac{3\\sqrt{6}}{4},\\frac{3\\sqrt{2}}{2}\\end{array}\\right)$");
        questaoAlternativa8.setAlternativasB("P $\\left(\\begin{array}{c}\\frac{3\\sqrt{6}}{4},\\frac{3\\sqrt{2}}{4},\\frac{3\\sqrt{2}}{4}\\end{array}\\right)$");
        questaoAlternativa8.setAlternativasC("P $\\left(\\begin{array}{c}\\frac{3\\sqrt{2}}{2},\\frac{3\\sqrt{2}}{4},\\frac{3\\sqrt{2}}{2}\\end{array}\\right)$");
        questaoAlternativa8.setAlternativasD("P $\\left(\\begin{array}{c}\\frac{3\\sqrt{2}}{4},\\frac{3\\sqrt{2}}{2},\\frac{3\\sqrt{2}}{2}\\end{array}\\right)$");
        questaoAlternativa8.setAlternativasE("P $\\left(\\begin{array}{c}\\frac{3\\sqrt{2}}{4},\\frac{3\\sqrt{6}}{4},\\frac{3\\sqrt{6}}{4}\\end{array}\\right)$");
        questaoAlternativa8.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa9 = new QuestaoAlternativa();
        questaoAlternativa9.setId(INICIOQUESTAO.longValue());
        questaoAlternativa9.setAno(ANO);
        questaoAlternativa9.setDescricao("Simplifique por Karnaugh a função cuja expressão, em termos canônicos, é $f(x,y,z) = {\\sum}_3 m(2,5,6)$:");
        questaoAlternativa9.setArea(EArea.MATEMATICA);
        questaoAlternativa9.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa9.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa9.setAlternativaCorreta("b");

        questaoAlternativa9.setAlternativasA("$f(x,y,z) = xyz + x\\overline{y}z + \\overline{xy}z$");
        questaoAlternativa9.setAlternativasB("$f(x,y,z) = x\\overline{y}z + \\overline{x}y\\overline{z} + xy\\overline{z}$");
        questaoAlternativa9.setAlternativasC("$f(x,y,z) = x\\overline{yz} + xyz + \\overline{xy}z$");
        questaoAlternativa9.setAlternativasD("$f(x,y,z) = xyz + xy\\overline{z} + \\overline{x}yz$");
        questaoAlternativa9.setAlternativasE("$f(x,y,z) = xyz + xyz + \\overline{x}yz$");
        questaoAlternativa9.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa10 = new QuestaoAlternativa();
        questaoAlternativa10.setId(INICIOQUESTAO.longValue());
        questaoAlternativa10.setAno(ANO);
        questaoAlternativa10
                .setDescricao("A primitiva de $\\int\\frac{x}{\\sqrt{x^{2}+1}}dx$ é:");
        questaoAlternativa10.setArea(EArea.MATEMATICA);
        questaoAlternativa10.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa10.setDisciplina(EDisciplina.CALCULO);
        questaoAlternativa10.setAlternativaCorreta("b");

        questaoAlternativa10.setAlternativasA("$(\\sqrt{x^{2}+1})^{-1}+c$");
        questaoAlternativa10.setAlternativasB("$\\sqrt{x^{2}+1}+c$");
        questaoAlternativa10.setAlternativasC("$x^{2}+1+c$");
        questaoAlternativa10.setAlternativasD("$x^{2}+c$");
        questaoAlternativa10.setAlternativasE("$c$");
        questaoAlternativa10.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa11 = new QuestaoAlternativa();
        questaoAlternativa11.setId(INICIOQUESTAO.longValue());
        questaoAlternativa11.setAno(ANO);
        questaoAlternativa11.setDescricao("Considere a proposição abaixo:\n" +
                "“$\\newline$Em toda turma da minha universidade, existe pelo menos um aluno canhoto.”\n" +
                "$\\newline$A negação da proposição acima é logicamente equivalente à proposição:");
        questaoAlternativa11.setArea(EArea.MATEMATICA);
        questaoAlternativa11.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa11.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa11.setAlternativaCorreta("b");

        questaoAlternativa11.setAlternativasA("Existe uma turma na minha universidade na qual há, no máximo, um aluno canhoto.\n");
        questaoAlternativa11.setAlternativasB("Há, pelo menos, uma turma da minha universidade na qual não existe aluno canhoto.");
        questaoAlternativa11.setAlternativasC("Não há turma na minha universidade na qual todos os alunos sejam canhotos.");
        questaoAlternativa11.setAlternativasD("Em cada uma das turmas da minha universidade, não há aluno algum que seja canhoto.");
        questaoAlternativa11.setAlternativasE("Em nenhuma turma da minha universidade, há algum aluno que seja canhoto.\n");
        questaoAlternativa11.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa12 = new QuestaoAlternativa();
        questaoAlternativa12.setId(INICIOQUESTAO.longValue());
        questaoAlternativa12.setAno(ANO);
        questaoAlternativa12.setDescricao("A proposição $(p\\leftrightarrow q)\\rightarrow (p \\rightarrow q)$ é equivalente a:");
        questaoAlternativa12.setArea(EArea.MATEMATICA);
        questaoAlternativa12.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa12.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa12.setAlternativaCorreta("c");

        questaoAlternativa12.setAlternativasA("Falso");
        questaoAlternativa12.setAlternativasB("$p \\rightarrow \\sim q$");
        questaoAlternativa12.setAlternativasC("Verdadeiro");
        questaoAlternativa12.setAlternativasD("$p \\rightarrow q$");
        questaoAlternativa12.setAlternativasE("$(q \\rightarrow p)\\wedge(p \\rightarrow q)$");
        questaoAlternativa12.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa13 = new QuestaoAlternativa();
        questaoAlternativa13.setId(INICIOQUESTAO.longValue());
        questaoAlternativa13.setAno(ANO);
        questaoAlternativa13.setDescricao("Um motoqueiro possui “n” entregas para realizar em “n” pontos distintos de uma cidade, podendo fazer a entrega em qualquer ordem. O entregador dispõe de uma tabela de distâncias que informa o tempo exato para se locomover de moto entre cada par de pontos de entrega. Considere distâncias assimétricas, ou seja, dist(a,b) e dist(b,a) podem ser diferentes. Se o entregador resolver avaliar todas as possíveis soluções para escolher a sequência de entregas cuja distância a ser percorrida seja mínima, quantas rotas ele iria avaliar para n=5? Resolva o problema ignorando a distância que seria gasta para o entregador se locomover até o primeiro ponto de entrega.");
        questaoAlternativa13.setArea(EArea.MATEMATICA);
        questaoAlternativa13.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa13.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa13.setAlternativaCorreta("d");

        questaoAlternativa13.setAlternativasA("5.");
        questaoAlternativa13.setAlternativasB("25.");
        questaoAlternativa13.setAlternativasC("60.");
        questaoAlternativa13.setAlternativasD("120.");
        questaoAlternativa13.setAlternativasE("240.");
        questaoAlternativa13.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa14 = new QuestaoAlternativa();
        questaoAlternativa14.setId(INICIOQUESTAO.longValue());
        questaoAlternativa14.setAno(ANO);
        questaoAlternativa14.setDescricao("Seja um código de Hamming sistemático com a seguinte matriz de comprovação tal que $H = (-P^{T}|I_{r})$: $H = \\left(\\begin{array}{c}1 & 1 & 0 & * & * & * & *\\\\ 0 & 1 & 1 & * & * & * & * \\\\ 1 & 0 & 1 & * & * & * & *\\end{array}\\right)$ \n" +
                "Transmite-se a palavra código Y=0000000 e, durante a transmissão, se produzem erros nas posições 2, 3, 4 e 5. Que mensagem de usuário descodificaríamos?");
        questaoAlternativa14.setArea(EArea.MATEMATICA);
        questaoAlternativa14.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa14.setDisciplina(EDisciplina.CALCULO_NUMERICO);
        questaoAlternativa14.setAlternativaCorreta("c");

        questaoAlternativa14.setAlternativasA("X = 0100");
        questaoAlternativa14.setAlternativasB("X = 0111");
        questaoAlternativa14.setAlternativasC("X = 0011");
        questaoAlternativa14.setAlternativasD("X = 0010");
        questaoAlternativa14.setAlternativasE("X = 1001");
        questaoAlternativa14.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa15 = new QuestaoAlternativa();
        questaoAlternativa15.setId(INICIOQUESTAO.longValue());
        questaoAlternativa15.setAno(ANO);
        questaoAlternativa15.setDescricao("Considere as premissas a seguir verdadeiras:\n" +
                "$\\newline$Premissa 1: Se hoje é sábado, então Heide vai à praia e Luiz vai assistir ao jogo de futebol.\n" +
                "$\\newline$Premissa 2: Se Heide vai à praia ou Marcos vai trabalhar, então Alessandra faz o churrasco.\n" +
                "$\\newline$Premissa 3: Hoje, Luiz foi assistir ao jogo de futebol.\n" +
                "$\\newline$Premissa 4: Hoje, Alessandra não fez o churrasco.\n" +
                "$\\newline$É correto concluir:");
        questaoAlternativa15.setArea(EArea.MATEMATICA);
        questaoAlternativa15.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa15.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa15.setAlternativaCorreta("c");

        questaoAlternativa15.setAlternativasA("Hoje é sábado e Heide foi à praia.");
        questaoAlternativa15.setAlternativasB("Hoje não é sábado e Heide foi à praia.");
        questaoAlternativa15.setAlternativasC("Hoje não é sábado e Marcos não foi trabalhar.\n");
        questaoAlternativa15.setAlternativasD("Heide foi à praia ou Marcos foi trabalhar.\n");
        questaoAlternativa15.setAlternativasE("Hoje é sábado e Marcos foi trabalhar.");
        questaoAlternativa15.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa16 = new QuestaoAlternativa();
        questaoAlternativa16.setId(INICIOQUESTAO.longValue());
        questaoAlternativa16.setAno(ANO);
        questaoAlternativa16.setDescricao("Uma enquete foi realizada com 50 pessoas sobre as preferências de leitura de duas revistas, A e B. Observou-se que os que leem as duas revistas são o dobro do que os que leem apenas a A, o triplo do que os que leem apenas a B e o quádruplo do que os que não leem nenhuma das duas revistas. Quantas pessoas leem a revista A?");
        questaoAlternativa16.setArea(EArea.MATEMATICA);
        questaoAlternativa16.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa16.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa16.setAlternativaCorreta("d");

        questaoAlternativa16.setAlternativasA("24");
        questaoAlternativa16.setAlternativasB("30");
        questaoAlternativa16.setAlternativasC("32");
        questaoAlternativa16.setAlternativasD("36");
        questaoAlternativa16.setAlternativasE("40");
        questaoAlternativa16.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa17 = new QuestaoAlternativa();
        questaoAlternativa17.setId(INICIOQUESTAO.longValue());
        questaoAlternativa17.setAno(ANO);
        questaoAlternativa17.setDescricao("Considere o grafo G abaixo e as afirmações feitas sobre G:" +
                "$\\newline$I. O grafo é planar.\n" +
                "$\\newline$II. O menor caminho direcionado medido em número de arcos entre os nós D e F tem comprimento 2.\n" +
                "$\\newline$III. DABCEF representa uma ordenação topológica válida dos nós do grafo.\n" +
                "$\\newline$IV. Existe algum caminho direcionado entre D e todos os outros nós do grafo.\n" +
                "$\\newline$V. O maior componente fortemente conexo de G é composto por um único nó, ou seja, não existe em G um par de nós distintos x e y que tenha um caminho direcionado entre x e y e um caminho direcionado entre y e x.\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa17.setArea(EArea.MATEMATICA);
        questaoAlternativa17.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa17.setDisciplina(EDisciplina.GRAFOS);
        questaoAlternativa17.setAlternativaCorreta("d");
        questaoAlternativa17.setImagem(true);
        questaoAlternativa17.setAlternativasA("Apenas II e III.");
        questaoAlternativa17.setAlternativasB("Apenas I, II e IV.");
        questaoAlternativa17.setAlternativasC("Apenas I, III e V.");
        questaoAlternativa17.setAlternativasD("Apenas I, II, III e V.");
        questaoAlternativa17.setAlternativasE("I, II, III, IV e V.");
        questaoAlternativa17.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa17.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa18 = new QuestaoAlternativa();
        questaoAlternativa18.setId(INICIOQUESTAO.longValue());
        questaoAlternativa18.setAno(ANO);
        questaoAlternativa18.setDescricao("O tempo, t, de um determinado processo, segue uma distribuição exponencial, tal\n" +
                "que $f(t) = 0,25e^{-0,25t}$ para t > 0.Qual a probabilidade de a duração desse processo ser menor do que 10 segundos?");
        questaoAlternativa18.setArea(EArea.MATEMATICA);
        questaoAlternativa18.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa18.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa18.setAlternativaCorreta("e");

        questaoAlternativa18.setAlternativasA("15,8%.");
        questaoAlternativa18.setAlternativasB("22,1%.");
        questaoAlternativa18.setAlternativasC("25,0%.");
        questaoAlternativa18.setAlternativasD("68,5%.");
        questaoAlternativa18.setAlternativasE("91,8%.");
        questaoAlternativa18.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa19 = new QuestaoAlternativa();
        questaoAlternativa19.setId(INICIOQUESTAO.longValue());
        questaoAlternativa19.setAno(ANO);
        questaoAlternativa19.setDescricao("Considere um conjunto S com “n” elementos distintos. Considerando n=10,\n" +
                "quantos subconjuntos de S com até “n” elementos é possível formar?");
        questaoAlternativa19.setArea(EArea.MATEMATICA);
        questaoAlternativa19.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa19.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa19.setAlternativaCorreta("c");

        questaoAlternativa19.setAlternativasA("120.");
        questaoAlternativa19.setAlternativasB("512.");
        questaoAlternativa19.setAlternativasC("1024");
        questaoAlternativa19.setAlternativasD("1814400.");
        questaoAlternativa19.setAlternativasE("1240000.");
        questaoAlternativa19.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa20 = new QuestaoAlternativa();
        questaoAlternativa20.setId(INICIOQUESTAO.longValue());
        questaoAlternativa20.setAno(ANO);
        questaoAlternativa20.setDescricao("Calcule a média, a mediana e a moda da seguinte série de números: 5, 3, 6, 5, 4,\n" +
                "5, 2, 8, 6, 5, 4, 8, 3, 4, 5, 4, 8, 2, 5, 4.");
        questaoAlternativa20.setArea(EArea.MATEMATICA);
        questaoAlternativa20.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa20.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa20.setAlternativaCorreta("a");

        questaoAlternativa20.setAlternativasA("4,8; 5; 5");
        questaoAlternativa20.setAlternativasB("4,8; 10; 20");
        questaoAlternativa20.setAlternativasC("5,0; 10; 10");
        questaoAlternativa20.setAlternativasD("4,8; 20; 10");
        questaoAlternativa20.setAlternativasE("4,8; 5; 10");
        questaoAlternativa20.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa21 = new QuestaoAlternativa();
        questaoAlternativa21.setId(INICIOQUESTAO.longValue());
        questaoAlternativa21.setAno(ANO);
        questaoAlternativa21.setDescricao("Dadas as seguintes relações de recorrência:\n" +
                "$\\newline I. \\,\\,\\,\\, T(n)=2T\\left(\\begin{array}{c}\\frac{n}{2}\\end{array}\\right) + O(n)$\n" +
                "$\\newline II. \\,\\,\\,\\, T(n)=8T\\left(\\begin{array}{c}\\frac{n}{2}\\end{array}\\right) + O(n^{2})$\n" +
                "$\\newline III. \\,\\,\\,\\, T(n)=T\\left(\\begin{array}{c}\\frac{n}{2}\\end{array}\\right) + O(1)$\n" +
                "$\\newline$As relações de recorrência I, II, e III pertencem, nessa ordem, às classes de complexidade:");
        questaoAlternativa21.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa21.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa21.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa21.setAlternativaCorreta("c");

        questaoAlternativa21.setAlternativasA("$\\theta(n^{2}),\\theta(n^{3}),e\\,\\, \\theta(n)$");
        questaoAlternativa21.setAlternativasB("$\\theta(n),\\theta(n^{2}),e\\,\\, \\theta(n^{3})$");
        questaoAlternativa21.setAlternativasC("$\\theta(n \\,\\, log \\,\\, n),\\theta(n^{3}),e\\,\\, \\theta(log \\,\\, n)$");
        questaoAlternativa21.setAlternativasD("$\\theta( log \\,\\, n),\\theta(n \\,\\, log \\,\\, n),e\\,\\, \\theta(n^{3})$");
        questaoAlternativa21.setAlternativasE("$\\theta(n^{2}),\\theta(n^{2}),e\\,\\, \\theta(n^{2})$");
        questaoAlternativa21.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa22 = new QuestaoAlternativa();
        questaoAlternativa22.setId(INICIOQUESTAO.longValue());
        questaoAlternativa22.setAno(ANO);
        questaoAlternativa22.setDescricao("Dado o trecho de código abaixo.\n" +
                "Assumindo que a instrução c=c+1 é O(1), a expressão que melhor define a ordem de complexidade desse trecho é:\n");
        questaoAlternativa22.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa22.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa22.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa22.setAlternativaCorreta("a");
        questaoAlternativa22.setImagem(true);
        questaoAlternativa22.setAlternativasA("O(n log n)");
        questaoAlternativa22.setAlternativasB("O(log n)");
        questaoAlternativa22.setAlternativasC("O(n)");
        questaoAlternativa22.setAlternativasD("O($n^{2}$)");
        questaoAlternativa22.setAlternativasE("O($\\sqrt{n}$)");
        questaoAlternativa22.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa22.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa23 = new QuestaoAlternativa();
        questaoAlternativa23.setId(INICIOQUESTAO.longValue());
        questaoAlternativa23.setAno(ANO);
        questaoAlternativa23.setDescricao("Selecione o menor item do vetor e, a seguir, troque-o com o item que está na primeira posição do vetor. Repita essas duas operações com os n – 1 itens restantes, depois com os n – 2 itens, até que reste apenas um elemento. Qual é o método de ordenação descrito?");
        questaoAlternativa23.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa23.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa23.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa23.setAlternativaCorreta("a");

        questaoAlternativa23.setAlternativasA("Por seleção.");
        questaoAlternativa23.setAlternativasB("Por inserção.");
        questaoAlternativa23.setAlternativasC("Shellsort.");
        questaoAlternativa23.setAlternativasD("Quicksort.");
        questaoAlternativa23.setAlternativasE("Heapsort.");
        questaoAlternativa23.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa24 = new QuestaoAlternativa();
        questaoAlternativa24.setId(INICIOQUESTAO.longValue());
        questaoAlternativa24.setAno(ANO);
        questaoAlternativa24.setDescricao("Sobre árvores binárias, é correto afirmar que:");
        questaoAlternativa24.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa24.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa24.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa24.setAlternativaCorreta("b");

        questaoAlternativa24.setAlternativasA(" É uma árvore em que todo nó interno contém um registro e, para cada nó, a seguinte\n" +
                "propriedade é verdadeira: todos os registros com chaves menores estão na subárvore esquerda e todos os registros com chaves maiores estão na subárvore direta. ");
        questaoAlternativa24.setAlternativasB("A altura de um nó é o comprimento do caminho mais longo deste nó até um nó folha. A altura de uma árvore é a altura do nó raiz. ");
        questaoAlternativa24.setAlternativasC("Se o nível do nó raiz de uma árvore binária é zero; se um nó está no nível i, a raiz de suas duas subárvores está no nível i+2. ");
        questaoAlternativa24.setAlternativasD("O número de subárvores de um nó é chamado de grau. Um nó de grau dois é chamado de nó externo ou nó folha. ");
        questaoAlternativa24.setAlternativasE("Para encontrar um registro que contém a chave x em uma árvore binária de pesquisa, primeiro\n" +
                "compare-a com a chave que está na raiz. Se é menor, vá para a subárvore da direita; se é maior,\n" +
                "vá para a subárvore da esquerda.");
        questaoAlternativa24.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa25 = new QuestaoAlternativa();
        questaoAlternativa25.setId(INICIOQUESTAO.longValue());
        questaoAlternativa25.setAno(ANO);
        questaoAlternativa25.setDescricao("Para medir o custo de execução de um algoritmo, é comum definir uma função de complexidade f, em que f(n) é a medida de tempo necessário para executar um algoritmo para um problema de tamanho n. Considere as afirmações abaixo sobre funções de complexidade:\n" +
                "$\\newline$I. Se f(n) é uma medida de quantidade de tempo necessário para executar um algoritmo em um problema de tamanho n, então f é chamada função de complexidade de tempo.\n" +
                "$\\newline$II. Se f(n) é uma medida de quantidade de memória necessária para executar um algoritmo de tamanho n, então f é chamada função de complexidade de espaço.\n" +
                "$\\newline$III. A complexidade de tempo não representa o tempo diretamente, mas é estimada pelo número de vezes que determinada operação relevante é executada.\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa25.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa25.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa25.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa25.setAlternativaCorreta("e");

        questaoAlternativa25.setAlternativasA("Apenas I.");
        questaoAlternativa25.setAlternativasB("Apenas II.");
        questaoAlternativa25.setAlternativasC("Apenas III.");
        questaoAlternativa25.setAlternativasD("Apenas I e II.");
        questaoAlternativa25.setAlternativasE("I, II e III.");
        questaoAlternativa25.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa26 = new QuestaoAlternativa();
        questaoAlternativa26.setId(INICIOQUESTAO.longValue());
        questaoAlternativa26.setAno(ANO);
        questaoAlternativa26.setDescricao("Sobre funções de transformação (hashing), analise as seguintes assertivas:\n" +
                "$\\newline$I. Se o número de chaves N e o tamanho da tabela M são iguais, então temos uma função de transformação perfeita mínima, isto é, apenas um acesso à tabela é necessário e não há lugares vazios na tabela.\n" +
                "$\\newline$II. Uma das formas de resolver as colisões é construir uma lista encadeada para cada endereço da tabela, no qual as chaves com o mesmo endereço são encadeadas em uma lista linear.\n" +
                "$\\newline$III. Uma função transformação linear ocorre quando as chaves são localizadas em um único acesso, não há espaço vazio na tabela e o processamento é realizado na ordem lexicográfica.\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa26.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa26.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa26.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa26.setAlternativaCorreta("d");

        questaoAlternativa26.setAlternativasA("Apenas I.");
        questaoAlternativa26.setAlternativasB("Apenas II.");
        questaoAlternativa26.setAlternativasC("Apenas III.");
        questaoAlternativa26.setAlternativasD("Apenas I e II.");
        questaoAlternativa26.setAlternativasE("I, II e III.");
        questaoAlternativa26.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa27 = new QuestaoAlternativa();
        questaoAlternativa27.setId(INICIOQUESTAO.longValue());
        questaoAlternativa27.setAno(ANO);
        questaoAlternativa27.setDescricao("Considere o seguinte código em Linguagem C apresentado abaixo.\n" +
                "Assinale a alternativa que corresponde à saída impressa na tela. ");
        questaoAlternativa27.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa27.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa27.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa27.setAlternativaCorreta("b");
        questaoAlternativa27.setImagem(true);
        questaoAlternativa27.setAlternativasA(" 7 9 -1 7 -1 9 6 10 -1 7 0 9");
        questaoAlternativa27.setAlternativasB("7 9 -1 7 -1 9 6 10 -1 6 -1 10");
        questaoAlternativa27.setAlternativasC(" 7 9 -1 7 -1 9 6 10 -1 3 -2 9");
        questaoAlternativa27.setAlternativasD("7 9 -1 7 -1 9 6 10 -1 4 -3 10");
        questaoAlternativa27.setAlternativasE("7 9 -1 7 -1 9 6 10 -1 5 -4 10");
        questaoAlternativa27.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa27.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa28 = new QuestaoAlternativa();
        questaoAlternativa28.setId(INICIOQUESTAO.longValue());
        questaoAlternativa28.setAno(ANO);
        questaoAlternativa28.setDescricao("De acordo com o diagrama de classes UML a seguir, assinale a alternativa correta.");
        questaoAlternativa28.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa28.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa28.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa28.setAlternativaCorreta("d");
        questaoAlternativa28.setImagem(true);
        questaoAlternativa28.setAlternativasA("O relacionamento entre “Veículo” e “Roda” se relaciona diretamente com polimorfismo.");
        questaoAlternativa28.setAlternativasB("O relacionamento entre “Roda” e “Pneu” se relaciona diretamente com polimorfismo.");
        questaoAlternativa28.setAlternativasC("O relacionamento entre “Veículo” e “Pneu” se relaciona diretamente com polimorfismo.");
        questaoAlternativa28.setAlternativasD("O relacionamento entre “Artefato” e “Veículo” se relaciona diretamente com polimorfismo.\n");
        questaoAlternativa28.setAlternativasE("O relacionamento entre “Veículo” e “Aerofólio” se relaciona diretamente com polimorfismo. ");
        questaoAlternativa28.setImagemQuestao("data:image/png;base64,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25apU6eydOlScRK1Cmi0eOzfv5/GjRvz4MEDdZtSae7fv8/p06fx8vISl2Q1GAsLC8aOHcuWLVtq7Y+UutBY8QgNDcXU1JRt27bh4+OjbnMqzfLly5k7d24Jj+UimkebNm0YMWIEq1evrlQEvvqORopHYWEh/v7+QmDjDz74gD/++KPM8oGBgaxbt66mzCuXPXv2MGbMGHWbIVIJWrduzZQpU/Dx8SEjI0Pd5tQKNFI8ZDIZd+/exdHREYCePXty9erVUsv+888/HDt2jKSkpJo0sUz27t3La6+9xsCBA9VtikgladasGa6urmzcuFHdptQKNFI8vvjii2Lr8NbW1piZmREaGlqirJOTE56enjVpXpns27cPc3NzUThqMe3bt2fs2LH897//5dmzZ+o2R6PROPG4fv067du3LzFX4OnpybZt20qUl0gk6Onp1ZR5ZZKXl4e/vz+DBg0SJ0hrOS1atGD48OFs2bKF/Px8dZujsWiceEgkklIPL3322Wds3rxZDRaVT0ZGBitWrGDlypXqNqVC5OfniwfEyqF9+/a4urri4+NTrzfUvQqNE49OnTrx9OlT/ve//wlpV69exdnZucxrdHV1adKkSU2YV4L09HS2bNnC5MmT1WZDZSkoKCA3N1fdZmg8bdq0YfTo0fj6+tYph9HKQuPEA+Cbb75hyZIlwvuLFy++MipYs2bN8Pb2rgnTiiGXy/nhhx/46KOPNOLMSkUxNDSkUaNG6jajVtC6dWvef/99cRK1FDRSPPT19XFwcCAkJISYmBiysrLo3Lmzus0qwdy5c5k5cyatWrVStykiKqRjx464ubmxevVqsQfyAhopHtra2rz77rv89ddfbN++ncmTJ6vbpBLcunWLpk2b1pqhikj1aN26Ne+9957GzrupA92qXpiYmMjff/+tTFtK4Ofnh5OTE+fPn1fpfarCkSNHNC5Y9JEjRyq0xTomJoa9e/fWgEWq4/3338fExARd3Sp/hStN586dMTQ05Lvvvqs34UC7du1Kx44dS82rcstHRUVx7do13nvvvSobVh6afOIxOzubhw8f4uDgoG5TBPz8/Jg+fXq55b788ssasEZ1bN68GWtra5ycnDAyMqrRe9vZ2fH48WM6dOiAoaFhjd67pgkLC+Pu3bt88803peZXS7Y7duzIoEGDqlNFrWXdunUa542qSZMm9eLz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");
        questaoAlternativa28.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa29 = new QuestaoAlternativa();
        questaoAlternativa29.setId(INICIOQUESTAO.longValue());
        questaoAlternativa29.setAno(ANO);
        questaoAlternativa29.setDescricao("Um algoritmo de compressão toma como entrada uma sequência de bits\n" +
                "(bitstream), e a converte em outro bitstream, representando a entrada comprimida. Analise as assertivas abaixo sobre a técnica de compressão de Huffman:\n" +
                "$\\newline$I. É mais eficiente, para compressão de arquivos texto, do que a técnica de codificação corrida (do inglês RLE – run-length encoding).\n" +
                "$\\newline$II. A técnica exige como entradas um bitstream e um conjunto de códigos livres de prefixo, que associa símbolos a um conjunto de bits.\n" +
                "$\\newline$III. O bitstream comprimido resultante inclui o conjunto de códigos utilizado para realizar a compressão.\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa29.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa29.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa29.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa29.setAlternativaCorreta("e");

        questaoAlternativa29.setAlternativasA("Apenas I.");
        questaoAlternativa29.setAlternativasB("Apenas II.");
        questaoAlternativa29.setAlternativasC("Apenas III.");
        questaoAlternativa29.setAlternativasD("Apenas I e II");
        questaoAlternativa29.setAlternativasE("Apenas I e III.");
        questaoAlternativa29.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa30 = new QuestaoAlternativa();
        questaoAlternativa30.setId(INICIOQUESTAO.longValue());
        questaoAlternativa30.setAno(ANO);
        questaoAlternativa30.setDescricao("Assinale a alternativa que contém uma estrutura de controle que permite que\n" +
                "coleções de instruções, na linguagem de programação C, sejam executadas repetidamente com o controle de execução baseado em uma expressão booleana ao invés de um contador. ");
        questaoAlternativa30.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa30.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa30.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa30.setAlternativaCorreta("c");

        questaoAlternativa30.setAlternativasA("for");
        questaoAlternativa30.setAlternativasB("if");
        questaoAlternativa30.setAlternativasC("while");
        questaoAlternativa30.setAlternativasD("switch");
        questaoAlternativa30.setAlternativasE("else");
        questaoAlternativa30.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa31 = new QuestaoAlternativa();
        questaoAlternativa31.setId(INICIOQUESTAO.longValue());
        questaoAlternativa31.setAno(ANO);
        questaoAlternativa31.setDescricao("Assinale a alternativa correta em relação ao Paradigma Imperativo de Linguagens\n" +
                "de Programação.");
        questaoAlternativa31.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa31.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa31.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa31.setAlternativaCorreta("e");

        questaoAlternativa31.setAlternativasA("Não é baseado na arquitetura de Von Neumann.");
        questaoAlternativa31.setAlternativasB("É paradigma de linguagens não tipadas.");
        questaoAlternativa31.setAlternativasC("É paradigma de linguagens orientadas a objeto.");
        questaoAlternativa31.setAlternativasD("É baseado na arquitetura de Harvard.");
        questaoAlternativa31.setAlternativasE("Descreve uma sequência de passos que mudam o estado de um programa.");
        questaoAlternativa31.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa32 = new QuestaoAlternativa();
        questaoAlternativa32.setId(INICIOQUESTAO.longValue());
        questaoAlternativa32.setAno(ANO);
        questaoAlternativa32.setDescricao("Assinale a alternativa correta sobre as definições básicas de grafos.\n");
        questaoAlternativa32.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa32.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa32.setDisciplina(EDisciplina.GRAFOS);
        questaoAlternativa32.setAlternativaCorreta("e");

        questaoAlternativa32.setAlternativasA("Um hipergrafo é um grafo direcionado em que cada aresta conecta dois vértices apenas. ");
        questaoAlternativa32.setAlternativasB("Um grafo ponderado é um grafo não direcionado no qual todos os pares de vértices são\n" +
                "adjacentes entre si. ");
        questaoAlternativa32.setAlternativasC("Uma floresta é um grafo não direcionado acíclico e conectado. ");
        questaoAlternativa32.setAlternativasD("Uma árvore livre é um grafo não direcionado acíclico, podendo ou não ser conectado.");
        questaoAlternativa32.setAlternativasE("Um grafo direcionado é fortemente conectado se cada dois vértices quaisquer forem alcançáveis a\n" +
                "partir um do outro.");
        questaoAlternativa32.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa33 = new QuestaoAlternativa();
        questaoAlternativa33.setId(INICIOQUESTAO.longValue());
        questaoAlternativa33.setAno(ANO);
        questaoAlternativa33.setDescricao("Quando um programa precisa classificar uma matriz de objetos de dados numéricos de algum tipo, normalmente usa um subprograma (ou função) para o processo de classificação. No ponto em que o processo de classificação é necessário, uma instrução como sort_int(list, list_len) é colocada no programa. Essa chamada é um exemplo de abstração de:");
        questaoAlternativa33.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa33.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa33.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa33.setAlternativaCorreta("e");

        questaoAlternativa33.setAlternativasA("Dados.\n");
        questaoAlternativa33.setAlternativasB("Encapsulamento.");
        questaoAlternativa33.setAlternativasC("Repetição.");
        questaoAlternativa33.setAlternativasD("Condição.\n");
        questaoAlternativa33.setAlternativasE("Processo.");
        questaoAlternativa33.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa34 = new QuestaoAlternativa();
        questaoAlternativa34.setId(INICIOQUESTAO.longValue());
        questaoAlternativa34.setAno(ANO);
        questaoAlternativa34.setDescricao("Quanto aos métodos de alocação de espaço em disco para arquivos, analise as\n" +
                "afirmações abaixo e assinale V, se verdadeiras, ou F, se falsas.\n" +
                "$\\newline$( ) Na alocação contígua, a alocação de espaço em disco para novos arquivos pode ser dificultada pelo problema de fragmentação externa.\n" +
                "$\\newline$( ) A alocação interligada provê acesso eficiente tanto a arquivos de acesso sequencial quanto de acesso direto.\n" +
                "$\\newline$( ) Na alocação indexada, cada arquivo possui um bloco de índice. Para arquivos grandes, são necessários mecanismos que vinculem diferentes blocos de índices, como índices multinível, por exemplo.\n" +
                "$\\newline$A ordem correta de preenchimento dos parênteses, de cima para baixo, é:");
        questaoAlternativa34.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa34.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa34.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa34.setAlternativaCorreta("e");

        questaoAlternativa34.setAlternativasA("V – V – F.");
        questaoAlternativa34.setAlternativasB("F – V – V.");
        questaoAlternativa34.setAlternativasC("V – F – F.");
        questaoAlternativa34.setAlternativasD("F – F – V.");
        questaoAlternativa34.setAlternativasE("V – F – V.");
        questaoAlternativa34.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa35 = new QuestaoAlternativa();
        questaoAlternativa35.setId(INICIOQUESTAO.longValue());
        questaoAlternativa35.setAno(ANO);
        questaoAlternativa35.setDescricao("As árvores B+ são estruturas usadas para indexar campos de pesquisa e tornar\n" +
                "eficiente o acesso a registros armazenados com base nos valores destes campos. Analise as afirmações abaixo sobre árvores B+, assinalando V, se verdadeiras, ou F, se falsas.\n" +
                "$\\newline$( ) Os nodos folha são geralmente ligados entre si para proporcionar acesso ordenado aos registros a partir do campo de pesquisa.\n" +
                "$\\newline$( ) Todos os nodos da árvore possuem valores relativos ao campo indexado, bem como ponteiros para o registro correspondente (ou para o bloco que contém o registro).\n" +
                "$\\newline$( ) Alguns valores do campo indexado que aparecem em nós folhas são repetidos em nós não folha da árvore.\n" +
                "$\\newline$A ordem correta de preenchimento dos parênteses, de cima para baixo, é:");
        questaoAlternativa35.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa35.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa35.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa35.setAlternativaCorreta("e");

        questaoAlternativa35.setAlternativasA("V – F – F.");
        questaoAlternativa35.setAlternativasB("V – V – F.");
        questaoAlternativa35.setAlternativasC("F – V – V.");
        questaoAlternativa35.setAlternativasD("F – F – F.");
        questaoAlternativa35.setAlternativasE("V – F – V.");
        questaoAlternativa35.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa36 = new QuestaoAlternativa();
        questaoAlternativa36.setId(INICIOQUESTAO.longValue());
        questaoAlternativa36.setAno(ANO);
        questaoAlternativa36.setDescricao("As arestas são exploradas a partir do vértice v mais recentemente descoberto que\n" +
                "ainda possui arestas não exploradas saindo dele. Quando todas as arestas adjacentes a v tiverem sido exploradas, a busca anda para trás para explorar vértices que saem do vértice do qual v foi descoberto. O processo continua até que sejam descobertos todos os vértices alcançáveis a partir do vértice original. Qual algoritmo de grafos possui a estratégia descrita acima? ");
        questaoAlternativa36.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa36.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa36.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa36.setAlternativaCorreta("b");

        questaoAlternativa36.setAlternativasA("Ordenação topológica.");
        questaoAlternativa36.setAlternativasB("Busca em profundidade.");
        questaoAlternativa36.setAlternativasC("Componentes fortemente conectados.");
        questaoAlternativa36.setAlternativasD("Árvore geradora mínima.");
        questaoAlternativa36.setAlternativasE("Busca em largura.");
        questaoAlternativa36.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa37 = new QuestaoAlternativa();
        questaoAlternativa37.setId(INICIOQUESTAO.longValue());
        questaoAlternativa37.setAno(ANO);
        questaoAlternativa37.setDescricao("Sobre ordenação topológica em grafos, é correto afirmar que:\n");
        questaoAlternativa37.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa37.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa37.setDisciplina(EDisciplina.GRAFOS);
        questaoAlternativa37.setAlternativaCorreta("c");

        questaoAlternativa37.setAlternativasA("A busca em largura é utilizada para obter a ordenação topológica de um grafo direcionado acíclico.");
        questaoAlternativa37.setAlternativasB("A ordenação topológica de um grafo pode ser vista como uma ordenação de suas arestas ao longo de uma linha horizontal, de tal forma que todos os vértices estão classificados em ordem crescente. ");
        questaoAlternativa37.setAlternativasC("A ordenação topológica de um grafo direcionado acíclico G=(V,A) é uma ordenação linear de todos os seus vértices tal que G contém uma aresta (u, v), então u aparece antes de v. ");
        questaoAlternativa37.setAlternativasD("A busca binária é utilizada para obter a ordenação topológica de um grafo cíclico não direcionado.\n");
        questaoAlternativa37.setAlternativasE("O algoritmo para obter a ordenação topológica de um grafo direcionado usa o transposto do grafo\n" +
                "que consiste de todas as arestas com as suas direções invertidas.");
        questaoAlternativa37.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa38 = new QuestaoAlternativa();
        questaoAlternativa38.setId(INICIOQUESTAO.longValue());
        questaoAlternativa38.setAno(ANO);
        questaoAlternativa38.setDescricao("Sobre tipos de dados, é correto afirmar que: ");
        questaoAlternativa38.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa38.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa38.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa38.setAlternativaCorreta("d");

        questaoAlternativa38.setAlternativasA("Tipos booleanos são valores que são mantidos fixos pelo compilador.");
        questaoAlternativa38.setAlternativasB("O double é um tipo inteiro duplo com menor precisão do que o tipo inteiro. ");
        questaoAlternativa38.setAlternativasC("A faixa de valores dos tipos inteiros tem somente dois elementos: um para verdadeiro e outro para falso.");
        questaoAlternativa38.setAlternativasD("Uma conversão de tipos implícita consiste em uma modificação do tipo de dados executado, automaticamente, pelo compilador.\n");
        questaoAlternativa38.setAlternativasE("Vetores, matrizes e ponteiros são exemplos de tipos de dados primitivos (básicos). ");
        questaoAlternativa38.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa39 = new QuestaoAlternativa();
        questaoAlternativa39.setId(INICIOQUESTAO.longValue());
        questaoAlternativa39.setAno(ANO);
        questaoAlternativa39.setDescricao("Considere os seguintes formalismos:\n" +
                "$\\newline$I. Autômatos finitos.\n" +
                "$\\newline$II. Autômatos finitos com uma pilha.\n" +
                "$\\newline$III. Autômatos finitos com duas pilhas.\n" +
                "$\\newline$Quais contêm SOMENTE os formalismos nos quais a variante não determinística reconhece o mesmo\n" +
                "conjunto de linguagens que a respectiva versão determinística?");
        questaoAlternativa39.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa39.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa39.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa39.setAlternativaCorreta("c");

        questaoAlternativa39.setAlternativasA("Apenas I.");
        questaoAlternativa39.setAlternativasB("Apenas II.");
        questaoAlternativa39.setAlternativasC("Apenas I e III.");
        questaoAlternativa39.setAlternativasD("Apenas II e III.");
        questaoAlternativa39.setAlternativasE("I, II e III.");
        questaoAlternativa39.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa40 = new QuestaoAlternativa();
        questaoAlternativa40.setId(INICIOQUESTAO.longValue());
        questaoAlternativa40.setAno(ANO);
        questaoAlternativa40.setDescricao("Considere a gramática G descrita a seguir: conjunto de terminais {a,c}, conjunto de não terminais {S,A}, símbolo inicial S e contendo as produções abaixo:\n" +
                "$\\newline$S -> AcS\n" +
                "$\\newline$S -> A\n" +
                "$\\newline$A -> aAa\n" +
                "$\\newline$A -> a\n" +
                "$\\newline$Considere também o autômato finito A sobre o alfabeto {a,c}, com conjunto de estados {q0,q1,q2} — dos quais q0 é inicial e q1 é final — e com função de transição de estados determinada pelo seguinte grafo abaixo.<IMAGEM = 40>\n" +
                "$\\newline$Seja L(G) a linguagem gerada pela gramática G e L(A) a linguagem reconhecida pelo autômato A, assinale a alternativa correta.");
        questaoAlternativa40.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa40.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa40.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa40.setAlternativaCorreta("d");
        questaoAlternativa40.setImagem(true);
        questaoAlternativa40.setAlternativasA("L(G) é regular e L(A) é subconjunto próprio de L(G).");
        questaoAlternativa40.setAlternativasB("L(G) não é regular e L(A) é subconjunto próprio de L(G).");
        questaoAlternativa40.setAlternativasC("L(A) = L(G).");
        questaoAlternativa40.setAlternativasD("L(G) é regular e L(G) é subconjunto próprio de L(A).");
        questaoAlternativa40.setAlternativasE("L(G) não é regular e L(G) é subconjunto próprio de L(A).");
        questaoAlternativa40.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa40.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa41 = new QuestaoAlternativa();
        questaoAlternativa41.setId(INICIOQUESTAO.longValue());
        questaoAlternativa41.setAno(ANO);
        questaoAlternativa41.setDescricao("Abaixo são apresentadas duas linguagens formais sobre o alfabeto {a,b,c}:\n" +
                "$\\newline$L1 = $\\left\\{a^{n}b^{n} | n > 1\\right\\}$\n" +
                "$\\newline$L2 = $\\left\\{b^{n}a^{p}c^{q} | n \\geq 0,p\\geq0,q\\geq0\\right\\}$\n" +
                "$\\newline$Considere as seguintes afirmações:\n" +
                "$\\newline$I. L1 é uma linguagem regular.\n" +
                "$\\newline$II. L2 é uma linguagem regular.\n" +
                "$\\newline$III. L2 é uma linguagem livre de contexto.\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa41.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa41.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa41.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa41.setAlternativaCorreta("d");

        questaoAlternativa41.setAlternativasA("Apenas I.\n");
        questaoAlternativa41.setAlternativasB("Apenas II.");
        questaoAlternativa41.setAlternativasC("Apenas I e III.");
        questaoAlternativa41.setAlternativasD("Apenas II e III.");
        questaoAlternativa41.setAlternativasE("I, II e III.");
        questaoAlternativa41.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa42 = new QuestaoAlternativa();
        questaoAlternativa42.setId(INICIOQUESTAO.longValue());
        questaoAlternativa42.setAno(ANO);
        questaoAlternativa42.setDescricao("Um bit de paridade par ou ímpar pode ser adicionado a uma palavra de N bits para indicar se o número de bits que valem 1 na palavra é par ou ímpar. Sobre paridade e bit de paridade, analise as assertivas abaixo:\n" +
                "$\\newline$I. Usa-se normalmente as portas lógicas OR ou NOR para calcular e gerar o bit de paridade.\n" +
                "$\\newline$II. O bit de paridade par da palavra de 8 bits 00011100 é 1.\n" +
                "$\\newline$III. A palavra de 8 bits 10100011 é enviada por um canal de comunicação de dados com bit de paridade par 0. Se um dos bits da palavra inverter durante a transmissão devido a ruído, a nova paridade calculada desta palavra na chegada da transmissão será 1, e, com isso, detecta-se um erro.\n" +
                "$\\newline$IV. Um bit de paridade em uma palavra de N bits é capaz de detectar até dois bits errados.\n" +
                "$\\newline$V. Para calcular a paridade de uma palavra de 4 bits, serão necessárias 3 portas XOR ou 3 portas XNOR.\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa42.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa42.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa42.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
        questaoAlternativa42.setAlternativaCorreta("d");

        questaoAlternativa42.setAlternativasA("Apenas I e III.\n");
        questaoAlternativa42.setAlternativasB("Apenas II e IV.");
        questaoAlternativa42.setAlternativasC("Apenas II e V. ");
        questaoAlternativa42.setAlternativasD("Apenas II, III e V.");
        questaoAlternativa42.setAlternativasE("I, II, III, IV e V. ");
        questaoAlternativa42.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa43 = new QuestaoAlternativa();
        questaoAlternativa43.setId(INICIOQUESTAO.longValue());
        questaoAlternativa43.setAno(ANO);
        questaoAlternativa43.setDescricao("Com base na figura abaixo, analise as assertivas que seguem:" +
                "$\\newline$I. A saída da função F está no valor lógico 1 quando as entradas a, b, c estão respectivamente, nos valores lógicos 0,1,0 ou 0,0,1.\n" +
                "$\\newline$II. Basta a entrada estar no valor lógico 0 para que a saída da função F atinja o valor lógico 0 também.\n" +
                "$\\newline$III. A função booleana da função F pode ser representada por: F = $\\overline{b.c+a}$\n" +
                "$\\newline$IV. Se os transistores NMOS controlados pelas entradas b e c estão conduzindo, então a saída da função F está no valor lógico 0.\n" +
                "$\\newline$V. Usando o teorema De Morgan, podemos afirmar que a função booleana F é equivalente a: F = F = $\\overline{a}.\\overline{b}+\\overline{a}.\\overline{c}$\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa43.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa43.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa43.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa43.setAlternativaCorreta("e");
        questaoAlternativa43.setImagem(true);
        questaoAlternativa43.setAlternativasA("Apenas II e III.");
        questaoAlternativa43.setAlternativasB("Apenas II e IV.");
        questaoAlternativa43.setAlternativasC("Apenas I, III e IV.");
        questaoAlternativa43.setAlternativasD("Apenas I, III e V. ");
        questaoAlternativa43.setAlternativasE("Apenas I, III, IV e V.");
        questaoAlternativa43.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa43.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa44 = new QuestaoAlternativa();
        questaoAlternativa44.setId(INICIOQUESTAO.longValue());
        questaoAlternativa44.setAno(ANO);
        questaoAlternativa44.setDescricao("Considere um computador no qual o interpretador do nível 0 (hardware\n" +
                "interpretando o microcódigo) gasta 20 nanosegundos (20x10-9 segundos) por microinstrução, e o interpretador do nível 1 (microcódigo interpretando a linguagem de máquina convencional) necessita de 25 microinstruções para interpretar uma instrução de máquina convencional. Um programa teste, já em linguagem de máquina convencional, leva 50 segundos para executar.\n" +
                "$\\newline$a) Quanto tempo levará o programa teste para executar se o tempo para executar uma microinstrução for aumentado para 30 nanosegundos?\n" +
                "$\\newline$b) Quanto tempo levará o programa teste para executar se uma instrução de máquina convencional necessitar de somente 15 microinstruções para ser interpretada?");
        questaoAlternativa44.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa44.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa44.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa44.setAlternativaCorreta("d");

        questaoAlternativa44.setAlternativasA("a) T = 60 segundos e b) 15 segundos.");
        questaoAlternativa44.setAlternativasB("a) T = 65 segundos e b) 20 segundos.");
        questaoAlternativa44.setAlternativasC("a) T = 70 segundos e b) 25 segundos.");
        questaoAlternativa44.setAlternativasD("a) T = 75 segundos e b) 30 segundos.");
        questaoAlternativa44.setAlternativasE("a) T = 80 segundos e b) 35 segundos.");
        questaoAlternativa44.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa45 = new QuestaoAlternativa();
        questaoAlternativa45.setId(INICIOQUESTAO.longValue());
        questaoAlternativa45.setAno(ANO);
        questaoAlternativa45.setDescricao("Um impasse (deadlock) pode ser definido como a condição em que todo processo, em um conjunto de processos, aguarda por um evento que somente outro processo desse conjunto poderá fazer acontecer. De acordo com Coffman et al. (1971), as condições para que ocorra um impasse (de recurso) são encadeamento circular de dois ou mais processos, exclusão mútua, posse e espera de recursos,");
        questaoAlternativa45.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa45.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa45.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa45.setAlternativaCorreta("b");

        questaoAlternativa45.setAlternativasA("Não preempção de recursos; ao menos três destas condições presentes ao mesmo tempo.");
        questaoAlternativa45.setAlternativasB("Não preempção de recursos; todas estas condições presentes ao mesmo tempo.\n");
        questaoAlternativa45.setAlternativasC("Preempção de recursos; ao menos três destas condições presentes ao mesmo tempo.");
        questaoAlternativa45.setAlternativasD("Preempção de recursos; todas estas condições presentes ao mesmo tempo.");
        questaoAlternativa45.setAlternativasE("Combinação de preempção e não preempção de recursos; todas estas condições presentes ao\n" +
                "mesmo tempo.");
        questaoAlternativa45.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa46 = new QuestaoAlternativa();
        questaoAlternativa46.setId(INICIOQUESTAO.longValue());
        questaoAlternativa46.setAno(ANO);
        questaoAlternativa46.setDescricao("No sistema operacional, existem três métodos fundamentais de realizar entrada e saída (E/S). O método mais simples é chamado de E/S _________, em que se tem a CPU realizando todo o trabalho. Na E/S _________, a CPU não fica tão dedicada à rotina de E/S como no método anterior, podendo realizar outras atividades enquanto a operação de E/S está em andamento. Já a E/S _________ tem o menor consumo de CPU dentre os três métodos, porém, em geral, tem o menor desempenho.\n" +
                "Assinale a alternativa que preenche, correta e respectivamente, as lacunas do trecho acima.");
        questaoAlternativa46.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa46.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa46.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa46.setAlternativaCorreta("b");

        questaoAlternativa46.setAlternativasA("usando interrupção – programada – usando DMA");
        questaoAlternativa46.setAlternativasB("programada – usando interrupção – usando DMA");
        questaoAlternativa46.setAlternativasC("usando interrupção – usando DMA – programada\n");
        questaoAlternativa46.setAlternativasD("usando DMA – programada – usando interrupção");
        questaoAlternativa46.setAlternativasE("programada – usando DMA – usando interrupção");
        questaoAlternativa46.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa47 = new QuestaoAlternativa();
        questaoAlternativa47.setId(INICIOQUESTAO.longValue());
        questaoAlternativa47.setAno(ANO);
        questaoAlternativa47.setDescricao("Sobre a Máquina de Estados Finita com 5 estados (P,C,F,W,M) síncrona ao pulso de subida do relógio, representada a seguir, analise as assertivas abaixo." +
                "$\\newline$I. A máquina representada nesta questão é do tipo Moore, pois os valores das saídas x e y só dependem do estado em que a máquina se encontra.\n" +
                "$\\newline$II. Para a saída y atingir o valor 1 lógico após o reset da máquina, é necessário, pelo menos, 2 pulsos de subida do relógio.\n" +
                "$\\newline$III. Após o reset da máquina, se o valor de entrada ficar em 0 por 3 subidas do relógio consecutivas, a máquina atingirá o estado W.\n" +
                "$\\newline$IV. Quando a máquina se encontra no estado F, o próximo estado da máquina, ao vir a subida do relógio, é C se a=1 ou M se a = 0.\n" +
                "$\\newline$V. As saídas x e y só valem zero durante o reset da máquina.\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa47.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa47.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa47.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa47.setAlternativaCorreta("c");
        questaoAlternativa47.setImagem(true);
        questaoAlternativa47.setAlternativasA("Apenas I e III.\n");
        questaoAlternativa47.setAlternativasB("Apenas I e V.");
        questaoAlternativa47.setAlternativasC("Apenas II e III.");
        questaoAlternativa47.setAlternativasD("Apenas II, III e IV.");
        questaoAlternativa47.setAlternativasE("Apenas II, III e V. ");
        questaoAlternativa47.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa47.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa48 = new QuestaoAlternativa();
        questaoAlternativa48.setId(INICIOQUESTAO.longValue());
        questaoAlternativa48.setAno(ANO);
        questaoAlternativa48.setDescricao("Um computador tem uma cache de dois níveis. Suponha que 80% das referências à informação sejam atendidas pela cache de primeiro nível, 15% pela cache de segundo nível e 5% pela memória principal. Os tempos de acesso são 5 ns, 15 ns e 60 ns, respectivamente. Qual é o tempo médio de acesso do sistema?");
        questaoAlternativa48.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa48.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa48.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa48.setAlternativaCorreta("b");

        questaoAlternativa48.setAlternativasA("09 ns.");
        questaoAlternativa48.setAlternativasB("11 ns.");
        questaoAlternativa48.setAlternativasC("15 ns.");
        questaoAlternativa48.setAlternativasD("21 ns.");
        questaoAlternativa48.setAlternativasE("25 ns.");
        questaoAlternativa48.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa49 = new QuestaoAlternativa();
        questaoAlternativa49.setId(INICIOQUESTAO.longValue());
        questaoAlternativa49.setAno(ANO);
        questaoAlternativa49.setDescricao("Dado um disco com rotação de 2.400 RPM, com 120 cilindros e 6 trilhas por\n" +
                "cilindro, cada trilha possui 16 setores e cada setor tem 512 bytes. Considerando que o tempo médio de seek é de 60 ms, o tempo de seek entre cilindros adjacente s é de 10 ms e o tempo de transferência é de 15 ms, quanto tempo será necessário para ler 10 setores?");
        questaoAlternativa49.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa49.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa49.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa49.setAlternativaCorreta("c");

        questaoAlternativa49.setAlternativasA("0,0485 segundos.");
        questaoAlternativa49.setAlternativasB("0,0685 segundos");
        questaoAlternativa49.setAlternativasC("0,0885 segundos.");
        questaoAlternativa49.setAlternativasD("0,1285 segundos.");
        questaoAlternativa49.setAlternativasE("0,1485 segundos.");
        questaoAlternativa49.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa50 = new QuestaoAlternativa();
        questaoAlternativa50.setId(INICIOQUESTAO.longValue());
        questaoAlternativa50.setAno(ANO);
        questaoAlternativa50.setDescricao("Qual o número total de processos criados com a execução do programa a seguir?\n" +
                "Considere que todas as operações executadas serão realizadas com sucesso.");
        questaoAlternativa50.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa50.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa50.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa50.setAlternativaCorreta("e");
        questaoAlternativa50.setImagem(true);
        questaoAlternativa50.setAlternativasA("Sete.");
        questaoAlternativa50.setAlternativasB("Oito.");
        questaoAlternativa50.setAlternativasC("Trinta e dois.");
        questaoAlternativa50.setAlternativasD("Trinta e três.\n");
        questaoAlternativa50.setAlternativasE("Sessenta e quatro.");
        questaoAlternativa50.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa50.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa51 = new QuestaoAlternativa();
        questaoAlternativa51.setId(INICIOQUESTAO.longValue());
        questaoAlternativa51.setAno(ANO);
        questaoAlternativa51.setDescricao("Quando um predicado da cláusula WHERE de uma consulta SQL aninhada referencia algum atributo de uma relação presente na consulta externa, tais consultas são ditas correlacionadas (ou correlatas). Seja Q uma consulta definida por SELECT DISTINCT SALARIO FROM EMPRESA WHERE SALARIO > ALL (SELECT Salario FROM EMPRESA) OR SALARIO < ANY (SELECT Salario FROM EMPRESA).\n" +
                "A expressão SQL que utiliza consultas correlacionadas e cujo resultado é o mesmo resultado de Q é:");
        questaoAlternativa51.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa51.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa51.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa51.setAlternativaCorreta("d");

        questaoAlternativa51.setAlternativasA("SELECT DISTINCT Salario FROM EMPRESA AS E WHERE EXISTS (SELECT * FROM EMPRESA AS I WHERE I.Salario = E.Salario)\n");
        questaoAlternativa51.setAlternativasB("SELECT DISTINCT Salario FROM EMPRESA AS E WHERE EXISTS (SELECT * FROM EMPRESA AS I WHERE I.Salario >= E.Salario)\n");
        questaoAlternativa51.setAlternativasC("SELECT DISTINCT Salario FROM EMPRESA AS E WHERE EXISTS (SELECT * FROM EMPRESA AS I\n" +
                "WHERE I.Salario <= E.Salario)");
        questaoAlternativa51.setAlternativasD("SELECT DISTINCT Salario FROM EMPRESA AS E WHERE EXISTS (SELECT * FROM EMPRESA AS I\n" +
                "WHERE I.Salario > E.Salario)");
        questaoAlternativa51.setAlternativasE("SELECT DISTINCT Salario FROM EMPRESA AS E WHERE EXISTS (SELECT * FROM EMPRESA AS I\n" +
                "WHERE I.Salario < E.Salario)\n");
        questaoAlternativa51.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa52 = new QuestaoAlternativa();
        questaoAlternativa52.setId(INICIOQUESTAO.longValue());
        questaoAlternativa52.setAno(ANO);
        questaoAlternativa52.setDescricao("Com respeito à abordagem de cópia distinguida para o controle de concorrência de banco de dados distribuídos, analise as afirmações abaixo e assinale V, se verdadeiras, ou F, se falsas.\n" +
                "$\\newline$( ) Uma cópia particular de cada item de dados é eleita como cópia distinguida, para que quaisquer solicitações de bloqueio e desbloqueio sejam desviadas do site que contém tal cópia.\n" +
                "$\\newline$( ) Na técnica de site primário, quando uma transação obtém um read_lock, todas as cópias do item de dados devem ser atualizadas antes de liberar o bloqueio.\n" +
                "$\\newline$( ) A técnica de cópia primária tenta distribuir a carga de coordenação de bloqueio entre vários sites.\n" +
                "$\\newline$( ) O uso de site de backup para a técnica de site primário ameniza o problema de sobrecarga do site primário, o que minimiza gargalos no sistema.\n" +
                "$\\newline$( ) A técnica de cópia primária em geral possui menor confiabilidade e menor disponibilidade do que a técnica de site primário.\n" +
                "$\\newline$A ordem correta de preenchimento dos parênteses, de cima para baixo, é:");
        questaoAlternativa52.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa52.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa52.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa52.setAlternativaCorreta("c");

        questaoAlternativa52.setAlternativasA("V – F – F – V – V.");
        questaoAlternativa52.setAlternativasB("F – V – F – F – F.");
        questaoAlternativa52.setAlternativasC("F – F – V – F – F.");
        questaoAlternativa52.setAlternativasD("V – F – F – V – F.");
        questaoAlternativa52.setAlternativasE("F – V – V – F – V.");
        questaoAlternativa52.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa53 = new QuestaoAlternativa();
        questaoAlternativa53.setId(INICIOQUESTAO.longValue());
        questaoAlternativa53.setAno(ANO);
        questaoAlternativa53.setDescricao("Em relação à gestão de riscos no gerenciamento de projetos de software, analise as afirmações abaixo, assinalando V, se verdadeiras, ou F, se falsas.\n" +
                "$\\newline$( ) Para identificar os riscos mais significativos em um projeto, a análise de riscos deve associar a cada risco uma medida representando sua probabilidade de ocorrência, e uma avaliação de seu impacto.\n" +
                "$\\newline$( ) Existem diferentes estratégias para gerenciar riscos identificados. Um plano de contingência visa reduzir a probabilidade de ocorrência de um risco, e minimizar o seu impacto.\n" +
                "$\\newline$( ) A gerência de riscos é um processo contínuo, pois, à medida que o projeto avança, os riscos gerenciados e as respectivas estratégias de gerência associadas podem se alterar.\n" +
                "$\\newline$A ordem correta de preenchimento dos parênteses, de cima para baixo, é:");
        questaoAlternativa53.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa53.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa53.setDisciplina(EDisciplina.GERENCIA_DE_PROJETOS);
        questaoAlternativa53.setAlternativaCorreta("a");

        questaoAlternativa53.setAlternativasA("V – F – V.");
        questaoAlternativa53.setAlternativasB("V – F – F.");
        questaoAlternativa53.setAlternativasC("F – V – F. ");
        questaoAlternativa53.setAlternativasD("F – F – V.");
        questaoAlternativa53.setAlternativasE("V – V – V.");
        questaoAlternativa53.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa54 = new QuestaoAlternativa();
        questaoAlternativa54.setId(INICIOQUESTAO.longValue());
        questaoAlternativa54.setAno(ANO);
        questaoAlternativa54.setDescricao("Em Rede de Computadores, qual o nome do processo que permite fazer\n" +
                "tunelamento?\n");
        questaoAlternativa54.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa54.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa54.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa54.setAlternativaCorreta("a");

        questaoAlternativa54.setAlternativasA("Encapsulamento.\n");
        questaoAlternativa54.setAlternativasB("Reescrita.");
        questaoAlternativa54.setAlternativasC("Processamento.");
        questaoAlternativa54.setAlternativasD("VPN.");
        questaoAlternativa54.setAlternativasE("IPv6.");
        questaoAlternativa54.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa55 = new QuestaoAlternativa();
        questaoAlternativa55.setId(INICIOQUESTAO.longValue());
        questaoAlternativa55.setAno(ANO);
        questaoAlternativa55.setDescricao("A paginação de sobra (shadow paging) é uma técnica útil na recuperação após\n" +
                "falhas em sistemas de bancos de dados. Sobre essa técnica, assinale a alternativa INCORRETA.\n");
        questaoAlternativa55.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa55.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa55.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa55.setAlternativaCorreta("a");

        questaoAlternativa55.setAlternativasA("O uso de logs e checkpoints são dispensáveis no contexto multiusuário com transações\n" +
                "concorrentes.");
        questaoAlternativa55.setAlternativasB("Quando uma página é atualizada, essa página muda de local no disco, se não ocorrer falha na\n" +
                "execução da transação.");
        questaoAlternativa55.setAlternativasC("No início de uma transação, o diretório cujas entradas apontam para as páginas de dados mais\n" +
                "recentes no disco (diretório atual) é copiado para um diretório de sombra.");
        questaoAlternativa55.setAlternativasD("Durante a execução da transação, o diretório de sombra não é modificado.");
        questaoAlternativa55.setAlternativasE("Na ocorrência de falha, o estado de banco de dados antes da execução da transação está\n" +
                "disponível por meio do diretório de sombra.\n");
        questaoAlternativa55.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa56 = new QuestaoAlternativa();
        questaoAlternativa56.setId(INICIOQUESTAO.longValue());
        questaoAlternativa56.setAno(ANO);
        questaoAlternativa56.setDescricao("Analise as seguintes assertivas sobre a notação UML 2.0:\n" +
                "$\\newline$I. Um diagrama de classes ressalta relações estruturais entre elementos classificadores, tipicamente classes e interfaces.\n" +
                "$\\newline$II. Diagramas de comunicação permitem modelar a troca de mensagens entre objetos, enfatizando as relações estruturais entre objetos/classes.\n" +
                "$\\newline$III. Um diagrama de componentes tem por objetivo mostrar a estrutura de um sistema em termos dos componentes de software que devem estar instalados em unidades de processamento (e.g. servidores) para o correto funcionamento do software.\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa56.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa56.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa56.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa56.setAlternativaCorreta("d");

        questaoAlternativa56.setAlternativasA("Apenas I.");
        questaoAlternativa56.setAlternativasB("Apenas II.");
        questaoAlternativa56.setAlternativasC("Apenas III.");
        questaoAlternativa56.setAlternativasD("Apenas I e II.");
        questaoAlternativa56.setAlternativasE("Apenas II e III.");
        questaoAlternativa56.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa57 = new QuestaoAlternativa();
        questaoAlternativa57.setId(INICIOQUESTAO.longValue());
        questaoAlternativa57.setAno(ANO);
        questaoAlternativa57.setDescricao("As etapas abaixo fazem parte do processo (pipeline) de visualização tridimensional:\n" +
                "$\\newline$1. Transformação de normalização e recorte.\n" +
                "$\\newline$2. Transformação de visualização (câmera).\n" +
                "$\\newline$3. Transformação de modelagem.\n" +
                "$\\newline$4. Transformação de janela de visão (viewport).\n" +
                "$\\newline$5. Transformação de projeção.\n" +
                "$\\newline$A ordem correta em que essas etapas são realizadas no processo é:");
        questaoAlternativa57.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa57.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa57.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa57.setAlternativaCorreta("a");

        questaoAlternativa57.setAlternativasA("3 – 2 – 5 – 1 – 4. ");
        questaoAlternativa57.setAlternativasB("3 – 5 – 2 – 1 – 4. ");
        questaoAlternativa57.setAlternativasC("2 – 1 – 4 – 5 – 3. ");
        questaoAlternativa57.setAlternativasD("2 – 3 – 4 – 1 – 5. ");
        questaoAlternativa57.setAlternativasE("1 – 3 – 2 – 4 – 5. ");
        questaoAlternativa57.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa58 = new QuestaoAlternativa();
        questaoAlternativa58.setId(INICIOQUESTAO.longValue());
        questaoAlternativa58.setAno(ANO);
        questaoAlternativa58.setDescricao("A técnica de mapeamento de textura baseada na aplicação de uma função de\n" +
                "perturbação no vetor normal da superfície, de forma que a iluminação desta seja afetada, é denominada:");
        questaoAlternativa58.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa58.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa58.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa58.setAlternativaCorreta("c");

        questaoAlternativa58.setAlternativasA("Textura procedural.");
        questaoAlternativa58.setAlternativasB("Textura sólida.\n");
        questaoAlternativa58.setAlternativasC("Bump mapping.\n");
        questaoAlternativa58.setAlternativasD("Frame mapping.");
        questaoAlternativa58.setAlternativasE("Environment mapping.");
        questaoAlternativa58.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa59 = new QuestaoAlternativa();
        questaoAlternativa59.setId(INICIOQUESTAO.longValue());
        questaoAlternativa59.setAno(ANO);
        questaoAlternativa59.setDescricao("A equalização de histograma de cores em uma imagem digital tem como objetivo:");
        questaoAlternativa59.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa59.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa59.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa59.setAlternativaCorreta("b");

        questaoAlternativa59.setAlternativasA("Destacar um determinado canal.");
        questaoAlternativa59.setAlternativasB("Realçar diferenças de tonalidade.");
        questaoAlternativa59.setAlternativasC("Delimitar bordas.");
        questaoAlternativa59.setAlternativasD("Eliminar informações estranhas.");
        questaoAlternativa59.setAlternativasE("Converter para um novo modelo de cores.");
        questaoAlternativa59.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa60 = new QuestaoAlternativa();
        questaoAlternativa60.setId(INICIOQUESTAO.longValue());
        questaoAlternativa60.setAno(ANO);
        questaoAlternativa60.setDescricao("No modelo de referência ISO/OSI, qual camada torna possível a comunicação entre computadores com diferentes representações de dados?");
        questaoAlternativa60.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa60.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa60.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa60.setAlternativaCorreta("b");

        questaoAlternativa60.setAlternativasA("Sessão.");
        questaoAlternativa60.setAlternativasB("Apresentação.");
        questaoAlternativa60.setAlternativasC("Aplicação.");
        questaoAlternativa60.setAlternativasD("Transporte.");
        questaoAlternativa60.setAlternativasE("Representação.");
        questaoAlternativa60.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa61 = new QuestaoAlternativa();
        questaoAlternativa61.setId(INICIOQUESTAO.longValue());
        questaoAlternativa61.setAno(ANO);
        questaoAlternativa61.setDescricao("A quantização de imagens pode ser entendida como um processo de:");
        questaoAlternativa61.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa61.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa61.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa61.setAlternativaCorreta("a");

        questaoAlternativa61.setAlternativasA("Conversão de cada amostra em uma observação discreta.");
        questaoAlternativa61.setAlternativasB("Equalização da distribuição de cores.");
        questaoAlternativa61.setAlternativasC("Correção da iluminação.");
        questaoAlternativa61.setAlternativasD("Discretização dos valores de brilho.");
        questaoAlternativa61.setAlternativasE("Mapeamento dos canais da imagem.");
        questaoAlternativa61.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa62 = new QuestaoAlternativa();
        questaoAlternativa62.setId(INICIOQUESTAO.longValue());
        questaoAlternativa62.setAno(ANO);
        questaoAlternativa62.setDescricao("Relacione a Coluna 1 à Coluna 2, associando os diferentes tipos de falha com as\n" +
                "suas descrições.\n" +
                "$\\newline$Coluna 1\n" +
                "$\\newline$1. Por queda.\n" +
                "$\\newline$2. Por omissão.\n" +
                "$\\newline$3. De transição de estado.\n" +
                "$\\newline$4. Arbitrária.\n" +
                "$\\newline$Coluna 2\n" +
                "$\\newline$( ) O servidor não consegue responder a requisições que chegam.\n" +
                "$\\newline$( ) O servidor se desvia do fluxo de controle correto.\n" +
                "$\\newline$( ) O servidor produz saídas que nunca deveriam ter produzido, mas não podem ser detectadas como incorretas.\n" +
                "$\\newline$( ) O servidor para de funcionar, mas estava funcionando corretamente até parar.\n" +
                "$\\newline$A ordem correta de preenchimento dos parênteses, de cima para baixo, é:");
        questaoAlternativa62.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa62.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa62.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa62.setAlternativaCorreta("d");

        questaoAlternativa62.setAlternativasA("1 – 2 – 3 – 4.");
        questaoAlternativa62.setAlternativasB("4 – 1 – 2 – 3.\n");
        questaoAlternativa62.setAlternativasC("3 – 4 – 1 – 2.");
        questaoAlternativa62.setAlternativasD("2 – 3 – 4 – 1.");
        questaoAlternativa62.setAlternativasE("4 – 2 – 1 – 3.");
        questaoAlternativa62.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa63 = new QuestaoAlternativa();
        questaoAlternativa63.setId(INICIOQUESTAO.longValue());
        questaoAlternativa63.setAno(ANO);
        questaoAlternativa63.setDescricao("Anulada");
        questaoAlternativa63.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa63.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa63.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa63.setAlternativaCorreta("*");

        questaoAlternativa63.setAlternativasA("Anulada");
        questaoAlternativa63.setAlternativasB("Anulada");
        questaoAlternativa63.setAlternativasC("Anulada");
        questaoAlternativa63.setAlternativasD("Anulada");
        questaoAlternativa63.setAlternativasE("Anulada");
        questaoAlternativa63.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa64 = new QuestaoAlternativa();
        questaoAlternativa64.setId(INICIOQUESTAO.longValue());
        questaoAlternativa64.setAno(ANO);
        questaoAlternativa64.setDescricao("Quando um processo na máquina A chama um procedimento na máquina B, o\n" +
                "processo chamador em A é suspenso, e a execução do procedimento chamado ocorre em B. Informações podem ser transportadas do chamador para quem foi chamado nos parâmetros e podem voltar no resultado do procedimento. Absolutamente nada da troca de mensagens é visível para o programador. Esse método é conhecido como:");
        questaoAlternativa64.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa64.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa64.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa64.setAlternativaCorreta("a");

        questaoAlternativa64.setAlternativasA("Chamada de Procedimento Remoto (RPC). ");
        questaoAlternativa64.setAlternativasB("Protocolo Universal de Datagramas (UDP).");
        questaoAlternativa64.setAlternativasC("Protocolo de Transporte em Tempo Real (RTP).");
        questaoAlternativa64.setAlternativasD("Middleware Orientado a Mensagem (MOM).");
        questaoAlternativa64.setAlternativasE("Linguagem de Programação de Interface (IDL).");
        questaoAlternativa64.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa65 = new QuestaoAlternativa();
        questaoAlternativa65.setId(INICIOQUESTAO.longValue());
        questaoAlternativa65.setAno(ANO);
        questaoAlternativa65.setDescricao("Qual protocolo que converte nome em string ASCII em endereço de rede?");
        questaoAlternativa65.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa65.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa65.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa65.setAlternativaCorreta("b");

        questaoAlternativa65.setAlternativasA("Stringle.");
        questaoAlternativa65.setAlternativasB("DNS.");
        questaoAlternativa65.setAlternativasC("ARP.");
        questaoAlternativa65.setAlternativasD("IP.");
        questaoAlternativa65.setAlternativasE("TCP.");
        questaoAlternativa65.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa66 = new QuestaoAlternativa();
        questaoAlternativa66.setId(INICIOQUESTAO.longValue());
        questaoAlternativa66.setAno(ANO);
        questaoAlternativa66.setDescricao("O aprendizado de máquina, é um campo de estudo que:");
        questaoAlternativa66.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa66.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa66.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa66.setAlternativaCorreta("e");

        questaoAlternativa66.setAlternativasA("Oferece aos computadores a habilidade de aprender exatamente a função para a qual foram programados.");
        questaoAlternativa66.setAlternativasB("Dá aos computadores a habilidade de aprender qualquer problema.");
        questaoAlternativa66.setAlternativasC("Dá aos computadores a habilidade de aprender como um agente deve agir em um ambiente.\n");
        questaoAlternativa66.setAlternativasD("Dá aos computadores a habilidade de aprender como reduzir erros.\n");
        questaoAlternativa66.setAlternativasE("Dá aos computadores a habilidade de aprender sem serem explicitamente programados para a\n" +
                "tarefa.");
        questaoAlternativa66.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa67 = new QuestaoAlternativa();
        questaoAlternativa67.setId(INICIOQUESTAO.longValue());
        questaoAlternativa67.setAno(ANO);
        questaoAlternativa67.setDescricao("Qual é a classe de algoritmos de sincronização que assegura que, em um conjunto de processos distribuídos, pelo menos, um processo por vez tem acesso a um recurso compartilhado?");
        questaoAlternativa67.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa67.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa67.setDisciplina(EDisciplina.SISTEMAS_DISTRIBUIDOS);
        questaoAlternativa67.setAlternativaCorreta("c");

        questaoAlternativa67.setAlternativasA("Relógios vetoriais.\n");
        questaoAlternativa67.setAlternativasB("Eleição.");
        questaoAlternativa67.setAlternativasC("Exclusão mútua distribuída.");
        questaoAlternativa67.setAlternativasD("Relógios lógicos.");
        questaoAlternativa67.setAlternativasE("Posicionamento global.");
        questaoAlternativa67.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa68 = new QuestaoAlternativa();
        questaoAlternativa68.setId(INICIOQUESTAO.longValue());
        questaoAlternativa68.setAno(ANO);
        questaoAlternativa68.setDescricao("A fase de análise sintática de um compilador pode ser implementada através de reconhecedores (parsers) de gramáticas livres de contexto, com estratégias ascendentes (bottomup) ou descendentes (top-down). Considere a gramática com cinco produções abaixo, sendo que são não terminais os símbolos S e A, sendo o primeiro o símbolo não terminal inicial da gramática, e, os demais, símbolos terminais. Analise as seguintes assertivas:\n" +
                "$\\newline$I. A gramática é reconhecida por um analisador preditivo LL(1), pois as características da\n" +
                "gramática não inibem a construção da tabela de reconhecimento.\n" +
                "$\\newline$II. Esta gramática não é reconhecida por um analisador LR(0), pois existe um conflito do tipo empilha-reduz no estado que contém os seguintes itens LR(0) “S -> bd . a”, e “A → d”.\n" +
                "$\\newline$III. A gramática é reconhecida por uma analisador SLR(1), pois ele resolve o conflito do tipo empilha-reduz LR(0).\n" +
                "$\\newline$IV. A gramática é LR(1).\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa68.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa68.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa68.setDisciplina(EDisciplina.COMPILADORES);
        questaoAlternativa68.setAlternativaCorreta("d");
        questaoAlternativa68.setImagem(true);
        questaoAlternativa68.setAlternativasA("Apenas I.");
        questaoAlternativa68.setAlternativasB("Apenas II.");
        questaoAlternativa68.setAlternativasC("Apenas II e III.");
        questaoAlternativa68.setAlternativasD("Apenas II e IV.\n");
        questaoAlternativa68.setAlternativasE("I, II, III e IV.");
        questaoAlternativa68.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa68.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa69 = new QuestaoAlternativa();
        questaoAlternativa69.setId(INICIOQUESTAO.longValue());
        questaoAlternativa69.setAno(ANO);
        questaoAlternativa69.setDescricao("Árvores de decisão são algoritmos que utilizam:");
        questaoAlternativa69.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa69.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa69.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa69.setAlternativaCorreta("c");

        questaoAlternativa69.setAlternativasA("Estruturas de IF-ELSE para realizar aprendizado.");
        questaoAlternativa69.setAlternativasB("Estruturas de repetição alinhadas para realizar aprendizado.");
        questaoAlternativa69.setAlternativasC("Aprendizado estatístico para construção de regras no aprendizado.");
        questaoAlternativa69.setAlternativasD("Exclusivamente funções matemáticas como estruturas de dados elementares para realizar\n" +
                "aprendizado.");
        questaoAlternativa69.setAlternativasE("Paradigma de programação em lógica para realizar aprendizado.\n");
        questaoAlternativa69.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa70 = new QuestaoAlternativa();
        questaoAlternativa70.setId(INICIOQUESTAO.longValue());
        questaoAlternativa70.setAno(ANO);
        questaoAlternativa70.setDescricao("Considere as assertivas abaixo sobre teste de sistema:\n" +
                "$\\newline$- O teste de ______________ tem por objetivo fazer o software falhar de diferentes maneiras, a fim de verificar a capacidade de recuperação do software a um estado normal de funcionamento.\n" +
                "$\\newline$- O teste de ______________ exercita o sistema de forma a observar seu desempenho em situações de demanda anormal de recursos, quer em termos de quantidade, frequência ou volume.\n" +
                "$\\newline$- O teste ___________ exercita o software em cada ambiente ou plataforma no qual deve funcionar. Também pode incluir examinar os procedimentos de instalação, softwares para a instalação (e.g. instaladores), e a documentação usada para apresentar o software ao usuário.\n" +
                "$\\newline$Assinale a alternativa que preenche, correta e respectivamente, as lacunas das assertivas acima.");
        questaoAlternativa70.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa70.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa70.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa70.setAlternativaCorreta("a");

        questaoAlternativa70.setAlternativasA("recuperação – stress – de implantação");
        questaoAlternativa70.setAlternativasB("segurança – stress – beta");
        questaoAlternativa70.setAlternativasC("recuperação – carga – de implantação");
        questaoAlternativa70.setAlternativasD("segurança – carga – de implantação\n");
        questaoAlternativa70.setAlternativasE("recuperação – stress – beta");
        questaoAlternativa70.setNumeroQuestao(NUMEROQUESTAO);


        List<Questao> questoes = new ArrayList<>();
        questoes.add(questaoAlternativa1);
        questoes.add(questaoAlternativa2);
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

        return questoes;
    }

}
