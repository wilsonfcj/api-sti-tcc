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
        questaoAlternativa1.setDescricao("Seja uma matriz quadrada de terceira ordem $A = \\\\left(\\\\begin{array}{c}2 & 3 & 5\\\\\\\\ 7 & 11 & 13\\\\\\\\ 17 & 19 & 23\\\\end{array}\\\\right)$, calcule o determinante:");
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
        questaoAlternativa2.setDescricao("Seja $E = \\\\mathbb{R}^{3}$.Os vetores {(1, 2, 3), (2, 5, 8), (1, 3, 7)} são independentes?");
        questaoAlternativa2.setArea(EArea.MATEMATICA);
        questaoAlternativa2.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa2.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa2.setAlternativaCorreta("b");

        questaoAlternativa2.setAlternativasA("Não.");
        questaoAlternativa2.setAlternativasB("Sim.");
        questaoAlternativa2.setAlternativasC("Não pode ser calculado.");
        questaoAlternativa2.setAlternativasD("Sim, se fosse um espaço de $\\\\mathbb{R}^{2}$.");
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

        questaoAlternativa4.setAlternativasA("$C \\\\left(\\\\frac{1}{2},\\\\frac{1}{2}\\\\right)$");
        questaoAlternativa4.setAlternativasB("$C \\\\left(\\\\frac{-1}{2},\\\\frac{3}{2}\\\\right)$");
        questaoAlternativa4.setAlternativasC("$C \\\\left(\\\\frac{3}{2},\\\\frac{1}{2}\\\\right)$");
        questaoAlternativa4.setAlternativasD("$C \\\\left(\\\\frac{5}{2},\\\\frac{5}{2}\\\\right)$");
        questaoAlternativa4.setAlternativasE("$C \\\\left(\\\\frac{3}{2},\\\\frac{-5}{2}\\\\right)$");
        questaoAlternativa4.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa5 = new QuestaoAlternativa();
        questaoAlternativa5.setId(INICIOQUESTAO.longValue());
        questaoAlternativa5.setAno(ANO);
        questaoAlternativa5.setDescricao("Calcule o $\\\\lim_{x \\\\rightarrow 2}\\\\frac{x^{3}-8}{6x^{2}-3x^{3}}$.");
        questaoAlternativa5.setArea(EArea.MATEMATICA);
        questaoAlternativa5.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa5.setDisciplina(EDisciplina.CALCULO);
        questaoAlternativa5.setAlternativaCorreta("e");

        questaoAlternativa5.setAlternativasA("-2");
        questaoAlternativa5.setAlternativasB("$\\\\infty$");
        questaoAlternativa5.setAlternativasC("0");
        questaoAlternativa5.setAlternativasD("1");
        questaoAlternativa5.setAlternativasE("-1");
        questaoAlternativa5.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa6 = new QuestaoAlternativa();
        questaoAlternativa6.setId(INICIOQUESTAO.longValue());
        questaoAlternativa6.setAno(ANO);
        questaoAlternativa6.setDescricao("Para quais valores de a e b, f(x) é contínua em x = 1 e x = 4. $f(x) = \\\\begin{cases}x\\\\,\\\\,\\\\,se\\\\,\\\\,\\\\, x\\\\leq1\\\\\\\\ax+b\\\\,\\\\,\\\\,se\\\\,\\\\,\\\\,1 < x < 4 \\\\\\\\ -2x\\\\,\\\\,\\\\,\\\\,se\\\\,\\\\,\\\\,4\\\\leq x\\\\end{cases}$");
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
        questaoAlternativa7.setDescricao("Determine a matriz inversa de $A = \\\\left(\\\\begin{array}{c}1 & 2 & 2\\\\\\\\2 & 1 & 2 \\\\\\\\ 2 & 2 & 1\\\\end{array}\\\\right)$.");
        questaoAlternativa7.setArea(EArea.MATEMATICA);
        questaoAlternativa7.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa7.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa7.setAlternativaCorreta("d");

        questaoAlternativa7.setAlternativasA("$A^{-1}=\\\\frac{1}{5}\\\\left(\\\\begin{array}{c}1 & 7 & -1\\\\\\\\ 7 & 1 & 1\\\\\\\\ 1 & 3 & 1\\\\end{array}\\\\right)$");
        questaoAlternativa7.setAlternativasB("$A^{-1}=\\\\frac{1}{5}\\\\left(\\\\begin{array}{c}1 & 0 & -2\\\\\\\\ 5 & 1 & 0\\\\\\\\ 0 & 1 & 1\\\\end{array}\\\\right)$");
        questaoAlternativa7.setAlternativasC("$A^{-1}=\\\\frac{5}{1}\\\\left(\\\\begin{array}{c}0 & -1 & 1\\\\\\\\ -7 & 3 & 4\\\\\\\\ 7 & 1 & -1\\\\end{array}\\\\right)$");
        questaoAlternativa7.setAlternativasD("$A^{-1}=\\\\frac{1}{5}\\\\left(\\\\begin{array}{c}-3 & 2 & 2\\\\\\\\ 2 & -3 & 2\\\\\\\\ 2 & 2 & -3\\\\end{array}\\\\right)$");
        questaoAlternativa7.setAlternativasE("$A^{-1}=\\\\frac{1}{5}\\\\left(\\\\begin{array}{c}1 & 3 & -3\\\\\\\\ 5 & 3 & 1\\\\\\\\ 1 & 3 & -3\\\\end{array}\\\\right)$");
        questaoAlternativa7.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa8 = new QuestaoAlternativa();
        questaoAlternativa8.setId(INICIOQUESTAO.longValue());
        questaoAlternativa8.setAno(ANO);
        questaoAlternativa8.setDescricao(
                "Encontre as coordenadas retangulares do ponto (P), cujas coordenadas polares\n" +
                        "são $(3,120^{\\\\circ},120^{\\\\circ},135^{\\\\circ})$.\n" +
                        "$\\newline x = r* cos\\\\,\\\\alpha$\n" +
                        "$\\newline y = r* cos\\\\,\\\\beta$\n" +
                        "$\\newline z = r* cos\\\\,\\\\gamma$");
        questaoAlternativa8.setArea(EArea.MATEMATICA);
        questaoAlternativa8.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa8.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa8.setAlternativaCorreta("a");

        questaoAlternativa8.setAlternativasA("P$\\\\left(\\\\frac{-3}{2},\\\\frac{-3}{2},\\\\frac{-3\\\\sqrt{2}}{2}\\\\right)$");
        questaoAlternativa8.setAlternativasB("P$\\\\left(\\\\frac{1}{2},\\\\frac{1}{2},\\\\frac{\\\\sqrt{2}}{2}\\\\right)$");
        questaoAlternativa8.setAlternativasC("P$\\\\left(\\\\frac{-1}{2},\\\\frac{-1}{2},\\\\sqrt{2}\\\\right)$");
        questaoAlternativa8.setAlternativasD("$\\\\left(\\\\frac{3}{2},\\\\frac{3}{2},\\\\frac{1}{2}\\\\right)$");
        questaoAlternativa8.setAlternativasE("P$\\\\left(\\\\frac{-1}{2},\\\\frac{-3}{2},\\\\frac{\\\\sqrt{2}}{2}\\\\right)$");
        questaoAlternativa8.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa9 = new QuestaoAlternativa();
        questaoAlternativa9.setId(INICIOQUESTAO.longValue());
        questaoAlternativa9.setAno(ANO);
        questaoAlternativa9.setDescricao("Simplifique, com a ajuda dos Mapas de Karnaugh, a função cuja expressão em termos canônicos é: $f(x,y,z)=\\\\sum m(2,3,4,5,6,7)$");
        questaoAlternativa9.setArea(EArea.MATEMATICA);
        questaoAlternativa9.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa9.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa9.setAlternativaCorreta("a");

        questaoAlternativa9.setAlternativasA("$f(X,Y,Z)=X+Y$");
        questaoAlternativa9.setAlternativasB("$f(X,Y,Z)=X+Y+Z$");
        questaoAlternativa9.setAlternativasC("$f(X,Y,Z)=\\\\overline{X}+Y$");
        questaoAlternativa9.setAlternativasD("$f(X,Y,Z)=XY+Y$");
        questaoAlternativa9.setAlternativasE("$f(X,Y,Z)=X+Y+\\\\overline{Z}$");
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
        questaoAlternativa14.setDescricao("Resolva a identidade $\\\\overline{\\\\overline{C}\\\\cdot (\\\\overline{D} + \\\\overline{E})}$ , aplicando, se necessário, as leis de álgebra de Boole. ");
        questaoAlternativa14.setArea(EArea.MATEMATICA);
        questaoAlternativa14.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa14.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa14.setAlternativaCorreta("e");

        questaoAlternativa14.setAlternativasA("$\\\\overline{C}+ (D \\\\cdot E)$");
        questaoAlternativa14.setAlternativasB("$\\\\overline{C}+ (C + E)$");
        questaoAlternativa14.setAlternativasC("$C+ (\\\\overline{C} \\\\cdot \\\\overline{E})$");
        questaoAlternativa14.setAlternativasD("$\\\\overline{C} \\\\cdot (D \\\\cdot E)$");
        questaoAlternativa14.setAlternativasE("$(C+D)\\\\cdot(C+E)$");
        questaoAlternativa14.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa15 = new QuestaoAlternativa();
        questaoAlternativa15.setId(INICIOQUESTAO.longValue());
        questaoAlternativa15.setAno(ANO);
        questaoAlternativa15.setDescricao("A expressão lógica $\\\\sim q\\\\rightarrow\\\\sim p$ é equivalente a:");
        questaoAlternativa15.setArea(EArea.MATEMATICA);
        questaoAlternativa15.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa15.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa15.setAlternativaCorreta("b");

        questaoAlternativa15.setAlternativasA("$\\\\sim p \\\\,\\\\wedge \\\\sim q $");
        questaoAlternativa15.setAlternativasB("$\\\\sim p \\\\,\\\\vee q $");
        questaoAlternativa15.setAlternativasC("$\\\\sim p \\\\rightarrow q $");
        questaoAlternativa15.setAlternativasD("$p \\\\rightarrow \\\\sim q $");
        questaoAlternativa15.setAlternativasE("$q \\\\rightarrow p $");
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
        questaoAlternativa18.setDescricao("Encontre a média ($\\\\mu$) e o desvio padrão ($\\\\sigma$) da distribuição:\n");
        questaoAlternativa18.setArea(EArea.MATEMATICA);
        questaoAlternativa18.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa18.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa18.setAlternativaCorreta("a");
        questaoAlternativa18.setImagem(true);
        questaoAlternativa18.setAlternativasA("$\\\\mu = 4,0;\\\\sigma = 2,24$");
        questaoAlternativa18.setAlternativasB("$\\\\mu = 4,0;\\\\sigma = 5,00$");
        questaoAlternativa18.setAlternativasC("$\\\\mu = 5,0;\\\\sigma = 25,00$");
        questaoAlternativa18.setAlternativasD("$\\\\mu = 3,0;\\\\sigma = 4,0$");
        questaoAlternativa18.setAlternativasE("$\\\\mu = 4,0;\\\\sigma = 21,0$");
        questaoAlternativa18.setImagemQuestao("data:image/png;base64,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");
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

        questaoAlternativa21.setAlternativasA("$\\\\theta(n^{log_{4}3}),\\\\theta(n^{2})\\\\theta(n\\\\,\\\\,log\\\\,\\\\,n)$");
        questaoAlternativa21.setAlternativasB("$\\\\theta\\\\left(\\\\frac{n}{4}\\\\right),\\\\theta\\\\left(\\\\frac{n}{2}\\\\right)\\\\theta\\\\left(\\\\frac{n}{3}\\\\right)$");
        questaoAlternativa21.setAlternativasC("$\\\\theta(1),\\\\theta(n^{2})\\\\theta(n)$");
        questaoAlternativa21.setAlternativasD("$\\\\theta(n^{4}),\\\\theta(n^{2})\\\\theta(n^{3})$");
        questaoAlternativa21.setAlternativasE("$\\\\theta(n^{log_{4}3}),\\\\theta(n^{log_{2}3})\\\\theta(n^{log_{3}3})$");
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
        questaoAlternativa22.setAlternativasB("$f(n) = \\\\Omega(g(n));g(n) = O(h(n))$");
        questaoAlternativa22.setAlternativasC("$g(n) = O(f(n));h(n) = O(f(n))$");
        questaoAlternativa22.setAlternativasD("$h(n) = O(f(n));g(n) = \\\\Omega(f(n))$");
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

        questaoAlternativa25.setAlternativasA("$\\\\theta(n)$");
        questaoAlternativa25.setAlternativasB("$\\\\theta(n\\\\,\\\\,log\\\\,\\\\,n)$");
        questaoAlternativa25.setAlternativasC("$\\\\theta(log\\\\,\\\\,n)$");
        questaoAlternativa25.setAlternativasD("$\\\\theta(n^{2})$");
        questaoAlternativa25.setAlternativasE("$\\\\theta(n^{2}log\\\\,\\\\,n)$");
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
        //FIXME CONTINUAR A PARTIR DAQUI
        QuestaoAlternativa questaoAlternativa36 = new QuestaoAlternativa();
        questaoAlternativa36.setId(INICIOQUESTAO.longValue());
        questaoAlternativa36.setAno(ANO);
        questaoAlternativa36.setDescricao("");
        questaoAlternativa36.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa36.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa36.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa36.setAlternativaCorreta("e");

        questaoAlternativa36.setAlternativasA("");
        questaoAlternativa36.setAlternativasB("");
        questaoAlternativa36.setAlternativasC("");
        questaoAlternativa36.setAlternativasD("");
        questaoAlternativa36.setAlternativasE("");
        questaoAlternativa36.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa37 = new QuestaoAlternativa();
        questaoAlternativa37.setId(INICIOQUESTAO.longValue());
        questaoAlternativa37.setAno(ANO);
        questaoAlternativa37.setDescricao("");
        questaoAlternativa37.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa37.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa37.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa37.setAlternativaCorreta("e");

        questaoAlternativa37.setAlternativasA("");
        questaoAlternativa37.setAlternativasB("");
        questaoAlternativa37.setAlternativasC("");
        questaoAlternativa37.setAlternativasD("");
        questaoAlternativa37.setAlternativasE("");
        questaoAlternativa37.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa38 = new QuestaoAlternativa();
        questaoAlternativa38.setId(INICIOQUESTAO.longValue());
        questaoAlternativa38.setAno(ANO);
        questaoAlternativa38.setDescricao("");
        questaoAlternativa38.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa38.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa38.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa38.setAlternativaCorreta("d");

        questaoAlternativa38.setAlternativasA("");
        questaoAlternativa38.setAlternativasB("");
        questaoAlternativa38.setAlternativasC("");
        questaoAlternativa38.setAlternativasD("");
        questaoAlternativa38.setAlternativasE("");
        questaoAlternativa38.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa39 = new QuestaoAlternativa();
        questaoAlternativa39.setId(INICIOQUESTAO.longValue());
        questaoAlternativa39.setAno(ANO);
        questaoAlternativa39.setDescricao("");
        questaoAlternativa39.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa39.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa39.setDisciplina(EDisciplina.GRAFOS);
        questaoAlternativa39.setAlternativaCorreta("c");

        questaoAlternativa39.setAlternativasA("");
        questaoAlternativa39.setAlternativasB("");
        questaoAlternativa39.setAlternativasC("");
        questaoAlternativa39.setAlternativasD("");
        questaoAlternativa39.setAlternativasE("");
        questaoAlternativa39.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa40 = new QuestaoAlternativa();
        questaoAlternativa40.setId(INICIOQUESTAO.longValue());
        questaoAlternativa40.setAno(ANO);
        questaoAlternativa40.setDescricao("");
        questaoAlternativa40.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa40.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa40.setDisciplina(EDisciplina.GRAFOS);
        questaoAlternativa40.setAlternativaCorreta("c");

        questaoAlternativa40.setAlternativasA("");
        questaoAlternativa40.setAlternativasB("");
        questaoAlternativa40.setAlternativasC("");
        questaoAlternativa40.setAlternativasD("");
        questaoAlternativa40.setAlternativasE("");
        questaoAlternativa40.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa41 = new QuestaoAlternativa();
        questaoAlternativa41.setId(INICIOQUESTAO.longValue());
        questaoAlternativa41.setAno(ANO);
        questaoAlternativa41.setDescricao("");
        questaoAlternativa41.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa41.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa41.setDisciplina(EDisciplina.GRAFOS);
        questaoAlternativa41.setAlternativaCorreta("c");

        questaoAlternativa41.setAlternativasA("");
        questaoAlternativa41.setAlternativasB("");
        questaoAlternativa41.setAlternativasC("");
        questaoAlternativa41.setAlternativasD("");
        questaoAlternativa41.setAlternativasE("");
        questaoAlternativa41.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa42 = new QuestaoAlternativa();
        questaoAlternativa42.setId(INICIOQUESTAO.longValue());
        questaoAlternativa42.setAno(ANO);
        questaoAlternativa42.setDescricao("");
        questaoAlternativa42.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa42.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa42.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa42.setAlternativaCorreta("d");

        questaoAlternativa42.setAlternativasA("");
        questaoAlternativa42.setAlternativasB("");
        questaoAlternativa42.setAlternativasC("");
        questaoAlternativa42.setAlternativasD("");
        questaoAlternativa42.setAlternativasE("");
        questaoAlternativa42.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa43 = new QuestaoAlternativa();
        questaoAlternativa43.setId(INICIOQUESTAO.longValue());
        questaoAlternativa43.setAno(ANO);
        questaoAlternativa43.setDescricao("");
        questaoAlternativa43.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa43.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa43.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa43.setAlternativaCorreta("b");

        questaoAlternativa43.setAlternativasA("");
        questaoAlternativa43.setAlternativasB("");
        questaoAlternativa43.setAlternativasC("");
        questaoAlternativa43.setAlternativasD("");
        questaoAlternativa43.setAlternativasE("");
        questaoAlternativa43.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa44 = new QuestaoAlternativa();
        questaoAlternativa44.setId(INICIOQUESTAO.longValue());
        questaoAlternativa44.setAno(ANO);
        questaoAlternativa44.setDescricao("");
        questaoAlternativa44.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa44.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa44.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa44.setAlternativaCorreta("e");

        questaoAlternativa44.setAlternativasA("");
        questaoAlternativa44.setAlternativasB("");
        questaoAlternativa44.setAlternativasC("");
        questaoAlternativa44.setAlternativasD("");
        questaoAlternativa44.setAlternativasE("");
        questaoAlternativa44.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa45 = new QuestaoAlternativa();
        questaoAlternativa45.setId(INICIOQUESTAO.longValue());
        questaoAlternativa45.setAno(ANO);
        questaoAlternativa45.setDescricao("");
        questaoAlternativa45.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa45.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa45.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa45.setAlternativaCorreta("a");

        questaoAlternativa45.setAlternativasA("");
        questaoAlternativa45.setAlternativasB("");
        questaoAlternativa45.setAlternativasC("");
        questaoAlternativa45.setAlternativasD("");
        questaoAlternativa45.setAlternativasE("");
        questaoAlternativa45.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa46 = new QuestaoAlternativa();
        questaoAlternativa46.setId(INICIOQUESTAO.longValue());
        questaoAlternativa46.setAno(ANO);
        questaoAlternativa46.setDescricao("");
        questaoAlternativa46.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa46.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa46.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa46.setAlternativaCorreta("a");

        questaoAlternativa46.setAlternativasA("");
        questaoAlternativa46.setAlternativasB("");
        questaoAlternativa46.setAlternativasC("");
        questaoAlternativa46.setAlternativasD("");
        questaoAlternativa46.setAlternativasE("");
        questaoAlternativa46.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa47 = new QuestaoAlternativa();
        questaoAlternativa47.setId(INICIOQUESTAO.longValue());
        questaoAlternativa47.setAno(ANO);
        questaoAlternativa47.setDescricao("");
        questaoAlternativa47.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa47.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa47.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa47.setAlternativaCorreta("d");

        questaoAlternativa47.setAlternativasA("");
        questaoAlternativa47.setAlternativasB("");
        questaoAlternativa47.setAlternativasC("");
        questaoAlternativa47.setAlternativasD("");
        questaoAlternativa47.setAlternativasE("");
        questaoAlternativa47.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa48 = new QuestaoAlternativa();
        questaoAlternativa48.setId(INICIOQUESTAO.longValue());
        questaoAlternativa48.setAno(ANO);
        questaoAlternativa48.setDescricao("");
        questaoAlternativa48.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa48.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa48.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa48.setAlternativaCorreta("b");

        questaoAlternativa48.setAlternativasA("");
        questaoAlternativa48.setAlternativasB("");
        questaoAlternativa48.setAlternativasC("");
        questaoAlternativa48.setAlternativasD("");
        questaoAlternativa48.setAlternativasE("");
        questaoAlternativa48.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa49 = new QuestaoAlternativa();
        questaoAlternativa49.setId(INICIOQUESTAO.longValue());
        questaoAlternativa49.setAno(ANO);
        questaoAlternativa49.setDescricao("");
        questaoAlternativa49.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa49.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa49.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa49.setAlternativaCorreta("e");

        questaoAlternativa49.setAlternativasA("");
        questaoAlternativa49.setAlternativasB("");
        questaoAlternativa49.setAlternativasC("");
        questaoAlternativa49.setAlternativasD("");
        questaoAlternativa49.setAlternativasE("");
        questaoAlternativa49.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa50 = new QuestaoAlternativa();
        questaoAlternativa50.setId(INICIOQUESTAO.longValue());
        questaoAlternativa50.setAno(ANO);
        questaoAlternativa50.setDescricao("");
        questaoAlternativa50.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa50.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa50.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa50.setAlternativaCorreta("a");

        questaoAlternativa50.setAlternativasA("");
        questaoAlternativa50.setAlternativasB("");
        questaoAlternativa50.setAlternativasC("");
        questaoAlternativa50.setAlternativasD("");
        questaoAlternativa50.setAlternativasE("");
        questaoAlternativa50.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa51 = new QuestaoAlternativa();
        questaoAlternativa51.setId(INICIOQUESTAO.longValue());
        questaoAlternativa51.setAno(ANO);
        questaoAlternativa51.setDescricao("");
        questaoAlternativa51.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa51.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa51.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa51.setAlternativaCorreta("c");

        questaoAlternativa51.setAlternativasA("");
        questaoAlternativa51.setAlternativasB("");
        questaoAlternativa51.setAlternativasC("");
        questaoAlternativa51.setAlternativasD("");
        questaoAlternativa51.setAlternativasE("");
        questaoAlternativa51.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa52 = new QuestaoAlternativa();
        questaoAlternativa52.setId(INICIOQUESTAO.longValue());
        questaoAlternativa52.setAno(ANO);
        questaoAlternativa52.setDescricao("");
        questaoAlternativa52.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa52.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa52.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa52.setAlternativaCorreta("b");

        questaoAlternativa52.setAlternativasA("");
        questaoAlternativa52.setAlternativasB("");
        questaoAlternativa52.setAlternativasC("");
        questaoAlternativa52.setAlternativasD("");
        questaoAlternativa52.setAlternativasE("");
        questaoAlternativa52.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa53 = new QuestaoAlternativa();
        questaoAlternativa53.setId(INICIOQUESTAO.longValue());
        questaoAlternativa53.setAno(ANO);
        questaoAlternativa53.setDescricao("");
        questaoAlternativa53.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa53.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa53.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa53.setAlternativaCorreta("b");

        questaoAlternativa53.setAlternativasA("");
        questaoAlternativa53.setAlternativasB("");
        questaoAlternativa53.setAlternativasC("");
        questaoAlternativa53.setAlternativasD("");
        questaoAlternativa53.setAlternativasE("");
        questaoAlternativa53.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa54 = new QuestaoAlternativa();
        questaoAlternativa54.setId(INICIOQUESTAO.longValue());
        questaoAlternativa54.setAno(ANO);
        questaoAlternativa54.setDescricao("");
        questaoAlternativa54.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa54.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa54.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa54.setAlternativaCorreta("c");

        questaoAlternativa54.setAlternativasA("");
        questaoAlternativa54.setAlternativasB("");
        questaoAlternativa54.setAlternativasC("");
        questaoAlternativa54.setAlternativasD("");
        questaoAlternativa54.setAlternativasE("");
        questaoAlternativa54.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa55 = new QuestaoAlternativa();
        questaoAlternativa55.setId(INICIOQUESTAO.longValue());
        questaoAlternativa55.setAno(ANO);
        questaoAlternativa55.setDescricao("");
        questaoAlternativa55.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa55.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa55.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa55.setAlternativaCorreta("a");

        questaoAlternativa55.setAlternativasA("");
        questaoAlternativa55.setAlternativasB("");
        questaoAlternativa55.setAlternativasC("");
        questaoAlternativa55.setAlternativasD("");
        questaoAlternativa55.setAlternativasE("");
        questaoAlternativa55.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa56 = new QuestaoAlternativa();
        questaoAlternativa56.setId(INICIOQUESTAO.longValue());
        questaoAlternativa56.setAno(ANO);
        questaoAlternativa56.setDescricao("");
        questaoAlternativa56.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa56.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa56.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa56.setAlternativaCorreta("b");

        questaoAlternativa56.setAlternativasA("");
        questaoAlternativa56.setAlternativasB("");
        questaoAlternativa56.setAlternativasC("");
        questaoAlternativa56.setAlternativasD("");
        questaoAlternativa56.setAlternativasE("");
        questaoAlternativa56.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa57 = new QuestaoAlternativa();
        questaoAlternativa57.setId(INICIOQUESTAO.longValue());
        questaoAlternativa57.setAno(ANO);
        questaoAlternativa57.setDescricao("");
        questaoAlternativa57.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa57.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa57.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa57.setAlternativaCorreta("b");

        questaoAlternativa57.setAlternativasA("");
        questaoAlternativa57.setAlternativasB("");
        questaoAlternativa57.setAlternativasC("");
        questaoAlternativa57.setAlternativasD("");
        questaoAlternativa57.setAlternativasE("");
        questaoAlternativa57.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa58 = new QuestaoAlternativa();
        questaoAlternativa58.setId(INICIOQUESTAO.longValue());
        questaoAlternativa58.setAno(ANO);
        questaoAlternativa58.setDescricao("");
        questaoAlternativa58.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa58.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa58.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa58.setAlternativaCorreta("a");

        questaoAlternativa58.setAlternativasA("");
        questaoAlternativa58.setAlternativasB("");
        questaoAlternativa58.setAlternativasC("");
        questaoAlternativa58.setAlternativasD("");
        questaoAlternativa58.setAlternativasE("");
        questaoAlternativa58.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa59 = new QuestaoAlternativa();
        questaoAlternativa59.setId(INICIOQUESTAO.longValue());
        questaoAlternativa59.setAno(ANO);
        questaoAlternativa59.setDescricao("");
        questaoAlternativa59.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa59.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa59.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa59.setAlternativaCorreta("b");

        questaoAlternativa59.setAlternativasA("");
        questaoAlternativa59.setAlternativasB("");
        questaoAlternativa59.setAlternativasC("");
        questaoAlternativa59.setAlternativasD("");
        questaoAlternativa59.setAlternativasE("");
        questaoAlternativa59.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa60 = new QuestaoAlternativa();
        questaoAlternativa60.setId(INICIOQUESTAO.longValue());
        questaoAlternativa60.setAno(ANO);
        questaoAlternativa60.setDescricao("");
        questaoAlternativa60.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa60.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa60.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa60.setAlternativaCorreta("e");

        questaoAlternativa60.setAlternativasA("");
        questaoAlternativa60.setAlternativasB("");
        questaoAlternativa60.setAlternativasC("");
        questaoAlternativa60.setAlternativasD("");
        questaoAlternativa60.setAlternativasE("");
        questaoAlternativa60.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa61 = new QuestaoAlternativa();
        questaoAlternativa61.setId(INICIOQUESTAO.longValue());
        questaoAlternativa61.setAno(ANO);
        questaoAlternativa61.setDescricao("");
        questaoAlternativa61.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa61.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa61.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa61.setAlternativaCorreta("b");

        questaoAlternativa61.setAlternativasA("");
        questaoAlternativa61.setAlternativasB("");
        questaoAlternativa61.setAlternativasC("");
        questaoAlternativa61.setAlternativasD("");
        questaoAlternativa61.setAlternativasE("");
        questaoAlternativa61.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa62 = new QuestaoAlternativa();
        questaoAlternativa62.setId(INICIOQUESTAO.longValue());
        questaoAlternativa62.setAno(ANO);
        questaoAlternativa62.setDescricao("");
        questaoAlternativa62.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa62.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa62.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa62.setAlternativaCorreta("e");

        questaoAlternativa62.setAlternativasA("");
        questaoAlternativa62.setAlternativasB("");
        questaoAlternativa62.setAlternativasC("");
        questaoAlternativa62.setAlternativasD("");
        questaoAlternativa62.setAlternativasE("");
        questaoAlternativa62.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa63 = new QuestaoAlternativa();
        questaoAlternativa63.setId(INICIOQUESTAO.longValue());
        questaoAlternativa63.setAno(ANO);
        questaoAlternativa63.setDescricao("");
        questaoAlternativa63.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa63.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa63.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa63.setAlternativaCorreta("c");

        questaoAlternativa63.setAlternativasA("");
        questaoAlternativa63.setAlternativasB("");
        questaoAlternativa63.setAlternativasC("");
        questaoAlternativa63.setAlternativasD("");
        questaoAlternativa63.setAlternativasE("");
        questaoAlternativa63.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa64 = new QuestaoAlternativa();
        questaoAlternativa64.setId(INICIOQUESTAO.longValue());
        questaoAlternativa64.setAno(ANO);
        questaoAlternativa64.setDescricao("");
        questaoAlternativa64.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa64.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa64.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa64.setAlternativaCorreta("b");

        questaoAlternativa64.setAlternativasA("");
        questaoAlternativa64.setAlternativasB("");
        questaoAlternativa64.setAlternativasC("");
        questaoAlternativa64.setAlternativasD("");
        questaoAlternativa64.setAlternativasE("");
        questaoAlternativa64.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa65 = new QuestaoAlternativa();
        questaoAlternativa65.setId(INICIOQUESTAO.longValue());
        questaoAlternativa65.setAno(ANO);
        questaoAlternativa65.setDescricao("Na criptografia com chave pública:");
        questaoAlternativa65.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa65.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa65.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa65.setAlternativaCorreta("b");

        questaoAlternativa65.setAlternativasA("");
        questaoAlternativa65.setAlternativasB("");
        questaoAlternativa65.setAlternativasC("");
        questaoAlternativa65.setAlternativasD("");
        questaoAlternativa65.setAlternativasE("");
        questaoAlternativa65.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa66 = new QuestaoAlternativa();
        questaoAlternativa66.setId(INICIOQUESTAO.longValue());
        questaoAlternativa66.setAno(ANO);
        questaoAlternativa66.setDescricao("");
        questaoAlternativa66.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa66.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa66.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa66.setAlternativaCorreta("e");

        questaoAlternativa66.setAlternativasA("");
        questaoAlternativa66.setAlternativasB("");
        questaoAlternativa66.setAlternativasC("");
        questaoAlternativa66.setAlternativasD("");
        questaoAlternativa66.setAlternativasE("");
        questaoAlternativa66.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa67 = new QuestaoAlternativa();
        questaoAlternativa67.setId(INICIOQUESTAO.longValue());
        questaoAlternativa67.setAno(ANO);
        questaoAlternativa67.setDescricao("");
        questaoAlternativa67.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa67.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa67.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa67.setAlternativaCorreta("d");

        questaoAlternativa67.setAlternativasA("");
        questaoAlternativa67.setAlternativasB("");
        questaoAlternativa67.setAlternativasC("");
        questaoAlternativa67.setAlternativasD("");
        questaoAlternativa67.setAlternativasE("");
        questaoAlternativa67.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa68 = new QuestaoAlternativa();
        questaoAlternativa68.setId(INICIOQUESTAO.longValue());
        questaoAlternativa68.setAno(ANO);
        questaoAlternativa68.setDescricao("");
        questaoAlternativa68.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa68.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa68.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa68.setAlternativaCorreta("a");

        questaoAlternativa68.setAlternativasA("");
        questaoAlternativa68.setAlternativasB("");
        questaoAlternativa68.setAlternativasC("");
        questaoAlternativa68.setAlternativasD("");
        questaoAlternativa68.setAlternativasE("");
        questaoAlternativa68.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa69 = new QuestaoAlternativa();
        questaoAlternativa69.setId(INICIOQUESTAO.longValue());
        questaoAlternativa69.setAno(ANO);
        questaoAlternativa69.setDescricao("");
        questaoAlternativa69.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa69.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa69.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa69.setAlternativaCorreta("d");

        questaoAlternativa69.setAlternativasA("");
        questaoAlternativa69.setAlternativasB("");
        questaoAlternativa69.setAlternativasC("");
        questaoAlternativa69.setAlternativasD("");
        questaoAlternativa69.setAlternativasE("");
        questaoAlternativa69.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa70 = new QuestaoAlternativa();
        questaoAlternativa70.setId(INICIOQUESTAO.longValue());
        questaoAlternativa70.setAno(ANO);
        questaoAlternativa70.setDescricao("");
        questaoAlternativa70.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa70.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa70.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa70.setAlternativaCorreta("b");

        questaoAlternativa70.setAlternativasA("");
        questaoAlternativa70.setAlternativasB("");
        questaoAlternativa70.setAlternativasC("");
        questaoAlternativa70.setAlternativasD("");
        questaoAlternativa70.setAlternativasE("");
        questaoAlternativa70.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

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
