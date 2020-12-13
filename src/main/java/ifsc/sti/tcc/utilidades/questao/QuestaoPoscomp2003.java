package ifsc.sti.tcc.utilidades.questao;

import java.util.ArrayList;
import java.util.List;

import ifsc.sti.tcc.modelos.questao.Questao;
import ifsc.sti.tcc.modelos.questao.QuestaoAlternativa;
import ifsc.sti.tcc.props.EArea;
import ifsc.sti.tcc.props.EDisciplina;
import ifsc.sti.tcc.props.ETipoQuestaoProva;

public class QuestaoPoscomp2003 {
	
	final static Integer ANO = 2003;
	static Integer INICIOQUESTAO = 71;
	static Integer NUMEROQUESTAO = 1;
	
	public static List<Questao> registerPoscomp() {

		QuestaoAlternativa questaoAlternativa1 = new QuestaoAlternativa();
		questaoAlternativa1.setId(INICIOQUESTAO.longValue());
		questaoAlternativa1.setAno(ANO);
		questaoAlternativa1.setDescricao("Seja f : R → R definida por $\\newline f(x) = \\begin{cases}{x^3 - 2x^2 - 2}, & x > -1 \\newline x -3, & x \\ se  \\leq -1\\end{cases} \\newline$  $L= \\lim_{a \\rightarrow +  \\infty} f(a_n) = -1 + \\frac{1}{n}$, é correto afirmar que");
		questaoAlternativa1.setArea(EArea.MATEMATICA);
		questaoAlternativa1.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa1.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa1.setAlternativaCorreta("c");

		questaoAlternativa1.setAlternativasA("L = −4");
		questaoAlternativa1.setAlternativasB("L = −1");
		questaoAlternativa1.setAlternativasC("L = −5");
		questaoAlternativa1.setAlternativasD("L = −3");
		questaoAlternativa1.setAlternativasE("L = −2");
		questaoAlternativa1.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa2 = new QuestaoAlternativa();
		questaoAlternativa2.setId(INICIOQUESTAO.longValue());
		questaoAlternativa2.setAno(ANO);
		questaoAlternativa2.setDescricao("Considere as seguintes afirmativas sobre números reais:\r\n" + 
				"$\\newline$(I) Se $2x − 1 < 1 e x + 1 > 0$, então $x < 0$." + 
				"$\\newline$(II) Se $x2 − 1 < 0$ ou $2x \\geq1$, então $x \\geq 0$." + 
				"$\\newline$(III) Se $x2 − 1 < 0e2x \\geq 1$, então x \\geq 0." + 
				"$\\newline$ Assinale a alternativa correta.");
		questaoAlternativa2.setArea(EArea.MATEMATICA);
		questaoAlternativa2.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa2.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa2.setAlternativaCorreta("*");
		questaoAlternativa2.setAlternativasA("Somente (I) é verdadeira.");
		questaoAlternativa2.setAlternativasB("Somente (III) é verdadeira.");
		questaoAlternativa2.setAlternativasC("(I) e (II) são verdadeiras.");
		questaoAlternativa2.setAlternativasD("(II) e (III) são verdadeiras.");
		questaoAlternativa2.setAlternativasE("(II) e (III) são falsas.");
		questaoAlternativa2.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa3 = new QuestaoAlternativa();
		questaoAlternativa3.setId(INICIOQUESTAO.longValue());
		questaoAlternativa3.setAno(ANO);
		questaoAlternativa3.setDescricao("Assinale a proposição verdadeira");
		questaoAlternativa3.setArea(EArea.MATEMATICA);
		questaoAlternativa3.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa3.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa3.setAlternativaCorreta("c");
		questaoAlternativa3.setAlternativasA("Para todo número real positivo x, tem-se $x \\geq \\sqrt{x}$");
		questaoAlternativa3.setAlternativasB("Para todo número real $x$, tem-se $\\mid x − 2\\mid > 0$");
		questaoAlternativa3.setAlternativasC("Para todo número real não nulo e positivo, tem-se $x + \\frac{1}{x} \\geq 2$");
		questaoAlternativa3.setAlternativasD("Para cada número real $x$, existe um número real $y$ tal que $xy = 1$");
		questaoAlternativa3.setAlternativasE("Para todo número real $x$, tem-se $\\sqrt{x2 − 2x +1} = x − 1$");
		questaoAlternativa3.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa4 = new QuestaoAlternativa();
		questaoAlternativa4.setId(INICIOQUESTAO.longValue());
		questaoAlternativa4.setAno(ANO);
		questaoAlternativa4.setDescricao("A função de Ackermann é uma função de $\\mathbb{N} ^ 2$ em $\\mathbb{N}$ que cresce muito rapidamente. Ela é dada por. $\\newline$ $A(0, y) = 1$, para todo $y$, $\\newline$\r\n" + 
				"$A(1, 0) = 2$, $\\newline$" + 
				"$A(x, 0) = x + 2 para x \\geq 2$, $\\newline$" + 
				"$A(x + 1, y + 1) = A(A(x, y + 1), y)$, para todos $x, y$. $\\newline$ Calcule o valor de $A(2, 2)$.");
		questaoAlternativa4.setArea(EArea.MATEMATICA);
		questaoAlternativa4.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa4.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa4.setAlternativaCorreta("c");
		questaoAlternativa4.setAlternativasA("8");
		questaoAlternativa4.setAlternativasB("7");
		questaoAlternativa4.setAlternativasC("4");
		questaoAlternativa4.setAlternativasD("1");
		questaoAlternativa4.setAlternativasE("3");
		questaoAlternativa4.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa5 = new QuestaoAlternativa();
		questaoAlternativa5.setId(INICIOQUESTAO.longValue());
		questaoAlternativa5.setAno(ANO);
		questaoAlternativa5.setDescricao("Quantas funções sobrejetoras existem de um conjunto $A$ com 6 elementos sobre um conjunto $B$ com 3 elementos?");
		questaoAlternativa5.setArea(EArea.MATEMATICA);
		questaoAlternativa5.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa5.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa5.setAlternativaCorreta("c");

		questaoAlternativa5.setAlternativasA("729");
		questaoAlternativa5.setAlternativasB("537");
		questaoAlternativa5.setAlternativasC("540");
		questaoAlternativa5.setAlternativasD("183");
		questaoAlternativa5.setAlternativasE("216");
		questaoAlternativa5.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa6 = new QuestaoAlternativa();
		questaoAlternativa6.setId(INICIOQUESTAO.longValue());
		questaoAlternativa6.setAno(ANO);
		questaoAlternativa6.setDescricao("Um relaçãoao binária ρ, em um conjunto A, é denominada reflexiva se $(a, a) \\ \\epsilon \\ \\rho$ para todo elemento $a \\ \\epsilon \\ A$. Quantas relaçõesoes reflexivas existem em um conjunto $A$ com 5 elementos?");
		questaoAlternativa6.setArea(EArea.MATEMATICA);
		questaoAlternativa6.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa6.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa6.setAlternativaCorreta("a");

		questaoAlternativa6.setAlternativasA("$2^20$");
		questaoAlternativa6.setAlternativasB("$2^10$");
		questaoAlternativa6.setAlternativasC("$25$");
		questaoAlternativa6.setAlternativasD("$2^25$");
		questaoAlternativa6.setAlternativasE("$20$");
		questaoAlternativa6.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa7 = new QuestaoAlternativa();
		questaoAlternativa7.setId(INICIOQUESTAO.longValue());
		questaoAlternativa7.setAno(ANO);
		questaoAlternativa7.setDescricao("Seja $f :  \\mathbb{R} \\rightarrow \\mathbb{R}$ uma funçãoo derivável tal que $f(−1) = 2, f(2) = 1$, $f'(−1) =0$  e $f' (2) = 0$. Além disso, $f' (x) > 0$ para todo $x \\ \\in (- \\infty, −1) ∪ (1, 2)$ e $f' (x) < 0$ para todo $x \\in (−1, 1) \\cup (2, + \\infty)$. Podemos afirmar que");
		questaoAlternativa7.setArea(EArea.MATEMATICA);
		questaoAlternativa7.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa7.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa7.setAlternativaCorreta("d");

		questaoAlternativa7.setAlternativasA("$\\lim_{x \\rightarrow  + \\infty} f(x)= x \\rightarrow +\\infty$");
		questaoAlternativa7.setAlternativasB("$\\lim_{x \\rightarrow  - \\infty} f(x)= x \\rightarrow +\\infty$");
		questaoAlternativa7.setAlternativasC("$x = 2$ é ponto de máximo global de $f$.");
		questaoAlternativa7.setAlternativasD("$x = −1$ é ponto de máximo global de $f$.");
		questaoAlternativa7.setAlternativasE("$f$não tem ponto de máximo global");
		questaoAlternativa7.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa8 = new QuestaoAlternativa();
		questaoAlternativa8.setId(INICIOQUESTAO.longValue());
		questaoAlternativa8.setAno(ANO);
		questaoAlternativa8.setDescricao("É correto afirmar que a equação $x^7 + x^5 + x^3 + 1 = 0$ tem");
		questaoAlternativa8.setArea(EArea.MATEMATICA);
		questaoAlternativa8.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa8.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa8.setAlternativaCorreta("d");

		questaoAlternativa8.setAlternativasA("7 raíızes reais");
		questaoAlternativa8.setAlternativasB("5 raízes reais.");
		questaoAlternativa8.setAlternativasC("3 raízes reais.");
		questaoAlternativa8.setAlternativasD("exatamente uma raiz real.");
		questaoAlternativa8.setAlternativasE("somente raízes complexas imaginárias.");
		questaoAlternativa8.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa9 = new QuestaoAlternativa();
		questaoAlternativa9.setId(INICIOQUESTAO.longValue());
		questaoAlternativa9.setAno(ANO);
		questaoAlternativa9.setDescricao("A equação da esfera que tem centro $C = (−2, 3, 5)$ e é tangente ao plano $xy$ é");
		questaoAlternativa9.setArea(EArea.MATEMATICA);
		questaoAlternativa9.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa9.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
		questaoAlternativa9.setAlternativaCorreta("a");
		questaoAlternativa9.setAlternativasA("$x^2 + y^2 + z^2 + 4x − 6y − 10z + 13 = 0$");
		questaoAlternativa9.setAlternativasB("$x^2 + y^2 + z^2 + 4x − 10z + 13 = 0$");
		questaoAlternativa9.setAlternativasC("$x^2 + y^2 + z^2 − 4x + 6y − 10z − 13 = 0$");
		questaoAlternativa9.setAlternativasD("$x^2 + y^2 + z^2 − 4x − 6y + 10z − 13 = 0$");
		questaoAlternativa9.setAlternativasE("$x^2 + y^2 + z^2 − 4x − 6y − 10z + 25 = 0$");
		questaoAlternativa9.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa10 = new QuestaoAlternativa();
		questaoAlternativa10.setId(INICIOQUESTAO.longValue());
		questaoAlternativa10.setAno(ANO);
		questaoAlternativa10.setDescricao("A sequência de Fibonacci (Fn) é definida recursivamente por $\\newline$ $\\left\\{\\begin{matrix} F_1 & = 1 \\ F_1 & = 2 \\ F_{n+1} & = f_{n} \\ + \\ f_{n-1} \\ para \\ n \\geq 2 \\end{matrix}\\right.$ \\ \\ Se $\\ lim_{n \\rightarrow + \\infty} \\frac{F_n+1}{F_n}  = L$ , podemos afirmar que");
		questaoAlternativa10.setArea(EArea.MATEMATICA);
		questaoAlternativa10.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa10.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa10.setAlternativaCorreta("c");

		questaoAlternativa10.setAlternativasA(
				"$L = 1$");
		questaoAlternativa10.setAlternativasB(
				"$L = \\frac{1 + \\sqrt{2}}{2}$");
		questaoAlternativa10.setAlternativasC(
				"$L = \\frac{1 + \\sqrt{5}}{2}$");
		questaoAlternativa10.setAlternativasD(
				"$L = \\frac{\\sqrt{5} - 1}{2}$");
		questaoAlternativa10.setAlternativasE("$L = 1+ \\sqrt{5}$");
		questaoAlternativa10.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa11 = new QuestaoAlternativa();
		questaoAlternativa11.setId(INICIOQUESTAO.longValue());
		questaoAlternativa11.setAno(ANO);
		questaoAlternativa11.setDescricao("É correto afirmar que :");
		questaoAlternativa11.setArea(EArea.MATEMATICA);
		questaoAlternativa11.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa11.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa11.setAlternativaCorreta("e");

		questaoAlternativa11.setAlternativasA("Se $\\int_{1}^{3} f(x)dx < 0$, então $f(x) \\leq$ 0 para todo $x\\in \\left[1,3\\right]");
		questaoAlternativa11.setAlternativasB("Se $\\int_{0}^{1} f(x)dx = 0$, então $f(x) = 0  para todo $x\\in \\left[0,1\\right]$");
		questaoAlternativa11.setAlternativasC("Se $\\int_{0}^{1} f(x)dx \\leq \\int_{0}^{1} g(x)dx$, então $f(x)\\leq g(x)$ para todo $x \\in \\left[0,1\\right]$");
		questaoAlternativa11.setAlternativasD("Se $\\int_{0}^{1} f(x)dx = 0$. então $\\int_{0}^{1} \\mid f(x) \\mid dx = 0$");
		questaoAlternativa11.setAlternativasE("Se $\\int_{0}^{2} \\cos x \\ dx = \\int_{-2}^{0} \\cos x \\ dx$");
		questaoAlternativa11.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa12 = new QuestaoAlternativa();
		questaoAlternativa12.setId(INICIOQUESTAO.longValue());
		questaoAlternativa12.setAno(ANO);
		questaoAlternativa12.setDescricao("A área da região, no primeiro quadrante, delimitada pelas curvas $y = \\frac{2}{x}$, $y = \\frac{x}{2} e y = x$ é igual a");
		questaoAlternativa12.setArea(EArea.MATEMATICA);
		questaoAlternativa12.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa12.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
		questaoAlternativa12.setAlternativaCorreta("b");

		questaoAlternativa12.setAlternativasA("$2 \\ ln \\ 2$");
		questaoAlternativa12.setAlternativasB("$ln \\ 2$");
		questaoAlternativa12.setAlternativasC("$ln \\ \\sqrt{2}$");
		questaoAlternativa12.setAlternativasD("$2 \\ ln \\ \\sqrt{2}$");
		questaoAlternativa12.setAlternativasE("$2 \\ ln \\sqrt{2} − 1$");
		questaoAlternativa12.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa13 = new QuestaoAlternativa();
		questaoAlternativa13.setId(INICIOQUESTAO.longValue());
		questaoAlternativa13.setAno(ANO);
		questaoAlternativa13.setDescricao("Seja $f(x) = \\int_{}^{} ln \\ xdx$ e tal que $f(1) = 0$. E correto afirmar que");
		questaoAlternativa13.setArea(EArea.MATEMATICA);
		questaoAlternativa13.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa13.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa13.setAlternativaCorreta("d");
		questaoAlternativa13.setAlternativasA("$f(x) = \\frac{1}{x} - 1$");
		questaoAlternativa13.setAlternativasB("$f(x) = ln \\ x$");
		questaoAlternativa13.setAlternativasC("$F(x) = x ln x$");
		questaoAlternativa13.setAlternativasD("$F(x) = x ln x − x + 1$");
		questaoAlternativa13.setAlternativasE("$F(x) = x ln x − x − 1$");
		questaoAlternativa13.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa14 = new QuestaoAlternativa();
		questaoAlternativa14.setId(INICIOQUESTAO.longValue());
		questaoAlternativa14.setAno(ANO);
		questaoAlternativa14.setDescricao("O resto da divisão de $6^81 \\ − \\ 5^64$ por $7$ é igual a");
		questaoAlternativa14.setArea(EArea.MATEMATICA);
		questaoAlternativa14.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa14.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa14.setAlternativaCorreta("e");
		questaoAlternativa14.setAlternativasA("0");
		questaoAlternativa14.setAlternativasB("1");
		questaoAlternativa14.setAlternativasC("2");
		questaoAlternativa14.setAlternativasD("3");
		questaoAlternativa14.setAlternativasE("4");
		questaoAlternativa14.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa15 = new QuestaoAlternativa();
		questaoAlternativa15.setId(INICIOQUESTAO.longValue());
		questaoAlternativa15.setAno(ANO);
		questaoAlternativa15.setDescricao("Sejam $f : S \\rightarrow T$ uma função, $A, B \\subset S$ e $U, V \\subset T$. E correto afirmar que");
		questaoAlternativa15.setArea(EArea.MATEMATICA);
		questaoAlternativa15.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa15.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa15.setAlternativaCorreta("b");

		questaoAlternativa15.setAlternativasA("$f(A \\cap B) = f(A) \\cap f(B)$");
		questaoAlternativa15.setAlternativasB("$f^{−1} (U \\cap V ) = f^{−1}(U) \\cap f^{−1}(V )$");
		questaoAlternativa15.setAlternativasC("$f^{−1} ( f (A)) = A$");
		questaoAlternativa15.setAlternativasD("$f(A \\ B) = f(A) \\ f(B)$");
		questaoAlternativa15.setAlternativasE("$f (f^{−1} (U)) = U$");
		questaoAlternativa15.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa16 = new QuestaoAlternativa();
		questaoAlternativa16.setId(INICIOQUESTAO.longValue());
		questaoAlternativa16.setAno(ANO);
		questaoAlternativa16.setDescricao("Assinale a forma correta da negação da seguinte frase: ”Algumas pessoas gostam de matemática .");
		questaoAlternativa16.setArea(EArea.MATEMATICA);
		questaoAlternativa16.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa16.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa16.setAlternativaCorreta("b");

		questaoAlternativa16.setAlternativasA("Algumas pessoas não gostam de matemática.");
		questaoAlternativa16.setAlternativasB("Todas as pessoas não gostam de matemática.");
		questaoAlternativa16.setAlternativasC("Existe uma pessoa que gosta de matemática");
		questaoAlternativa16.setAlternativasD("Existe uma pessoa que não gosta de matemática.");
		questaoAlternativa16.setAlternativasE("Todas as pessoas gostam de matemática.");
		questaoAlternativa16.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa17 = new QuestaoAlternativa();
		questaoAlternativa17.setId(INICIOQUESTAO.longValue());
		questaoAlternativa17.setAno(ANO);
		questaoAlternativa17.setDescricao("Assinale o argumento válido, onde $S_1$ e $S_2$ indicam premissas e C a conclusão.");
		questaoAlternativa17.setArea(EArea.MATEMATICA);
		questaoAlternativa17.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa17.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa17.setAlternativaCorreta("c");

		questaoAlternativa17.setAlternativasA("$\\newline S_1$: Se a comida é boa, então o serviçoo é bom. $\\newline$ $S_2$: A comida não é boa.$\\newline$ $C$: O serviço n˜ao é bom.");
		questaoAlternativa17.setAlternativasB("$\\newline S_1$: Se a comida é boa, então o serviço é bom. $\\newline$ $S_2$: O serviço não é bom. $\\newline$ $C$: A comida é boa.");
		questaoAlternativa17.setAlternativasC("$\\newline S_1$: Se a comida é boa, então o serviço é bom. $\\newline$ $S_2$: O serviço não é bom. $\\newline$ $C$: A comida não é boa.");
		questaoAlternativa17.setAlternativasD("$\\newline S_1$: Se a comida é boa, então o serviço é bom. $\\newline$ $S_2$: A comida é boa. $\\newline$ $C$: O serviço não é bom.");
		questaoAlternativa17.setAlternativasE("$\\newline S_1$: Se a comida é boa, então o serviçao é bom. $\\newline$ $S_2$: A comida não é boa. $\\newline$ $C$: O serviço é bom.");
		questaoAlternativa17.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa18 = new QuestaoAlternativa();
		questaoAlternativa18.setId(INICIOQUESTAO.longValue());
		questaoAlternativa18.setAno(ANO);
		questaoAlternativa18.setDescricao("O sistema $\newline$ $\\left\\{\\begin{matrix} x  \\ + \\ 2y \\ \\ - & z & = 4 \\ 3x \\ - \\ y \\ \\ + & 5z & = 2 \\ 4x \\ + \\ y \\ \\ + & (a^2 - 14)z  & = a + 2 \\end{matrix}\\right.$ \\ tem uma única solução $(x, y, z)$. Então");
		questaoAlternativa18.setArea(EArea.MATEMATICA);
		questaoAlternativa18.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa18.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
		questaoAlternativa18.setAlternativaCorreta("c");
		questaoAlternativa18.setAlternativasA("$a = −4$");
		questaoAlternativa18.setAlternativasB("$a = 4$");
		questaoAlternativa18.setAlternativasC("$a \\neq 4$ e $a \\neq −4$");
		questaoAlternativa18.setAlternativasD("$a = 4$ ou $a = −4$");
		questaoAlternativa18.setAlternativasE("$a = −1$");
		questaoAlternativa18.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa19 = new QuestaoAlternativa();
		questaoAlternativa19.setId(INICIOQUESTAO.longValue());
		questaoAlternativa19.setAno(ANO);
		questaoAlternativa19.setDescricao("Seja A uma matriz quadrada tal que $A ^ 2 − A + I = 0$, onde I é a matriz identidade. E correto afirmar que");
		questaoAlternativa19.setArea(EArea.MATEMATICA);
		questaoAlternativa19.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa19.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
		questaoAlternativa19.setAlternativaCorreta("d");

		questaoAlternativa19.setAlternativasA("a matriz inversa de $A$ é $I$.");
		questaoAlternativa19.setAlternativasB("a matriz inversa de $A$ é $A − I$.");
		questaoAlternativa19.setAlternativasC("a matriz inversa de $A$ é $A − A2$.");
		questaoAlternativa19.setAlternativasD("a matriz inversa de $A$ é $I − A$.");
		questaoAlternativa19.setAlternativasE("a matriz $A$ não possui matriz inversa");
		questaoAlternativa19.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa20 = new QuestaoAlternativa();
		questaoAlternativa20.setId(INICIOQUESTAO.longValue());
		questaoAlternativa20.setAno(ANO);
		questaoAlternativa20.setDescricao("A área do triângulo $ABC$ de vértices $A = (2, 2, 0), B = (−1, 0, 2) e C = (0, 4, 3)$ é igual a");
		questaoAlternativa20.setArea(EArea.MATEMATICA);
		questaoAlternativa20.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa20.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
		questaoAlternativa20.setAlternativaCorreta("e");

		questaoAlternativa20.setAlternativasA("15");
		questaoAlternativa20.setAlternativasB("$2/15$");
		questaoAlternativa20.setAlternativasC("$1/15$");
		questaoAlternativa20.setAlternativasD("30");
		questaoAlternativa20.setAlternativasE("$15/2$");
		questaoAlternativa20.setNumeroQuestao(NUMEROQUESTAO);
		

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa21 = new QuestaoAlternativa();
		questaoAlternativa21.setId(INICIOQUESTAO.longValue());
		questaoAlternativa21.setAno(ANO);
		questaoAlternativa21.setDescricao("O contador da Figura abaixo é:");
		questaoAlternativa21.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa21.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa21.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
		questaoAlternativa21.setAlternativaCorreta("b");
		questaoAlternativa21.setImagem(true);
		questaoAlternativa21.setImagemQuestao("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");
		questaoAlternativa21.setAlternativasA("Sincrono");
		questaoAlternativa21.setAlternativasB("Assincrono");
		questaoAlternativa21.setAlternativasC("Isócrono");
		questaoAlternativa21.setAlternativasD("Anisócrono");
		questaoAlternativa21.setAlternativasE("Auto-sincronizado");
		questaoAlternativa21.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa22 = new QuestaoAlternativa();
		questaoAlternativa22.setId(INICIOQUESTAO.longValue());
		questaoAlternativa22.setAno(ANO);
		questaoAlternativa22.setDescricao("Qual é a função do circuito da figura abaixo");
		questaoAlternativa22.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa22.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa22.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
		questaoAlternativa22.setAlternativaCorreta("d");
		questaoAlternativa22.setImagem(true);
		questaoAlternativa22.setImagemQuestao("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");
		questaoAlternativa22.setAlternativasA("Multiplexador");
		questaoAlternativa22.setAlternativasB("Multiplicador");
		questaoAlternativa22.setAlternativasC("Deslocador");
		questaoAlternativa22.setAlternativasD("Somador");
		questaoAlternativa22.setAlternativasE("Subtrator");
		questaoAlternativa22.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa23 = new QuestaoAlternativa();
		questaoAlternativa23.setId(INICIOQUESTAO.longValue());
		questaoAlternativa23.setAno(ANO);
		questaoAlternativa23.setDescricao("Para que serve a segmentação de um processador (pipelining)");
		questaoAlternativa23.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa23.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa23.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
		questaoAlternativa23.setAlternativaCorreta("a");
		questaoAlternativa23.setAlternativasA("Permitir a execução de mais de urna instrução por ciclo de relógio");
		questaoAlternativa23.setAlternativasB("Aumentar a velocidade do relógio");
		questaoAlternativa23.setAlternativasC("Simplificar o conjunto de instruções");
		questaoAlternativa23.setAlternativasD("Reduzir o número de instruções estáticas nos programas");
		questaoAlternativa23.setAlternativasE("Simplificar a implementação do processador");
		questaoAlternativa23.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa24 = new QuestaoAlternativa();
		questaoAlternativa24.setId(INICIOQUESTAO.longValue());
		questaoAlternativa24.setAno(ANO);
		questaoAlternativa24.setDescricao("A interposição de um circuito de memória cache entre o processador e a memória principal (RAM)");
		questaoAlternativa24.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa24.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa24.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
		questaoAlternativa24.setAlternativaCorreta("c");
		questaoAlternativa24.setAlternativasA("Aumentar o tráfego de instruções e/ou dados no barramento de memória");
		questaoAlternativa24.setAlternativasB("Aumenta o tráfego de instruções e/ou dados entre memória e disco");
		questaoAlternativa24.setAlternativasC("Diminuir o tráfego de instruções e/ou dados no barramento de memória");
		questaoAlternativa24.setAlternativasD("Diminui o tráfego de instruções e/ou dados entre memória e disco");
		questaoAlternativa24.setAlternativasE("Permite acessos concorrentes à memória RAM");
		questaoAlternativa24.setNumeroQuestao(NUMEROQUESTAO);
		
		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa25 = new QuestaoAlternativa();
		questaoAlternativa25.setId(INICIOQUESTAO.longValue());
		questaoAlternativa25.setAno(ANO);
		questaoAlternativa25.setDescricao("São vantagens da utilização de threads no espaço do usuário, exceto:");
		questaoAlternativa25.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa25.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa25.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
		questaoAlternativa25.setAlternativaCorreta("b");
		questaoAlternativa25.setAlternativasA("Nenhuma modificação é necessária no kernel.");
		questaoAlternativa25.setAlternativasB("0 sistema operacional escalona a thread.");
		questaoAlternativa25.setAlternativasC("0 escalonamento pode ser especifico para a aplicação.");
		questaoAlternativa25.setAlternativasD("A criação e o gerenciamento das threads são mais eficientes.");
		questaoAlternativa25.setAlternativasE("Maior portabilidade da aplicação.");
		questaoAlternativa25.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa26 = new QuestaoAlternativa();
		questaoAlternativa26.setId(INICIOQUESTAO.longValue());
		questaoAlternativa26.setAno(ANO);
		questaoAlternativa26.setDescricao("Considere o seguinte código para implementar exclusão mutuá entre dois processos i e j. Em relação ao código abaixo, todas as afirmativas estão corretas, exceto: ");
		questaoAlternativa26.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa26.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa26.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
		questaoAlternativa26.setImagem(true);
		questaoAlternativa26.setImagemQuestao("iVBORw0KGgoAAAANSUhEUgAAAxIAAAD8CAIAAABsAAXzAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAEJASURBVHhe7d15fE13/j9wWWRfSERCLNEESSxRBBEJiUQtKaNaydgSuxYz89Vvbf3aa9dh2rFUKVW+qCpKq4avsZV2aKv6oGamtcYWafOYUEEi9/fq+Xxyf9e9ufd+bpYridfzD4/z/nw+Oedzzz33nNddVdMRERERkQLGJiIiIiIljE1EREREShibiIiIiJQwNhEREREpYWwiIiIiUsLYRERERKSEsYmIiIhICWMTERERkRLV2BQUFFTNREhIyPTp0+/duycHke1KsGOnTJni7u6+Y8cOWRMREZFdqMam9PT0Fi1a4IoeFhbWXdOlSxdcvNESExPD5FRiJdixcXFxDg4Or7/+uqyJiIjILmx4k279+vW4ls+cOVPWOt21a9datWqFxhkzZsgmsp2tO/bixYurVq3Kzc2VNREREdlFqWITXL58GY2NGzeWNdmOO5aIiKhSKG1sgoYNG6JdLMfExDQqMm3atPv37y9YsCA0NNTBwaFWrVrvvPOOGCYcPHiwe/fuHhosoJQdJo4dO9atWzfx1pWbm1tCQsKZM2dknwZlampqjRo1MCA8PHzGjBl5eXmyr0hhYeG7777brl07rAfzqVmzZv/+/QMDA7dv3y5HaBSHgfr8LVPZsbBv3745Br7++mvZQURERHZR2tiUm5vr4uKCVCHKNm3aBAcHo0Tg6Ny5M8IHFry9vdu2bYuF6tWri2Gwbt06Z2dnJycnJC3AAko0ym4DK1asQJejo2N0dHRycnLjxo0xjZSUFNmt023ZsgUD0BgZGYlEJcJTfHx8fn6+HKGZNWsW5uDl5RUbG4sQFhYWhhJWr14tR2gUh6nP3yqVHQu47WImwssvvyw7iIiIyC5KFZsKCgrS0tLQOHr0aNmkOX/+vLi0I+vMmTNHvPAzefLkhQsXigGnT592dXVFJjh58qRowQJKNKJLtAhnz55Fo7+//4kTJ0TLDz/8gJFYrSixLTc3N09Pz23btokWBI64uDjMavny5aJF8PX1bdq0aU5Ojqx1uvHjx2OSRnlIZZj6/FUo7tgbN258qcFMMB/GJiIiIjuzOTZ16dIFF3hADIqMjERLnTp1MjMz5SCNPjZNmzZNNj1u0KBB6N2zZ4+sNSjRiC5ZazIyMrCJ3bt3y9rEkCFDMODtt9+WtQbZBY3x8fGy1iB7NWnSxHCqyDopKSn66COoDFOfvwr1HSscP34cG2JsIiIisjObY5MhR0fHbt26/fTTT3JEERGbfH1979y5I5seV7du3dq1axcWFspagxKN6JK1JiAgoFatWrIoDrIFZrJw4UIkJ0POzs6enp5ykGbNmjVOTk4uLi5RUVEIW/Pnzy/2lSGVYerzV6G+YwXGJiIioifC5tg0YsSIE0WuXbsm+x4nYlNCQoKsTaC3efPmsjCARnTJQoMtduzYURbF0WJG8dzd3eWgIggcaWlpDRo0QDDChpBOevfunZWVJbuLWB2mPn8V6jtWYGwiIiJ6Ikr7kfBiidjUp08fWZvw9/f39fV9+PChrDUo0YguWWv8/PyCgoIKCgpkbUK82nT48OEzJi5fviwHaY4cOfLtt9+K5ezs7KNHj44ZMwbBCAlJNAoqw9Tnr0J9xwqMTURERE/Ek4lNqampGLBhwwZZa1CiEV2y1ohPRm/cuFHWmr17965du1Ysjxw5EgMmTZokSr2dO3carR/Rp2HDho8ePZK1JiEhwdXVVRYalWHq81fB2ERERFQpPJnYdOrUKWdn59q1a58o+n4cFlCiEV2iRRAj3d3dN23aJF5zunXrVo0aNfQfIbp8+bKvr6+jo+PkyZP1P5x9+vRp/AnaRSlgSjB79mz9a1c//vgj1mP0aSSVYerzV8HYREREVCmoxibD/zqtX79+v/76q+x4HLpiY2Nbt26N67qfnx+WITEx8cqVK3JEkWXLliFkOD3+u0dolN0Gli9fjrVh08glycnJWC1C0tatW2W3Tnfo0CEkJAzw8vLqqHF1dUWpf0VK+C0NaUJCQrp169amTRtsEeXKlSvlCI0YA5aHqc/fMsUdCxMmTOilwQ3EfBo2bChKtMsRREREVJ5UY5Phf9SPdJKdnS07HlenTh0tcjwGIea7776TIwwcPHiwS5cu4le2sWDhV7YRjJC93N3dkU7at2+/a9cu2VEEsWzs2LEIOmJ6KSkppmurVavW4sWLR40ahQXMytvbOz4+/qOPPpLdRRSHgfr8LVDcsdC0aVNtdxpDuxxBRERE5cmGN+mIiIiInmaMTURERERKGJuIiIiIlDA2ERERESlhbCIiIiJSwthEREREpISxiYiIiEgJYxMRERGREsYmIiIiIiWMTURERERKGJuIiIiIlDA2ERERESlhbCIiIiJSwthEREREpISxiYiIiEgJYxMRERGREsYmIiIiIiWMTURERERKGJuIiIiIlDA2ERERESlhbCIiIiJSwthEREREpISxiYiIiEgJYxMRERGREsYmIiIiIiWMTURERERKGJuIiIiIlDA2ERERESlhbCIiIiJSwthEREREpISxiYiIiEgJYxMRERGREsYmIiIiIiWMTURERERKGJuIiIiIlDA2ERERESlhbCIiIiJSwthEREREpISxiYiIiEgJYxMRERGREsYmIiIiIiWMTURERERKGJuIiIiIlDA2ERERESlhbCIiIiJSwthEREREpKTSxKYVK1Y4ODg4Ojp6eXndvn1bthIRERHZS6WJTQcOHOjVq1f9+vWRnC5duiRbiYiIiOylkr1Jl5GRwdhERERETwRjExEREZGSih6bvvnmm5EjRyYnJ48YMeKrr74yF5sOHjzYvXt3Dw0WUMoOIiIiojJSoWPT+++/X716deQkZ2dnJycnBweHwMBA09i0bt06MSBGgwWUaJTdRERERGWh4samM2fOuLq6ent7IwDdvXs3Ozt7zJgxyExGsen06dMYhjh18uRJ0YIFlGhEl2ghIiIiKr2KG5sGDx6MhLR582ZZ63SFhYUdOnQwik2DBg1ycHDYs2ePrDUo0YguWRMRERGVWsWNTbVr1w4ICEBUkrXG9LNNdevWxUijYSjRiC5ZExEREZVaxY1NiEedO3eWRRHT2OTg4NC8eXNZGEAjumRBREREVGoVNzZ5e3uHhYXJokh6erpRbPL39/f19X348KGsNSjRiC5ZExEREZVaxY1NSUlJSEjfffedrLUw1KhRI6PYlJqa6uDgsGHDBllrUKIRXbImIiIiKrWKG5u2b9+OhNS6desbN26gLCgoGDduHFqMYtOpU6ecnZ1r16594sQJ0YIFlGhEl2ghIiIiKr2KG5ugf//+CEm+vr7JycmhoaEODg4BAQFoadq0aWJiohyk0y1btsz0d5vQKLuJiIiIykKFjk0PHz5ctGhR3bp1EZjatGmzbdu2hQsXhmjatWsnB2kOHjzYpUsX8SvhWOCvhBMREVGZq9CxiYiIiKjiYGwiIiIiUsLYRERERKSEsYmIiIhICWMT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");
		questaoAlternativa26.setAlternativaCorreta("b");
		questaoAlternativa26.setAlternativasA("A implementação garante exclusão mutuá.");
		questaoAlternativa26.setAlternativasB("A implementação garante progresso.");
		questaoAlternativa26.setAlternativasC("Os processos fazem espera ativa.");
		questaoAlternativa26.setAlternativasD("Exige alternância estrita.");
		questaoAlternativa26.setAlternativasE("Um processo bloqueia o outro mesmo não estando na seção critica.");
		questaoAlternativa26.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa27 = new QuestaoAlternativa();
		questaoAlternativa27.setId(INICIOQUESTAO.longValue());
		questaoAlternativa27.setAno(ANO);
		questaoAlternativa27.setDescricao("Uma gramática G é definida por: $\\newline$ $G=\\left(\\left\\{x,y,z\\right\\}, \\left\\{S,14/,X,Y,Z\\right\\}, P, S\\right)$ $\\newline$ na qual os membros de P são: $\\newline$ $S \\rightarrow WZ$" + 
				"$ W \\rightarrow X | Y $\\newline$" + 
				"X \\rightarrow x \\mid x | X $\\newline$" + 
				"Y \\rightarrow y \\mid y | Y $\\newline$" + 
				"Z \\rightarrow z \\mid z | Z $\\newline$" + 
				"Qual das expressões regulares abaixo corresponde a esta gramática");
		questaoAlternativa27.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa27.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa27.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa27.setAlternativaCorreta("a");
		questaoAlternativa27.setAlternativasA("$(xx* yy*) zz$*");
		questaoAlternativa27.setAlternativasB("$xx* \\mid yy* \\mid zz*$");
		questaoAlternativa27.setAlternativasC("$xx* (yy* \\mid zz*)$");
		questaoAlternativa27.setAlternativasD("$(xx I yy)* zz*$");
		questaoAlternativa27.setAlternativasE("$xx* yy* zz*$");
		questaoAlternativa27.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa28 = new QuestaoAlternativa();
		questaoAlternativa28.setId(INICIOQUESTAO.longValue());
		questaoAlternativa28.setAno(ANO);
		questaoAlternativa28.setDescricao("Conforme o seguinte trecho de programa da imagem abaixo." + 
				"Considere que: $\\newline$" + 
				"– I representa a inicialização da variável i:= 1 na linha 1;$\\newline$" + 
				"– T representa o teste da linha 2; $\\newline$" + 
				"– A representa os comandos da linha 3; $\\newline$" + 
				"– P representa o incremento na linha 4. $\\newline$" + 
				"Qual é a expressão regular que representa todas as sequências de passos possíveis de serem executados por este treche de programa?");
		questaoAlternativa28.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa28.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa28.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa28.setImagem(true);
		questaoAlternativa28.setImagemQuestao("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");
		questaoAlternativa28.setAlternativaCorreta("d");
		questaoAlternativa28.setAlternativasA("$I(TAP)^+$");
		questaoAlternativa28.setAlternativasB("$I(TAP)^*$");
		questaoAlternativa28.setAlternativasC("$IT+ A^*P^*$");
		questaoAlternativa28.setAlternativasD("$IT(APT)^*$");
		questaoAlternativa28.setAlternativasE("$IT(APT)^+$");
		questaoAlternativa28.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa29 = new QuestaoAlternativa();
		questaoAlternativa29.setId(INICIOQUESTAO.longValue());
		questaoAlternativa29.setAno(ANO);
		questaoAlternativa29.setDescricao("Um compilador detecta:");
		questaoAlternativa29.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa29.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa29.setDisciplina(EDisciplina.COMPILADORES);
		questaoAlternativa29.setAlternativaCorreta("c");
		questaoAlternativa29.setAlternativasA("Erros que podem ocorrer durante a execução do programa");
		questaoAlternativa29.setAlternativasB("Erros nos resultados gerados pelo programa");
		questaoAlternativa29.setAlternativasC("Erros de sintaxe do programa");
		questaoAlternativa29.setAlternativasD("Erros aritméticos");
		questaoAlternativa29.setAlternativasE("Todos os erros citados acima");
		questaoAlternativa29.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa30 = new QuestaoAlternativa();
		questaoAlternativa30.setId(INICIOQUESTAO.longValue());
		questaoAlternativa30.setAno(ANO);
		questaoAlternativa30.setDescricao("Em uma lista circular duplamente encadeada com n elementos, o espaço ocupado apenas pelos apontadores é(assuma que um apontador ocupa p bytes):");
		questaoAlternativa30.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa30.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa30.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
		questaoAlternativa30.setAlternativaCorreta("b");
		questaoAlternativa30.setAlternativasA("$np$");
		questaoAlternativa30.setAlternativasB("$2np$");
		questaoAlternativa30.setAlternativasC("$4np$");
		questaoAlternativa30.setAlternativasD("$6np$");
		questaoAlternativa30.setAlternativasE("$(np)^2$");
		questaoAlternativa30.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa31 = new QuestaoAlternativa();
		questaoAlternativa31.setId(INICIOQUESTAO.longValue());
		questaoAlternativa31.setAno(ANO);
		questaoAlternativa31.setDescricao("Considere n chaves armazenadas" + 
				"$\\newline$(I)  De maneira arbitrária numa lista encadeada simples," + 
				"$\\newline$(II)  De maneira arbitrária numa lista encadeada dupla. $\\newline$" +
				"Considere também as mesmas chaves" + 
				"$\\newline$ (III) Armazenadas de maneira ordenada numa lista encadeada simples," + 
				"$\\newline$ (IV) Armazenadas de maneira ordenada numa lista encadeada dupla. $\\newline$" + 
				"Qual das alternativas preenche a seguinte tabela com a complexidade de busca no pior caso, em cada uma das situações I, II, III e IV descritas acima?");
		questaoAlternativa31.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa31.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa31.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
		questaoAlternativa31.setImagem(true);
		questaoAlternativa31.setImagemQuestao("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");
		questaoAlternativa31.setAlternativaCorreta("a");
		questaoAlternativa31.setAlternativasA("$\\begin{table}[]" + 
				"\\begin{tabular}{|l|l|}" + 
				"\\hline" + 
				"\\theta(n) & \\theta(n) \\ \\hline" + 
				"\\theta(n) & \\theta(n) \\ \\hline" + 
				"\\end{tabular}" + 
				"\\end{table}$");
		questaoAlternativa31.setAlternativasB("$\\begin{table}[]" + 
				"\\begin{tabular}{|l|l|}" + 
				"\\hline" + 
				"\\theta(n) & \\theta(n) \\ \\hline" + 
				"\\theta(2) & \\theta(2) \\ \\hline" + 
				"\\end{tabular}" + 
				"\\end{table}$");
		questaoAlternativa31.setAlternativasC("$\\begin{table}[]" + 
				"\\begin{tabular}{|l|l|}" + 
				"\\hline" + 
				"\\theta(n \\log{n}) & \\theta(n) \\ \\hline" + 
				"\\theta(n \\log{n}) & \\theta(n) \\ \\hline" + 
				"\\end{tabular}" + 
				"\\end{table}$");
		questaoAlternativa31.setAlternativasD("$\\begin{table}[]\r\n" + 
				"\\begin{tabular}{|l|l|}\r\n" + 
				"\\hline" + 
				"$\\theta(n)$ & $\\theta(n \\log{n})$ \\ \\hline" + 
				"$\\theta(n)$ & $\\theta(n \\log{n})$ \\ \\hline" + 
				"\\end{tabular}" + 
				"\\end{table}$");
		questaoAlternativa31.setAlternativasE("\\begin{table}[]" + 
				"\\begin{tabular}{|l|l|}" + 
				"\\hline" + 
				"$\\theta(n)$ & $\\theta(1)$ \\ \\hline" + 
				"$\\theta(n)$ & $\\theta(1)$ \\ \\hline" + 
				"\\end{tabular}" + 
				"\\end{table}");
		questaoAlternativa31.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		
		QuestaoAlternativa questaoAlternativa32 = new QuestaoAlternativa();
		questaoAlternativa32.setId(INICIOQUESTAO.longValue());
		questaoAlternativa32.setAno(ANO);
		questaoAlternativa32.setDescricao("Em um heap com n vértices existem:");
		questaoAlternativa32.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa32.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa32.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
		questaoAlternativa32.setAlternativaCorreta("d");
		questaoAlternativa32.setAlternativasA("Exatamente $\\lfloor n/5 \\rfloor$ folhas");
		questaoAlternativa32.setAlternativasB("Aproximadamente $\\log{n}$ folhas");
		questaoAlternativa32.setAlternativasC("Não mais que $\\lfloor n/5 \\rfloor$ folhas");
		questaoAlternativa32.setAlternativasD("Exatamente $\\lceil n/2 \\rceil$ folhas");
		questaoAlternativa32.setAlternativasE("Não menos que $2n/3$ folhas");
		questaoAlternativa32.setNumeroQuestao(NUMEROQUESTAO);

		
		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		
		QuestaoAlternativa questaoAlternativa33 = new QuestaoAlternativa();
		questaoAlternativa33.setId(INICIOQUESTAO.longValue());
		questaoAlternativa33.setAno(ANO);
		questaoAlternativa33.setDescricao("Considere as seguintes afirmativas: \r\n" + 
				"$\\newline$I. 0 modelo matemático de uma lista é a sequência linear de itens, cuja principal propriedade estrutural é a posição relativa dos elementos dentro da sequência." + 
				"$\\newline$ II. A fila e a pilha são consideradas casos especiais da lista." + 
				"$\\newline$ III. Numa fila a inserção e a retirada são feitas no mesmo extremo." + 
				"$\\newline$ IV. Numa lista a inserção e a retirada podem ser feitas em qualquer posição." + 
				"$\\newline$ V. Numa pilha apenas a inserção pode ser feita em qualquer posição.$\\newline$" + 
				"Quais são as afirmativas verdadeiras");
		questaoAlternativa33.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa33.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa33.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
		questaoAlternativa33.setAlternativaCorreta("c");
		questaoAlternativa33.setAlternativasA("Somente I e III");
		questaoAlternativa33.setAlternativasB("Somente II, III e IV");
		questaoAlternativa33.setAlternativasC("Somente I, II e IV");
		questaoAlternativa33.setAlternativasD("Somente II, IV e V");
		questaoAlternativa33.setAlternativasE("Todas");
		questaoAlternativa33.setNumeroQuestao(NUMEROQUESTAO);

		
		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		
		QuestaoAlternativa questaoAlternativa34 = new QuestaoAlternativa();
		questaoAlternativa34.setId(INICIOQUESTAO.longValue());
		questaoAlternativa34.setAno(ANO);
		questaoAlternativa34.setDescricao("A função abaixo, escrita na linguagem C, quando executada para n = 5, faz quantas chamadas recursivas (excluindo a primeira chamada da função)?");
		questaoAlternativa34.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa34.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa34.setDisciplina(EDisciplina.PROGRAMACAO);
		questaoAlternativa34.setAlternativaCorreta("c");
		questaoAlternativa34.setImagem(true);
		questaoAlternativa34.setImagemQuestao("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");
		questaoAlternativa34.setAlternativasA("6");
		questaoAlternativa34.setAlternativasB("5");
		questaoAlternativa34.setAlternativasC("4");
		questaoAlternativa34.setAlternativasD("1");
		questaoAlternativa34.setAlternativasE("0");
		questaoAlternativa34.setNumeroQuestao(NUMEROQUESTAO);
		
	
		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa35 = new QuestaoAlternativa();
		questaoAlternativa35.setId(INICIOQUESTAO.longValue());
		questaoAlternativa35.setAno(ANO);
		questaoAlternativa35.setDescricao("Qual é a opção que descreve a tarefa executada pelo seguinte algoritmo escrito em Pascal?");
		questaoAlternativa35.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa35.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa35.setDisciplina(EDisciplina.PROGRAMACAO);
		questaoAlternativa35.setAlternativaCorreta("c");
		questaoAlternativa35.setImagem(true);
		questaoAlternativa35.setImagemQuestao("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");
		questaoAlternativa35.setAlternativasA("Divide x por y utilizando a subtração e retorna o resultado em x");
		questaoAlternativa35.setAlternativasB("Divide y por x utilizando a subtração e retorna o resultado em x");
		questaoAlternativa35.setAlternativasC("Troca os valores de x e y");
		questaoAlternativa35.setAlternativasD("Calcula o mínimo múltiplo comum entre x e y e retorna o valor em x");
		questaoAlternativa35.setAlternativasE("Não altera os valores de x e y");
		questaoAlternativa35.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa36 = new QuestaoAlternativa();
		questaoAlternativa36.setId(INICIOQUESTAO.longValue());
		questaoAlternativa36.setAno(ANO);
		questaoAlternativa36.setDescricao("Para que faixa de valores da variável x o seguinte segmento de código im­prime a letra C?");
		questaoAlternativa36.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa36.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa36.setDisciplina(EDisciplina.PROGRAMACAO);
		questaoAlternativa36.setAlternativaCorreta("c");
		questaoAlternativa36.setImagem(true);
		questaoAlternativa36.setImagemQuestao("iVBORw0KGgoAAAANSUhEUgAAAWcAAACyCAIAAAARXpnyAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAB14SURBVHhe7Z15rBXFusV9CoIgk4oMok8UREVBnC6OiPDUAEFRJIjKIIhINIKI+BwxATQiigGMvIAaQEGjEo0xGEUlzpinJg4JzkZxCA5oAOWB3PfzFLdv0713d1XvPr2791n1x0l376+m9VWtU1VdXWu3fyoIASEgBFwQ2M3FWLZCQAgIgX+KNdQIhIAQcENArOGGl6yFgBAQa6gNCAEh4IaAWMMNL1kLASEg1lAbEAJCwA0BsYYbXrIWAkKgSKzxxRdfnHjiie3atZPbnBA48MADwQ30nGLJWAiUQ6AwrPHJJ5907Nixffv2a9asqQF3fv3115deemmLFi122223I4888t577926dWu4Xq+++uoJJ5yADX+5LlnxWBsMwA30wLAGoFMVqo5AQtb47bffOnfuPGDAgOgKvPnmmwMHDtx777332muvadOmJa7t77//3rVr19atW9dGu//000/322+/Pffc86yzzurTp0/Tpk3hhX79+v35559+iN56663mzZvvu+++Q4YM4S/XPAlgaGNDFHADPTAEycReUEQhYBBIyBrffvtto0aNDj744AgcX3jhhcaNG3fq1GnMmDH77LMP/1cTgz5lyhT61eOPP544BdeIGzduHDduHIV3jWhjf9FFF0EZb7zxhjHesGHD0KFDqeAdd9zhRf/rr7+6d+/O5OK7777jIX+55gnPnWw8Y9AjC5C0KaFshEAEAglZgxQ/+uij9evXRyR95plnNmvW7Pvvv8fm/fffX7t2bTJP0GFIh3/FyaIniMUk6JBDDtl9992vvfbaBNFjozBq6Natm99sy5YtzCC6dOniPXzmmWfo5MuXL/eecM0TnjvZ+HMBQ5A0NKQgBBIjkJw1YrM89thjDzjggFizWIO77747s4HGH3/8cd111+2xxx6MMl566aXYsiUzOOigg5gsBOJeeOGFVNN7eMkll7Rq1YryeE+45gnPnWz8uZjhBngmK7ZiCQGDgDNrTJ06lQV5E84999wwjueff/4/6gLLGYzDzTVh9erVyUBn8s9s6Ndffy0ZvVevXv/xrzB37twrr7zSux0xYoRTjgyIevTo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");
		questaoAlternativa36.setAlternativasA("$0 < x < 100$");
		questaoAlternativa36.setAlternativasB("$x <= 100$");
		questaoAlternativa36.setAlternativasC("$100 <= x <= 200$");
		questaoAlternativa36.setAlternativasD("$x > 200$");
		questaoAlternativa36.setAlternativasE("$100 < x <= 200$");
		questaoAlternativa36.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa37 = new QuestaoAlternativa();
		questaoAlternativa37.setId(INICIOQUESTAO.longValue());
		questaoAlternativa37.setAno(ANO);
		questaoAlternativa37.setDescricao("Qual é o número mínimo de comparações necessário para encontrar o menor elemento de um conjunto qualquer não ordenado de n elementos?");
		questaoAlternativa37.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa37.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa37.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
		questaoAlternativa37.setAlternativaCorreta("b");
		questaoAlternativa37.setAlternativasA("$1$");
		questaoAlternativa37.setAlternativasB("$n - 1$");
		questaoAlternativa37.setAlternativasC("$n$");
		questaoAlternativa37.setAlternativasD("$n + 1$");
		questaoAlternativa37.setAlternativasE("$n \\log{n}$");
		questaoAlternativa37.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa38 = new QuestaoAlternativa();
		questaoAlternativa38.setId(INICIOQUESTAO.longValue());
		questaoAlternativa38.setAno(ANO);
		questaoAlternativa38.setDescricao("Dentre os algoritmos de ordenação citados abaixo, qual é o que executa mais rápido para uma grande variedade de entrada de dados?");
		questaoAlternativa38.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa38.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa38.setDisciplina(EDisciplina.PROGRAMACAO);
		questaoAlternativa38.setAlternativaCorreta("d");
		questaoAlternativa38.setImagem(true);
		questaoAlternativa38.setImagemQuestao(
				"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");
		questaoAlternativa38.setAlternativasA("Bolha");
		questaoAlternativa38.setAlternativasB("Shellsort");
		questaoAlternativa38.setAlternativasC("Mergesort");
		questaoAlternativa38.setAlternativasD("Quicksort");
		questaoAlternativa38.setAlternativasE("Heapsort");
		questaoAlternativa38.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa39 = new QuestaoAlternativa();
		questaoAlternativa39.setId(INICIOQUESTAO.longValue());
		questaoAlternativa39.setAno(ANO);
		questaoAlternativa39.setDescricao("Quais das seguintes igualdades são verdadeiras" +
				"$\\newline$ I. $n^2 = 0 (n^3)$" + 
				"$\\newline$ II. $2*n + 1 = 0(n^2)$" + 
				"$\\newline$ III. $n^3 = 0(n^2)$" + 
				"$\\newline$ IV. 3 * n + 5 * n \\log{n} = 0(n)" + 
				"$\\newline$ V. \\log {n} + \\sqrt{n} = 0(n)");
		questaoAlternativa39.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa39.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa39.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa39.setAlternativaCorreta("d");
		questaoAlternativa39.setAlternativasA("somente I e II");
		questaoAlternativa39.setAlternativasB("somente II, III e IV.");
		questaoAlternativa39.setAlternativasC("somente III,IV e V.");
		questaoAlternativa39.setAlternativasD("somente I, II e V.");
		questaoAlternativa39.setAlternativasE("somente I, III e IV.");
		questaoAlternativa39.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa40 = new QuestaoAlternativa();
		questaoAlternativa40.setId(INICIOQUESTAO.longValue());
		questaoAlternativa40.setAno(ANO);
		questaoAlternativa40.setDescricao("Quais dos quatro grafos abaixo são Eulerianos");
		questaoAlternativa40.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa40.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa40.setDisciplina(EDisciplina.GRAFOS);
		questaoAlternativa40.setAlternativaCorreta("a");
		questaoAlternativa40.setImagem(true);
		questaoAlternativa40.setImagemQuestao("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");
		questaoAlternativa40.setAlternativasA("Somente I e II");
		questaoAlternativa40.setAlternativasB("Somente I");
		questaoAlternativa40.setAlternativasC("Somente II");
		questaoAlternativa40.setAlternativasD("Somente I, II e IV");
		questaoAlternativa40.setAlternativasE("Nenhum deles é Euleriano");
		questaoAlternativa40.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa41 = new QuestaoAlternativa();
		questaoAlternativa41.setId(INICIOQUESTAO.longValue());
		questaoAlternativa41.setAno(ANO);
		questaoAlternativa41.setDescricao("Considere as seguintes tabelas em uma base de dados relacional: Departamento (CodDepto, NomeDepto), Empregado (CodEmp, NomeEmp, CodDepto) $\\newline$" + 
						"Deseja-se obter uma tabela na qual cada linha é a concatenação de uma linha da tabela Departamento com uma linha da tabela de Empregado." + 
						"Caso um departamento não possua empregados, seu linha no resultado deve conter vazio (NULL) nos campos referentes ao empregado." + 
						"A operação de álgebra relacional que deve ser aplicada para combinar estas duas tabelas é:");
		questaoAlternativa41.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa41.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa41.setDisciplina(EDisciplina.BANCO_DE_DADOS);
		questaoAlternativa41.setAlternativaCorreta("c");
		questaoAlternativa41.setAlternativasA("Divisão");
		questaoAlternativa41.setAlternativasB("Junção interna");
		questaoAlternativa41.setAlternativasC("Junção externa");
		questaoAlternativa41.setAlternativasD("União");
		questaoAlternativa41.setAlternativasE("Projeção");
		questaoAlternativa41.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa42 = new QuestaoAlternativa();
		questaoAlternativa42.setId(INICIOQUESTAO.longValue());
		questaoAlternativa42.setAno(ANO);
		questaoAlternativa42.setDescricao("Considere as seguintes tabelas em uma base de dados relacional (chaves primárias sublinhadas): Departamento (CodDepto[pk], NomeDepto), Empregado (CodEmp[pk], NomeEmp, CodDepto) " + 
				"Considere as seguintes restrições de integridade sobre esta base de dados relacional: $\\newline$" + 
				"– Empregado.CodDepto é sempre diferente de NULL $\\newline$" + 
				"– Empregado.CodDepto é chave estrangeira da tabela Departamento com cláusulas ON DELETE RESTRICT e ON UPDATE RESTRICT $\\newline$" + 
				"Qual das seguintes validações não é especificada por estas restrições de integridade:");
		questaoAlternativa42.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa42.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa42.setDisciplina(EDisciplina.BANCO_DE_DADOS);
		questaoAlternativa42.setAlternativaCorreta("e");
		questaoAlternativa42.setAlternativasA("Sempre que uma nova linha for inserida em Empregado, deve ser garantido que o valor de Empregado.CodDepto aparece na coluna Departamento.CodDepto.");
		questaoAlternativa42.setAlternativasB("Sempre que uma linha for excluída de Departamento, deve ser garantido que o valor de Departamento.CodDepto não aparece na coluna Empregado.CodDepto.");
		questaoAlternativa42.setAlternativasC("Sempre que o valor de Empregado.CodDepto for alterado, deve ser garantido que o novo valor de Empregado.CodDepto aparece em Departamento.CodDepto.");
		questaoAlternativa42.setAlternativasD("Sempre que o valor de Departamento.CodDepto for alterado, deve ser garantido que não há uma linha com o antigo valor de Departamento.CodDepto na coluna Empregado.CodDepto");
		questaoAlternativa42.setAlternativasE("Sempre que uma nova linha for inserida em Departamento, deve ser garantido que o valor de Departamento.CodDepto aparece na coluna Empregado.CodDepto");
		questaoAlternativa42.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa43 = new QuestaoAlternativa();
		questaoAlternativa43.setId(INICIOQUESTAO.longValue());
		questaoAlternativa43.setAno(ANO);
		questaoAlternativa43.setDescricao("Considere a seguinte tabela em uma base de dados relacional (chave primária [pk]): Tabela1(CodAluno[pk], CodDisciplina[pk], AnoSemestre[pk], NomeAluno, NomeDisciplina, CodNota, DescricaoNota) $\\newline$" +
				"Considere as seguintes dependências funcionais:" + 
				"$\\newline$ CodAluno → NomeAluno" + 
				"$\\newline$ CodDisciplina → NomeDisciplina" + 
				"$\\newline$ (CodAluno,CodDisciplina,AnoSemestre) → CodNota" + 
				"$\\newline$ (CodAluno,CodDisciplina,AnoSemestre) → DescricaoNota" + 
				"$\\newline$ CodNota → DescricaoNota" + 
				"$\\newline$ Considerando as formas normais, qual das afirmativas abaixo se aplica:");
		questaoAlternativa43.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa43.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa43.setDisciplina(EDisciplina.BANCO_DE_DADOS);
		questaoAlternativa43.setAlternativaCorreta("a");
		questaoAlternativa43.setAlternativasA("A tabela encontra-se na primeira forma normal, mas não na segunda forma normal.");
		questaoAlternativa43.setAlternativasB("A tabela encontra-se na segunda forma normal, mas não na terceira forma normal.");
		questaoAlternativa43.setAlternativasC("A tabela encontra-se na terceira forma normal, mas não na quarta forma normal.");
		questaoAlternativa43.setAlternativasD("A tabela não está na primeira forma normal.");
		questaoAlternativa43.setAlternativasE("A tabela está na quarta forma normal.");
		questaoAlternativa43.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa44 = new QuestaoAlternativa();
		questaoAlternativa44.setId(INICIOQUESTAO.longValue());
		questaoAlternativa44.setAno(ANO);
		questaoAlternativa44.setDescricao("Considere as seguintes tabelas em uma base de dados relacional: Departamento (CodDepto, NomeDepto) Empregado (CodEmp, NomeEmp, CodDepto,Salario) Considere a seguinte consulta escrita em SQL:" + 
						"$\\newline$ SELECT D.CodDepto,NomeDepto,SUM(E.Salario) FROM Departamento D, Empregado E WHERE D.CodDepto=E.CodDepto GROUP BY D.CodDepto,NomeDepto HAVING COUNT(*)>2 AND AVG(E.Salario)>40 " + 
						"$\\newline$ A consulta acima obtém o seguinte resultado:");
		questaoAlternativa44.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa44.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa44.setDisciplina(EDisciplina.BANCO_DE_DADOS);
		questaoAlternativa44.setAlternativaCorreta("b");
		questaoAlternativa44.setAlternativasA("Para cada empregado que tem mais que dois departamentos, ambos com média salarial maior que 40, obter o código de departamento, seguido do nome do departamento, seguido da soma dos salários dos empregados do departamento.");
		questaoAlternativa44.setAlternativasB("Para cada departamento que tem mais que dois empregados e cuja média salarial é maior que 40,\r\n" + 
				"obter o código de departamento, seguido do nome do departamento, seguido da soma dos salários\r\n" + 
				"dos empregados do departamento.");
		questaoAlternativa44.setAlternativasC(" Para cada departamento que tem mais que dois empregados e cuja média salarial, considerando\r\n" + 
				"todos empregados do departamento, exceto os dois primeiros, é maior que 40, obter o código de\r\n" + 
				"departamento, seguido do nome do departamento, seguido da soma dos salários dos empregados do\r\n" + 
				"departamento.");
		questaoAlternativa44.setAlternativasD("A consulta não retorna nada pois está incorreta.");
		questaoAlternativa44.setAlternativasE("Para cada departamento que tem mais que dois empregados e cuja média salarial é maior que 40\r\n" + 
				"obter um grupo de linhas que contém, para cada empregado do departamento, o código de seu\r\n" + 
				"departamento, seguido do nome de seu departamento, seguido da soma dos salários dos empregados\r\n" + 
				"do departamento.");
		questaoAlternativa44.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa45 = new QuestaoAlternativa();
		questaoAlternativa45.setId(INICIOQUESTAO.longValue());
		questaoAlternativa45.setAno(ANO);
		questaoAlternativa45.setDescricao("Considere a seguinte tabela para uma base de dados relacional: Empregado (CodEmp, NomeEmp, CodDepto) \r\n" + 
				"Considere que esta tabela tem um índice na forma de uma árvore B sobre as colunas (CodEmp,CodDepto),\r\n" + 
				"nesta ordem. Quanto a este índice, considere as seguintes afirmativas: " + 
				"$\\newline$ 1) Este índice pode ser usado pelo SGBD relacional para acelerar uma consulta na qual são fornecidos\r\n" + 
				"os valores de CodEmp e CodDepto.\r\n" + 
				"$\\newline$ 2) Este índice pode ser usado pelo SGBD relacional para acelerar uma consulta na qual é fornecido um\r\n" + 
				"valor de CodEmp." + 
				"$\\newline$ 3) Este índice não é adequado para ser usado pelo SGBD relacional para acelerar uma consulta na qual\r\n" + 
				"é fornecido um valor de CodDepto." + 
				"$\\newline$ 4) O algoritmo que faz inserções e remoções de entradas do índice tem por objetivo garantir que o índice\r\n" + 
				"fique organizado de tal forma que o acesso a cada nodo da árvore implique em número de acessos\r\n" + 
				"semelhantes.");
		questaoAlternativa45.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa45.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa45.setDisciplina(EDisciplina.BANCO_DE_DADOS);
		questaoAlternativa45.setAlternativaCorreta("b");
		questaoAlternativa45.setAlternativasA("Nenhuma das afirmativas está correta");
		questaoAlternativa45.setAlternativasB("Apenas as afirmativas 1), 2), 3) e 4) estão corretas");
		questaoAlternativa45.setAlternativasC("Todas afirmativas estão corretas");
		questaoAlternativa45.setAlternativasD("Apenas as afirmativas 1), 2) e 4) estão corretas");
		questaoAlternativa45.setAlternativasE("Apenas as afirmativas 1), 2) e 5) estão corretas");
		questaoAlternativa45.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa46 = new QuestaoAlternativa();
		questaoAlternativa46.setId(INICIOQUESTAO.longValue());
		questaoAlternativa46.setAno(ANO);
		questaoAlternativa46.setDescricao("Considere as seguintes afirmações sobre autômatos finitos e expressões regulares:" + 
				"$\\newline$ I. A classe de linguagens aceita por um Autômato Finito Determinístico (AFD) não é a mesma que um Autômato Finito Não Determinístico (AFND)." + 
				"$\\newline$ II. Para algumas expressões regulares não é possível construir um AFD." + 
				"$\\newline$ III. A expressão regular (b + ba)+ aceita os \"strings\"de b’s e a’s começando com b e não tendo dois a’sconsecutivos." + 
				"$\\newline$ Selecione a afirmativa correta:");
		questaoAlternativa46.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa46.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa46.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa46.setAlternativaCorreta("c");
		questaoAlternativa46.setAlternativasA("As afirmativas I e II são verdadeiras");
		questaoAlternativa46.setAlternativasB("As afirmativas I e III são falsas");
		questaoAlternativa46.setAlternativasC("Apenas a afirmativa III é verdadeira");
		questaoAlternativa46.setAlternativasD("As afirmativas II e III são falsas");
		questaoAlternativa46.setAlternativasE("As afirmativas I e III são verdadeiras");
		questaoAlternativa46.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa47 = new QuestaoAlternativa();
		questaoAlternativa47.setId(INICIOQUESTAO.longValue());
		questaoAlternativa47.setAno(ANO);
		questaoAlternativa47.setDescricao("Considere as seguintes afirmativas sobre as linguagens usadas para análise sintática:" + 
				"$\\newline$ I. A classe LL(1) não aceita linguagens com produções que apresentem recursões diretas a esquerda (ex. L→La) mas aceita linguagens com recursões indiretas (ex. L→Ra , R→Lb)" + 
				"$\\newline$II. A linguagem LR(1) reconhece a mesma classe de linguagens que LALR(1)" + 
				"$\\newline$III. A linguagem SLR(1) reconhece uma classe de linguagens maior que LR(0)" + 
				"$\\newline$Selecione a afirmativa correta:");
		questaoAlternativa47.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa47.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa47.setDisciplina(EDisciplina.COMPILADORES);
		questaoAlternativa47.setAlternativaCorreta("c");
		questaoAlternativa47.setAlternativasA("As afirmativas I e II são verdadeiras");
		questaoAlternativa47.setAlternativasB("As afirmativas I e III são verdadeiras");
		questaoAlternativa47.setAlternativasC("Apenas a afirmativa III é verdadeira");
		questaoAlternativa47.setAlternativasD("As afirmativas II e III são verdadeiras");
		questaoAlternativa47.setAlternativasE("As afirmativas I e III são falsas");
		questaoAlternativa47.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa48 = new QuestaoAlternativa();
		questaoAlternativa48.setId(INICIOQUESTAO.longValue());
		questaoAlternativa48.setAno(ANO);
		questaoAlternativa48.setDescricao(
				"Seja a seguinte linguagem, onde $\\epsilon$ representa o string vazio e $\\$$ representa um marcador de fim de entrada:" + 
				"$\\newline$ S $\\rightarrow$ ABCD\r\n" + 
				"$\\newline$ A $\\rightarrow$ a | $\\epsilon$" + 
				"$\\newline$ B $\\rightarrow$ a | $\\epsilon$" + 
				"$\\newline$ C $\\rightarrow$ c | $\\epsilon$" + 
				"$\\newline$ D $\\rightarrow$ S|c| $\\epsilon$" +
				"$\\newline$ É incorreto afirmar que: ");
		questaoAlternativa48.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa48.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa48.setDisciplina(EDisciplina.COMPILADORES);
		questaoAlternativa48.setAlternativaCorreta("d");
		questaoAlternativa48.setAlternativasA("O conjunto FIRST(A) = a, $\\epsilon$");
		questaoAlternativa48.setAlternativasB("O conjunto FIRST(D) é igual ao conjunto FIRST(S)");
		questaoAlternativa48.setAlternativasC("O conjunto FOLLOW(A) = a, c, $\\$$");
		questaoAlternativa48.setAlternativasD("O conjunto FOLLOW(B) = c, $\\$$");
		questaoAlternativa48.setAlternativasE("O conjunto FOLLOW(D) é igual a FOLLOW(S)");
		questaoAlternativa48.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa49 = new QuestaoAlternativa();
		questaoAlternativa49.setId(INICIOQUESTAO.longValue());
		questaoAlternativa49.setAno(ANO);
		questaoAlternativa49.setDescricao("Sobre a técnica conhecida como $Z-buffer$ é correto afirmar que:");
		questaoAlternativa49.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa49.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa49.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
		questaoAlternativa49.setAlternativaCorreta("a");
		questaoAlternativa49.setAlternativasA("É possível realizar o cômputo das variáveis envolvidas de forma incremental.");
		questaoAlternativa49.setAlternativasB("As primitivas geométricas precisam estar ordenadas de acordo com a distância em relação ao observador.");
		questaoAlternativa49.setAlternativasC("É uma técnica muito comum de detecção de colisão.");
		questaoAlternativa49.setAlternativasD("As dimensões do $Z-buffer$ são independentes das dimensões do frame buffer.");
		questaoAlternativa49.setAlternativasE("Nenhuma das alternativas acima está correta");
		questaoAlternativa49.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa50 = new QuestaoAlternativa();
		questaoAlternativa50.setId(INICIOQUESTAO.longValue());
		questaoAlternativa50.setAno(ANO);
		questaoAlternativa50.setDescricao("O pipeline de visualização de objetos tridimensionais reúne um conjunto de transformações e processos" + 
						"aplicados a primitivas geométricas. Sobre essas transformações e processos pode-se dizer que: " +
						"$\\newline$ I. Os objetos devem corresponder a sólidos." + 
						"$\\newline$ II. As coordenadas dos vértices sofrem transformação de acordo com a posição e orientação do observador." + 
						"$\\newline$ III. Um volume de visualização correspondente a um paralelepípedo é determinado pela adoção de projeção perspectiva." + 
						"$\\newline$ IV. A fase final do pipeline corresponde à rasterização dos polígonos." + 
						"$\\newline$ Selecione a alternativa correta:");
		questaoAlternativa50.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa50.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa50.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
		questaoAlternativa50.setAlternativaCorreta("b");
		questaoAlternativa50.setAlternativasA("Todas as afirmativas são verdadeiras.");
		questaoAlternativa50.setAlternativasB("Apenas as afirmativas I e III são falsas.");
		questaoAlternativa50.setAlternativasC("Apenas a afirmativa IV está verdadeira");
		questaoAlternativa50.setAlternativasD("As afirmativas II e III são falsas.");
		questaoAlternativa50.setAlternativasE("Apenas a afirmativa IV é falsa.");
		questaoAlternativa50.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa51 = new QuestaoAlternativa();
		questaoAlternativa51.setId(INICIOQUESTAO.longValue());
		questaoAlternativa51.setAno(ANO);
		questaoAlternativa51.setDescricao("O processo de visualização de objetos 3D envolve uma série de passos desde a representação vetorial de um objeto até a exibição da imagem correspondente na tela do computador pipeline 3D). Selecione a alternativa abaixo que  reflete a ordem correta em que esses passos devem ocorrer.");
		questaoAlternativa51.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa51.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa51.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
		questaoAlternativa51.setAlternativaCorreta("d");
		questaoAlternativa51.setAlternativasA("Projeção, transformação de câmera, recorte 3D, mapeamento para coordenadas de tela, rasterização.");
		questaoAlternativa51.setAlternativasB("Transformação de câmera, mapeamento para coordenadas de tela, recorte 3D, rasterização, projeção.");
		questaoAlternativa51.setAlternativasC("Recorte 3D, transformação de câmera, rasterização, projeção, mapeamento para coordenadas de tela");
		questaoAlternativa51.setAlternativasD("Transformação de câmera, recorte 3D, projeção, mapeamento para coordenadas de tela, rasterização");
		questaoAlternativa51.setAlternativasE("Nenhuma das respostas acima está correta");
		questaoAlternativa51.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa52 = new QuestaoAlternativa();
		questaoAlternativa52.setId(INICIOQUESTAO.longValue());
		questaoAlternativa52.setAno(ANO);
		questaoAlternativa52.setDescricao("As seguintes afirmações dizem respeito ao modelo de desenvolvimento em Espiral - proposto por Barry" + 
				"Boehm na década de 70:" +
				"$\\newline$ I. suas atividades do desenvolvimento são conduzidas por riscos;" + 
				"$\\newline$ II. cada ciclo da espiral inclui 4 passos: passo 1 - identificação dos objetivos ; passo 2 - avaliação das alternativas tendo em vista os objetivos e os riscos (incertezas, restrições) do desenvolvimento; passo 3 - desenvolvimento de estratégias (simulação, prototipagem) p/ resolver riscos; e passo 4 - planejamento do próximo passo e continuidade do processo determinada pelos riscos restantes;\r\n" + 
				"$\\newline$ III. é um modelo evolutivo em que cada passo pode ser representado por um quadrante num diagrama cartesiano: assim na dimensão radical da espiral tem-se o custo acumulado dos vários passos do desenvolvimento enquanto na dimensão angular tem-se o progresso do projeto. \r\n" + 
				"$\\newline$ Levando-se em conta as três afirmações I, II e III acima, identifique a única alternativa válida:");
		questaoAlternativa52.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa52.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa52.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
		questaoAlternativa52.setAlternativaCorreta("d");
		questaoAlternativa52.setAlternativasA("apenas a I e a II estão corretas;");
		questaoAlternativa52.setAlternativasB("apenas a II e a III estão corretas;");
		questaoAlternativa52.setAlternativasC("apenas a I e a III estão corretas;");
		questaoAlternativa52.setAlternativasD("as afirmações I, II e III estão corretas;");
		questaoAlternativa52.setAlternativasE("apenas a III está correta");
		questaoAlternativa52.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa53 = new QuestaoAlternativa();
		questaoAlternativa53.setId(INICIOQUESTAO.longValue());
		questaoAlternativa53.setAno(ANO);
		questaoAlternativa53.setDescricao("Engenharia de Software inclui um grande número de teorias, conceitos, modelos, técnicas e métodos.\r\n" + 
						"Analise as seguintes definições. $\\newline$" + 
						"I. O processo de inferir ou reconstruir um modelo de mais alto nível (projeto ou especificação) a partir\r\n" + 
						"de um documento de mais baixo nível (tipicamente um código fonte); $\\newline$" + 
						"II. Capacidade de modificação de um software (ou de um de seus componentes) após sua entrega ao\r\n" + 
						"cliente visando corrigir falhas, expandir a funcionalidade , modificar a performance ou outros atributos\r\n" + 
						"em resposta a novos requisitos do usuário ou mesmo ser adaptado a alguma mudança do ambiente\r\n" + 
						"de execução (plataforma, p.ex); $\\newline$" + 
						"III. Modelo estabelecido pelo Software Engineering Institute (SEI) que propõe níveis de competência\r\n" + 
						"organizacional relacionados à qualidade do processo de desenvolvimento de software;$\\newline$\r\n" + 
						"Estas definições correspondem respectivamente aos seguintes termos:");
		questaoAlternativa53.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa53.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa53.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
		questaoAlternativa53.setAlternativaCorreta("e");
		questaoAlternativa53.setAlternativasA("Reengenharia, manutenibilidade, Capability Maturity Model (CMM)");
		questaoAlternativa53.setAlternativasB("Engenharia reversa, reparabilidade, Team Software Process (TSP)");
		questaoAlternativa53.setAlternativasC("Reengenharia, evolutibilidade, Personal Software Process (PSP)");
		questaoAlternativa53.setAlternativasD("Refactoring, reparabilidade, Team Software Process (TSP)");
		questaoAlternativa53.setAlternativasE("Engenharia reversa, manutenibilidade, Capability Maturity Model (CMM)");
		questaoAlternativa53.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa54 = new QuestaoAlternativa();
		questaoAlternativa54.setId(INICIOQUESTAO.longValue());
		questaoAlternativa54.setAno(ANO);
		questaoAlternativa54.setDescricao("A medida da interconexão entre os módulos de uma estrutura de software é denominada e que também é usada em projetos orientados a objetos é :");
		questaoAlternativa54.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa54.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa54.setDisciplina(EDisciplina.PROGRAMACAO);
		questaoAlternativa54.setAlternativaCorreta("e");
		questaoAlternativa54.setAlternativasA("Coesão");
		questaoAlternativa54.setAlternativasB("Unidade funcional");
		questaoAlternativa54.setAlternativasC("Ocultamento da informação");
		questaoAlternativa54.setAlternativasD("Abstração procedimenta");
		questaoAlternativa54.setAlternativasE("Acoplamento");
		questaoAlternativa54.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa55 = new QuestaoAlternativa();
		questaoAlternativa55.setId(INICIOQUESTAO.longValue());
		questaoAlternativa55.setAno(ANO);
		questaoAlternativa55.setDescricao("Em relação ao teste de software, qual das afirmações a seguir é INCORRETA:");
		questaoAlternativa55.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa55.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa55.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
		questaoAlternativa55.setAlternativaCorreta("d");
		questaoAlternativa55.setAlternativasA(" Os dados compilados quando a atividade de teste é levada a efeito proporcionam uma boa indicação da confiabilidade do software e alguma indicação da qualidade do software como um todo.");
		questaoAlternativa55.setAlternativasB("Um bom caso de teste é aquele que tem uma elevada probabilidade de revelar um erro ainda não descoberto.");
		questaoAlternativa55.setAlternativasC(" Um teste bem sucedido é aquele que revela um erro ainda não descoberto.");
		questaoAlternativa55.setAlternativasD("A atividade de teste é o processo de executar um programa com a intenção de demonstrar a ausência de erros.");
		questaoAlternativa55.setAlternativasE("O processo de depuração é a parte mais imprevisível do processo de teste pois um erro pode demorar uma hora, um dia ou um mês para ser diagnosticado e corrigido.");
		questaoAlternativa55.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa56 = new QuestaoAlternativa();
		questaoAlternativa56.setId(INICIOQUESTAO.longValue());
		questaoAlternativa56.setAno(ANO);
		questaoAlternativa56.setDescricao("O conjunto básico de atividades e a ordem em que são realizadas no processo de construção de um software definem o que é habitualmente denominado de ciclo de vida do software. O ciclo de vida tradicional (também denominado waterfall) ainda é hoje em dia um dos mais difundidos e tem por característica principal :");
		questaoAlternativa56.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa56.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa56.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
		questaoAlternativa56.setAlternativaCorreta("b");
		questaoAlternativa56.setAlternativasA("o uso de formalização rigorosa em todas as etapas de desenvolvimento;");
		questaoAlternativa56.setAlternativasB("a abordagem sistemática para realização das atividades do desenvolvimento de software de modo que elas seguem um fluxo sequencial;");
		questaoAlternativa56.setAlternativasC("a codificação de uma versão executável do sistema desde as fases iniciais do desenvolvimento, de modo que o sistema final é incrementalmente construído, daí a alusão à idéia de \"cascata\"(waterfall);");
		questaoAlternativa56.setAlternativasD("a priorização da análise dos riscos do desenvolvimento;");
		questaoAlternativa56.setAlternativasE("a avaliação constante dos resultados intermediários feita pelo cliente;");
		questaoAlternativa56.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa57 = new QuestaoAlternativa();
		questaoAlternativa57.setId(INICIOQUESTAO.longValue());
		questaoAlternativa57.setAno(ANO);
		questaoAlternativa57.setDescricao("Considere as seguintes afirmações sobre resolução de problemas em IA.$\newline$" +
				"I. A* é um conhecido algoritmo de busca heurística.$\newline$" +
				"II. O Minimax é um dos principais algoritmos para jogos de dois jogadores, como o xadrez. $\newline$" +
				"III. Busca em espaço de estados é uma das formas de resolução de problemas em IA.$\newline$" +
				"São corretas:");
		questaoAlternativa57.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa57.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa57.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
		questaoAlternativa57.setAlternativaCorreta("e");
		questaoAlternativa57.setAlternativasA("Apenas III");
		questaoAlternativa57.setAlternativasB("Apenas I e II");
		questaoAlternativa57.setAlternativasC("Apenas I e III");
		questaoAlternativa57.setAlternativasD("Apenas II e III");
		questaoAlternativa57.setAlternativasE("I, II e III");
		questaoAlternativa57.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa58 = new QuestaoAlternativa();
		questaoAlternativa58.setId(INICIOQUESTAO.longValue());
		questaoAlternativa58.setAno(ANO);
		questaoAlternativa58.setDescricao("Redes semânticas, frames e lógica são formalismos utilizados principalmente em:");
		questaoAlternativa58.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa58.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa58.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
		questaoAlternativa58.setAlternativaCorreta("b");
		questaoAlternativa58.setAlternativasA("inferência em sistemas especialistas");
		questaoAlternativa58.setAlternativasB("representação de conhecimento.");
		questaoAlternativa58.setAlternativasC("redes neurais.");
		questaoAlternativa58.setAlternativasD("descoberta de conhecimento em bases de dados");
		questaoAlternativa58.setAlternativasE("IA distribuída");
		questaoAlternativa58.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa59 = new QuestaoAlternativa();
		questaoAlternativa59.setId(INICIOQUESTAO.longValue());
		questaoAlternativa59.setAno(ANO);
		questaoAlternativa59.setDescricao("Considere as seguintes afirmações sobre mecanismos de inferência em sistemas baseados em regras. $\\newline$" + 
				"I. O encadeamento regressivo tem pouca utilidade prática, pois deve partir do possível resultado.$\\newline$" + 
				"II. O encadeamento progressivo tanto pode ser em amplitude quanto em profundidade. $\\newline$" + 
				"III. Podem trabalhar com informações incertas ou incompletas. $\\newline$" + 
				"São corretas:");
		questaoAlternativa59.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa59.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa59.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
		questaoAlternativa59.setAlternativaCorreta("d");
		questaoAlternativa59.setAlternativasA("Apenas III");
		questaoAlternativa59.setAlternativasB("Apenas I e II");
		questaoAlternativa59.setAlternativasC("Apenas I e III");
		questaoAlternativa59.setAlternativasD("Apenas II e III");
		questaoAlternativa59.setAlternativasE("I, II e III");
		questaoAlternativa59.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa60 = new QuestaoAlternativa();
		questaoAlternativa60.setId(INICIOQUESTAO.longValue());
		questaoAlternativa60.setAno(ANO);
		questaoAlternativa60.setDescricao("Considere as seguintes afirmações sobre redes neurais artificiais: $\\newline$" + 
				"I. Um perceptron elementar só computa funções linearmente separáveis. $\\newline$" + 
				"II. Não aceitam valores numéricos como entrada. $\\newline$" + 
				"III. O \"conhecimento\"é representado principalmente através do peso das conexões.$\\newline$" + 
				"São corretas:");
		questaoAlternativa60.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa60.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa60.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
		questaoAlternativa60.setAlternativaCorreta("c");
		questaoAlternativa60.setAlternativasA("Apenas III");
		questaoAlternativa60.setAlternativasB("Apenas I e II");
		questaoAlternativa60.setAlternativasC("Apenas I e III");
		questaoAlternativa60.setAlternativasD("Apenas II e III");
		questaoAlternativa60.setAlternativasE("I, II e III");
		questaoAlternativa60.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa61 = new QuestaoAlternativa();
		questaoAlternativa61.setId(INICIOQUESTAO.longValue());
		questaoAlternativa61.setAno(ANO);
		questaoAlternativa61.setDescricao("Qual das opções abaixo você não poderia usar para representar texturas em imagens monocromáticas?");
		questaoAlternativa61.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa61.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa61.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
		questaoAlternativa61.setAlternativaCorreta("*");
		questaoAlternativa61.setAlternativasA("matrizes de co-ocorrência;");
		questaoAlternativa61.setAlternativasB("medida da densidade local de bordas;");
		questaoAlternativa61.setAlternativasC("medidas das sub-bandas espectrais detectadas por filtros de Gabor;");
		questaoAlternativa61.setAlternativasD("nenhuma alternativa acima;");
		questaoAlternativa61.setAlternativasE("as alternativas corretas são a), b) e c).");
		questaoAlternativa61.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa62 = new QuestaoAlternativa();
		questaoAlternativa62.setId(INICIOQUESTAO.longValue());
		questaoAlternativa62.setAno(ANO);
		questaoAlternativa62.setDescricao("Um agente SNMP é um aplicativo que é executado:");
		questaoAlternativa62.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa62.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa62.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
		questaoAlternativa62.setAlternativaCorreta("a");
		questaoAlternativa62.setAlternativasA("Em um dispositivo de rede");
		questaoAlternativa62.setAlternativasB("A partir de um computador específico para monitorar a rede");
		questaoAlternativa62.setAlternativasC("Em computadores denominados de gerentes");
		questaoAlternativa62.setAlternativasD("Em \"firewalls\"com o objetivo de proteger acesso a rede");
		questaoAlternativa62.setAlternativasE("Em roteadores com filtragem de pacotes com o objetivo de proteger acesso a rede");
		questaoAlternativa62.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa63 = new QuestaoAlternativa();
		questaoAlternativa63.setId(INICIOQUESTAO.longValue());
		questaoAlternativa63.setAno(ANO);
		questaoAlternativa63.setDescricao("Algoritmos distribuídos podem usar passagem de \"token\"por um anel lógico para implementar exclusão " + 
				"mútua ou ordenação global de mensagens. Nesses algoritmos apenas o processo que possui o \"token\" tem " + 
				"a permissão de usar um recurso compartilhado ou numerar mensagens, por exemplo. Considerando o conceito acima podemos afirmar que:");

		questaoAlternativa63.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa63.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa63.setDisciplina(EDisciplina.SISTEMAS_DISTRIBUIDOS);
		questaoAlternativa63.setAlternativaCorreta("c");
		questaoAlternativa63
				.setAlternativasA("A abordagem deve tratar no mínimo dois tipos de defeitos: perda do \"token\"e colapso de processos");
		questaoAlternativa63.setAlternativasB("Para usar essa a abordagem os computadores precisam estar conectados em uma rede com topologia em anel");
		questaoAlternativa63.setAlternativasC("Nessa abordagem é impossível evitar a geração espontânea de vários \"tokens\"mesmo em sistemas livre de falhas");
		questaoAlternativa63.setAlternativasD("A abordagem é adequada apenas para sistemas onde possa ser controlado o tempo que cada computador permanece com o \"token\"");
		questaoAlternativa63.setAlternativasE("A abordagem é pouco robusta pois a perda do \"token\"por um processo provoca o bloqueio do algoritmo distribuído que a usa");
		questaoAlternativa63.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa64 = new QuestaoAlternativa();
		questaoAlternativa64.setId(INICIOQUESTAO.longValue());
		questaoAlternativa64.setAno(ANO);
		questaoAlternativa64.setDescricao("Em relação ao paradigma de programação cliente-servidor. Qual das afirmativas abaixo é FALSA?");
		questaoAlternativa64.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa64.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa64.setDisciplina(EDisciplina.SISTEMAS_DISTRIBUIDOS);
		questaoAlternativa64.setAlternativaCorreta("a");
		questaoAlternativa64.setAlternativasA("Um aplicativo servidor inicia ativamente o contato com clientes arbitrários.");
		questaoAlternativa64.setAlternativasB("Um aplicativo servidor aceita contato de clientes arbitrários, mas oferece um único serviço.");
		questaoAlternativa64.setAlternativasC("Um aplicativo cliente é um programa arbitrário que se torna temporariamente um cliente quando for necessário o acesso remoto a um serviço, mas também executa processamento local.");
		questaoAlternativa64.setAlternativasD("Um aplicativo cliente pode acessar múltiplos serviços quando necessário.");
		questaoAlternativa64.setAlternativasE("Um aplicativo servidor é um programa de propósito especial dedicado a fornecer um serviço, mas pode tratar de múltiplos clientes remotos ao mesmo tempo.");
		questaoAlternativa64.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa65 = new QuestaoAlternativa();
		questaoAlternativa65.setId(INICIOQUESTAO.longValue());
		questaoAlternativa65.setAno(ANO);
		questaoAlternativa65.setDescricao("Considere as seguintes informações sobre IP:$\\newline$" + 
				"I. Uma rede IP classe C fornece até 256 endereços válidos para serem atribuídos a equipe $\\newline$" + 
				"II. A quantidade máxima de bits que pode ser utilizada para se definir sub-redes em uma rede IP classe C é seis (6). $\\newline$" + 
				"III. A máscara padrão para uma rede classe B é 255.255.255.0 $\\newline$" + 
				"Qual das alternativas abaixo representa as assertivas corretas:");
		questaoAlternativa65.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa65.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa65.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
		questaoAlternativa65.setAlternativaCorreta("b");
		questaoAlternativa65.setAlternativasA("Somente I.");
		questaoAlternativa65.setAlternativasB("Somente II.");
		questaoAlternativa65.setAlternativasC("Somente III.");
		questaoAlternativa65.setAlternativasD("Somente I e II");
		questaoAlternativa65.setAlternativasE("Somente II e III");
		questaoAlternativa65.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa66 = new QuestaoAlternativa();
		questaoAlternativa66.setId(INICIOQUESTAO.longValue());
		questaoAlternativa66.setAno(ANO);
		questaoAlternativa66.setDescricao("Os protocolos de transporte atribuem a cada serviço um identificador único, o qual é empregado para " + 
				"encaminhar uma requisição de um aplicativo cliente ao processo servidor correto. Nos protocolos de " + 
				"transporte TCP e UDP, como esse identificador se denomina?");
		questaoAlternativa66.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa66.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa66.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
		questaoAlternativa66.setAlternativaCorreta("b");
		questaoAlternativa66.setAlternativasA("Endereço IP");
		questaoAlternativa66.setAlternativasB("Porta");
		questaoAlternativa66.setAlternativasC("Conexão");
		questaoAlternativa66.setAlternativasD("Identificador do processo (PID)");
		questaoAlternativa66.setAlternativasE("Protocolo de aplicação");
		questaoAlternativa66.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa67 = new QuestaoAlternativa();
		questaoAlternativa67.setId(INICIOQUESTAO.longValue());
		questaoAlternativa67.setAno(ANO);
		questaoAlternativa67.setDescricao("Considere as seguintes afirmações sobre SNMP: $\\newline$" + 
				"I. A MIB que permite a coleta de dados genéricos de desempenho de rede é denominada de RMON. $\\newline$" + 
				"II. Os procedimentos básicos do protocolo SNMP são três: get, set e notify. $\\newline$" + 
				"III. objeto empregado para manter informações relativas a um dispositivo de rede é denominado de MIB $\\newline$" + 
				"Qual das alternativas abaixo representa as assertivas corretas:");
		questaoAlternativa67.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa67.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa67.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
		questaoAlternativa67.setAlternativaCorreta("*");
		questaoAlternativa67.setAlternativasA("Somente I.");
		questaoAlternativa67.setAlternativasB("Somente I e II.");
		questaoAlternativa67.setAlternativasC("Somente I e III");
		questaoAlternativa67.setAlternativasD("Somente II e III");
		questaoAlternativa67.setAlternativasE("I, II e II.");
		questaoAlternativa67.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa68 = new QuestaoAlternativa();
		questaoAlternativa68.setId(INICIOQUESTAO.longValue());
		questaoAlternativa68.setAno(ANO);
		questaoAlternativa68.setDescricao("Qual dos protocolos abaixo pode ser caracterizado como protocolo de roteamento do tipo estado de enlace?");
		questaoAlternativa68.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa68.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa68.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa68.setAlternativaCorreta("c");
		questaoAlternativa68.setAlternativasA("IGMP");
		questaoAlternativa68.setAlternativasB("BGP-4");
		questaoAlternativa68.setAlternativasC("OSPF");
		questaoAlternativa68.setAlternativasD("ICMP");
		questaoAlternativa68.setAlternativasE("RIP2");
		questaoAlternativa68.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa69 = new QuestaoAlternativa();
		questaoAlternativa69.setId(INICIOQUESTAO.longValue());
		questaoAlternativa69.setAno(ANO);
		questaoAlternativa69.setDescricao("Um sistema centralizado é um concentrador de recursos; um sistema distribuído apresenta seus recursos" + 
				"dispersos. Entretanto nem todo o conjunto de recursos computacionais dispersos pode ser considerado" + 
				"um sistema distribuído. Considerando um conjunto de computadores, assinale a alternativa que melhor" + 
				"corresponde às características necessárias para considerá-lo um sistema distribuído:");
		questaoAlternativa69.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa69.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa69.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa69.setAlternativaCorreta("b");
		questaoAlternativa69.setAlternativasA("Existência de memória compartilhada e relógios locais sincronizados");
		questaoAlternativa69.setAlternativasB("Suporte de rede e funções primitivas de comunicação");
		questaoAlternativa69.setAlternativasC("Suporte de rede e um relógio global");
		questaoAlternativa69.setAlternativasD("Existência de sistema operacional idêntico e hardware padronizado em todos os computadores");
		questaoAlternativa69.setAlternativasE("Existência de memória secundária compartilhada e protocolos de sincronização de estado");
		questaoAlternativa69.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa70 = new QuestaoAlternativa();
		questaoAlternativa70.setId(INICIOQUESTAO.longValue());
		questaoAlternativa70.setAno(ANO);
		questaoAlternativa70.setDescricao("Entre as desvantagens e vantagens de um sistema distribuído em relação um sistema centralizado, podemos afirmar que um sistema distribuído apresenta: $\\newline$" + 
				"i. a desvantagem de possuir maior quantidade de componentes e portanto maior probabilidade de um componente individual qualquer apresentar defeito mas a vantagem de possibilitar continuar a computação em outro computador do sistema se um dos computadores falhar. $\\newline$" + 
				"ii. a desvantagem de maior tempo de inicialização devido a maior quantidade de computadores no sistema do sistema mas a vantagem de maior flexibilidade de acesso a dados remotos. $\\newline$" + 
				"iii. a desvantagem da necessidade de máquinas homogêneas mas a vantagem de possibilitar operar num sistema com uma única forma de acesso a arquivos de dados. $\\newline$" + 
				"iv. a desvantagem de maior latência para alcançar um recurso localizado em outro computador do sistema mas a vantagem de permitir executar de programas concorrentemente. $\\newline$" + 
				"Assinale a alternativa correta");
		questaoAlternativa70.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa70.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa70.setDisciplina(EDisciplina.PROGRAMACAO);
		questaoAlternativa70.setAlternativaCorreta("*");
		questaoAlternativa70.setAlternativasA(" i e ii são verdadeiras");
		questaoAlternativa70.setAlternativasB("iii e iv são verdadeiras");
		questaoAlternativa70.setAlternativasC("i e iii são verdadeiras");
		questaoAlternativa70.setAlternativasD("ii e iv são verdadeiras");
		questaoAlternativa70.setAlternativasE("i e iv são verdadeiras");
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
