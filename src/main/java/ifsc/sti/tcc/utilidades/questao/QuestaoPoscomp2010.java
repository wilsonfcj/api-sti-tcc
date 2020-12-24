package ifsc.sti.tcc.utilidades.questao;

import java.util.ArrayList;
import java.util.List;

import ifsc.sti.tcc.modelos.questao.Questao;
import ifsc.sti.tcc.modelos.questao.QuestaoAlternativa;
import ifsc.sti.tcc.props.EArea;
import ifsc.sti.tcc.props.EDisciplina;
import ifsc.sti.tcc.props.ETipoQuestaoProva;

public class QuestaoPoscomp2010 {

    final static Integer ANO = 2010;
    static Integer INICIOQUESTAO = 571;
    static Integer NUMEROQUESTAO = 1;

    public static List<Questao> registerPoscomp() {

        QuestaoAlternativa questaoAlternativa1 = new QuestaoAlternativa();
        questaoAlternativa1.setId(INICIOQUESTAO.longValue());
        questaoAlternativa1.setAno(ANO);
        questaoAlternativa1.setDescricao("Considere a matriz $\\begin{bmatrix} 4 & −3 & 1 \\\\ 2 & −1 & 1 \\\\ 0 & 0 & 2 \\end{bmatrix}$ Os autovalores da matriz A são:");
        questaoAlternativa1.setArea(EArea.MATEMATICA);
        questaoAlternativa1.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa1.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa1.setAlternativaCorreta("c");

        questaoAlternativa1.setAlternativasA("0, 1, 4");
        questaoAlternativa1.setAlternativasB("0, 2, 3");
        questaoAlternativa1.setAlternativasC("1, 2, 2");
        questaoAlternativa1.setAlternativasD("1, 1, 3");
        questaoAlternativa1.setAlternativasE("2, 3, −1");
        questaoAlternativa1.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa2 = new QuestaoAlternativa();
        questaoAlternativa2.setId(INICIOQUESTAO.longValue());
        questaoAlternativa2.setAno(ANO);
        questaoAlternativa2.setDescricao(
                "Considere o triângulo de vértices A = (0, 6), B = (4, 10) e C = (2, 2).\n" +
                        "O ponto de interseção das medianas tiradas do vértice B e do vértice C é:");
        questaoAlternativa2.setArea(EArea.MATEMATICA);
        questaoAlternativa2.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa2.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa2.setAlternativaCorreta("a");

        questaoAlternativa2.setAlternativasA("(2, 6)");
        questaoAlternativa2.setAlternativasB("(3, 8)");
        questaoAlternativa2.setAlternativasC("(4, 6)");
        questaoAlternativa2.setAlternativasD("(5, 4)");
        questaoAlternativa2.setAlternativasE("(6, 2)");
        questaoAlternativa2.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa3 = new QuestaoAlternativa();
        questaoAlternativa3.setId(INICIOQUESTAO.longValue());
        questaoAlternativa3.setAno(ANO);
        questaoAlternativa3.setDescricao(
                "Seja $\\begin{bmatrix} 1 & −1 & 1 \\\\ 2 & −2 & 1 \\\\ 2 & −2 & 1 \\end{bmatrix}$ Então $A^{7}$ vale:\n");
        questaoAlternativa3.setArea(EArea.MATEMATICA);
        questaoAlternativa3.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa3.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa3.setAlternativaCorreta("e");

        questaoAlternativa3.setAlternativasA("$\\begin{bmatrix} 10 & −1 & 2 \\\\ 2 & −2 & 3 \\\\ 2 & −2 & 5 \\end{bmatrix}$");
        questaoAlternativa3.setAlternativasB("$\\begin{bmatrix} 1 & −1 & 1 \\\\ 2^{7} & −2^{7} & 1 \\\\ 2^{7} & −2^{7} & 1 \\end{bmatrix}$");
        questaoAlternativa3.setAlternativasC("$\\begin{bmatrix} 1 & −1 & 1 \\\\ 16 & −21 & 1 \\\\ 34 & -64 & 1 \\end{bmatrix}$");
        questaoAlternativa3.setAlternativasD("$\\begin{bmatrix} -1 & 1 & -1 \\\\ -2 & 2 & -1 \\\\ -2 & 2 & -1 \\end{bmatrix}$");
        questaoAlternativa3.setAlternativasE("$\\begin{bmatrix} 1 & -1 & 1 \\\\ 2 & -2 & 1 \\\\ 2 & -2 & 1 \\end{bmatrix}$");
        questaoAlternativa3.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa4 = new QuestaoAlternativa();
        questaoAlternativa4.setId(INICIOQUESTAO.longValue());
        questaoAlternativa4.setAno(ANO);
        questaoAlternativa4.setDescricao(
                "Entre os cinco pontos dados a seguir, três estão alinhados. Quais são eles? $\\newline$Dados: A = (1, 6), B = (3, 4), C = (2, 4), D = (3, 2) e E = (0,\\frac{15}{2})");
        questaoAlternativa4.setArea(EArea.MATEMATICA);
        questaoAlternativa4.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa4.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa4.setAlternativaCorreta("b");

        questaoAlternativa4.setAlternativasA("A, B, e E");
        questaoAlternativa4.setAlternativasB("A, C e D");
        questaoAlternativa4.setAlternativasC("A, C e E");
        questaoAlternativa4.setAlternativasD("B, C e D");
        questaoAlternativa4.setAlternativasE("C, D e E");
        questaoAlternativa4.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa5 = new QuestaoAlternativa();
        questaoAlternativa5.setId(INICIOQUESTAO.longValue());
        questaoAlternativa5.setAno(ANO);
        questaoAlternativa5.setDescricao(
                "Considere os conjuntos de polinômios A = $\\left\\{{1, x, 3x^{2} − 1, 5x^{3} − 3}\\right\\}$ e $\\left\\{B = {1, x, x^{2}\n" +
                        ", x^{3}}\\right\\}$ e o produto interno\n" +
                        "< p, q >=\n" +
                        "$\\int_{-1}^{1}$ \n" +
                        "p(x)q(x)dx.\n" +
                        "$\\newline$Com base no enunciado, considere as afirmativas a seguir.\n" +
                        "\n" +
                        "$\\newline$I. A é um conjunto linearmente independente.\n" +
                        "$\\newline$II. B é um conjunto linearmente independente.\n" +
                        "$\\newline$III. A é a base ortogonal do conjunto de polinômios de grau até 3.\n" +
                        "$\\newline$IV. B é a base ortogonal do conjunto de polinômios de grau até 3.\n" +
                        "\n" +
                        "$\\newline$Assinale a alternativa correta.");
        questaoAlternativa5.setArea(EArea.MATEMATICA);
        questaoAlternativa5.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa5.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa5.setAlternativaCorreta("a");

        questaoAlternativa5.setAlternativasA("Somente as afirmativas I e II são corretas");
        questaoAlternativa5.setAlternativasB("Somente as afirmativas I e IV são corretas.");
        questaoAlternativa5.setAlternativasC("Somente as afirmativas III e IV são corretas.");
        questaoAlternativa5.setAlternativasD("Somente as afirmativas I, II e III são corretas.");
        questaoAlternativa5.setAlternativasE("Somente as afirmativas II, III e IV são corretas.");
        questaoAlternativa5.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa6 = new QuestaoAlternativa();
        questaoAlternativa6.setId(INICIOQUESTAO.longValue());
        questaoAlternativa6.setAno(ANO);
        questaoAlternativa6.setDescricao(
                "Considere que $x_{0}$, $x_{1}$, ...., $x_{n}$ são pontos igualmente espaçados de $h$, onde $n ∈ N$ (conjunto dos números\n" +
                        "naturais), $n ≥ 1 e n$ é um número par; $h > 0$ é a distância entre dois pontos quaisquer consecutivos\n" +
                        "$x_{j}$ , x_{j + 1}, j = 0$, ..., n − 1; h = x_{j+1} − x_{j}$ .\n" +
                        "Sendo f uma função contínua de uma variável real, com valores tabelados da seguinte forma: yi = f(xi) =\n" +
                        "$100$ para $i = 0, 2, 4..., n−2, n$ (índices pares) e $y1 = f(xi) = 200 para i = 1, 3, 5..., n−1$ (índices ímpares), então,\n" +
                        "aplicando a regra dos trapézios generalizada para determinar o valor aproximado da integral\n" +
                        "$\\int_{0}^{n} f(x)dx$\n" +
                        "este valor resultará em:\n");
        questaoAlternativa6.setArea(EArea.MATEMATICA);
        questaoAlternativa6.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa6.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa6.setAlternativaCorreta("c");

        questaoAlternativa6.setAlternativasA("50nh");
        questaoAlternativa6.setAlternativasB("100nh");
        questaoAlternativa6.setAlternativasC("150nh");
        questaoAlternativa6.setAlternativasD("200nh");
        questaoAlternativa6.setAlternativasE("300nh");
        questaoAlternativa6.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa7 = new QuestaoAlternativa();
        questaoAlternativa7.setId(INICIOQUESTAO.longValue());
        questaoAlternativa7.setAno(ANO);
        questaoAlternativa7.setDescricao(
                "A posição de uma partícula no instante $t ≥ 0, t ∈ [0, 2π]$, que se desloca em função do tempo t em segundos,\n" +
                        "ao longo de uma reta coordenada, é dada por:\n" +
                        "$s(t) = cos(2t +\\frac{π}{4})$\n" +
                        "\n" +
                        "Determine os instantes em que a velocidade (em $m/s$) é extrema (máxima/mínima) para a partícula, utilizandose de informações das derivadas primeira e segunda da velocidade.");
        questaoAlternativa7.setArea(EArea.MATEMATICA);
        questaoAlternativa7.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa7.setDisciplina(EDisciplina.CALCULO);
        questaoAlternativa7.setAlternativaCorreta("a");

        questaoAlternativa7.setAlternativasA("t = $\\frac{π}{8}s$ é o instante de velocidade mínima e t =\n" +
                "$\\frac{5π}{8}s$  é o instante de velocidade máxima.");
        questaoAlternativa7.setAlternativasB("t = $\\frac{π}{8}s$ s é o instante de velocidade máxima e t =\n" +
                "$\\frac{5π}{8}s$  é o instante de velocidade mínima.");
        questaoAlternativa7.setAlternativasC("t = $\\frac{π}{4}s$ s é o instante de velocidade máxima e t =\n" +
                "$\\frac{5π}{4}s$  é o instante de velocidade mínima.");
        questaoAlternativa7.setAlternativasD("t = $\\frac{π}{4}s$ s é o instante de velocidade mínima e t =\n" +
                "$\\frac{5π}{4}s$ é o instante de velocidade máxima.");
        questaoAlternativa7.setAlternativasE("t = $\\frac{3π}{8}s$ s é o instante de velocidade mínima e e t =\n" +
                "$\\frac{7π}{8}s$ é o instante de velocidade máxima.");
        questaoAlternativa7.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa8 = new QuestaoAlternativa();
        questaoAlternativa8.setId(INICIOQUESTAO.longValue());
        questaoAlternativa8.setAno(ANO);
        questaoAlternativa8.setDescricao("Anulada");
        questaoAlternativa8.setArea(EArea.MATEMATICA);
        questaoAlternativa8.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa8.setDisciplina(EDisciplina.CALCULO);
        questaoAlternativa8.setAlternativaCorreta("*");

        questaoAlternativa8.setAlternativasA("Anulada");
        questaoAlternativa8.setAlternativasB("Anulada");
        questaoAlternativa8.setAlternativasC("Anulada");
        questaoAlternativa8.setAlternativasD("Anulada");
        questaoAlternativa8.setAlternativasE("Anulada");
        questaoAlternativa8.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa9 = new QuestaoAlternativa();
        questaoAlternativa9.setId(INICIOQUESTAO.longValue());
        questaoAlternativa9.setAno(ANO);
        questaoAlternativa9.setDescricao("O dominó é um jogo com 28 peças, com dois números em cada peça, com todas as combinações de 0 a\n" +
                "6. Duas peças de dominó são sorteadas. A probabilidade de que tenham um número em comum é:");
        questaoAlternativa9.setArea(EArea.MATEMATICA);
        questaoAlternativa9.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa9.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa9.setAlternativaCorreta("b");

        questaoAlternativa9.setAlternativasA("1/7");
        questaoAlternativa9.setAlternativasB("7/18");
        questaoAlternativa9.setAlternativasC("1/2");
        questaoAlternativa9.setAlternativasD("0,4");
        questaoAlternativa9.setAlternativasE("21/28");
        questaoAlternativa9.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa10 = new QuestaoAlternativa();
        questaoAlternativa10.setId(INICIOQUESTAO.longValue());
        questaoAlternativa10.setAno(ANO);
        questaoAlternativa10
                .setDescricao("A relação de recorrência abaixo representa um processo de enumeração por recursão.\n" +
                        "\n" +
                        "$\\newline$ $T(n) = \\begin{cases}0, & se n = 1\\\\n T(n-1) +n, & se n > 1\\end{cases}$\n" +
                        "\n" +
                        "$\\newline$Assinale a alternativa que corresponde a um limite superior para o valor da fórmula fechada de tal relação\n" +
                        "de recorrência.");
        questaoAlternativa10.setArea(EArea.MATEMATICA);
        questaoAlternativa10.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa10.setDisciplina(EDisciplina.CALCULO);
        questaoAlternativa10.setAlternativaCorreta("c");

        questaoAlternativa10.setAlternativasA("T(1)");
        questaoAlternativa10.setAlternativasB("0");
        questaoAlternativa10.setAlternativasC("$n^{2}$");
        questaoAlternativa10.setAlternativasD("1024");
        questaoAlternativa10.setAlternativasE("n!");
        questaoAlternativa10.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa11 = new QuestaoAlternativa();
        questaoAlternativa11.setId(INICIOQUESTAO.longValue());
        questaoAlternativa11.setAno(ANO);
        questaoAlternativa11.setDescricao("De quantos modos 4 homens e 4 mulheres podem se sentar em 4 bancos de 2 lugares, se em cada banco\n" +
                "deve haver um homem e uma mulher?");
        questaoAlternativa11.setArea(EArea.MATEMATICA);
        questaoAlternativa11.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa11.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa11.setAlternativaCorreta("e");

        questaoAlternativa11.setAlternativasA("64");
        questaoAlternativa11.setAlternativasB("8!");
        questaoAlternativa11.setAlternativasC("$\\frac{8!}{2!}$");
        questaoAlternativa11.setAlternativasD("8.7.6.5");
        questaoAlternativa11.setAlternativasE("$16.24^{2}$");
        questaoAlternativa11.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa12 = new QuestaoAlternativa();
        questaoAlternativa12.setId(INICIOQUESTAO.longValue());
        questaoAlternativa12.setAno(ANO);
        questaoAlternativa12.setDescricao(
                "A definição do Teorema Binomial de Newton é\n" +
                        "\n" +
                        "$\\newline$ $(x + y)^{n} = \\sum_{i = 0}^n \\left(\\begin{array}{c}n\\\\ i\\end{array}\\right) x^{n-i}y^i\\cdot$\n" +
                        "\n" +
                        "$\\newline$ Assim, dado o seguinte somatório\n" +
                        "\n" +
                        "$\\newline$ $S_{n} = \\sum_{i = 1}^n \\left(\\begin{array}{c}n\\\\ i\\end{array}\\right)$,\n" +
                        "\n" +
                        "qual o valor de $S_{n}$?");
        questaoAlternativa12.setArea(EArea.MATEMATICA);
        questaoAlternativa12.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa12.setDisciplina(EDisciplina.CALCULO_NUMERICO);
        questaoAlternativa12.setAlternativaCorreta("b");

        questaoAlternativa12.setAlternativasA("n + 1");
        questaoAlternativa12.setAlternativasB("$2^n − 1$");
        questaoAlternativa12.setAlternativasC("(n − i)!");
        questaoAlternativa12.setAlternativasD("(n − 1)!");
        questaoAlternativa12.setAlternativasE("$2(n^n − 1)$");
        questaoAlternativa12.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa13 = new QuestaoAlternativa();
        questaoAlternativa13.setId(INICIOQUESTAO.longValue());
        questaoAlternativa13.setAno(ANO);
        questaoAlternativa13.setDescricao(
                "João e Manuel retiram, para cada um, um bilhete de uma urna em que há 60 bilhetes numerados de 1 a 60.\n" +
                        "A probabilidade de que o número retirado por João seja maior do que o de Manuel é:\n");
        questaoAlternativa13.setArea(EArea.MATEMATICA);
        questaoAlternativa13.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa13.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa13.setAlternativaCorreta("d");

        questaoAlternativa13.setAlternativasA("31/60");
        questaoAlternativa13.setAlternativasB("60/59");
        questaoAlternativa13.setAlternativasC("60%");
        questaoAlternativa13.setAlternativasD("50%");
        questaoAlternativa13.setAlternativasE("29/60");
        questaoAlternativa13.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa14 = new QuestaoAlternativa();
        questaoAlternativa14.setId(INICIOQUESTAO.longValue());
        questaoAlternativa14.setAno(ANO);
        questaoAlternativa14.setDescricao("Dada a proposição “existem números que são divisíveis por 3 e por 5 no conjunto”, assinale a alternativa\n" +
                "em que essa proposição é verdadeira para um dos conjuntos a seguir.\n");
        questaoAlternativa14.setArea(EArea.MATEMATICA);
        questaoAlternativa14.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa14.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa14.setAlternativaCorreta("a");

        questaoAlternativa14.setAlternativasA("{2, 8, 9, 20, 135}");
        questaoAlternativa14.setAlternativasB("{9, 20}");
        questaoAlternativa14.setAlternativasC("{18, 55, 67}");
        questaoAlternativa14.setAlternativasD("{2, 3, 5, 7}");
        questaoAlternativa14.setAlternativasE("{9, 18, 36}");
        questaoAlternativa14.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa15 = new QuestaoAlternativa();
        questaoAlternativa15.setId(INICIOQUESTAO.longValue());
        questaoAlternativa15.setAno(ANO);
        questaoAlternativa15.setDescricao(
                "Para calcular a média e o desvio padrão das notas de seus 30 alunos, um professor de estatística utiliza\n" +
                        "a soma das notas e a soma de seus quadrados, obtendo 180 para a primeira, e 1544, para a segunda. A\n" +
                        "média e o desvio padrão valem, respectivamente,");
        questaoAlternativa15.setArea(EArea.MATEMATICA);
        questaoAlternativa15.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa15.setDisciplina(EDisciplina.CALCULO_NUMERICO);
        questaoAlternativa15.setAlternativaCorreta("c");

        questaoAlternativa15.setAlternativasA("4 e 6");
        questaoAlternativa15.setAlternativasB("6 e 9");
        questaoAlternativa15.setAlternativasC("6 e 4");
        questaoAlternativa15.setAlternativasD("4 e 8");
        questaoAlternativa15.setAlternativasE("9 e 5");
        questaoAlternativa15.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa16 = new QuestaoAlternativa();
        questaoAlternativa16.setId(INICIOQUESTAO.longValue());
        questaoAlternativa16.setAno(ANO);
        questaoAlternativa16.setDescricao(
                "Os conectores lógicos $∨, →$ são lidos como “ou” e “implica”. O operador “não” é representado por $¬$.\n" +
                        "Considerando esta notação, a tabela verdade da proposição $(P → Q) → (¬Q ∨ P)$, assumindo que a\n" +
                        "sequência de valores de P é \\left\\{V,V,F,F\\right\\} e a de Q é \\left\\{V,F,V,F\\right\\}, tem os valores:\n");
        questaoAlternativa16.setArea(EArea.MATEMATICA);
        questaoAlternativa16.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa16.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa16.setAlternativaCorreta("c");

        questaoAlternativa16.setAlternativasA("$\\left\\{F,F,F,F\\right\\}$");
        questaoAlternativa16.setAlternativasB("$\\left\\{V,V,V,V\\right\\}$");
        questaoAlternativa16.setAlternativasC("$\\left\\{V,V,F,V\\right\\}$");
        questaoAlternativa16.setAlternativasD("$\\left\\{F,F,V,V\\right\\}$");
        questaoAlternativa16.setAlternativasE("$\\left\\{V,F,V,F\\right\\}$");
        questaoAlternativa16.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa17 = new QuestaoAlternativa();
        questaoAlternativa17.setId(INICIOQUESTAO.longValue());
        questaoAlternativa17.setAno(ANO);
        questaoAlternativa17.setDescricao(
                "A escala musical pode ser modelada matematicamente através da série harmônica. Usando a técnica de\n" +
                        "aproximação por integrais ou a de divisão por somatórios, um limite assintótico para a série harmônica\n" +
                        "\n" +
                        "$\\newline$ $H_n = \\sum_{i = 1}^n \\frac{1}{i}$\n" +
                        "\n" +
                        "$\\newline$ é dado por:");
        questaoAlternativa17.setArea(EArea.MATEMATICA);
        questaoAlternativa17.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa17.setDisciplina(EDisciplina.CALCULO);
        questaoAlternativa17.setAlternativaCorreta("a");

        questaoAlternativa17.setAlternativasA("$\\log{n} + 1$");
        questaoAlternativa17.setAlternativasB("dó, ré, mi, fá, sol, lá, si, dó");
        questaoAlternativa17.setAlternativasC("$3n +\\frac{1}{n}$");
        questaoAlternativa17.setAlternativasD("C, D, E, F, G, A, B");
        questaoAlternativa17.setAlternativasE("$\\frac{1}{i} + \\frac{1}{i} + ... + \\frac{1}{i}$");
        questaoAlternativa17.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa18 = new QuestaoAlternativa();
        questaoAlternativa18.setId(INICIOQUESTAO.longValue());
        questaoAlternativa18.setAno(ANO);
        questaoAlternativa18.setDescricao(
                "Um dado honesto tem duas faces pintadas de azul e as outras quatro, de amarelo. O dado é lançado três\n" +
                        "vezes, anotando-se a cor da face obtida. A probabilidade de a cor obtida no primeiro lançamento ser igual\n" +
                        "à obtida no terceiro lançamento é:");
        questaoAlternativa18.setArea(EArea.MATEMATICA);
        questaoAlternativa18.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa18.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa18.setAlternativaCorreta("e");

        questaoAlternativa18.setAlternativasA("2/3");
        questaoAlternativa18.setAlternativasB("1/3");
        questaoAlternativa18.setAlternativasC("50%");
        questaoAlternativa18.setAlternativasD("9/20");
        questaoAlternativa18.setAlternativasE("5/9");
        questaoAlternativa18.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa19 = new QuestaoAlternativa();
        questaoAlternativa19.setId(INICIOQUESTAO.longValue());
        questaoAlternativa19.setAno(ANO);
        questaoAlternativa19.setDescricao(
                "Realizou-se uma brincadeira com $n$ crianças, que receberam uma bexiga (balão) vazia cada uma, para\n" +
                        "então encherem até onde achassem que não estouraria. A brincadeira consistia, então, em determinar\n" +
                        "uma estratégia que estabelecesse a ordem na qual os balões atingiriam o teto do salão.\n" +
                        "Considerando a quantidade de ar em cada bexiga e assumindo que seja possível determinar qual bexiga\n" +
                        "estava mais cheia de ar, quando comparadas duas a duas, quantas comparações, no máximo, seriam\n" +
                        "necessárias para soltar todos os balões, escolhendo de cada vez o balão precisamente mais cheio de\n" +
                        "ar?\n");
        questaoAlternativa19.setArea(EArea.MATEMATICA);
        questaoAlternativa19.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa19.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa19.setAlternativaCorreta("d");

        questaoAlternativa19.setAlternativasA("$\\log{n}$");
        questaoAlternativa19.setAlternativasB("$n^2\\log{n}$");
        questaoAlternativa19.setAlternativasC("$2^n$");
        questaoAlternativa19.setAlternativasD("$n^2$");
        questaoAlternativa19.setAlternativasE("5n + 2");
        questaoAlternativa19.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa20 = new QuestaoAlternativa();
        questaoAlternativa20.setId(INICIOQUESTAO.longValue());
        questaoAlternativa20.setAno(ANO);
        questaoAlternativa20.setDescricao(
                "Qual expressão matemática a seguir gera o n-ésimo termo da sequência 8+13+18+23+28+33+...?");
        questaoAlternativa20.setArea(EArea.MATEMATICA);
        questaoAlternativa20.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa20.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa20.setAlternativaCorreta("b");

        questaoAlternativa20.setAlternativasA("$5n^2 + 3n$");
        questaoAlternativa20.setAlternativasB("3 + 5n");
        questaoAlternativa20.setAlternativasC("$5\\left(\\frac{n^2 + n}{2}\\right) + 3n$");
        questaoAlternativa20.setAlternativasD("8n + 5");
        questaoAlternativa20.setAlternativasE("$2, 5n^2 + 5, 5n$");
        questaoAlternativa20.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa21 = new QuestaoAlternativa();
        questaoAlternativa21.setId(INICIOQUESTAO.longValue());
        questaoAlternativa21.setAno(ANO);
        questaoAlternativa21.setDescricao("Um estudante de computação precisa resolver um problema bastante importante, que é executar as operações que estão descritas abaixo, cuja estrutura é uma pilha. Tão logo ele retire algum elemento desta\n" +
                "pilha, estes deverão ser inseridos em uma fila, cuja entrada é pela esquerda e a saída, pela direita.\n" +
                "Assinale a alternativa que contém a sequência correta de entrada dos elementos na fila.\n" +
                "\n" +
                "$\\newline$ PUSH P\n" +
                "$\\newline$ PUSH E\n" +
                "$\\newline$ PUSH R\n" +
                "$\\newline$ PUSH T\n" +
                "$\\newline$ PUSH O\n" +
                "$\\newline$ POP\n" +
                "$\\newline$ POP\n" +
                "$\\newline$ PUSH S\n" +
                "$\\newline$ PUSH O\n" +
                "$\\newline$ PUSH L\n" +
                "$\\newline$ POP\n" +
                "$\\newline$ POP\n" +
                "$\\newline$ POP");
        questaoAlternativa21.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa21.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa21.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa21.setAlternativaCorreta("d");

        questaoAlternativa21.setAlternativasA("S - O - L - T - O");
        questaoAlternativa21.setAlternativasB("O - T - R - E - P");
        questaoAlternativa21.setAlternativasC("P - E - R - T - O");
        questaoAlternativa21.setAlternativasD("P - E - R - T - O");
        questaoAlternativa21.setAlternativasE("P - O - R - L - S");
        questaoAlternativa21.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa22 = new QuestaoAlternativa();
        questaoAlternativa22.setId(INICIOQUESTAO.longValue());
        questaoAlternativa22.setAno(ANO);
        questaoAlternativa22.setDescricao("Considere o seguinte trecho de programa escrito na linguagem C.\n" +
                "\n" +
                "$\\newline$ #include<stdio.h>\n" +
                "$\\newline$ ...\n" +
                "      $\\newline$ char str[100], *ptr;\n" +
                "$\\newline$ ...\n" +
                "        $\\newline$ for (ptr=str;(*ptr++=getchar())!=’\\n’;*ptr=’\\0’);\n" +
                "$\\newline$ ...\n" +
                "\n" +
                "$\\newline$ Pode-se afirmar que o objetivo do comando for é:");
        questaoAlternativa22.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa22.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa22.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa22.setAlternativaCorreta("b");

        questaoAlternativa22.setAlternativasA("Procurar pelo primeiro caracter ´\\n’ no vetor str e substituí-lo pelo caracter ‘\\0’.");
        questaoAlternativa22.setAlternativasB("Ler caracteres do stdin para a região de memória referenciada pela variável str.");
        questaoAlternativa22.setAlternativasC("Apresentar no dispositivo de saída a string armazenada na região de memória referenciada pela variável str.");
        questaoAlternativa22.setAlternativasD("Limpar a área de memória referenciada pela variável str, atribuindo o caracter ‘\\0’ a todas as 100 posições.");
        questaoAlternativa22.setAlternativasE("Alocar espaço de memória na região referenciada pela variável ptr.");
        questaoAlternativa22.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa23 = new QuestaoAlternativa();
        questaoAlternativa23.setId(INICIOQUESTAO.longValue());
        questaoAlternativa23.setAno(ANO);
        questaoAlternativa23.setDescricao(
                "Assinale a alternativa em que todas as propriedades de uma árvore vermelho e preto são verdadeiras");
        questaoAlternativa23.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa23.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa23.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa23.setAlternativaCorreta("c");

        questaoAlternativa23.setAlternativasA("Todo nó é vermelho ou preto. A raiz pode ser vermelha ou preta. Todas as folhas são vermelhas.");
        questaoAlternativa23.setAlternativasB("A raiz é preta. Todas as folhas são vermelhas. Para cada nó, todos os caminhos, desde um nó até as folhas\n" +
                "descendentes, contêm um mesmo número de nós pretos.");
        questaoAlternativa23.setAlternativasC("Toda folha é preta. Todo nó é vermelho ou preto. A raiz é preta.");
        questaoAlternativa23.setAlternativasD("Se um nó é vermelho, ambos os filhos são vermelhos. A raiz pode ser vermelha ou preta. Todas as folhas são\n" +
                "pretas.");
        questaoAlternativa23.setAlternativasE("Todas as folhas são vermelhas. Todo nó é vermelho ou preto. A raiz pode ser vermelha ou preta");
        questaoAlternativa23.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa24 = new QuestaoAlternativa();
        questaoAlternativa24.setId(INICIOQUESTAO.longValue());
        questaoAlternativa24.setAno(ANO);
        questaoAlternativa24.setDescricao(
                "Considere a seguinte função escrita na linguagem C.\n" +
                        "\n" +
                        "$\\newline$int F1 (unsigned int n)\n" +
                        "$\\newline${\n" +
                        "        $\\newline \\,\\,\\,\\,\\,\\,\\,\\,$if (n==0) return n;\n" +
                        "        $\\newline  \\,\\,\\,\\,\\,\\,\\,\\,$int i,j;\n" +
                        "        $\\newline  \\,\\,\\,\\,\\,\\,\\,\\,$for (i=j=1;i<2*n-1;i+=2,j+=i);\n" +
                        "        $\\newline  \\,\\,\\,\\,\\,\\,\\,\\,$return j;\n" +
                        "$\\newline$}\n" +
                        "\n" +
                        "$\\newline$Assinale a alternativa que apresenta corretamente a função com o mesmo resultado da função F1.\n");
        questaoAlternativa24.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa24.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa24.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa24.setAlternativaCorreta("c");

        questaoAlternativa24.setAlternativasA("int F3 (unsigned int n)\n" +
                "$\\newline${\n" +
                "        $\\newline \\,\\,\\,\\,\\,\\,\\,\\,$if (n==0) return n;\n" +
                "       $\\newline \\,\\,\\,\\,\\,\\,\\,\\,$ int i,j,k;\n" +
                "        $\\newline \\,\\,\\,\\,\\,\\,\\,\\,$for (i=1,j=2;i<n;i++)\n" +
                "                $\\newline \\,\\,\\,\\,\\,\\,\\,\\,\\,\\,\\,\\,$for (k=0;k<n;k++,j++);\n" +
                "        $\\newline \\,\\,\\,\\,\\,\\,\\,\\,$return j;\n" +
                "$\\newline$}");
        questaoAlternativa24.setAlternativasB("int F3 (unsigned int n)\n" +
                "$\\newline${\n" +
                "        $\\newline \\,\\,\\,\\,\\,\\,\\,\\,$if (n==0) return n;\n" +
                "        $\\newline \\,\\,\\,\\,\\,\\,\\,\\,$int i,j,k;\n" +
                "        $\\newline \\,\\,\\,\\,\\,\\,\\,\\,$for (i=1,j=2;i<n;i++)\n" +
                "                $\\newline \\,\\,\\,\\,\\,\\,\\,\\,\\,\\,\\,\\,$for (k=0;k<n;k++,j++);\n" +
                "        $\\newline \\,\\,\\,\\,\\,\\,\\,\\,$return j;\n" +
                "$\\newline \\,\\,\\,\\,\\,\\,\\,\\,$}");
        questaoAlternativa24.setAlternativasC("int F4 (unsigned int n)\n" +
                "$\\newline${\n" +
                "         $\\newline \\,\\,\\,\\,\\,\\,\\,\\,$if (n==0) return n;\n" +
                "         $\\newline \\,\\,\\,\\,\\,\\,\\,\\,$int i,j,k;\n" +
                "         $\\newline \\,\\,\\,\\,\\,\\,\\,\\,$for (i=j=1;i<n;i++,j++)\n" +
                "                $\\newline \\,\\,\\,\\,\\,\\,\\,\\,\\,\\,\\,\\,$for (k=0;k<n;k++,j++);\n" +
                "        $\\newline \\,\\,\\,\\,\\,\\,\\,\\,$return j;\n" +
                "$\\newline \\,\\,\\,\\,\\,\\,\\,\\,$}");
        questaoAlternativa24.setAlternativasD("int F5 (unsigned int n)\n" +
                "$\\newline${\n" +
                "        $\\newline \\,\\,\\,\\,\\,\\,\\,\\,$if (n==0) return n;\n" +
                "        $\\newline \\,\\,\\,\\,\\,\\,\\,\\,$else return 2 * n - 1;\n" +
                "$\\newline$}\n");
        questaoAlternativa24.setAlternativasE("int F6 (unsigned int n)\n" +
                "$\\newline${\n" +
                "        $\\newline \\,\\,\\,\\,\\,\\,\\,\\,$if (n==0) return n;\n" +
                "        $\\newline \\,\\,\\,\\,\\,\\,\\,\\,$else return n * (n + 1) * (n + 2) / 6;\n" +
                "$\\newline$}");
        questaoAlternativa24.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa25 = new QuestaoAlternativa();
        questaoAlternativa25.setId(INICIOQUESTAO.longValue());
        questaoAlternativa25.setAno(ANO);
        questaoAlternativa25.setDescricao(
                "Considere dois algoritmos $A1$ e $A2$, cujas funções de custo são, respectivamente, $T_1(n) = n^2 − n + 1$ e\n" +
                        "$T_2(n) = 6n \\log_{2}{n} + 2n$. Para simplificar a análise, assuma que n > 0 é sempre uma potência de 2.\n" +
                        "Com relação ao enunciado, assinale a alternativa correta.");
        questaoAlternativa25.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa25.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa25.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa25.setAlternativaCorreta("e");

        questaoAlternativa25.setAlternativasA("Como $T_1(n) = Θ(n^2)$ e $T_2(n) = Θ(n \\log_{n} )$, então A_2 é sempre mais eficiente que A_1.");
        questaoAlternativa25.setAlternativasB("O limite superior $T_1(n) = O(n^3)$ é correto e assintoticamente restrito.");
        questaoAlternativa25.setAlternativasC("O limite inferior $T_1(n) = Ω(n^3)$ é correto e assintoticamente restrito.");
        questaoAlternativa25.setAlternativasD("$T_1$ e $T_2$ são assintoticamente equivalentes.");
        questaoAlternativa25.setAlternativasE("$A_1$ é mais eficiente que $A_2$, para n suficientemente pequeno.");
        questaoAlternativa25.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa26 = new QuestaoAlternativa();
        questaoAlternativa26.setId(INICIOQUESTAO.longValue());
        questaoAlternativa26.setAno(ANO);
        questaoAlternativa26.setDescricao("Os algoritmos a seguir representam os três caminhamentos para árvores binárias\n" +
                "\n" +
                "$\\newline$caminhamento(binário)\n" +
                "$\\newline$se binário.esquerda $\\neq$ NULL então caminhamento(binário.esquerda)\n" +
                "$\\newline$escrever binário.valor\n" +
                "$\\newline$se binário.direita $\\neq$ NULL então caminhamento(binário.direita)\n" +
                "$\\newline$caminhamento(binário)\n" +
                "$\\newline$escrever binário.dado\n" +
                "$\\newline$se binário.esquerda $\\neq$ NULL então caminhamento(binário.esquerda)\n" +
                "$\\newline$se binário.direita $\\neq$ NULL então caminhamento(binário.direita)\n" +
                "$\\newline$caminhamento(binário)\n" +
                "$\\newline$se binário.esquerda $\\neq$ NULL então caminhamento(binário.esquerda)\n" +
                "$\\newline$se binário.direita $\\neq$ NULL então caminhamento(binário.direita)\n" +
                "$\\newline$escrever binário.valor\n" +
                "\n" +
                "$\\newline$Assinale a alternativa que contém os nomes dos 3 caminhamentos, respectivamente.");
        questaoAlternativa26.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa26.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa26.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa26.setAlternativaCorreta("d");

        questaoAlternativa26.setAlternativasA("pré-ordem, pós-ordem, em-ordem");
        questaoAlternativa26.setAlternativasB("pré-ordem, em-ordem, pós-ordem");
        questaoAlternativa26.setAlternativasC("pós-ordem, pré-ordem, em-ordem");
        questaoAlternativa26.setAlternativasD("em-ordem, pré-ordem, pós-ordem");
        questaoAlternativa26.setAlternativasE("em-ordem, pós-ordem, pré-ordem");
        questaoAlternativa26.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa27 = new QuestaoAlternativa();
        questaoAlternativa27.setId(INICIOQUESTAO.longValue());
        questaoAlternativa27.setAno(ANO);
        questaoAlternativa27.setDescricao(
                "Considere o problema de ordenação onde os vetores a serem ordenados, de tamanho $n > 0$, possuem\n" +
                        "$\\left[n/2\\right]$ valores iguais a um número real $x$ e $\\left[n/2\\right]$ valores iguais a um outro número real $y$. Considere que\n" +
                        "os números reais x e y são conhecidos e fixos, porém estão distribuídos aleatoriamente no vetor a ser\n" +
                        "ordenado.\n" +
                        "Neste caso, é correto afirmar:");
        questaoAlternativa27.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa27.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa27.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa27.setAlternativaCorreta("a");

        questaoAlternativa27.setAlternativasA("Podemos ordenar estes vetores a um custo $O\\left(n\\right)$.");
        questaoAlternativa27.setAlternativasB("No caso médio, o Quicksort será o algoritmo mais eficiente para este problema, com um custo $O\\left(n \\log{n}\\right)$.");
        questaoAlternativa27.setAlternativasC("O algoritmo de ordenação por inserção sempre opera no melhor caso com um custo $O\\left(n\\right)$.");
        questaoAlternativa27.setAlternativasD("O limite inferior para esta classe de problema é $Ω\\left(n^2\\right)$.");
        questaoAlternativa27.setAlternativasE("O limite inferior para esta classe de problema é $Ω(\\left(n \\log{n}\\right)$.");
        questaoAlternativa27.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa28 = new QuestaoAlternativa();
        questaoAlternativa28.setId(INICIOQUESTAO.longValue());
        questaoAlternativa28.setAno(ANO);
        questaoAlternativa28.setDescricao(
                "Com base nos conhecimentos sobre as linguagens de programação funcionais, considere as afirmativas\n" +
                        "a seguir.\n" +
                        "\n" +
                        "$\\newline$I. Uma linguagem de programação funcional tem o objetivo de imitar as funções matemáticas, ou seja,\n" +
                        "os programas são definições de funções e de especificações da aplicação dessas funções.\n" +
                        "$\\newline$II. Nas linguagens funcionais, os dados e as rotinas para manipulá-los são mantidos em uma mesma\n" +
                        "unidade, chamada objeto. Os dados só podem ser manipulados por meio das rotinas que estão na\n" +
                        "mesma unidade.\n" +
                        "$\\newline$III. As rotinas de um programa do paradigma funcional descrevem ações que mudam o estado das variáveis do programa, seguindo uma sequência de comandos para o computador executar.\n" +
                        "$\\newline$IV. A linguagem Lisp é um exemplo do paradigma funcional de programação.\n" +
                        "\n" +
                        "$\\newline$Assinale a alternativa correta");
        questaoAlternativa28.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa28.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa28.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa28.setAlternativaCorreta("a");

        questaoAlternativa28.setAlternativasA("Somente as afirmativas I e IV são corretas");
        questaoAlternativa28.setAlternativasB("Somente as afirmativas II e III são corretas.");
        questaoAlternativa28.setAlternativasC("Somente as afirmativas III e IV são corretas.");
        questaoAlternativa28.setAlternativasD("Somente as afirmativas I, II e III são corretas.");
        questaoAlternativa28.setAlternativasE("Somente as afirmativas I, II e IV são corretas.");
        questaoAlternativa28.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa29 = new QuestaoAlternativa();
        questaoAlternativa29.setId(INICIOQUESTAO.longValue());
        questaoAlternativa29.setAno(ANO);
        questaoAlternativa29.setDescricao(
                "Considere o programa a seguir, desenvolvido em linguagem C\n" +
                        "\n" +
                        "$\\newline$#include <stdio.h>\n" +
                        "$\\newline$int F1(int X, int Y) {\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$if (X < Y) return X;\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$else return F1(X-Y,Y);\n" +
                        "$\\newline$}\n" +
                        "\n" +
                        "\n" +
                        "$\\newline$int F2(int X, int Y) {\n" +
                        "       $\\newline\\,\\,\\,\\,\\,\\,$if (X < Y) return 0;\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$else return 1 + F2(X-Y,Y);\n" +
                        "$\\newline$}\n" +
                        "\n" +
                        "\n" +
                        "$\\newline$void F3(int X, int Y) {\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$if (X < Y) printf(\"%d\",X);\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$else {\n" +
                        "                $\\newline\\,\\,\\,\\,\\,\\,\\,\\,\\,\\,$F3(F2(X,Y),Y);\n" +
                        "                $\\newline\\,\\,\\,\\,\\,\\,\\,\\,\\,\\,$printf(\"%d\",F1(X,Y));\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$}\n" +
                        "$\\newline$}\n" +
                        "\n" +
                        "$\\newline$int main() {\n" +
                        "$\\newline$int A, B;\n" +
                        "$\\newline$scanf(\"%d %d\",&A, &B);\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$if ((A > 0) && (A < 1000)\n" +
                        "                $\\newline\\,\\,\\,\\,\\,\\,\\,\\,\\,\\,$&& (B > 1) && (B < 10)) {\n" +
                        "                $\\newline\\,\\,\\,\\,\\,\\,\\,\\,\\,\\,$F3(A,B);\n" +
                        "                $\\newline\\,\\,\\,\\,\\,\\,\\,\\,\\,\\,$printf(\"\\n\");\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$}\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$return 0;\n" +
                        "$\\newline$}\n" +
                        "\n" +
                        "$\\newline$No programa apresentado, a técnica da recursividade foi aplicada às três funções F1, F2 e F3. Essa técnica\n" +
                        "envolve a definição de uma função ou rotina que pode invocar a si própria.\n" +
                        "Com relação ao programa apresentado e à técnica de recursão, atribua F (falso) ou V (verdadeiro) para as\n" +
                        "afirmativas a seguir.\n" +
                        "\n" +
                        "$\\newline$( ) A chamada da função F1, através da expressão F1(X,Y), pode ser substituída, sem alterar o resultado\n" +
                        "do programa, pela expressão X%Y .\n" +
                        "$\\newline$( ) O objetivo da função F2 é retornar o valor da variável X elevado à Y-ésima potência.\n" +
                        "$\\newline$( ) A chamada à função F3 entrará em uma recursão sem fim se o valor da variável X for maior que o\n" +
                        "valor da variável Y.\n" +
                        "$\\newline$( ) A função main não é recursiva, pois na Linguagem C não é possível implementar esta técnica na\n" +
                        "função principal do programa.\n" +
                        "$\\newline$( ) A expressão ((A > 0) && (A < 1000) && (B > 1) && (B < 10)), da função main, pode ser substituída\n" +
                        "pela expressão (!((A <= 0) || (A >= 1000) || (B <= 1) || (B >= 10))), sem afetar o resultado do comando\n" +
                        "condicional if nesta expressão.\n" +
                        "\n" +
                        "$\\newline$Assinale a alternativa que contém, de cima para baixo, a sequência correta.");
        questaoAlternativa29.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa29.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa29.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa29.setAlternativaCorreta("e");

        questaoAlternativa29.setAlternativasA("F, V, F, F, V.");
        questaoAlternativa29.setAlternativasB("V, F, F, V, F.");
        questaoAlternativa29.setAlternativasC("V, V, F, V, V.");
        questaoAlternativa29.setAlternativasD("F, V, V, V, F.");
        questaoAlternativa29.setAlternativasE("V, F, F, F, V.");
        questaoAlternativa29.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa30 = new QuestaoAlternativa();
        questaoAlternativa30.setId(INICIOQUESTAO.longValue());
        questaoAlternativa30.setAno(ANO);
        questaoAlternativa30
                .setDescricao("O mecanismo de herança, no paradigma da programação orientada a objetos, é uma forma de reutilização\n" +
                        "de software na qual uma nova classe é criada, absorvendo membros de uma classe existente e aprimorada\n" +
                        "com capacidades novas ou modificadas.\n" +
                        "Considere as seguintes classes descritas na linguagem C++.\n" +
                        "\n" +
                        "$\\newline$#include <iostream>\n" +
                        "$\\newline$using namespace std;\n" +
                        "$\\newline$class A {\n" +
                        "$\\newline,$protected:\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$int v;\n" +
                        "$\\newline$public:\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$A() { v = 0; };\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$void m1() {\n" +
                        "               $\\newline\\,\\,\\,\\,\\,\\,\\,\\,\\,\\,$v += 10;\n" +
                        "               $\\newline\\,\\,\\,\\,\\,\\,\\,\\,\\,\\,$m2();\n" +
                        "$\\newline$};\n" +
                        "\n" +
                        "\n" +
                        "$\\newline$void m2() {\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$v += 20;\n" +
                        "$\\newline$};\n" +
                        "\n" +
                        "$\\newline$int getv() {\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$return v;\n" +
                        "        $\\newline\\,\\,\\,\\,$};\n" +
                        "$\\newline$};\n" +
                        "\n" +
                        "\n" +
                        "$\\newline$class B : public A {\n" +
                        "$\\newline$public:\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$void m2() {\n" +
                        "                $\\newline\\,\\,\\,\\,\\,\\,\\,\\,\\,\\,$v += 30;\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$};\n" +
                        "$\\newline$};\n" +
                        "\n" +
                        "$\\newline$Se essas classes forem utilizadas a partir do programa a seguir\n" +
                        "\n" +
                        "$\\newline$int main()\n" +
                        "$\\newline${\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$B *Obj = new B();\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$Obj->m1();\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$Obj->m2();\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$cout << Obj->getv() << endl;\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$return 0;\n" +
                        "$\\newline$}\n" +
                        "\n" +
                        "$\\newline$a saída do código computacional acima será:\n");
        questaoAlternativa30.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa30.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa30.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa30.setAlternativaCorreta("d");

        questaoAlternativa30.setAlternativasA("30");
        questaoAlternativa30.setAlternativasB("40");
        questaoAlternativa30.setAlternativasC("50");
        questaoAlternativa30.setAlternativasD("60");
        questaoAlternativa30.setAlternativasE("70");
        questaoAlternativa30.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa31 = new QuestaoAlternativa();
        questaoAlternativa31.setId(INICIOQUESTAO.longValue());
        questaoAlternativa31.setAno(ANO);
        questaoAlternativa31.setDescricao(
                "Sobre tipos union, considere as afirmativas a seguir.\n" +
                        "$\\newline$I. Uma union é um tipo que pode armazenar diferentes valores de tipo durante a execução do programa.\n" +
                        "$\\newline$II. Na linguagem C, a union é realizada por meio do mecanismo de construção de tipos struct.\n" +
                        "$\\newline$III. Na linguagem C++, a union é realizada através do mecanismo de construção de tipos class.\n" +
                        "$\\newline$IV. Nas linguagens Pascal e Ada, a union é construída mediante um registro variante, permitindo que a\n" +
                        "verificação de tipos de cada union seja discriminada.\n" +
                        "$\\newline$Assinale a alternativa correta.");
        questaoAlternativa31.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa31.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa31.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa31.setAlternativaCorreta("b");

        questaoAlternativa31.setAlternativasA("Somente as afirmativas I e II são corretas.");
        questaoAlternativa31.setAlternativasB("Somente as afirmativas I e IV são corretas.");
        questaoAlternativa31.setAlternativasC("Somente as afirmativas III e IV são corretas");
        questaoAlternativa31.setAlternativasD("Somente as afirmativas I, II e III são corretas");
        questaoAlternativa31.setAlternativasE("Somente as afirmativas II, III e IV são corretas.");
        questaoAlternativa31.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa32 = new QuestaoAlternativa();
        questaoAlternativa32.setId(INICIOQUESTAO.longValue());
        questaoAlternativa32.setAno(ANO);
        questaoAlternativa32.setDescricao("Anulada");
        questaoAlternativa32.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa32.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa32.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa32.setAlternativaCorreta("*");

        questaoAlternativa32.setAlternativasA("Anulada");
        questaoAlternativa32.setAlternativasB("Anulada");
        questaoAlternativa32.setAlternativasC("Anulada");
        questaoAlternativa32.setAlternativasD("Anulada");
        questaoAlternativa32.setAlternativasE("Anulada");
        questaoAlternativa32.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa33 = new QuestaoAlternativa();
        questaoAlternativa33.setId(INICIOQUESTAO.longValue());
        questaoAlternativa33.setAno(ANO);
        questaoAlternativa33.setDescricao(
                "Um computador apresenta um sistema de memória organizado em quatro níveis: memórias cache níveis\n" +
                        "1 e 2, memórias RAM principal e secundária. Programas prontos para execução são trazidos da memória\n" +
                        "secundária e transformados em processos na memória principal. Uma instrução para acessar dados na\n" +
                        "memória fornece o endereço real de memória onde se localiza a informação desejada. A informação é\n" +
                        "então buscada na cache nível 1. Se lá não for encontrada, ela é buscada no segundo nível de cache. Não\n" +
                        "sendo encontrada, a informação é finalmente buscada na memória principal.\n" +
                        "Qual o modo de endereçamento utilizado?\n");
        questaoAlternativa33.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa33.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa33.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa33.setAlternativaCorreta("c");

        questaoAlternativa33.setAlternativasA("Imediato");
        questaoAlternativa33.setAlternativasB("Indireto");
        questaoAlternativa33.setAlternativasC("Direto");
        questaoAlternativa33.setAlternativasD("Implícito");
        questaoAlternativa33.setAlternativasE("Relativo");
        questaoAlternativa33.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa34 = new QuestaoAlternativa();
        questaoAlternativa34.setId(INICIOQUESTAO.longValue());
        questaoAlternativa34.setAno(ANO);
        questaoAlternativa34.setDescricao(
                "Considere o conjunto de operações descritas a seguir, em linguagem de transferência entre registradores.\n" +
                        "$\\newline$$F1: REM ← CP;$\n" +
                        "$\\newline$$F2: RDM ← M[REM], CP ← CP + 1;$\n" +
                        "$\\newline$$F3: RI ← RDM;$\n" +
                        "\n" +
                        "$\\newline$Dados: REM é o registrador de endereços da memória; RDM é o registrador de dados da memória; RI\n" +
                        "é o registrador de instruções; CP é o contador de programa e M[X] é o conteúdo de memória indicado pelo\n" +
                        "endereço X.\n" +
                        "Assinale a alternativa que indica a que fase do processamento de uma instrução em uma máquina pipeline\n" +
                        "corresponde o conjunto de operações descrito.");
        questaoAlternativa34.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa34.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa34.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa34.setAlternativaCorreta("d");

        questaoAlternativa34.setAlternativasA("Decodificação de instrução.");
        questaoAlternativa34.setAlternativasB("Busca de operando");
        questaoAlternativa34.setAlternativasC("Execução de instrução.");
        questaoAlternativa34.setAlternativasD("Busca de instrução.");
        questaoAlternativa34.setAlternativasE("Armazenamento de resultado.");
        questaoAlternativa34.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa35 = new QuestaoAlternativa();
        questaoAlternativa35.setId(INICIOQUESTAO.longValue());
        questaoAlternativa35.setAno(ANO);
        questaoAlternativa35.setDescricao(
                "Embora ambos tenham seu escalonamento feito pelo gerenciamento de processos, threads e processos\n" +
                        "são estruturalmente distintos.\n" +
                        "Qual é a principal diferença entre eles?");
        questaoAlternativa35.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa35.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa35.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa35.setAlternativaCorreta("b");

        questaoAlternativa35
                .setAlternativasA("Apenas threads podem ser executados em paralelo.");
        questaoAlternativa35.setAlternativasB(
                "Threads possuem contexto simplificado.");
        questaoAlternativa35.setAlternativasC(
                "Processos executam mais rapidamente.");
        questaoAlternativa35.setAlternativasD(
                "Processos apenas podem ocorrer em sistemas de grande porte.");
        questaoAlternativa35.setAlternativasE(
                "Threads apenas podem ocorrer em processadores multicore.");
        questaoAlternativa35.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa36 = new QuestaoAlternativa();
        questaoAlternativa36.setId(INICIOQUESTAO.longValue());
        questaoAlternativa36.setAno(ANO);
        questaoAlternativa36.setDescricao(
                "Técnicas eficientes para o uso de memória, como memória virtual e caching, podem ser utilizadas porque");
        questaoAlternativa36.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa36.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa36.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa36.setAlternativaCorreta("d");

        questaoAlternativa36.setAlternativasA("aumentou o espaço de armazenamento em RAM.");
        questaoAlternativa36.setAlternativasB("memórias dinâmicas são mais rápidas que memórias estáticas");
        questaoAlternativa36.setAlternativasC("aumentou a velocidade de acesso para a memória RAM.");
        questaoAlternativa36.setAlternativasD("o princípio da localidade pode ser aplicado");
        questaoAlternativa36.setAlternativasE("o $thrashing$ não pode ocorrer em memórias modernas.");
        questaoAlternativa36.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa37 = new QuestaoAlternativa();
        questaoAlternativa37.setId(INICIOQUESTAO.longValue());
        questaoAlternativa37.setAno(ANO);
        questaoAlternativa37.setDescricao(
                "Um processador tem um ciclo de operação igual a 20ns. Ele gasta dois ciclos para fazer a busca de uma\n" +
                        "instrução, um ciclo para decodificar cada instrução, dois ciclos para buscar os operandos necessários\n" +
                        "e três ciclos para executar a instrução e armazenar o resultado correspondente em algum registrador.\n" +
                        "Se a organização desta máquina for estritamente sequencial, qual será o período de execução de uma\n" +
                        "instrução? Se utilizarmos latches de 2ns de atraso e considerarmos cada módulo como indivisível, qual\n" +
                        "será o período do pipeline se a máquina for organizada segundo uma estrutura de quatro estágios?");
        questaoAlternativa37.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa37.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa37.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa37.setAlternativaCorreta("e");

        questaoAlternativa37.setAlternativasA("Respectivamente 20ns e 22ns");
        questaoAlternativa37.setAlternativasB("Respectivamente 20ns e 42ns");
        questaoAlternativa37.setAlternativasC("Respectivamente 20ns e 62ns.");
        questaoAlternativa37.setAlternativasD("Respectivamente 160ns e 42ns.");
        questaoAlternativa37.setAlternativasE("Respectivamente 160ns e 62ns");
        questaoAlternativa37.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa38 = new QuestaoAlternativa();
        questaoAlternativa38.setId(INICIOQUESTAO.longValue());
        questaoAlternativa38.setAno(ANO);
        questaoAlternativa38.setDescricao(
                "Um analista de sistemas foi convidado para opinar sobre por que um determinado sistema tinha desempenho ruim. Considerando que o analista observou que o sistema tinha alta taxa de acesso a disco, por\n" +
                        "demanda de entrada e saída dos processos, qual das alternativas abaixo pode explicar o baixo desempenho?");
        questaoAlternativa38.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa38.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa38.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa38.setAlternativaCorreta("a");

        questaoAlternativa38.setAlternativasA("O sistema operacional gerenciava E/S pelo algoritmo FIFO.");
        questaoAlternativa38.setAlternativasB("O sistema operacional entrava em $deadlock$.");
        questaoAlternativa38.setAlternativasC("O sistema operacional entrava em $starvation$");
        questaoAlternativa38.setAlternativasD("O sistema operacional gerenciava E/S pelo algoritmo do elevador.");
        questaoAlternativa38.setAlternativasE("O sistema operacional usava dispositivos de DMA.");
        questaoAlternativa38.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa39 = new QuestaoAlternativa();
        questaoAlternativa39.setId(INICIOQUESTAO.longValue());
        questaoAlternativa39.setAno(ANO);
        questaoAlternativa39.setDescricao("Considerando uma função descrita em sua forma canônica de soma de produtos pelos mintermos 3, 7,\n" +
                "11, 12, 13, 14 e 15 de um mapa de Karnaugh e considerando a variável $A$ como o termo de mais alta ordem\n" +
                "lógica, $B$ como o de segunda maior ordem, $C$ como o de terceira maior ordem e $D$ como o de menor ordem\n" +
                "lógica, determine a sua representação lógica minimizada.\n");
        questaoAlternativa39.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa39.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa39.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa39.setAlternativaCorreta("b");

        questaoAlternativa39.setAlternativasA("$\\overline{A} B + C D$");
        questaoAlternativa39.setAlternativasB("$A B + C D$");
        questaoAlternativa39.setAlternativasC("$A \\overline{B} + C D$");
        questaoAlternativa39.setAlternativasD("$\\overline{A} \\overline{B} + C D$");
        questaoAlternativa39.setAlternativasE("$\\overline{A}  \\overline{B} + \\overline{C} \\overline{D}$");
        questaoAlternativa39.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa40 = new QuestaoAlternativa();
        questaoAlternativa40.setId(INICIOQUESTAO.longValue());
        questaoAlternativa40.setAno(ANO);
        questaoAlternativa40.setDescricao(
                "Considere o diagrama a seguir apresentado na imagem abaixo. \n" +
                        "Seja a máquina de estados finitos representada pelo diagrama acima, determine o modelo (Mealy ou Moore) e o circuito digital ao qual ela corresponde.");
        questaoAlternativa40.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa40.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa40.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa40.setAlternativaCorreta("a");
        questaoAlternativa40.setAlternativaImagem(true);
        questaoAlternativa40.setAlternativasA("Modelo de Mealy correspondente a um contador módulo 5.");
        questaoAlternativa40.setAlternativasB("Modelo de Moore correspondente a um contador módulo 5.");
        questaoAlternativa40.setAlternativasC("Modelo de Mealy correspondente a um identificador da sequência 100.");
        questaoAlternativa40.setAlternativasD("Moore correspondente a um identificador da sequência 100.");
        questaoAlternativa40.setAlternativasE("Modelo de Mealy correspondente a um $flip-flop$ JK.");
        questaoAlternativa40.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa40.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa41 = new QuestaoAlternativa();
        questaoAlternativa41.setId(INICIOQUESTAO.longValue());
        questaoAlternativa41.setAno(ANO);
        questaoAlternativa41
                .setDescricao("Considere o circuito digital apresentado no diagrama a seguir. Ressalte-se que, por convenção, chaves\n" +
                        "representadas por círculos escuros representam conexões fechadas e chaves representadas por círculos\n" +
                        "vazados representam conexões abertas.\n" +
                        "Assinale a alternativa correta.");
        questaoAlternativa41.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa41.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa41.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
        questaoAlternativa41.setAlternativaCorreta("c");
        questaoAlternativa41.setImagem(true);
        questaoAlternativa41.setAlternativasA("O circuito representa uma implementação em PAL da função $F= \\overline{A}B\\overline{C} + B\\overline{C}D + A\\overline{B}C$");
        questaoAlternativa41.setAlternativasB("O circuito representa uma implementação em FPGA da função $F=\\overline{A}B\\overline{C} + B\\overline{C}D + A\\overline{B}C$");
        questaoAlternativa41.setAlternativasC("O circuito representa uma implementação em PLA da função $F=\\overline{A}B\\overline{C} + B\\overline{C}D + A\\overline{B}C$");
        questaoAlternativa41.setAlternativasD("O circuito representa uma implementação em PAL da função $G=\\overline{A}B\\overline{C} + B\\overline{C}D + A\\overline{B}C$");
        questaoAlternativa41.setAlternativasE("O circuito representa uma implementação em PLA da função $G=\\overline{A}B\\overline{C} + B\\overline{C}D + A\\overline{B}C$");
        questaoAlternativa41.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa41.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa42 = new QuestaoAlternativa();
        questaoAlternativa42.setId(INICIOQUESTAO.longValue());
        questaoAlternativa42.setAno(ANO);
        questaoAlternativa42.setDescricao(
                "Considerando as linguagens L1 = $\\left\\{a^l c^m b^n; l ≥ 0, m ≥ 0, n ≥ 0\\right\\}$ e \n" +
                        "$L2 = \\left\\{a^l c^m b^n; l ≥ 0, m ≥ 0, n = l + m\\right\\}$ sobre\n" +
                        "o alfabeto $\\sum = \\left\\{a, b, c\\right\\}$, \n" +
                        "considere as afirmativas a seguir.\n" +
                        "\n" +
                        "I. $L1$ é uma linguagem regular.\n" +
                        "II. $L2$ é uma linguagem regular.\n" +
                        "III. Existe um autômato de pilha determinístico que reconhece L1.\n" +
                        "IV. A linguagem $L2$ pode ser gerada pela $G = \\left(\\\\left\\{X, Y \\right\\}, \\left\\{a, b, c\\right\\}, \\left\\{X → aXb, X → Y, Y → cY b, Y → λ\\right\\}, X\\right)$,\n" +
                        "onde λ é a palavra vazia.\n" +
                        "\n" +
                        "Assinale a alternativa correta.");
        questaoAlternativa42.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa42.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa42.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa42.setAlternativaCorreta("e");

        questaoAlternativa42.setAlternativasA("Somente as afirmativas I e II são corretas.");
        questaoAlternativa42.setAlternativasB("Somente as afirmativas II e IV são corretas.");
        questaoAlternativa42.setAlternativasC("Somente as afirmativas III e IV são corretas.");
        questaoAlternativa42.setAlternativasD("Somente as afirmativas I, II e III são corretas.");
        questaoAlternativa42.setAlternativasE("Somente as afirmativas I, III e IV são corretas.");
        questaoAlternativa42.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa43 = new QuestaoAlternativa();
        questaoAlternativa43.setId(INICIOQUESTAO.longValue());
        questaoAlternativa43.setAno(ANO);
        questaoAlternativa43.setDescricao(
                "Dados dois grafos não orientados \n" +
                        "\n" +
                        "$\\newline$G_1(V_1, E_1) e G2(V2, E2):G_1: V_1 = \\left\\{a, b, c\\right\\} E_1 = \\left\\{(a,b), (b,c), (a, c)\\right\\}\n" +
                        "$\\newline$G_2: V_2 = \\left\\{d, e\\right\\} E_2 = \\left\\{(d,e)\\right\\}\n" +
                        "\n" +
                        "\n" +
                        "$\\newline$Qual alternativa apresenta corretamente o grafo G_r(V, E) resultante da soma dos grafos G_1 e G_2?\n");
        questaoAlternativa43.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa43.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa43.setDisciplina(EDisciplina.GRAFOS);
        questaoAlternativa43.setAlternativaCorreta("d");

        questaoAlternativa43.setAlternativasA("G_r: V = \\left\\{a, b, c, d, e\\right\\} E = \\left\\{(a,b), (b,c), (a,c), (d,e)\\right\\}");
        questaoAlternativa43.setAlternativasB("G_r: V = \\left\\{a, b, c, d, e\\right\\} E = \\left\\{(a,d), (a,e), (b,d), (b,e), (c,d), (c,e), (d,e)\\right\\}");
        questaoAlternativa43.setAlternativasC(
                "G_r: V = \\left\\{a, b, c, d, e\\right\\} E = \\left\\{(a,b), (b,c), (a,c), (a,d), (a,e), (b,d), (b,e), (c,d), (c,e)\\right\\}");
        questaoAlternativa43.setAlternativasD(
                "G_r: V = \\left\\{a, b, c, d, e\\right\\} E = \\left\\{(a,b), (b,c), (a,c), (a,d), (a,e), (b,d), (b,e), (c,d), (c,e), (d,e)\\right\\}\n");
        questaoAlternativa43.setAlternativasE(
                "G_r: V = \\left\\{a, b, c, d, e\\right\\} E = \\left\\{(a,b), (b,c), (c,d), (d,e), (e,a)\\right\\}");
        questaoAlternativa43.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa44 = new QuestaoAlternativa();
        questaoAlternativa44.setId(INICIOQUESTAO.longValue());
        questaoAlternativa44.setAno(ANO);
        questaoAlternativa44.setDescricao("Anulada");

        questaoAlternativa44.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa44.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa44.setDisciplina(EDisciplina.BANCO_DE_DADOS);
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
        questaoAlternativa45.setDescricao("Anulada");

        questaoAlternativa45.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa45.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa45.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa45.setAlternativaCorreta("*");

        questaoAlternativa45.setAlternativasA("Anulada");
        questaoAlternativa45.setAlternativasB("Anulada");
        questaoAlternativa45.setAlternativasC("Anulada");
        questaoAlternativa45.setAlternativasD("Anulada");
        questaoAlternativa45.setAlternativasE("Anulada");
        questaoAlternativa45.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa46 = new QuestaoAlternativa();
        questaoAlternativa46.setId(INICIOQUESTAO.longValue());
        questaoAlternativa46.setAno(ANO);
        questaoAlternativa46.setDescricao("Qual é o número cromático do grafo $K_{3,2}$?");
        questaoAlternativa46.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa46.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa46.setDisciplina(EDisciplina.GRAFOS);
        questaoAlternativa46.setAlternativaCorreta("a");

        questaoAlternativa46.setAlternativasA("2");
        questaoAlternativa46.setAlternativasB("3");
        questaoAlternativa46.setAlternativasC("4");
        questaoAlternativa46.setAlternativasD("5");
        questaoAlternativa46.setAlternativasE("6");
        questaoAlternativa46.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa47 = new QuestaoAlternativa();
        questaoAlternativa47.setId(INICIOQUESTAO.longValue());
        questaoAlternativa47.setAno(ANO);
        questaoAlternativa47.setDescricao("Índices são estruturas de acesso auxiliares usados para aumentar a velocidade de recuperação de registros na resposta a certas condições de busca.\n" +
                "Com base nos conhecimentos sobre índices, considere as afirmativas a seguir.\n" +
                "\n" +
                "$\\newline$I. Um índice esparso possui uma entrada de índice para cada valor da chave de busca (portanto, para\n" +
                "cada registro) do arquivo de dados. Um índice denso possui entradas de índice para apenas alguns\n" +
                "dos valores da chave de busca.\n" +
                "$\\newline$II. Um arquivo de índice é um exemplo de arquivo sequencial; os pares chave-ponteiro podem ser tratados como registros classificados pelo valor da chave de pesquisa.\n" +
                "$\\newline$III. Um arquivo pode ter, no máximo, um índice secundário, utilizado para ordenar fisicamente os registros do arquivo no disco, porém um arquivo pode ter diversos índices primários, que podem ser\n" +
                "especificados sobre qualquer campo de um arquivo.\n" +
                "$\\newline$IV. Inserir ou eliminar registros no arquivo de dados resulta na mesma ação sobre o seu arquivo de índices (se ele for denso), à medida que um par chave-ponteiro para esse registro é inserido ou eliminado.\n" +
                "\n" +
                "$\\newline$Assinale a alternativa correta.");
        questaoAlternativa47.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa47.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa47.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa47.setAlternativaCorreta("b");

        questaoAlternativa47.setAlternativasA("Somente as afirmativas I e II são corretas.");
        questaoAlternativa47.setAlternativasB("Somente as afirmativas II e IV são corretas.");
        questaoAlternativa47.setAlternativasC("Somente as afirmativas III e IV são corretas.");
        questaoAlternativa47.setAlternativasD("Somente as afirmativas I, II e III são corretas.");
        questaoAlternativa47.setAlternativasE("Somente as afirmativas I, III e IV são corretas.");
        questaoAlternativa47.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa48 = new QuestaoAlternativa();
        questaoAlternativa48.setId(INICIOQUESTAO.longValue());
        questaoAlternativa48.setAno(ANO);
        questaoAlternativa48.setDescricao("Um arquivo é organizado logicamente como uma sequência de registros. Esses registros são mapeados\n" +
                "em blocos de discos. Com base no conhecimento sobre organização de arquivos, considere as afirmativas a seguir.\n" +
                "\n" +
                "$\\newline$I. As organizações de arquivos sequenciais exigem uma estrutura de índice para localizar os dados. De\n" +
                "outra forma, organizações de arquivos baseadas em hashing permitem-nos encontrar o endereço de\n" +
                "um item de dado diretamente por meio do cálculo de uma função sobre o valor da chave de procura\n" +
                "do registro desejado.\n" +
                "\n" +
                "$\\newline$II. As operações em arquivos são geralmente divididas em operações de recuperação e operações de\n" +
                "atualização: as primeiras não alteram nenhum valor no arquivo, apenas localizam certos registros,\n" +
                "de forma que seus valores de campo possam ser examinados e processados; as últimas mudam o\n" +
                "arquivo por meio da inclusão ou da exclusão de registros ou pela modificação de valores dos campos.\n" +
                "\n" +
                "$\\newline$III. Registros de tamanho fixo permitem campos repetidos, tamanhos variáveis para um ou mais campos\n" +
                "e ainda o armazenamento de múltiplos tipos de registro.\n" +
                "\n" +
                "$\\newline$IV. Nos arquivos desordenados (também conhecidos como arquivos pilha), os registros são posicionados no arquivo segundo a ordem pela qual foram incluídos, ou seja, novos registros são acrescentados no final do arquivo. Incluir um novo registro é muito eficiente, entretanto a pesquisa por um\n" +
                "registro, usando qualquer condição, envolve uma pesquisa sequencial bloco a bloco do arquivo, procedimento dispendioso.\n" +
                "\n" +
                "$\\newline$Assinale a alternativa correta.\n");
        questaoAlternativa48.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa48.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa48.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa48.setAlternativaCorreta("d");

        questaoAlternativa48.setAlternativasA("Somente as afirmativas I e II são corretas.");
        questaoAlternativa48.setAlternativasB("Somente as afirmativas I e III são corretas.");
        questaoAlternativa48.setAlternativasC("Somente as afirmativas III e IV são corretas.");
        questaoAlternativa48.setAlternativasD("Somente as afirmativas I, II e IV são corretas");
        questaoAlternativa48.setAlternativasE("Somente as afirmativas II, III e IV são corretas.");
        questaoAlternativa48.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa49 = new QuestaoAlternativa();
        questaoAlternativa49.setId(INICIOQUESTAO.longValue());
        questaoAlternativa49.setAno(ANO);
        questaoAlternativa49.setDescricao("Em uma Árvore B de ordem $m$, temos que: \n" +
                "\n" +
                "$\\newline$(i) cada nó contém no mínimo m registros (e m+1 descendentes) e no máximo $2m$ registros (e $2m+ 1$ descendentes), \n" +
                "exceto o nó raiz que pode conter entre $1$ e $2m$ registros;\n" +
                "\n" +
                "$\\newline$(ii) todas os nós folha aparecem no mesmo nível. Sobre Árvores B, é correto afirmar:");
        questaoAlternativa49.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa49.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa49.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa49.setAlternativaCorreta("a");

        questaoAlternativa49.setAlternativasA("O particionamento de nós em uma Árvore B ocorre quando um registro precisa ser inserido em um nó\n" +
                "com $2m$ registros.");
        questaoAlternativa49.setAlternativasB("O particionamento de nós em uma Árvore B ocorre quando um registro precisa ser inserido em um nó com\n" +
                "menos de $2m$ registros.");
        questaoAlternativa49.setAlternativasC("O particionamento de nós em uma Árvore B ocorre quando a chave do registro a ser inserido contém um valor\n" +
                "(conteúdo) intermediário entre os valores das chaves dos registros contidos no mesmo nó.");
        questaoAlternativa49.setAlternativasD("O particionamento de nós ocorre quando é necessário diminuir a altura da árvore.");
        questaoAlternativa49.setAlternativasE("Em uma Árvore B, aumenta em um nível sua altura, toda vez que ocorre o particionamento de um nó.");
        questaoAlternativa49.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa50 = new QuestaoAlternativa();
        questaoAlternativa50.setId(INICIOQUESTAO.longValue());
        questaoAlternativa50.setAno(ANO);
        questaoAlternativa50
                .setDescricao("Determinar a corretude da conjectura P \\neq NP constitui-se em um problema de decisão que desafia os\n" +
                        "cientistas da computação e matemáticos desde sua proposição. Levando-se em conta este problema e a\n" +
                        "teoria de decibilidade, considere as afirmativas a seguir.\n" +
                        "\n" +
                        "$\\newline$I. Não há algoritmo determinístico de tempo polinomial que solucione este problema de decisão.\n" +
                        "\n" +
                        "$\\newline$II. Existem apenas algoritmos não determinísticos para solucionar este problema de decisão.\n" +
                        "\n" +
                        "$\\newline$III. Existe um algoritmo determinístico de tempo polinomial para este problema de decisão.\n" +
                        "\n" +
                        "$\\newline$IV. Considerando-se os algoritmos “retorne sim” e “retorne não”, um deles é a solução para este problema de decisão.\n" +
                        "\n" +
                        "$\\newline$Assinale a alternativa correta.\n");
        questaoAlternativa50.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa50.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa50.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa50.setAlternativaCorreta("c");

        questaoAlternativa50.setAlternativasA("Somente as afirmativas I e II são corretas.");
        questaoAlternativa50.setAlternativasB("Somente as afirmativas I e IV são corretas.");
        questaoAlternativa50.setAlternativasC("Somente as afirmativas III e IV são corretas.");
        questaoAlternativa50.setAlternativasD("Somente as afirmativas I, II e III são corretas.");
        questaoAlternativa50.setAlternativasE(" Somente as afirmativas II, III e IV são corretas.");
        questaoAlternativa50.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa51 = new QuestaoAlternativa();
        questaoAlternativa51.setId(INICIOQUESTAO.longValue());
        questaoAlternativa51.setAno(ANO);
        questaoAlternativa51.setDescricao("No processo de síntese da imagem de uma cena tridimensional, também denominado pipeline gráfico,\n" +
                "diversas operações são executadas em sequência. O objetivo destas operações é converter as primitivas\n" +
                "geométricas que descrevem os objetos da cena em alto-nível, junto com a especificação da câmera sintética, em uma coleção de pixels na tela.\n" +
                "Assinale a alternativa que apresenta a sequência correta dessas operações.\n");
        questaoAlternativa51.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa51.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa51.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa51.setAlternativaCorreta("e");

        questaoAlternativa51.setAlternativasA("Projeção/Recorte/Rasterização/Visibilidade");
        questaoAlternativa51.setAlternativasB("Recorte/Projeção/Visibilidade/Rasterização");
        questaoAlternativa51.setAlternativasC("Projeção/Recorte/Visibilidade/Rasterização");
        questaoAlternativa51.setAlternativasD("Projeção/Rasterização/Recorte/Visibilidade");
        questaoAlternativa51.setAlternativasE("Recorte/Projeção/Rasterização/Visibilidade");
        questaoAlternativa51.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa52 = new QuestaoAlternativa();
        questaoAlternativa52.setId(INICIOQUESTAO.longValue());
        questaoAlternativa52.setAno(ANO);
        questaoAlternativa52.setDescricao("Considere as afirmativas a seguir.\n" +
                "\n" +
                "$\\newline$I. O modelo de iluminação de Phong obtém as cores internas aos polígonos por interpolação das cores\n" +
                "nos vértices.\n" +
                "\n" +
                "$\\newline$II. A técnica de z-buffer utiliza ordenação de primitivas para determinação dos pixels visíveis.\n" +
                "\n" +
                "$\\newline$III. O ponto (2,1,3,2), expresso em coordenadas homogêneas, equivale ao ponto (1.0, 0.5, 1.5) em coordenadas cartesianas tridimensionais.\n" +
                "\n" +
                "$\\newline$IV. Uma das principais vantagens da representação de objetos como malhas poligonais triangulares é a\n" +
                "\n" +
                "garantia de que todas as faces são planares.\n" +
                "$\\newline$Assinale a alternativa correta.");
        questaoAlternativa52.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa52.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa52.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa52.setAlternativaCorreta("c");

        questaoAlternativa52.setAlternativasA("Somente as afirmativas I e II são corretas.");
        questaoAlternativa52.setAlternativasB("Somente as afirmativas I e IV são corretas.");
        questaoAlternativa52.setAlternativasC("Somente as afirmativas III e IV são corretas.");
        questaoAlternativa52.setAlternativasD("Somente as afirmativas I, II e III são corretas.");
        questaoAlternativa52.setAlternativasE("Somente as afirmativas II, III e IV são corretas.");
        questaoAlternativa52.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa53 = new QuestaoAlternativa();
        questaoAlternativa53.setId(INICIOQUESTAO.longValue());
        questaoAlternativa53.setAno(ANO);
        questaoAlternativa53
                .setDescricao("Considere um objeto em 3D ancorado no seu centro de massa $p = \\left(x_c, y_c, z_c\\right)$. Qual a transformação\n" +
                        "necessária para rotacioná-lo em $Θ$ graus, contra relógio, ao redor do eixo $x$, sem alterar a sua posição no\n" +
                        "espaço? Assuma que a matriz $T$ realiza translações, a matriz $R_x$ realiza rotações de $Θ$ graus ao redor do\n" +
                        "eixo $x$, contra relógio.\n");
        questaoAlternativa53.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa53.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa53.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa53.setAlternativaCorreta("c");

        questaoAlternativa53.setAlternativasA("T\\left(−p\\right).R_x\\left(Θ\\right).T\\left(p\\right)");
        questaoAlternativa53.setAlternativasB("T\\left(−p\\right).Rx\\left(Θ\\right)");
        questaoAlternativa53.setAlternativasC("T\\left(p\\right).Rx\\left(Θ\\right).T\\left(−p\\right)");
        questaoAlternativa53.setAlternativasD("R_x\\left(Θ\\right).T\\left(−p\\right)");
        questaoAlternativa53.setAlternativasE("T\\left(p\\right).Rx\\left(Θ\\right).T\\left(p\\right)");
        questaoAlternativa53.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa54 = new QuestaoAlternativa();
        questaoAlternativa54.setId(INICIOQUESTAO.longValue());
        questaoAlternativa54.setAno(ANO);
        questaoAlternativa54
                .setDescricao("Assinale a alternativa que indica a função de transformação $T\\left(r\\right)$ utilizada para se obter a imagem negativa\n" +
                        "de uma imagem monocromática, em que os pixels podem assumir valores no intervalo entre 0 e L-1 e em\n" +
                        "que r representa o valor do pixel na imagem original.\n");
        questaoAlternativa54.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa54.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa54.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa54.setAlternativaCorreta("a");

        questaoAlternativa54.setAlternativasA("$T\\left(r\\right) = \\left(L − 1\\right) − r$");
        questaoAlternativa54.setAlternativasB("$T\\left(r\\right) = −r$");
        questaoAlternativa54.setAlternativasC(" T\\left(r\\right) = c \\log_{b}(1 + |r|), onde c é uma constante de escala\n");
        questaoAlternativa54.setAlternativasD("T\\left(r\\right) = 1 − r");
        questaoAlternativa54.setAlternativasE("T\\left(r\\right) = \\left(L − 1\\right)/r");
        questaoAlternativa54.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa55 = new QuestaoAlternativa();
        questaoAlternativa55.setId(INICIOQUESTAO.longValue());
        questaoAlternativa55.setAno(ANO);
        questaoAlternativa55.setDescricao("A correta tonalização de um poliedro requer que vetores normais à sua superfície sejam definidos em cada\n" +
                "ponto de sua malha.\n" +
                "Para tonalizar uma esfera definida parametricamente por $$p\\left(u, v\\right) = \\left[\\cos\\left(u\\right)\\sin\\left(v\\right), \\cos\\left(u\\right)\\cos\\left(v\\right), \\sin\\left(u\\right)\\right]T$$, \n" +
                "onde $u$ varia entre $\\left[−π/2, π/2\\right]$ e v varia entre $\\left[−π, π\\right]$, é preciso descobrir a forma implícita de sua normal $n\\left(u, v\\right)$.\n" +
                "Como ela é definida?");
        questaoAlternativa55.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa55.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa55.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa55.setAlternativaCorreta("b");

        questaoAlternativa55.setAlternativasA("$n\\left(u, v\\right) = \\cos\\left(u\\right)p\\left(u, v\\right) + \\cos\\left(v\\right)p\\left(u, v\\right)$");
        questaoAlternativa55.setAlternativasB(
                "$n\\left(u, v\\right) = \\cos\\left(u\\right)p\\left(u, v\\right)$");
        questaoAlternativa55.setAlternativasC("$n\\left(u, v\\right) = −\\cos\\left(v\\right)p\\left(u, v\\right)$");
        questaoAlternativa55.setAlternativasD(
                "$n\\left(u, v\\right) = 1/p\\left(u, v\\right)$");
        questaoAlternativa55.setAlternativasE("$n\\left(u, v\\right) = 2p\\left(u, v\\right)$");
        questaoAlternativa55.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa56 = new QuestaoAlternativa();
        questaoAlternativa56.setId(INICIOQUESTAO.longValue());
        questaoAlternativa56.setAno(ANO);
        questaoAlternativa56.setDescricao(
                "Em uma rede de computadores, cujos roteadores estão configurados para atualizar suas tabelas de roteamento por meio do emprego de protocolos de roteamento, é correto afirmar:");
        questaoAlternativa56.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa56.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa56.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa56.setAlternativaCorreta("a");

        questaoAlternativa56.setAlternativasA("Roteadores de borda, que ligam a rede local a redes remotas, tipicamente suportam dois protocolos\n" +
                "de roteamento: um protocolo interno para a comunicação com os roteadores locais e um protocolo\n" +
                "externo para a comunicação com os roteadores de redes remotas.");
        questaoAlternativa56.setAlternativasB("Ao se interromper o uso dos protocolos do roteamento, a rede deixará de operar porque não haverá possibilidade de atualização das tabelas de roteamento dos roteadores.");
        questaoAlternativa56.setAlternativasC("Roteadores que empregam protocolos de roteamento trocam mensagens de controle de tais protocolos apenas\n" +
                "quando os enlaces da rede se tornam inoperantes ou quando os mesmos voltam a operar.");
        questaoAlternativa56.setAlternativasD("O RIP (Routing Information Protocol), que emprega o algoritmo de roteamento vetor distância, vem sucedendo\n" +
                "nas redes locais o protocolo OSPF (Open Shortest Path First), o qual emprega o algoritmo estado de enlace.");
        questaoAlternativa56.setAlternativasE("Protocolos de aplicação, como o HTTP, podem diretamente controlar os protocolos de roteamento ao solicitarem que os roteadores da rede calculem rotas alternativas para transportar o tráfego dos protocolos de\n" +
                "aplicação.\n");
        questaoAlternativa56.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa57 = new QuestaoAlternativa();
        questaoAlternativa57.setId(INICIOQUESTAO.longValue());
        questaoAlternativa57.setAno(ANO);
        questaoAlternativa57.setDescricao(
                "O problema de tratamento de regiões críticas é agravado em sistemas distribuídos, nos quais a não existência de um controle centralizado dificulta a exclusão mútua. No algoritmo de Ricart-Agrawala, a entrada\n" +
                        "na região crítica, quando mais de um processo quer entrar nela, é feita após o processo");
        questaoAlternativa57.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa57.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa57.setDisciplina(EDisciplina.SISTEMAS_DISTRIBUIDOS);
        questaoAlternativa57.setAlternativaCorreta("c");

        questaoAlternativa57
                .setAlternativasA("passar a ter o menor valor de relógio lógico entre todos os processos.\n");
        questaoAlternativa57.setAlternativasB(
                "passar a ter o menor valor de relógio lógico entre todos os processos.\n");
        questaoAlternativa57.setAlternativasC(
                " receber autorização de entrada dos demais processos, sendo a mesma concedida quando o valor do\n" +
                        "relógio lógico de quem autoriza for maior que o de quem solicita.");
        questaoAlternativa57.setAlternativasD(
                "receber autorização de entrada dos demais processos, sendo a mesma concedida quando o valor do relógio\n" +
                        "lógico de quem autoriza for menor que o de quem solicita.");
        questaoAlternativa57.setAlternativasE(
                "receber autorização de entrada dos processos que tenham valor de relógio lógico menor.");
        questaoAlternativa57.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa58 = new QuestaoAlternativa();
        questaoAlternativa58.setId(INICIOQUESTAO.longValue());
        questaoAlternativa58.setAno(ANO);
        questaoAlternativa58
                .setDescricao("O SNMP (Simple Network Management Protocol) é o mais difundido protocolo de gerenciamento de redes\n" +
                        "TCP/IP.\n" +
                        "Sobre o SNMP, é correto afirmar:");
        questaoAlternativa58.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa58.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa58.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa58.setAlternativaCorreta("e");

        questaoAlternativa58.setAlternativasA(
                "A versão 1 do SNMP, apesar de empregar mensagens criptografadas, não possui mecanismo de autenticação de mensagens junto aos dispositivos gerenciados.");
        questaoAlternativa58
                .setAlternativasB("A mensagem SetRequest é utilizada tanto para alterar quanto para ler o valor das instâncias dos objetos\n" +
                        "gerenciados.");
        questaoAlternativa58.setAlternativasC("A configuração de dispositivos de rede por meio do SNMP é mais aceita que a monitoração de redes pelo\n" +
                "SNMP.");
        questaoAlternativa58
                .setAlternativasD("Mensagens trap são utilizadas por gerentes SNMP para notificar agentes SNMP sobre as modificações internas\n" +
                        "do sistema de gerenciamento.\n");
        questaoAlternativa58.setAlternativasE(
                "A mensagem GetBulkRequest permite a recuperação de várias instâncias de um mesmo objeto.");
        questaoAlternativa58.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa59 = new QuestaoAlternativa();
        questaoAlternativa59.setId(INICIOQUESTAO.longValue());
        questaoAlternativa59.setAno(ANO);
        questaoAlternativa59.setDescricao(
                "O mecanismo de RPC é bastante utilizado para a programação em sistemas distribuídos.\n" +
                        "Implementações mais eficientes desse mecanismo permitem a realização de RPC assíncrono, em que\n");
        questaoAlternativa59.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa59.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa59.setDisciplina(EDisciplina.SISTEMAS_DISTRIBUIDOS);
        questaoAlternativa59.setAlternativaCorreta("d");

        questaoAlternativa59.setAlternativasA("o processo que faz a chamada pode fazer uso de redes assíncronas.");
        questaoAlternativa59.setAlternativasB("o processo que recebe a chamada pode responder várias chamadas simultaneamente.\n");
        questaoAlternativa59.setAlternativasC("o processo que recebe a chamada responde chamadas assíncronas com máxima prioridade.");
        questaoAlternativa59.setAlternativasD("o processo que faz a chamada pode continuar executando após receber confirmação da transmissão.");
        questaoAlternativa59.setAlternativasE("os dois processos bloqueiam os demais, a fim de ter acesso exclusivo ao meio de comunicação");
        questaoAlternativa59.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa60 = new QuestaoAlternativa();
        questaoAlternativa60.setId(INICIOQUESTAO.longValue());
        questaoAlternativa60.setAno(ANO);
        questaoAlternativa60.setDescricao(
                "Sistemas de arquivos distribuídos demandam uma atenção especial pela necessidade de tratamento de\n" +
                        "requisições múltiplas e garantia de consistência. O sistema CODA (usado em várias versões do UNIX,\n" +
                        "incluindo o Linux) é eficiente por, entre outras coisas, usar o mecanismo de RPC2 para comunicação.\n" +
                        "O RPC2 se diferencia de outros mecanismos baseados em RPC por permitir");
        questaoAlternativa60.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa60.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa60.setDisciplina(EDisciplina.SISTEMAS_DISTRIBUIDOS);
        questaoAlternativa60.setAlternativaCorreta("b");

        questaoAlternativa60.setAlternativasA("paralelismo de chamadas e chamadas assíncronas.");
        questaoAlternativa60.setAlternativasB("paralelismo de chamadas e o uso de protocolos específicos de aplicação.");
        questaoAlternativa60
                .setAlternativasC("chamadas assíncronas e garantir a entrega de chamadas.\n");
        questaoAlternativa60.setAlternativasD("o uso de protocolos específicos de aplicação e garantir a entrega de chamadas.\n");
        questaoAlternativa60.setAlternativasE("chamadas assíncronas e o uso de protocolos específicos de aplicação.");
        questaoAlternativa60.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa61 = new QuestaoAlternativa();
        questaoAlternativa61.setId(INICIOQUESTAO.longValue());
        questaoAlternativa61.setAno(ANO);
        questaoAlternativa61.setDescricao("Considere um banco de dados relacional composto pelas tabelas definidas a seguir, na linguagem SQL,\n" +
                "em que são cadastrados alunos, disciplinas e as matrículas de alunos em disciplinas.\n" +
                "\n" +
                "$\\newline$CREATE TABLE Aluno (\n" +
                "         $\\newline\\,\\,\\,\\,\\,\\,$RA INTEGER NOT NULL,\n" +
                "         $\\newline\\,\\,\\,\\,\\,\\,$Nome VARCHAR2(20) NOT NULL,\n" +
                "         $\\newline\\,\\,\\,\\,\\,\\,$Curso INTEGER NOT NULL,\n" +
                "         $\\newline\\,\\,\\,\\,\\,\\,$PRIMARY KEY (RA) );\n" +
                "\n" +
                "$\\newline$CREATE TABLE Disciplina (\n" +
                "         $\\newline\\,\\,\\,\\,\\,\\,$Codigo INTEGER NOT NULL,\n" +
                "         $\\newline\\,\\,\\,\\,\\,\\,$Nome VARCHAR2(20) NOT NULL,\n" +
                "         $\\newline\\,\\,\\,\\,\\,\\,$Departamento INTEGER NOT NULL,\n" +
                "         $\\newline\\,\\,\\,\\,\\,\\,$PRIMARY KEY (Codigo) );\n" +
                "\n" +
                "\n" +
                "$\\newline$CREATE TABLE Matricula (\n" +
                "         $\\newline\\,\\,\\,\\,\\,\\,$RA INTEGER NOT NULL,\n" +
                "         $\\newline\\,\\,\\,\\,\\,\\,$Codigo INTEGER NOT NULL,\n" +
                "         $\\newline\\,\\,\\,\\,\\,\\,$Ano INTEGER NOT NULL,\n" +
                "         $\\newline\\,\\,\\,\\,\\,\\,$PRIMARY KEY (RA, Codigo),\n" +
                "         $\\newline\\,\\,\\,\\,\\,\\,$FOREIGN KEY (Codigo) REFERENCES Disciplina,\n" +
                "         $\\newline\\,\\,\\,\\,\\,\\,$FOREIGN KEY (RA) REFERENCES Aluno);\n" +
                "        \n" +
                "$\\newline$Considere também a consulta a seguir, expressa na linguagem SQL, em que o operador MINUS realiza a\n" +
                "operação de subtração de relações.\n" +
                "\n" +
                "$\\newline$SELECT Nome FROM Aluno A WHERE NOT EXISTS ( \n" +
                "                 $\\newline$(SELECT D.Codigo FROM Disciplina D WHERE D.Departamento = 5) \n" +
                "                 $\\newline$MINUS\n" +
                "                 $\\newline$(SELECT M.Codigo FROM Matricula M WHERE M.RA = A.RA)\n" +
                "        ) \n" +
                "         $\\newline$AND EXISTS (SELECT D.Codigo FROM Disciplina D WHERE D.Departamento = 5)\n" +
                "\n" +
                "\n" +
                "$\\newline$Considere, por fim, as afirmativas a seguir, sobre a consulta apresentada.\n" +
                "$\\newline$I. A consulta retorna os nomes dos alunos matriculados em todas as disciplinas do departamento 5.\n" +
                "\n" +
                "$\\newline$II. A consulta retorna os nomes dos alunos matriculados em, pelo menos, uma disciplina do departamento 5.\n" +
                "\n" +
                "$\\newline$III. A consulta retorna os nomes das disciplinas do departamento 5 nas quais todos os alunos estão\n" +
                "matriculados.\n" +
                "\n" +
                "$\\newline$IV. A estrutura dessa consulta permite implementar, na linguagem SQL, a operação de divisão da Álgebra\n" +
                "Relacional.\n" +
                "\n" +
                "$\\newline$Assinale a alternativa correta.");
        questaoAlternativa61.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa61.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa61.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa61.setAlternativaCorreta("b");

        questaoAlternativa61.setAlternativasA("Somente as afirmativas I e II são corretas.");
        questaoAlternativa61.setAlternativasB("Somente as afirmativas I e IV são corretas.");
        questaoAlternativa61.setAlternativasC("Somente as afirmativas III e IV são corretas.");
        questaoAlternativa61.setAlternativasD("Somente as afirmativas I, II e III são corretas.");
        questaoAlternativa61.setAlternativasE("Somente as afirmativas II, III e IV são corretas.");
        questaoAlternativa61.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa62 = new QuestaoAlternativa();
        questaoAlternativa62.setId(INICIOQUESTAO.longValue());
        questaoAlternativa62.setAno(ANO);
        questaoAlternativa62.setDescricao(
                "A Engenharia de Requisitos é um processo que envolve todas as atividades exigidas para criar e manter\n" +
                        "o documento de requisitos de sistema.\n" +
                        "Sobre a Engenharia de Requisitos, considere as afirmativas a seguir.\n" +
                        "$\\newline$I. A Engenharia de Requisitos, como todas as outras atividades de Engenharia de Software, precisa\n" +
                        "ser adaptada às necessidades do processo, do projeto, do produto e do pessoal que está fazendo o\n" +
                        "trabalho.\n" +
                        "$\\newline$II. No estágio de levantamento e análise dos requisitos, os membros da equipe técnica de desenvolvimento do software trabalham com o cliente e os usuários finais do sistema para descobrir mais\n" +
                        "informações sobre o domínio da aplicação, que serviços o sistema deve oferecer, o desempenho\n" +
                        "exigido do sistema, as restrições de hardware, entre outras informações.\n" +
                        "$\\newline$III. Na medida em que a informação de vários pontos de vista é coletada, os requisitos emergentes são\n" +
                        "consistentes.\n" +
                        "$\\newline$IV. A validação de requisitos se ocupa de mostrar que estes realmente definem o sistema que o cliente\n" +
                        "deseja. Ela é importante porque a ocorrência de erros em um documento de requisitos pode levar a\n" +
                        "grandes custos relacionados ao retrabalho.\n" +
                        "$\\newline$Assinale a alternativa correta.");
        questaoAlternativa62.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa62.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa62.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa62.setAlternativaCorreta("d");

        questaoAlternativa62.setAlternativasA("Somente as afirmativas I e II são corretas.");
        questaoAlternativa62.setAlternativasB("Somente as afirmativas I e III são corretas.");
        questaoAlternativa62.setAlternativasC("Somente as afirmativas III e IV são corretas.");
        questaoAlternativa62.setAlternativasD("Somente as afirmativas I, II e IV são corretas.");
        questaoAlternativa62.setAlternativasE("Somente as afirmativas II, III e IV são corretas.");
        questaoAlternativa62.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa63 = new QuestaoAlternativa();
        questaoAlternativa63.setId(INICIOQUESTAO.longValue());
        questaoAlternativa63.setAno(ANO);
        questaoAlternativa63.setDescricao(
                "A UML (Unified Modeling Language) é uma linguagem padrão para a elaboração da estrutura de projetos\n" +
                        "que pode ser empregada para a visualização, a especificação, a construção e a documentação de artefatos. No contexto da UML, um relacionamento é uma conexão entre itens, representado graficamente como\n" +
                        "um caminho, com tipos diferentes de linhas para diferenciar os tipos de relacionamento.\n" +
                        "Com base no enunciado e nos conhecimentos sobre o tema, correlacione os tipos de relacionamentos e\n" +
                        "suas respectivas descrições.\n" +
                        "\n" +
                        "$\\newline$(I) É um relacionamento de utilização, determinando que um item\n" +
                        "usa as informações e serviços de outro item, mas não necessariamente o inverso.\n" +
                        "$\\newline$(A) Associação\n" +
                        "$\\newline$(II) É um relacionamento entre itens gerais e tipos mais específicos\n" +
                        "desses itens.\n" +
                        "$\\newline$(B) Dependência\n" +
                        "$\\newline$(III) É um relacionamento estrutural que especifica objetos de um item\n" +
                        "conectados a objetos de outro item. A partir deste relacionamento, é possível navegar do objeto de uma classe até o objeto\n" +
                        "de outra classe e vice-versa.\n" +
                        "$\\newline$(C) Generalização\n" +
                        "\n" +
                        "$\\newline$Assinale a alternativa que contém a associação correta.\n");
        questaoAlternativa63.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa63.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa63.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa63.setAlternativaCorreta("c");

        questaoAlternativa63.setAlternativasA("I-A; II-B; III-C.");
        questaoAlternativa63.setAlternativasB("I-B; II-A; III-C");
        questaoAlternativa63.setAlternativasC("I-B; II-C; III-A.");
        questaoAlternativa63.setAlternativasD("I-C; II-B; III-A.");
        questaoAlternativa63.setAlternativasE("I-C; II-A; III-B.");
        questaoAlternativa63.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa64 = new QuestaoAlternativa();
        questaoAlternativa64.setId(INICIOQUESTAO.longValue());
        questaoAlternativa64.setAno(ANO);
        questaoAlternativa64.setDescricao("Considere o bloco básico apresentado na imagem abaixo.\n" +
                "Assinale a alternativa que apresenta a transformação de código local que pode ser aplicada no bloco\n" +
                "básico.\n");
        questaoAlternativa64.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa64.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa64.setDisciplina(EDisciplina.COMPILADORES);
        questaoAlternativa64.setAlternativaCorreta("a");
        questaoAlternativa64.setImagem(true);
        questaoAlternativa64.setAlternativasA("Eliminação de código morto.");
        questaoAlternativa64.setAlternativasB("Propagação de cópias.");
        questaoAlternativa64.setAlternativasC("Eliminação de subexpressões comuns.");
        questaoAlternativa64.setAlternativasD("Propagação de constantes.");
        questaoAlternativa64.setAlternativasE("Eliminação de variáveis de indução.");
        questaoAlternativa64.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa64.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa65 = new QuestaoAlternativa();
        questaoAlternativa65.setId(INICIOQUESTAO.longValue());
        questaoAlternativa65.setAno(ANO);
        questaoAlternativa65.setDescricao("Considere o trecho de código C a seguir.\n" +
                "\n" +
                "$\\newline$int main() {\n" +
                "        \n" +
                "        $\\newline\\,\\,\\,\\,\\,\\,$int i;\n" +
                "        $\\newline\\,\\,\\,\\,\\,\\,$float f;\n" +
                "        $\\newline\\,\\,\\,\\,\\,\\,$int v[10]\n" +
                "        \n" +
                "        $\\newline\\,\\,\\,\\,\\,\\,$i 3;\n" +
                "        $\\newline\\,\\,\\,\\,\\,\\,$v[f] = 45;\n" +
                "        $\\newline\\,\\,\\,\\,\\,\\,$while {\n" +
                "        $\\newline$\n" +
                "        $\\newline\\,\\,\\,\\,\\,\\,$}\n" +
                "$\\newline$}\n" +
                "\n" +
                "$\\newline$Quantos erros semânticos o código possui?\n");
        questaoAlternativa65.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa65.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa65.setDisciplina(EDisciplina.COMPILADORES);
        questaoAlternativa65.setAlternativaCorreta("a");

        questaoAlternativa65.setAlternativasA("1");
        questaoAlternativa65.setAlternativasB("2");
        questaoAlternativa65.setAlternativasC("3");
        questaoAlternativa65.setAlternativasD("4");
        questaoAlternativa65.setAlternativasE("5");
        questaoAlternativa65.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa66 = new QuestaoAlternativa();
        questaoAlternativa66.setId(INICIOQUESTAO.longValue());
        questaoAlternativa66.setAno(ANO);
        questaoAlternativa66.setDescricao("Com base no conhecimento sobre Redes Neurais Artificiais, considere as afirmativas a seguir.\n" +
                "\n" +
                "$\\newline$I. A função booleana ou exclusivo (XOR) pode ser implementada usando uma rede perceptron de camada única.\n" +
                "\n" +
                "$\\newline$II. Redes Neurais Artificiais do tipo MLP (Multilayer Perceptron) são capazes de classificar padrões de\n" +
                "entrada não linearmente separáveis.\n" +
                "\n" +
                "$\\newline$III. Retropropagação (backpropagation) é um algoritmo de aprendizagem supervisionada.\n" +
                "\n" +
                "$\\newline$IV. Redes Neurais Artificiais são apropriadas para a prova automática de teoremas.\n" +
                "\n" +
                "$\\newline$Assinale a alternativa correta.\n");
        questaoAlternativa66.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa66.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa66.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa66.setAlternativaCorreta("b");

        questaoAlternativa66.setAlternativasA("Somente as afirmativas I e IV são corretas.");
        questaoAlternativa66.setAlternativasB("Somente as afirmativas II e III são corretas.");
        questaoAlternativa66.setAlternativasC("Somente as afirmativas III e IV são corretas.");
        questaoAlternativa66.setAlternativasD("Somente as afirmativas I, II e III são corretas.");
        questaoAlternativa66.setAlternativasE("Somente as afirmativas I, II e IV são corretas.");
        questaoAlternativa66.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa67 = new QuestaoAlternativa();
        questaoAlternativa67.setId(INICIOQUESTAO.longValue());
        questaoAlternativa67.setAno(ANO);
        questaoAlternativa67.setDescricao(
                "PSobre Ciclo de Vida de Desenvolvimento de Software, é correto afirmar:\n" +
                        "\n" +
                        "$\\newline$I. O desenvolvimento em cascata tem como base a ideia de desenvolver uma implementação inicial,\n" +
                        "mostrar e discutir tal implementação com o usuário e fazer seu aprimoramento por meio de versões\n" +
                        "subsequentes, até que um sistema adequado tenha sido desenvolvido.\n" +
                        "\n" +
                        "$\\newline$II. No modelo de processo de desenvolvimento em espiral, cada loop na espiral representa uma fase\n" +
                        "do processo de software. Este modelo exige a consideração direta dos riscos técnicos em todos os\n" +
                        "estágios do projeto e, se aplicado adequadamente, deve reduzir os riscos antes que eles se tornem\n" +
                        "problemáticos.\n" +
                        "\n" +
                        "$\\newline$III. O Rapid Application Development (Desenvolvimento Rápido de Aplicação) é um modelo de processo\n" +
                        "de software incremental que enfatiza um ciclo de desenvolvimento rápido. Este modelo é uma adaptação de modelo cascata, no qual o desenvolvimento rápido é conseguido com o uso de uma abordagem de construção baseada em componentes.\n" +
                        "\n" +
                        "$\\newline$IV. O modelo incremental combina elementos do modelo em cascata aplicado de maneira iterativa. Em\n" +
                        "um processo de desenvolvimento incremental, os clientes identificam (esboçam) as funções a serem\n" +
                        "fornecidas pelo sistema e a importância das mesmas. Em seguida, é definida uma série de estágios\n" +
                        "de entrega, com cada estágio fornecendo um subconjunto das funcionalidades do sistema.\n" +
                        "\n" +
                        "$\\newline$Assinale a alternativa correta.\n");
        questaoAlternativa67.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa67.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa67.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa67.setAlternativaCorreta("e");

        questaoAlternativa67.setAlternativasA("Somente as afirmativas I e II são corretas.");
        questaoAlternativa67.setAlternativasB("Somente as afirmativas I e III são corretas.");
        questaoAlternativa67.setAlternativasC("Somente as afirmativas III e IV são corretas.");
        questaoAlternativa67.setAlternativasD("Somente as afirmativas I, II e IV são corretas.");
        questaoAlternativa67.setAlternativasE("Somente as afirmativas II, III e IV são corretas.");
        questaoAlternativa67.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa68 = new QuestaoAlternativa();
        questaoAlternativa68.setId(INICIOQUESTAO.longValue());
        questaoAlternativa68.setAno(ANO);
        questaoAlternativa68
                .setDescricao("Considere os tipos de gramáticas para análise sintática a seguir.\n" +
                        "\n" +
                        "        $\\newline$I. Gramática de precedência simples.\n" +
                        "\n" +
                        "       $\\newline$II. Gramática LL(1).\n" +
                        "\n" +
                        "        $\\newline$III. Gramática de operadores.\n" +
                        "\n" +
                        "$\\newline$Qual alternativa indica o método correto de análise sintática para cada uma das gramáticas apresentadas?\n?");
        questaoAlternativa68.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa68.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa68.setDisciplina(EDisciplina.COMPILADORES);
        questaoAlternativa68.setAlternativaCorreta("d");

        questaoAlternativa68.setAlternativasA("I - Análise Descendente, II - Análise Descendente, III - Análise Ascendente.\n");
        questaoAlternativa68.setAlternativasB("I - Análise Ascendente, II - Análise Ascendente, III - Análise Descendente.");
        questaoAlternativa68.setAlternativasC("I - Análise Descendente, II - Análise Ascendente, III - Análise Descendente.");
        questaoAlternativa68.setAlternativasD("I - Análise Ascendente, II - Análise Descendente, III - Análise Ascendente.");
        questaoAlternativa68.setAlternativasE("I - Análise Ascendente, II - Análise Ascendente, III - Análise Ascendente.\n");
        questaoAlternativa68.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa69 = new QuestaoAlternativa();
        questaoAlternativa69.setId(INICIOQUESTAO.longValue());
        questaoAlternativa69.setAno(ANO);
        questaoAlternativa69.setDescricao(
                "Considere o esquema de um banco de dados relacional EMPRESA apresentado na imagem abaixo. As setas indicam as chaves\n" +
                        "estrangeiras e o sublinhado indica a chave primária.\n" +
                        "Considere a especificação dos seguintes comandos em SQL aplicados sobre o esquema de banco de\n" +
                        "dados apresentado.\n" +
                        "\n" +
                        "$\\newline$I.\n" +
                        "$\\newline$SELECT DNUMERO,COUNT(*) F\n" +
                        "$\\newline$ROM DEPARTAMENTO, EMPREGADO\n" +
                        "$\\newline$WHERE DNUMERO=DNO AND SALARIO>40000 AND\n" +
                        "        $\\newline\\,\\,\\,\\,\\,\\,$DNO IN (SELECT DNO\n" +
                        "                $\\newline\\,\\,\\,\\,\\,\\,\\,\\,$FROM EMPREGADO\n" +
                        "                $\\newline\\,\\,\\,\\,\\,\\,\\,\\,$GROUP BY DNO\n" +
                        "                $\\newline\\,\\,\\,\\,\\,\\,\\,\\,$HAVING COUNT(*)>5)\n" +
                        "$\\newline$GROUP BY DNUMERO;\n" +
                        "\n" +
                        "\n" +
                        "$\\newline$II.\n" +
                        "\n" +
                        "$\\newline$SELECT DNO, COUNT(*), AVG(SALARIO)\n" +
                        "$\\newline$FROM EMPREGADO\n" +
                        "$\\newline$GROUP BY DNO;\n" +
                        "\n" +
                        "$\\newline$Assinale a alternativa correta.");
        questaoAlternativa69.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa69.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa69.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa69.setAlternativaCorreta("e");

        questaoAlternativa69.setAlternativasA("Na consulta do item I, para cada cinco ou mais departamentos, a consulta retorna o número do departamento\n" +
                "e o número dos empregados que recebem mais de 40 mil reais. Na consulta do item II, para cada empregado,\n" +
                "a consulta retorna o número do seu departamento e a média de salários de cada departamento.\n");
        questaoAlternativa69.setAlternativasB("Na consulta do item I, para cada departamento que tenha mais de cinco empregados, a consulta retorna o\n" +
                "número do departamento que possui empregados que recebem mais de 40 mil reais. Na consulta do item II,\n" +
                "para cada empregado, a consulta retorna o número do seu departamento, o número de empregados que nele\n" +
                "trabalham e o somatório de seus salários.");
        questaoAlternativa69.setAlternativasC("Na consulta do item I, para cada departamento que tenha mais de cinco empregados, a consulta retorna o\n" +
                "número dos empregados que recebem mais de 40 mil reais. Na consulta do item II, para cada empregado,\n" +
                "a consulta retorna o número do seu departamento, o número de empregados que trabalham com ele e o\n" +
                "somatório de seus salários.");
        questaoAlternativa69.setAlternativasD("Na consulta do item I, para cada cinco ou mais empregados, a consulta retorna o número do departamento\n" +
                "que possui empregados que recebem mais de 40 mil reais. Na consulta do item II, para cada departamento, a\n" +
                "consulta retorna o número do seu departamento, o número de empregados que nele trabalham e o somatório\n" +
                "de seus salários.");
        questaoAlternativa69.setAlternativasE("Na consulta do item I, para cada departamento que tenha mais de cinco empregados, a consulta retorna o número do departamento e o número dos empregados que recebem mais de 40 mil reais. Na\n" +
                "consulta do item II, para cada departamento, a consulta retorna o número do departamento, o número\n" +
                "de empregados que nele trabalham e a média de seus salários.");
        questaoAlternativa69.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa70 = new QuestaoAlternativa();
        questaoAlternativa70.setId(INICIOQUESTAO.longValue());
        questaoAlternativa70.setAno(ANO);
        questaoAlternativa70.setDescricao(
                "O processo de normalização baseia-se no conceito de forma normal, que é uma regra que deve ser obedecida por uma relação para que seja considerada bem projetada.\n" +
                        "Com base nos conhecimentos sobre normalização, considere as afirmativas a seguir.\n" +
                        "\n" +
                        "$\\newline$I. A Primeira Forma Normal (1FN) define que a relação não deve conter atributos não atômicos ou as\n" +
                        "relações aninhadas. A ação que deve ser tomada para deixar uma relação na 1FN é formar uma nova\n" +
                        "relação para cada atributo não atômico ou para cada relação aninhada.\n" +
                        "\n" +
                        "$\\newline$II. A Segunda Forma Normal (2FN) define que, além de estar na 1FN, para as relações que possuam\n" +
                        "chaves primárias com vários atributos, nenhum atributo externo à chave deve ser funcionalmente\n" +
                        "dependente de parte da chave primária. A ação que deve ser tomada é decompor e montar uma nova\n" +
                        "relação para cada chave parcial com seu(s) atributo(s) dependente(s).\n" +
                        "\n" +
                        "$\\newline$III. A Terceira Forma Normal (3FN) define que, além de estar na 2FN, as relações não devem ter atributos que não pertençam a uma chave, funcionalmente determinados por outro atributo que também\n" +
                        "não pertença a uma chave (ou por um conjunto de atributos não chave). A ação que deve ser tomada é decompor e montar uma relação que contenha o(s) atributo(s) não chave que determina(m)\n" +
                        "funcionalmente o(s) outro(s) atributo(s).\n" +
                        "\n" +
                        "$\\newline$IV. Uma dependência parcial ocorre quando um atributo, além de depender da chave primária, depende\n" +
                        "de outro atributo ou conjunto de atributos da relação. Uma dependência transitiva ocorre quando um\n" +
                        "atributo depende apenas de parte de uma chave primária composta.\n" +
                        "\n" +
                        "$\\newline$Assinale a alternativa correta");
        questaoAlternativa70.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa70.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa70.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa70.setAlternativaCorreta("d");

        questaoAlternativa70.setAlternativasA("Somente as afirmativas I e IV são corretas.");
        questaoAlternativa70.setAlternativasB("Somente as afirmativas II e III são corretas.");
        questaoAlternativa70.setAlternativasC("Somente as afirmativas III e IV são corretas.");
        questaoAlternativa70.setAlternativasD("Somente as afirmativas I, II e III são corretas.");
        questaoAlternativa70.setAlternativasE("Somente as afirmativas I, II e IV são corretas.");
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
