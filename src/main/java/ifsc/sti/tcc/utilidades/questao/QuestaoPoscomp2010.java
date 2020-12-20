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
		questaoAlternativa1.setDescricao("Qual é o número inteiro mais próximo de $\\\\log_{2}{1.000.000}$?");
		questaoAlternativa1.setArea(EArea.MATEMATICA);
		questaoAlternativa1.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa1.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa1.setAlternativaCorreta("c");

		questaoAlternativa1.setAlternativasA("6");
		questaoAlternativa1.setAlternativasB("10");
		questaoAlternativa1.setAlternativasC("20");
		questaoAlternativa1.setAlternativasD("100");
		questaoAlternativa1.setAlternativasE("1000");
		questaoAlternativa1.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa2 = new QuestaoAlternativa();
		questaoAlternativa2.setId(INICIOQUESTAO.longValue());
		questaoAlternativa2.setAno(ANO);
		questaoAlternativa2.setDescricao(
				"Seja V um espaço vetorial real com produto interno. Para x e y vetores quaisquer de V, a igualdade $\\mid \\mid x + y \\mid \\mid = \\mid \\mid x \\mid \\mid + \\mid \\mid y \\mid \\mid$");
		questaoAlternativa2.setArea(EArea.MATEMATICA);
		questaoAlternativa2.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa2.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
		questaoAlternativa2.setAlternativaCorreta("b");
		questaoAlternativa2.setAlternativasA("x $\\neq$ 0 e y = $\\lambda$ x para todo número real $\\lambda$   ");
		questaoAlternativa2.setAlternativasB(
				"x = 0, ou y = 0, ou (x $\\neq$ 0 e y = $\\lambda$ x) onde $\\lambda$ é um número real não-negativo.        ");
		questaoAlternativa2.setAlternativasC("x = 0, ou y = 0.");
		questaoAlternativa2.setAlternativasD("x = 0, ou y = 0, ou (x $\\neq$ 0 e x, y são linearmente dependentes).");
		questaoAlternativa2.setAlternativasE("x = 0, ou y = 0, ou (x $\\neq$ 0 e x, y são linearmente independentes).");
		questaoAlternativa2.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa3 = new QuestaoAlternativa();
		questaoAlternativa3.setId(INICIOQUESTAO.longValue());
		questaoAlternativa3.setAno(ANO);
		questaoAlternativa3.setDescricao(
				"Sobre a transformação linear T : $\\mathbb{R}^2 \\rightarrow \\mathbb{R}^2$ definida pela matriz $\\begin{bmatrix}1 & 0 \\\\-1 & 0 \\end{bmatrix}$ podemos dizer que");
		questaoAlternativa3.setArea(EArea.MATEMATICA);
		questaoAlternativa3.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa3.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
		questaoAlternativa3.setAlternativaCorreta("d");

		questaoAlternativa3
				.setAlternativasA("a imagem é a reta $y = x$ e o núcleo é $\\left\\{ \\left(0, 0 \\right) \\right\\}$");
		questaoAlternativa3.setAlternativasB("a imagem é a reta $x = 0$ e o núcleo é a reta $y = −x$");
		questaoAlternativa3.setAlternativasC("a imagem é a reta $y = x$ e o núcleo é o $\\mathbb{R}^2$");
		questaoAlternativa3.setAlternativasD("a imagem é a reta $y = −x$ e o núcleo é a reta $x = 0$");
		questaoAlternativa3.setAlternativasE("a imagem é o  $\\mathbb{R}^2$ e o núcleo é a reta $y = x$");
		questaoAlternativa3.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa4 = new QuestaoAlternativa();
		questaoAlternativa4.setId(INICIOQUESTAO.longValue());
		questaoAlternativa4.setAno(ANO);
		questaoAlternativa4.setDescricao(
				"A transformação $T(x, y) =\\\\frac{1}{5} (−4x + 3y, 3x + 4y)$ do plano no plano é podemos dizer que ");
		questaoAlternativa4.setArea(EArea.MATEMATICA);
		questaoAlternativa4.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa4.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
		questaoAlternativa4.setAlternativaCorreta("d");

		questaoAlternativa4.setAlternativasA("uma reflexãoo através da reta $y = 3x$");
		questaoAlternativa4.setAlternativasB("uma expansão uniforme");
		questaoAlternativa4.setAlternativasC("uma contração uniforme");
		questaoAlternativa4.setAlternativasD("uma translação");
		questaoAlternativa4.setAlternativasE("um cisalhamento horizontal");
		questaoAlternativa4.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa5 = new QuestaoAlternativa();
		questaoAlternativa5.setId(INICIOQUESTAO.longValue());
		questaoAlternativa5.setAno(ANO);
		questaoAlternativa5.setDescricao(
				"No $ \\mathbb{R}^3$ com o produto escalar usual, tome $v = \\left(1, −1, 0\\right)$ e o subespaço S gerado por \\left\\{\\left(1, 2, 1\\right),\\left(−1, 1, −1\\right)\\right\\}$. O vetor de S mais próximo de v  é");
		questaoAlternativa5.setArea(EArea.MATEMATICA);
		questaoAlternativa5.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa5.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
		questaoAlternativa5.setAlternativaCorreta("a");

		questaoAlternativa5.setAlternativasA("$(1/2, −1, 1/2)$");
		questaoAlternativa5.setAlternativasB("$(1, −1, 1)$");
		questaoAlternativa5.setAlternativasC("$(2/3, −1, 1/3)$");
		questaoAlternativa5.setAlternativasD("$(1/100, −1, 1/100)$");
		questaoAlternativa5.setAlternativasE("$(2, −1, 2)$");
		questaoAlternativa5.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa6 = new QuestaoAlternativa();
		questaoAlternativa6.setId(INICIOQUESTAO.longValue());
		questaoAlternativa6.setAno(ANO);
		questaoAlternativa6.setDescricao(
				"Considere o espaço amostral  $\\\\Omega  = \\\\left\\\\{\\\\omega_1, \\\\omega_2, . . . , \\\\omega_n\\\\right\\\\}$ onde $\\\\omega_i$ ocorre com probabilidade $p_i$ para todo $i \\\\ \\\\epsilon \\\\left\\\\{1, 2, . . . , n\\\\right\\\\}$. Defina o produto escalar"
						+ "$\\newline$"
						+ "$\\langle x, y\\rangle = p_1 x_1 y_1 + p_2 x_2 y_2 + . . . + p_n x_n y_n$,\r\n"
						+ "$\\newline$"
						+ "para $x = (x_1, x_2, . . . , x_n)$ e $y = (y_1, y_2, . . . , y_n)$, pontos quaisquer no $\\mathbb{R}^n$.\r\n"
						+ "$\\newline$\r\n"
						+ "Seja X uma variável aleatória com $X(\\omega_i) = X_i$. Para $p = (p_1, . . . , p_n), X = (X_1, . . . , X_n)$ e  $1 = (1, 1, . . . , 1) \\ \\epsilon \\ \\mathbb{R}^n$ podemos dizer que"
						+ "$\\newline$" + "$\\langle X, 1\\rangle$" + "$\\newline$\r\n"
						+ "$\\langle X - \\langle X, 1\\rangle1, X - \\langle X, 1\\rangle1\\rangle$\r\n"
						+ "$\\newline$" + "$||X - \\langle X, 1\\rangle1||$" + "$\\newline$"
						+ "são, respectivamente, com respeito a variável X a");
		questaoAlternativa6.setArea(EArea.MATEMATICA);
		questaoAlternativa6.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa6.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
		questaoAlternativa6.setAlternativaCorreta("e");

		questaoAlternativa6.setAlternativasA("média, variância, desvio padrão");
		questaoAlternativa6.setAlternativasB("variância, média, desvio padrão");
		questaoAlternativa6.setAlternativasC("média, desvio padrão, variância");
		questaoAlternativa6.setAlternativasD("desvio padrão, média, variância");
		questaoAlternativa6.setAlternativasE("desvio padrão, variância, média");
		questaoAlternativa6.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa7 = new QuestaoAlternativa();
		questaoAlternativa7.setId(INICIOQUESTAO.longValue());
		questaoAlternativa7.setAno(ANO);
		questaoAlternativa7.setDescricao(
				"Seja $f : R → R$ derivável. Se existem $a, b ∈ R$ tal que $f(a)f(b) < 0$ e $f'(x) <> 0$ para todo $x ∈ (a, b)$, podemos afirmar que no intervalo $(a, b)$ a equação $f(x) = 0$ tem");
		questaoAlternativa7.setArea(EArea.MATEMATICA);
		questaoAlternativa7.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa7.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa7.setAlternativaCorreta("c");

		questaoAlternativa7.setAlternativasA("Duas raízes reais");
		questaoAlternativa7.setAlternativasB("Nenhuma raíz real");
		questaoAlternativa7.setAlternativasC("Uma única raiz real");
		questaoAlternativa7.setAlternativasD("Uma raiz imaginária");
		questaoAlternativa7.setAlternativasE("Somente raízes imaginárias");
		questaoAlternativa7.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa8 = new QuestaoAlternativa();
		questaoAlternativa8.setId(INICIOQUESTAO.longValue());
		questaoAlternativa8.setAno(ANO);
		questaoAlternativa8.setDescricao(
				"Seja g : $\\mathbb{R} \\rightarrow \\mathbb{R}$ contínua e $f\\left(x\\right) =g\\left(x\\right) - x$. Definimos a sequência $\\left(x_n\\right)$ da seguinte maneira \r\n"
						+ "\r\n" + "$\\begin{cases}x_0 & = 1\\ x_n & = g(x_{n-1}) & para \\ n \\geq 1\\end{cases}$ \r\n"
						+ "\r\n" + "\r\n" + "Se $\\lim_{n \\rightarrow ∞} x_n = L$ podemos afirmar que\r\n");
		questaoAlternativa8.setArea(EArea.MATEMATICA);
		questaoAlternativa8.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa8.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa8.setAlternativaCorreta("a");

		questaoAlternativa8.setAlternativasA("L é uma raiz de $f(x) = 0$");
		questaoAlternativa8.setAlternativasB("L é uma raíz de $g(x) = 0$");
		questaoAlternativa8.setAlternativasC("$g(L) = 1$");
		questaoAlternativa8.setAlternativasD("$f(L) = L$");
		questaoAlternativa8.setAlternativasE("Nenhuma das anteriores");
		questaoAlternativa8.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa9 = new QuestaoAlternativa();
		questaoAlternativa9.setId(INICIOQUESTAO.longValue());
		questaoAlternativa9.setAno(ANO);
		questaoAlternativa9.setDescricao("Assinale a proposição verdadeira");
		questaoAlternativa9.setArea(EArea.MATEMATICA);
		questaoAlternativa9.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa9.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa9.setAlternativaCorreta("d");

		questaoAlternativa9
				.setAlternativasA("Se x é um número real tal que $x^2 \\leq 4$ então $x \\leq 2$ e $x \\geq −2$");
		questaoAlternativa9.setAlternativasB("Se x e y são números reais tais que $x < y$ então $x^2 < y^2$");
		questaoAlternativa9.setAlternativasC("Se $x + y$ é um número racional então $x$ e $y$ são números racionais");
		questaoAlternativa9.setAlternativasD("Se $x < −4$ ou $x > 1$ então $\\frac{2x + 3}{x − 1}> 1$\r\n");
		questaoAlternativa9.setAlternativasE("Nenhuma das anteriores");
		questaoAlternativa9.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa10 = new QuestaoAlternativa();
		questaoAlternativa10.setId(INICIOQUESTAO.longValue());
		questaoAlternativa10.setAno(ANO);
		questaoAlternativa10
				.setDescricao("Assinale o argumento válido, onde $S_1$, $S_2$ indicam premissas e $S$ a conclusão:");
		questaoAlternativa10.setArea(EArea.MATEMATICA);
		questaoAlternativa10.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa10.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa10.setAlternativaCorreta("b");

		questaoAlternativa10.setAlternativasA(
				"$S_1$: Se o cavalo estiver cansado então ele perderá a corrida $\\newline S_2$: O cavalo estava descansado $\\newline S$: O cavalo ganhou a corrida");
		questaoAlternativa10.setAlternativasB(
				"$S_1$: Se o cavalo estiver cansado então ele perderá a corrida $\\newline S_2$: O cavalo ganhou a corrida $\\newline S$: O cavalo estava descansado");
		questaoAlternativa10.setAlternativasC(
				"$S_1$: Se o cavalo estiver cansado então ele perderá a corrida $\\newline S_2$: O cavalo perdeu a corrida $\\newline S$: O cavalo estava cansado");
		questaoAlternativa10.setAlternativasD(
				"$S_1$: Se o cavalo estiver cansado então ele perderá a corrida $\\newline S_2$: O cavalo estava descansado $\\newline S$: O cavalo perdeu a corrida");
		questaoAlternativa10.setAlternativasE("Nenhuma das anteriores");
		questaoAlternativa10.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa11 = new QuestaoAlternativa();
		questaoAlternativa11.setId(INICIOQUESTAO.longValue());
		questaoAlternativa11.setAno(ANO);
		questaoAlternativa11.setDescricao(
				"Uma prova de vestibular foi elaborada com 25 questões de múltipla escolha com 5 alternativas. O número de candidatos presentes à prova foi 63127. Considere a afirmação:\r\n"
						+ "Pelo menos 2 candidatos responderam de modo idêntico as $k$ primeiras questões da prova. Qual é o maior valor de k para o qual podemos garantir que a afirmação é verdadeira.");
		questaoAlternativa11.setArea(EArea.MATEMATICA);
		questaoAlternativa11.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa11.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa11.setAlternativaCorreta("e");

		questaoAlternativa11.setAlternativasA("10");
		questaoAlternativa11.setAlternativasB("9");
		questaoAlternativa11.setAlternativasC("8");
		questaoAlternativa11.setAlternativasD("7");
		questaoAlternativa11.setAlternativasE("6");
		questaoAlternativa11.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa12 = new QuestaoAlternativa();
		questaoAlternativa12.setId(INICIOQUESTAO.longValue());
		questaoAlternativa12.setAno(ANO);
		questaoAlternativa12.setDescricao(
				"Dado um vetor $u ∈ R^2$, $u = \\left (−3, 4\\right )$, vamos denotar por $v$ o vetor de $R^2$ que tem tamanho 1 e é ortogonal à $u$. Então $v$ pode ser dado por");
		questaoAlternativa12.setArea(EArea.MATEMATICA);
		questaoAlternativa12.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa12.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa12.setAlternativaCorreta("c");

		questaoAlternativa12.setAlternativasA("$\\left (−4/5, 3/5\\right )$");
		questaoAlternativa12.setAlternativasB("$\\left (3/5, 4/5\\right )$");
		questaoAlternativa12.setAlternativasC("$\\left (−4/5, −3/5\\right )$");
		questaoAlternativa12.setAlternativasD("$\\left (−4/5, 1/5\\right )$");
		questaoAlternativa12.setAlternativasE("$\\left (−4/5, 2/5\\right )$");
		questaoAlternativa12.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa13 = new QuestaoAlternativa();
		questaoAlternativa13.setId(INICIOQUESTAO.longValue());
		questaoAlternativa13.setAno(ANO);
		questaoAlternativa13.setDescricao(
				"Se O = $\\left (0, 0, 0\\right ) ; A = \\left (2, 4, 1\\right ) ; B = \\left (3, 1, 1\\right ) e \\, C = \\left (1, 3, 5\\right )$ então o volume do sólido abaixo é:");
		questaoAlternativa13.setArea(EArea.MATEMATICA);
		questaoAlternativa13.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa13.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
		questaoAlternativa13.setAlternativaCorreta("d");
		questaoAlternativa13.setImagem(true);
		questaoAlternativa13.setAlternativasA("30");
		questaoAlternativa13.setAlternativasB("35");
		questaoAlternativa13.setAlternativasC("$35/2$");
		questaoAlternativa13.setAlternativasD("44");
		questaoAlternativa13.setAlternativasE("21");
		questaoAlternativa13.setImagemQuestao(
				"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");
		questaoAlternativa13.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa14 = new QuestaoAlternativa();
		questaoAlternativa14.setId(INICIOQUESTAO.longValue());
		questaoAlternativa14.setAno(ANO);
		questaoAlternativa14.setDescricao("A velocidade de um ponto em movimento é dada pela equação \r\n" + "\r\n"
				+ "$v\\left (t\\right )  = te^{-0,01t} m/s$ \r\n" + "\r\n"
				+ "O espaço percorrido desde o instante que o ponto comecçou a se mover até a sua parada total é");
		questaoAlternativa14.setArea(EArea.MATEMATICA);
		questaoAlternativa14.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa14.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
		questaoAlternativa14.setAlternativaCorreta("a");

		questaoAlternativa14.setAlternativasA("$10^4m$");
		questaoAlternativa14.setAlternativasB("$10^3e^{−0.01}m$");
		questaoAlternativa14.setAlternativasC("$10^2e^{−1}m$");
		questaoAlternativa14.setAlternativasD("$(e^{−100} − 1)m$");
		questaoAlternativa14.setAlternativasE("$10^2m$");
		questaoAlternativa14.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa15 = new QuestaoAlternativa();
		questaoAlternativa15.setId(INICIOQUESTAO.longValue());
		questaoAlternativa15.setAno(ANO);
		questaoAlternativa15.setDescricao(
				"$\\lim_{n \\rightarrow ∞}\\left(\\frac{1}{n^2} + \\frac{2}{n^2} + ... +\\frac{n − 1}{n^2} \\right) = L$ então");
		questaoAlternativa15.setArea(EArea.MATEMATICA);
		questaoAlternativa15.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa15.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa15.setAlternativaCorreta("c");

		questaoAlternativa15.setAlternativasA("$L = 1$");
		questaoAlternativa15.setAlternativasB("$L = 0$");
		questaoAlternativa15.setAlternativasC("$L = 1/2$");
		questaoAlternativa15.setAlternativasD("$L = ∞$");
		questaoAlternativa15.setAlternativasE("$L = 2$");
		questaoAlternativa15.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa16 = new QuestaoAlternativa();
		questaoAlternativa16.setId(INICIOQUESTAO.longValue());
		questaoAlternativa16.setAno(ANO);
		questaoAlternativa16.setDescricao(
				"O número de strings binárias de comprimento 7 e contendo um par de zeros consecutivos é");
		questaoAlternativa16.setArea(EArea.MATEMATICA);
		questaoAlternativa16.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa16.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa16.setAlternativaCorreta("c");

		questaoAlternativa16.setAlternativasA("91");
		questaoAlternativa16.setAlternativasB("92");
		questaoAlternativa16.setAlternativasC("94");
		questaoAlternativa16.setAlternativasD("95");
		questaoAlternativa16.setAlternativasE("90");
		questaoAlternativa16.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa17 = new QuestaoAlternativa();
		questaoAlternativa17.setId(INICIOQUESTAO.longValue());
		questaoAlternativa17.setAno(ANO);
		questaoAlternativa17.setDescricao(
				"A média aritmética de uma lista de 50 números é 50. Se dois desses números, 51 e 97, forem suprimidos dessa lista a média dos restantes será");
		questaoAlternativa17.setArea(EArea.MATEMATICA);
		questaoAlternativa17.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa17.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
		questaoAlternativa17.setAlternativaCorreta("b");

		questaoAlternativa17.setAlternativasA("50");
		questaoAlternativa17.setAlternativasB("49");
		questaoAlternativa17.setAlternativasC("51");
		questaoAlternativa17.setAlternativasD("47");
		questaoAlternativa17.setAlternativasE("40");
		questaoAlternativa17.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa18 = new QuestaoAlternativa();
		questaoAlternativa18.setId(INICIOQUESTAO.longValue());
		questaoAlternativa18.setAno(ANO);
		questaoAlternativa18.setDescricao(
				"O determinante da matriz dada abaixo é $\\left( \\begin{array}{c}2 \\\\ 2 \\\\ -1 \\\\ 2 \\\\ 3\\end{array} \\begin{array}{c}7 \\\\ 8 \\\\ 0 \\\\ 0 \\\\ 0\\end{array} \\begin{array}{c}9 \\\\ 3 \\\\ 4 \\\\ 0 \\\\ 0\\end{array} \\begin{array}{c}−1 \\\\ 1 \\\\ 3 \\\\ -1 \\\\ 0\\end{array} \\begin{array}{c}1 \\\\ 0 \\\\ 0 \\\\ 0 \\\\ 0\\end{array} \\right)$");
		questaoAlternativa18.setArea(EArea.MATEMATICA);
		questaoAlternativa18.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa18.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
		questaoAlternativa18.setAlternativaCorreta("a");
		questaoAlternativa18.setAlternativasA("96");
		questaoAlternativa18.setAlternativasB("−96");
		questaoAlternativa18.setAlternativasC("86");
		questaoAlternativa18.setAlternativasD("−86");
		questaoAlternativa18.setAlternativasE("46");
		questaoAlternativa18.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa19 = new QuestaoAlternativa();
		questaoAlternativa19.setId(INICIOQUESTAO.longValue());
		questaoAlternativa19.setAno(ANO);
		questaoAlternativa19.setDescricao(
				"Numa prova de múltipla escolha com 10 questões e 4 alternativas qual a chance (probabilidade) de um aluno apenas “chutando as respostas” conseguir “gabaritar” a provar (acertar todas as questões).\r\n");
		questaoAlternativa19.setArea(EArea.MATEMATICA);
		questaoAlternativa19.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa19.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
		questaoAlternativa19.setAlternativaCorreta("c");

		questaoAlternativa19.setAlternativasA("$1/10^{4}$");
		questaoAlternativa19.setAlternativasB("$1/4^{20}$");
		questaoAlternativa19.setAlternativasC("$1/2^{20}$");
		questaoAlternativa19.setAlternativasD("$1/10^{8}$");
		questaoAlternativa19.setAlternativasE("$1/4^{15}$");
		questaoAlternativa19.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa20 = new QuestaoAlternativa();
		questaoAlternativa20.setId(INICIOQUESTAO.longValue());
		questaoAlternativa20.setAno(ANO);
		questaoAlternativa20.setDescricao(
				"Três atletas A, B e C competiram, ao pares, numa corrida de d metros. Considerando que cada atleta teve o mesmo desempenho (ou seja, a mesma velocidade) ao competir com adversários distintos, e sabendo-se que \r\n"
						+ "$\\newline$• A venceu B chegando 20 metros à frente"
						+ "$\\newline$• B venceu C chegando 10 metros à frente"
						+ "$\\newline$• A venceu C chegando 28 metros à frente,"
						+ "$\\newline$podemos afirmar que a corrida tem");
		questaoAlternativa20.setArea(EArea.MATEMATICA);
		questaoAlternativa20.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa20.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa20.setAlternativaCorreta("c");

		questaoAlternativa20.setAlternativasA("50 metros");
		questaoAlternativa20.setAlternativasB("200 metros");
		questaoAlternativa20.setAlternativasC("100 metros");
		questaoAlternativa20.setAlternativasD("150 metros");
		questaoAlternativa20.setAlternativasE("110 metros");
		questaoAlternativa20.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa21 = new QuestaoAlternativa();
		questaoAlternativa21.setId(INICIOQUESTAO.longValue());
		questaoAlternativa21.setAno(ANO);
		questaoAlternativa21.setDescricao("Uma característica de uma arquitetura RISC é:");
		questaoAlternativa21.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa21.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa21.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
		questaoAlternativa21.setAlternativaCorreta("d");

		questaoAlternativa21
				.setAlternativasA("Uma arquitetura de alto risco pois o mercado de hardware evolui muito rapidamente");
		questaoAlternativa21.setAlternativasB("Possui um grande conjunto de instruções complexas");
		questaoAlternativa21.setAlternativasC("A arquitetura é constituída de milhares de processadores ");
		questaoAlternativa21.setAlternativasD("Possui um pequeno conjunto de instruções simples");
		questaoAlternativa21.setAlternativasE("O processador é formado por válvulas e transistores ");
		questaoAlternativa21.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa22 = new QuestaoAlternativa();
		questaoAlternativa22.setId(INICIOQUESTAO.longValue());
		questaoAlternativa22.setAno(ANO);
		questaoAlternativa22.setDescricao("Na Algebra Booleana");
		questaoAlternativa22.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa22.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa22.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
		questaoAlternativa22.setAlternativaCorreta("b");

		questaoAlternativa22.setAlternativasA("Os dígitos são octais, de 0 a 7");
		questaoAlternativa22.setAlternativasB("Os dígitos são binários 0 e 1");
		questaoAlternativa22.setAlternativasC("Há dez valores motivados pelos dez dedos do ser humano");
		questaoAlternativa22.setAlternativasD("Os dígitos são alfanuméricos que podem ser representados por um byte");
		questaoAlternativa22.setAlternativasE("Os dígitos são hexadecimais de 0 a 15");
		questaoAlternativa22.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa23 = new QuestaoAlternativa();
		questaoAlternativa23.setId(INICIOQUESTAO.longValue());
		questaoAlternativa23.setAno(ANO);
		questaoAlternativa23.setDescricao(
				"Considere o circuito abaixo, implementado com duas portas NAND. Qual das seguintes portas equivale a este circuito?");
		questaoAlternativa23.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa23.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa23.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
		questaoAlternativa23.setAlternativaCorreta("c");
		questaoAlternativa23.setImagem(true);
		questaoAlternativa23.setAlternativasA("NOT");
		questaoAlternativa23.setAlternativasB("OR");
		questaoAlternativa23.setAlternativasC("AND");
		questaoAlternativa23.setAlternativasD("XOR");
		questaoAlternativa23.setAlternativasE("NOR");
		questaoAlternativa23.setImagemQuestao(
				"iVBORw0KGgoAAAANSUhEUgAAAesAAAB3CAIAAACsQv96AAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAABRXSURBVHhe7Z15XFbFGscBl+C65ILhkkZRopkpFlnRIq4lrkQflzCzlMqr5pKilUtZmKWFS25dNQtNURNRs0xvaJiVZlS438w1XCjNDReQ+9PXS10XeOec933Peeb9nX+dOeeZ7wxfzztn5hmffF4kQAIkQAIyCfjIDJtRkwAJkAAJ5NPgHAQkQAIkIJUADS615xg3CZAACdDgHAMkQAIkIJUADS615xg3CZAACdDgHAMkQAIkIJUADS615xg3CZAACdDgHAMkQAIkIJUADS615xg3CZAACdDgHAMkQAIkIJUADS615xg3CZAACdDgHAMkQAIkIJUADS615xg3CZAACdDgHAMkQAIkIJUADS615xg3CZAACdDgHAMkQAIkIJUADS615xg3CZAACdDgHAMkQAIkIJUADS615xg3CZAACdDgHAMkQAIkIJUADS615xg3CZAACdDgHAMkQAIkIJUADS615xg3CZAACdDgamPg6NGjBzx7HTp06Pfff8/JyVELlKW9lcCxY8c8O0IPOIboqVOnvBW5le2mwdXot2vXzsfH5wYPXosWLapQoYK/v3+5cuVq167dpEmT559/ftasWdu3b1cLnaW9g0BcXJyHh+iMGTMwRAMCAsqWLRsaGhoZGdmjR4/p06dv3rz5/Pnz3kHdslbS4GroH3vsseTkZLU6Lir9xx9/ZGZmrlixIjExsWPHjjfddFNgYGCrVq3efPPNffv2ueghvI14As8+++zkyZMtaQZ+ocLaK1eufO+992JjY0NCQsqXL//II4+MHDly586dloSk/UNpcLUuttDgVwb622+/LVy4sGfPnngDiomJSUtLU2sMS+tIwEKDX4nz4MGDixcv7tevX6VKlfC28dlnn/Gt3LWDjgZX42krgxeEfvz4cbz13H777XXr1p0yZcrJkyfVWsXSGhGwlcELuGKWHPMqYWFhNWvWxI/IP//8UyPkVjaFBlejb0+DF7QBP2AxU1+xYsUhQ4bw46da1+pS2p4GL6Cbnp6OOUDMrrzwwgv46KoLdcvaQYOrobe5wR2N2b17d6dOnfBN6ZtvvlFrHkvLJ2BzgzsA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");
		questaoAlternativa23.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa24 = new QuestaoAlternativa();
		questaoAlternativa24.setId(INICIOQUESTAO.longValue());
		questaoAlternativa24.setAno(ANO);
		questaoAlternativa24.setDescricao(
				"Considere o projeto de um circuito digital que implementa uma função $f$ com três variáveis de entrada e satisfazendo as seguintes propriedades: \r\n"
						+ "\r\n" + "$f(x,y,z) = \\begin{cases}1 & x \\neq y\\\\ 0 & caso \\ contrário\\end{cases}$\r\n"
						+ "\r\n" + "Qual das seguintes expressões representa corretamente a função $f$?");
		questaoAlternativa24.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa24.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa24.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa24.setAlternativaCorreta("c");
		questaoAlternativa24.setImagem(true);
		questaoAlternativa24.setAlternativasA("$x + \\overline{y}z$");
		questaoAlternativa24.setAlternativasB("$\\overline{xyz} + x\\overline{y}z$");
		questaoAlternativa24.setAlternativasC("$\\overline{x}y + x\\overline{y}$");
		questaoAlternativa24.setAlternativasD("$xy + \\overline{y}z + \\overline{z}$");
		questaoAlternativa24.setAlternativasE("$\\overline{x}z + xy + \\overline{yz}$");
		questaoAlternativa24.setNumeroQuestao(NUMEROQUESTAO);

		QuestaoAlternativa questaoAlternativa25 = new QuestaoAlternativa();
		questaoAlternativa25.setId(INICIOQUESTAO.longValue());
		questaoAlternativa25.setAno(ANO);
		questaoAlternativa25.setDescricao(
				"Assinale quantas sequências de caracteres a seguir são reconhecidas pelo autômato finito abaixo. As quatro sequências de caracteres (separadas por vírgulas) são: 0, +567, -89.5, -3e3.");
		questaoAlternativa25.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa25.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa25.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa25.setAlternativaCorreta("c");
		questaoAlternativa25.setImagem(true);
		questaoAlternativa25.setAlternativasA("0");
		questaoAlternativa25.setAlternativasB("1");
		questaoAlternativa25.setAlternativasC("2");
		questaoAlternativa25.setAlternativasD("3");
		questaoAlternativa25.setAlternativasE("4");
		questaoAlternativa25.setImagemQuestao(
				"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");
		questaoAlternativa25.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa26 = new QuestaoAlternativa();
		questaoAlternativa26.setId(INICIOQUESTAO.longValue());
		questaoAlternativa26.setAno(ANO);
		questaoAlternativa26.setDescricao("Sobre a hierarquia de Chomsky podemos afirmar que:");
		questaoAlternativa26.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa26.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa26.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa26.setAlternativaCorreta("e");
		questaoAlternativa26
				.setAlternativasA("Uma linguagem que é recusirvamente enumerável não pode ser uma linguagem regular");
		questaoAlternativa26
				.setAlternativasB("As linguagens livres de contexto e as linguagens sensíveis a contexto se excluem");
		questaoAlternativa26.setAlternativasC("Uma linguagem que não é regular é livre de contexto");
		questaoAlternativa26
				.setAlternativasD("As linguagens reconhecidas por autômatos a pilha são as linguagens regulares");
		questaoAlternativa26
				.setAlternativasE("Há linguagens que não são nem livres de contexto nem sensíveis a contexto");
		questaoAlternativa26.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa27 = new QuestaoAlternativa();
		questaoAlternativa27.setId(INICIOQUESTAO.longValue());
		questaoAlternativa27.setAno(ANO);
		questaoAlternativa27.setDescricao(
				"Suponha que T seja uma árvore AVL inicialmente vazia, e considere a inserção dos elementos 10,20,30,5,15,2 em T, nesta ordem. Qual das sequências abaixo corresponde a um percurso de T em pré-ordem:");
		questaoAlternativa27.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa27.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa27.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
		questaoAlternativa27.setAlternativaCorreta("a");
		questaoAlternativa27.setAlternativasA("10,5,2,20,15,30");
		questaoAlternativa27.setAlternativasB("20,10,5,2,15,30");
		questaoAlternativa27.setAlternativasC("2,5,10,15,20,30");
		questaoAlternativa27.setAlternativasD("30,20,15,10,5,2");
		questaoAlternativa27.setAlternativasE("15,10,5,2,20,30");
		questaoAlternativa27.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa28 = new QuestaoAlternativa();
		questaoAlternativa28.setId(INICIOQUESTAO.longValue());
		questaoAlternativa28.setAno(ANO);
		questaoAlternativa28.setDescricao(
				"Considere uma tabela de espalhamento (tabela hash) com quatro posições numeradas 0, 1, 2 e 3. Se a sequencia de quadrados perfeitos $1, 4, 9, ....., i^2, ...$  for armazenada nessa tabela segundo a função $f(x) = x \\, mod \\, 4$, como se dará a distribuição dos elementos pelas posições da tabela, à medida que o número de entradas cresce?");
		questaoAlternativa28.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa28.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa28.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
		questaoAlternativa28.setAlternativaCorreta("e");
		questaoAlternativa28
				.setAlternativasA("Cada posição da tabela receberá aproximadamente o mesmo número de elementos");
		questaoAlternativa28.setAlternativasB(
				"Três posições da tabela receberão, cada uma, aproximadamente um terço dos elementos");
		questaoAlternativa28.setAlternativasC(
				"Uma única porsição da tabela receberá todos os elementos, e as demais posições permanecerão vazias");
		questaoAlternativa28.setAlternativasD(
				"Todas as posições da tebela receberão elementos, mas as duas primeiras receberão, cada uma, o dobro das outras");
		questaoAlternativa28.setAlternativasE(
				"As duas primeiras posições da tabela receberão, cada uma,aproximadamente a metade dos elementos, e as demais posições permanecerão vazias");
		questaoAlternativa28.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa29 = new QuestaoAlternativa();
		questaoAlternativa29.setId(INICIOQUESTAO.longValue());
		questaoAlternativa29.setAno(ANO);
		questaoAlternativa29.setDescricao(
				"Qual das seguintes afirmaçoes sobre crescimento assintótico de funções não é verdadeira:");
		questaoAlternativa29.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa29.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa29.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa29.setAlternativaCorreta("b");
		questaoAlternativa29.setAlternativasA("$2n^2 + 3n + 1 = O(n^2)$");
		questaoAlternativa29.setAlternativasB("Se $f(n) = O(g(n))$ então $g(n) = O(f(n))$");
		questaoAlternativa29.setAlternativasC("$\\log_{}{n^2} = O(\\log_{}{n})$");
		questaoAlternativa29.setAlternativasD("Se $f(n) = O(g(n))$ e $g(n) = O(h(n))$ então $f(n) = O(h(n))$");
		questaoAlternativa29.setAlternativasE("$2^n+1 = O(2^n)$");
		questaoAlternativa29.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa30 = new QuestaoAlternativa();
		questaoAlternativa30.setId(INICIOQUESTAO.longValue());
		questaoAlternativa30.setAno(ANO);
		questaoAlternativa30
				.setDescricao("Consider um problema em que são dados 5 objetos com os seguintes pesos e valores: \r\n"
						+ "\r\n" + "pesos($W_1, W_2, W_3, W_4, W_5$) = (6, 10, 9, 5, 12) \r\n"
						+ "valores ($P_1, P_2, P_3, P_4, P_5$) = (8, 5, 10, 15, 7). \r\n" + "\r\n"
						+ "Além disso, é dada uma mochila que suporta até 30 unidades de peso, para transportar os objetos. O objetivo do problema é preencher a mochila de tal forma que o valor total dos objetos a serem transportados seja o maior possível, mas sem exceder o limite de peso suportado pela mochila. Assuma que é permitido colocar fração de um objeto na mochila. Qual das seguintes alternativas corresponde ao valor máximo obtido no preenchimento da mochila:");
		questaoAlternativa30.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa30.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa30.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa30.setAlternativaCorreta("d");
		questaoAlternativa30.setAlternativasA("12.2");
		questaoAlternativa30.setAlternativasB("21.5");
		questaoAlternativa30.setAlternativasC("30.34");
		questaoAlternativa30.setAlternativasD("38.83");
		questaoAlternativa30.setAlternativasE("43.1");
		questaoAlternativa30.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa31 = new QuestaoAlternativa();
		questaoAlternativa31.setId(INICIOQUESTAO.longValue());
		questaoAlternativa31.setAno(ANO);
		questaoAlternativa31.setDescricao(
				"Considere o algoritmo da busca sequencial de um elemento em um conjunto com $n$ elementos. A expressão que representa o tempo médio de execução desse algoritmo para uma busca bem sucedida é:");
		questaoAlternativa31.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa31.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa31.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa31.setAlternativaCorreta("d");
		questaoAlternativa31.setAlternativasA("$n^2$");
		questaoAlternativa31.setAlternativasB("$n(n+1)/2$");
		questaoAlternativa31.setAlternativasC("$\\log_{2}{n}$");
		questaoAlternativa31.setAlternativasD("$(n + 1)/2$");
		questaoAlternativa31.setAlternativasE("$n \\log_{}{n}$");
		questaoAlternativa31.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa32 = new QuestaoAlternativa();
		questaoAlternativa32.setId(INICIOQUESTAO.longValue());
		questaoAlternativa32.setAno(ANO);
		questaoAlternativa32.setDescricao(
				"Quais dos algoritmos de ordenação abaixo possuem tempo no pior caso e tempo médio de execução proporcional a $O\\left(n \\log_{}{n}\\right)$");
		questaoAlternativa32.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa32.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa32.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
		questaoAlternativa32.setAlternativaCorreta("e");
		questaoAlternativa32.setAlternativasA("Bubble sort e Quick sort");
		questaoAlternativa32.setAlternativasB("Quick sort e merge sort");
		questaoAlternativa32.setAlternativasC("Merge sort e bubble sort");
		questaoAlternativa32.setAlternativasD("Heap sort e selection sort");
		questaoAlternativa32.setAlternativasE("Merge sort e heap sort");
		questaoAlternativa32.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa33 = new QuestaoAlternativa();
		questaoAlternativa33.setId(INICIOQUESTAO.longValue());
		questaoAlternativa33.setAno(ANO);
		questaoAlternativa33.setDescricao(
				"Professor Mac Sperto propôs o seguinte algoritmo de ordenação, chamado de Super Merge, similar ao merge sort: divida o vetor em 4 partes do mesmo tamanho (ao invés de 2, como é feito no merge sort). Ordene recursivamente cada uma das partes e depois intercale-as por um procedimento semelhante ao procedimento de intercalaçao do merge sort. Qual das alternativas abaixo é verdadeira?");
		questaoAlternativa33.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa33.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa33.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
		questaoAlternativa33.setAlternativaCorreta("b");
		questaoAlternativa33
				.setAlternativasA("Super Merge não está correto. Não é possível ordenar quebrado o vetor em 4 partes");
		questaoAlternativa33.setAlternativasB("Super Merge está correto, mas consome tempo O(merge sort)");
		questaoAlternativa33.setAlternativasC("Super Merge está correto, mas consome tempo maior que O(merge sort)");
		questaoAlternativa33.setAlternativasD("Super Merge está correto, mas consome tempo menor que O(merge sort)");
		questaoAlternativa33.setAlternativasE("Nenhuma das alternativas acima está correta");
		questaoAlternativa33.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa34 = new QuestaoAlternativa();
		questaoAlternativa34.setId(INICIOQUESTAO.longValue());
		questaoAlternativa34.setAno(ANO);
		questaoAlternativa34.setDescricao(
				"No que diz respeito as vantagens da arquitetura de micro-núcleo para sistemas operacionais em relação a arquiteturas de núcleo monolítico, quais das seguintes afirmações são verdadeiras? \r\n"
						+ "$\\newline$I - A arquitetura de micro-núcleo facilita a depuração do SO. \r\n"
						+ "$\\newline$II - A arquitetura de micro-núcleo permite um número menor de mudanças de contexto \r\n"
						+ "$\\newline$III - A arquitetura de micro-núcleo facilita a reconfiguração de serviço do SO pois a maioria deles reside em espaço de usuário.");
		questaoAlternativa34.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa34.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa34.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
		questaoAlternativa34.setAlternativaCorreta("c");
		questaoAlternativa34.setAlternativasA("Apenas I");
		questaoAlternativa34.setAlternativasB("II e III");
		questaoAlternativa34.setAlternativasC("I e III");
		questaoAlternativa34.setAlternativasD("I e II");
		questaoAlternativa34.setAlternativasE("Todas são verdadeiras");
		questaoAlternativa34.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa35 = new QuestaoAlternativa();
		questaoAlternativa35.setId(INICIOQUESTAO.longValue());
		questaoAlternativa35.setAno(ANO);
		questaoAlternativa35.setDescricao(
				"Considere um sistema distribuído onde cada nó precisa obter um bloqueio(lock) antes de acessar qualquer serviço no sistema. Qual das estrtégias a seguir não será eficaz para evitar impasses (deadlocks)?");
		questaoAlternativa35.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa35.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa35.setDisciplina(EDisciplina.SISTEMAS_DISTRIBUIDOS);
		questaoAlternativa35.setAlternativaCorreta("a");
		questaoAlternativa35
				.setAlternativasA("Associar prioridades aos nós e criar filhos de prioridades para cada serviço");
		questaoAlternativa35.setAlternativasB(
				"Numerar os serviços e exigir que cada nó solicite os bloqueios dos serviços em ordem crescente");
		questaoAlternativa35.setAlternativasC(
				"Instalar um serviço de detecção de impasses no sistema distribuído e reiniciar os nós que atinjam um impasse");
		questaoAlternativa35.setAlternativasD(
				"Fazer com que cada nó reinicie sua execução se um pedido de bloqueio não é concedido após um longo tempo de espera. O pedido de bloqueio é reenviado após um tempo aleatório");
		questaoAlternativa35.setAlternativasE(
				"Forçar cada nó a obter todos os bloqueios de que necessita no início de su execução e reiniciar a execução se algum bloqueio não é concedido");
		questaoAlternativa35.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa36 = new QuestaoAlternativa();
		questaoAlternativa36.setId(INICIOQUESTAO.longValue());
		questaoAlternativa36.setAno(ANO);
		questaoAlternativa36.setDescricao(
				"Uma árvore binária é declarada em C, conforme a imagem abaixo, onde $esq$ e $dir$ representam ligações para os filhos esquerdo e direito de um nó da árvore, respectvamente. Qual das seguintes alternativas é uma implementação correta da operação que inverte as posições dos filhos esquerdo e direito de um nó $p$ da árvore, onde $t$ é um apontador auxiliar.");
		questaoAlternativa36.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa36.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa36.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
		questaoAlternativa36.setAlternativaCorreta("e");
		questaoAlternativa36.setAlternativasA("t = p;" + "$\\newline$p->esq = p->dir;" + "$\\newline$p->dir = p->esq");
		questaoAlternativa36.setAlternativasB("p->dir = t;" + "$\\newline$p->esq = p->dir;" + "$\\newline$p->dir = t");
		questaoAlternativa36.setAlternativasC("p->esq = p->dir;" + "$\\newline$t = p->esq;" + "$\\newline$p->dir = t");
		questaoAlternativa36.setAlternativasD("t = p->dir;" + "$\\newline$p->esq = p->dir;" + "$\\newline$p->dir = t");
		questaoAlternativa36.setAlternativasE("t = p->dir;" + "$\\newline$p->dir = p-esq;" + "$\\newline$p->esq = t");
		questaoAlternativa36.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa37 = new QuestaoAlternativa();
		questaoAlternativa37.setId(INICIOQUESTAO.longValue());
		questaoAlternativa37.setAno(ANO);
		questaoAlternativa37.setDescricao(
				"No programa abaixo, escrito em Pascal, os parâmetros do procedimento vr são passados por valor, conforme a imagem abaixo"
						+ "O valor de x impresso na última linha do programa é:");
		questaoAlternativa37.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa37.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa37.setDisciplina(EDisciplina.PROGRAMACAO);
		questaoAlternativa37.setAlternativaCorreta("e");
		questaoAlternativa37.setImagem(true);
		questaoAlternativa37.setImagemQuestao(
				"iVBORw0KGgoAAAANSUhEUgAAARYAAAFBCAYAAACyxoAAAAAgAElEQVR4Ae2dC5xPZf7HvzMNBjPDuIwZJLeEGYx1yWVyjXIpLP3ZotWuDWlat9KFMi61VkJJ/FmV2FbaUEj+Vsh1l0aLXAb7JxuKlFtYPP/X5/l3Tud35ned+f1+87t8ntfrvM5zv7yf33znnOec83lilFJK6EiABEjAjwRi/VgXqyIBEiABTYCGhT8EEiABvxOgYfE7UlZIAiRAw8LfAAmQgN8J0LD4HSkrJAESoGHhb4AESMDvBGhY/I6UFZIACdCw8DdAAiTgdwI0LH5HygpJgARoWPgbIAES8DsBGha/I2WFJEACNCxF9Bs4ePCg1K9fP2CtB7r+gHWcFUcEgbiIGEWYDeLUqVOyf/9+OX/+vOTl5eneJycnS4UKFfwykkDX75dOspLIJoCvm4PhmjdvrmrXrq0ee+wxVa5cOVWyZEk1ZswYde3aNbP5jIwMVatWLdWoUSO1atUqVaNGDRUTE6NatWpl5rlx44YaPXq0SkhI0Mfw4cMV4gw3btw4XXdiYqLq0qWL9t92221GsvLUxj//+U/dBxFRZcuWVRMnTnSov27duqpx48aqatWqqnz58rov8fHx6s4771TXr18323HnwRhRNi4uTqWmpuqjX79+DkVefvll3T7y3HvvverixYsO6QsXLlQVK1bUfGrWrKmefvppM92b+pHZUxvIM2rUKNW1a1ezbnpIwBsC4k0mf+TJzc3Vf5Dp6elq586datu2bSotLU3NnTvXrP7AgQNqyZIlKjY2ViUnJ6u1a9eqffv2qSFDhph5/vjHP6p69eqp48eP66Nhw4ZqwoQJOn358uW6TrS1adMmbVSWLVum3nrrLbO8pzaQv0ePHurmzZvqyy+/VBUqVFArV640yy9dulT/Ma9Zs0YNHDhQG6GDBw+qO+64Q6Fub92uXbuU1eBZyy1atEhVr15d13flyhXdTs+ePa1ZVKVKlRTahWH+1a9+pQ2cNYO7+pHPmzaQb9q0aSo7O9taNf0k4JFA0AwLetK+fXs1a9Yss1OvvfaagmGwut27d+s/XFyxOHOVK1dWH374oZkEP+LgcnJyVP/+/c20rKws9fbbb5thw+OpDeQ7e/asev/991WzZs3USy+9ZBRV+IPFFRccrhIGDx6s/Z06ddJpZkYPHnd/+C1atFDz5883a4AhxhWa1TVp0kSNHDlSbdiwQW3evFlt3LjRmqz74spwIaM3bThUyAAJ+EAg6Iu3iYmJ5r3lfffdJ3v27DHDhueWW26RDh06GEGH88mTJ6VGjRpmHPyIg6tatark5ubKpUuX5LvvvtPrGIhz5ly1gfKZmZnSsWNHWbt2ra7LXh7rIYaz+o24wp6xRjJo0CCJiYnRR9OmTeX69esO1b733nsSGxsrY8eOlU6dOumxOmTwEPCmDQ9VMJkEXBIIumG5efOm2ZlvvvlGSpUqZYYND/6g4uPjjaDDOS0tTRsPIxKGCXFwderUkQMHDkjNmjWldu3aAsPVpk0bI6vD2VUbv/71r6V///7y+eefy9y5cwP65Mbo0MWLF6Vdu3ZGUKpXry4zZszA1aQ+YFTWrVtnpsPTq1cvycnJkc8++0wblRdeeMEh3Rqw1480b9qw1kE/CfhCIOiGBVcBhvvDH/4gDz74oBH06jx69Gh59tln5ciRI/p4/vnnZciQIbrssWPHZMCAAfLxxx/Lhg0b5M0335S4ON8efOGK6l//+pe+QkAbMDAI//vf//aqf95mKlOmjHz77bdy9OhRWbhwoT4bZSdNmiQ4VqxYoaNmzZol3bt3N5L1GQYVhuU///mPHD9+XIoVK+aQ7q5+ZPSmDeTDFVHPnj0d6maABDwS8OG2qdBZscZSvHhx1adPH9W5c2dVrVo1dezYMbPeOnXq6EVbLN7iiQcWdy9fvmymGx6seWDxEgee2hgOC8KoH09+cLRs2VLhKZG1Dk9tYLEYazN4KtS6dWtdvlu3buruu+/WzWA9B09qnnzySb1wW6pUKTV58mRVokQJc63H6I+n8/jx4/V6EtaZtm/f7pAdC9GZmZm6H+gP1lGsDk+CwBBPzfAUDYvVdueufuT11AbyzJw5U4/NXjfDJOCOQAwSPVofP2XAuskDDzwgZ86c0TU+8cQTgv+s/nJ9+vSRunXrytChQ3WV+/bt0/+Z27dvr/+7+6udaKpn+/btmifWnuhIwFsCvt0neFurm3ylS5c2//DdZCtQ0gcffCBYTzDWbapUqSI3btyQqVOnFqg+FhK93vTqq68SBQn4RCBohuXs2bNy9epV+f777+XatWtSvHhxnzrqTWZcsTz++OMycuRIqVy5suC19ilTpsj999/vTXHmcULg8OHDTmIZRQLuCQTtVgh/6HjECTdnzhx59NFH3fesAKl4RR5GZdmyZXLu3Dn9tGjYsGHyzDPP6Me2BaiSRUiABApAIGiGpQB9YxESIIEwJRD0x81hyondJgES8IEADYsPsJiVBEjAOwI0LN5xYi4SIAEfCNCw+ACLWUmABLwjQMPiHaeA5MLHk+np6foxfEAaYKUkUEQEaFiKCDyaLVu2rODdm4K800PpySKcODbtkUDQXpDz2JMozFCyZMkCfWpA6cko/LGE2ZCDesUC7RRoiCQlJWkNFbxyjzDOcPhiF3IHkDSAzgm+wLXKLDRo0ECnQy9l9erVWh4B5Vu3bu01dpSFFgsOyCIYfsgQeOPw9TPaTE1N1S/8lStXTofxAqDddenSRVq2bGmP1mFIOpQvX14qVqwoFy5ccMjTvHlzqVWrlv5qG99SoU289Ge4rKwsrddy+vRpLQsBaYjs7Gwj2TxPmzZNc8SXz+gLdGqsDl+G4/MHzEfXrl21H3IKhnNX3pe5wBfp3bp1M6rlORoIuPtC0d9pFy5c0NqwH330ka4a6mf4sveHH37QYU+ykJ5kJb3pL7Rjp06dqpXhzpw5o2UuFyxY4PAFtLt6UOb2229XxhggW4mvkBFvdwMGDFC9evWyR+vw6dOn1dGjR1Xp0qXVuXPnHPJAchISng0aNFB5eXlq+vTpCopxVudOgQ75PElPepLx9FTel7mgvKV15qLDH1RpSiB95plntIg2/BDTRtjuXMlCIp83spL2+pyFIYUA7dwHH3zQWbLbuBEjRqixY8fqPDg/99xzbvO7S4Tot92wID8kMWHw4Pbu3atSUlIcqvFkWDxJT3qS8fRUHp3x11w4DIyBiCAQ1FshXAH27dtX1q9fry8Gt2zZoi/BjStDb2QhkdeVrKRRjzfncePGabW5CRMmeJPdIQ++P3r33Xf1l9MYyz333OOQ7q9ApUqVClyVJ+lJTzKensobHfPHXBh18Rw5BIJuWBo1aqTV0qAkB4U2rBcYzltZSFeykkY9ns5Yt8GaxODBg/VaBaQVfHFY/8C6BcaAdY677rrLl+J+z1sQ6UlPMp7eSlcWdi78DoMVhgSBoBsWjLpz5876aYhdjzZYspDjx4/Xmq+QfMQjXywS2x3kLtu2bWuPNsOQwIQuLRZaXbkxY8YIrm4C4QorPelJxtNb6UpvxkZ5S28oRVieorih+/TTT7WkIhYQrc6TLKQnWUlrXa78kHSEtCS20zh06JCWwIScJWQwrW727NkKG5G5clhghSzk4sWLXWVRbdu21YuwzjKgH9hGxNhDCes9hoOsJvqYlJSk5s2bpzc0Qz7EW11hpCe9kfF0J13py1xQ3tI6a9Hhp2yCi38Uu3fvloceekggb+nMYXuRatWqiaudBpyVCaW4YMp4Ut4ylGY+OH3hC3IuOEN1bt68eflSf/zxR714vHXrVsF+P4YMZr6MIR4RTBlPbKdCecsQ/0H4uXs0LC6AYksNZ6537976Jb3NmzfrrTGc5QmHuGDKeFLeMhx+Ef7tY5Es3vp3CMGtDW/5vvHGG9KqVSvp0aNHcBv3Y2vz58/XbwxjgbpChQr6myUsqo8YMcKPrbCqaCXANZZonXmOmwQCSIBXLAGEy6pJIFoJ0LBE68xz3CQQQAI0LAGEy6pJIFoJ0LBE68xz3CQQQAI0LAGEy6pJIFoJ0LBE68xz3CQQQAI0LAGEy6pJIFoJ0LBE68xz3CQQQAI0LAGEy6pJIFoJ0LBE68xz3CQQQAI0LAGEy6pJIFoJ0LBE68xz3CQQQAI0LAGEy6pJIFoJ0LBE68xz3CQQQAI0LAGEy6pJIFoJ0LBE68xz3CQQQAI0LAGEy6pJIFoJ0LBE68xz3CQQQAI0LAGEy6pJIFoJ0LBE68xz3CQQQAI0LAGEy6pJIFoJ0LBE68xz3CQQQAI0LAGEy6pJIFoJ0LBE68wXwbinT58uVatWLYKW2aQ3BOrWrSsvvviiN1k95qFh8YgosBkWLVokSUlJUr9+/cA2VMS1z549W958803ZsWNHEfekYM2fPHlS0tPT5erVqwWrIAxKbdy4UZYsWSLTpk0rfG8VXZET2Lhxo6pRo0aR9yNQHThw4ICqVKmS2r17d6CaCHi9ly9fVs8//7y6efNmgdoCg3r16hWobDALoZ9JSUkK58I4XrEU3jYXqIbr16/LypUr9RHJ/wUB55133pGWLVtKo0aNCsQqFAqVLFlScnJyJCYmxufunDp1Svbv3y/nz5+XvLw8fZw5c8bneoJR4I477pBu3boJrjAL5QpjlUKtbPPmzVXt2rXVY489psqVK6dKliypxowZo65du2Z2NSMjQ9WqVUs1atRIrVq1Sl8pxMTEqFatWpl5bty4oUaPHq0SEhL0MXz4cIU4w8E/a9Ys/V8YZcuWLateeOEFI1mfX375ZR0fFxen7r33XnXx4kUz/dy5c6p9+/a6H02bNlVVq1Z1uGKpXLmyQr1/+9vf1CeffKL9t912m1nemzEgs7s+mJW58FSvXl23m5iYqL7++mtl9AlnOG/7gLwos3jx4nwtGXW6Gme+ArYIT320ZscctGjRwhrltb979+7691ShQgV1/vx5h3LNmjVTNWvWVIMHD9b/6fGb+eCDDxzy4PdWvnx5hd9CamqqPvr16+eQx9NcjRs3Tv+eMR9dunTRfutvApW5q8OX+frrX/+q58yhg5bAqFGjVNeuXS0x+b2SPyp8Y3Jzc1Xjxo1Venq62rlzp9q2bZtKS0tTc+fONQeFS7wlS5ao2NhYlZycrNauXav27dunhgwZYub54x//qC9bjx8/rnA0bNhQTZgwwUx/55139I9ow4YNOg5/ND179jTTFy1apPCjR1tXrlxRAwcOdEh/+umnVadOndR//vMfXWbYsGEOhgVlYHBWr16tL7137dqljZjRgDdj8NQHoy5X5wsXLqg777xTffTRRzoLxgoOP/zwgw570wejbrAGY7vzNE57fnvYUx+t+QcMGKB69epljfLaf/r0aXX06FFVunRphX8KVnfw4EH9e2vQoIHKy8tT06dPV02aNLFm0X7Mod0QGJk8zdXy5cv17xi/702bNmmjsmzZMvXWW28ZVShPdfgyX5grzJkrN23aNJWdne0qWcdHlGHBiHAlgKsJw7322mv6D8II44x7fVwR4IrFmcN/0g8//NBMgt/4T43IunXrqldeecVMt3vwn3H+/PlmNIwc/pMZLiUlRa1cudIIKmdrLLj6gmGBw0RjjcLqPI3BUx+sdbnyP/PMM/qKD+m48kPY6jz1wcjryrAg3dM4jTpcnT310VW5gsTjasFuWFAPrloWLFigq9y7d6/C/NqdO8Piaa5ycnJU//79zSqzsrLU22+/bYbh8VQH8ng7X54Mi0PDLgIRucaSmJho3h7ed999smfPHjNseG655Rbp0KGDEXQ44wlAjRo1zDj4EWe4gwcPStu2bY1gvjPuqQcNGqTvx3FP3rRpU8GaiuG+/fZbwaO9wjp3Y/DUB2/a7tu3r6xfv15n3bJli3Tt2jVfMXd9MDKnpqbK7t27jaBfz9700a8NuqisUqVKLlI8R3uaKzyiz83NlUuXLsl3332n12vsj+091WH0wpv5OnDggGDOCuMi0rDcvHnTZPLNN99IqVKlzLDhwR98fHy8EXQ4p6Wl6Yk0ImGYEGe4atWqCf7QDHflyhWHcPXq1WXGjBm4GtQHjMq6deuM7NK6dWtZunSpGd65c6fpd+a5cOGCs2htuFyNwVMfnFZoi8Ri69GjR2Xt2rVy5MgRycrKsuUQt30wMj/yyCMO4zXi7WdX47Tns4a96aM1fyj4L168KO3atTO74mmu6tSpI/hjr1mzptSuXVvwz7JNmzZmeXg81WFkdve7N/K8//770qdPHyNYsLOLK5mwjcat0K9+9Suz/7/85S/V7373OzMMDy4JixUr5hBnDeA2Bwuqhw8f1gcWhK1rLO+++65eY8HaytWrV9WUKVNUlSpVzCo2b96ssNCHe2O4GTNm6IVcI8PChQv1rRXy4RIZt1k49u/fb2RR7dq1U1OnTlXfffeduv/++/XiH+7zDedpDJ76YNTj6QyWWNju27dvvqye+mAUwP29q8fNnsZp1IHF0TZt2hhBh7O7PhoZn3rqKb2ob4QLcnZ3K2TcVru6FcJvqVSpUurIkSPq9ddfV7feeqvZBU9zhfUTrNPht/LFF1+Y5aweT3Ugrzfzhbny9Lj5ueeeUz169LA2n88fkWssxYsXV3369FGdO3dW1apVU8eOHTMHXqdOHb1oi/v+ihUr6kUxvKNgdy+99JL+Y8AfxMSJE+3JCgu4WGvBWk3Lli3Vjh07HPLAqGRmZioRUbgnxsRbHYwRnlyhf5MnT9aLub179zazYH0F9+r4MeKPqmPHjgpGEs7bMXjqg9mYG8+nn36qx2gYSSOrt30w8uOPCQucJ06cMKL02d04rRlnz56t4uPjrVGm31UfzQxKqbZt2+pFVmuct3489cFc4TeDBX/r+yh42oKnPfhjnDdvnn7ig3yIt7vx48drllgE3759u0Oyu7nCQwj8plEnDvze8JTI/rt1V4c383Xq1Cm9HomnS+7czJkzVYkSJdxlUTFILdi1TmiWwrrJAw88IMZ7Ak888YSUKVMmNDsbZb3CK/14q/PEiRM+jxxrNA899JDs27fP57LhXgC3JViTGzp0qB4KGEyaNEnat2+v363x1/jQxsMPPyzPPvus2yq3b9+u+4J1H5fOrdkJw0TcCtlXzMNwGOyyjQBuHdasWWOLjY4groovXbrkMFhc6eG3XhQO7+UYt36u2o9zaXHCMOHs2bP6W47vv/9erl27JsWLFw/DUbDLzggcP37cWXRUxOGK5fHHH5eRI0dK5cqVBU8lp0yZIvfff3+RjP/w4cMe242oWyFAx2M3uDlz5sijjz7qEQAzkECoE8CnADAqy5Ytk3PnzuknlMOGDZNnnnmmQJ8YBGO8EWVYggGMbZAACXgmEJHvsXgeNnOQAAkEkgANSyDpsm4SiFICNCxROvEcNgkEkgANSyDpsm4SiFICNCwFnPhokCosIBoWIwGJKMOSkZGh31157733Aj61ZcuW1R9q8V2ZgKNmA2FIIKIMy969e/UXuPjaONCuMFKFge4b6yeBoiYQUYbFgHnjxg3529/+pvVk8Ym6vx0+Wy9fvrxUrFhRCvKpv7/7w/pIINQIRKRhGT9+vPz+97+X0aNHS4sWLRxEmjAB+BAuOTlZihUrJl26dNECOtaJef7557WGC7blgLgR9Fygd2G4P/3pTwINlR9//FFgxKyuefPmUqtWLRkyZIj++BGiU3hjko4EoolARBoWiODgtgjiOHjN/6WXXjLndPHixTJr1izBF5q4moFSVv/+/c30FStWyPz582Xr1q2yatUq2bBhg/z5z392+Io0JSVFK8zFxubHh32CcJuE8rt27ZKJEyfK5MmTzfrpIYFoIJD/LyMCRt2pUydzFGPHjpUFCxaYYRgVxGGbgxIlSuiPu6zqbl988YV07NhRMjMz5a677pImTZrobRt+/etfm3W480DtC1c4I0aM0Gpf6MtXX33lrgjTSCDiCESkYbHO0q233iqXL182ozxpg3qjL2pW5sZTGA1UN9UyiQTCgkBEGpavv/7ahL9mzRqH7Us9aYN6oy9qVk4PCZCAUwIRpcdijBBrJJ07d9ZPbLDJ9dSpU40krbzVs2dPvRjbo0cPvd6CxV58jg537NgxGTBggGRnZ0tcXJw0bNjQLGt4sDgLzReopkPgGOs0X375pZHMMwmQgCsFqHCNh64odmqDRimOOXPm5BuKO21Qb/VF81X6U4QvGqiu6mA8CYQ7Aeqx2P63BEtf1NYsgyQQUQQi8laoMDP0wQcf6MfQxl5EVapU0e+qWG+nClM/y5JANBCIyMXbwkycoS+K92Cw69y2bdu0vmj37t0LUy3LkkBUEaBhsU03Fn7x4hu2UK1QoYL+0BALwXgvhY4ESMA7Alxj8Y4Tc5EACfhAgFcsPsBiVhIgAe8I0LB4x4m5SIAEfCBAw+IDLGYlARLwjgANi3ecmIsESMAHAjQsPsDyV9arV6/qne0gb4nPAbAJN+LoSCBSCNCwFMFM4tukv//971oz5sMPP5SPPvpIRo0a5bQn6enpTuMZSQKhTICGpQhm569//av+yBESDVCcgyLdwoULHXqyZcsWHTY+jtyxY4dDOgMkEMoEaFhss4NX+PGC3Pr162Xt2rXab5WltGaHrGXLli2tUdrfoEEDXQ71GAeMiOFeeOEFad26tRHUL+LZtXnx5fWrr76q8+B8zz33mPl96SPkObt162aWpYcEgkGA3wrZKB89elQr/WPN495779XattC9deYgpg0ZSrv7y1/+oj8HsMaXK1fODD700EOmHx4YMWjzWh2uUPr27SunT5/WVzPQ2DWcL32ENOe1a9eMojyTQFAI0LDYMEOuElcZcDExMRIfH2/L8XPQfvvyc4r3vuPHj8uYMWMEWrveOl/6OHLkSG+rZT4S8BsBGha/ofy5on79+sm+fft+jhDRot4nTpxwiDt06JD+JukPf/iDvkqyJt55552C3QKghvfwww9L06ZNtbiUNQ/9JBCqBLjG4mFmCrJv0J49e+TmzZsOh92oQHEOax+TJk2S3/3ud/l6gSuYJ554Qsfj/Mknn+TLY0QUpI9GWZ5JIBAEaFicUIUWC6448EQG0pbXr1+Xf/3rX/ly4hZm2LBh+eI9RWBbEuwE8PTTT8tvf/tbrf9i/3raWNzF/kdwuIKxOm/7iB0JIMVJRwLBJMCvm53Q/vjjj2XgwIH6Dx76t4cPH9abj+ExsdW1a9dOzpw5o99HscZ78mdlZel9jcqUKaOz4uoG+rm+LLJ620c8UXrqqackGNvOeho306OHAA1LhM81NmYbOnSo5ObmRvhIObxQIsDF21CajQD0Bbs8Gu/DBKB6VkkCTgnwisUpFkaSAAkUhgAXbwtDj2VJgAScEqBhcYqFkSRAAoUhQMNSGHosSwIk4JQADYtTLIwkARIoDAEalsLQY1kSIAGnBGhYnGJhJAmQQGEI0LAUhh7LkgAJOCVAw+IUS2hEzp07V5577rnQ6Ax7QQI+EKBh8QFWsLPiq2V+uRxs6mzPHwRoWGwUMzMz5ZZbbtEHrhgMf69evWw5RQoqTemLtGS+RkWkRo0aWowqKSlJTp48KUZ9ONsdpSntRBgOBgF+K2SjDBHrN954Q9577z29IfzMmTPlySefFIg32V1BpSk9SUsOHz5cvvrqK8nLy5PLly/Lv//9b4G05bx583QXoPdy9913CyQR0tLS5M9//rPWbvnss8/sXdQCU758NZ2vAkaQQAEI0LDYoJUuXVrwX37Dhg1y1113SePGjeWRRx6x5fr/YEGlKX2RlnTWcEJCgnTo0EE2b94s3bt3F0goQDQKVzB2R2lKOxGGg0JA0TklsH37dhUTE6MOHz7sNN1dZEZGhi6L8sZRpUoVhyLNmzdXq1ev1nH79u1TlSpVckhHYOrUqSo7OztfPCJ2796tmjVrptOysrLUZ5995jQfI0mgKAhwjcWJ+YbwUnZ2tgwePFgGDRokN27ccJLLdZQ30pTW0gVZoG3UqJHglgpblBw5ciSfZq61fvpJINgEaFicEMdOhdhLaNasWYJtUKFL68wVVJoSdXkjLZmYmCg4XLnOnTtLTk6OtGnTxlUWvQ5DaUqXeJgQKAJFcZkUym3WrFlTxcXFqYSEBHXo0CFVsWJFVbx4cZWWlpav223btlXp6en54r2JwG1QSkqKKlWqlBo8eLDq2LGj+uUvf+lNUTPPp59+qm+1li9fbsbZPTNnzlQlSpSwRzNMAgElQKGnQFnsEKmX0pQhMhFR1g0+FYrwCac0ZYRPcIgOj1csITox7BYJhDMBLt6G8+yx7yQQogRoWEJ0YtgtEghnAjQs4Tx77DsJhCgBGpYQnRh2iwTCmQANSzjPHvtOAiFKgIYlRCeG3SKBcCZAwxLOs8e+k0CIEqBhCdGJ8aZbly5dkvr168uVK1e8yc48JBA0AjQsQUPt/4YmTJggBw8e9Pnra//3hDWSgCMBvtLvyCNsQk2bNpX4+Piw6S87Gl0EeMVim29DP3b9+vVa6yQ2NlZLKNiy6WBRad6icSjcrVq1ylm3HOKoeeuAg4EgEeAViw20Jz1aa/ZAad5CxOmf//yntSkpU6aMfP/992Yc5CmxxuLJVa5cWah564kS0/1NgIbFRtQXPdqi0ry1ddltkJq3bvEwMUAEaFgCABaK/vv27XOoGVcOJ06ccIhzFfjiiy9cJTGeBMKCAA2Lh2kqiB4tNG99cQVpw5f6mZcEgk2Ai7dOiHujR4tigda8ddI1n6Ow9xA1b33GxgKFJEDD4gTgU089JVOnTpWqVavqDcGwOyKertjdjh07ZOPGjfZor8LetuGqsv/6r/+SatWq6WScMzIynGZNSUmRNWvWOE1jJAkEigAV5AJFNkTqpeZtiExElHWDaywRPuHUvI3wCQ7R4fGKJUQnht0igXAmwDWWcJ499p0EQpQADUuITgy7RQLhTICGJd1iDywAABX6SURBVJxnj30ngRAlQMMSohPDbpFAOBOgYQnn2WPfSSBECdCwhOjEsFskEM4EaFjczN6iRYskKSlJyz+6ycYkEiABGwEaFhsQaxAvl61cuZKaslYo9JOAFwT45q0TSNevXze/r4E+Cx0JkIBvBCLyimXatGmSnJwsxYoVE8hHWpXWmjdvLrVq1ZIhQ4ZoVbbExERZtmyZSQ0qbZ07d5bhw4dLTk6O/OY3vzHT7B7KPtqJMEwC/08g4gzL4sWLZdasWYKP7y5evCipqamCWxrDYd2kZMmSsnXrVtm1a5dMnDhRJk+ebCTLlClTJC4uTg4cOCD/+Mc/pEePHmaa3QPxJhgpOhIgARsBFWGuRYsWav78+eaodu7cqRISEswwPM2aNVMLFizQcXv37lUpKSlmOvwrV640wxs3blQ1atQww/SQAAl4JhBxVyynTp2SQYMGSUxMjD6wTQbWTOyuUqVK9igd/vbbb6Vu3bpO0xhJAiTgHYGIMyzVq1eXGTNmiFJKHzAq69at846GiLRu3VqWLl1q5t+5c6fpp4cESMA7AhFnWCZNmiQ4VqxYoQlgvaV79+7e0RCRRx99VF577TXZsmWLfP7554KF4KtXr+o1F3sllH20E2GYBH4i4PluKfxyLF++XGVmZioRUVlZWWrz5s3mIDIyMlRcXJxKSkpS8+bNU6mpqSo2NlYh3nBTpkxR5cqVU9WqVVOTJ09WnTp1Ur179zaSzfPMmTNViRIlzDA9JEAC/0+AQk+F+BdD2cdCwGPRiCbAF+QKMb2UfSwEPBaNaAK8Yono6eXgSKBoCETc4m3RYGSrJEACVgI0LFYa9JMACfiFAA2LXzCyEhIgASsBGhYrDfpJgAT8QoCGxS8YWQkJkICVAA2LlQb9JEACfiFAw+IXjKyEBEjASoCGxUqDfhIgAb8QoGHxC0ZWQgIkYCVAw2KlQT8JkIBfCNCw+AUjKyEBErASoGGx0qCfBEjALwRoWPyCkZWQAAlYCdCwWGnQTwIk4BcCNCx+wchKSIAErARoWKw06CcBEvALARoWv2BkJSRAAlYCNCxWGvSTAAn4hQANi18wshISIAErARoWKw36SYAE/EKAhsUvGFkJCZCAlQANi5UG/SRAAn4hQMPiF4yshARIwEqAhsVKg34SIAG/EKBh8QtGVkICJGAlQMNipUE/CZCAXwgEzbBkZGRI8eLF5b333vNLx91VcvLkSUlPT5erV6+6y8Y0EiCBABEImmHZu3evZGVlyZUrVwI0lJ+rLVu2rPTp00cbsp9j6SMBEggWgaBuCt+hQwcZMGCAVKtWTX788Udp166dJCQkBGusbIcESCBIBIJ2xWKMZ/z48fL73/9eRo8eLS1atBDctljdtGnTJDk5WYoVKyZdunSRS5cuWZPl+eefl1KlSklSUpJ07dpV+6tXr27mue+++6R8+fJSsWJFuXDhghkPT/PmzaVWrVoyZMgQKVOmjCQmJsqyZcsc8jBAAiTgBwIqiK59+/aqf//+ZoudOnVS2dnZZnjRokWqevXq6sCBA+rKlStq4MCBqmfPnmb68uXLVVpamsrNzVWbNm1SJUuWVMuWLVNvvfWWmef06dPq6NGjqnTp0urcuXNmPDwHDx5U6enpqkGDBiovL09Nnz5dNWnSxCEPAyRAAoUnIIWvwvsaYFjefvtts8DGjRu1ATAiWrRooebPn28E1c6dO1VCQoIZzsnJcTBMWVlZDvWZGZVSiYmJ+QwL0ps1a6YWLFigs+7du1elpKRYi9FPAiTgBwJBvxWyXmTdeuutcvnyZTPq1KlTMmjQIImJidFH06ZN5fr162Z61apVJTc3V98efffdd7J//35BnK+uUqVKvhZhfhIgAR8IBN2wfP3112b31qxZI/Xr1zfDWCuZMWMGrqL0AaOybt06M71OnTpy4MABqVmzptSuXVuwntKmTRsznR4SIIHQIBAX7G7Mnz9fOnfurBdWX3zxRZk6darZhUmTJknPnj0FBqZHjx4ya9YswWLvuXPndJ5jx47pp0rZ2dkSFxcnDRs2NMvSQwIkEEIE/HA75XUV48ePV6NGjVLlypXTx5w5c/KVxQJtZmamEhGFNZTNmzebebZt26aKFy+uMjIy9NGyZUs1btw4dfnyZTNPzZo1dd2xsbEqOTlZ1atXz0xDubi4OJWUlKTmzZunUlNTFfIhno4ESMB/BIL6Hkth7Sleeqtbt64MHTpUV7Vv3z7BVU779u0lJyensNWzPAmQgJ8IBP1WqDD9/uCDD+TixYv63RXUU6VKFblx44bD7VRh6mdZEiAB/xAI+uJtYbqNK5bHH39c8HkAngpt27ZNpkyZIt27dy9MtSxLAiTgZwJhZViw8BsbGytt27aVChUq6O+BsBA8YsQIP2NhdSRAAoUhEFZrLIUZKMuSAAkEj0BYXbEEDwtbIgESKAwBGpbC0GNZEiABpwRoWJxiYSQJkEBhCNCwFIYey5IACTglQMPiFMv/Rz733HNyyy23yKZNm9zkYhIJkICdAA2LnchPYbzV+/rrr0uDBg3Mb5VcZGU0CZCAjQANiw2IERw2bJg8++yzkpaWZkTxTAIk4CWBsDIsmZmZ+tYEtydz5841/b169co3XMhatmzZMl88rkDwkp31sGu6vPPOO3L27FktoZmvAksE5DW7detmiaGXBEgABMLqW6EtW7bIG2+8obcQwev9M2fOlCeffFL69euXbzaheVuyZMl88X/5y1/05wDWhHLlyplBfCoAXd05c+ZIiRIlzHhnnsqVK8u1a9ecJTGOBKKaQFgZltKlS2sR7g0bNshdd90ljRs3lkceecTpBC5cuNBpvKdI6MO0atVK7rnnHk9ZZeTIkR7zMAMJRCOBsHylf8eOHfo2Jy8vT6vu+zJxuBXCwqzV4crjxIkTOgq3Wbg1wi4BcJDLxI4AUPWHFCYdCZCAZwJhZ1hu3ryptw1p0qSJlqmEdCWMgb8cjAf2PDIc1Op69+4td999NxXrDCg8k4AHAmG1eIuxQKoS0pWQrcSOhxB6cubGjBkjeLLjq6tXr5784he/MA9crWAvImcymGPHjtVSmr62wfwkEOkEwmqNBX/gx48fl/j4eDl69KhgMXf16tX6CZFVpBuThtulM2fOFHj+Dh06pG+3ICyFdqDFa1+3SUlJEQiC05EACTgSCLtbIcfuF21o+/btWiYTW5LQkQAJ/EwgrK5Yfu52aPj69+8vr776amh0hr0ggRAiwCuWEJoMdoUEIoVA2C3eRgp4joMEIpkADUskzy7HRgJFRICGpYjAs1kSiGQCNCyRPLscGwkUEQEaliICz2ZJIJIJ0LBE8uxybCRQRARoWIoIPJslgUgmQMNim92rV69qOQR8h5SamqpV5BBHRwIk4D0BvnlrY4WPHP/+97/r/aHx/dFvf/tbOX/+vP7o0ZaVQRIgARcE+OatDUydOnVk4sSJ0rdvX50CIwPJBBgXOhIgAe8IhNWtUGJiotaqxS0KBJggKQntWgg12V1BNW9feOEFad26tVkdNp/HF87OHDVvnVFhHAmEmebt//7v/2opg1deeUWvf0D0GpooEHuyu4Jq3j700EMOVa1fv14LSzlE/hSg5q0zKowjgTAzLOXLl5fu3btrrRWcIVsAlXzE251dO8We7k0Y2i8QjFqxYoXT7NS8dYqFkSQgosLMHT58WNWqVUtdv35dtWrVSm3atMmnEWRkZKiYmBiHo0qVKvnqOHjwoEpNTVX//d//nS+NESRAAu4JhN1TIajIQeh67dq1cvr0aa3W78s/iD179njM/uWXX0qPHj207CWeCtGRAAn4RiCsFm+NoQ0YMEBmzJghzZs3N6LynQuqeXvgwAHp2LGjPP300/pRMxZuR4wYka9+RFDz1ikWRpKAhOXjZujR1q1bVxYtWiQPPvig02ls166d1rzdu3ev03RXkVlZWXrtBtt9wGFXgEuXLjndmAzqcU899ZRcuXLFVXWMJ4GoJBCWhgW7FVarVk2++eYbKVWqVJFNHDVviww9Gw5xAmG1xoL9frCH0NatW6Vp06ZFalQwr9S8DfFfN7tXZATCyrBg47DatWvL5s2b9fpGkVH7qeHDhw8XdRfYPgmEJIGwWrzFG7HYFB57K+OpDR0JkEBoEgjLNZbQRMlekQAJGATC6orF6DTPJEACoU2AhiW054e9I4GwJEDDEpbTxk6TQGgTiHrDMn36dKlatWrQZwkv+L344otBb5cNkkAwCITV42Z/A5k9e7a8+eab+mtpf9ftqb6NGzdK586dpUSJEjJq1ChP2ZlOAmFFIGqfCh08eFDatm0rn3zyiTRq1KhIJg19wPdOUKm74447iqQPbJQEAkEgam+FIBLVsmXLIjMqmEwYE+jJ4MqJjgQiiUBYGZYaNWpoKcqkpCQ5efKkVKlSRYdxNlyDBg3027mZmZmyevVqqVmzps5jlZtEXtwCPfDAA0Yx84xy+GwAx9y5c01/r169zDzuPL7IZ6KePn36yPvvv++0SkpfOsXCyHAg4F6uJbRSL1y4oO6880710Ucf6Y5t2LBBNWzYUP3www9mRw8cOKCWLFmiYmNjVXJyslq7dq3at2+fGjJkiJkHHqQj3u4uXryopk6dqpo1a6bOnDmj6tWrpxYsWKAuX75sz+o0jDK333672ceVK1eqzMxMXZezAugD+uLMTZs2TWVnZztLYhwJhDSBsLpiSUhIkA4dOuhvhWC0P/74Y30rgSsYw+H2AodSSssqdOrUSerXr68/BTDyuDuXLl1acKWQkpKiRaQaN24sjzzyiJQsWdJdMTPNKp+JSHfymWYhFx5IX0KagY4Ewo1AWBkWwMW2HBC4htuyZYt07drVKXPcysAIuXJQ+t+9e7erZBk3bpxA9GnChAku87hKGDZsmLz77rty48YN3dd77rnHVVbdBvpCRwKRRCDsDAue4Bw9elRLUx45ckQgzOTMxcTESHx8vLMkHYerkKVLlzpNh7hTdna2DB48WAYNGqQNhNOMLiJ9kc/E+grWWehIIJIIhJ1hAXy8/5GTkyNt2rQp8FxA3nLbtm3yxRdf5KsDuyFWr15d736IrVYnTZqULw8ihgwZoh9ZO0v0Rj4Tj5tXrVoljz32mLMqKH3plAojw4JASK8Auejcp59+qlX2ly9fni9HnTp19KItFkQrVqyo0tLSXC68vv7666pBgwbqxIkTZj01a9ZUcXFxKiEhQR06dEjXUbx4cV2Pmeknz+zZs1V8fLw9Woeh8o/dABYvXuw0/dSpU3rh+eWXX3aajsiZM2eqEiVKuExnAgmEKoGw2/7D3yBfeeUV5Wz7D2/ayc3NVfXr13ea9ezZs6p06dLq0qVLTtPvuOMONXnyZKdpRuS2bdv0EyUjzDMJhAuBqH3z1h+Xk9DdnTdvnlgXZw35TGxP8vLLL8uGDRsK3BTU8vBUyNUCdYErZkESCDCBqP5WqLBssVOi3flTPpPSl3a6DIcLgbBcvA1luJTPDOXZYd+CRYC3QsEizXZIIIoI8IoliiabQyWBYBGgYQkWabZDAlFEgIYliiabQyWBYBGgYQkWabZDAlFEIGoNC/Rc0tPT5erVqyE/3QXR5aWmbshPa0R3MGoNC74Bwsd/xYsX9/sE448agk/+0LMtqC4vNHWXLFki06ZN8/v4WCEJeCLAx81OCOHjQCjGffnll05SvY964okndOaCaqoUVpeXmrrezxVz+pdAVF6x3HfffQJBpooVK8qFCxcciJ46dUr2798v58+fl7y8PH2cOXPGIU+wAoXV5aWmbrBmiu3YCYSVYYG+SmxsrDRs2FCPA2+5ImzVXfFG8/ZPf/qT7Ny5U/BdD8SYrA76LtBgOX36tJZlgDQDtFnsDrcYycnJUqxYMenSpYtcunTJnsVlGMr80GyB7EKZMmX0bdOyZcvy5feHLq87TV00SF3dfNgZ4Q8C4fK1JPr5/vvvq3bt2ilo38LhjDDiDeet5i3yJyYmqnPnzhlFzfOuXbvUbbfdZobtnkWLFqnq1asrtHXlyhU1cOBA1bNnT3s2rVfrTLMWkgrp6elasiEvL09Nnz5dNWnSJF95f+jyutPURYPU1c2HnRF+IBBWsgl79uzRQtU3b95U8OMM4Wr4rW737t1aC2XVqlXW6Hz+ghqWFi1aqPnz55v17dy5U+u3mBE/eWBUnBkWJEOsGyLdcHv37lUpKSk/lfr55MqwGDm6deumxb4ffPBBIyrf2ZNhyVeAESTgBwJhdSuE7T9w+7Jp0ybBLc///M//yFdffSWItztPmrf2/L6EsQ6D2yXIX+Jo2rSpXL9+3ZcqdN5KlSq5LeMPXV7o9lJT1y1mJgaAQFgZFijoYw8h7PeDXQwXLVokt99+uyDe7jxp3trzuwpfvHhR2rVr55AM2coZM2bonQCwGwCMyrp16xzy+CPgD11eaur6YyZYh68EwsqwYHDYgGzlypXSr18/vedyRkaGr2PWC6d4KoQFV9SH7UGsDguq3377rRbtXrhwoT5b06GBi2PFihU6etasWdK9e3drFr/4C6vL60lTF50cO3as9OzZ0y/9ZSUkYBLww+1UUKt46aWX9HoEFm4h7zhx4kSH9n3RvHUoaAuMHz9er9NgQ7Tt27fbUpWC3i42IhMRlZWVpTZv3mzmQb+gmQutXBzwI85wGRkZWlc3KSlJzZs3T6WmpupNyxBvdwXV5fVGUxdtUVfXTpxhfxDgC3KmiQ1dD17px+PtEydOeN1JvP378MMPy7PPPuu2DDZUGzp0qOTm5rrNx0QS8IUADYsvtCIwL3V1I3BSQ2BINCwhMAnsAglEGoGwW7yNtAngeEggEgnQsETirHJMJFDEBGhYingC2DwJRCIBGpZInFWOiQSKmAANSxFPAJsngUgkQMMSibPKMZFAERMIW8OC74SSkpLyvY5fxDzZPAmQgIiErWHp37+//mboypUrnEgSIIEQIxB2m8LjS+I1a9ZojBCrpiMBEgg9AkG/YnEn6ehJsvH777+Xzp07y/DhwyUnJ0d+85vfhB5R9ogESCC4t0KLFy8WSAzgwzfonECACLc0hsO6ScmSJWXr1q2ya9cumThxokyePNlIlilTpkhcXJxAvOgf//iH9OjRw0yjhwRIIIQI+OMTaW/r8EbS0Z1kI+QbV65caTa3ceNGVaNGDTNMDwmQQGgQCOqtkLeSjq4kGyG+BDkAOhIggdAmEFTDUlhJR2z3sXTpUpMotvCgIwESCD0CQTUshZV0fPTRR+W1116TLVu2yOeff67Fj7D3MtZc7O7uu++WX/ziF/ZohkmABIJBINh3ZO4kHb2RbJwyZYoqV66cqlatmpo8ebLq1KmT6t27d75hdOzYUTVu3DhfPCNIgAQCT4BCT8Gw3myDBKKMQFBvhaKMLYdLAlFLgIYlaqeeAyeBwBGgYQkcW9ZMAlFLgIYlaqeeAyeBwBGgYQkcW9ZMAlFLgIYlaqeeAyeBwBGgYQkcW9ZMAlFLgIYlaqeeAyeBwBH4P1QktE+LYlk1AAAAAElFTkSuQmCC");
		questaoAlternativa37.setAlternativasA("4");
		questaoAlternativa37.setAlternativasB("5");
		questaoAlternativa37.setAlternativasC("7");
		questaoAlternativa37.setAlternativasD("8");
		questaoAlternativa37.setAlternativasE("10");
		questaoAlternativa37.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa38 = new QuestaoAlternativa();
		questaoAlternativa38.setId(INICIOQUESTAO.longValue());
		questaoAlternativa38.setAno(ANO);
		questaoAlternativa38.setDescricao(
				"A função abaixo computa a soma dos n primeiros números inteiros não negativos, conforme a imagem abaixo. A parte que falta para completar a condição é:");
		questaoAlternativa38.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa38.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa38.setDisciplina(EDisciplina.PROGRAMACAO);
		questaoAlternativa38.setAlternativaCorreta("d");
		questaoAlternativa38.setImagem(true);
		questaoAlternativa38.setImagemQuestao(
				"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");
		questaoAlternativa38.setAlternativasA("while n<>0 sum:=sum + sum(n=1)");
		questaoAlternativa38.setAlternativasB("sum:=n + sum(n)");
		questaoAlternativa38.setAlternativasC("sum:=(n-1) + sum(n-1)");
		questaoAlternativa38.setAlternativasD("sum:=n + sum(n-1)");
		questaoAlternativa38.setAlternativasE("sum:=(n-1) + sum(n)");
		questaoAlternativa38.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa39 = new QuestaoAlternativa();
		questaoAlternativa39.setId(INICIOQUESTAO.longValue());
		questaoAlternativa39.setAno(ANO);
		questaoAlternativa39.setDescricao("O menor número possível de arestas em um grafo conexo com n vértices é:");
		questaoAlternativa39.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa39.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa39.setDisciplina(EDisciplina.GRAFOS);
		questaoAlternativa39.setAlternativaCorreta("c");
		questaoAlternativa39.setAlternativasA("$1$");
		questaoAlternativa39.setAlternativasB("$n/2$");
		questaoAlternativa39.setAlternativasC("$n-1$");
		questaoAlternativa39.setAlternativasD("$n$");
		questaoAlternativa39.setAlternativasE("$n^2$");
		questaoAlternativa39.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa40 = new QuestaoAlternativa();
		questaoAlternativa40.setId(INICIOQUESTAO.longValue());
		questaoAlternativa40.setAno(ANO);
		questaoAlternativa40.setDescricao(
				"Considere um grafo G satisfazendo as seguintes propriedades:  \r\n" + "$\\newline$• G é conexo\r\n"
						+ "$\\newline$• Se removermos qualquer aresta de G, o grafo obtido é desconexo.\r\n"
						+ "Então é correto afirmar que o grafo G é:");
		questaoAlternativa40.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa40.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa40.setDisciplina(EDisciplina.GRAFOS);
		questaoAlternativa40.setAlternativaCorreta("c");
		questaoAlternativa40.setAlternativasA("Um circuito");
		questaoAlternativa40.setAlternativasB("Não bipartido");
		questaoAlternativa40.setAlternativasC("Uma árvore");
		questaoAlternativa40.setAlternativasD("Hamiltoniano");
		questaoAlternativa40.setAlternativasE("Euleriano");
		questaoAlternativa40.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa41 = new QuestaoAlternativa();
		questaoAlternativa41.setId(INICIOQUESTAO.longValue());
		questaoAlternativa41.setAno(ANO);
		questaoAlternativa41
				.setDescricao("Supondo a Relação PROJ (PNO, Nome, Orçam), com chave primária PNO e a Relação\r\n"
						+ "DSG (ENO, PNO, Dur, Resp), com chave primária {ENO, PNO} e chave estrangeira PNO\r\n"
						+ "em relação a PROJ, a asserção abaixo NÃO expressa:\r\n" + "\r\n"
						+ "∀g ∈ DSG, ∃j ∈ PROJ : g.PNO = j.PNO");
		questaoAlternativa41.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa41.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa41.setDisciplina(EDisciplina.GRAFOS);
		questaoAlternativa41.setAlternativaCorreta("c");
		questaoAlternativa41.setAlternativasA("Uma restrição que define um estado consistente do banco de dados. ");
		questaoAlternativa41.setAlternativasB("Uma restrição a ser verificada na inserção de tuplas em DSG.");
		questaoAlternativa41.setAlternativasC("Uma restrição de integridade de chave primária em PROJ.");
		questaoAlternativa41.setAlternativasD("Uma restrição de integridade de chave estrangeira em DSG. ");
		questaoAlternativa41.setAlternativasE("Uma restrição a ser verificada na atualização de tuplas em DSG. ");
		questaoAlternativa41.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa42 = new QuestaoAlternativa();
		questaoAlternativa42.setId(INICIOQUESTAO.longValue());
		questaoAlternativa42.setAno(ANO);
		questaoAlternativa42.setDescricao(
				"Dentre as definições a seguir, ligadas ao conceito de normalização do modelo relacional, qual delas é INCORRETA?");
		questaoAlternativa42.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa42.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa42.setDisciplina(EDisciplina.BANCO_DE_DADOS);
		questaoAlternativa42.setAlternativaCorreta("d");
		questaoAlternativa42.setAlternativasA("As formas normais se baseiam em certas estruturas de dependências.");
		questaoAlternativa42.setAlternativasB(
				"A primeira forma normal estabelece que os atributos da relação contêm apenas valores atômicos. ");
		questaoAlternativa42.setAlternativasC(
				"A normalização é um processo passo a passo reversível de substituição de uma dada coleção de relações por sucessivas coleções de relações as quais possuem uma estrutura progressivamente mais simples e mais regular.");
		questaoAlternativa42
				.setAlternativasD("As relações que obedecem à primeira forma normal não apresentam anomalias.");
		questaoAlternativa42.setAlternativasE(
				"O objetivo da normalização é eliminar várias anomalias (ou aspectos indesejáveis) de uma relação.");
		questaoAlternativa42.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa43 = new QuestaoAlternativa();
		questaoAlternativa43.setId(INICIOQUESTAO.longValue());
		questaoAlternativa43.setAno(ANO);
		questaoAlternativa43.setDescricao(
				"Dentre as definições a seguir, ligadas ao conceito de visões do modelo relacional, qual delas é INCORRETA?");
		questaoAlternativa43.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa43.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa43.setDisciplina(EDisciplina.BANCO_DE_DADOS);
		questaoAlternativa43.setAlternativaCorreta("b");
		questaoAlternativa43.setAlternativasA(
				"Programas aplicativos do banco de dados podem ser executados sobre visões de relações da base de dados.");
		questaoAlternativa43.setAlternativasB("Uma visão relacional é uma relação virtual que nunca é materializada.");
		questaoAlternativa43.setAlternativasC(
				"Uma visão relacional é uma relação virtual, derivada de relações base a partir da especificação de operações da álgebra relacional. ");
		questaoAlternativa43.setAlternativasD(
				"Uma visão é útil por representar uma percepção particular do banco de dados, compartilhado por muitos aplicativos.");
		questaoAlternativa43.setAlternativasE(
				"O gerenciamento de visões envolve a conversão da consulta do usuário sobre as visões para a consulta sobre as relações base.");
		questaoAlternativa43.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa44 = new QuestaoAlternativa();
		questaoAlternativa44.setId(INICIOQUESTAO.longValue());
		questaoAlternativa44.setAno(ANO);
		questaoAlternativa44
				.setDescricao("Supondo a Relação PROJ (PNO, Orçam), com chave primária PNO, a Relação EMP\r\n"
						+ "(ENO, ENome, Cargo) com chave primária ENO, e a Relação DSG (ENO, PNO, Dur,\r\n"
						+ "Resp), com chave primária {ENO, PNO}, chave estrangeira PNO em relação a PROJ e\r\n"
						+ "chave estrangeira ENO em relação a EMP. Qual das expressões da álgebra relacional\r\n"
						+ "abaixo NÃO corresponde à seguinte consulta SQL:\r\n" + "\r\n" + "\r\n"
						+ "SELECT ENome FROM EMP, PROJ, DSG WHERE EMP.ENO = DSG.ENO AND PROJ.PNO = DSG.PNO AND Dur > 36");

		questaoAlternativa44.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa44.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa44.setDisciplina(EDisciplina.BANCO_DE_DADOS);
		questaoAlternativa44.setAlternativaCorreta("e");
		questaoAlternativa44.setAlternativasA(
				"$\\pi_{ENome} (PROJ \\bowtie_{PNO} ( EMP \\bowtie_{ENO} \\sigma_{ Dur} > 36 (DSG)))$");
		questaoAlternativa44.setAlternativasB(
				"$\\pi_{ENome} (PROJ \\bowtie_{PNO} ((\\pi_{ENome, ENO} (EMP)) \\bowtie_{ENO} ( \\sigma_{Dur} > 36 (DSG)))$");
		questaoAlternativa44.setAlternativasC(
				"$\\pi_{ENome} (PROJ \\bowtie_{PNO} (\\sigma_{Dur > 36} (EMP \\bowtie_{ENO} (DSG) ))) $");
		questaoAlternativa44.setAlternativasD(
				"$\\pi_{ENome} (\\sigma_{Dur > 36} ((\\pi_{ PNO} (PROJ))\\bowtie_{PNO} ( EMP\\bowtie_{ENO} DSG))) $");
		questaoAlternativa44.setAlternativasE(
				"$\\pi_{ENome} (PROJ \\bowtie_{PNO} ( EMP \\bowtie_{ ENO} \\sigma _{Dur > 36} (\\pi_{ Dur} (DSG)))) $");
		questaoAlternativa44.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa45 = new QuestaoAlternativa();
		questaoAlternativa45.setId(INICIOQUESTAO.longValue());
		questaoAlternativa45.setAno(ANO);
		questaoAlternativa45.setDescricao(
				"Dentre as características do modelo relacional e do modelo de objetos em bancos de dados, qual afirmação é INCORRETA? ");
		questaoAlternativa45.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa45.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa45.setDisciplina(EDisciplina.BANCO_DE_DADOS);
		questaoAlternativa45.setAlternativaCorreta("a");
		questaoAlternativa45
				.setAlternativasA("O relacionamento de herança é diretamente representado no modelo relacional.");
		questaoAlternativa45
				.setAlternativasB("O relacionamento binário N x M é representado de modo semelhante nos dois modelos.");
		questaoAlternativa45.setAlternativasC(
				"O modelo de objetos possui mais recursos estruturais para a representação de dados que o relacional. ");
		questaoAlternativa45.setAlternativasD(
				"O modelo de objetos provê uma representação bem próxima de linguagens de programação.");
		questaoAlternativa45.setAlternativasE(
				"O modelo de objetos é mais adequado para a representação de tipos abstratos de dados.");
		questaoAlternativa45.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa46 = new QuestaoAlternativa();
		questaoAlternativa46.setId(INICIOQUESTAO.longValue());
		questaoAlternativa46.setAno(ANO);
		questaoAlternativa46.setDescricao(
				"Considere C(x) uma função que define a complexidade de um problema x; E(x) uma função que define o esforço (em termos de tempo) exigido para se resolver o problema x. Sejam dois problemas denominados p1 e p2. Assinale a alternativa correta.");
		questaoAlternativa46.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa46.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa46.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa46.setAlternativaCorreta("a");
		questaoAlternativa46.setAlternativasA("Se C(p1) < C(p2) então E(p1) < E(p2)");
		questaoAlternativa46.setAlternativasB("Se C(p1) < C(p2) então E(p1) > E(p2) ");
		questaoAlternativa46.setAlternativasC("E(p1+p2) < E(p1) + E(p2)");
		questaoAlternativa46.setAlternativasD("C(p1+p2) < C(p1) + C(p2)");
		questaoAlternativa46.setAlternativasE(" Nenhuma das alternativas anteriores");
		questaoAlternativa46.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa47 = new QuestaoAlternativa();
		questaoAlternativa47.setId(INICIOQUESTAO.longValue());
		questaoAlternativa47.setAno(ANO);
		questaoAlternativa47.setDescricao("Sobre a UML, quais das seguintes afirmações são verdadeiras?\r\n" +

				"$\\newline$I) A UML é o método de desenvolvimento de software mais utilizado na atualidade.\r\n" +

				"$\\newline$II) A UML é uma evolução das linguagens para especificação dos conceitos dos métodos de\r\n"
				+ "Booch, OMT e OOSE e também de outros métodos de especificação de requisitos de\r\n"
				+ "software orientados a objetos ou não.\r\n" +

				"$\\newline$III) A UML é composta dos seguintes diagramas: Diagrama de Caso de Uso, Diagrama de\r\n"
				+ "Classes, Diagrama de Colaboração, Diagrama de Estados, entre outros.\r\n" +

				"$\\newline$IV) Em UML pode-se representar tão somente relacionamentos de Agregação, Associação e\r\n"
				+ "Composição. ");
		questaoAlternativa47.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa47.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa47.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
		questaoAlternativa47.setAlternativaCorreta("d");
		questaoAlternativa47.setAlternativasA("Todas as alternativas.");
		questaoAlternativa47.setAlternativasB("Apenas as alternativas I, II e III.");
		questaoAlternativa47.setAlternativasC("Apenas as alternativas III e IV.");
		questaoAlternativa47.setAlternativasD("Apenas as alternativas II e III.");
		questaoAlternativa47.setAlternativasE("Nenhuma delas.");
		questaoAlternativa47.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa48 = new QuestaoAlternativa();
		questaoAlternativa48.setId(INICIOQUESTAO.longValue());
		questaoAlternativa48.setAno(ANO);
		questaoAlternativa48.setDescricao("Marque a alternativa onde todos os conceitos estão corretos.");
		questaoAlternativa48.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa48.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa48.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
		questaoAlternativa48.setAlternativaCorreta("b");
		questaoAlternativa48.setAlternativasA(
				"Em um diagrama de fluxo de dados, uma entidade externa representa um produtor ou um consumidor de informação e está fora dos limites do sistema modelado; cada processo pode ser refinado, para explicitar um maior detalhamento; um DFD contém dois níveis de detalhamento; um\r\n"
						+ "processo é um transformador de informação e também está fora do sistema; o nível 0 de um DFD representa o sistema como um todo e indica os principais usuários e as funções do sistema. ");
		questaoAlternativa48.setAlternativasB(
				"Em um diagrama de fluxo de dados uma entidade externa representa uma fonte ou destino das informações processadas pelo sistema e está fora dos limites do sistema modelado; cada processo pode ser refinado, para explicitar um maior detalhamento; um DFD pode conter vários níveis de detalhamento; um processo é um transformador de informação; o nível 0 de um DFD representa o sistema como um todo e indica as principais fontes e destinos das informações, usualmente referenciado por Diagrama de Contexto. ");
		questaoAlternativa48.setAlternativasC(
				"Em um diagrama de fluxo de dados uma entidade externa representa um produtor ou um consumidor de informação e está fora dos limites do sistema modelado; cada processo deve ser refinado, para explicitar um maior detalhamento; um DFD pode conter vários níveis de detalhamento; um processo é um transformador de informação e também está fora do sistema; o nível 0 de um DFD representa o sistema como um todo e indica os principais usuários e as funções do sistema.");
		questaoAlternativa48.setAlternativasD(
				"Em um diagrama de fluxo de dados uma entidade externa representa uma fonte ou destino das informações processadas pelo sistema e está fora dos limites do sistema modelado; cada processo\r\n"
						+ "pode ser refinado, para explicitar um maior detalhamento; um DFD pode conter vários níveis de detalhamento; um processo é um transformador de informação e também está fora do sistema; o nível 0 de um DFD representa o sistema como um todo e indica as principais fontes e destinos das informações. ");
		questaoAlternativa48.setAlternativasE("Nenhuma das alternativas anteriores.");
		questaoAlternativa48.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa49 = new QuestaoAlternativa();
		questaoAlternativa49.setId(INICIOQUESTAO.longValue());
		questaoAlternativa49.setAno(ANO);
		questaoAlternativa49.setDescricao("Considerando a rede de Petri abaixo, quais das alternativas são verdadeiras?"
				+ "$\\newline$I) O lugar A está habilitado a disparar."
				+ "$\\newline$II) Apenas a transição T1 está habilitada a disparar."
				+ "$\\newline$III) A seqüência de transições (T1, T2, T3, T2) pode ser disparada, nessa ordem."
				+ "$\\newline$IV) A transição T4 nunca poderá ser disparada.");
		questaoAlternativa49.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa49.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa49.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
		questaoAlternativa49.setAlternativaCorreta("e");
		questaoAlternativa49.setImagem(true);
		questaoAlternativa49.setAlternativasA("Todas as alternativas.");
		questaoAlternativa49.setAlternativasB("Apenas as alternativas II e III.");
		questaoAlternativa49.setAlternativasC("Apenas as alternativas I e III.");
		questaoAlternativa49.setAlternativasD("Apenas as alternativas II, III e IV.");
		questaoAlternativa49.setAlternativasE("Apenas as alternativas II, IV. ");
		questaoAlternativa49.setImagemQuestao(
				"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");
		questaoAlternativa49.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa50 = new QuestaoAlternativa();
		questaoAlternativa50.setId(INICIOQUESTAO.longValue());
		questaoAlternativa50.setAno(ANO);
		questaoAlternativa50
				.setDescricao("Quais das seguintes afirmações são verdadeiras? As Métricas de software servem para:"
						+ "$\\newline$I) indicar a qualidade do produto e avaliar a produtividade."
						+ "$\\newline$II) auxiliar na melhoria do processo."
						+ "$\\newline$III) formar uma base para as estimativas e justificar a aquisição de ferramentas."
						+ "$\\newline$IV) determinar se a utilização de um método traz benefícios ou não.");
		questaoAlternativa50.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa50.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa50.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
		questaoAlternativa50.setAlternativaCorreta("a");
		questaoAlternativa50.setAlternativasA("Todas as alternativas.");
		questaoAlternativa50.setAlternativasB("Apenas as alternativas I, II e IV.");
		questaoAlternativa50.setAlternativasC("Apenas as alternativas I, IV.");
		questaoAlternativa50.setAlternativasD("Apenas as alternativas II e III.");
		questaoAlternativa50.setAlternativasE("Nenhuma delas.");
		questaoAlternativa50.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa51 = new QuestaoAlternativa();
		questaoAlternativa51.setId(INICIOQUESTAO.longValue());
		questaoAlternativa51.setAno(ANO);
		questaoAlternativa51.setDescricao("Histograma de uma imagem com K tons de cinza é : ");
		questaoAlternativa51.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa51.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa51.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
		questaoAlternativa51.setAlternativaCorreta("c");
		questaoAlternativa51
				.setAlternativasA("O relacionamento de herança é diretamente representado no modelo relacional.");
		questaoAlternativa51
				.setAlternativasB("O relacionamento binário N x M é representado de modo semelhante nos dois modelos.");
		questaoAlternativa51.setAlternativasC(
				"O modelo de objetos possui mais recursos estruturais para a representação de dados que o relacional.");
		questaoAlternativa51.setAlternativasD(
				"O modelo de objetos provê uma representação bem próxima de linguagens de programação.");
		questaoAlternativa51.setAlternativasE(
				"O modelo de objetos é mais adequado para a representação de tipos abstratos de dados.");
		questaoAlternativa51.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa52 = new QuestaoAlternativa();
		questaoAlternativa52.setId(INICIOQUESTAO.longValue());
		questaoAlternativa52.setAno(ANO);
		questaoAlternativa52.setDescricao("Filtro da mediana é:");
		questaoAlternativa52.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa52.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa52.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
		questaoAlternativa52.setAlternativaCorreta("b");
		questaoAlternativa52.setAlternativasA("Indicado para detectar bordas em imagens.");
		questaoAlternativa52.setAlternativasB(
				"Indicado para atenuar ruído com preservação de bordas (i.é rápidas transições de nível em imagens). ");
		questaoAlternativa52.setAlternativasC("Indicado para detectar formas específicas em imagens. ");
		questaoAlternativa52.setAlternativasD("Indicado para detectar tonalidades específicas em uma imagem.");
		questaoAlternativa52.setAlternativasE("Nenhuma das respostas acima.");
		questaoAlternativa52.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa53 = new QuestaoAlternativa();
		questaoAlternativa53.setId(INICIOQUESTAO.longValue());
		questaoAlternativa53.setAno(ANO);
		questaoAlternativa53
				.setDescricao("Considere uma cena representada no sistema de referência do universo (SRU), uma\r\n"
						+ "window definida pelo par de coordenadas (0,0)-(100,100) e uma viewport definida pelo par\r\n"
						+ "de coordenadas (20,30)-(300,100). Considere ainda que as coordenadas que definem\r\n"
						+ "window e viewport correspondem, respectivamente, aos limites inferior esquerdo e\r\n"
						+ "superior direito de ambas. Analise as afirmativas abaixo levando em consideração os\r\n"
						+ "conceitos clássicos de window e viewport e assinale a alternativa correta.}\r\n" +

						"$\\newline$I – Window e viewport estão definidas no SRU.\r\n" +

						"$\\newline$II – No processo de mapeamento desta window para esta viewport haverá modificação na\r\n"
						+ "relação de aspecto.\r\n" +

						"$\\newline$III – O mapeamento da window redefinida pelo par de coordenadas (0,0) – (50,50) para a\r\n"
						+ "mesma viewport (20,30)-(300,100) corresponde a uma operação de zoom out sobre o mesmo\r\n"
						+ "universo. ");
		questaoAlternativa53.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa53.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa53.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
		questaoAlternativa53.setAlternativaCorreta("b");
		questaoAlternativa53.setAlternativasA("As alternativas I e II são verdadeiras ");
		questaoAlternativa53.setAlternativasB("As alternativas I e III são falsas");
		questaoAlternativa53.setAlternativasC("Apenas a afirmativa III é verdadeira");
		questaoAlternativa53.setAlternativasD("As afirmativas II e III são verdadeiras");
		questaoAlternativa53.setAlternativasE(" As alternativas I e II são falsas");
		questaoAlternativa53.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa54 = new QuestaoAlternativa();
		questaoAlternativa54.setId(INICIOQUESTAO.longValue());
		questaoAlternativa54.setAno(ANO);
		questaoAlternativa54
				.setDescricao("Qual das seguintes condições não é necessária para a ocorrência de um deadlock?");
		questaoAlternativa54.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa54.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa54.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
		questaoAlternativa54.setAlternativaCorreta("c");
		questaoAlternativa54.setAlternativasA("Uso mutuamente exclusivo de recursos por processos.");
		questaoAlternativa54.setAlternativasB("Alocação parcial de recursos a processos.");
		questaoAlternativa54.setAlternativasC("Escalonamento preemptivo de recursos.");
		questaoAlternativa54.setAlternativasD("Processos em espera circular.");
		questaoAlternativa54.setAlternativasE("Haver compartilhamento de recursos por processos.");
		questaoAlternativa54.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa55 = new QuestaoAlternativa();
		questaoAlternativa55.setId(INICIOQUESTAO.longValue());
		questaoAlternativa55.setAno(ANO);
		questaoAlternativa55.setDescricao("Starvation ocorre quando: ");
		questaoAlternativa55.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa55.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa55.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
		questaoAlternativa55.setAlternativaCorreta("a");
		questaoAlternativa55.setAlternativasA("Pelo menos um processo é continuamente postergado e não executa. ");
		questaoAlternativa55.setAlternativasB(
				"A prioridade de um processo é ajustada de acordo com o tempo total de execução do mesmo. ");
		questaoAlternativa55.setAlternativasC("Pelo menos um evento espera por um evento que não vai ocorrer.");
		questaoAlternativa55.setAlternativasD(
				" Dois ou mais processos são forçados a acessar dados críticos alternando estritamente entre eles.");
		questaoAlternativa55.setAlternativasE("O processo tenta mas não consegue acessar uma variável compartilhada.");
		questaoAlternativa55.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa56 = new QuestaoAlternativa();
		questaoAlternativa56.setId(INICIOQUESTAO.longValue());
		questaoAlternativa56.setAno(ANO);
		questaoAlternativa56.setDescricao(
				"Quando trabalhando com sistemas baseados em trocas de mensagens, temporizações (time-outs) são utilizadas para:");
		questaoAlternativa56.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa56.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa56.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
		questaoAlternativa56.setAlternativaCorreta("b");
		questaoAlternativa56.setAlternativasA("Limitar o número de retransmissões de uma mensagem.");
		questaoAlternativa56.setAlternativasB("Arbitrar que uma mensagem transmitida foi perdida.");
		questaoAlternativa56.setAlternativasC("Temporariamente suspender a transmissão de mensagens.");
		questaoAlternativa56.setAlternativasD("Limitar o tamanho de uma mensagem transmitida.");
		questaoAlternativa56.setAlternativasE("Limitar o tempo para obter um recurso.");
		questaoAlternativa56.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa57 = new QuestaoAlternativa();
		questaoAlternativa57.setId(INICIOQUESTAO.longValue());
		questaoAlternativa57.setAno(ANO);
		questaoAlternativa57.setDescricao(
				"Sistemas de processamento de transações, tais como sistemas de reservas aéreas, devem prover um mecanismo que garanta que cada transação não é afetada por outras transações que possam estar ocorrendo ao mesmo tempo. Transações de duas fases obedecem a um protocolo que garante essa atomicidade. Em transações de duas fases:");
		questaoAlternativa57.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa57.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa57.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
		questaoAlternativa57.setAlternativaCorreta("b");
		questaoAlternativa57
				.setAlternativasA("Todas as operações de leitura ocorrem antes da primeira operação de escrita. ");
		questaoAlternativa57.setAlternativasB(
				"Todas as ações de travamento (lock) ocorrem antes da primeira ação de destravamento. ");
		questaoAlternativa57.setAlternativasC(
				"Uma trava compartilhada sobre um objeto deve ser obtida antes de uma trava exclusiva sobre o objeto ser obtida.");
		questaoAlternativa57.setAlternativasD(
				"Qualquer objeto correntemente travado deve ser destravado antes que outro objeto possa ser travado.");
		questaoAlternativa57.setAlternativasE(
				"Verifica-se a disponibilidade de todas as travas antes de executar qualquer ação de travamento. ");
		questaoAlternativa57.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa58 = new QuestaoAlternativa();
		questaoAlternativa58.setId(INICIOQUESTAO.longValue());
		questaoAlternativa58.setAno(ANO);
		questaoAlternativa58
				.setDescricao("Qual o significado de coerência de memórias cache em sistemas multiprocessados? ");
		questaoAlternativa58.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa58.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa58.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
		questaoAlternativa58.setAlternativaCorreta("a");
		questaoAlternativa58.setAlternativasA(
				"Caches em processadores diferentes sempre contêm o mesmo dado válido para a mesma linha de cache.");
		questaoAlternativa58
				.setAlternativasB("Caches em processadores diferentes nunca compartilham a mesma linha de cache.");
		questaoAlternativa58.setAlternativasC("Caches em processadores diferentes nunca interagem entre si.");
		questaoAlternativa58
				.setAlternativasD("Caches em processadores diferentes sempre lêem os mesmos dados ao mesmo tempo.");
		questaoAlternativa58.setAlternativasE(
				"Caches em processadores diferentes podem possuir dados diferentes associados à mesma linha de cache.");
		questaoAlternativa58.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa59 = new QuestaoAlternativa();
		questaoAlternativa59.setId(INICIOQUESTAO.longValue());
		questaoAlternativa59.setAno(ANO);
		questaoAlternativa59.setDescricao(
				"Seja a árvore binária abaixo a representação de um espaço de estados para um problema\r\n"
						+ "p, em que o estado inicial é a, e i e f são estados finais. Conforme a imagem abaixo."
						+ "Um algoritmo de busca em largura-primeiro forneceria a seguinte seqüência de estados como primeira alternativa a um caminho-solução para o problema p: ");
		questaoAlternativa59.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa59.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa59.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
		questaoAlternativa59.setAlternativaCorreta("b");
		questaoAlternativa59.setImagem(true);
		questaoAlternativa59.setAlternativasA("a b d h e i");
		questaoAlternativa59.setAlternativasB("a b c d e f");
		questaoAlternativa59.setAlternativasC("a b e i");
		questaoAlternativa59.setAlternativasD("a c f");
		questaoAlternativa59.setAlternativasE("a b d e f");
		questaoAlternativa59.setImagemQuestao(
				"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");
		questaoAlternativa59.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa60 = new QuestaoAlternativa();
		questaoAlternativa60.setId(INICIOQUESTAO.longValue());
		questaoAlternativa60.setAno(ANO);
		questaoAlternativa60.setDescricao(
				"Sejam os seguintes predicados de uma linguagem de primeira ordem: $\\newline$ N (x) : x é número; \r\n"
						+ "$\\newline$ P (x) : x tem propriedade P;"
						+ "$\\newline$ x $<$ y : x é menor que y. $\\newline$ E sejam os símbolos: $\\newline$"
						+ "$\\forall$: quantificador universal;$\\newline$" + "$=>$ : operador se-então;$\\newline$"
						+ "$\\neg$ : operador de negação.$\\newline$"
						+ "Para a fórmula: $\\forall$ x (N(x) $=>$ $\\neg\\forall$y (N(y) $=>$ y $<$ x))), qual alternativa abaixo NÃO constitui"
						+ "uma tradução possível?");
		questaoAlternativa60.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa60.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa60.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
		questaoAlternativa60.setAlternativaCorreta("e");
		questaoAlternativa60.setAlternativasA("Não há um número tal que todos os números são menores do que ele.");
		questaoAlternativa60.setAlternativasB("Para todo número, existe um outro número que é maior do que ele. ");
		questaoAlternativa60
				.setAlternativasC("Para todo número, não é verdade que qualquer número seja menor do que ele. ");
		questaoAlternativa60.setAlternativasD(
				"Para qualquer x, se x é número, então não é verdade que todos os números são menores do que ele.");
		questaoAlternativa60.setAlternativasE("Não há um número menor do que outro número.");
		questaoAlternativa60.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa61 = new QuestaoAlternativa();
		questaoAlternativa61.setId(INICIOQUESTAO.longValue());
		questaoAlternativa61.setAno(ANO);
		questaoAlternativa61.setDescricao("Dada a seguinte fórmula (lógica de primeira ordem):\r\n" + " \r\n"
				+ " $\\forall$ x $\\exists$ y $\\mid$ ama(x,y)\r\n" + " \r\n"
				+ "qual das seguintes sentenças em linguagem natural ela representa, considerando que ama(x,y)\r\n"
				+ "representa que x ama y?");
		questaoAlternativa61.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa61.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa61.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
		questaoAlternativa61.setAlternativaCorreta("b");
		questaoAlternativa61.setAlternativasA("Alguém ama a todos. ");
		questaoAlternativa61.setAlternativasB("Todos amam alguém.");
		questaoAlternativa61.setAlternativasC("Ninguém ama a todos.");
		questaoAlternativa61.setAlternativasD("Há alguém que todos amam.");
		questaoAlternativa61.setAlternativasE("Nenhuma das anteriores.");
		questaoAlternativa61.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa62 = new QuestaoAlternativa();
		questaoAlternativa62.setId(INICIOQUESTAO.longValue());
		questaoAlternativa62.setAno(ANO);
		questaoAlternativa62.setDescricao(
				"Em qual das situações abaixo um sistema de Raciocínio Baseado em Casos não deve ser utilizado? ");
		questaoAlternativa62.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa62.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa62.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
		questaoAlternativa62.setAlternativaCorreta("e");
		questaoAlternativa62
				.setAlternativasA("Quando a experiência for tão valiosa quanto o conhecimento em livros texto.");
		questaoAlternativa62.setAlternativasB("Em aplicações de diagnóstico médico.");
		questaoAlternativa62.setAlternativasC("Quando especialistas conversam sobre seus domínios dando exemplos.");
		questaoAlternativa62.setAlternativasD("Quando as regras utilizadas apresentam um grande número de exceções.");
		questaoAlternativa62.setAlternativasE("Quando for fácil a obtenção de regras do especialista do domínio.");
		questaoAlternativa62.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa63 = new QuestaoAlternativa();
		questaoAlternativa63.setId(INICIOQUESTAO.longValue());
		questaoAlternativa63.setAno(ANO);
		questaoAlternativa63.setDescricao(
				"Uma integração de Sistemas Computacionais formando uma rede, tipicamente é implementada através da instalação de uma Arquitetura de Rede, que é composta de camadas e protocolos, em cada um dos elementos que compõem esta rede. Considere que estações “conversam” quando aplicações de usuários conseguem comunicar-se, sintática e semanticamente, através da Rede de Computadores. Baseados nesta premissa e em todos os conceitos associados à implementação e utilização das redes de computadores podemos afirmar como certo: ");
		questaoAlternativa63.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa63.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa63.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
		questaoAlternativa63.setAlternativaCorreta("c");
		questaoAlternativa63
				.setAlternativasA("Computadores com arquiteturas de redes diferentes conseguem “conversar”.");
		questaoAlternativa63.setAlternativasB("Computadores com arquiteturas de rede parecidas conseguem “conversar”.");
		questaoAlternativa63.setAlternativasC(
				"Computadores com arquiteturas de redes diferentes podem “conversar” através de um gateway ou conversor de protocolos.");
		questaoAlternativa63.setAlternativasD(
				"Computadores com arquiteturas diferentes podem “conversar” através de multiplexadores.");
		questaoAlternativa63.setAlternativasE("Nenhuma delas é uma afirmação correta.");
		questaoAlternativa63.setNumeroQuestao(63);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa64 = new QuestaoAlternativa();
		questaoAlternativa64.setId(INICIOQUESTAO.longValue());
		questaoAlternativa64.setAno(ANO);
		questaoAlternativa64.setDescricao("Assinale a alternativa INCORRETA:");
		questaoAlternativa64.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa64.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa64.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
		questaoAlternativa64.setAlternativaCorreta("b");
		questaoAlternativa64.setAlternativasA(
				"Nos serviços orientados a conexões há a necessidade de estabelecimento de uma conexão antes da transferência dos dados.");
		questaoAlternativa64.setAlternativasB(
				"Os serviços orientados a conexões são sempre confiáveis garantindo a entrega ordenada e completa dos dados transmitidos.");
		questaoAlternativa64.setAlternativasC(
				"Serviços orientados a conexão podem ser implementados em subredes que funcionam no modo datagrama.");
		questaoAlternativa64.setAlternativasD(
				"O controle de fluxo tem como objetivo garantir que nenhum dos parceiros de uma comunicação inunda o outro enviando pacotes mais rápido do que ele pode tratar.");
		questaoAlternativa64.setAlternativasE(
				"Os serviços orientados a conexão podem ajudar no controle de congestionamento através da diminuição da taxa de transmissão durante um congestionamento em andamento.");
		questaoAlternativa64.setNumeroQuestao(64);

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
		questaoAlternativa65.setAlternativasA(
				"O sigilo é obtido através da codificação com a chave privada do remetente e decifragem com a chave pública do destinatário.");
		questaoAlternativa65.setAlternativasB(
				"O sigilo é obtido através da codificação com a chave pública do destinatário e decifragem com a chave privada do destinatário.");
		questaoAlternativa65.setAlternativasC(
				"O sigilo é obtido através da codificação com a chave privada do destinatário e decifragem com a chave pública do destinatário.");
		questaoAlternativa65.setAlternativasD(
				"Para assinar digitalmente uma mensagem codifica-se a mesma com a chave pública do remetente e esta é decifrada com a chave privada do destinatário.");
		questaoAlternativa65.setAlternativasE(
				"Para assinar digitalmente uma mensagem codifica-se a mesma com a chave pública do destinatário e esta é decifrada com a chave privada do destinatário.");
		questaoAlternativa65.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa66 = new QuestaoAlternativa();
		questaoAlternativa66.setId(INICIOQUESTAO.longValue());
		questaoAlternativa66.setAno(ANO);
		questaoAlternativa66.setDescricao("Quanto ao TCP, é INCORRETO afirmar:");
		questaoAlternativa66.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa66.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa66.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
		questaoAlternativa66.setAlternativaCorreta("e");
		questaoAlternativa66.setAlternativasA("É um protocolo do nível de transporte.");
		questaoAlternativa66.setAlternativasB("Usa janelas deslizantes para implementar o controle de fluxo e erro.");
		questaoAlternativa66.setAlternativasC("É um protocolo orientado a conexão.");
		questaoAlternativa66.setAlternativasD(
				"Utiliza portas para permitir a comunicação entre processos localizados em dispositivos diferentes.");
		questaoAlternativa66.setAlternativasE(
				"Possui um campo de checksum que valida as informações de seu cabeçalho, mas não valida as informações de payload (campo de dados).");
		questaoAlternativa66.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa67 = new QuestaoAlternativa();
		questaoAlternativa67.setId(INICIOQUESTAO.longValue());
		questaoAlternativa67.setAno(ANO);
		questaoAlternativa67.setDescricao(
				"Para a gramática a seguir, qual o conjunto de terminais que pode aparecer como primeiro\r\n"
						+ "terminal após o não-terminal A, em qualquer forma sentencial gerada pela gramática"
						+ "abaixo (isto é, não necessariamente imediatamente após A), onde ε representa a sentença"
						+ "vazia? $\\newline$ S $\\rightarrow$ ABCDd $\\newline$ A $\\rightarrow$ aA | ε $\\newline$ B $\\rightarrow$ bC | ε $\\newline$ C $\\rightarrow$ cD | ε $\\newline$ D $\\rightarrow$ e");
		questaoAlternativa67.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa67.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa67.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
		questaoAlternativa67.setAlternativaCorreta("d");
		questaoAlternativa67.setAlternativasA("$\\left\\{d\\right\\}$");
		questaoAlternativa67.setAlternativasB("$\\left\\{b\\right\\}$");
		questaoAlternativa67.setAlternativasC("$\\left\\{b,c,e\\right\\}$");
		questaoAlternativa67.setAlternativasD("$\\left\\{b,c,d,e\\right\\}$");
		questaoAlternativa67.setAlternativasE("$\\left\\{e\\right\\}$");
		questaoAlternativa67.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa68 = new QuestaoAlternativa();
		questaoAlternativa68.setId(INICIOQUESTAO.longValue());
		questaoAlternativa68.setAno(ANO);
		questaoAlternativa68
				.setDescricao("Qual das afirmações a seguir, relativas à análise sintática, está INCORRETA?");
		questaoAlternativa68.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa68.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa68.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa68.setAlternativaCorreta("a");
		questaoAlternativa68
				.setAlternativasA("As gramáticas LL podem descrever mais linguagens do que as gramáticas LR . ");
		questaoAlternativa68.setAlternativasB(
				"Analisadores sintáticos descendentes recursivos são mais simples de implementar do que analisadores sintáticos redutivos. ");
		questaoAlternativa68.setAlternativasC(
				"Uma das diferenças entre os diversos algoritmos de análise redutiva é a forma de identificar o handle na pilha.");
		questaoAlternativa68.setAlternativasD(
				"Algoritmos de análise redutiva podem ser utilizados mesmo para gramáticas ambíguas.");
		questaoAlternativa68.setAlternativasE(
				"Algoritmos descendentes recursivos podem ser utilizados para algumas gramáticas ambíguas. ");
		questaoAlternativa68.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa69 = new QuestaoAlternativa();
		questaoAlternativa69.setId(INICIOQUESTAO.longValue());
		questaoAlternativa69.setAno(ANO);
		questaoAlternativa69.setDescricao(
				"Qual o valor do atributo E.val após a análise da expressão “ 4 / 2 / 2 ” para o esquema de tradução a seguir? $\\newline$ E $\\rightarrow$ T / E1 { E.val = T.val / E1.val} $\\newline$ E $\\rightarrow$ T { E.val = T.val } $\\newline$ T $\\rightarrow$ digito { T.val = val(digito) }");
		questaoAlternativa69.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa69.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa69.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa69.setAlternativaCorreta("d");
		questaoAlternativa69.setAlternativasA("1");
		questaoAlternativa69.setAlternativasB("2");
		questaoAlternativa69.setAlternativasC("3");
		questaoAlternativa69.setAlternativasD("4");
		questaoAlternativa69.setAlternativasE("8");
		questaoAlternativa69.setNumeroQuestao(NUMEROQUESTAO);

		NUMEROQUESTAO++;
		INICIOQUESTAO++; //		----------------------------------------------------------- //		-----------------------------------------------------------

		QuestaoAlternativa questaoAlternativa70 = new QuestaoAlternativa();
		questaoAlternativa70.setId(INICIOQUESTAO.longValue());
		questaoAlternativa70.setAno(ANO);
		questaoAlternativa70.setDescricao(
				"Qual das informações a seguir NÃO é colocada no registro de ativação na chamada de funções?");
		questaoAlternativa70.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa70.setProva(ETipoQuestaoProva.POSCOMP);
		questaoAlternativa70.setDisciplina(EDisciplina.PROGRAMACAO);
		questaoAlternativa70.setAlternativaCorreta("b");
		questaoAlternativa70.setAlternativasA("Endereço de retorno");
		questaoAlternativa70.setAlternativasB("Variáveis locais estáticas");
		questaoAlternativa70.setAlternativasC("Estado dos registradores");
		questaoAlternativa70.setAlternativasD("Link para a subrotina chamadora");
		questaoAlternativa70.setAlternativasE("Valor de retorno da função");
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
