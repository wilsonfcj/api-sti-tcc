package ifsc.sti.tcc.utilidades.questao;

import java.util.ArrayList;
import java.util.List;

import ifsc.sti.tcc.modelos.questao.Questao;
import ifsc.sti.tcc.modelos.questao.QuestaoAlternativa;
import ifsc.sti.tcc.props.EArea;
import ifsc.sti.tcc.props.EDisciplina;
import ifsc.sti.tcc.props.ETipoQuestaoProva;

public class QuestaoPoscomp2017 {

    final static Integer ANO = 2017;
    static Integer INICIOQUESTAO = 1061;
    static Integer NUMEROQUESTAO = 1;

    public static List<Questao> registerPoscomp() {

        QuestaoAlternativa questaoAlternativa1 = new QuestaoAlternativa();
        questaoAlternativa1.setId(INICIOQUESTAO.longValue());
        questaoAlternativa1.setAno(ANO);
        questaoAlternativa1.setDescricao("Sendo F = [(1,1,-1)], a projeção ortogonal de (2,4,1) sobre o subespaço ortogonal de F é:");
        questaoAlternativa1.setArea(EArea.MATEMATICA);
        questaoAlternativa1.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa1.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa1.setAlternativaCorreta("b");

        questaoAlternativa1.setAlternativasA("(1,2,3)");
        questaoAlternativa1.setAlternativasB("(1/3, 7/3, 8/3)\n");
        questaoAlternativa1.setAlternativasC("(1/3, 2/3, 8/3)\n");
        questaoAlternativa1.setAlternativasD("(0, 0, 0)\n");
        questaoAlternativa1.setAlternativasE("(1, 1, 1)");
        questaoAlternativa1.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa2 = new QuestaoAlternativa();
        questaoAlternativa2.setId(INICIOQUESTAO.longValue());
        questaoAlternativa2.setAno(ANO);
        questaoAlternativa2.setDescricao("Qual é o valor do determinante da matriz 5x5 $\\left(\\begin{array}{c}1 & 2 & 3 & 4 & 5 \\\\ 4 & 3 & 4 & 0 & 0 \\\\ 8 & 6 & 7 & 2 & 0 \\\\ 12 & 9 & 10 & 3 & 0 \\\\ 16 & 12 & 13 & 4 & 0\\end{array}\\right)$?");
        questaoAlternativa2.setArea(EArea.MATEMATICA);
        questaoAlternativa2.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa2.setDisciplina(EDisciplina.CALCULO_NUMERICO);
        questaoAlternativa2.setAlternativaCorreta("e");

        questaoAlternativa2.setAlternativasA("325");
        questaoAlternativa2.setAlternativasB("5");
        questaoAlternativa2.setAlternativasC("120");
        questaoAlternativa2.setAlternativasD("1");
        questaoAlternativa2.setAlternativasE("0");
        questaoAlternativa2.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa3 = new QuestaoAlternativa();
        questaoAlternativa3.setId(INICIOQUESTAO.longValue());
        questaoAlternativa3.setAno(ANO);
        questaoAlternativa3.setDescricao("Em um espaço $R^{3}$, as retas: $r \\equiv \\frac{x+5}{4} = \\frac{y-3}{-2} = \\frac{z+4}{3}$ e $s \\equiv (x,y,z) = (1,1,-2)+[(1,-1,2)]$:");
        questaoAlternativa3.setArea(EArea.MATEMATICA);
        questaoAlternativa3.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa3.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa3.setAlternativaCorreta("b");

        questaoAlternativa3.setAlternativasA("São ortogonais.");
        questaoAlternativa3.setAlternativasB("Não são ortogonais e são contidas em um plano.");
        questaoAlternativa3.setAlternativasC("Não têm pontos em comum.\n");
        questaoAlternativa3.setAlternativasD("São paralelas.");
        questaoAlternativa3.setAlternativasE("Não são retas.");
        questaoAlternativa3.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa4 = new QuestaoAlternativa();
        questaoAlternativa4.setId(INICIOQUESTAO.longValue());
        questaoAlternativa4.setAno(ANO);
        questaoAlternativa4.setDescricao("Em relação às figuras geométricas planas, a circunferência possui excentricidade:");
        questaoAlternativa4.setArea(EArea.MATEMATICA);
        questaoAlternativa4.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa4.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa4.setAlternativaCorreta("a");

        questaoAlternativa4.setAlternativasA("e = 0");
        questaoAlternativa4.setAlternativasB("e = 1");
        questaoAlternativa4.setAlternativasC("e < 1");
        questaoAlternativa4.setAlternativasD("e > 1");
        questaoAlternativa4.setAlternativasE("e = $\\sqrt{2}$");
        questaoAlternativa4.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa5 = new QuestaoAlternativa();
        questaoAlternativa5.setId(INICIOQUESTAO.longValue());
        questaoAlternativa5.setAno(ANO);
        questaoAlternativa5.setDescricao("Anulada");
        questaoAlternativa5.setArea(EArea.MATEMATICA);
        questaoAlternativa5.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa5.setDisciplina(EDisciplina.CALCULO);
        questaoAlternativa5.setAlternativaCorreta("*");

        questaoAlternativa5.setAlternativasA("Anulada");
        questaoAlternativa5.setAlternativasB("Anulada");
        questaoAlternativa5.setAlternativasC("Anulada");
        questaoAlternativa5.setAlternativasD("Anulada");
        questaoAlternativa5.setAlternativasE("Anulada");
        questaoAlternativa5.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa6 = new QuestaoAlternativa();
        questaoAlternativa6.setId(INICIOQUESTAO.longValue());
        questaoAlternativa6.setAno(ANO);
        questaoAlternativa6.setDescricao("O limite de $\\sqrt[n]{\\frac{n^{2}+1}{n^{7}-2}}$ quando $n \\rightarrow \\infty$ é:");
        questaoAlternativa6.setArea(EArea.MATEMATICA);
        questaoAlternativa6.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa6.setDisciplina(EDisciplina.CALCULO);
        questaoAlternativa6.setAlternativaCorreta("a");

        questaoAlternativa6.setAlternativasA("1");
        questaoAlternativa6.setAlternativasB("0");
        questaoAlternativa6.setAlternativasC("$\\infty$");
        questaoAlternativa6.setAlternativasD("2/7");
        questaoAlternativa6.setAlternativasE("1/2");
        questaoAlternativa6.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa7 = new QuestaoAlternativa();
        questaoAlternativa7.setId(INICIOQUESTAO.longValue());
        questaoAlternativa7.setAno(ANO);
        questaoAlternativa7.setDescricao("Qual é a solução do seguinte sistema de equações $\\begin{cases}3x_{1} + 2x_{2} + 5x_{3}=1\\\\4x_{1} + 3x_{2} + 6x_{3}=2 \\\\ 5x_{1} + 4x_{2} + 7x_{3}=3 \\\\ 6x_{1} + 7x_{2} + 8x_{3}=4\\end{cases}$ ?");
        questaoAlternativa7.setArea(EArea.MATEMATICA);
        questaoAlternativa7.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa7.setDisciplina(EDisciplina.CALCULO);
        questaoAlternativa7.setAlternativaCorreta("b");

        questaoAlternativa7.setAlternativasA("$(x_{1},x_{2},x_{3}) = (1,1,0)$ ");
        questaoAlternativa7.setAlternativasB("$(x_{1},x_{2},x_{3}) = (2,0, −1)$\n");
        questaoAlternativa7.setAlternativasC("$(x_{1},x_{2},x_{3}) = (0,1,0)$");
        questaoAlternativa7.setAlternativasD("$(x_{1},x_{2},x_{3}) = (2,1,0)$");
        questaoAlternativa7.setAlternativasE("$(x_{1},x_{2},x_{3}) = (2,2, −1)$");
        questaoAlternativa7.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa8 = new QuestaoAlternativa();
        questaoAlternativa8.setId(INICIOQUESTAO.longValue());
        questaoAlternativa8.setAno(ANO);
        questaoAlternativa8.setDescricao(
                "Dadas as retas $r \\equiv 3x + y - 1 = 0$ e $s \\equiv 2x + my - 8 = 0$, qual dos seguintes é um valor de m que faz com que as retas r e s formem um ângulo de $45^\\circ$ ?");
        questaoAlternativa8.setArea(EArea.MATEMATICA);
        questaoAlternativa8.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa8.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa8.setAlternativaCorreta("d");

        questaoAlternativa8.setAlternativasA("1");
        questaoAlternativa8.setAlternativasB("$\\sqrt{2}$");
        questaoAlternativa8.setAlternativasC("0");
        questaoAlternativa8.setAlternativasD("-1");
        questaoAlternativa8.setAlternativasE("2");
        questaoAlternativa8.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa9 = new QuestaoAlternativa();
        questaoAlternativa9.setId(INICIOQUESTAO.longValue());
        questaoAlternativa9.setAno(ANO);
        questaoAlternativa9.setDescricao("Aplicando-se a Lei de Morgan, qual é o complemento da função $f = (x+\\overline{y})(yz + x\\overline{y})$");
        questaoAlternativa9.setArea(EArea.MATEMATICA);
        questaoAlternativa9.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa9.setDisciplina(EDisciplina.CALCULO_NUMERICO);
        questaoAlternativa9.setAlternativaCorreta("a");

        questaoAlternativa9.setAlternativasA("$\\overline{f} = \\overline{x}+y\\overline{z}$");
        questaoAlternativa9.setAlternativasB("$\\overline{f} = \\overline{x}+\\overline{x}z+y$");
        questaoAlternativa9.setAlternativasC("$\\overline{f} = \\overline{xz}+y$");
        questaoAlternativa9.setAlternativasD("$\\overline{f} = \\overline{xy}+yz$");
        questaoAlternativa9.setAlternativasE("$\\overline{f} = \\overline{xy}+ \\overline{y}z$");
        questaoAlternativa9.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa10 = new QuestaoAlternativa();
        questaoAlternativa10.setId(INICIOQUESTAO.longValue());
        questaoAlternativa10.setAno(ANO);
        questaoAlternativa10
                .setDescricao("Sendo $u(x,y), v(x,y)$ as funções implícitas definidas pelo sistema $\\begin{cases}xe^{u} + yu = 1\\\\2x^{2}v+y^{3}e^{u}=1\\end{cases}$ localmente no ponto $(x_{0},y_{0},u_{0},v_{0}) =  (1,1,0,0)$, assinale a matriz da diferencial de $(u(x, y), v(x, y))$ no ponto (1,1).");
        questaoAlternativa10.setArea(EArea.MATEMATICA);
        questaoAlternativa10.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa10.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
        questaoAlternativa10.setAlternativaCorreta("e");

        questaoAlternativa10.setAlternativasA("$\\left(\\begin{array}{c}1/2 & 1\\\\ 1/2 & 2\\end{array}\\right)$");
        questaoAlternativa10.setAlternativasB("$\\left(\\begin{array}{c}2 & -3\\\\ -1/2 & 3/2\\end{array}\\right)$");
        questaoAlternativa10.setAlternativasC("$\\left(\\begin{array}{c}-2 & 3\\\\ 1/2 & -3/2\\end{array}\\right)$");
        questaoAlternativa10.setAlternativasD("$\\left(\\begin{array}{c}1/2 & 0\\\\ 0 & 3/2\\end{array}\\right)$");
        questaoAlternativa10.setAlternativasE("$\\left(\\begin{array}{c}-1/2 & 0\\\\ 1/4 & -3/2\\end{array}\\right)$");
        questaoAlternativa10.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa11 = new QuestaoAlternativa();
        questaoAlternativa11.setId(INICIOQUESTAO.longValue());
        questaoAlternativa11.setAno(ANO);
        questaoAlternativa11.setDescricao("Considere as seguintes premissas sobre os alunos de uma universidade:\n" +
                "$\\newline$I. Algum aluno que é estagiário não recebe bolsa.\n" +
                "$\\newline$II. Todos aqueles alunos que estão no último período recebem bolsa.\n" +
                "$\\newline$Portanto,");
        questaoAlternativa11.setArea(EArea.MATEMATICA);
        questaoAlternativa11.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa11.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa11.setAlternativaCorreta("c");

        questaoAlternativa11.setAlternativasA("algum aluno do último período é estagiário.\n");
        questaoAlternativa11.setAlternativasB("todos os alunos do último período não são estagiários.");
        questaoAlternativa11.setAlternativasC("algum aluno que é estagiário não está no último período.");
        questaoAlternativa11.setAlternativasD("algum aluno do último período não é estagiário.");
        questaoAlternativa11.setAlternativasE("todos os alunos que são estagiários não estão no último período.");
        questaoAlternativa11.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa12 = new QuestaoAlternativa();
        questaoAlternativa12.setId(INICIOQUESTAO.longValue());
        questaoAlternativa12.setAno(ANO);
        questaoAlternativa12.setDescricao("Sejam m, n, p, q e r proposições lógicas tais que p é falsa e a proposição composta ((m->n) e (n->p) e (p->q) e (q->r)) é verdadeira, qual preposição abaixo é necessariamente verdadeira?");
        questaoAlternativa12.setArea(EArea.MATEMATICA);
        questaoAlternativa12.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa12.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa12.setAlternativaCorreta("a");

        questaoAlternativa12.setAlternativasA("n->r");
        questaoAlternativa12.setAlternativasB("m e r");
        questaoAlternativa12.setAlternativasC("q->n");
        questaoAlternativa12.setAlternativasD("m ou r");
        questaoAlternativa12.setAlternativasE("r->q");
        questaoAlternativa12.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa13 = new QuestaoAlternativa();
        questaoAlternativa13.setId(INICIOQUESTAO.longValue());
        questaoAlternativa13.setAno(ANO);
        questaoAlternativa13.setDescricao("De um grupo composto por 12 estudantes, apenas 6 estão habilitados para dirigir.\n" +
                "Quantas equipes com 7 estudantes são possíveis formar considerando que em cada equipe deve haver ao menos um que seja habilitado?");
        questaoAlternativa13.setArea(EArea.MATEMATICA);
        questaoAlternativa13.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa13.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa13.setAlternativaCorreta("b");

        questaoAlternativa13.setAlternativasA("722");
        questaoAlternativa13.setAlternativasB("792");
        questaoAlternativa13.setAlternativasC("836");
        questaoAlternativa13.setAlternativasD("894");
        questaoAlternativa13.setAlternativasE("908");
        questaoAlternativa13.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa14 = new QuestaoAlternativa();
        questaoAlternativa14.setId(INICIOQUESTAO.longValue());
        questaoAlternativa14.setAno(ANO);
        questaoAlternativa14.setDescricao("Assinale a alternativa que apresenta a simplificação, pelo Mapa de Karnaugh, da\n" +
                "função cuja expressão em termos canônicos é $f(x,y,z)={\\sum_{}}_3 m(3,5,6)$.");
        questaoAlternativa14.setArea(EArea.MATEMATICA);
        questaoAlternativa14.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa14.setDisciplina(EDisciplina.CALCULO_NUMERICO);
        questaoAlternativa14.setAlternativaCorreta("b");

        questaoAlternativa14.setAlternativasA("$f(x,y,z)=xyz+x\\overline{y}z+\\overline{xy}z$");
        questaoAlternativa14.setAlternativasB("$f(x,y,z)=x\\overline{y}z+\\overline{x}yz+xy\\overline{z}$");
        questaoAlternativa14.setAlternativasC("$f(x,y,z)=x\\overline{yz}+xyz+\\overline{xy}z$");
        questaoAlternativa14.setAlternativasD("$f(x,y,z)=xyz+xy\\overline{z}+\\overline{x}yz$");
        questaoAlternativa14.setAlternativasE("$f(x,y,z)=\\overline{xyz}+xy\\overline{z}+\\overline{x}yz$");
        questaoAlternativa14.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa15 = new QuestaoAlternativa();
        questaoAlternativa15.setId(INICIOQUESTAO.longValue());
        questaoAlternativa15.setAno(ANO);
        questaoAlternativa15.setDescricao("Considere a seguinte afirmação: $\\newline$“Há uma sorveteria onde todos os sorvetes são\n" +
                "doces, mas não contém adoçantes.”\n" +
                "$\\newline$A negação da afirmação acima é logicamente equivalente à afirmação:");
        questaoAlternativa15.setArea(EArea.MATEMATICA);
        questaoAlternativa15.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa15.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa15.setAlternativaCorreta("d");

        questaoAlternativa15.setAlternativasA("Não há sorveteria que faz sorvetes doces e com adoçantes.");
        questaoAlternativa15.setAlternativasB("Há uma sorveteria em que sorvete algum é doce ou contém adoçante.");
        questaoAlternativa15.setAlternativasC("Em toda sorveteria, há um sorvete que não é doce, mas contém adoçante.");
        questaoAlternativa15.setAlternativasD("Em toda sorveteria, há sempre algum sorvete que não é doce ou que contém adoçante.");
        questaoAlternativa15.setAlternativasE("Há uma sorveteria em que há algum sorvete que não é doce ou que contém adoçante.");
        questaoAlternativa15.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa16 = new QuestaoAlternativa();
        questaoAlternativa16.setId(INICIOQUESTAO.longValue());
        questaoAlternativa16.setAno(ANO);
        questaoAlternativa16.setDescricao("Anulada");
        questaoAlternativa16.setArea(EArea.MATEMATICA);
        questaoAlternativa16.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa16.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa16.setAlternativaCorreta("*");

        questaoAlternativa16.setAlternativasA("Anulada");
        questaoAlternativa16.setAlternativasB("Anulada");
        questaoAlternativa16.setAlternativasC("Anulada");
        questaoAlternativa16.setAlternativasD("Anulada");
        questaoAlternativa16.setAlternativasE("Anulada");
        questaoAlternativa16.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa17 = new QuestaoAlternativa();
        questaoAlternativa17.setId(INICIOQUESTAO.longValue());
        questaoAlternativa17.setAno(ANO);
        questaoAlternativa17.setDescricao("Em uma farmácia, trabalham 6 farmacêuticos e 9 atendentes. De quantas maneiras distintas é possível organizar um plantão de fim de semana composto por 2 farmacêuticos e 5 atendentes?");
        questaoAlternativa17.setArea(EArea.MATEMATICA);
        questaoAlternativa17.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa17.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
        questaoAlternativa17.setAlternativaCorreta("c");

        questaoAlternativa17.setAlternativasA("1.260");
        questaoAlternativa17.setAlternativasB("1.620");
        questaoAlternativa17.setAlternativasC("1.890");
        questaoAlternativa17.setAlternativasD("1.960");
        questaoAlternativa17.setAlternativasE("2.040");
        questaoAlternativa17.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa18 = new QuestaoAlternativa();
        questaoAlternativa18.setId(INICIOQUESTAO.longValue());
        questaoAlternativa18.setAno(ANO);
        questaoAlternativa18.setDescricao("Uma variável aleatória está definida pela seguinte função de densidade de\n" +
                "probabilidade: $\\newline$\n" +
                " $f(x)=\\begin{cases}kx^{3},0<x<1\\\\0, \\forall x\\neq \\,\\, 0<x<1\\end{cases}$  $\\newline$Qual é a probabilidade para que a variável aleatória tenha um valor entre 0,25 e 0,75?");
        questaoAlternativa18.setArea(EArea.MATEMATICA);
        questaoAlternativa18.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa18.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa18.setAlternativaCorreta("c");

        questaoAlternativa18.setAlternativasA("0,76");
        questaoAlternativa18.setAlternativasB("0,25");
        questaoAlternativa18.setAlternativasC("0,31");
        questaoAlternativa18.setAlternativasD("0,8");
        questaoAlternativa18.setAlternativasE("0,38");
        questaoAlternativa18.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa19 = new QuestaoAlternativa();
        questaoAlternativa19.setId(INICIOQUESTAO.longValue());
        questaoAlternativa19.setAno(ANO);
        questaoAlternativa19.setDescricao("Dois presentes distintos serão entregues a dois turistas de um grupo com 35 turistas. De quantos modos diferentes pode ocorrer a entrega desses presentes?");
        questaoAlternativa19.setArea(EArea.MATEMATICA);
        questaoAlternativa19.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa19.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
        questaoAlternativa19.setAlternativaCorreta("e");

        questaoAlternativa19.setAlternativasA("595");
        questaoAlternativa19.setAlternativasB("834");
        questaoAlternativa19.setAlternativasC("982");
        questaoAlternativa19.setAlternativasD("1.106");
        questaoAlternativa19.setAlternativasE("1.190");
        questaoAlternativa19.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa20 = new QuestaoAlternativa();
        questaoAlternativa20.setId(INICIOQUESTAO.longValue());
        questaoAlternativa20.setAno(ANO);
        questaoAlternativa20.setDescricao("Deseja-se preparar um recipiente com 100g de um produto extremamente caro,\n" +
                "sendo necessário minimizar o erro na hora da pesagem. Para isso, se dispõe de uma balança que possui erro de medição, $\\sigma$ , dependente da quantidade pesada $(\\mu)$, da forma $\\sigma = 0.1\\mu$. Com qual dos seguintes métodos se obtém maior precisão na pesagem?");
        questaoAlternativa20.setArea(EArea.MATEMATICA);
        questaoAlternativa20.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa20.setDisciplina(EDisciplina.CALCULO_NUMERICO);
        questaoAlternativa20.setAlternativaCorreta("d");

        questaoAlternativa20.setAlternativasA("Pesando as 100g de uma vez.");
        questaoAlternativa20.setAlternativasB("Pesando 10 recipientes de 100g, realizando a média e escolhendo um recipiente aleatório.");
        questaoAlternativa20.setAlternativasC("Pesando 5 porções de 20g e depois juntando-as.\n");
        questaoAlternativa20.setAlternativasD("Pesando 10 porções de 10g e depois juntando-as.");
        questaoAlternativa20.setAlternativasE("Pesando 2 porções de 50g e depois juntando-as.");
        questaoAlternativa20.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa21 = new QuestaoAlternativa();
        questaoAlternativa21.setId(INICIOQUESTAO.longValue());
        questaoAlternativa21.setAno(ANO);
        questaoAlternativa21.setDescricao("Anulada");
        questaoAlternativa21.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa21.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa21.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa21.setAlternativaCorreta("*");

        questaoAlternativa21.setAlternativasA("Anulada");
        questaoAlternativa21.setAlternativasB("Anulada");
        questaoAlternativa21.setAlternativasC("Anulada");
        questaoAlternativa21.setAlternativasD("Anulada");
        questaoAlternativa21.setAlternativasE("Anulada");
        questaoAlternativa21.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa22 = new QuestaoAlternativa();
        questaoAlternativa22.setId(INICIOQUESTAO.longValue());
        questaoAlternativa22.setAno(ANO);
        questaoAlternativa22.setDescricao("Anulada");
        questaoAlternativa22.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa22.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa22.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa22.setAlternativaCorreta("*");

        questaoAlternativa22.setAlternativasA("Anulada");
        questaoAlternativa22.setAlternativasB("Anulada");
        questaoAlternativa22.setAlternativasC("Anulada");
        questaoAlternativa22.setAlternativasD("Anulada");
        questaoAlternativa22.setAlternativasE("Anulada");
        questaoAlternativa22.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa23 = new QuestaoAlternativa();
        questaoAlternativa23.setId(INICIOQUESTAO.longValue());
        questaoAlternativa23.setAno(ANO);
        questaoAlternativa23.setDescricao("Considere o problema de somar os n elementos de um mesmo arranjo A de inteiros. O problema é resolvido da seguinte forma: (i) somam-se recursivamente os elementos da primeira metade de A; (ii) somam-se recursivamente os elementos da segunda metade de A; e (iii) soma-se esses dois valores juntos. Que tipo de recursão foi utilizada para a solução do problema?");
        questaoAlternativa23.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa23.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa23.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa23.setAlternativaCorreta("b");

        questaoAlternativa23.setAlternativasA("Linear.\n");
        questaoAlternativa23.setAlternativasB("Binária.");
        questaoAlternativa23.setAlternativasC("Ternária.");
        questaoAlternativa23.setAlternativasD("Final.");
        questaoAlternativa23.setAlternativasE("Múltipla.");
        questaoAlternativa23.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa24 = new QuestaoAlternativa();
        questaoAlternativa24.setId(INICIOQUESTAO.longValue());
        questaoAlternativa24.setAno(ANO);
        questaoAlternativa24.setDescricao("Anulada");
        questaoAlternativa24.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa24.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa24.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa24.setAlternativaCorreta("*");

        questaoAlternativa24.setAlternativasA("Anulada");
        questaoAlternativa24.setAlternativasB("Anulada");
        questaoAlternativa24.setAlternativasC("Anulada");
        questaoAlternativa24.setAlternativasD("Anulada");
        questaoAlternativa24.setAlternativasE("Anulada");
        questaoAlternativa24.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa25 = new QuestaoAlternativa();
        questaoAlternativa25.setId(INICIOQUESTAO.longValue());
        questaoAlternativa25.setAno(ANO);
        questaoAlternativa25.setDescricao("A análise de algoritmos que estabelece um limite superior para o tempo de execução de qualquer entrada é denominada análise");
        questaoAlternativa25.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa25.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa25.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa25.setAlternativaCorreta("c");

        questaoAlternativa25.setAlternativasA("do melhor caso. ");
        questaoAlternativa25.setAlternativasB("do caso médio.");
        questaoAlternativa25.setAlternativasC("do pior caso. ");
        questaoAlternativa25.setAlternativasD("da ordem de crescimento.");
        questaoAlternativa25.setAlternativasE("do tamanho da entrada.");
        questaoAlternativa25.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa26 = new QuestaoAlternativa();
        questaoAlternativa26.setId(INICIOQUESTAO.longValue());
        questaoAlternativa26.setAno(ANO);
        questaoAlternativa26.setDescricao("O caminhamento pré-fixado à esquerda para uma Árvore Binária de Pesquisa (ABP) é 44, 30, 12, 26, 36, 33, 92, 64, 46, 98. O caminhamento pré-fixado à direta para a mesma árvore é:");
        questaoAlternativa26.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa26.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa26.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
        questaoAlternativa26.setAlternativaCorreta("b");

        questaoAlternativa26.setAlternativasA("26, 12, 33, 36, 30, 46, 64, 98, 92, 44");
        questaoAlternativa26.setAlternativasB("44, 92, 98, 64, 46, 30, 36, 33, 12, 26");
        questaoAlternativa26.setAlternativasC("12, 26, 30, 33, 36, 44, 46, 64, 92, 98");
        questaoAlternativa26.setAlternativasD("98, 46, 64, 92, 33, 36, 26, 12, 30, 44");
        questaoAlternativa26.setAlternativasE("98, 92, 64, 46, 44, 36, 33, 30, 26, 12");
        questaoAlternativa26.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa27 = new QuestaoAlternativa();
        questaoAlternativa27.setId(INICIOQUESTAO.longValue());
        questaoAlternativa27.setAno(ANO);
        questaoAlternativa27.setDescricao("A saída do trecho de código em C abaixo é:");
        questaoAlternativa27.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa27.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa27.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa27.setAlternativaCorreta("b");
        questaoAlternativa27.setImagem(true);
        questaoAlternativa27.setAlternativasA("i: 1 j: 4 k:1\n");
        questaoAlternativa27.setAlternativasB("i: 15 j: 1 k:0\n");
        questaoAlternativa27.setAlternativasC("i: 10 j: 14 k:2");
        questaoAlternativa27.setAlternativasD("i: 13 j: 2 k:3");
        questaoAlternativa27.setAlternativasE("i: 3 j: 1 k:4");
        questaoAlternativa27.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa27.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa28 = new QuestaoAlternativa();
        questaoAlternativa28.setId(INICIOQUESTAO.longValue());
        questaoAlternativa28.setAno(ANO);
        questaoAlternativa28.setDescricao("De acordo com o diagrama de classes UML a seguir, assinale a alternativa que se\n" +
                "relaciona diretamente com o conceito de polimorfismo da programação orientada a objetos.");
        questaoAlternativa28.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa28.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa28.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa28.setAlternativaCorreta("c");
        questaoAlternativa28.setImagem(true);
        questaoAlternativa28.setAlternativasA("A relação entre as classes “Livro” e “Capítulo”.");
        questaoAlternativa28.setAlternativasB("Os atributos “número: int” e “númeroDePágs: int” da classe “Capítulo”.");
        questaoAlternativa28.setAlternativasC("O método “ImprimeNome” das classes “Artefato” e “Livro”.");
        questaoAlternativa28.setAlternativasD("O atributo “autor: String” da classe “Livro”.");
        questaoAlternativa28.setAlternativasE("A relação entre as classes “Capítulo” e “Página”.");
        questaoAlternativa28.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa28.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa29 = new QuestaoAlternativa();
        questaoAlternativa29.setId(INICIOQUESTAO.longValue());
        questaoAlternativa29.setAno(ANO);
        questaoAlternativa29.setDescricao("Analise as assertivas a seguir sobre compressão de dados:\n" +
                "$\\newline$I. A técnica de codificação corrida (do inglês RLE – run-length encoding) é adequada quando existem longas sequências de bits repetidos, pois utiliza contadores representando sequências alternadas de 0s e de 1s.\n" +
                "$\\newline$II. A técnica de compressão de Huffman é baseada em códigos de tamanho variável, tal que os códigos de menor comprimento são atribuídos aos caracteres mais frequentes, e os de maior comprimento aos de menor frequência.\n" +
                "$\\newline$III. Quando o método LZW (Lempel–Ziv–Welch) é utilizado, a mensagem resultante da compressão inclui também uma representação dos códigos utilizados para a compressão.\n" +
                "$\\newline$IV. Não existe um algoritmo de compressão de dados universal, isto é, que transforme qualquer sequência de bits (bitstream) de entrada em uma outra sequência de bits menor.\n" +
                "$\\newline$Quais estão INCORRETAS?");
        questaoAlternativa29.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa29.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa29.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa29.setAlternativaCorreta("c");

        questaoAlternativa29.setAlternativasA("Apenas I.");
        questaoAlternativa29.setAlternativasB("Apenas II.");
        questaoAlternativa29.setAlternativasC("Apenas III.\n");
        questaoAlternativa29.setAlternativasD("Apenas II e IV.");
        questaoAlternativa29.setAlternativasE("Apenas III e IV.\n");
        questaoAlternativa29.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa30 = new QuestaoAlternativa();
        questaoAlternativa30.setId(INICIOQUESTAO.longValue());
        questaoAlternativa30.setAno(ANO);
        questaoAlternativa30.setDescricao("Um dos erros mais comuns que pode ocorrer durante a avaliação de uma expressão aritmética em um programa é quando o resultado de uma operação não pode ser representado na célula de memória para o qual ele foi alocado. Esse erro é chamado de transbordamento (_____________) e transbordamento negativo (_____________), dependendo se o resultado é muito grande ou muito pequeno.\n" +
                "$\\newline$ Assinale a alternativa que preenche, correta e respectivamente, as lacunas do trecho acima.");
        questaoAlternativa30.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa30.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa30.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa30.setAlternativaCorreta("d");

        questaoAlternativa30.setAlternativasA("big error – small error ");
        questaoAlternativa30.setAlternativasB("coerção – sobrecarga");
        questaoAlternativa30.setAlternativasC("encapsulamento – abstração");
        questaoAlternativa30.setAlternativasD("overflow – underflow");
        questaoAlternativa30.setAlternativasE("transparência – efeito colateral");
        questaoAlternativa30.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa31 = new QuestaoAlternativa();
        questaoAlternativa31.setId(INICIOQUESTAO.longValue());
        questaoAlternativa31.setAno(ANO);
        questaoAlternativa31.setDescricao("Quando uma expressão contém duas ocorrências adjacentes de operadores com o mesmo nível de precedência, a questão sobre qual deles é avaliado primeiro responde-se pelas regras de:\n");
        questaoAlternativa31.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa31.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa31.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa31.setAlternativaCorreta("a");

        questaoAlternativa31.setAlternativasA("Associatividade.");
        questaoAlternativa31.setAlternativasB("Expressões condicionais.");
        questaoAlternativa31.setAlternativasC("Polimorfismo.");
        questaoAlternativa31.setAlternativasD("Condutividade.");
        questaoAlternativa31.setAlternativasE("Coerção.");
        questaoAlternativa31.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa32 = new QuestaoAlternativa();
        questaoAlternativa32.setId(INICIOQUESTAO.longValue());
        questaoAlternativa32.setAno(ANO);
        questaoAlternativa32.setDescricao("Em relação ao grafo da Figura (a), as Figuras (b) e (c) representam, respectivamente,");
        questaoAlternativa32.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa32.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa32.setDisciplina(EDisciplina.GRAFOS);
        questaoAlternativa32.setAlternativaCorreta("b");
        questaoAlternativa32.setImagem(true);
        questaoAlternativa32.setAlternativasA("matriz de arestas e lista de incidências. ");
        questaoAlternativa32.setAlternativasB("matriz de adjacências e lista de adjacências.");
        questaoAlternativa32.setAlternativasC("matriz de conexões e lista de arestas.");
        questaoAlternativa32.setAlternativasD("matriz de incidências e lista de vértices. ");
        questaoAlternativa32.setAlternativasE("matriz de vértices e lista de conexões. ");
        questaoAlternativa32.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa32.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa33 = new QuestaoAlternativa();
        questaoAlternativa33.setId(INICIOQUESTAO.longValue());
        questaoAlternativa33.setAno(ANO);
        questaoAlternativa33.setDescricao("Relacione a Coluna 1 à Coluna 2, associando as definições dos comandos sobre laços em linguagens de programação.\n" +
                "$\\newline$Coluna 1\n" +
                "$\\newline$1. break.\n" +
                "$\\newline$2. continue.\n" +
                "$\\newline$3. loop.\n" +
                "$\\newline$4. while.\n" +
                "$\\newline$Coluna 2\n" +
                "$\\newline$( ) Executa uma instrução ou um bloco de instruções enquanto uma determinada condição for verdadeira.\n" +
                "$\\newline$( ) Termina a execução de um laço, continuando o programa na instrução imediatamente após o laço.\n" +
                "$\\newline$( ) Faz com que uma iteração seja terminada, passando automaticamente à próxima iteração do laço.\n" +
                "$\\newline$( ) Apresenta uma condição de teste verdadeira que nunca termina o laço.\n" +
                "$\\newline$A ordem correta de preenchimento dos parênteses, de cima para baixo, é:");
        questaoAlternativa33.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa33.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa33.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa33.setAlternativaCorreta("d");

        questaoAlternativa33.setAlternativasA("1 – 2 – 3 – 4.");
        questaoAlternativa33.setAlternativasB("4 – 3 – 2 – 1.");
        questaoAlternativa33.setAlternativasC("3 – 1 – 4 – 2.");
        questaoAlternativa33.setAlternativasD("4 – 1 – 2 – 3.");
        questaoAlternativa33.setAlternativasE("2 – 4 – 3 – 1.");
        questaoAlternativa33.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa34 = new QuestaoAlternativa();
        questaoAlternativa34.setId(INICIOQUESTAO.longValue());
        questaoAlternativa34.setAno(ANO);
        questaoAlternativa34.setDescricao("Arquivo direto, também denominado arquivo hash, é uma forma de organização de arquivo baseada em hashing sobre um campo chave (o campo hash). Assinale a alternativa INCORRETA, dentre as afirmações abaixo, sobre arquivos hash.");
        questaoAlternativa34.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa34.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa34.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa34.setAlternativaCorreta("d");

        questaoAlternativa34.setAlternativasA("O espaço do endereço-alvo da função hash são buckets, isto é, blocos de disco (ou grupos consecutivos de blocos de disco), cada qual mantendo múltiplos registros.");
        questaoAlternativa34.setAlternativasB("O problema de colisão é resolvido utilizando buckets em áreas de overflow.");
        questaoAlternativa34.setAlternativasC("Arquivos hash possibilitam acesso muito rápido a pesquisas baseadas na igualdade de valor do campo hash.\n");
        questaoAlternativa34.setAlternativasD("O hashing extensível possui um diretório com profundida global d, que corresponde aos d dígitos\n" +
                "mais significativos de um valor de hash. Já cada bucket possui profundidade local d’ possivelmente distinta dos demais buckets, tal que d<=d’.");
        questaoAlternativa34.setAlternativasE("Uma grande vantagem do hashing extensível é que o desempenho do arquivo não degrada conforme o arquivo cresce, em oposição ao hashing estático. ");
        questaoAlternativa34.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa35 = new QuestaoAlternativa();
        questaoAlternativa35.setId(INICIOQUESTAO.longValue());
        questaoAlternativa35.setAno(ANO);
        questaoAlternativa35.setDescricao("Analise as seguintes assertivas sobre organização primária de arquivos, assinalando V, se verdadeiras, ou F, se falsas.\n" +
                "$\\newline$( ) Em arquivos desordenados (heap), as operações de inserção são bastante eficientes, porque novos registros são acrescentados ao final do arquivo.\n" +
                "$\\newline$( ) Em arquivos ordenados, a busca por registros baseados na chave de ordenação é bastante eficiente, desde que seja comparação por igualdade de valor.\n" +
                "$\\newline$( ) Uma técnica para tornar o desempenho de operações de inserção mais eficientes em arquivos ordenados é utilizar um arquivo desordenado temporário, sendo que o arquivo ordenado passa a ser chamado arquivo principal (ou mestre).\n" +
                "$\\newline$( ) O desempenho da pesquisa baseada em um campo de arquivos desordenados pode ser melhorado através de pesquisa binária.\n" +
                "$\\newline$A ordem correta de preenchimento dos parênteses, de cima para baixo, é");
        questaoAlternativa35.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa35.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa35.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa35.setAlternativaCorreta("e");

        questaoAlternativa35.setAlternativasA("V – V – F – V.");
        questaoAlternativa35.setAlternativasB("V – F – F – F.");
        questaoAlternativa35.setAlternativasC("F – F – V – F.");
        questaoAlternativa35.setAlternativasD("F – V – F – V.");
        questaoAlternativa35.setAlternativasE("V – F – V – F.");
        questaoAlternativa35.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa36 = new QuestaoAlternativa();
        questaoAlternativa36.setId(INICIOQUESTAO.longValue());
        questaoAlternativa36.setAno(ANO);
        questaoAlternativa36.setDescricao("Sobre percurso em grafos, é correto afirmar que um percurso:");
        questaoAlternativa36.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa36.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa36.setDisciplina(EDisciplina.GRAFOS);
        questaoAlternativa36.setAlternativaCorreta("b");

        questaoAlternativa36.setAlternativasA("É uma família de ligações sucessivas incidentes, cada uma tendo uma extremidade incidente à anterior e à outra subsequente. ");
        questaoAlternativa36.setAlternativasB("É fechado, se a última ligação da sucessão for adjacente à primeira. ");
        questaoAlternativa36.setAlternativasC("Aberto não pode conter subpercursos fechados.");
        questaoAlternativa36.setAlternativasD("É elementar, se não repetir ligações. ");
        questaoAlternativa36.setAlternativasE("É simples, se não repetir vértices.");
        questaoAlternativa36.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa37 = new QuestaoAlternativa();
        questaoAlternativa37.setId(INICIOQUESTAO.longValue());
        questaoAlternativa37.setAno(ANO);
        questaoAlternativa37.setDescricao("O grafo da Figura (a) abaixo indica precedência entre atividades. Uma aresta direcionada (u,v) indica que a atividade u tem que ser realizada antes da atividade v. Por exemplo, a atividade 3 (representada pelo vértice 3) somente pode ser iniciada após o término das atividades 0 e 2, já a atividade 9 pode ser realizada em qualquer ordem.\n" +
                " A Figura (b) abaixo mostra para o grafo da Figura (a)");
        questaoAlternativa37.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa37.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa37.setDisciplina(EDisciplina.GRAFOS);
        questaoAlternativa37.setAlternativaCorreta("e");
        questaoAlternativa37.setImagem(true);
        questaoAlternativa37.setAlternativasA("os componentes fortemente conectados que representam as atividades mutualmente alcançáveis a partir de cada vértice. ");
        questaoAlternativa37.setAlternativasB("o caminhamento entre todas as atividades, usando o algoritmo de busca em largura. ");
        questaoAlternativa37.setAlternativasC("a árvore geradora mínima que representa todas as possibilidades de conexão entre as atividades,\n" +
                "usando o menor fluxo possível entre elas. ");
        questaoAlternativa37.setAlternativasD("o caminhamento entre todas as atividades, usando o algoritmo de busca em profundidade. ");
        questaoAlternativa37.setAlternativasE("a ordenação topológica que mostra a ordem em que as atividades devem ser processadas.\n");
        questaoAlternativa37.setImagemQuestao("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAPQAAACOCAYAAAAGliVZAAAAAXNSR0IArs4c6QAAIABJREFUeJzsnXd8FVX6/98zt9/0RgIhoQRCryK9gwuCiiuuFcvaddVdy66Kuy7Y96vr7lpW+emubdUVFEGKSJOidEQgEAiEGiCE9OTWKef3x82MkwgokrgC9/N6zSvl3pk5c+Z8znnaeR5JCCGIIooozgrI/+sGRBFFFI2HKKGjiOIsQpTQUURxFiFK6CiiOIsQJXQUUZxFiBI6iijOIkQJHcX3QtQdP/WNvnvPqIf1+2D/XzfgbIOu6wBIkgRAxM0v0DQdm82GLkACZFkyPwPj98j5NpsNWW7auVZVVSRJMg9E5N6yTUYIHYQASUIXAoGE0AUOhx2pqRokQNd00AXCJgECIUlICITQkQTIMugi0jQAm01G1yN9rWnaT9JvP3dECd3IkKQIOYUQJqkROpWVlWzatIlN32ymsrIKh8NG1y5d6Nf3fNKaNcPt9qDruknopoaqqsiyjKqqHD16lPVr17NjRz6BYJDU1GS69+hOnz7n442NQyCw25p+qEiShKrryDIgS4RVhdqaGjZv+pqtWzZTcrQEj9dL+/bt6dOnD61atYlMknV9puv6OU9oKRop1rgwyAyRFU+SJNavX8dHH31Mx44d6dmrFwkJCWiqSl5eHps3b6Z9+/ZMnDgRl8uFEAJZlpuc1JqmEQgEmDlzJjt27KBP7/Po1LETMbExHDlazNdff03B7l3ceOON5OZ2wG6z4bA3IanrhBVN00CSUIXO1998zUczZtChfTt6dOtKRno6VTW17N69h40bN9C6dRuuvPJKYmNj0TTtJ+m3nzuihG4CGGK3rut89dVXfDpnLrfffhtpqSl4PB7sdjuaphIOq1RWVjNnzmx0XefGG2/E6XTicDi+Xd2bCIFAgGnTphETE8OFF15ISmISEgKb04Wiqqi6xsGDRbz22j+55uqrOP/8vk2+SgtdIASomsbGTRt5/78fcOstt5CZ3gyvxxPRAmwOVFWjpqaaBQsWUFZWxh133I7X6wU45wl9bssnTQRN05AkidLSUt5//wPuufd3tGyZRUJCAnabhCQioqHX6yU5NYXLf3UFuq6zePFiJEkyJ4TGhBCCUChkivXz58/H4XBw2WWX0bx5Bg6nDckeGQ5OlwuX20ubtjncf/8D/Ofdd6ksL0PXdYQQ5jUav411kkMwwGvTpnHfffeR07YtiYmJuJwuHHYHDrsDj9tDs2bpXDrhl8TFxfHZZ58hSUR0/3McUUI3MoQQ2Gw2VFXlP//5D9dOmkRqehpOtxsQ7C3cxZ8mP8y0V/9Jjc+H0+0mOSWZsWPHsnr1akKhEIBJmsY6FEUxdebS0lI2btzIRRddRHx8PADHjhbzxJ8fY/LkyXy1ag2STUa2yWS2aMG4cWOYPv2/JqFlWaYpBDuBhGST+debb3LdDTeQnp6O0+EwjWCaqhP0h1FVDQmIi4vj0kt/yZdffonP56OJhZozAlFCNwF0Xae2tpbi4mK6de2K3eFEUzVA8NLf/s7110/i8KEiNm/eTCisoKk6rVu3Jicnh02bNjVJmxYvXkxRURE2m428vDzatm1LRkZG3YorCAQCeJxO/vCHP3B+v/MJKTqSzYYkSwwaOJB9e/fi9/tMo1+TGJ8k0IRO4d69dOnaBYfDgU2WkYDiQ4e58vJfcddvfsur/3wDTY1MVHGxsfTp04d169Y2fnvOQESt3I0MQ2QOBALYbDbi4mLRJLDZbeiKQjgcJKNFC3r16kVZaXnEjWUDSUi0a9eODRs2kJmZ2eiE2bx5M5MnT+ayyy4jJSWFDh06ACDLMpIk4bDb2b59G1OnTuWXV1zDoCED0QXISHhcLuJiYykvryA2Ns58zsaEACQJfP4Ask0mLjYOoevoRFadvXv2csHo0Vwx6dc89dRfCAZV3B4HTpeLjh07smHDOoaPGN6obToTESV0I8NYvUKhEImJiaiqFjEm6Ro2uwOH24uuQyAYJsEr47JHxGCHLaJT//vf/2bRokWnJdIe71xFUTh27Bh//etf6dWrF3/5y1/qkbJFdjavv/0u23cU8Na77zF4cH8kIdCFht3pRrY76hn7JElqdAOUEDqaEsZhs2GTJNAFst2Gpii079iBmbM/5YknnmDfgX04nDKyLKELlaSkJAKBIMJg/zmMKKGbAJIkIcsyPp8Pu92GpGsIIdAEtG7Xkef/9iI7duzk+eefR6gKMhFjUGVlJbfddhsjR448LbIYhitrcMsrr7yCw+Hgmmuuoby8nMrKSgBTr96zZy/Tp0/n0KFDDBw4EFmPGPZkmx1FCRMMqdhstvr+9UaEcUVZkpA0DV1RcHk8kYARh5P4pCTu+/0DrF+/nq1bE3A4ZYTQACgpKamTHKJKdJTQTYTY2FiCwSCKouB0Os1V87bbbuPgwYPExsbSokUL038qhCAvL48hQ4bQvn370xK5j7dC//rXvyYuLo60tDQKCgrYsGEDw4cPN4MysrKymDhxIjabjbZt2wLfkj0YDBEMBklISAC+DZ5pbAhdx+lwEA6HIxNgXd8oikJ1TQ1vvvkmmqZxyy23IMuyaaT7+uuv6dWrV5O7+s4EnOMCStMhNjaWjh078vnnnwOYIZZut5t27drRvHlz0yIuyzIHDhygvLycjh07mv/7sYfNZvvO0b17d1q3bk1iYiLt27fn6NGjFBUVARHpwO12k5ubS05ODjabzbQFyLLMggUL6N27Nx6PxyRNUxjFZFnG7XYzYMAA5syZY04cNpuN1NRUHnroIR5++GHS0tJQFAVd1ykuLubAgQN06tSpSSaZMw1RQjcR7HY7Y8eOZcGCBezbt6+eqGoYogzS1NTU8O677zJ69GiTNMZgNn4/FUI3PMfQdx0OB7IsEx8fz4gRI5g+fTo+n8+UEIz7GX50XdfZvXs3K1asYOjQodjtdvN7TbJC19kfLrjgAlauXElBQYH5mSFJGM8gyzKBQID333+f0aNH4/V6o4QmSugmg+H/LSgoYOrUqXzzzTcEAoF6PlwhBIcOHeJvf/sbn3/+uUkoQ9yEiDHrVGFuuLD8bbfbzZXX6XTSt29fsrKyeOWVVyguLgYwP5dlGU3TWLduHU899RTbt29nz5499fTypgp+0XUdl8vF4cOHeeKJJ/jqq6/MPrBOJkeOHOGNN94gPT2d/v37m20/1xEN/Wxk6LqOpmlUVFTw0EMP0bx5cy666CIWLVqE3W6nd+/epKSkEAgE2LZtG4cOHaJ///6Ul5czY8YMnn/+eXJzcwHMHUQNCdoYCIfDBAIBvvrqK1atWkV2djadOnXC4/FQUlLC119/jc1mY9SoUWzfvp13332Xu+66iwsvvBCXywU0fpiloihomsZbb73FwoULuf/++1m5ciWaptG9e3cyMjLw+/0UFBSwb98+Bg0aRL9+/UhISDD7x96U8eZnAKKEbmQIIaiqqmLq1KmEQiH++Mc/kpiYiM/nY8+ePeTn5/PSSy9x+eWXM2DAAHJyckhMTERRFP7zn/+wcOFCXnvtNTIyMkyx1263NzqhVVVF13XC4TClpaXs3r2bdevW8eGHH/Lggw+Sm5tL27Zt8Xg8CCFYvXo1L774IkOGDOHmm28mISEBh8PRqG3SNI1NmzZx9913M23aNHJycggEAuzbt4/du3dTXl6Oy+UiOzubjh07kpCQgNfrrSf1nOuERpwS9G8PXY/8Wv+/3/nrbISu6yc8AoGAePzxx8U111wjCgsLhaqq5hEOh0VJSYkYNWqUWLt2raitrRXBYFCEw2ERDodFcXGxeOyxx8R1110nKioqRCgUErquC03TvnOf04WiKCIUColQKCSCwaCora0VGzduFIMHDxZlZWUiGAwKTdOEqqpCURRRW1srNm3aJCZNmiRuu+02UVRUdNJ++CFtbPj94uJiMXToUPHhhx8Kn88nwuGwUBRFhMNhUVVVJaqqqkRFRYXw+/3mZ6qqCk3TRDgcFqqqnna/nOk4RR1aNDhOBL3uODuhaZqp5xoitrHavfnmm6xfv55HH32Uli1bAt/6pW02G7GxsdjtdrxeL16vF6fTiSzL2O12UlNTufnmm/F4PDz99NOEQiFCoZCpN6qqat7rdGG323E6nTidTlwul9ke43eXy2W22Whvp06dmDp1KklJSdx+++1s2rQJVVVRVZVQKEQ4HDZ1f6OPTgaj71RVxe/38+STT9KvXz/Gjh2L0+nEbrdjt9txOBzEx8cTHx9PYmIiHo8Hh8Nh2gVkWY6EiZ7jO63glI1iP/TrEmezk99w2Vit1pqmMWvWLGbMmMGf//xnsrKy6hmRTgZrUoSMjAwefPBBdu7cyTvvvGNupTT0adFUcdQ/EC1btuSBBx7gkksu4Z577mHBggXoum6K36JBUMvJYExMQgg++ugjCgoKuO+++3C73aafOYpTw49QOOoGk+V91X91ZzeZAdMaLcsyfr8fl8vFokWLePnll/nLX/5Cp06dcDqdpqX7+whokNnwGbdp04YpU6Zw1113kZ2dzfjx483r/K/IbJBW0zQSExO5/PLLadOmDU888QQFBQXce++9OBwOFEUxn+X7YLjU8vLyePnll3n11VdJSUkxzz3Xs4/8GJykx3TLcfx0bZFDBzQQGggdxE+YVO5/ACM6CcDv9zNlyhTmz5/PX/7yFyZPnkyvXr1wOBym3/T7xE6gnqvIWIE7d+7Mc889x+TJk9mwYQN33HEHfr/fbMNPDaN9hjTh9Xrp378///jHP1i/fj133XUXR44c4eWXXzaf6fvw1ltv8eKLL/LQQw/x29/+lo4dO5okNya5KE4NJ1ihBYqiYLNJaFok4l2WbRg57SRJRkgCbBI2BAgdoUe+pwuBkGQERDbz/3TP0igwyGL4Pn0+Hxs2bKCwsBCbzUbHjh3p06cPTqeT3bt3s3z5cpYvX87dd9/NgAEDTL3PwA/dO2zd7GCscD169ODBBx/kzjvvpKamhsrKSlwuF36/n40bN7J79250XSc3N5devXoRFxdnWsWbQp80nsu4tt1up2PHjjz++OO88cYbTJo0CUmS6NGjByNHjgTg4MGDrFmzhrKyMjweD7169aJTp07ouk5eXh5LliyhW7dutGrVCrfbbbrpDCnodGGI/4aEY+jtQgi2bNlCXl4egUCAtLQ0Bg8eTFpamjkZN2VUXFPhhCK3JAl0ERkcgUCYbds2k5bajKysLCCyGZ2630AQDofI37aD+MRUstq2sXx+ZsEQk1VV5e2332bPnj306tWLHj16oOs6O3bs4JNPPmHAgAHIskx+fj6JiYl8+umnDB06lLi4uO8MxO8jdEM/s9GGcDjMBx98wJEjRygrK2Pbtm0sWbKE7du306VLFzp37ozNZqOgoIAFCxaQk5PDDTfc0CT90vCZDOOXzWajdevWdOnShW+++YZ169bx1ltv0blzZ9544w3C4TADBgwgMzOTQCDAokWLePvttxk/fjyHDh2isLAQr9fLvn37GDhwoHmfxnTTGZOD4apbs2YNn376KZmZmfTq1Qun00lpaSkvvvgiLpeLu+++m7i4uDMyR9kJ/NACVQ2BpCOExIrlK5k06QYeeeSP3HH77ciyHWygywIHKpLQqKqo4KILLyEhtTnvvP8esXFxOOQzT5tWVZWqqipeeOEFzjvvPHr37k18fLxp7VUUherqaubNm8e8efOIjY1l/Pjx9OjRg/bt25tWWSuMVULUpQH65S9/yfPPP0+XLl3M7zQktKZpaJpGfn4+u3btYubMmVRVVXHVVVcxdOhQkpOTAczsKBUVFaxatYr8/HweeeQRYmJiTum5hRDs3LmTu+++m7lz5+J2u0/6fWsWFCEEy5cvZ968eezdu5ejR4/SrVs3rrvuOjp06GBa0g1r+NGjR5k5cyYLFixgwoQJjBw5ktzcXGJjYxudQMbkbGQF/fjjj9m5cycTJ06kZcuWCCHMkNaamhp2797NBx98wMMPP2waNhvb396UOIlRLOKWkYTE9Bkz8PkDXHDBBdjttkh2xrrvRGYDifiEBPr17cPb733M1ryd9B/Y56dof6NDVVXee+89+vTpw6BBg0hJSUFRwnUGIR2ny4XH4+GyyyaaK+mECRNMN0tjwNCjhRB07tyZdu3asWvXLlq2zOSiiy4hNtaLJIEs29B0DbfbhcvlYuzYsdhsNt544w1++9vfNkpbTtZGm82Gpmk4HA4GDx5M586dqa2t5amnnuKOO+6wGAc1ZNmG0+nE7XYTFxfHtddei8/no0+fPnTr1s28ZlPA0MvXrVtHYeEebr31VpKSkrDbjTzeEdXS6/WSmJiI1+vlpZde4k9/+hNxcXFN0qamwvGVAwESduzYqTx2mNXLl9K8fWcycnLQQ5WsWPo5b7/7Nu++/jpLFq+mLCSjAReM6IdSG2TxirXfZkP/mcMgpeFu2blzJ1VVVQwfPjxicZV0HDbQdQ2bzY6mg+xwkpSczMTLJ3K0pJjS0lJzlm8Mfcu4hsPhwOFwUFtVQ01VGWPHjiE+LgGHbEMSQdAjaYI0WeBwRny1o0ePprS0lF27dpkiZlMYmAyLvMvlQpIkXC4XGRkZrF+/nnHjxtGxYy4ulwNJ0rHbZVQ1hISE3ebA4XDSokVzrrnmKpYtW4quR4oNyPLprc7W2ACrrgxQW1vL/PmfMf6SiSQlJyM77Qg9iKqohAIKEjY0AW63i86dO9OjRw8WLVp0xsWHn2D0SchIyJJM+eFD7N+zn/5DhyPZYPmiBVwxcSLPPfccjz36R371q0nM/mwZOoKcdm1plprCuq/zzhQ+13thQghWrlzJ8OHDiY2NrTOmaBTs3MGsT2axPX8HAtB1gWyzkZKSTI/u3di0aVOjbvw3JgZDVJ89ezbjxo0nOSUJySZFcm9pAb7esJZjx6rRkJCkyCoUHx/PRRddxNy5c82JoTHbZoVV35UkiUAgwIYNGxgzZowZ763rGqFQkDVr1zD/s8+pqKhCVTScTidt2rQhISGBgoIdde0//TZZyVxYWEhVVRW6rpOfn09aszTatm2N3RZ5ryFfDVOnPM7kh//Ia6+9DnWGX5fLxZgxY1i1ahXBYPD0G/UT4viElkCSZTRdp9YfJBzWiPXGoAlok9OWV197mekzpvPMM1NRwwrr1n0DCOLik/F6XBw7XIKiqj/tk/xIGDO4EYl18OBBOnToUG9LYf72bciyzNSpTxAO11lN6yasTp0719vm11groUFmTdPYt28fnTp2i0wmhJEkwbIvFvP7PzzMwf2HQNjqcnJFLOXZ2dkcPXqUUCjUZMkIGkKSJKqqqkhMTDS3ONZ9wMyZM/nqqy8xsuwKESGcyxVZDTdv3kJNTS3V1bVUV1f/6KOmpgafz0dNTQ01NTW888473HHHHSxZsoSCggI6duiI025DFip2m0RtwM/hw0e46qqr2bwlDxXQpcizxMTEkJCQQHl5eZP3XWPihEqfDkg2G4FAAEmSSEtNRkLC4/Wy9IulvPDGOyiVx1BCCrJkQ+gq6JHaR5LkQD7DRBUhhPmsMTExdYTWkWSZgQMHMm/BYmJiYnA45Loc0AJZkklMSCQcDpvXaSwXh0HCiFFHwWF3IcsCIcLomovhI/pSVFRGKFAnTwnNXIldLhfBYPA7WzWbUnw0xF3j/qa7SNNYsXIFubm5daqJjM1uq6tLpZKcnMxjj03h09nziEjcjZNLTdd1gsEgW7ZsYfHixZx//vlMnToVp92GpANCJz4+FqHrPDb1ccaMG4MG2HQQumpOSkZa5TMFJ7XiSBLExHiRhaCspAxZErz0j3/y9tv/4e5H/0x6jI0dU1+r81VHDGRCAknT6wJOfv4wBrqxullXRl3XsUk6YVXF5XRTVlaGooSRJBcSAtkmCIVDpvXbSDXUGMSxElrUJebXtDCyrCFw4XK7CYVC2OtIoAuBzeJnbZh15KeANQG/cW+b3UZNTQ3du3VnwYLltG7TlqFD+tfTbceNG8+gQUOx26XTTpZvWP0dDgeffPIJR44c4YILLiAmJoZAIBB5v6oKLicH9+zB7fHw2mtPcc99D3HLvXciyTIywnyOM81tdVxCRzzLkQ6Pi4vF65KpKCtH1wShYAgdmazsbL5evghFU5FkCWSZ8vJSqquq6Tmw7U9S3KwxYPUB2+12kpKS2LdvHx06dKirs6Tx9YYNtM9tTzisoCo6Ho+EpkbcIQcPHKBFixaNusHeiBzTdR2n00lCQiKHDx8hp2M2iEh/FxeXcPDAQWITjtDpvA4kuO2mYa+qqoq4uLgmX5WtEEIQHx9PWVkZuq6ZNhSh63Tp0oWysjKCgSAetxtZthEKB3A6Hezdu5fhw4cxaNCQuonrx7fXkBKMqLaysjImTJhAt27d2LhxI/v372fwYIFsd6BoOinN0lHDYV78xz/oe/55qIqCzeVA6BE/e21tLbGxsY3UQz8NTjh1q3V1T9NaNKdjx46sXrECSUhcfc2vaNM2i0cf/gP5+TtolpqMyyUjSXZ25edRVVHFgAF9IiQ/A2Ad8Ha7nT59+rB8+XJLxJWM2+NhzZrVPPHE48TEehFCMvcor1q92gzwgMbRoQ1CG227+OKLmT374zo92Q1CYv++YnJyc9FENcFArXlvWZaZM2cOw4YNM91oP5UO7XK5aN26NXl5274V9wXcfNPN1NbWMvqCkfTo0ZVgMIjdbufYsWPs3r2b7t2746jb/WVE2v2Yw9iB5XA4cLvdjBs3jkGDBpGUlESvXr0oKCigsqoaXUjINgfJac149fVX+L+/PMsjD/2WGJeDcCiIEIJ169bRvHlzs7LImYITLqORmVIizuOlb9/z+eeMpWzdupMhgwayefM3HPaHSfd6UfHit+noWoBFSz8nNjmF3n26mvWFzwQYRLDb7XTv3p1ly5ZFjCgdOyIJmREjR/KLsV5U3QZyRCxUNcGqL7/EVhd3bbUoN0Z7rC6w3NyOzPjofTZ/s4VePfqA0OnXbzB9+4xEsbnRUM1ztm3bxtGjR+nduzfQ+AnxTwa73c748eP5xz/+wXPP/QWPxxPJm52cxK9v+jW6akMICVkGTVeZM2cOPXr0qAuCiVTwOJ0V2oDxzEY1T0mSiI2NpWvXbnwyez43TLocoUvIukCy2ZElCU2XEKqK2+miurqaGTNmcP/99592W35qnHCFliU5UkPIE8/ESTcggtUsnDsbVZXRbS6axSficLpwOcFrt1FeWsnyrzbTb0B/zuuag6gLDTwTYHW/xMfHc+211/LKK6+wZ88ekGw43TEgSdjkSIfJksSGdWt5/vm/kpKSZvqgG2uvsgFDH/Z4PZzftx+/uetutmzZhmSTQbiQbC5k9MisLAQFBQW89tpr3HjjjWY1xqYitLVmFnybV3zr1q3s27ePyZMfJRyOGPOELoGI1MoCgaopvP/++/z7328ydOhwHA5HJPbffnrZTmVZNveXW59dVVXC4TC6rvP+e+/y3nvvIwNCcmCr23cgyzouux2fr5bJkydz+eWXk5aWdkbFccNJUhCpqmpGAymKYia4c7lc2O32eiIhRFaV2traehvNz6SQOQNGeOLevXt5++23adGiBWPGjKFNmzbIskxeXh6zZ882X/QzzzxDt27duPnmm7npppvMEFErfkzoZygUigx0ISgtLeVXv/oVN954IwUFBSQmJjJu3DjatWuH0+mkoKCA2bNnU1tby6RJk8jJyfne0M2GONXQT2MCg0h+srfeeotp06axe/du2rRpw3PPPcesWbPo378/F154IYmJifj9ftavX8/ChQvJyspi586dJCYm8vjjj5vjqbEJpCgK9957LwsWLODo0aNcd911dO3alcLCQsaPH0+fPn2IjY3l6NGjzJkzh6+//pobb7yRHj16mIE9ZxKpT7I5QzL1IENkMfTKE4mVRv4pOPOsgwYkScLj8dCuXTt+97vfsWvXLubMmcORI0eQJIlWrVoxduxY2rZtyxdffEHz5s3NIJRgMIjb7T7tEFDDSmtYqB988EEuueQSLr74YnRdZ9++fSxbtox33nmHcDhMVlYWI0aMoFWrViQnJ/8kfW9NTuBwOBgwYAAffvghbdu25cILL6Rfv351PubNvPLKK1RWVuLxeOjSpQu33HILGRkZHDlyhN///vcsW7aM0aNHN8m2UFVVufLKK9m0aROyLDNy5EhGjRrF0aNHWbNmDZ9//jmhUIjk5GT69evH+PHjSUpKwul0mouZESRzJuCkI09VVVOUMYLYrXtiG67QVovxmbqX1Xg2h8NBSkoKycnJdO/enXA4bIY6GoaX5s2b0717dzweDxUVFY02mxtuMFmWef3111FVlauvvpqkpCR0XSc2Npb27dub7im73W62qylWuePBcEtBZIvkY489xvDhwykvL2fEiBF4PB7i4uJISUlh0KBB5vgw0hkBZGdnc/vtt/Pcc8/RtWtXMjIyGr2d5eXlvPDCC4wZM4YtW7bQrl07YmNjiYmJoWXLlqiqiqIopkHNSDpoqE9nmpR5QkJbd6EApo/WSnArjBfcFClnf0pYJROn02kOQlmWzZXTEDV79OjBs88+i8/nY8qUKXTr1o0xY8aYu3ug/sRmuJWsP417fsd/a7OxadMm/vWvf/Hvf/+bjIwMczOEscnBcG1ZkwL80Mgw63caivvHO79hgIpxFBQU8OCDDzJixAiuueYaFEUxVzgjSMcgcMPzbTYbgwYNYvXq1fz973/niSeeMNUMo12nMpYa9nVlZSWPPPIIXbt25bbbbqO6upqWLVua79PtdpvvomEfnqnj+ISEPp7YaBXlGj6sMfDPdDSMT4ZvbQHGpGY8Z3x8PF6vF13XueOOO/jHP/5BTk4O7du3JxQK1UulY5VoDAu2VdoxBpRaFzJ77Ngxfv/73/PAAw+Qm5trtsFYfY2fjSVeGxsZjPaoqlrvfRpWdOuA37JlC3/6058YO3YsV1xxBampqd+REE5GDF3XiY+4K4+sAAAgAElEQVSP57rrruOhhx5i6dKlXHDBBfUIfarPp6oqkiTh8/l44IEHSE9P58477yQ9PZ309PTvxAscr73Wn2cazhxt/2cC64s2rKp2u51BgwZxySWX8Pjjj1NVVVWvBI1xjmEZthLXuoneILimaTz77LMMGjSIMWPG4HQ6m/R5rEQ1yNRQbDfabHx37dq1/OlPf2L8+PFcffXVpKam1ss2ciqpl1q3bs3NN9/M3/72N8rKysyJ88ciEAgwefJkvF4vv/nNb2jevPl3fPtnK6KEPkVYV1nrERcXx6WXXkqzZs3461//Wu8zw7VTXl7O3/72N1RV5bPPPmP58uX1QjyNVXv69OkcOHCAW2+9tZ642pTPsnDhQubOnYsQgilTplBbW1vvu0YEliRJLFu2jMcff5yJEydyxRVXEB8fX89VdKriqsvlYtCgQZx//vk888wzdemvflzkXTAY5Omnn6ampob77ruPli1bmu0+kTpxNiFK6FNEQ/3OcO0BpKenc/vtt7N9+3ZmzZpVz+4AEfF4/fr17Nmzh/fee4+YmBjT/WPk4N66dSuvv/66WUanKS3W1kknKSmJt956iz179rBt27bvFKYz9PUlS5bw3HPPcf311/PLX/6SxMTEekE1p6r/GitxbGws119/PVu3buWLL75AURSCwWA9e8PxDuMaRsqmv//97xQUFPDYY4/VI/OZqhOfMkQUpwVrlQhN00QwGBQLFy4Uw4YNE998841Z0SEcDotQKCRmzJghUlJSxP333y8qKiqEqqoiGAyK999/X/zzn/8UEydOFK+//rrw+XxC0zSzekVjw6jmYVy/vLxc3HPPPSIlJUV8+umnwu/3m20LBAIiFAqJTz/9VFx44YVi1qxZoqamptHbFAwGxYIFC8SAAQPEp59+Kl5//XWzqohRwcOo+KEoivD5fPV+f+GFF8TFF18s8vPzhd/vF4qiNEqVkTMJ0RW6ESAsOqjD4aB///5ce+21PPLII+YGe0VROHLkCE6nk169etG6dWsOHjyIz+czddLXX38dSZLo2rWraSU2rtsUbTaqVlRXV3P48GHat29Pz549kSSJY8eOma46IQSzZs3ipZde4s4772TYsGGnHLjyQ2BsjunSpQtPPfUUeXl5ZmWOoqIiNm/ezJo1aygoKKC8vNzso3A4bNYFe+qpp8jOzsbtdp+TifrPfLP0zwgGAZ1OJxdffDH5+flMnTqVhx9+mHfeeQdFUWjevDm33HILfr+fuXPn4vf7ueiiiygqKmLv3r3Y7XZ27txJ7969TTGxKbZAGoT+5ptvmD9/Ph6Ph1atWnHbbbdRVFTEunXriImJ4brrrmPx4sW8/fbbPPzwwwwYMMCMkW4K7N69my1btrBt2zZat27N3r17mTlzJoqikJaWhtPpxO/3U1JSQm5uLuPHj2fx4sV88MEH/N///Z9ZYM/w0Z9riFafbARYu9CwBsuyzN69e7njjjto1qwZt9xyCx06dDC340mSRCgUoqioiPfee4+1a9cycuRILr74YnJycsw0soYx6nQJ3fA1K4rCp59+yjfffMNVV11FZmZmPX2ztraWbdu28dZbb1FYWMjzzz9vhkMCxw1xPV0YGVeNLKfr16+nS5cu3HDDDWRmZuLxeMy2K4rCihUrWLBgAXv27OGZZ54xU/JardlnUthmYyC6QjcCjhcxp+s6ycnJZGdnc9NNN9GtWzczkbwBr9dLTEwMd911F0IIRowYQZcuXczEe9B45VGNYBiDsJs3b2bz5s3cdtttpKWlmeqCtW1erxdJkvjwww/NDJ4NNz40JozNMeedd565H9nwJbtcrnqVRQDGjh1LTEwMn332GT179jSj5c5lnFvT108A60BftGgRQ4YMoVevXrhcLjMKyrDaGnHCmZmZTJo0iXnz5mG325tE97Pq4sFgkI8//phf/epXZGZmmlUoG943JiaGgQMH0rdvX1asWGFGWDWVP9cgqyzLfPLJJ9x99900a9bM1IeNzwyrdlxcHMOHD6d3794sXLjwnFuNj4doDzQyDANZMBhk5cqVXHrppWagv1FuNRAIoGma6RqSJInc3FxSU1PZsmXLaet+4jjunZKSEkKhELqus337dpo1a0ZOTs533EJGLjJj66bD4WDChAmsXLnSTDpo3KOxYUg2JSUluN1u0tPTzQlu9+7dPPvss/z5z3/mzTffNPvN4/EwfPhw1q1bZ0oh5zKihG4CSJJETU0N8fHxdZbYSMIIWZZ56KGHuPXWW/nXv/6FEN8Sw+l00rlzZwoLC5tkhZ42bRqXXXYZa9asYefOnXTu3LneiqvrGvv27mHQoIGsXbsW2WbD4YiI2HGxsXi9HsrLy03yN5XIbbPZWLlyJX379iUhIcEMMGndujW33norQ4cOZfv27fXyoLds2RKfzxclNFEduklguIMi+2ntKIo/MjCRefLJx9m2bQcffjgjkr3DZkMiUuwvPT2dm266if/3//5fo7XFWHlDoRAHDx5kwoQJ9O7dmyeeeMLccGKzyWhKkH+/MY3xF41HERAWErIENk0goxPjdhION20GTKOthw8fNovdQYToxmaUtWvXmttIjd1/RkH4srIyMjMzm7SNP3dECd0EMCLEjAHqcjgIqyp2mw0hdD744L9cMuFSJBlCYQWnQzYty5deeimjR48+LZHWONdwo+m6zrx586isrOSqq67C7XabonUkPhvWrllFrNeNNzGFqhqfWVBAqitYaHzPuquuKWDsgvL5fPV29SmKwuHDhykuLub8888Hvg1HNfr6TNvq2BSIEroJYGwbrKioqDPUCGw2O+FwmCeeeJLWrVvRrWvXOoLUlefVIwn1Bw8eTL9+/RrNh2oQurKykosvvpj27duzdetW9u/fX48Qtb4AR4pL2b12I0XFpYwcNRJZlrBJdtSQj+qqGuLiIi630908cSIYk0SHDh3Ytm0bffv2RZZlwuEwsiyzZMkSBg8ebCbbMLaTBoNB/H5/k8a9nymIEroJoGkasbGxZGVl8c0339Cze1dkuw1VC3P0aAl+f5APP/wv199wAy63G6ELqqqq2LFjBxdffHGj1nc2pIRx48ahaRputxtJknjppZeoqakhMTEREIy98EJGjx7N8q9Wk5beApskELqIrN7rNtK6dRvi4po2A6axGnfr1o2PPvqIa6+91kw8IITgwgsvNKtqWn30hYWFpKamnvMuK4gGljQ6RN1eYiNV0KuvvsqTU6fgjYupW5EjoZRIkZVbB4Sm8c7bb+P1ern88stxOByNJtIar9cqJodCIWbOnEkoFGLSpEkRNxQaQugg2wEb1InrNVVVPP3kk9xx5x20adv2uHuHGwuGZV1VVf7973+TlZXFuHHjTOOX8SyGVAGRRP3PPfccl19+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");
        questaoAlternativa37.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa38 = new QuestaoAlternativa();
        questaoAlternativa38.setId(INICIOQUESTAO.longValue());
        questaoAlternativa38.setAno(ANO);
        questaoAlternativa38.setDescricao("Analise as seguintes afirmações sobre subprogramas em linguagens de programação:\n" +
                "$\\newline$I. Cada subprograma tem um único ponto de entrada.\n" +
                "$\\newline$II. O controle sempre retorna para o chamador quando a execução do subprograma termina.\n" +
                "$\\newline$III. A unidade chamadora é suspensa durante a execução do subprograma chamado.\n" +
                "$\\newline$IV. Uma chamada a um subprograma é a requisição explícita para que ele seja executado.\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa38.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa38.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa38.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
        questaoAlternativa38.setAlternativaCorreta("e");

        questaoAlternativa38.setAlternativasA("Apenas I e IV");
        questaoAlternativa38.setAlternativasB("Apenas II e III.");
        questaoAlternativa38.setAlternativasC("Apenas I, II e III.");
        questaoAlternativa38.setAlternativasD("Apenas II, III e IV.");
        questaoAlternativa38.setAlternativasE("I, II, III e IV.");
        questaoAlternativa38.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa39 = new QuestaoAlternativa();
        questaoAlternativa39.setId(INICIOQUESTAO.longValue());
        questaoAlternativa39.setAno(ANO);
        questaoAlternativa39.setDescricao("Analise as seguintes assertivas sobre autômatos e linguagens:\n" +
                "$\\newline$I. Autômatos finitos determinísticos e autômatos finitos não determinísticos aceitam o mesmo conjunto de linguagens.\n" +
                "$\\newline$II. Seja L uma linguagem livre de contexto, existe um autômato com duas pilhas determinístico que reconhece L.\n" +
                "$\\newline$III. Toda linguagem enumerável recursivamente é também uma linguagem recursiva.\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa39.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa39.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa39.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa39.setAlternativaCorreta("c");

        questaoAlternativa39.setAlternativasA("Apenas I.");
        questaoAlternativa39.setAlternativasB("Apenas II.");
        questaoAlternativa39.setAlternativasC("Apenas I e II.");
        questaoAlternativa39.setAlternativasD("Apenas I e III.");
        questaoAlternativa39.setAlternativasE("Apenas II e III.");
        questaoAlternativa39.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa40 = new QuestaoAlternativa();
        questaoAlternativa40.setId(INICIOQUESTAO.longValue());
        questaoAlternativa40.setAno(ANO);
        questaoAlternativa40.setDescricao("Assinale a alternativa INCORRETA.");
        questaoAlternativa40.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa40.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa40.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa40.setAlternativaCorreta("d");

        questaoAlternativa40.setAlternativasA("A união de duas linguagens recursivas é uma linguagem recursiva.");
        questaoAlternativa40.setAlternativasB("Segundo a Tese de Church, a capacidade de computação representada pela máquina de Turing é o limite máximo que pode ser atingido por qualquer modelo de computação.");
        questaoAlternativa40.setAlternativasC("Seja L uma linguagem enumerável recursivamente, se o complemento de L for enumerável recursivamente, então L é uma linguagem recursiva.");
        questaoAlternativa40.setAlternativasD("Um problema X é NP-completo quando X pertence à classe NP e, adicionalmente, X é redutível em\n" +
                "tempo polinomial para qualquer outro problema Y na classe NP.");
        questaoAlternativa40.setAlternativasE("Todo problema que está na classe P também está na classe NP.\n");
        questaoAlternativa40.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa41 = new QuestaoAlternativa();
        questaoAlternativa41.setId(INICIOQUESTAO.longValue());
        questaoAlternativa41.setAno(ANO);
        questaoAlternativa41.setDescricao("Considere dois problemas de decisão PA e PB, sendo PA indecidível e PB decidível. Observe também dois problemas de decisão PC e PD, cuja decidibilidade é desconhecida. Suponha que seja possível construir de forma correta as seguintes reduções:\n" +
                "$\\newline$- de PA para PC.\n" +
                "$\\newline$- de PD para PA.\n" +
                "$\\newline$- de PD para PB.\n" +
                "$\\newline$Com base no cenário descrito, assinale a alternativa correta.");
        questaoAlternativa41.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa41.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa41.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
        questaoAlternativa41.setAlternativaCorreta("c");

        questaoAlternativa41.setAlternativasA("Não se pode afirmar nada sobre a decidibilidade dos problemas PC e PD.\n");
        questaoAlternativa41.setAlternativasB("Não se pode afirmar nada sobre a decidibilidade de PC, porém PD é decidível.");
        questaoAlternativa41.setAlternativasC("PC é indecidível e PD é decidível.");
        questaoAlternativa41.setAlternativasD("PC e PD são ambos indecidíveis.");
        questaoAlternativa41.setAlternativasE("PC é indecidível, contudo não se pode afirmar nada sobre a decidibilidade de PD.");
        questaoAlternativa41.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa42 = new QuestaoAlternativa();
        questaoAlternativa42.setId(INICIOQUESTAO.longValue());
        questaoAlternativa42.setAno(ANO);
        questaoAlternativa42.setDescricao("Um PLD que armazena sua configuração em memórias do tipo SRAM é, segundo sua capacidade de configuração, ________ e, segundo sua capacidade de armazenamento, _______. Um PLD que armazena sua configuração em memórias do tipo EEPROM ou FLASH é, segundo sua capacidade de configuração, ________ e, segundo sua capacidade de armazenamento, ________. Assinale a alternativa que preenche, correta e respectivamente, as lacunas do trecho acima.");
        questaoAlternativa42.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa42.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa42.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa42.setAlternativaCorreta("d");

        questaoAlternativa42.setAlternativasA("reprogramável – não volátil – reprogramável – volátil");
        questaoAlternativa42.setAlternativasB("programável somente uma vez – não volátil – reprogramável – não volátil");
        questaoAlternativa42.setAlternativasC("reprogramável – volátil – reprogramável – volátil");
        questaoAlternativa42.setAlternativasD("reprogramável – volátil – reprogramável – não volátil");
        questaoAlternativa42.setAlternativasE("reprogramável – volátil – programável somente uma vez – não volátil");
        questaoAlternativa42.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa43 = new QuestaoAlternativa();
        questaoAlternativa43.setId(INICIOQUESTAO.longValue());
        questaoAlternativa43.setAno(ANO);
        questaoAlternativa43.setDescricao("Analise as assertivas a seguir sobre a figura abaixo." +
                "$\\newline$I. A figura representa o símbolo lógico de um multiplexador 4:1.\n" +
                "$\\newline$II. Um multiplexador 8:1 pode ser composto por 2 multiplexadores 4:1 e um multiplexador 2:1.\n" +
                "$\\newline$III. A saída Y do multiplexador representado na figura recebe A0 quando S0=0 e S1=1.\n" +
                "$\\newline$IV. O multiplexador representado pela figura pode ser implementado com 4 portas lógicas AND NEGADA (NAND) de 3 entradas, 1 porta lógica AND NEGADA (NAND) de 4 entradas e 2 inversores.\n" +
                "$\\newline$V. O multiplexador representado pela figura pode implementar qualquer função booleana de 2 entradas: S0 e S1.\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa43.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa43.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa43.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
        questaoAlternativa43.setAlternativaCorreta("e");
        questaoAlternativa43.setImagem(true);
        questaoAlternativa43.setAlternativasA("Apenas I e II.");
        questaoAlternativa43.setAlternativasB("Apenas I e III.");
        questaoAlternativa43.setAlternativasC("Apenas III e IV. ");
        questaoAlternativa43.setAlternativasD("Apenas II, IV e V.");
        questaoAlternativa43.setAlternativasE("Apenas I, II, IV e V.");
        questaoAlternativa43.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa43.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa44 = new QuestaoAlternativa();
        questaoAlternativa44.setId(INICIOQUESTAO.longValue());
        questaoAlternativa44.setAno(ANO);
        questaoAlternativa44.setDescricao("Considere que um processador tenha 16 bits de endereçamento de byte. Sua cache possui mapeamento direto com uma capacidade de 128 palavras e blocos de 8 palavras. O endereço se divide em campos para acesso à cache de acordo com a seguinte representação apresentada na imagem abaixo.\n" +
                "O número de bits de cada um dos campos acima, ou seja, os valores de i, ii, iii e iv são, respectivamente:");
        questaoAlternativa44.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa44.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa44.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa44.setAlternativaCorreta("b");
        questaoAlternativa44.setImagem(true);
        questaoAlternativa44.setAlternativasA("12, 6, 5 e 3");
        questaoAlternativa44.setAlternativasB(" 8, 4, 3 e 1");
        questaoAlternativa44.setAlternativasC(" 8, 6, 5 e 3\n");
        questaoAlternativa44.setAlternativasD("12, 4, 3 e 1");
        questaoAlternativa44.setAlternativasE("12, 6, 3 e 1");
        questaoAlternativa44.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa44.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa45 = new QuestaoAlternativa();
        questaoAlternativa45.setId(INICIOQUESTAO.longValue());
        questaoAlternativa45.setAno(ANO);
        questaoAlternativa45.setDescricao("Anulada");
        questaoAlternativa45.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
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
        questaoAlternativa46.setDescricao("Uma partição de disco rígido é formatada com um sistema de arquivos que utiliza alocação encadeada baseada em tabela de alocação de arquivos (FAT). Após a formatação, a partição possui setores de 512 bytes e tamanho de bloco (cluster) de 2048 bytes. Ao criar um arquivo nessa partição, gravar 1 byte e fechá-lo, qual espaço esse arquivo ocupa na área de dados da partição?");
        questaoAlternativa46.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa46.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa46.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
        questaoAlternativa46.setAlternativaCorreta("d");

        questaoAlternativa46.setAlternativasA("1 byte");
        questaoAlternativa46.setAlternativasB("2 bytes");
        questaoAlternativa46.setAlternativasC("512 bytes\n");
        questaoAlternativa46.setAlternativasD("2048 bytes");
        questaoAlternativa46.setAlternativasE("1 setor");
        questaoAlternativa46.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa47 = new QuestaoAlternativa();
        questaoAlternativa47.setId(INICIOQUESTAO.longValue());
        questaoAlternativa47.setAno(ANO);
        questaoAlternativa47.setDescricao("A figura abaixo representa um registrador síncrono com sinal carrega que permite ou não o armazenamento de novo dado de entrada e reset assíncrono. Sobre esse registrador, analise as seguintes assertivas:" +
                "$\\newline$I. O registrador irá para o estado de reset, ou seja, cada bit do registrador vai para um estado inicial definido no projeto, quando o sinal de reset = 1, independentemente do valor do sinal do relógio clk.\n" +
                "$\\newline$II. A única maneira de manter o valor armazenado nesse registrador é realizando clock gating, ou seja, forçando o sinal de relógio clk ao valor 0.\n" +
                "$\\newline$III. O valor da entrada A é armazenado no registrador quando as entradas reset = 0, carrega = 1 e o relógio clk = 1.\n" +
                "$\\newline$IV. Quando há a transição do sinal do relógio de 0 para 1 (clk varia 0 para 1) e o sinal de carrega = 0 e reset = 0, o registrador armazena o valor da entrada A.\n" +
                "$\\newline$V. O registrador é formado por um conjunto de elementos de memória, chamados de flip-flop. O número de flip-flop é proporcional ao número de bits que o registrador pode armazenar.$\\newline$ Quais estão corretas?");
        questaoAlternativa47.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa47.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa47.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa47.setAlternativaCorreta("d");
        questaoAlternativa47.setImagem(true);
        questaoAlternativa47.setAlternativasA("Apenas I e V");
        questaoAlternativa47.setAlternativasB("Apenas II e III.");
        questaoAlternativa47.setAlternativasC("Apenas I, II e IV. ");
        questaoAlternativa47.setAlternativasD("Apenas I, IV e V.\n");
        questaoAlternativa47.setAlternativasE("I, II, III, IV e V.\n");
        questaoAlternativa47.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa47.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa48 = new QuestaoAlternativa();
        questaoAlternativa48.setId(INICIOQUESTAO.longValue());
        questaoAlternativa48.setAno(ANO);
        questaoAlternativa48.setDescricao("RAID é um conjunto de discos físicos vistos pelo Sistema Operacional como uma\n" +
                "única unidade lógica. O RAID tem as seguintes características:\n" +
                "$\\newline$I. RAID A: Redundante, espelhamento de discos, utiliza o dobro de discos.\n" +
                "$\\newline$II. RAID B: Acesso paralelo, paridade de bit intercalada nos discos, utiliza apenas um disco.\n" +
                "$\\newline$III. RAID C: Acesso independente, paridade de bloco intercalada e distribuída.\n" +
                "$\\newline$De acordo com as configurações dos itens I, II e III, os RAID A, B e C são, respectivamente:");
        questaoAlternativa48.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa48.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa48.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
        questaoAlternativa48.setAlternativaCorreta("d");

        questaoAlternativa48.setAlternativasA("RAID 0, RAID 2 e RAID 4.");
        questaoAlternativa48.setAlternativasB("RAID 2, RAID 4 e RAID 6.\n");
        questaoAlternativa48.setAlternativasC("RAID 0, RAID 3 e RAID 5.");
        questaoAlternativa48.setAlternativasD("RAID 1, RAID 3 e RAID 5.");
        questaoAlternativa48.setAlternativasE("RAID 1, RAID 4 e RAID 6.");
        questaoAlternativa48.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa49 = new QuestaoAlternativa();
        questaoAlternativa49.setId(INICIOQUESTAO.longValue());
        questaoAlternativa49.setAno(ANO);
        questaoAlternativa49.setDescricao("Considere o seguinte trecho de programa em linguagem Assembly do MIPS apresentado na imagem abaixo.\n" +
                " Em hexadecimal, os valores da palavra1 e palavra2 são, respectivamente:");
        questaoAlternativa49.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa49.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa49.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa49.setAlternativaCorreta("b");
        questaoAlternativa49.setImagem(true);
        questaoAlternativa49.setAlternativasA("0x10010002 e 0x10010002");
        questaoAlternativa49.setAlternativasB("0x10010000 e 0x10010004");
        questaoAlternativa49.setAlternativasC("0x10010002 e 0x10010006");
        questaoAlternativa49.setAlternativasD("0x10010000 e 0x10010008");
        questaoAlternativa49.setAlternativasE("0x10010002 e 0x10010010");
        questaoAlternativa49.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa49.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa50 = new QuestaoAlternativa();
        questaoAlternativa50.setId(INICIOQUESTAO.longValue());
        questaoAlternativa50.setAno(ANO);
        questaoAlternativa50.setDescricao("Analise o código apresentado abaixo." +
                "Ao executar esse programa, o processo criado possuirá quantos fluxos de execução (threads) no instante em que finalizar o laço for(;;)?");
        questaoAlternativa50.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
        questaoAlternativa50.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa50.setDisciplina(EDisciplina.PROGRAMACAO);
        questaoAlternativa50.setAlternativaCorreta("e");
        questaoAlternativa50.setImagem(true);
        questaoAlternativa50.setAlternativasA("Um.");
        questaoAlternativa50.setAlternativasB("Dois.");
        questaoAlternativa50.setAlternativasC("Nove.");
        questaoAlternativa50.setAlternativasD("Dez.");
        questaoAlternativa50.setAlternativasE("Onze.");
        questaoAlternativa50.setImagemQuestao("data:image/png;base64,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");
        questaoAlternativa50.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa51 = new QuestaoAlternativa();
        questaoAlternativa51.setId(INICIOQUESTAO.longValue());
        questaoAlternativa51.setAno(ANO);
        questaoAlternativa51.setDescricao("Qualquer relação r(R), pertinente ao esquema de relação R(A1, A2, ..., An), é um subconjunto do produto cartesiano dos domínios dos atributos que definem R. Em relação às características de relações, analise as afirmações abaixo e assinale V, se verdadeiras, ou F, se falsas.\n" +
                "$\\newline$( ) A ordenação das tuplas de uma relação é indiferente, visto que uma relação é definida como um conjunto de tuplas.\n" +
                "$\\newline$( ) Uma tupla é uma lista ordenada de valores, então há uma posição relativa pré-definida para cada valor de atributo na tupla (por exemplo, o valor “13/02/2000”, pertinente ao atributo “data de nascimento”, é o terceiro valor na lista de valores de uma tupla).\n" +
                "$\\newline$( ) Os atributos da chave primária são, obrigatoriamente, os primeiros atributos na lista de atributos definida no esquema de relação.\n" +
                "$\\newline$A ordem correta de preenchimento dos parênteses, de cima para baixo, é:");
        questaoAlternativa51.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa51.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa51.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa51.setAlternativaCorreta("e");

        questaoAlternativa51.setAlternativasA("V – F – F");
        questaoAlternativa51.setAlternativasB("F – V – F");
        questaoAlternativa51.setAlternativasC("V – F – V.");
        questaoAlternativa51.setAlternativasD("F – F – V.");
        questaoAlternativa51.setAlternativasE("V – V – F.");
        questaoAlternativa51.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa52 = new QuestaoAlternativa();
        questaoAlternativa52.setId(INICIOQUESTAO.longValue());
        questaoAlternativa52.setAno(ANO);
        questaoAlternativa52.setDescricao("Considere as descrições de dois mecanismos de segurança de banco de dados: (i) duas ou mais tuplas em diferentes níveis de classificação são gravadas, ambas com o mesmo valor de chave aparente; e (ii) uma única tupla é gravada pertinente ao nível de classificação mais elevado, e ocorre a produção de tuplas correspondentes a níveis inferiores. Tais mecanismos de segurança são denominados, respectivamente,");
        questaoAlternativa52.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa52.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa52.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa52.setAlternativaCorreta("c");

        questaoAlternativa52.setAlternativasA("acesso discricionário e poli-instanciação.");
        questaoAlternativa52.setAlternativasB("filtragem e poli-instanciação.\n");
        questaoAlternativa52.setAlternativasC("poli-instanciação e filtragem.");
        questaoAlternativa52.setAlternativasD("filtragem e acesso discricionário.");
        questaoAlternativa52.setAlternativasE("poli-instanciação e acesso discricionário.");
        questaoAlternativa52.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa53 = new QuestaoAlternativa();
        questaoAlternativa53.setId(INICIOQUESTAO.longValue());
        questaoAlternativa53.setAno(ANO);
        questaoAlternativa53.setDescricao("Em Engenharia de Software, as atividades abaixo são essenciais à gestão de configuração:\n" +
                "$\\newline$- _______ de gerenciamento de configuração.\n" +
                "$\\newline$- Gerenciamento de _______.\n" +
                "$\\newline$- Gerenciamento de versões e de _______.\n" +
                "$\\newline$- _______ de sistemas.\n" +
                "$\\newline$Assinale a alternativa que preenche, correta e respectivamente, as lacunas do trecho acima.");
        questaoAlternativa53.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa53.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa53.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa53.setAlternativaCorreta("d");

        questaoAlternativa53.setAlternativasA("Planejamento – mudanças – componentes – Auditoria");
        questaoAlternativa53.setAlternativasB("Definição – auditoria – releases – Construção");
        questaoAlternativa53.setAlternativasC("Definição – mudanças – itens de configuração – Auditoria");
        questaoAlternativa53.setAlternativasD("Planejamento – mudanças – releases – Construção");
        questaoAlternativa53.setAlternativasE("Planejamento – auditoria – itens de configuração – Construção");
        questaoAlternativa53.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa54 = new QuestaoAlternativa();
        questaoAlternativa54.setId(INICIOQUESTAO.longValue());
        questaoAlternativa54.setAno(ANO);
        questaoAlternativa54.setDescricao("Em Rede de Computadores, qual entidade indica o processo que receberá o pacote de entrada?");
        questaoAlternativa54.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa54.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa54.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa54.setAlternativaCorreta("a");

        questaoAlternativa54.setAlternativasA("Porta.");
        questaoAlternativa54.setAlternativasB("Endereço IP.");
        questaoAlternativa54.setAlternativasC("Endereço Ethernet.\n");
        questaoAlternativa54.setAlternativasD("Identificador do processo.");
        questaoAlternativa54.setAlternativasE("Endereço URL.");
        questaoAlternativa54.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa55 = new QuestaoAlternativa();
        questaoAlternativa55.setId(INICIOQUESTAO.longValue());
        questaoAlternativa55.setAno(ANO);
        questaoAlternativa55.setDescricao("Em consultas escritas em SQL, quando há pelo menos um NULL no predicado da\n" +
                "cláusula WHERE, o resultado da avaliação é “desconhecido” (exceto quando são explicitamente empregados IS NULL ou IS NOT NULL); por exemplo, o resultado da avaliação de 3+NULL>7 é “desconhecido”. Portanto, “verdadeiro”, “falso” e “desconhecido” são os resultados possíveis na avaliação de predicados da cláusula WHERE. A regra geral é que são selecionadas apenas as combinações de tuplas em que o predicado é avaliado como “verdadeiro”. Seja a relação R que possui quatro tuplas – (12, 15, 5100), (13, NULL, 3500), (14, NULL, NULL) e (15, 12, NULL) – em que o primeiro, o segundo e o terceiro valores em cada tupla referem-se aos atributos at1, at2 e at3, respectivamente. Os comandos a seguir representam consultas sobre R:\n" +
                "$\\newline$(C1) select * from R\n" +
                "$\\newline$where (at1>=12) AND (at2>14)\n" +
                "$\\newline$(C2) select * from R\n" +
                "$\\newline$where (at2>12) OR (at3>3000)\n" +
                "$\\newline$(C3) select * from R\n" +
                "$\\newline$where (NOT (at1<at2))\n" +
                "$\\newline$A quantidade de tuplas retornadas pelas execuções dos comandos (C1), (C2) e (C3), respectivamente, é:");
        questaoAlternativa55.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa55.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa55.setDisciplina(EDisciplina.BANCO_DE_DADOS);
        questaoAlternativa55.setAlternativaCorreta("d");

        questaoAlternativa55.setAlternativasA("dois, um e dois.");
        questaoAlternativa55.setAlternativasB("dois, dois e um.");
        questaoAlternativa55.setAlternativasC("um, um e dois.\n");
        questaoAlternativa55.setAlternativasD("um, dois e um.");
        questaoAlternativa55.setAlternativasE("dois, dois, dois.");
        questaoAlternativa55.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa56 = new QuestaoAlternativa();
        questaoAlternativa56.setId(INICIOQUESTAO.longValue());
        questaoAlternativa56.setAno(ANO);
        questaoAlternativa56.setDescricao("A UML é um conjunto de notações que servem para modelagem de diferentes\n" +
                "aspectos de um sistema de software. Essas notações permitem criar diferentes tipos de diagramas, dentre eles:\n" +
                "$\\newline$- Um Diagrama de ________________ permite modelar a arquitetura do sistema em tempo de execução, mostrando a configuração dos elementos de hardware (nós) e como os componentes de software são mapeados nestes nós.\n" +
                "$\\newline$- Um Diagrama de _____________ permite modelar a organização estrutural da\n" +
                "arquitetura/implementação em termos de componentes de software e suas dependências.\n" +
                "$\\newline$- Um Diagrama de _____________ permite modelar a troca de mensagens entre objetos, enfatizando seu sequenciamento no tempo.\n" +
                "$\\newline$- Um Diagrama de _____________ permite modelar a arquitetura através de agrupamentos lógicos, e de dependências entre estes.\n" +
                "$\\newline$Assinale a alternativa que preenche, correta e respectivamente, as lacunas do trecho acima.");
        questaoAlternativa56.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa56.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa56.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa56.setAlternativaCorreta("c");

        questaoAlternativa56.setAlternativasA("Implantação – Classes – Sequência – Componentes");
        questaoAlternativa56.setAlternativasB("Componentes – Classes – Interação – Pacotes\n");
        questaoAlternativa56.setAlternativasC("Implantação – Componentes – Sequência – Pacotes");
        questaoAlternativa56.setAlternativasD("Componentes – Pacotes – Sequência – classes");
        questaoAlternativa56.setAlternativasE("Implantação – Componentes – Comunicação – Pacotes");
        questaoAlternativa56.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa57 = new QuestaoAlternativa();
        questaoAlternativa57.setId(INICIOQUESTAO.longValue());
        questaoAlternativa57.setAno(ANO);
        questaoAlternativa57.setDescricao("Considerando as transformações entre sistemas de coordenadas 2D e o processo de recorte, analise as assertivas abaixo:\n" +
                "$\\newline$I. Denomina-se window a área do universo que será mapeada para a tela, e viewport a área de tela que será utilizada nesse processo.\n" +
                "$\\newline$II. Se as razões entre a largura e altura da window e a largura e a altura da viewport não forem as mesmas, ocorrerá uma mudança não uniforme de escala.\n" +
                "$\\newline$III. O recorte de linhas (clipping) pode ser feito tanto no sistema de coordenadas do universo como no da tela.\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa57.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa57.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa57.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa57.setAlternativaCorreta("e");

        questaoAlternativa57.setAlternativasA("Apenas I.");
        questaoAlternativa57.setAlternativasB("Apenas II.");
        questaoAlternativa57.setAlternativasC("Apenas III.\n");
        questaoAlternativa57.setAlternativasD("Apenas I e III.");
        questaoAlternativa57.setAlternativasE("I, II e III.\n");
        questaoAlternativa57.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa58 = new QuestaoAlternativa();
        questaoAlternativa58.setId(INICIOQUESTAO.longValue());
        questaoAlternativa58.setAno(ANO);
        questaoAlternativa58.setDescricao("No processo de visualização tridimensional, a região do universo que será recortada e projetada sobre o plano de projeção é denominada:");
        questaoAlternativa58.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa58.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa58.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa58.setAlternativaCorreta("b");

        questaoAlternativa58.setAlternativasA("Projeção perspectiva.");
        questaoAlternativa58.setAlternativasB("Volume de visão.");
        questaoAlternativa58.setAlternativasC("Sistema de referência da câmera.");
        questaoAlternativa58.setAlternativasD("Observador.");
        questaoAlternativa58.setAlternativasE("Plano de recorte frontal.");
        questaoAlternativa58.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa59 = new QuestaoAlternativa();
        questaoAlternativa59.setId(INICIOQUESTAO.longValue());
        questaoAlternativa59.setAno(ANO);
        questaoAlternativa59.setDescricao("São técnicas de processamento digital todas as opções abaixo, EXCETO:");
        questaoAlternativa59.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa59.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa59.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa59.setAlternativaCorreta("d");

        questaoAlternativa59.setAlternativasA("Processamento morfológico.");
        questaoAlternativa59.setAlternativasB("Amostragem e quantização.\n");
        questaoAlternativa59.setAlternativasC("Segmentação.");
        questaoAlternativa59.setAlternativasD("Têmpera simulada.");
        questaoAlternativa59.setAlternativasE("Limiarização.\n");
        questaoAlternativa59.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa60 = new QuestaoAlternativa();
        questaoAlternativa60.setId(INICIOQUESTAO.longValue());
        questaoAlternativa60.setAno(ANO);
        questaoAlternativa60.setDescricao("Qual protocolo faz o mapeamento de endereço IP em endereço Ethernet?");
        questaoAlternativa60.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa60.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa60.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa60.setAlternativaCorreta("e");

        questaoAlternativa60.setAlternativasA("IEEE 802.11");
        questaoAlternativa60.setAlternativasB("DNS");
        questaoAlternativa60.setAlternativasC("TCP");
        questaoAlternativa60.setAlternativasD("IP");
        questaoAlternativa60.setAlternativasE("ARP");
        questaoAlternativa60.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa61 = new QuestaoAlternativa();
        questaoAlternativa61.setId(INICIOQUESTAO.longValue());
        questaoAlternativa61.setAno(ANO);
        questaoAlternativa61.setDescricao("Sobre a transformada wavelet para processamento digital de imagens, é correto\n" +
                "afirmar que:\n");
        questaoAlternativa61.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa61.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa61.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
        questaoAlternativa61.setAlternativaCorreta("b");

        questaoAlternativa61.setAlternativasA("É um algoritmo que produz classificação de objetos na imagem.");
        questaoAlternativa61.setAlternativasB("É uma técnica que permite o processamento da imagem em multirresolução.");
        questaoAlternativa61.setAlternativasC("É uma técnica capaz de extrair frequências da imagem sem a localização temporal das mesmas.");
        questaoAlternativa61.setAlternativasD("É uma técnica que permite a geração de imagens de maior resolução.");
        questaoAlternativa61.setAlternativasE("É um algoritmo capaz de compreender informações granulares em imagens digitais.");
        questaoAlternativa61.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa62 = new QuestaoAlternativa();
        questaoAlternativa62.setId(INICIOQUESTAO.longValue());
        questaoAlternativa62.setAno(ANO);
        questaoAlternativa62.setDescricao("Qual é o estilo de comunicação indireta no qual publicadores divulgam eventos\n" +
                "estruturados para um serviço de eventos e assinantes expressam interesse em eventos específicos por meio de assinaturas? ");
        questaoAlternativa62.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa62.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa62.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa62.setAlternativaCorreta("b");

        questaoAlternativa62.setAlternativasA("Comunicação em grupo.");
        questaoAlternativa62.setAlternativasB("Sistema publicar-assinar");
        questaoAlternativa62.setAlternativasC("Filas de mensagens.");
        questaoAlternativa62.setAlternativasD("Memória compartilhada distribuída.");
        questaoAlternativa62.setAlternativasE("Espaços de tuplas.");
        questaoAlternativa62.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa63 = new QuestaoAlternativa();
        questaoAlternativa63.setId(INICIOQUESTAO.longValue());
        questaoAlternativa63.setAno(ANO);
        questaoAlternativa63.setDescricao("Uma representação intermediária do programa fonte pode ser gerada com a transformação da árvore de derivação em um segmento de código. Em relação à etapa de geração de código intermediário do compilador, qual das alternativas está INCORRETA?\n");
        questaoAlternativa63.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa63.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa63.setDisciplina(EDisciplina.COMPILADORES);
        questaoAlternativa63.setAlternativaCorreta("d");

        questaoAlternativa63.setAlternativasA("Definindo-se uma representação intermediária adequada, um compilador construído pode combinar um front-end para uma linguagem x com um back-end para a linguagem y.");
        questaoAlternativa63.setAlternativasB("Árvores de sintaxe e códigos de três endereços são algumas das possibilidades de representação intermediária.");
        questaoAlternativa63.setAlternativasC("Linguagens de alto nível, como, por exemplo, a linguagem C, podem ser utilizadas como uma forma\n" +
                "de representação intermediária.");
        questaoAlternativa63.setAlternativasD("Na geração de código intermediário, são realizadas tarefas como seleção de instruções, alocação e atribuição de registrador e escalonamento de instruções que dependem do conhecimento da máquina-alvo para a qual será gerado o código objeto.");
        questaoAlternativa63.setAlternativasE("Uma das vantagens da aplicação da fase de geração de código intermediário é a possibilidade de\n" +
                "realização de otimização e a tradução do código para diversas máquinas.");
        questaoAlternativa63.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa64 = new QuestaoAlternativa();
        questaoAlternativa64.setId(INICIOQUESTAO.longValue());
        questaoAlternativa64.setAno(ANO);
        questaoAlternativa64.setDescricao("Em sistemas de arquivos distribuídos, o requisito no qual os programas clientes não devem conhecer a distribuição de arquivos, sendo que um único conjunto de operações é fornecido para acesso a arquivos locais e remotos, é denominado transparência de");
        questaoAlternativa64.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa64.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa64.setDisciplina(EDisciplina.SISTEMAS_DISTRIBUIDOS);
        questaoAlternativa64.setAlternativaCorreta("a");

        questaoAlternativa64.setAlternativasA("acesso.");
        questaoAlternativa64.setAlternativasB("desempenho.");
        questaoAlternativa64.setAlternativasC("escala.");
        questaoAlternativa64.setAlternativasD("localização.");
        questaoAlternativa64.setAlternativasE("mobilidade.");
        questaoAlternativa64.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa65 = new QuestaoAlternativa();
        questaoAlternativa65.setId(INICIOQUESTAO.longValue());
        questaoAlternativa65.setAno(ANO);
        questaoAlternativa65.setDescricao("Ethernet é um padrão para redes locais. Qual das alternativas abaixo NÃO é função do Ethernet?");
        questaoAlternativa65.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa65.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa65.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
        questaoAlternativa65.setAlternativaCorreta("b");

        questaoAlternativa65.setAlternativasA("Conexão de redes locais.");
        questaoAlternativa65.setAlternativasB("Controle de congestionamento.");
        questaoAlternativa65.setAlternativasC("Envio de pacotes.");
        questaoAlternativa65.setAlternativasD("Definição de cabeamento e sinais elétricos.");
        questaoAlternativa65.setAlternativasE("Detecção de colisão.");
        questaoAlternativa65.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa66 = new QuestaoAlternativa();
        questaoAlternativa66.setId(INICIOQUESTAO.longValue());
        questaoAlternativa66.setAno(ANO);
        questaoAlternativa66.setDescricao("Inteligência Artificial é uma área da ciência que se propõe a elaborar algoritmos que simulem a capacidade cognitiva humana. Assinale a técnica computacional que NÃO faz parte de Inteligência Artificial.");
        questaoAlternativa66.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa66.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa66.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa66.setAlternativaCorreta("d");

        questaoAlternativa66.setAlternativasA("Sistemas multiagentes.");
        questaoAlternativa66.setAlternativasB("Redes neurais artificiais.");
        questaoAlternativa66.setAlternativasC("Algoritmos genéticos.");
        questaoAlternativa66.setAlternativasD("Filtros de transformação ");
        questaoAlternativa66.setAlternativasE("Lógica difusa.");
        questaoAlternativa66.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa67 = new QuestaoAlternativa();
        questaoAlternativa67.setId(INICIOQUESTAO.longValue());
        questaoAlternativa67.setAno(ANO);
        questaoAlternativa67.setDescricao("Analise as seguintes afirmações sobre comunicação entre processos em sistemas\n" +
                "distribuídos:\n" +
                "$\\newline$I. A essência da comunicação persistente é que uma mensagem apresentada para transmissão é armazenada pelo sistema de comunicação pelo tempo que for necessário para entregá-la.\n" +
                "$\\newline$II. Em comunicação transiente, nenhuma facilidade de armazenamento é oferecida de modo que o receptor deve estar preparado para aceitar a mensagem quando ela for enviada.\n" +
                "$\\newline$III. Em comunicação síncrona, o remetente tem permissão de continuar imediatamente após a mensagem ter sido apresentada para transmissão, possivelmente antes de ela ter sido enviada.\n" +
                "$\\newline$IV. Em comunicação assíncrona, o remetente é bloqueado no mínimo até que uma mensagem seja recebida. Alternativamente, o remetente pode ser bloqueado até ocorrer a entrega da mensagem ou, até mesmo, até que o receptor tenha respondido.\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa67.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa67.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa67.setDisciplina(EDisciplina.SISTEMAS_DISTRIBUIDOS);
        questaoAlternativa67.setAlternativaCorreta("a");

        questaoAlternativa67.setAlternativasA("Apenas I e II.");
        questaoAlternativa67.setAlternativasB("Apenas III e IV");
        questaoAlternativa67.setAlternativasC("Apenas I, II e III.");
        questaoAlternativa67.setAlternativasD("Apenas II, III e IV.");
        questaoAlternativa67.setAlternativasE("I, II, III e IV.");
        questaoAlternativa67.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa68 = new QuestaoAlternativa();
        questaoAlternativa68.setId(INICIOQUESTAO.longValue());
        questaoAlternativa68.setAno(ANO);
        questaoAlternativa68.setDescricao("A tarefa principal de um analisador léxico consiste em ler os caracteres da entrada do programa-fonte, agrupá-los em lexemas e gerar uma sequência de tokens que será enviada ao analisador sintático. Sobre o analisador léxico, analise as assertivas abaixo:\n" +
                "$\\newline$I. Além da identificação de lexemas, outras tarefas podem ser realizadas por esse analisador, tais como: remoção de comentários e espaços em branco e a associação de mensagens de erros às linhas do programa-fonte.\n" +
                "$\\newline$II. Token é a unidade básica do texto-fonte. Pode ser representado por três informações: a classe do token, que representa o tipo do token reconhecido, o valor do token, que é o texto do lexema reconhecido e a posição que indica o local do texto-fonte (linha e coluna) onde ocorreu o token.\n" +
                "$\\newline$III. Expressões regulares e geradores de analisadores léxicos são notações utilizadas para especificar os padrões de lexemas.\n" +
                "$\\newline$IV. Na análise léxica, uma representação intermediária do tipo árvore é criada. Esta apresenta a estrutura gramatical da sequência de tokens.\n" +
                "$\\newline$Quais estão corretas?");
        questaoAlternativa68.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa68.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa68.setDisciplina(EDisciplina.COMPILADORES);
        questaoAlternativa68.setAlternativaCorreta("a");

        questaoAlternativa68.setAlternativasA("Apenas I");
        questaoAlternativa68.setAlternativasB("Apenas II.");
        questaoAlternativa68.setAlternativasC("Apenas IV.");
        questaoAlternativa68.setAlternativasD("Apenas I e II.");
        questaoAlternativa68.setAlternativasE("Apenas III e IV");
        questaoAlternativa68.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa69 = new QuestaoAlternativa();
        questaoAlternativa69.setId(INICIOQUESTAO.longValue());
        questaoAlternativa69.setAno(ANO);
        questaoAlternativa69.setDescricao("O termo Aprendizado de Máquina pode ser corretamente definido como:");
        questaoAlternativa69.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa69.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa69.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
        questaoAlternativa69.setAlternativaCorreta("b");

        questaoAlternativa69.setAlternativasA("A capacidade de um dispositivo eletrônico resolver um problema.");
        questaoAlternativa69.setAlternativasB("A construção de sistemas capazes de adquirir conhecimento a partir de exemplos.");
        questaoAlternativa69.setAlternativasC("Um programa de computador que toma decisões baseado em experiências não mapeadas.");
        questaoAlternativa69.setAlternativasD("Um programa de computador que executa com perfeição uma tarefa.");
        questaoAlternativa69.setAlternativasE("Um programa de computador que evolui automaticamente para versões aprimoradas.");
        questaoAlternativa69.setNumeroQuestao(NUMEROQUESTAO);

        NUMEROQUESTAO++;
        INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

        QuestaoAlternativa questaoAlternativa70 = new QuestaoAlternativa();
        questaoAlternativa70.setId(INICIOQUESTAO.longValue());
        questaoAlternativa70.setAno(ANO);
        questaoAlternativa70.setDescricao("Requisitos não funcionais de software são aqueles que não dizem respeito às funções específicas de software, mas, sim, a propriedades que o sistema deve possuir, ou restrições que deve atender. Existem diferentes tipos de requisitos funcionais. Abaixo estão listados exemplos para diferentes tipos de requisitos não funcionais:\n" +
                "$\\newline$- ________________: o software deve ser desenvolvido utilizando a linguagem de programação Java versão 7.4.\n" +
                "$\\newline$- ________________: deve ser possível acessar o sistema a partir dos browsers Chrome, Internet Explorer e Safari.\n" +
                "$\\newline$- ________________: o sistema deve extrair os tweets da plataforma Tweeter utilizando a API REST disponível para este fim (detalhes de acesso à API em www.tweeter.com/API).\n" +
                "$\\newline$Assinale a alternativa que preenche, correta e respectivamente, as lacunas do trecho acima.");
        questaoAlternativa70.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
        questaoAlternativa70.setProva(ETipoQuestaoProva.POSCOMP);
        questaoAlternativa70.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
        questaoAlternativa70.setAlternativaCorreta("d");

        questaoAlternativa70.setAlternativasA("Desempenho – Portabilidade – Padrões");
        questaoAlternativa70.setAlternativasB("Eficiência – Padrões – Portabilidade");
        questaoAlternativa70.setAlternativasC("Implementação – Interoperabilidade – Portabilidade");
        questaoAlternativa70.setAlternativasD("Implementação – Portabilidade – Interoperabilidade");
        questaoAlternativa70.setAlternativasE("Eficiência – Padrões – Interoperabilidade");
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
