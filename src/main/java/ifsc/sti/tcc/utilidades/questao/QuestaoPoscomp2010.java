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
