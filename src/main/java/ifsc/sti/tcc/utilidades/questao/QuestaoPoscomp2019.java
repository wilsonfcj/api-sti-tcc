package ifsc.sti.tcc.utilidades.questao;

import java.util.ArrayList;
import java.util.List;

import ifsc.sti.tcc.modelos.questao.Questao;
import ifsc.sti.tcc.modelos.questao.QuestaoAlternativa;
import ifsc.sti.tcc.props.EArea;
import ifsc.sti.tcc.props.EDisciplina;
import ifsc.sti.tcc.props.ETipoQuestaoProva;

public class QuestaoPoscomp2019 {

    final static Integer ANO = 2019;
    static Integer INICIOQUESTAO = 1201;
    static Integer NUMEROQUESTAO = 1;

    public static List<Questao> registerPoscomp() {

        QuestaoAlternativa questaoAlternativa1 = new QuestaoAlternativa();
        questaoAlternativa1.setId(INICIOQUESTAO.longValue());
        questaoAlternativa1.setAno(ANO);
        questaoAlternativa1.setDescricao("Seja uma matriz quadrada de terceira ordem $A = \\left(\\begin{array}{c}2 & 3 & 5\\\\ 7 & 11 & 13\\\\ 17 & 19 & 23\\end{array}\\right)$, calcule o determinante:");
        questaoAlternativa1.setArea(EArea.MATEMATICA);
        questaoAlternativa1.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa1.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa1.setAlternativaCorreta("a");

        questaoAlternativa1.setAlternativasA("Det A = –78");
        questaoAlternativa1.setAlternativasB("Det A = –84");
        questaoAlternativa1.setAlternativasC("Det A = 84");
        questaoAlternativa1.setAlternativasD("Det A = 78");
        questaoAlternativa1.setAlternativasE("Det A = –87");
        questaoAlternativa1.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa2 = new QuestaoAlternativa();
        questaoAlternativa2.setId(INICIOQUESTAO.longValue());
        questaoAlternativa2.setAno(ANO);
        questaoAlternativa2.setDescricao("Seja $E = \\mathbb{R}^{3}$.Os vetores {(1, 2, 3), (2, 5, 8), (1, 3, 7)} são independentes?");
        questaoAlternativa2.setArea(EArea.MATEMATICA);
        questaoAlternativa2.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa2.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa2.setAlternativaCorreta("b");

        questaoAlternativa2.setAlternativasA("Não.");
        questaoAlternativa2.setAlternativasB("Sim.");
        questaoAlternativa2.setAlternativasC("Não pode ser calculado.");
        questaoAlternativa2.setAlternativasD("Sim, se fosse um espaço de $\\mathbb{R}^{2}$.");
        questaoAlternativa2.setAlternativasE("Seriam independentes se o 1º vetor fosse (1, 5, 7).\n");
        questaoAlternativa2.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa3 = new QuestaoAlternativa();
        questaoAlternativa3.setId(INICIOQUESTAO.longValue());
        questaoAlternativa3.setAno(ANO);
        questaoAlternativa3.setDescricao("Encontre a equação da reta s, que passa pelo ponto A(3, 4) e que é perpendicular à reta r: x + y – 5 = 0.");
        questaoAlternativa3.setArea(EArea.MATEMATICA);
        questaoAlternativa3.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa3.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa3.setAlternativaCorreta("d");

        questaoAlternativa3.setAlternativasA("r: 5x – 2y + 2 = 0");
        questaoAlternativa3.setAlternativasB("r: x + y + 4 = 0");
        questaoAlternativa3.setAlternativasC("r: 2x + y = 0");
        questaoAlternativa3.setAlternativasD("r: x – y + 1 = 0");
        questaoAlternativa3.setAlternativasE("r: x – 3y + 2 = 0");
        questaoAlternativa3.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa4 = new QuestaoAlternativa();
        questaoAlternativa4.setId(INICIOQUESTAO.longValue());
        questaoAlternativa4.setAno(ANO);
        questaoAlternativa4.setDescricao("Encontre as coordenadas do centro (C) da circunferência de equação $t: x^{2} + y^{2} –3x + 5y –14 = 0$.");
        questaoAlternativa4.setArea(EArea.MATEMATICA);
        questaoAlternativa4.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa4.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa4.setAlternativaCorreta("e");

        questaoAlternativa4.setAlternativasA("$C \\left(\\frac{1}{2},\\frac{1}{2}\\right)$");
        questaoAlternativa4.setAlternativasB("$C \\left(\\frac{-1}{2},\\frac{3}{2}\\right)$");
        questaoAlternativa4.setAlternativasC("$C \\left(\\frac{3}{2},\\frac{1}{2}\\right)$");
        questaoAlternativa4.setAlternativasD("$C \\left(\\frac{5}{2},\\frac{5}{2}\\right)$");
        questaoAlternativa4.setAlternativasE("$C \\left(\\frac{3}{2},\\frac{-5}{2}\\right)$");
        questaoAlternativa4.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa5 = new QuestaoAlternativa();
        questaoAlternativa5.setId(INICIOQUESTAO.longValue());
        questaoAlternativa5.setAno(ANO);
        questaoAlternativa5.setDescricao("Calcule o $\\lim_{x \\rightarrow 2}\\frac{x^{3}-8}{6x^{2}-3x^{3}}$.");
        questaoAlternativa5.setArea(EArea.MATEMATICA);
        questaoAlternativa5.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa5.setDisciplina(EDisciplina.CALCULO);
        questaoAlternativa5.setAlternativaCorreta("e");

        questaoAlternativa5.setAlternativasA("-2");
        questaoAlternativa5.setAlternativasB("$\\infty$");
        questaoAlternativa5.setAlternativasC("0");
        questaoAlternativa5.setAlternativasD("1");
        questaoAlternativa5.setAlternativasE("-1");
        questaoAlternativa5.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa6 = new QuestaoAlternativa();
        questaoAlternativa6.setId(INICIOQUESTAO.longValue());
        questaoAlternativa6.setAno(ANO);
        questaoAlternativa6.setDescricao("Para quais valores de a e b, f(x) é contínua em x = 1 e x = 4. $f(x) = \\begin{cases}x\\,\\,\\,se\\,\\,\\, x\\leq1\\\\ax+b\\,\\,\\,se\\,\\,\\,1 < x < 4 \\\\ -2x\\,\\,\\,\\,se\\,\\,\\,4\\leq x\\end{cases}$");
        questaoAlternativa6.setArea(EArea.MATEMATICA);
        questaoAlternativa6.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa6.setDisciplina(EDisciplina.CALCULO);
        questaoAlternativa6.setAlternativaCorreta("b");

        questaoAlternativa6.setAlternativasA("a = –9 e b = –3");
        questaoAlternativa6.setAlternativasB("a = –3 e b = 4");
        questaoAlternativa6.setAlternativasC("a = 1 e b = 1");
        questaoAlternativa6.setAlternativasD("a = –1 e b = 2");
        questaoAlternativa6.setAlternativasE("a = 2 e b = 3\n");
        questaoAlternativa6.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa7 = new QuestaoAlternativa();
        questaoAlternativa7.setId(INICIOQUESTAO.longValue());
        questaoAlternativa7.setAno(ANO);
        questaoAlternativa7.setDescricao("Determine a matriz inversa de $A = \\left(\\begin{array}{c}1 & 2 & 2\\\\2 & 1 & 2 \\\\ 2 & 2 & 1\\end{array}\\right)$.");
        questaoAlternativa7.setArea(EArea.MATEMATICA);
        questaoAlternativa7.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa7.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa7.setAlternativaCorreta("d");

        questaoAlternativa7.setAlternativasA("$A^{-1}=\\frac{1}{5}\\left(\\begin{array}{c}1 & 7 & -1\\\\ 7 & 1 & 1\\\\ 1 & 3 & 1\\end{array}\\right)$");
        questaoAlternativa7.setAlternativasB("$A^{-1}=\\frac{1}{5}\\left(\\begin{array}{c}1 & 0 & -2\\\\ 5 & 1 & 0\\\\ 0 & 1 & 1\\end{array}\\right)$");
        questaoAlternativa7.setAlternativasC("$A^{-1}=\\frac{5}{1}\\left(\\begin{array}{c}0 & -1 & 1\\\\ -7 & 3 & 4\\\\ 7 & 1 & -1\\end{array}\\right)$");
        questaoAlternativa7.setAlternativasD("$A^{-1}=\\frac{1}{5}\\left(\\begin{array}{c}-3 & 2 & 2\\\\ 2 & -3 & 2\\\\ 2 & 2 & -3\\end{array}\\right)$");
        questaoAlternativa7.setAlternativasE("$A^{-1}=\\frac{1}{5}\\left(\\begin{array}{c}1 & 3 & -3\\\\ 5 & 3 & 1\\\\ 1 & 3 & -3\\end{array}\\right)$");
        questaoAlternativa7.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa8 = new QuestaoAlternativa();
        questaoAlternativa8.setId(INICIOQUESTAO.longValue());
        questaoAlternativa8.setAno(ANO);
        questaoAlternativa8.setDescricao(
                "Encontre as coordenadas retangulares do ponto (P), cujas coordenadas polares\n" +
                        "são $(3,120^{\\circ},120^{\\circ},135^{\\circ})$.\n" +
                        "$\\newline x = r* cos\\,\\alpha$\n" +
                        "$\\newline y = r* cos\\,\\beta$\n" +
                        "$\\newline z = r* cos\\,\\gamma$");
        questaoAlternativa8.setArea(EArea.MATEMATICA);
        questaoAlternativa8.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa8.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa8.setAlternativaCorreta("a");

        questaoAlternativa8.setAlternativasA("P$\\left(\\frac{-3}{2},\\frac{-3}{2},\\frac{-3\\sqrt{2}}{2}\\right)$");
        questaoAlternativa8.setAlternativasB("P$\\left(\\frac{1}{2},\\frac{1}{2},\\frac{\\sqrt{2}}{2}\\right)$");
        questaoAlternativa8.setAlternativasC("P$\\left(\\frac{-1}{2},\\frac{-1}{2},\\sqrt{2}\\right)$");
        questaoAlternativa8.setAlternativasD("$\\left(\\frac{3}{2},\\frac{3}{2},\\frac{1}{2}\\right)$");
        questaoAlternativa8.setAlternativasE("P$\\left(\\frac{-1}{2},\\frac{-3}{2},\\frac{\\sqrt{2}}{2}\\right)$");
        questaoAlternativa8.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa9 = new QuestaoAlternativa();
        questaoAlternativa9.setId(INICIOQUESTAO.longValue());
        questaoAlternativa9.setAno(ANO);
        questaoAlternativa9.setDescricao("Simplifique, com a ajuda dos Mapas de Karnaugh, a função cuja expressão em termos canônicos é: $f(x,y,z)=\\sum m(2,3,4,5,6,7)$");
        questaoAlternativa9.setArea(EArea.MATEMATICA);
        questaoAlternativa9.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa9.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa9.setAlternativaCorreta("a");

        questaoAlternativa9.setAlternativasA("$f(X,Y,Z)=X+Y$");
        questaoAlternativa9.setAlternativasB("$f(X,Y,Z)=X+Y+Z$");
        questaoAlternativa9.setAlternativasC("$f(X,Y,Z)=\\overline{X}+Y$");
        questaoAlternativa9.setAlternativasD("$f(X,Y,Z)=XY+Y$");
        questaoAlternativa9.setAlternativasE("$f(X,Y,Z)=X+Y+\\overline{Z}$");
        questaoAlternativa9.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa10 = new QuestaoAlternativa();
        questaoAlternativa10.setId(INICIOQUESTAO.longValue());
        questaoAlternativa10.setAno(ANO);
        questaoAlternativa10
                .setDescricao("A função $g(x) = x^{3}-6x^{2}+9x-2$ tem um máximo local estrito no ponto:");
        questaoAlternativa10.setArea(EArea.MATEMATICA);
        questaoAlternativa10.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa10.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa10.setAlternativaCorreta("c");

        questaoAlternativa10.setAlternativasA("A(0,−2)");
        questaoAlternativa10.setAlternativasB("A(3,−2)");
        questaoAlternativa10.setAlternativasC("A(1,2)");
        questaoAlternativa10.setAlternativasD("A(2,0)");
        questaoAlternativa10.setAlternativasE("A(4,2)");
        questaoAlternativa10.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa11 = new QuestaoAlternativa();
        questaoAlternativa11.setId(INICIOQUESTAO.longValue());
        questaoAlternativa11.setAno(ANO);
        questaoAlternativa11.setDescricao("Considere as premissas a seguir verdadeiras:\n" +
                "$\\newline$Premissa 1: Se Daenerys come churrasco ou João anda a cavalo, então Cersei assiste a um filme.\n" +
                "$\\newline$Premissa 2: Hoje, Cersei não assistiu a um filme.\n" +
                "$\\newline$Premissa 3: Se hoje é domingo, então Daenerys come churrasco e Jaime treina esgrima.\n" +
                "$\\newline$Premissa 4: Hoje, Jaime foi treinar esgrima.\n" +
                "$\\newline$É correto concluir que:");
        questaoAlternativa11.setArea(EArea.MATEMATICA);
        questaoAlternativa11.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa11.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa11.setAlternativaCorreta("c");

        questaoAlternativa11.setAlternativasA("Hoje é domingo e Daenerys comeu churrasco.");
        questaoAlternativa11.setAlternativasB("Hoje não é domingo e Daenerys comeu churrasco.");
        questaoAlternativa11.setAlternativasC("Hoje não é domingo e João não andou a cavalo.");
        questaoAlternativa11.setAlternativasD("Daenerys comeu churrasco ou João andou a cavalo.");
        questaoAlternativa11.setAlternativasE("Hoje é domingo e João andou a cavalo.");
        questaoAlternativa11.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa12 = new QuestaoAlternativa();
        questaoAlternativa12.setId(INICIOQUESTAO.longValue());
        questaoAlternativa12.setAno(ANO);
        questaoAlternativa12.setDescricao("Considere a seguinte proposição:\n" +
                "$\\newline$Em todos os cursos de Computação, existe, pelo menos, uma disciplina de Lógica.\n" +
                "$\\newline$A negação da proposição acima é logicamente equivalente à proposição:");
        questaoAlternativa12.setArea(EArea.MATEMATICA);
        questaoAlternativa12.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa12.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa12.setAlternativaCorreta("b");

        questaoAlternativa12.setAlternativasA("Em nenhum curso de Computação, há alguma disciplina de Lógica.");
        questaoAlternativa12.setAlternativasB("Há, pelo menos, um curso de Computação no qual não há disciplina de Lógica.");
        questaoAlternativa12.setAlternativasC("Em cada um dos cursos de Computação, não há disciplina de Lógica.\n");
        questaoAlternativa12.setAlternativasD("Não há curso de Computação no qual tenha disciplina de Lógica.");
        questaoAlternativa12.setAlternativasE("Há um curso de Computação no qual há, no máximo, uma disciplina de Lógica.\n");
        questaoAlternativa12.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa13 = new QuestaoAlternativa();
        questaoAlternativa13.setId(INICIOQUESTAO.longValue());
        questaoAlternativa13.setAno(ANO);
        questaoAlternativa13.setDescricao("Dez pessoas estão participando de um campeonato de xadrez. Na primeira rodada do campeonato, haverá cinco partidas. De quantas maneiras distintas é possível organizar a primeira rodada do campeonato, considerando que não há distinção entre a partida “competidor A versus competidor B” e a partida “competidor B versus competidor A”?");
        questaoAlternativa13.setArea(EArea.MATEMATICA);
        questaoAlternativa13.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa13.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa13.setAlternativaCorreta("c");

        questaoAlternativa13.setAlternativasA("45.");
        questaoAlternativa13.setAlternativasB("252.");
        questaoAlternativa13.setAlternativasC("945.");
        questaoAlternativa13.setAlternativasD("3.840.");
        questaoAlternativa13.setAlternativasE("113.400.");
        questaoAlternativa13.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa14 = new QuestaoAlternativa();
        questaoAlternativa14.setId(INICIOQUESTAO.longValue());
        questaoAlternativa14.setAno(ANO);
        questaoAlternativa14.setDescricao("Resolva a identidade $\\overline{\\overline{C}\\cdot (\\overline{D} + \\overline{E})}$ , aplicando, se necessário, as leis de álgebra de Boole. ");
        questaoAlternativa14.setArea(EArea.MATEMATICA);
        questaoAlternativa14.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa14.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa14.setAlternativaCorreta("e");

        questaoAlternativa14.setAlternativasA("$\\overline{C}+ (D \\cdot E)$");
        questaoAlternativa14.setAlternativasB("$\\overline{C}+ (C + E)$");
        questaoAlternativa14.setAlternativasC("$C+ (\\overline{C} \\cdot \\overline{E})$");
        questaoAlternativa14.setAlternativasD("$\\overline{C} \\cdot (D \\cdot E)$");
        questaoAlternativa14.setAlternativasE("$(C+D)\\cdot(C+E)$");
        questaoAlternativa14.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa15 = new QuestaoAlternativa();
        questaoAlternativa15.setId(INICIOQUESTAO.longValue());
        questaoAlternativa15.setAno(ANO);
        questaoAlternativa15.setDescricao("A expressão lógica $\\sim q\\rightarrow\\sim p$ é equivalente a:");
        questaoAlternativa15.setArea(EArea.MATEMATICA);
        questaoAlternativa15.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa15.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa15.setAlternativaCorreta("b");

        questaoAlternativa15.setAlternativasA("$\\sim p \\,\\wedge \\sim q $");
        questaoAlternativa15.setAlternativasB("$\\sim p \\,\\vee q $");
        questaoAlternativa15.setAlternativasC("$\\sim p \\rightarrow q $");
        questaoAlternativa15.setAlternativasD("$p \\rightarrow \\sim q $");
        questaoAlternativa15.setAlternativasE("$q \\rightarrow p $");
        questaoAlternativa15.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa16 = new QuestaoAlternativa();
        questaoAlternativa16.setId(INICIOQUESTAO.longValue());
        questaoAlternativa16.setAno(ANO);
        questaoAlternativa16.setDescricao("O número hexadecimal BEEF em base 2 é:");
        questaoAlternativa16.setArea(EArea.MATEMATICA);
        questaoAlternativa16.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa16.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa16.setAlternativaCorreta("b");

        questaoAlternativa16.setAlternativasA("1010 1111 1111 1110");
        questaoAlternativa16.setAlternativasB("1011 1110 1110 1111");
        questaoAlternativa16.setAlternativasC("0010 0011 0011 0100");
        questaoAlternativa16.setAlternativasD("1000 0101 0101 0100");
        questaoAlternativa16.setAlternativasE("1001 1100 1100 1101");
        questaoAlternativa16.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa17 = new QuestaoAlternativa();
        questaoAlternativa17.setId(INICIOQUESTAO.longValue());
        questaoAlternativa17.setAno(ANO);
        questaoAlternativa17.setDescricao("Uma pessoa deseja fazer uma compra na Internet e, para isso, precisa se cadastrar em um site. A senha de cadastro deve ser formada por exatamente 9 caracteres, e somente os caracteres $, @ e # podem ser usados. Quantas senhas diferentes, contendo pelo menos uma ocorrência de cada caractere, existem?");
        questaoAlternativa17.setArea(EArea.MATEMATICA);
        questaoAlternativa17.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa17.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa17.setAlternativaCorreta("c");

        questaoAlternativa17.setAlternativasA("729.");
        questaoAlternativa17.setAlternativasB("4.374.");
        questaoAlternativa17.setAlternativasC("18.150.");
        questaoAlternativa17.setAlternativasD("61.236.");
        questaoAlternativa17.setAlternativasE("367.416.");
        questaoAlternativa17.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa18 = new QuestaoAlternativa();
        questaoAlternativa18.setId(INICIOQUESTAO.longValue());
        questaoAlternativa18.setAno(ANO);
        questaoAlternativa18.setDescricao("Encontre a média ($\\mu$) e o desvio padrão ($\\sigma$) da distribuição:\n");
        questaoAlternativa18.setArea(EArea.MATEMATICA);
        questaoAlternativa18.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa18.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa18.setAlternativaCorreta("a");
        questaoAlternativa18.setImagem(true);
        questaoAlternativa18.setAlternativasA("$\\mu = 4,0;\\sigma = 2,24$");
        questaoAlternativa18.setAlternativasB("$\\mu = 4,0;\\sigma = 5,00$");
        questaoAlternativa18.setAlternativasC("$\\mu = 5,0;\\sigma = 25,00$");
        questaoAlternativa18.setAlternativasD("$\\mu = 3,0;\\sigma = 4,0$");
        questaoAlternativa18.setAlternativasE("$\\mu = 4,0;\\sigma = 21,0$");
        questaoAlternativa18.setImagemQuestao("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAQ8AAACKCAYAAAC0Jc/hAAAAAXNSR0IArs4c6QAAHmRJREFUeJzt3XlcVGXfx/GPA4IpyKaAO+6KGm5pN2XmdqeS2mJqbrhrZmpluRFqWJaaK7jVo/ZomncupXK75J0PWSaghjtmwjAFggqyyjYz1/MHmIogOA0weP/er1evV86cc+b6MWe+55zrLFclpZRCCCEekaa8GyCEqJgkPIQQJpHwEEKYRMJDCGESCQ8hhEkkPIQQJpHwEEKYxLrgC5UqVSqPdgghLNDDLgN7IDyKm6GiqVSpktRjoR6nWuDxrOdh5LBFCGGSQvc8zM9I4n8+Y35Ya/xm9sFNA6Dnt6/nsTF3GB+O8MSmbBpSOnLOsikglCc/GE+HClyIQRvM4sVbOX45jjSbengPm8HM4W1xKO+GmcTI9R1TeGXZKXLvvGTdjLGbNjOhmVV5NswEei5tnc3S/9zE+NdrlbB/ZiqrxrUtt1aVUXhocOnUCZt3xvFe05/YPNAN46Ug3px/iaEHm1fg4NBzKmgcsz8/yI+6Hnw1dzwdyrtJf4Ph5k1Ue18CZrTBIWE37w4ZwoIGZ1nWpWJ+Q9nxkehavM/JlT3y1rFK1jxhX9GCA0BDbe/BjPHIIu+gyEj0l2+w8ExyubaqjMIDsO/KgtUv0WX8+3z7j/fQvrUBF//D+HpUxC/zDmvaTfqC/UM282rro+XdmL/NpqMvczrm/6NBd9q5ryA2q2Ifw2sqP0F1R0eqlHdD/hYNDo068kyjvH8ZE3exIcSFsd92KddWlV14AHbPzWP1y10Z0e0Vqv1jEUeG1KnwnS4aK2tsrK14fE5SJROyyo8N/z5PZt/1rOlhW94N+ltu7plCh+NPUKXuPxg2O4Bp3WpRkTdXkM2pFYsI6/4RQZ7lW0kZ/3ar0tLbi0oxN3Bt24oaGgAjCfsWsyYsp2ybIopQhbrtnueF3q1I3ruWfVcM5d0gE2moPW4P8QlRXDh/gm3jK7Fx+HT+lVje7fp7jLotBHxVk2mzemJfzm0p0/AwXt/HzLmXGbHNH9ugtwi8pAc0VNZYo6lc0fdBHhdVaNxlICOnf8a7bcPZuOtKeTfIZFbVHLCzBjT2NB/gyz8dIjlztSJvpNI5+ulnaF/1Y7QFHO6X3S/WeI3dM+YQOTiQOa9OZcW0Sqx8cyUXcoxkxZzl4vWKuoV7XBhJ+SOGpDtfg17LhSu5uNdxKddWmS6HeF08d6JCHx1KRFoTWjcs0yN1szJcWsOCf7fi/Xf+YRF9OGV2qjb267fxix7G15+3wxZo/sZKpn37Am+u6Mlmu7JphfllE/LBC7y16yq6m+mc7dCWryZt55u3WlbA42pF/HdTeHFlLHWa1kLzxyVutF7A9sE1y7thJkonxK8Ls87UokXdylz7LZE2C7YzqGYF3cM1Xmf3wnVkjdrNoFqWUUOlgo8hLPur5IzErRnDJ43Xs+oF83fOPY5X/ZVmPcbsW8TGJJDjUI+GbtVKdde09L8bI1lJseiu5+BQvyFuVUv3R/fftq5ZQHiULqnHcj1OtcB/Xz2FhocQQoDcGCf1WKjHqRZ4POt5GMvoeRFCVDgSHkIIk5RheORwImgSY0aPYcy4Sbw9fz3/0WaV3cf/bVlEfjOXob2fp5vPKAKCY9AXNplBS/Ciybzerwddn+/D8DlbiUgp67aWQFYk38wdSu/nu+EzKoDgmEKr+UvO2U188PkpLPUSq6zIb5g7tDfPd/NhVEAwxZQDOZfZPmcKa8MtsaISrmv6y+ycN55BPt3p2r0/4z45iK64us1JFVDIS2aSob56xVF1+eCwOvZ//1Zf+vuoxg1HqG8SDKX0eXnMVU92mJ/q0GyI+uK0TmmPL1cvNu2ull3WFzJhuNr80efqwK9X1Z9Rx9Wql+ur5m//qLLN0gpz1ZOtwvw6qGZDvlCndVp1fPmLqmn3ZaqwclTuSRXo20t5udkqp6E7VaYZPv0Os61r2WHKr0MzNeSL00qnPa6Wv9hUdV92WRVWjlJKKcN1dWDaP5RbdUc1aEeGedqgymFdyzqm1n/4pQqJjFVxkQfU3GfrqG4rfi+67kdUXD1lHB5O6sWNyXn/zD2r5neso0bvM+fq+CDz1JOrTvu1V61nHM8PgUwVPNZDdVuuLWY+vTr/YSfVaOJhlWWGVihlpnpyTyu/9q3VjOP5kZYZrMZ6dFPLtYUFuUHpc7PVzc9fVO4WGh65p/1U+9Yz1N1yxiqPbstVoeWoLHV25YvKe+xXamn/mhYYHqaua7nq7PyOymP8gTJb18qtz8MQG8av8Q1o6pHEvsVryqsZJaRHq43D2d09/8pRa1zdHYmN1hY5R3LIKqYM8+HNX/uyfn4PLOreVL0WbZwz7u7518Fau+LuGEu0trB9Xg1W1jZYW1XCUk/i67Va4pzduVuOO46x0TxYjpH4vdOYdOA5AlcNwNUie/wefV0DICeSfYfjaNP5SSqXQSuhzDtM9YR9NoDuzz1Fq+5BVJ0dyNTWVdBYW+S3eA8j+lwD1ra2f/2AKltZYcgt+gCzSt12PP9Cb1ol72XtvitY1J07Rj25Bmtsbf+qBisrA7n6inma0ajPxWBty91yrLAy5FKwHMOlIMZ9Cu9vepd2VS01Ch99XcN4nUMzffkf5w9Y7Fu7zH7UZXyXkDVeY9fyP0PccHF1pqoVYIwj5uzFsm3GI7PCxcWRzNRUFLUBI6mpGTjUKPqmsSqNuzCwcRdedDlHs4W7uDJmDi0s5YYXKxdcHDNJTVXklZNKaoYDNVwspYGPxsrFBcfMVO6Wk0qGQw0KlqOPuULszZ+Z17s981CkxCSTcuY5RmXuYbNvvXJp+4MecV0zJvD97JeZdmkI23ZMokUZ/qLLfJNv61iberXyg6PCsMXL+0nifgoh1ggYovg5PJf2TzcDwJh0nE2ffMGPCUaMKX8Qc/fWVLQXrpDrXgcXS9rQ2Xrh/WQcP4XEklfOz4TntufpZtaAkaTjm/jkix9JMBa3IMtg6+XNk3E/EZL35RD1czi57Z8mr5wkjm/6hC9+TMC29yp+vXyOiIgIIiJ+4cPnHen1yY8WFBzwKOsa2ZfZOs6H93Rj2Ln7PTqX9cNmH7WTxHQFOkzvMMSqIN+3SukzzVhPZoRa2b+lavGMj+rTubnyGrZZXcnv1k7dMVi5ec1V4dlK6SNXqxebNFHtuvZRfbu1Vg1bD1Hrz5mvm9Fc9WRGrFT9W7ZQz/j0UZ2be6lhm6/k99Knqh2D3ZTX3PC8Drus/1N+XduolnUdVGXHBsrT62W16qJ5+vPNt65lqoiV/VXLFs8onz6dVXOvYWrz3S9HDXbzUnPDC57vylD/+1JNC+wwVSVe17J/ekc1s3FU9T1bqVat8v5r8/wHKsRMp/aKq6cMw6N8mLeebJWkjVSRfybfczosUx2c2FK9EKRVf3XuG7JUku6yuvR7vEo385los9aTnaS0kZHqz+R7wiDzoJrY8gUVVPipCrMy97qWnaRVkZF/qvvLmahavhBUxJkX8yqXda0UFVdPxX0ySrmwwalBc5zufckQg1a9xNRhDe4eA2pscarX7P7pLJGNEw2a399KQ4wW9dJUhjWw9E7sB9k4NeD+cgzEaBUvTR1GxSunhOtaOZK7aoUQRVIPudHvgT2Ph00shBB3WMLejxCiApLwEEKYRMJDCGESCQ8hhEkkPIQQJpHwEEKYRMJDCGESCQ8hhEkkPIQQJpHwEEKYRMJDCGESCQ8hhEnklnxRurJDmNd3BsEptjjXdcWuyM2VIispjusZNXk1cDezO9uUZSuFCSQ8ROmyfYYhL7uwZvpP0Pswuxd6Y1fEpMb4nfg+/R66NLmzuyKQwxZRyqxpOflzVg9y5sySMcw8mEhRj0bVuPdjVL96slJWEA88DEiI0mBM+p5pz/ZjXforbPllK0PqFB4ROYmxJFWpg3u1Mm6geGQSHqLMZITNp0fPhUR1CeSn7yblPd1cVFiyh/hfypimJSr+IQMJZcdxNSa9yEMMU1Tr5Memj3uiDs1izOJfqUjDnIsHSXg8ltI5GdAVd69Xed/Pj7lTffB86oP894zEHwpg4ty9xOQawaDj6+HNqPmMP7+k6Ln4yXPUaj+RndpMonbNZOKio9wwW4Lc6f+oTujC0fj/mGKuBYvyUMpPbxflwqDi1/ZRbd4+ljf2SnaY2rA2JO8d3WY1dMAidfaesT1yQ2epDj2WK23WJRXkO0qtv3TnzUwV5t9Xjdx+zayP+jckHlZTWtqqyk3Gqe8SymIQAVEapM/DIug59fFANnluIbDfdYKGzEazeDtvNLw7rJ7hj2N8fSiS2wW/LSsPuvn2osl9I/BlETyuHVt7hbG1Syi7LrViYI9aaDBwYWFP5rhuZ88E97u7nfozzHtuCtq2TfEYuJR53Z3/es8Ys5K+Y/UEHXqXxvd8xqO150F5/R8f8ec/N/LzjhE0KGp643W+X/Iu87fcZvy/l/LEkpEsNc7iWJAPVfKWRMSXCwkI/IEGU6diH/IVe0/VZ8GRNfR3kR3r0iR/XUtgvM6JYynUbVkV0kMJueRCk9r3/5oq2djhXKMGNR74zx7bgsvTRxIaYSTll495Y9h09qdUz/+iUwk7lUaLJ53v/+KtG/GUp45j6nVmd7//PY27F81uhhNeoIPikdpTiGqd/Ni08HkyD23j0EOPi2xo7buaT3vr2PzeaqIH7iU0yIcq5JCSmAJYUbv3dCZ0TCMk3IFJ67cxpd5RDkbkQk4KiSk5JWiNMIX0d1uCrHBOJXvh29CKrJ+Oc7FpJ9oX+AVq7Ovi6eWAoeCWvlI1nApstY2JYZzO7s3MxYvofKU/52s9kf9GCrdSbbGzv3cGI3F75rPbxYcGR0M4r+9Fx3vXCqtq2FmnkpxhhGp3Y+VR2lMoYwray7doNWMNw90fsg3TOFLLHap61SP2VnemdnXKC7ec02xapWP6gkG41tBy+qIbgz/vQy10JKfb4+JoRc7pTazSvcaCQXVK0CDxqCQ8LID+Yhjn3NrQht/4ZsP32LWbRMExi/Xa79mw7jgpBTfSlZ9k5KcT6HTP1dw5J8P43bMHbW2gSnMnIj7dgvMsXxpZOeBUPZNrKQYg7xeecXIp7x/uyMervfm2z0t8HeZPR+97FmZIJSWnOo7V7v+BP0p7HmTkjx1TmRM1km3LO1G1mL+PMfEH1obn4BB9mfic3tS3rkRs8CFSvEbnTZASSnhqW972sMKg289/snqzwDOW4MUpeI12L2bpwlQSHuXOyI2TkSRFH2filGu86NmIlGOBrDoSwPSeNf86hLD2HMpHq4YWvzj9Vf61+QjpidYs9jtH+sX9HHZdwggrAHs6dbBn15mbGL1rk3l2HSMGr8Nh2Unq6q+RY9CyfclWJu8cQ6P8vQdDbAS/uT7FO1Xu/5gSt6ewJl5exxuf5vLOd2/SspiQSdg2lde32zIlcAE+r49j+vRcJvrPoH38BaJdnAHIPnWC84nR7N3wGTuPhvLs4g08ZZvJyQvRuDiXZDdImKS8e2xFutozdoBafDl/OOPcRKW7b3Bj8zLoNqkhPgHq16ySTJ2hfpnbW/nuiDff2ZaMcBXQtb0avzehRMvMSohWuuS8KbMTdSo22aCUylT7Jr6mlkXplVK56tyCZ5XPmih1LSpaXc/MnzFzn5r42jIVVVp/SKGkw7S86S8SFpGNnUP+GMHWztSr40BpbS819Uay/C1F4Lsr+EH3kM7E7GgOLpnBRvtZfDbQzUw968kc/WAy+zsvZ0k/1xIt09bVg3oOeVPaONejtoMGSCMhKZErR0KAW4SGx1DZxgrnhh7UvLOHlJZAUuIVjoTEmKXl4kFyqrbcGUhLSETj5kpZ3s5hTI9Bl1EXD7ciYionHm2CPR71zNUqI/F7xtNnVRM2HphNuyrFz/EwhvRbpNs44WCTw63YWJI1ztSvdW/oGki/lY6NkwNyc3/pkPAQZcIQvYnXBuzmnzv3MOkhN7VkHfFnWtQw1k9oXoatE6aQwxZR+rLPsWL8CqrOWceEh94Nl8OpA3v4LU32FSoCOdsiSlk6xz8cTcBVN4b+upo5EUVPaUi7RPCWqzRe6Vx2zRMmk/AQpUp/PohZayPJzVZ8Gfhz8TNoXPCuUZJrVEV5kz4PIYRJpM9DCGESCQ8hhEkkPIQQJpHwEEKYRMJDCGESCQ8hhEkkPIQQJpHwEEKYRMJDCGESCQ8hhEkkPIQQJpHwEEKYRMJDCGESuSVfmCibkHl9mRGcgq1zXVztit4Oqawk4q5nUPPVQHbP7iyPBXxMSHgIE9nyzJCXcVkznZ/ozeHdC/G2K2JSYzw7fZ/mPV0a8vyHx4cctgiTWbeczOerB+F8ZgljZh4ksahRIzXu9BvVj3qytj1W5GFA4u8xJvH9tGfpty6dV7b8wtYhdQrfIuUkEptUhTruZfmMeFGaJDweeznE/LiTI5dvkV65Ha+P9MbV3HsAGWHM79GThVFdCPzpu4c+Hf2R5MTw484jXL6VTuV2rzPSu2RjvYiyId9FhWYkTRtFvP5h09wm9oYD3UYPw+XAh3wZbSA77iox6Q8bmf4RVeuE36aP6akOMWvMYn7NMtNyb8dyw6Ebo4e5cODDL4k2mGm5wiwkPCxY+skAurp78er7fvjNnYqP51N8EJ6fFMZ4DgVMZO7eGHKNYNB9zfBmNXnG/xdS9Bf55LlatJ+4E63BEe9XfWjw535+sR+ATwMrVE4Uu2ZOZNHRG5grQu70f1QPXcho/x9JMcdCHb151acBf+7/BfsBPjSQYWctS3mNcymKZ4hfq/q0eVsdy1ZKqWwVtmGtCslQSimD0m0eqgYsOquy/5o6V4XO6qB6LNeqrEtBynfUenUp/03DtWA1f/oqdSL5ntFhM8OUf9+Ravs1s41Cq5QhUR2e0lLZVm6ixn1XsrFoi1mguhY8X01fdUIlm7GZwjykz8OCZQWPo93WXoRt7ULorku0GtiDWhrAcIGFPefgun0PE9zv7jzqz8zjuSla2jb1YODSeXR31oAxjq2v92V95c40z0ik/sxt+D9tAxiJWdmXsfogDr3b+O4wjYY/OPb1ISJvF1wtrPDo5kuvJsVs/vP7Pz76859s/HkHI4rcXTBy/fslvDt/C7fH/5ulTyxh5FIjs44F4ZM/FKUxbiuv911P5c7NyUisz8xt71Jl+0ICAn+gwdSp2Id8xd5T9VlwZA39XWQnuqzJdR4WS09kaATGFDs+fmMd+7LeInRQ/lupYZxKa8FM5/t/MNaNnsJTtwXlvz4vOAA0tRm+I4LhDyxfg7tXM26uCyeLxnfHya1kg51zDWpUfTA87EsynEq1TvhtWsjPz85l26EbDJvgXuSxsU1rX1Z/eoNefu+xuvdk9oZ2xemeiTW1h7Mj4t6WZ3G993QmnPiOOeEO7F+/jfovd+ZgRC79e8hYL2VNwsNSGRMJO51N75mLWdT5Cv3P1+KJO2+l3CLV1g77ezfqxjj2zN+Ni08DjoacR9+rY7FfrlU1O6xTk8kwQrU7P1qNPXU9vXAwFAyPSlRzKkmng5EU7WVutZrBmuFFBwdocKzlDlW9qBd7i+5T7wRHDidWfITutXkMqlNw7iq41tBy+qIbgz/vQy10JKfb4+JoRc6JFXyke40Fg+qUoI3CHCQ8LFXOScJ+96RHWxuo0hyniE/Z4jwL30ZWaBycqJ55jRQD5B1vZHBy6fsc7vgxq72/pc9LXxPm3xHvYq4DN6SmkFPd8W5wAOi1fL9hHcdTCnalVubJkZ8yodPDF2r8YwdT50QxcttyOlUtpkZjIj+sDSfHIZrL8Tn0rm9NpdhgDqV4Mdq9iNhJCSU8tS1ve1hh0O3nP1m9WeAZS/DiFLxGuxfzgcKcJDwskp6r/9rMkfRErBf7cS79IvsPu7JkRP6W374THex3ceamEe/amZxdN4LB6xxYdrIu+ms5GLTbWbJ1MjvHNKLofQUDsRG/4frUO1S592VrT4Z+tIqhJjX7Muve+JTcd77jzZbFhEzCNqa+vh3bKYEs8HmdcdOnkzvRnxnt47kQ7YJzEQ3PPnWC84nR7N3wGTuPhvLs4g08ZZvJyQvRuBQ1kygd5d1jK0xhULpNQ5RPwK8qy9RFZPyi5vb2VTvizXUaI0OFB3RV7cfvVQklWWRWgorWJeedkclOVLrYvP/P3DdRvbYsSukLnSlXnVvwrPJZE6WuRUWr65n5L2fuUxNfW6aiCp9JlBLpoq6QNNQbuZy3VCDvrvgBXc6jzZ0dfZAlMzZiP+szBrqZZxVIPvoBk/d3ZvmSfiW7gtXWFY96Dnl9IjbO1Kud9/9pCUkkXjlCSExhV4TdIjQ8hso2Vjg39KDmnV2mtASSEq9wJCTGLLWIkpFTtRWakfQYHRl1PXB7hD32nHgtCfYe1DPTbSbG+D2M77OKJhsPMLtdleJneBhDOrfSbXByKOywJ4dbsbEka5ypX8vhnkMyA+m30rFxcpDb/cuQhIf4ewzRbHptALv/uZM9k5oV3YmWdQT/aVEMWzOB5tI18ViQwxbxN2RzbsV4VlSdw7oJDwkOIOfUAfb8liZ7Bo8ROdsiTJZ+/ENGB1zFbeivrJ4TUfSEhjQuBW/hauOVRZ5FERWPhIcwjf48QbPWEpmbjfoykJ+LnUGDi3cN5DrQx4f0eQghTCJ9HkIIk0h4CCFMIuEhhDCJhIcQwiQSHkIIk0h4CCFMIuEhhDCJhIcQwiQSHkIIk0h4CCFMIuEhhDCJhIcQwiQSHkIIk8gt+RVVGY8gb0zTos2oSyP3oleZnJgf2XnkMrfSK9Pu9ZF4O8RzNb46DRvYmb9tZVy/eJD8vSuqMhtB3kj8oQAmzt1LTO7Dh8W+HXsDh26jGeZygA+/jMagcojaNZOJi45yw1wjat/9sDKqXxSpPB/dLv4uvYreMlmNXXNB5f6t5aSp8A+fU25PvqLemztXzXmrr2rZ0U8ppZRBt1kNHbBInb0zorY+Rm0f1lTV8P5AHU/OVRcWdVHu7Saob6Lzxz3QR6stk8eqNRfutChThfn3VSO3XzPDwNcFmat+YQoJjwrLnCPIG1T82j6qzdvHVLZSSmWHqQ1rQ5RSenU+4HnVf/39P/zc0FmqQ4/lSpt1SQX5jlLrL+Uni+GaCp4/Xa06kXzf9AbtCvVCj6Xqd7OOq2LO+oUppM/D4mUTFbycJV+dJEp3HetatajbYzZr+59n2pwjVO78B6MGHWLmNn+e/uvpwgb+OPY1hyJv88Bw1R7dGNOrSYFXczh5MppWvbywijvCvy61YuykWsAtwk6l0WKm833Ht9bth+Bzewr+b5/FY+RnzGthAxiJ2zaNOUcq0/mPUQw6NJNt/k9jA2jcvWh2cx3hWdDYhOEe9Kc+ZuAmT7YE9uN60BBmaxbz1YCfH1K/KAsSHhbNyPXvpjDs82as2LKV2/P78u1L/8vKbrZA2wIjyN+rEjZ2ztSoUfXB8ChsqHt9JKERRlLsPuaNdfvIeiuUQQDGFG6l2mJnX+CpxdaNeMpTxxblz/rud4JFQ+3hOyi0SVbVsLNOJfneEbWNiVz8OYK47IIt1FCz9fN4/TVWrZHrJ46RUvdVqpJOaMglXMbXpnLt4Q+pX5QFCQ9LZtCxLTCSvivW0dlJz1HjNaKjbkO34h4jrMG+rideDoYHwqNSNacHpjYmhnE6uzczFy+i85X+nK/1RP5iHHCqnsm1uyNqA0bi9sxnt4sPDY6GcF7fi47FrUWGVFJyquN474jaKo24yHOcSy/YQmsa13nunvDIIvxUMl6+DbHK+onjF5vSqb08RtkSSHhYMsOf/JnRhGcbW4H+HP8Xake7MfYlmFGP9vsNrDuewgNj3T85kuUTOt33Ws7JMH737EFbG6jS3ImIT7fgPMuXRlb2dOpgz64zNzF610YDZJxcyvuHO/Lxam++7fMSX4f509H74ccLhtgIfnN9infuHUzOyoOe46fTs9hSLhJ2zo02beC3bzbwvV07JjmU4E8gSp2EhyWzaUOvp+PZ9EkgkdcOcMZnKZu8SvKVWeM59CNWlWSoe/1V/rX5COmJ1iz2O0f6xf0cdl3CCKu85bT0HY39Gxs5O8aPppfXMWLwOhyWnaSu/ho5Bi3bl2xl8s4xNCpyPJbbhG88Qp0Jm2lowpgtxhsniUyK5vjEKVx70ZNGKccIXHWEgOk9qSkXGpQrGXrB4mVzI1pLenUPGrqUx+66kfhDH+G3z56h70+me/1H6JXMjubgqiXsNg5m0XtdcTHhx57x7TiGXXmfXe81wwo9SX8kYFW7Dg4yeFS5k/AQJWJMj0GXURePRxtRG22CPR4mj6itJ3zO0/jXCyb4DTe5otHCSHgIi2ZISyBR44arqfkjSo2EhxDCJLInKIQwiYSHEMIkEh5CCJNIeAghTCLhIYQwiYSHEMIkEh5CCJNIeAghTPL/BrDsxtvNszcAAAAASUVORK5CYII=");
        questaoAlternativa18.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa19 = new QuestaoAlternativa();
        questaoAlternativa19.setId(INICIOQUESTAO.longValue());
        questaoAlternativa19.setAno(ANO);
        questaoAlternativa19.setDescricao("De quantas maneiras diferentes é possível formar uma equipe de ginástica olímpica com precisamente 3 ginastas mulheres e 4 ginastas homens, escolhidos a partir de uma delegação com 15 pessoas, das quais 8 são homens e 7 são mulheres?");
        questaoAlternativa19.setArea(EArea.MATEMATICA);
        questaoAlternativa19.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa19.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa19.setAlternativaCorreta("d");

        questaoAlternativa19.setAlternativasA("91.");
        questaoAlternativa19.setAlternativasB("105.");
        questaoAlternativa19.setAlternativasC("1.960.");
        questaoAlternativa19.setAlternativasD("2.450.");
        questaoAlternativa19.setAlternativasE("5.460.");
        questaoAlternativa19.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa20 = new QuestaoAlternativa();
        questaoAlternativa20.setId(INICIOQUESTAO.longValue());
        questaoAlternativa20.setAno(ANO);
        questaoAlternativa20.setDescricao("Um avião tem três computadores idênticos, e utiliza-se apenas um para operá-lo, os dois restantes são de reposição que podem se ativar caso o sistema principal falhe. Durante uma hora de operação, a probabilidade de falha do computador principal (ou de qualquer sistema de reposição ativado) é de 0,0005. Supondo que cada hora representa um teste independente, qual é o tempo médio para que ocorram falhas nos três computadores?");
        questaoAlternativa20.setArea(EArea.MATEMATICA);
        questaoAlternativa20.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa20.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa20.setAlternativaCorreta("e");

        questaoAlternativa20.setAlternativasA("200 horas.");
        questaoAlternativa20.setAlternativasB("1.000 horas.");
        questaoAlternativa20.setAlternativasC("2.000 horas.");
        questaoAlternativa20.setAlternativasD("3.000 horas.");
        questaoAlternativa20.setAlternativasE("6.000 horas.");
        questaoAlternativa20.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa21 = new QuestaoAlternativa();
        questaoAlternativa21.setId(INICIOQUESTAO.longValue());
        questaoAlternativa21.setAno(ANO);
        questaoAlternativa21.setDescricao("Considere os seguintes algoritmos recursivos que resolvem o mesmo problema em uma entrada de tamanho n:\n" +
                "$\\newline$Algoritmo 1: Divide o problema em 3 partes de tamanho n/4 cada e gasta um tempo adicional O(1) por chamada.\n" +
                "$\\newline$Algoritmo 2: Divide o problema em 3 partes de tamanho n/2 cada e gasta um tempo adicional O(n^{2}) por chamada.\n" +
                "$\\newline$Algoritmo 3: Divide o problema em 3 partes de tamanho n/3 cada e gasta um tempo adicional de O(n) por chamada.\n" +
                "$\\newline$A complexidade dos algoritmos 1, 2 e 3 é, respectivamente:");
        questaoAlternativa21.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa21.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa21.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa21.setAlternativaCorreta("a");

        questaoAlternativa21.setAlternativasA("$\\theta(n^{log_{4}3}),\\theta(n^{2})\\theta(n\\,\\,log\\,\\,n)$");
        questaoAlternativa21.setAlternativasB("$\\theta\\left(\\frac{n}{4}\\right),\\theta\\left(\\frac{n}{2}\\right)\\theta\\left(\\frac{n}{3}\\right)$");
        questaoAlternativa21.setAlternativasC("$\\theta(1),\\theta(n^{2})\\theta(n)$");
        questaoAlternativa21.setAlternativasD("$\\theta(n^{4}),\\theta(n^{2})\\theta(n^{3})$");
        questaoAlternativa21.setAlternativasE("$\\theta(n^{log_{4}3}),\\theta(n^{log_{2}3})\\theta(n^{log_{3}3})$");
        questaoAlternativa21.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa22 = new QuestaoAlternativa();
        questaoAlternativa22.setId(INICIOQUESTAO.longValue());
        questaoAlternativa22.setAno(ANO);
        questaoAlternativa22.setDescricao("Considere as seguintes funções:\n" +
                "$\\newline f(n)=2^{n}$\n" +
                "$\\newline g(n)=n!$\n" +
                "$\\newline h(n)=n^{logn} \\newline$\n" +
                "Assinale a alternativa correta a respeito do comportamento assintótico de f(n), g(n) e h(n).");
        questaoAlternativa22.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa22.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa22.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa22.setAlternativaCorreta("d");

        questaoAlternativa22.setAlternativasA("$f(n) = O(g(n));g(n) = O(h(n))$");
        questaoAlternativa22.setAlternativasB("$f(n) = \\Omega(g(n));g(n) = O(h(n))$");
        questaoAlternativa22.setAlternativasC("$g(n) = O(f(n));h(n) = O(f(n))$");
        questaoAlternativa22.setAlternativasD("$h(n) = O(f(n));g(n) = \\Omega(f(n))$");
        questaoAlternativa22.setAlternativasE("Nenhuma das anteriores.\n");
        questaoAlternativa22.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa23 = new QuestaoAlternativa();
        questaoAlternativa23.setId(INICIOQUESTAO.longValue());
        questaoAlternativa23.setAno(ANO);
        questaoAlternativa23.setDescricao("Sobre árvores, é correto afirmar que: ");
        questaoAlternativa23.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa23.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa23.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa23.setAlternativaCorreta("b");

        questaoAlternativa23.setAlternativasA("Um nodo é interno se não tiver filhos e é externo se tiver um ou mais filhos. ");
        questaoAlternativa23.setAlternativasB("O ancestral de um nodo pode ser tanto seu ancestral direto como um ancestral do pai do nodo.");
        questaoAlternativa23.setAlternativasC("Uma árvore é balanceada se existe uma ordem linear definida para cada nodo, isto é, podemos identificar o filho de um nodo como sendo o primeiro, segundo e assim por diante.");
        questaoAlternativa23.setAlternativasD("Uma árvore binária é dita própria se todo nodo interno tiver um ou zero filhos.");
        questaoAlternativa23.setAlternativasE("Se o nodo v é pai do nodo u, então dizemos que v é filho de u.\n");
        questaoAlternativa23.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa24 = new QuestaoAlternativa();
        questaoAlternativa24.setId(INICIOQUESTAO.longValue());
        questaoAlternativa24.setAno(ANO);
        questaoAlternativa24.setDescricao("Um procedimento recursivo é aquele que contém em sua descrição: ");
        questaoAlternativa24.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa24.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa24.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa24.setAlternativaCorreta("c");

        questaoAlternativa24.setAlternativasA("Uma prova de indução matemática. ");
        questaoAlternativa24.setAlternativasB("Duas ou mais chamadas a procedimentos externos.");
        questaoAlternativa24.setAlternativasC("Uma ou mais chamadas a si mesmo.\n");
        questaoAlternativa24.setAlternativasD("Somente chamadas externas.");
        questaoAlternativa24.setAlternativasE("Uma ou mais chamadas a procedimentos internos.");
        questaoAlternativa24.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa25 = new QuestaoAlternativa();
        questaoAlternativa25.setId(INICIOQUESTAO.longValue());
        questaoAlternativa25.setAno(ANO);
        questaoAlternativa25.setDescricao("Considere a seguinte função em C:\n" +
                "$\\newline$void funcao(int n){\n" +
                "$\\newline$ int i,j;\n" +
                "$\\newline$ for (i=1; i<=n; i++)\n" +
                "$\\newline$ for(j=1; j<log(i); j++)\n" +
                "$\\newline$ printf(“%d”,i+j)\n" +
                "$\\newline$}\n" +
                "$\\newline$A complexidade dessa função é:");
        questaoAlternativa25.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa25.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa25.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa25.setAlternativaCorreta("b");

        questaoAlternativa25.setAlternativasA("$\\theta(n)$");
        questaoAlternativa25.setAlternativasB("$\\theta(n\\,\\,log\\,\\,n)$");
        questaoAlternativa25.setAlternativasC("$\\theta(log\\,\\,n)$");
        questaoAlternativa25.setAlternativasD("$\\theta(n^{2})$");
        questaoAlternativa25.setAlternativasE("$\\theta(n^{2}log\\,\\,n)$");
        questaoAlternativa25.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa26 = new QuestaoAlternativa();
        questaoAlternativa26.setId(INICIOQUESTAO.longValue());
        questaoAlternativa26.setAno(ANO);
        questaoAlternativa26.setDescricao("Sobre listas, analise as assertivas abaixo:\n" +
                "$\\newline$I. Objetos podem ser inseridos em uma pilha a qualquer momento, mas apenas o que foi inserido mais recentemente (isto é, o último) pode ser removido a qualquer momento.\n" +
                "$\\newline$II. Em uma fila, os elementos podem ser inseridos a qualquer momento, mas apenas o elemento que está a mais tempo na fila pode ser removido.\n" +
                "$\\newline$III. Em uma fila, os elementos são inseridos e removidos de acordo com o princípio “o último que entra é o primeiro que sai”.\n" +
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
        questaoAlternativa27.setDescricao("Considere o seguinte código em Linguagem C abaixo" +
                "Assinale a alternativa que corresponde à saída impressa na tela. ");
        questaoAlternativa27.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa27.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa27.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa27.setAlternativaCorreta("a");
        questaoAlternativa27.setImagem(true);
        questaoAlternativa27.setAlternativasA("21 1 0 4");
        questaoAlternativa27.setAlternativasB("3 1 -5 -2");
        questaoAlternativa27.setAlternativasC("2 0 -4 -1");
        questaoAlternativa27.setAlternativasD("9 0 -3 -2");
        questaoAlternativa27.setAlternativasE("1 0 9 2");
        questaoAlternativa27.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa27.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa28 = new QuestaoAlternativa();
        questaoAlternativa28.setId(INICIOQUESTAO.longValue());
        questaoAlternativa28.setAno(ANO);
        questaoAlternativa28.setDescricao("Anulada");
        questaoAlternativa28.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa28.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa28.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa28.setAlternativaCorreta("*");

        questaoAlternativa28.setAlternativasA("Anulada");
        questaoAlternativa28.setAlternativasB("Anulada");
        questaoAlternativa28.setAlternativasC("Anulada");
        questaoAlternativa28.setAlternativasD("Anulada");
        questaoAlternativa28.setAlternativasE("Anulada");
        questaoAlternativa28.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa29 = new QuestaoAlternativa();
        questaoAlternativa29.setId(INICIOQUESTAO.longValue());
        questaoAlternativa29.setAno(ANO);
        questaoAlternativa29.setDescricao("Em um sistema de arquivos, é necessário gerenciar blocos de discos que estão livres, para que possam ser alocados a arquivos e/ou diretórios de que necessitem. Analise as técnicas abaixo:\n" +
                "$\\newline$I. Vetor de bits, no qual cada bloco é representado por um bit.\n" +
                "$\\newline$II. Lista encadeada, na qual um ponteiro mantido em memória corresponde ao endereço do primeiro bloco livre, e cada bloco contém um apontador para o próximo bloco livre.\n" +
                "$\\newline$III. Lista de contadores, em que cada elemento da lista contém um endereço de bloco e um contador representando o número de blocos contíguos a este que estão livres.\n" +
                "$\\newline$Quais implementam a gerência de espaço livre em disco?");
        questaoAlternativa29.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa29.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa29.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa29.setAlternativaCorreta("e");

        questaoAlternativa29.setAlternativasA("Apenas I.");
        questaoAlternativa29.setAlternativasB("Apenas II.");
        questaoAlternativa29.setAlternativasC("Apenas III.");
        questaoAlternativa29.setAlternativasD("Apenas I e II.");
        questaoAlternativa29.setAlternativasE("I, II e III.");
        questaoAlternativa29.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa30 = new QuestaoAlternativa();
        questaoAlternativa30.setId(INICIOQUESTAO.longValue());
        questaoAlternativa30.setAno(ANO);
        questaoAlternativa30.setDescricao("Considere as afirmações abaixo sobre comandos em linguagens de programação:\n" +
                "$\\newline$I. Uma declaração de variável associa um nome a um valor que, geralmente, não pode ser alterado durante a execução do programa.\n" +
                "$\\newline$II. Expressões aritméticas são expressões cujos resultados são valores numéricos, inteiros ou fracionários.\n" +
                "$\\newline$III. Expressões lógicas são aquelas que têm como resultado um dos dois valores, verdadeiro ou falso.\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa30.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa30.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa30.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa30.setAlternativaCorreta("d");

        questaoAlternativa30.setAlternativasA("Apenas I.");
        questaoAlternativa30.setAlternativasB("Apenas II.");
        questaoAlternativa30.setAlternativasC("Apenas III.\n");
        questaoAlternativa30.setAlternativasD("Apenas II e III.\n");
        questaoAlternativa30.setAlternativasE("I, II e III.");
        questaoAlternativa30.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa31 = new QuestaoAlternativa();
        questaoAlternativa31.setId(INICIOQUESTAO.longValue());
        questaoAlternativa31.setAno(ANO);
        questaoAlternativa31.setDescricao("De acordo com a Teoria de Sistema de Tipos, classifique a função a seguir:\n" +
                "$\\newline$int soma(int x,int y) {\n" +
                "$\\newline$    return x+y;\n" +
                "$\\newline$}");
        questaoAlternativa31.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa31.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa31.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa31.setAlternativaCorreta("c");

        questaoAlternativa31.setAlternativasA("Função Somadora.");
        questaoAlternativa31.setAlternativasB("Função Polimórfica.\n");
        questaoAlternativa31.setAlternativasC("Função Monomórfica.");
        questaoAlternativa31.setAlternativasD("Função Sobrecarregada.");
        questaoAlternativa31.setAlternativasE("Função Abstrata.");
        questaoAlternativa31.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa32 = new QuestaoAlternativa();
        questaoAlternativa32.setId(INICIOQUESTAO.longValue());
        questaoAlternativa32.setAno(ANO);
        questaoAlternativa32.setDescricao("Sobre grafos, assinale a alternativa correta.");
        questaoAlternativa32.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa32.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa32.setDisciplina(EDisciplina.GRAFOS);
        questaoAlternativa32.setAlternativaCorreta("d");

        questaoAlternativa32.setAlternativasA("Um grafo ponderado é um grafo não direcionado em que todos os pares de vértices são adjacentes, isto é, há arestas ligando todos os vértices entre si. ");
        questaoAlternativa32.setAlternativasB("Todo grafo completo tem pesos associados às suas arestas. ");
        questaoAlternativa32.setAlternativasC("Um caminho em um grafo é complexo se todos os vértices do caminho são distintos. ");
        questaoAlternativa32.setAlternativasD("O grau de um vértice em um grafo não direcionado é o número de arestas que incidem nele.");
        questaoAlternativa32.setAlternativasE("Se existir um caminho c de x a y, então x é alcançável a partir de c via y.");
        questaoAlternativa32.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa33 = new QuestaoAlternativa();
        questaoAlternativa33.setId(INICIOQUESTAO.longValue());
        questaoAlternativa33.setAno(ANO);
        questaoAlternativa33.setDescricao("Assinale a alternativa que contém uma estrutura de controle que permite que a execução de um trecho de programa dependa do fato de uma condição ser verdadeira, isto é, vinculada à execução de um ou mais comandos ao resultado obtido na avaliação de uma expressão lógica (também denominada condicional).");
        questaoAlternativa33.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa33.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa33.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa33.setAlternativaCorreta("a");

        questaoAlternativa33.setAlternativasA("Seleção simples.");
        questaoAlternativa33.setAlternativasB("Seleção dupla.");
        questaoAlternativa33.setAlternativasC("Comando composto.");
        questaoAlternativa33.setAlternativasD("Múltipla escolha.");
        questaoAlternativa33.setAlternativasE("Seleção aninhada.");
        questaoAlternativa33.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa34 = new QuestaoAlternativa();
        questaoAlternativa34.setId(INICIOQUESTAO.longValue());
        questaoAlternativa34.setAno(ANO);
        questaoAlternativa34.setDescricao("Suponha que existem registros lógicos que agregam vários campos (atributos) e que se deseja encontrar registros com base em algum campo de pesquisa, fornecendo algum valor (chave). Considerando estruturas de dados que tornem essa busca eficiente, analise as assertivas abaixo e assinale V, se verdadeiras, ou F, se falsas.\n" +
                "$\\newline$( ) Uma estrutura baseada em hash é bastante eficiente para pesquisas baseadas em chave, pois permite encontrar o(s) registro(s) correspondente(s) à chave em, no máximo, um acesso à estrutura.\n" +
                "$\\newline$( ) As árvores digitais de pesquisa não tratam as chaves como elementos indivisíveis e, por isso, são adequadas em casos em que há interesse em fazer buscas sobre parte do valor da chave (ex.: prefixo).\n" +
                "$\\newline$( ) Árvores binárias de pesquisa, nas quais os nodos correspondem às chaves, sempre permitem uma busca baseada em chave mais eficiente quando comparada às listas ordenadas pelas chaves.\n" +
                "$\\newline$A ordem correta de preenchimento dos parênteses, de cima para baixo, é:");
        questaoAlternativa34.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa34.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa34.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa34.setAlternativaCorreta("b");

        questaoAlternativa34.setAlternativasA("V – F – V.");
        questaoAlternativa34.setAlternativasB("F – V – F.");
        questaoAlternativa34.setAlternativasC("F – F – F.");
        questaoAlternativa34.setAlternativasD("F – V – V.");
        questaoAlternativa34.setAlternativasE("V – V – F.");
        questaoAlternativa34.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa35 = new QuestaoAlternativa();
        questaoAlternativa35.setId(INICIOQUESTAO.longValue());
        questaoAlternativa35.setAno(ANO);
        questaoAlternativa35.setDescricao("Uma técnica de compressão de dados converte um bitstream de entrada (mensagem\n" +
                "de entrada) em outro bitstream comprimido (mensagem comprimida). Algumas técnicas de compressão dependem de uma tabela de símbolos, definida nesse contexto como uma estrutura de dados que associa caracteres (ou sequência de caracteres) a códigos utilizados para representar a mensagem comprimida. Analise as seguintes assertivas sobre uso de uma tabela de símbolos na técnica de compressão LZW (Lempel, Ziv e Welch) e assinale V, se verdadeiras, ou F, se falsas.\n" +
                "$\\newline$( ) A tabela de símbolos associa caracteres individuais com códigos de tamanho variável (bitstreams), cujo tamanho está relacionado à frequência de um caractere. Quanto mais frequente for um caractere na mensagem original, menos bits são usados para representá-lo.\n" +
                "$\\newline( ) A tabela de símbolos é incluída no início da mensagem comprimida. Para descomprimir a mensagem, o primeiro passo é extrair essa tabela de símbolos, para então usá-la na decodificação da mensagem original.\n" +
                "$\\newline( ) Uma estrutura de dados adequada para implementação da tabela de símbolos na técnica LWZ é uma árvore trie, devido às operações que essa técnica precisa realizar sobre a tabela de símbolos para efetuar a compressão.\n" +
                "$\\newlineA ordem correta de preenchimento dos parênteses, de cima para baixo, é:");
        questaoAlternativa35.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa35.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa35.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa35.setAlternativaCorreta("d");

        questaoAlternativa35.setAlternativasA("F – V – V.\n");
        questaoAlternativa35.setAlternativasB("V – V – F.");
        questaoAlternativa35.setAlternativasC("F – F – F.");
        questaoAlternativa35.setAlternativasD("F – F – V.");
        questaoAlternativa35.setAlternativasE("V – F – V.");
        questaoAlternativa35.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa36 = new QuestaoAlternativa();
        questaoAlternativa36.setId(INICIOQUESTAO.longValue());
        questaoAlternativa36.setAno(ANO);
        questaoAlternativa36.setDescricao("Um mapa rodoviário é modelado como um grafo em que os vértices representam\n" +
                "interseções. As arestas representam segmentos de estrada entre interseções. O peso de cada aresta representa a distância entre interseções. Agora, considere que um motorista deseja obter o caminho mais curto entre duas cidades. Dado um mapa contendo as distâncias entre cada par de interseções adjacentes, como obter o caminho mais curto entre duas cidades?");
        questaoAlternativa36.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa36.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa36.setDisciplina(EDisciplina.GRAFOS);
        questaoAlternativa36.setAlternativaCorreta("c");

        questaoAlternativa36.setAlternativasA("Caminho mais curto com destino único.");
        questaoAlternativa36.setAlternativasB("Caminho gerador mínimo de origem única. ");
        questaoAlternativa36.setAlternativasC("Caminho mais curto com origem única.");
        questaoAlternativa36.setAlternativasD("Caminho mais curto entre todos os pares de vértices.");
        questaoAlternativa36.setAlternativasE("Caminho gerador mínimo de origem múltipla.");
        questaoAlternativa36.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa37 = new QuestaoAlternativa();
        questaoAlternativa37.setId(INICIOQUESTAO.longValue());
        questaoAlternativa37.setAno(ANO);
        questaoAlternativa37.setDescricao("Dado um grafo G e um vértice de origem, qual é o algoritmo de busca que descobre todos os vértices a uma distância K do vértice origem, antes de descobrir qualquer vértice a uma distância K+1? ");
        questaoAlternativa37.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa37.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa37.setDisciplina(EDisciplina.GRAFOS);
        questaoAlternativa37.setAlternativaCorreta("b");

        questaoAlternativa37.setAlternativasA("Pré-ordem.");
        questaoAlternativa37.setAlternativasB("Largura.");
        questaoAlternativa37.setAlternativasC("Pós-ordem.");
        questaoAlternativa37.setAlternativasD("Profundidade.");
        questaoAlternativa37.setAlternativasE("Simétrica.");
        questaoAlternativa37.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa38 = new QuestaoAlternativa();
        questaoAlternativa38.setId(INICIOQUESTAO.longValue());
        questaoAlternativa38.setAno(ANO);
        questaoAlternativa38.setDescricao("O programa deve ser feito de forma descendente, com a decomposição do problema inicial em módulos, de modo a dividir as ações complexas em uma sequência de ações mais simples. Essa técnica de programação é chamada de programação:");
        questaoAlternativa38.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa38.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa38.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa38.setAlternativaCorreta("e");

        questaoAlternativa38.setAlternativasA("Abstrata.\n");
        questaoAlternativa38.setAlternativasB("Interna.");
        questaoAlternativa38.setAlternativasC("Declarativa.");
        questaoAlternativa38.setAlternativasD("Sequencial.\n");
        questaoAlternativa38.setAlternativasE("Modular.");
        questaoAlternativa38.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa39 = new QuestaoAlternativa();
        questaoAlternativa39.setId(INICIOQUESTAO.longValue());
        questaoAlternativa39.setAno(ANO);
        questaoAlternativa39.setDescricao("Seja M uma máquina de Turing sobre alfabeto $\\sum$. Denotamos por ACEITA(M) o\n" +
                "conjunto de palavras aceitas por M. Uma linguagem $L \\subseteq  \\sum* $ é denominada Turing-reconhecível quando existe uma Máquina de Turing M tal que L = ACEITA(M). Usaremos TR(L) para denotar que a linguagem L é Turing-reconhecível. Nesse sentido, analise as seguintes afirmações sobre duas linguagens L1 e L2 sobre o alfabeto $\\sum$:\n" +
                "$\\newline$I. Se TR(L1) e TR(L2), então TR$(L1\\cup L2)$.\n" +
                "$\\newline$II. Se TR(L1), então TR$(\\sum*\\backslash L1)$.\n" +
                "$\\newline$III. Se TR(L1) e TR(L2), então TR$(L1 \\cap L2)$.\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa39.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa39.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa39.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa39.setAlternativaCorreta("c");

        questaoAlternativa39.setAlternativasA("Apenas I.");
        questaoAlternativa39.setAlternativasB("Apenas II.");
        questaoAlternativa39.setAlternativasC("Apenas I e III.");
        questaoAlternativa39.setAlternativasD("Apenas II e III.\n");
        questaoAlternativa39.setAlternativasE("I, II e III.\n");
        questaoAlternativa39.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa40 = new QuestaoAlternativa();
        questaoAlternativa40.setId(INICIOQUESTAO.longValue());
        questaoAlternativa40.setAno(ANO);
        questaoAlternativa40.setDescricao("Considere as seguintes afirmações sobre classes de problemas:\n" +
                "$\\newline$I. O problema de decisão CAM, descrito a seguir, pertence à classe de complexidade P.\n" +
                "$\\newline$CAM (caminho em grafo)\n" +
                "$\\newline$Entrada: uma tripla (G,a,b) em que\n" +
                "$\\newline$- G é um grafo\n" +
                "$\\newline$- a e b são nodos de G\n" +
                "$\\newline$Pergunta: Existe caminho em G iniciando em a e terminando em b?\n" +
                "$\\newline$II. Um problema X pertence à classe de problemas NP-completos quando satisfaz às seguintes condições:\n" +
                "$\\newline$- X pertence à classe NP, e\n" +
                "$\\newline$- todo problema Y da classe NP pode ser reduzido em tempo polinomial a X.\n" +
                "$\\newline$III. Se um problema de decisão X pertence à classe P, então o complemento do problema X (problema\n" +
                "com as mesmas instâncias que X, porém com as respectivas respostas invertidas) pertence à classe NP.\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa40.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa40.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa40.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa40.setAlternativaCorreta("e");

        questaoAlternativa40.setAlternativasA("Apenas I.");
        questaoAlternativa40.setAlternativasB("Apenas III.");
        questaoAlternativa40.setAlternativasC("Apenas I e II.");
        questaoAlternativa40.setAlternativasD("Apenas II e III.\n");
        questaoAlternativa40.setAlternativasE("I, II e III.");
        questaoAlternativa40.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa41 = new QuestaoAlternativa();
        questaoAlternativa41.setId(INICIOQUESTAO.longValue());
        questaoAlternativa41.setAno(ANO);
        questaoAlternativa41.setDescricao("Considere L1 e L2 duas linguagens formais sobre o alfabeto $\\sum = \\left\\{0,1\\right\\}$,descritas como segue:\n" +
                "$\\newline L1 = \\left\\{ww | w \\in \\sum*\\right\\}$\n" +
                "$\\newline L2 = \\left\\{0^{a}1^{b} |a>0,b>0,b \\,\\,\\, ímpar\\right\\}$\n" +
                "$\\newline$Na descrição acima, justaposição significa concatenação de palavras e $\\sum*$ denota o conjunto de todas as palavras sobre o alfabeto $\\sum$.\n" +
                "$\\newline$Seja A1 o autômato finito sobre alfabeto $\\sum = \\left\\{0,1\\right\\}$ descrito pelo seguinte diagrama de transição de estados:\n" +
                "$\\newline$Denotemos por ACEITA(A1) o conjunto de palavras aceitas por A1.\n" +
                "$\\newline$Nesse sentido, considere as seguintes afirmaçõess:\n" +
                "$\\newline$I. L1 é uma linguagem regular.\n" +
                "$\\newline$II. L2 é uma linguagem livre de contexto.\n" +
                "$\\newline$III. ACEITA(A1) ={$w|w\\in \\sum*$ e w possui um número ímpar de zeros }.\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa41.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa41.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa41.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa41.setAlternativaCorreta("b");
        questaoAlternativa41.setImagem(true);
        questaoAlternativa41.setAlternativasA("Apenas I.");
        questaoAlternativa41.setAlternativasB("Apenas II.");
        questaoAlternativa41.setAlternativasC("Apenas I e III.");
        questaoAlternativa41.setAlternativasD("Apenas II e III.");
        questaoAlternativa41.setAlternativasE("I, II e III.");
        questaoAlternativa41.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa41.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa42 = new QuestaoAlternativa();
        questaoAlternativa42.setId(INICIOQUESTAO.longValue());
        questaoAlternativa42.setAno(ANO);
        questaoAlternativa42.setDescricao("Assinale a alternativa que apresenta a expressão simplificada equivalente ao circuito lógico abaixo:\n");
        questaoAlternativa42.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa42.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa42.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
        questaoAlternativa42.setAlternativaCorreta("a");
        questaoAlternativa42.setImagem(true);
        questaoAlternativa42.setAlternativasA("S = $\\overline{A}BC$");
        questaoAlternativa42.setAlternativasB("S = $A\\overline{B}C$");
        questaoAlternativa42.setAlternativasC("S = $AB\\overline{C}$");
        questaoAlternativa42.setAlternativasD("S = $\\overline{A}B\\overline{C}$");
        questaoAlternativa42.setAlternativasE("S = $\\overline{ABC}$");
        questaoAlternativa42.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa42.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa43 = new QuestaoAlternativa();
        questaoAlternativa43.setId(INICIOQUESTAO.longValue());
        questaoAlternativa43.setAno(ANO);
        questaoAlternativa43.setDescricao("Considerando que determinado microcontrolador utiliza os endereços hexadecimais de 002016 (inclusive) até 00FF_{16} (inclusive) para acesso a registradores de E/S (Entrada/Saída), a quantidade total de endereços utilizados para acesso aos registradores de E/S é de:");
        questaoAlternativa43.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa43.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa43.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa43.setAlternativaCorreta("d");

        questaoAlternativa43.setAlternativasA("80.");
        questaoAlternativa43.setAlternativasB("128.");
        questaoAlternativa43.setAlternativasC("160.");
        questaoAlternativa43.setAlternativasD("224.");
        questaoAlternativa43.setAlternativasE("236.");
        questaoAlternativa43.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa44 = new QuestaoAlternativa();
        questaoAlternativa44.setId(INICIOQUESTAO.longValue());
        questaoAlternativa44.setAno(ANO);
        questaoAlternativa44.setDescricao("Utilizando o seu conhecimento sobre a arquitetura RISC, analise as sentenças abaixo:\n" +
                "$\\newline$01. Arquitetura RISC suporta alinhamento arbitrário de dados para operações de leitura/escrita.\n" +
                "$\\newline$02. Nenhum endereçamento indireto que requer um acesso à memória para obter o endereço de um operando na memória é considerado típico de um RISC clássico.\n" +
                "$\\newline$04. Na arquitetura RISC, o número de bits para especificadores registradores inteiros é igual a quatro ou mais. Isso significa que ao menos 16 registradores inteiros podem ser explicitamente referenciados em um momento.\n" +
                "$\\newline$08. Um número menor de modos de endereçamento, normalmente menos de cinco. Este parâmetro é difícil de ser determinado na arquitetura RISC.\n" +
                "$\\newline$16. Arquitetura RISC suporta operação que combina leitura/escrita com aritmética (por exemplo, adicionar da memória, adicionar para memória).\n" +
                "$\\newline$32. Não mais do que um operando endereçado em memória por instrução é específico da arquitetura RISC.\n" +
                "$\\newline$64. Na arquitetura RISC, o tamanho é normalmente de 4 bytes.\n" +
                "$\\newline$O resultado da somatória dos números correspondentes às alternativas corretas é:");
        questaoAlternativa44.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa44.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa44.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa44.setAlternativaCorreta("c");

        questaoAlternativa44.setAlternativasA("117.");
        questaoAlternativa44.setAlternativasB("110.");
        questaoAlternativa44.setAlternativasC("106.");
        questaoAlternativa44.setAlternativasD("102.");
        questaoAlternativa44.setAlternativasE("95.");
        questaoAlternativa44.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa45 = new QuestaoAlternativa();
        questaoAlternativa45.setId(INICIOQUESTAO.longValue());
        questaoAlternativa45.setAno(ANO);
        questaoAlternativa45.setDescricao("Considere o programa abaixo escrito em linguagem C. No instante da execução da linha 5, ter-se-á uma hierarquia composta de quantos processos e threads, respectivamente?");
        questaoAlternativa45.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa45.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa45.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa45.setAlternativaCorreta("e");
        questaoAlternativa45.setImagem(true);
        questaoAlternativa45.setAlternativasA("1 e 0.");
        questaoAlternativa45.setAlternativasB("3 e 0.");
        questaoAlternativa45.setAlternativasC("4 e 1.");
        questaoAlternativa45.setAlternativasD("7 e 7.");
        questaoAlternativa45.setAlternativasE("8 e 8.");
        questaoAlternativa45.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa45.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa46 = new QuestaoAlternativa();
        questaoAlternativa46.setId(INICIOQUESTAO.longValue());
        questaoAlternativa46.setAno(ANO);
        questaoAlternativa46.setDescricao(" Um dispositivo de E/S pode acionar o seu software controlador (device driver) para realizar uma tarefa enquanto este esteja realizando o tratamento de outra tarefa do dispositivo. Por exemplo, enquanto o device driver da placa de rede processa um pacote que acabou de chegar, ele é interrompido para tratar a chegada de um novo pacote. Essa característica de um device driver é denominada código:");
        questaoAlternativa46.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa46.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa46.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa46.setAlternativaCorreta("d");

        questaoAlternativa46.setAlternativasA("Assíncrono.");
        questaoAlternativa46.setAlternativasB("Assimétrico.");
        questaoAlternativa46.setAlternativasC("Elástico.");
        questaoAlternativa46.setAlternativasD("Reentrante.");
        questaoAlternativa46.setAlternativasE("Recursivo.");
        questaoAlternativa46.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa47 = new QuestaoAlternativa();
        questaoAlternativa47.setId(INICIOQUESTAO.longValue());
        questaoAlternativa47.setAno(ANO);
        questaoAlternativa47.setDescricao("Seja um circuito lógico com três entradas, A, B, C, e uma saída S. Considerando que o valor da saída S é igual ao valor da entrada A quando as entradas B e C estão no mesmo nível lógico, e que o valor da saída S é igual ao inverso do valor da entrada A quando as entradas B e C estão em níveis lógicos opostos, assinale a alternativa que apresenta a expressão lógica correspondente ao circuito.");
        questaoAlternativa47.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa47.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa47.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
        questaoAlternativa47.setAlternativaCorreta("b");

        questaoAlternativa47.setAlternativasA("S = $A\\cdot B\\oplus C$");
        questaoAlternativa47.setAlternativasB("S = $A \\oplus B\\oplus C$");
        questaoAlternativa47.setAlternativasC("S = $\\overline{A} \\oplus B\\oplus C$");
        questaoAlternativa47.setAlternativasD("S = $A \\oplus \\overline{B\\oplus C}$");
        questaoAlternativa47.setAlternativasE("S = $\\overline{A \\oplus B\\oplus C}$");
        questaoAlternativa47.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa48 = new QuestaoAlternativa();
        questaoAlternativa48.setId(INICIOQUESTAO.longValue());
        questaoAlternativa48.setAno(ANO);
        questaoAlternativa48.setDescricao("Um cientista da computação precisa avaliar o desempenho de seu computador para calcular o tempo de resposta de um algoritmo. Levando em consideração que todos os setores da trilha 0 são lidos começando do setor 0, então, todos os setores da trilha 1 a partir do setor 0, e assim por diante. O tempo de rotação é de 30 ms, e um seek gasta 20 ms entre cilindros adjacentes e 80 ms para o pior caso. A comutação entre trilhas no mesmo cilindro pode ser feita instantaneamente. Dessa maneira, quanto tempo é gasto para ser lido um disco de 2.400 cilindros, cada um com seis trilhas de 32 setores em segundos?");
        questaoAlternativa48.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa48.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa48.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa48.setAlternativaCorreta("b");

        questaoAlternativa48.setAlternativasA("628,12.");
        questaoAlternativa48.setAlternativasB("480,06.");
        questaoAlternativa48.setAlternativasC("320,12.");
        questaoAlternativa48.setAlternativasD("268,06.");
        questaoAlternativa48.setAlternativasE("124,12.");
        questaoAlternativa48.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa49 = new QuestaoAlternativa();
        questaoAlternativa49.setId(INICIOQUESTAO.longValue());
        questaoAlternativa49.setAno(ANO);
        questaoAlternativa49.setDescricao("Em uma máquina de 32 bits, subdividimos o endereço virtual em 4 segmentos da seguinte maneira apresentada na figura abaixo. " +
                "Uma tabela de páginas de 3 níveis é utilizada, de modo que os primeiros 10 bits são para o primeiro nível e assim por diante. Sendo assim, qual é o tamanho de uma tabela de páginas para um processo que tem 256K de memória iniciando no endereço 0?");
        questaoAlternativa49.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa49.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa49.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa49.setAlternativaCorreta("b");
        questaoAlternativa49.setImagem(true);
        questaoAlternativa49.setAlternativasA("6480 bytes.");
        questaoAlternativa49.setAlternativasB("4608 bytes.");
        questaoAlternativa49.setAlternativasC("3240 bytes.");
        questaoAlternativa49.setAlternativasD("2408 bytes.");
        questaoAlternativa49.setAlternativasE("1020 bytes.");
        questaoAlternativa49.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa49.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa50 = new QuestaoAlternativa();
        questaoAlternativa50.setId(INICIOQUESTAO.longValue());
        questaoAlternativa50.setAno(ANO);
        questaoAlternativa50.setDescricao("Uma partição de disco rígido é formatada com um sistema de arquivos com base em alocação encadeada, usando tabela de alocação. A formatação da partição considerou um tamanho de bloco (cluster) de 4096 bytes. Um programa executado nesse computador cria um arquivo nessa partição e grava os dados do arquivo de acordo com o trecho de código abaixo. Como resultado, o arquivo criado contém ____ bytes e ocupa ____ bytes na área de dados do sistema de arquivos.\n" +
                "Assinale a alternativa que preenche, correta e respectivamente, as lacunas do trecho acima.");
        questaoAlternativa50.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa50.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa50.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa50.setAlternativaCorreta("c");
        questaoAlternativa50.setImagem(true);
        questaoAlternativa50.setAlternativasA("1024 – 1024");
        questaoAlternativa50.setAlternativasB("1025 – 1025");
        questaoAlternativa50.setAlternativasC("1024 – 4096");
        questaoAlternativa50.setAlternativasD("1025 – 4096");
        questaoAlternativa50.setAlternativasE("4096 – 4096");
        questaoAlternativa50.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa50.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa51 = new QuestaoAlternativa();
        questaoAlternativa51.setId(INICIOQUESTAO.longValue());
        questaoAlternativa51.setAno(ANO);
        questaoAlternativa51.setDescricao(" Sobre o controle de concorrência baseado na ordenação de timestamp (rótulo de\n" +
                "tempo), considere r_ts(x) e w_ts(x) os timestamps da última transação a ler e a gravar o item de dados x, respectivamente. Considere que a transação T, cujo timestamp é ts(T), precisa gravar o item de dados x, ou seja, T emite a operação write(x). Conforme o algoritmo de ordenação baseada em timestamp básica, para que as transações sejam serializáveis em conflito sem que haja o aborto e o reinício de T, o seguinte predicado precisa ser verdadeiro:");
        questaoAlternativa51.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa51.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa51.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa51.setAlternativaCorreta("e");

        questaoAlternativa51.setAlternativasA("(r_ts(x) > ts(T)) or (w_ts(x) > ts(T))");
        questaoAlternativa51.setAlternativasB("(r_ts(x) > ts(T)) and (w_ts(x) > ts(T))");
        questaoAlternativa51.setAlternativasC("(not (r_ts(x) > ts(T))) or (w_ts(x) > ts(T))");
        questaoAlternativa51.setAlternativasD("(not (r_ts(x) > ts(T))) or (not (w_ts(x) > ts(T)))");
        questaoAlternativa51.setAlternativasE("(not (r_ts(x) > ts(T))) and not ((w_ts(x) > ts(T)))");
        questaoAlternativa51.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa52 = new QuestaoAlternativa();
        questaoAlternativa52.setId(INICIOQUESTAO.longValue());
        questaoAlternativa52.setAno(ANO);
        questaoAlternativa52.setDescricao("Dentre os algoritmos para mineração de dados, um exemplo de algoritmo para o\n" +
                "particionamento de dados pelo aprendizado não supervisionado, que não usa uma amostra de treinamento pré-classificada, é denominado algoritmo de:");
        questaoAlternativa52.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa52.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa52.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa52.setAlternativaCorreta("b");

        questaoAlternativa52.setAlternativasA("Crescimento padrão frequente.");
        questaoAlternativa52.setAlternativasB("Agrupamento k-means. ");
        questaoAlternativa52.setAlternativasC("Amostragem.");
        questaoAlternativa52.setAlternativasD("Associação negativa.\n");
        questaoAlternativa52.setAlternativasE("Árvore padrão frequente.");
        questaoAlternativa52.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa53 = new QuestaoAlternativa();
        questaoAlternativa53.setId(INICIOQUESTAO.longValue());
        questaoAlternativa53.setAno(ANO);
        questaoAlternativa53.setDescricao("Analise as assertivas abaixo sobre testes de regressão e assinale V, se verdadeiras, ou F, se falsas.\n" +
                "$\\newline$( ) Uma suite de testes de regressão bem planejada deve conter dois tipos de casos de teste: aqueles focados nos componentes diretamente relacionados à mudança e aqueles que exercitem funcionalidades já existentes que possam ter sido afetadas pela mudança.\n" +
                "$\\newline$( ) A execução manual de testes de regressão é inviável.\n" +
                "$\\newline$( ) Testes de regressão podem estar relacionados tanto a testes funcionais quanto a testes não funcionais.\n" +
                "$\\newline$A ordem correta de preenchimento dos parênteses, de cima para baixo, é:");
        questaoAlternativa53.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa53.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa53.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa53.setAlternativaCorreta("e");

        questaoAlternativa53.setAlternativasA("F – V – F.");
        questaoAlternativa53.setAlternativasB("V – V – V.");
        questaoAlternativa53.setAlternativasC("V – F – V.");
        questaoAlternativa53.setAlternativasD("F – F – F.");
        questaoAlternativa53.setAlternativasE("F – F – V.");
        questaoAlternativa53.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa54 = new QuestaoAlternativa();
        questaoAlternativa54.setId(INICIOQUESTAO.longValue());
        questaoAlternativa54.setAno(ANO);
        questaoAlternativa54.setDescricao("No modelo de referência ISO/OSI, quais são as subcamadas da camada de enlace?");
        questaoAlternativa54.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa54.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa54.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa54.setAlternativaCorreta("b");

        questaoAlternativa54.setAlternativasA("Controle de fluxo e controle de congestionamento.");
        questaoAlternativa54.setAlternativasB("Controle de enlace lógico e controle de acesso ao meio.");
        questaoAlternativa54.setAlternativasC("Multiplexação e enlace. ");
        questaoAlternativa54.setAlternativasD("Física e Rede");
        questaoAlternativa54.setAlternativasE("Transporte e apresentação.");
        questaoAlternativa54.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa55 = new QuestaoAlternativa();
        questaoAlternativa55.setId(INICIOQUESTAO.longValue());
        questaoAlternativa55.setAno(ANO);
        questaoAlternativa55.setDescricao("Em relação ao algoritmo ARIES para a recuperação após falha em sistemas de banco de dados, analise as assertivas abaixo e assinale V, se verdadeiras, ou F, se falsas.\n" +
                "$\\newline$( ) A aplicação da operação REDO é restrita a transações confirmadas.\n" +
                "$\\newline$( ) Uma abordagem steal/no-force é usada para as regras que governam quando uma página do cache do banco de dados pode ser gravada no disco.\n" +
                "$\\newline$( ) As operações UNDO são registradas no log, para evitar a repetição das operações UNDO completadas, se ocorrer uma falha durante o processo de recuperação.\n" +
                "$\\newline$( ) A Tabela de Transações contém uma entrada para cada página suja no cache, que inclui o identificador da página e o número de sequência de log da atualização mais antiga dessa página.\n" +
                "$\\newline$A ordem correta de preenchimento dos parênteses, de cima para baixo, é:");
        questaoAlternativa55.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa55.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa55.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa55.setAlternativaCorreta("a");

        questaoAlternativa55.setAlternativasA("F – V – V – F.");
        questaoAlternativa55.setAlternativasB("V – F – F – V.");
        questaoAlternativa55.setAlternativasC("F – V – F – V.");
        questaoAlternativa55.setAlternativasD("V – F – V – F");
        questaoAlternativa55.setAlternativasE("V – F – V – V.");
        questaoAlternativa55.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa56 = new QuestaoAlternativa();
        questaoAlternativa56.setId(INICIOQUESTAO.longValue());
        questaoAlternativa56.setAno(ANO);
        questaoAlternativa56.setDescricao("Analise as seguintes assertivas sobre padrões arquiteturais de software e assinale V, se verdadeiras, ou F, se falsas.\n" +
                "$\\newline$( ) Mesmo que um dado padrão arquitetural ofereça uma solução para o problema sendo resolvido, nem sempre ele é adequado. Fatores como contexto e o sistema de forças que afeta a solução fazem também parte do processo de avaliação e da escolha de padrões adequados.\n" +
                "$\\newline$( ) Padrão MVC é uma adaptação do padrão arquitetural Camadas. A Camada Visão lida com a apresentação e a manipulação da interface, a Camada Modelo organiza os objetos específicos da aplicação, e a Camada Controle posiciona-se entre estas duas com as regras do negócio.\n" +
                "$\\newline$( ) O padrão Broker é voltado a problemas de ambientes distribuídos. Sugere uma arquitetura na qual um componente (broker) estabelece uma mediação que permite um desacoplamento entre clientes e servidores.\n" +
                "$\\newline$A ordem correta de preenchimento dos parênteses, de cima para baixo, é:");
        questaoAlternativa56.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa56.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa56.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa56.setAlternativaCorreta("d");

        questaoAlternativa56.setAlternativasA("V – V – V.");
        questaoAlternativa56.setAlternativasB("F – F – V.\n");
        questaoAlternativa56.setAlternativasC("V – V – F.\n");
        questaoAlternativa56.setAlternativasD("V – F – V.");
        questaoAlternativa56.setAlternativasE("F – V – F.\n");
        questaoAlternativa56.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa57 = new QuestaoAlternativa();
        questaoAlternativa57.setId(INICIOQUESTAO.longValue());
        questaoAlternativa57.setAno(ANO);
        questaoAlternativa57.setDescricao("Considerando um sistema de coordenadas no espaço, em uma orientação\n" +
                "previamente definida, e sabendo que são conhecidos os vetores (ortogonais entre si) correspondentes aos eixos X e Y, qual é o nome da operação que é capaz de produzir o vetor correspondente ao eixo Z desse sistema – isto é, perpendicular aos outros dois?\n");
        questaoAlternativa57.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa57.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa57.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa57.setAlternativaCorreta("b");

        questaoAlternativa57.setAlternativasA("Produto escalar.");
        questaoAlternativa57.setAlternativasB("Produto vetorial.\n");
        questaoAlternativa57.setAlternativasC("Normalização.");
        questaoAlternativa57.setAlternativasD("Translação.");
        questaoAlternativa57.setAlternativasE("Projeção.");
        questaoAlternativa57.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa58 = new QuestaoAlternativa();
        questaoAlternativa58.setId(INICIOQUESTAO.longValue());
        questaoAlternativa58.setAno(ANO);
        questaoAlternativa58.setDescricao("Como se denomina uma fonte de luz que esteja a uma distância infinita de uma cena, gerando uma iluminação similar à da luz do Sol?");
        questaoAlternativa58.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa58.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa58.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa58.setAlternativaCorreta("c");

        questaoAlternativa58.setAlternativasA("Pontual.");
        questaoAlternativa58.setAlternativasB("Ambiente.");
        questaoAlternativa58.setAlternativasC("Direcional.\n");
        questaoAlternativa58.setAlternativasD("Spot.");
        questaoAlternativa58.setAlternativasE("Difusa.");
        questaoAlternativa58.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa59 = new QuestaoAlternativa();
        questaoAlternativa59.setId(INICIOQUESTAO.longValue());
        questaoAlternativa59.setAno(ANO);
        questaoAlternativa59.setDescricao("A realização da equalização do histograma de uma imagem resulta em obter:");
        questaoAlternativa59.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa59.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa59.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa59.setAlternativaCorreta("e");

        questaoAlternativa59.setAlternativasA("O realce mínimo de detalhes.");
        questaoAlternativa59.setAlternativasB("Uma transformação de domínio de cores");
        questaoAlternativa59.setAlternativasC("A maior compressibilidade da informação.");
        questaoAlternativa59.setAlternativasD("A menor discriminabilidade dos objetos.");
        questaoAlternativa59.setAlternativasE("A máxima variância do histograma.");
        questaoAlternativa59.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa60 = new QuestaoAlternativa();
        questaoAlternativa60.setId(INICIOQUESTAO.longValue());
        questaoAlternativa60.setAno(ANO);
        questaoAlternativa60.setDescricao("Uma rede conectada à Internet possui a máscara de sub-rede 255.255.255.0. Qual o número máximo de computadores que a rede suporta?");
        questaoAlternativa60.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa60.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa60.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa60.setAlternativaCorreta("c");

        questaoAlternativa60.setAlternativasA("126.");
        questaoAlternativa60.setAlternativasB("128.");
        questaoAlternativa60.setAlternativasC("254.");
        questaoAlternativa60.setAlternativasD("256.");
        questaoAlternativa60.setAlternativasE("65.534.");
        questaoAlternativa60.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa61 = new QuestaoAlternativa();
        questaoAlternativa61.setId(INICIOQUESTAO.longValue());
        questaoAlternativa61.setAno(ANO);
        questaoAlternativa61.setDescricao("Sobre visão computacional estéreo, é correto afirmar que:\n");
        questaoAlternativa61.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa61.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa61.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa61.setAlternativaCorreta("b");

        questaoAlternativa61.setAlternativasA("Trata-se de uma subárea que tem como objetivo reconhecer imagens similares.\n");
        questaoAlternativa61.setAlternativasB("Capta-se cenas a partir de dois referenciais diferentes para se obter um mapa de disparidade.");
        questaoAlternativa61.setAlternativasC("Avalia-se o deslocamento entre objetos para se calcular a dispersão.\n");
        questaoAlternativa61.setAlternativasD("Tem por objetivo final subdividir as imagens.");
        questaoAlternativa61.setAlternativasE("Um dos seus subproblemas consiste em desconstruir as imagens em apenas uma.");
        questaoAlternativa61.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa62 = new QuestaoAlternativa();
        questaoAlternativa62.setId(INICIOQUESTAO.longValue());
        questaoAlternativa62.setAno(ANO);
        questaoAlternativa62.setDescricao("Sobre transparência em sistemas distribuídos, é correto afirmar que:");
        questaoAlternativa62.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa62.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa62.setDisciplina(EDisciplina.SISTEMAS_DISTRIBUIDOS);
        questaoAlternativa62.setAlternativaCorreta("c");

        questaoAlternativa62.setAlternativasA("Transparência de concorrência trata de ocultar diferenças em representações de dados e do modo como os recursos podem ser acessados pelos usuários.");
        questaoAlternativa62.setAlternativasB("Transparência de migração é a situação na qual recursos podem ser relocados enquanto estão sendo acessados, sem que o usuário ou a aplicação percebam.");
        questaoAlternativa62.setAlternativasC("Transparência de replicação oculta o fato de que existem várias cópias do recurso.");
        questaoAlternativa62.setAlternativasD("Na transparência de relocação, recursos podem ser movimentados sem afetar o modo como podem\n" +
                "ser acessados. ");
        questaoAlternativa62.setAlternativasE("Transparência de acesso refere-se ao fato de que os usuários não podem dizer qual é a localização\n" +
                "física de um recurso no sistema.");
        questaoAlternativa62.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa63 = new QuestaoAlternativa();
        questaoAlternativa63.setId(INICIOQUESTAO.longValue());
        questaoAlternativa63.setAno(ANO);
        questaoAlternativa63.setDescricao("Considere o esquema de tradução dirigida pela sintaxe apresentado na figura abaixo, no qual as produções da gramática foram numeradas.\n" +
                "Assinale a alternativa correta sobre o esquema.");
        questaoAlternativa63.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa63.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa63.setDisciplina(EDisciplina.COMPILADORES);
        questaoAlternativa63.setAlternativaCorreta("a");
        questaoAlternativa63.setImagem(true);
        questaoAlternativa63.setAlternativasA("Na produção 4, T.val e F.val são sintetizados.\n");
        questaoAlternativa63.setAlternativasB("Na produção 4, T1.val é herdado.\n");
        questaoAlternativa63.setAlternativasC("Na produção 5, T.val e F.val são herdados.");
        questaoAlternativa63.setAlternativasD("Na produção 2, E.val é sintetizado e T.val é herdado.");
        questaoAlternativa63.setAlternativasE("Na produção 2, E1.val é sintetizado e T.val é herdado.");
        questaoAlternativa63.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa63.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa64 = new QuestaoAlternativa();
        questaoAlternativa64.setId(INICIOQUESTAO.longValue());
        questaoAlternativa64.setAno(ANO);
        questaoAlternativa64.setDescricao("Uma transação, em sistemas distribuídos, pode ser construída com base em uma quantidade de subtransações. A transação do nível mais alto pode se ramificar e gerar “filhos”, que são executados em paralelo, em máquinas diferentes, para obter ganho de desempenho ou simplificar a programação. Esse é um exemplo de:");
        questaoAlternativa64.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa64.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa64.setDisciplina(EDisciplina.SISTEMAS_DISTRIBUIDOS);
        questaoAlternativa64.setAlternativaCorreta("a");

        questaoAlternativa64.setAlternativasA("Transação aninhada.");
        questaoAlternativa64.setAlternativasB("Isolamento.");
        questaoAlternativa64.setAlternativasC("Transação isolada.");
        questaoAlternativa64.setAlternativasD("Transação atômica.");
        questaoAlternativa64.setAlternativasE("Durabilidade.");
        questaoAlternativa64.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa65 = new QuestaoAlternativa();
        questaoAlternativa65.setId(INICIOQUESTAO.longValue());
        questaoAlternativa65.setAno(ANO);
        questaoAlternativa65.setDescricao(" Em relação às características do protocolo TCP, analise assertivas abaixo:\n" +
                "$\\newline$I. Confirma as mensagens que já foram entregues.\n" +
                "$\\newline$II. É opcional que ele faça controle de congestionamento.\n" +
                "$\\newline$III. Entrega as mensagens em ordem.\n" +
                "$\\newline$IV. É half-duplex.\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa65.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa65.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa65.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa65.setAlternativaCorreta("a");

        questaoAlternativa65.setAlternativasA("Apenas I e III.");
        questaoAlternativa65.setAlternativasB("Apenas II e IV.");
        questaoAlternativa65.setAlternativasC("Apenas I, II e III");
        questaoAlternativa65.setAlternativasD("Apenas II, III e IV.");
        questaoAlternativa65.setAlternativasE("I, II, III e IV.");
        questaoAlternativa65.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa66 = new QuestaoAlternativa();
        questaoAlternativa66.setId(INICIOQUESTAO.longValue());
        questaoAlternativa66.setAno(ANO);
        questaoAlternativa66.setDescricao("O processamento de linguagem natural pode ser entendido como uma subárea da inteligência artificial que estuda a compreensão automática de línguas naturais. Nesse contexto, podese afirmar que as seguintes tarefas são utilizadas em problemas de processamento de linguagem natural:");
        questaoAlternativa66.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa66.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa66.setDisciplina(EDisciplina.COMPILADORES);
        questaoAlternativa66.setAlternativaCorreta("c");

        questaoAlternativa66.setAlternativasA("Stopwords e segmentação semântica.");
        questaoAlternativa66.setAlternativasB("Quantização e Part-of-Speech.");
        questaoAlternativa66.setAlternativasC("Extração de entidades e tokenização.");
        questaoAlternativa66.setAlternativasD("Bigramas e memórias recorrentes.\n");
        questaoAlternativa66.setAlternativasE("Espectrogramas e realce.");
        questaoAlternativa66.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa67 = new QuestaoAlternativa();
        questaoAlternativa67.setId(INICIOQUESTAO.longValue());
        questaoAlternativa67.setAno(ANO);
        questaoAlternativa67.setDescricao("Processos, em um sistema distribuído, são divididos em dois grupos, com possível sobreposição. Um servidor é um processo que implementa um serviço específico. Um cliente é um processo que requisita um serviço de um servidor enviando-lhe uma requisição e, na sequência, esperando pela resposta do servidor. Esse é um exemplo de arquitetura:");
        questaoAlternativa67.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa67.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa67.setDisciplina(EDisciplina.SISTEMAS_DISTRIBUIDOS);
        questaoAlternativa67.setAlternativaCorreta("e");

        questaoAlternativa67.setAlternativasA("Multidividida. ");
        questaoAlternativa67.setAlternativasB("Peer-to-peer estruturada.");
        questaoAlternativa67.setAlternativasC("Descentralizada.");
        questaoAlternativa67.setAlternativasD("Peer-to-peer não estruturada.\n");
        questaoAlternativa67.setAlternativasE("Centralizada.");
        questaoAlternativa67.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa68 = new QuestaoAlternativa();
        questaoAlternativa68.setId(INICIOQUESTAO.longValue());
        questaoAlternativa68.setAno(ANO);
        questaoAlternativa68.setDescricao("Assinale a alternativa que apresenta a quantidade mínima de registradores\n" +
                "necessários para se fazer a alocação no código apresentado abaixo:\n" +
                "$\\newline$t1 := a – mem[...]\n" +
                "$\\newline$t2 := d / mem[...]\n" +
                "$\\newline$t3 := t2 + mem[...]\n" +
                "$\\newline$t4 := t1 + t3");
        questaoAlternativa68.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa68.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa68.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa68.setAlternativaCorreta("e");

        questaoAlternativa68.setAlternativasA("6");
        questaoAlternativa68.setAlternativasB("5");
        questaoAlternativa68.setAlternativasC("4");
        questaoAlternativa68.setAlternativasD("3");
        questaoAlternativa68.setAlternativasE("2");
        questaoAlternativa68.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa69 = new QuestaoAlternativa();
        questaoAlternativa69.setId(INICIOQUESTAO.longValue());
        questaoAlternativa69.setAno(ANO);
        questaoAlternativa69.setDescricao("Sobre a regra de Bayes, é correto afirmar que:\n");
        questaoAlternativa69.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa69.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa69.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa69.setAlternativaCorreta("c");

        questaoAlternativa69.setAlternativasA("Trata-se de uma ampliação do conceito de busca probabilística.");
        questaoAlternativa69.setAlternativasB("Refere-se a uma regra lógico-indutiva.");
        questaoAlternativa69.setAlternativasC("Utiliza a probabilidade de um evento a partir do conhecimento a priori.");
        questaoAlternativa69.setAlternativasD("Associa-se à probabilidade de que não deve estar relacionada ao evento.");
        questaoAlternativa69.setAlternativasE("Descreve a precisão de eventos medindo a proporção dos resultados.");
        questaoAlternativa69.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa70 = new QuestaoAlternativa();
        questaoAlternativa70.setId(INICIOQUESTAO.longValue());
        questaoAlternativa70.setAno(ANO);
        questaoAlternativa70.setDescricao("Considerando a gerência de projetos de software, analise as assertivas abaixo e\n" +
                "assinale V, se verdadeiras, ou F, se falsas.\n" +
                "$\\newline$( ) A gerência efetiva de projetos de software deve abranger três aspectos, a saber, produto, processo e projeto.\n" +
                "$\\newline$( ) A análise de risco de um projeto visa a analisar a viabilidade de produzir software dentro do custo e esforço estimados.\n" +
                "$\\newline$( ) O desenvolvimento de cronogramas de projetos pode ser desenvolvido com o auxílio de modelos como PERT (Program evaluation and review technique) ou CPM (Critical Path Method).\n" +
                "$\\newline$A ordem correta de preenchimento dos parênteses, de cima para baixo, é:");
        questaoAlternativa70.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa70.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa70.setDisciplina(EDisciplina.GERENCIA_DE_PROJETOS);
        questaoAlternativa70.setAlternativaCorreta("d");

        questaoAlternativa70.setAlternativasA("V – V – V.");
        questaoAlternativa70.setAlternativasB("V – F – V.");
        questaoAlternativa70.setAlternativasC("F – F – F.");
        questaoAlternativa70.setAlternativasD("F – F – V.");
        questaoAlternativa70.setAlternativasE("V – V – F.");
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
