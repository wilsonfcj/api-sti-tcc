package ifsc.sti.tcc.utilidades.questao;

import java.util.ArrayList;
import java.util.List;

import ifsc.sti.tcc.modelos.questao.QuestaoAlternativa;
import ifsc.sti.tcc.props.EArea;
import ifsc.sti.tcc.props.EDisciplina;
import ifsc.sti.tcc.props.ETipoQuestao;

public class QuestaoPoscomp2003 {
	
	public static List<QuestaoAlternativa> registerPoscomp2002() {
		QuestaoAlternativa questaoAlternativa1 = new QuestaoAlternativa();
		questaoAlternativa1.setId(1l);
		questaoAlternativa1.setAno(2002);
		questaoAlternativa1.setDescricao("Pode-se afirmar que o gráfico da função $y = 2 + \\frac{1}{x - 1}$ é o gráfico da função $y = \\frac{1}{x}$");
		questaoAlternativa1.setArea(EArea.MATEMATICA);
		questaoAlternativa1.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa1.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
		questaoAlternativa1.setAlternativaCorreta("a");
		
		questaoAlternativa1.setAlternativasA("Transladado uma unidade para a direita e duas unidades para cima;");
		questaoAlternativa1.setAlternativasB("Transladado uma unidade para a direita e duas unidades para baixo;");
		questaoAlternativa1.setAlternativasC("Transladado uma unidade para a esquerda e duas unidades para cima;");
		questaoAlternativa1.setAlternativasD("Transladado uma unidade para a esquerda e duas unidades para baixo;");
		questaoAlternativa1.setAlternativasE("Nenhuma das anteriores;");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa2 = new QuestaoAlternativa();
		questaoAlternativa2.setId(2l);
		questaoAlternativa2.setAno(2002);
		questaoAlternativa2.setDescricao("A derivada da função $f(x) = x^x$ é igual a");
		questaoAlternativa2.setArea(EArea.MATEMATICA);
		questaoAlternativa2.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa2.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa2.setAlternativaCorreta("d");
		
		questaoAlternativa2.setAlternativasA("$xx^{x−1}$");
		questaoAlternativa2.setAlternativasB("$x^x$");
		questaoAlternativa2.setAlternativasC("$x^x ln\\left(x\\right)$");
		questaoAlternativa2.setAlternativasD("$x^x\\left(ln\\left(x\\right) + 1\\right)$");
		questaoAlternativa2.setAlternativasE("$x^x\\left(ln\\left(x\\right) + x\\right)$");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa3 = new QuestaoAlternativa();
		questaoAlternativa3.setId(3l);
		questaoAlternativa3.setAno(2002);
		questaoAlternativa3.setDescricao("Seja $n$ um número inteiro positivo. Considere a função $f$ definida recursivamente por \r\n" + 
				"\r\n" + 
				"$f\\left(n\\right) = \\begin{cases}0 & se \\ n = 0\\ f\\left(\\left[\\frac{n}{2}\\right]\\right) + 1 & se \\ n > 0\\end{cases}$\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"onde $\\left[k\\right]$ é o maior inteiro menor ou igual a $k$. O valor de $f(25)$ é igual a\r\n");
		questaoAlternativa3.setArea(EArea.MATEMATICA);
		questaoAlternativa3.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa3.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
		questaoAlternativa3.setAlternativaCorreta("b");
		
		questaoAlternativa3.setAlternativasA("5");
		questaoAlternativa3.setAlternativasB("4");
		questaoAlternativa3.setAlternativasC("6");
		questaoAlternativa3.setAlternativasD("3");
		questaoAlternativa3.setAlternativasE("2");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa4 = new QuestaoAlternativa();
		questaoAlternativa4.setId(4l);
		questaoAlternativa4.setAno(2002);
		questaoAlternativa4.setDescricao("Para cada $n ∈ N$ seja $Dn = \\left(0, 1/n\\right)$, onde $\\left(0, 1/n\\right)$ representa o intervalo aberto de\r\n" + 
				"extremos $0 e 1/n$. O conjunto diferença $D_3 − D_{20}$ é igual a:");
		questaoAlternativa4.setArea(EArea.MATEMATICA);
		questaoAlternativa4.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa4.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa4.setAlternativaCorreta("d");
		
		questaoAlternativa4.setAlternativasA("$D_3$");
		questaoAlternativa4.setAlternativasB("$D_{20}$");
		questaoAlternativa4.setAlternativasC("$\\left(1/20, 1/3\\right)$");
		questaoAlternativa4.setAlternativasD("$\\left[1/20, 1/3\\right)$");
		questaoAlternativa4.setAlternativasE("$D_{20} ∪ D_3$");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa5 = new QuestaoAlternativa();
		questaoAlternativa5.setId(5l);
		questaoAlternativa5.setAno(2002);
		questaoAlternativa5.setDescricao("Todos os convidados presentes num jantar tomam chá ou café. Treze convidados bebem café, dez bebem chá e 4 bebem chá e café. Quantas pessoas tem nesse jantar.");
		questaoAlternativa5.setArea(EArea.MATEMATICA);
		questaoAlternativa5.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa5.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa5.setAlternativaCorreta("a");
		
		questaoAlternativa5.setAlternativasA("19");
		questaoAlternativa5.setAlternativasB("27");
		questaoAlternativa5.setAlternativasC("23");
		questaoAlternativa5.setAlternativasD("15");
		questaoAlternativa5.setAlternativasE("10");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa6 = new QuestaoAlternativa();
		questaoAlternativa6.setId(6l);
		questaoAlternativa6.setAno(2002);
		questaoAlternativa6.setDescricao("A sequência é definida recursivamente por\r\n" + 
				"\r\n" + 
				"$\\begin{cases}x_0 &  = a/2\\ x_{n+1} & = \\left(x_n + a/x_n \\right)/2 & para \\ n > 0\\end{cases}$\r\n" + 
				"\r\n" + 
				"onde a é um número real maior do que 1. Se $\\lim_{n \\rightarrow ∞} x_n = L$ podemos afirmar que\r\n");
		questaoAlternativa6.setArea(EArea.MATEMATICA);
		questaoAlternativa6.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa6.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa6.setAlternativaCorreta("e");
		
		questaoAlternativa6.setAlternativasA("$L = 1$");
		questaoAlternativa6.setAlternativasB("$L = 1/a$");
		questaoAlternativa6.setAlternativasC("$L = a$");
		questaoAlternativa6.setAlternativasD("$L = 1/2a$");
		questaoAlternativa6.setAlternativasE("$L =\\sqrt{a}$");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa7 = new QuestaoAlternativa();
		questaoAlternativa7.setId(7l);
		questaoAlternativa7.setAno(2002);
		questaoAlternativa7.setDescricao("Seja $f : R → R$ derivável. Se existem $a, b ∈ R$ tal que $f(a)f(b) < 0$ e $f'(x) <> 0$ para todo $x ∈ (a, b)$, podemos afirmar que no intervalo $(a, b)$ a equação $f(x) = 0$ tem");
		questaoAlternativa7.setArea(EArea.MATEMATICA);
		questaoAlternativa7.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa7.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa7.setAlternativaCorreta("c");
		
		questaoAlternativa7.setAlternativasA("Duas raízes reais");
		questaoAlternativa7.setAlternativasB("Nenhuma raíz real");
		questaoAlternativa7.setAlternativasC("Uma única raiz real");
		questaoAlternativa7.setAlternativasD("Uma raiz imaginária");
		questaoAlternativa7.setAlternativasE("Somente raízes imaginárias");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa8 = new QuestaoAlternativa();
		questaoAlternativa8.setId(8l);
		questaoAlternativa8.setAno(2002);
		questaoAlternativa8.setDescricao("Seja g : $\\mathbb{R} \\rightarrow \\mathbb{R}$ contínua e $f\\left(x\\right) =g\\left(x\\right) - x$. Definimos a sequência $\\left(x_n\\right)$ da seguinte maneira \r\n" + 
				"\r\n" + 
				"$\\begin{cases}x_0 & = 1\\ x_n & = g(x_{n-1}) & para \\ n \\geq 1\\end{cases}$ \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"Se $\\lim_{n \\rightarrow ∞} x_n = L$ podemos afirmar que\r\n");
		questaoAlternativa8.setArea(EArea.MATEMATICA);
		questaoAlternativa8.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa8.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa8.setAlternativaCorreta("a");
		
		questaoAlternativa8.setAlternativasA("L é uma raiz de $f(x) = 0$");
		questaoAlternativa8.setAlternativasB("L é uma raíz de $g(x) = 0$");
		questaoAlternativa8.setAlternativasC("$g(L) = 1$");
		questaoAlternativa8.setAlternativasD("$f(L) = L$");
		questaoAlternativa8.setAlternativasE("Nenhuma das anteriores");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa9 = new QuestaoAlternativa();
		questaoAlternativa9.setId(9l);
		questaoAlternativa9.setAno(2002);
		questaoAlternativa9.setDescricao("Assinale a proposição verdadeira");
		questaoAlternativa9.setArea(EArea.MATEMATICA);
		questaoAlternativa9.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa9.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa9.setAlternativaCorreta("d");
		
		questaoAlternativa9.setAlternativasA("Se x é um número real tal que $x^2 \\leq 4$ então $x \\leq 2$ e $x \\geq −2$");
		questaoAlternativa9.setAlternativasB("Se x e y são números reais tais que $x < y$ então $x^2 < y^2$");
		questaoAlternativa9.setAlternativasC("Se $x + y$ é um número racional então $x$ e $y$ são números racionais");
		questaoAlternativa9.setAlternativasD("Se $x < −4$ ou $x > 1$ então $\\frac{2x + 3}{x − 1}> 1$\r\n");
		questaoAlternativa9.setAlternativasE("Nenhuma das anteriores");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa10 = new QuestaoAlternativa();
		questaoAlternativa10.setId(10l);
		questaoAlternativa10.setAno(2002);
		questaoAlternativa10.setDescricao("Assinale o argumento válido, onde $S_1$, $S_2$ indicam premissas e $S$ a conclusão:");
		questaoAlternativa10.setArea(EArea.MATEMATICA);
		questaoAlternativa10.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa10.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa10.setAlternativaCorreta("b");
		
		questaoAlternativa10.setAlternativasA("$S_1$: Se o cavalo estiver cansado então ele perderá a corrida\r\n" + 
				"$S_2$: O cavalo estava descansado\r\n" + 
				"$S$: O cavalo ganhou a corrida");
		questaoAlternativa10.setAlternativasB("$S_1$: Se o cavalo estiver cansado então ele perderá a corrida\r\n" + 
				"$S_2$: O cavalo ganhou a corrida\r\n" + 
				"$S$: O cavalo estava descansado");
		questaoAlternativa10.setAlternativasC("$S_1$: Se o cavalo estiver cansado então ele perderá a corrida\r\n" + 
				"$S_2$: O cavalo perdeu a corrida\r\n" + 
				"$S$: O cavalo estava cansado");
		questaoAlternativa10.setAlternativasD("$S_1$: Se o cavalo estiver cansado então ele perderá a corrida\r\n" + 
				"$S_2$: O cavalo estava descansado\r\n" + 
				"$S$: O cavalo perdeu a corrida\r\n");
		questaoAlternativa10.setAlternativasE("Nenhuma das anteriores");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa11 = new QuestaoAlternativa();
		questaoAlternativa11.setId(11l);
		questaoAlternativa11.setAno(2002);
		questaoAlternativa11.setDescricao("Uma prova de vestibular foi elaborada com 25 questões de múltipla escolha com 5 alternativas. O número de candidatos presentes à prova foi 63127. Considere a afirmação:\r\n" + 
				"Pelo menos 2 candidatos responderam de modo idêntico as $k$ primeiras questões da prova. Qual é o maior valor de k para o qual podemos garantir que a afirmação é verdadeira.");
		questaoAlternativa11.setArea(EArea.MATEMATICA);
		questaoAlternativa11.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa11.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa11.setAlternativaCorreta("e");
		
		questaoAlternativa11.setAlternativasA("10");
		questaoAlternativa11.setAlternativasB("9");
		questaoAlternativa11.setAlternativasC("8");
		questaoAlternativa11.setAlternativasD("7");
		questaoAlternativa11.setAlternativasE("6");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa12 = new QuestaoAlternativa();
		questaoAlternativa12.setId(12l);
		questaoAlternativa12.setAno(2002);
		questaoAlternativa12.setDescricao("Dado um vetor $u ∈ R^2$, $u = \\left (−3, 4\\right )$, vamos denotar por $v$ o vetor de $R^2$ que tem tamanho 1 e é ortogonal à $u$. Então $v$ pode ser dado por");
		questaoAlternativa12.setArea(EArea.MATEMATICA);
		questaoAlternativa12.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa12.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa12.setAlternativaCorreta("c");
		
		questaoAlternativa12.setAlternativasA("\\left (−4/5, 3/5\\right )");
		questaoAlternativa12.setAlternativasB("\\left (3/5, 4/5\\right )");
		questaoAlternativa12.setAlternativasC("\\left (−4/5, −3/5\\right )");
		questaoAlternativa12.setAlternativasD("\\left (−4/5, 1/5\\right )");
		questaoAlternativa12.setAlternativasE("\\left (−4/5, 2/5\\right )");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa13 = new QuestaoAlternativa();
		questaoAlternativa13.setId(13l);
		questaoAlternativa13.setAno(2002);
		questaoAlternativa13.setDescricao("<IMAGEM = 13> Se O = $\\left (0, 0, 0\\right )$ ; A = $\\left (2, 4, 1\\right )$ ; B = $\\left (3, 1, 1\\right )$ e C = $\\left (1, 3, 5\\right )$ então o volume do sólido acima é");
		questaoAlternativa13.setArea(EArea.MATEMATICA);
		questaoAlternativa13.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa13.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
		questaoAlternativa13.setAlternativaCorreta("d");
		questaoAlternativa13.setImagem(true);
		questaoAlternativa13.setAlternativasA("30");
		questaoAlternativa13.setAlternativasB("35");
		questaoAlternativa13.setAlternativasC("$35/2$");
		questaoAlternativa13.setAlternativasD("44");
		questaoAlternativa13.setAlternativasE("21");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa14 = new QuestaoAlternativa();
		questaoAlternativa14.setId(14l);
		questaoAlternativa14.setAno(2002);
		questaoAlternativa14.setDescricao("A velocidade de um ponto em movimento é dada pela equação \r\n" + 
				"\r\n" + 
				"$v\\left (t\\right )  = te^{-0,01t} m/s$ \r\n" + 
				"\r\n" + 
				"O espaço percorrido desde o instante que o ponto comecçou a se mover até a sua parada total é");
		questaoAlternativa14.setArea(EArea.MATEMATICA);
		questaoAlternativa14.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa14.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
		questaoAlternativa14.setAlternativaCorreta("a");
		
		questaoAlternativa14.setAlternativasA("$10^4m$");
		questaoAlternativa14.setAlternativasB("$10^3e^{−0.01}m$");
		questaoAlternativa14.setAlternativasC("$10^2e^{−1}m$");
		questaoAlternativa14.setAlternativasD("$(e^{−100} − 1)m$");
		questaoAlternativa14.setAlternativasE("$10^2m$");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa15 = new QuestaoAlternativa();
		questaoAlternativa15.setId(15l);
		questaoAlternativa15.setAno(2002);
		questaoAlternativa15.setDescricao("$\\lim_{n \\rightarrow ∞}\\left(\\frac{1}{n^2} + \\frac{2}{n^2} + ... +\\frac{n − 1}{n^2} \\right) = L$ então");
		questaoAlternativa15.setArea(EArea.MATEMATICA);
		questaoAlternativa15.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa15.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa15.setAlternativaCorreta("c");
		
		questaoAlternativa15.setAlternativasA("$L = 1$");
		questaoAlternativa15.setAlternativasB("$L = 0$");
		questaoAlternativa15.setAlternativasC("$L = 1/2$");
		questaoAlternativa15.setAlternativasD("$L = ∞$");
		questaoAlternativa15.setAlternativasE("$L = 2$");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa16 = new QuestaoAlternativa();
		questaoAlternativa16.setId(16l);
		questaoAlternativa16.setAno(2002);
		questaoAlternativa16.setDescricao("O número de strings binárias de comprimento 7 e contendo um par de zeros consecutivos é");
		questaoAlternativa16.setArea(EArea.MATEMATICA);
		questaoAlternativa16.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa16.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa16.setAlternativaCorreta("c");
		
		questaoAlternativa16.setAlternativasA("91");
		questaoAlternativa16.setAlternativasB("92");
		questaoAlternativa16.setAlternativasC("94");
		questaoAlternativa16.setAlternativasD("95");
		questaoAlternativa16.setAlternativasE("90");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa17 = new QuestaoAlternativa();
		questaoAlternativa17.setId(17l);
		questaoAlternativa17.setAno(2002);
		questaoAlternativa17.setDescricao("A média aritmética de uma lista de 50 números é 50. Se dois desses números, 51 e 97, forem suprimidos dessa lista a média dos restantes será");
		questaoAlternativa17.setArea(EArea.MATEMATICA);
		questaoAlternativa17.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa17.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
		questaoAlternativa17.setAlternativaCorreta("b");
		
		questaoAlternativa17.setAlternativasA("50");
		questaoAlternativa17.setAlternativasB("49");
		questaoAlternativa17.setAlternativasC("51");
		questaoAlternativa17.setAlternativasD("47");
		questaoAlternativa17.setAlternativasE("40");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa18 = new QuestaoAlternativa();
		questaoAlternativa18.setId(18l);
		questaoAlternativa18.setAno(2002);
		questaoAlternativa18.setDescricao("O determinante da matriz dada abaixo é\r\n" + 
				"\r\n" + 
				"$\\left(\r\n" + 
				"\\begin{array}{c}2 \\ 2 \\ -1 \\ 2 \\ 3\\end{array} \r\n" + 
				"\\begin{array}{c}7 \\  8 \\ 0 \\ 0 \\ 0\\end{array} \r\n" + 
				"\\begin{array}{c}9 \\ 3 \\ 4 \\ 0 \\ 0\\end{array} \r\n" + 
				"\\begin{array}{c}−1 \\ 1 \\ 3 \\ -1 \\ 0\\end{array} \r\n" + 
				"\\begin{array}{c}1 \\ 0 \\ 0 \\ 0 \\ 0\\end{array} \r\n" + 
				"\\right)$\r\n");
		questaoAlternativa18.setArea(EArea.MATEMATICA);
		questaoAlternativa18.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa18.setDisciplina(EDisciplina.ALGEBRA_LINEAR_E_GEOMETRIA_ANALITICA);
		questaoAlternativa18.setAlternativaCorreta("a");
		
		questaoAlternativa18.setAlternativasA("96");
		questaoAlternativa18.setAlternativasB("−96");
		questaoAlternativa18.setAlternativasC("86");
		questaoAlternativa18.setAlternativasD("−86");
		questaoAlternativa18.setAlternativasE("46");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa19 = new QuestaoAlternativa();
		questaoAlternativa19.setId(19l);
		questaoAlternativa19.setAno(2002);
		questaoAlternativa19.setDescricao("Numa prova de múltipla escolha com 10 questões e 4 alternativas qual a chance (probabilidade) de um aluno apenas “chutando as respostas” conseguir “gabaritar” a provar (acertar todas as questões).\r\n");
		questaoAlternativa19.setArea(EArea.MATEMATICA);
		questaoAlternativa19.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa19.setDisciplina(EDisciplina.ESTATÍSTICA_E_PROBABILIDADE);
		questaoAlternativa19.setAlternativaCorreta("c");
		
		questaoAlternativa19.setAlternativasA("$1/10^{4}$");
		questaoAlternativa19.setAlternativasB("$1/4^{20}$");
		questaoAlternativa19.setAlternativasC("$1/2^{20}$");
		questaoAlternativa19.setAlternativasD("$1/10^{8}$");
		questaoAlternativa19.setAlternativasE("$1/4^{15}$");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa20 = new QuestaoAlternativa();
		questaoAlternativa20.setId(20l);
		questaoAlternativa20.setAno(2002);
		questaoAlternativa20.setDescricao("Três atletas A, B e C competiram, ao pares, numa corrida de d metros. Considerando que cada atleta teve o mesmo desempenho (ou seja, a mesma velocidade) ao competir com adversários distintos, e sabendo-se que \r\n" + 
				"• A venceu B chegando 20 metros à frente\r\n" + 
				"• B venceu C chegando 10 metros à frente\r\n" + 
				"• A venceu C chegando 28 metros à frente, \r\n" + 
				"\r\n" + 
				"podemos afirmar que a corrida tem");
		questaoAlternativa20.setArea(EArea.MATEMATICA);
		questaoAlternativa20.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa20.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa20.setAlternativaCorreta("c");
		
		questaoAlternativa20.setAlternativasA("50 metros");
		questaoAlternativa20.setAlternativasB("200 metros");
		questaoAlternativa20.setAlternativasC("100 metros");
		questaoAlternativa20.setAlternativasD("150 metros");
		questaoAlternativa20.setAlternativasE("110 metros");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa21 = new QuestaoAlternativa();
		questaoAlternativa21.setId(21l);
		questaoAlternativa21.setAno(2002);
		questaoAlternativa21.setDescricao("Uma característica de uma arquitetura RISC é:");
		questaoAlternativa21.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa21.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa21.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
		questaoAlternativa21.setAlternativaCorreta("d");
		
		questaoAlternativa21.setAlternativasA("Uma arquitetura de alto risco pois o mercado de hardware evolui muito rapidamente");
		questaoAlternativa21.setAlternativasB("Possui um grande conjunto de instruções complexas");
		questaoAlternativa21.setAlternativasC("A arquitetura é constituída de milhares de processadores ");
		questaoAlternativa21.setAlternativasD("Possui um pequeno conjunto de instruções simples");
		questaoAlternativa21.setAlternativasE("O processador é formado por válvulas e transistores ");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa22 = new QuestaoAlternativa();
		questaoAlternativa22.setId(22l);
		questaoAlternativa22.setAno(2002);
		questaoAlternativa22.setDescricao("Na Algebra Booleana");
		questaoAlternativa22.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa22.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa22.setDisciplina(EDisciplina.ARQUITETURA_E_ORGANIZACAO_DE_COMPUTADORES);
		questaoAlternativa22.setAlternativaCorreta("b");
		
		questaoAlternativa22.setAlternativasA("Os dígitos são octais, de 0 a 7");
		questaoAlternativa22.setAlternativasB("Os dígitos são binários 0 e 1");
		questaoAlternativa22.setAlternativasC("Há dez valores motivados pelos dez dedos do ser humano");
		questaoAlternativa22.setAlternativasD("Os dígitos são alfanuméricos que podem ser representados por um byte");
		questaoAlternativa22.setAlternativasE("Os dígitos são hexadecimais de 0 a 15");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa23 = new QuestaoAlternativa();
		questaoAlternativa23.setId(23l);
		questaoAlternativa23.setAno(2002);
		questaoAlternativa23.setDescricao("Considere o circuito abaixo, implementado com duas portas NAND.\r\n" + 
				"\r\n" + 
				"<IMAGEM = 23> \r\n" + 
				"\r\n" + 
				"Qual das seguintes portas equivale a este circuito?");
		questaoAlternativa23.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa23.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa23.setDisciplina(EDisciplina.ELETRONICA_DIGITAL);
		questaoAlternativa23.setAlternativaCorreta("c");
		questaoAlternativa23.setImagem(true);
		questaoAlternativa23.setAlternativasA("NOT");
		questaoAlternativa23.setAlternativasB("OR");
		questaoAlternativa23.setAlternativasC("AND");
		questaoAlternativa23.setAlternativasD("XOR");
		questaoAlternativa23.setAlternativasE("NOR");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa24 = new QuestaoAlternativa();
		questaoAlternativa24.setId(24l);
		questaoAlternativa24.setAno(2002);
		questaoAlternativa24.setDescricao("Assinale quantas sequências de caracteres a seguir são reconhecidas pelo autômato finito abaixo. As quatro sequências de caracteres (separadas por vírgulas) são: 0, +567, -89.5, -3e3. <IMAGEM = 25>");
		questaoAlternativa24.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa24.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa24.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa24.setAlternativaCorreta("c");
		questaoAlternativa24.setImagem(true);
		questaoAlternativa24.setAlternativasA("0");
		questaoAlternativa24.setAlternativasB("1");
		questaoAlternativa24.setAlternativasC("2");
		questaoAlternativa24.setAlternativasD("3");
		questaoAlternativa24.setAlternativasE("4");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa25 = new QuestaoAlternativa();
		questaoAlternativa25.setId(25l);
		questaoAlternativa25.setAno(2002);
		questaoAlternativa25.setDescricao("Sobre a hierarquia de Chomsky podemos afirmar que:");
		questaoAlternativa25.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa25.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa25.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa25.setAlternativaCorreta("e");
		questaoAlternativa25.setAlternativasA("Uma linguagem que é recusirvamente enumerável não pode ser uma linguagem regular");
		questaoAlternativa25.setAlternativasB("As linguagens livres de contexto e as linguagens sensíveis a contexto se excluem");
		questaoAlternativa25.setAlternativasC("Uma linguagem que não é regular é livre de contexto");
		questaoAlternativa25.setAlternativasD("As linguagens reconhecidas por autômatos a pilha são as linguagens regulares");
		questaoAlternativa25.setAlternativasE("Há linguagens que não são nem livres de contexto nem sensíveis a contexto");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa26 = new QuestaoAlternativa();
		questaoAlternativa26.setId(26l);
		questaoAlternativa26.setAno(2002);
		questaoAlternativa26.setDescricao("Suponha que T seja uma árvore AVL inicialmente vazia, e considere a inserção dos elementos 10,20,30,5,15,2 em T, nesta ordem. Qual das sequências abaixo corresponde a um percurso de T em pré-ordem:");
		questaoAlternativa26.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa26.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa26.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
		questaoAlternativa26.setAlternativaCorreta("a");
		questaoAlternativa26.setAlternativasA("10,5,2,20,15,30");
		questaoAlternativa26.setAlternativasB("20,10,5,2,15,30");
		questaoAlternativa26.setAlternativasC("2,5,10,15,20,30");
		questaoAlternativa26.setAlternativasD("30,20,15,10,5,2");
		questaoAlternativa26.setAlternativasE("15,10,5,2,20,30");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa27 = new QuestaoAlternativa();
		questaoAlternativa27.setId(27l);
		questaoAlternativa27.setAno(2002);
		questaoAlternativa27.setDescricao("Considere uma tabela de espalhamento (tabela hash) com quatro posições numeradas 0, 1, 2 e 3. Se a sequencia de quadrados perfeitos $1, 4, 9, ....., i^2, ...$  for armazenada nessa tabela segundo a função $f(x) = x mod 4$, como se dará a distribuição dos elementos pelas posições da tabela, à medida que o número de entradas cresce?");
		questaoAlternativa27.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa27.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa27.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
		questaoAlternativa27.setAlternativaCorreta("e");
		questaoAlternativa27.setAlternativasA("Cada posição da tabela receberá aproximadamente o mesmo número de elementos");
		questaoAlternativa27.setAlternativasB("Três posições da tabela receberão, cada uma, aproximadamente um terço dos elementos");
		questaoAlternativa27.setAlternativasC("Uma única porsição da tabela receberá todos os elementos, e as demais posições permanecerão vazias");
		questaoAlternativa27.setAlternativasD("Todas as posições da tebela receberão elementos, mas as duas primeiras receberão, cada uma, o dobro das outras");
		questaoAlternativa27.setAlternativasE("As duas primeiras posições da tabela receberão, cada uma,aproximadamente a metade dos elementos, e as demais posições permanecerão vazias");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa28 = new QuestaoAlternativa();
		questaoAlternativa28.setId(28l);
		questaoAlternativa28.setAno(2002);
		questaoAlternativa28.setDescricao("Considere uma tabela de espalhamento (tabela hash) com quatro posições numeradas 0, 1, 2 e 3. Se a sequencia de quadrados perfeitos $1, 4, 9, ....., i^2, ...$  for armazenada nessa tabela segundo a função $f(x) = x mod 4$, como se dará a distribuição dos elementos pelas posições da tabela, à medida que o número de entradas cresce?");
		questaoAlternativa28.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa28.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa28.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
		questaoAlternativa28.setAlternativaCorreta("e");
		questaoAlternativa28.setAlternativasA("Cada posição da tabela receberá aproximadamente o mesmo número de elementos");
		questaoAlternativa28.setAlternativasB("Três posições da tabela receberão, cada uma, aproximadamente um terço dos elementos");
		questaoAlternativa28.setAlternativasC("Uma única porsição da tabela receberá todos os elementos, e as demais posições permanecerão vazias");
		questaoAlternativa28.setAlternativasD("Todas as posições da tebela receberão elementos, mas as duas primeiras receberão, cada uma, o dobro das outras");
		questaoAlternativa28.setAlternativasE("As duas primeiras posições da tabela receberão, cada uma,aproximadamente a metade dos elementos, e as demais posições permanecerão vazias");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa29 = new QuestaoAlternativa();
		questaoAlternativa29.setId(29l);
		questaoAlternativa29.setAno(2002);
		questaoAlternativa29.setDescricao("Qual das seguintes afirmaçoes sobre crescimento assintótico de funções não é verdadeira:");
		questaoAlternativa29.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa29.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa29.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa29.setAlternativaCorreta("b");
		questaoAlternativa29.setAlternativasA("$2n^2 + 3n + 1 = O(n^2)$");
		questaoAlternativa29.setAlternativasB("Se $f(n) = O(g(n))$ então $g(n) = O(f(n))$");
		questaoAlternativa29.setAlternativasC("$\\log_{}{n^2} = O(\\log_{}{n})$");
		questaoAlternativa29.setAlternativasD("Se $f(n) = O(g(n))$ e $g(n) = O(h(n))$ então $f(n) = O(h(n))$");
		questaoAlternativa29.setAlternativasE("$2^n+1 = O(2^n)$");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa30 = new QuestaoAlternativa();
		questaoAlternativa30.setId(30l);
		questaoAlternativa30.setAno(2002);
		questaoAlternativa30.setDescricao("Consider um problema em que são dados 5 objetos com os seguintes pesos e valores: \r\n" + 
				"\r\n" + 
				"pesos($W_1, W_2, W_3, W_4, W_5$) = (6, 10, 9, 5, 12) \r\n" + 
				"valores ($P_1, P_2, P_3, P_4, P_5$) = (8, 5, 10, 15, 7). \r\n" + 
				"\r\n" + 
				"Além disso, é dada uma mochila que suporta até 30 unidades de peso, para transportar os objetos. O objetivo do problema é preencher a mochila de tal forma que o valor total dos objetos a serem transportados seja o maior possível, mas sem exceder o limite de peso suportado pela mochila. Assuma que é permitido colocar fração de um objeto na mochila. Qual das seguintes alternativas corresponde ao valor máximo obtido no preenchimento da mochila:");
		questaoAlternativa30.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa30.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa30.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa30.setAlternativaCorreta("d");
		questaoAlternativa30.setAlternativasA("12.2");
		questaoAlternativa30.setAlternativasB("21.5");
		questaoAlternativa30.setAlternativasC("30.34");
		questaoAlternativa30.setAlternativasD("38.83");
		questaoAlternativa30.setAlternativasE("43.1");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa31 = new QuestaoAlternativa();
		questaoAlternativa31.setId(31l);
		questaoAlternativa31.setAno(2002);
		questaoAlternativa31.setDescricao("Considere o algoritmo da busca sequencial de um elemento em um conjunto com $n$ elementos. A expressão que representa o tempo médio de execução desse algoritmo para uma busca bem sucedida é:");
		questaoAlternativa31.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa31.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa31.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa31.setAlternativaCorreta("d");
		questaoAlternativa31.setAlternativasA("$n^2$");
		questaoAlternativa31.setAlternativasB("$n(n+1)/2$");
		questaoAlternativa31.setAlternativasC("$\\log_{2}{n}$");
		questaoAlternativa31.setAlternativasD("$(n + 1)/2$");
		questaoAlternativa31.setAlternativasE("$n \\log_{}{n}$");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa32 = new QuestaoAlternativa();
		questaoAlternativa32.setId(32l);
		questaoAlternativa32.setAno(2002);
		questaoAlternativa32.setDescricao("Considere o algoritmo da busca sequencial de um elemento em um conjunto com $n$ elementos. A expressão que representa o tempo médio de execução desse algoritmo para uma busca bem sucedida é:");
		questaoAlternativa32.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa32.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa32.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
		questaoAlternativa32.setAlternativaCorreta("e");
		questaoAlternativa32.setAlternativasA("Bubble sort e Quick sort");
		questaoAlternativa32.setAlternativasB("Quick sort e merge sort");
		questaoAlternativa32.setAlternativasC("Merge sort e bubble sort");
		questaoAlternativa32.setAlternativasD("Heap sort e selection sort");
		questaoAlternativa32.setAlternativasE("Merge sort e heap sort");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa33 = new QuestaoAlternativa();
		questaoAlternativa33.setId(33l);
		questaoAlternativa33.setAno(2002);
		questaoAlternativa33.setDescricao("Considere o algoritmo da busca sequencial de um elemento em um conjunto com $n$ elementos. A expressão que representa o tempo médio de execução desse algoritmo para uma busca bem sucedida é:");
		questaoAlternativa33.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa33.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa33.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
		questaoAlternativa33.setAlternativaCorreta("e");
		questaoAlternativa33.setAlternativasA("Bubble sort e Quick sort");
		questaoAlternativa33.setAlternativasB("Quick sort e merge sort");
		questaoAlternativa33.setAlternativasC("Merge sort e bubble sort");
		questaoAlternativa33.setAlternativasD("Heap sort e selection sort");
		questaoAlternativa33.setAlternativasE("Merge sort e heap sort");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa34 = new QuestaoAlternativa();
		questaoAlternativa34.setId(34l);
		questaoAlternativa34.setAno(2002);
		questaoAlternativa34.setDescricao("Professor Mac Sperto propôs o seguinte algoritmo de ordenação, chamado de Super Merge, similar ao merge sort: divida o vetor em 4 partes do mesmo tamanho (ao invés de 2, como é feito no merge sort). Ordene recursivamente cada uma das partes e depois intercale-as por um procedimento semelhante ao procedimento de intercalaçao do merge sort. Qual das alternativas abaixo é verdadeira?");
		questaoAlternativa34.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa34.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa34.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
		questaoAlternativa34.setAlternativaCorreta("b");
		questaoAlternativa34.setAlternativasA("Super Merge não está correto. Não é possível ordenar quebrado o vetor em 4 partes");
		questaoAlternativa34.setAlternativasB("Super Merge está correto, mas consome tempo O(merge sort)");
		questaoAlternativa34.setAlternativasC("Super Merge está correto, mas consome tempo maior que O(merge sort)");
		questaoAlternativa34.setAlternativasD("Super Merge está correto, mas consome tempo menor que O(merge sort)");
		questaoAlternativa34.setAlternativasE("Nenhuma das alternativas acima está correta");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa35 = new QuestaoAlternativa();
		questaoAlternativa35.setId(35l);
		questaoAlternativa35.setAno(2002);
		questaoAlternativa35.setDescricao("No que diz respeito as vantagens da arquitetura de micro-núcleo para sistemas operacionais em relação a arquiteturas de núcleo monolítico, quais das seguintes afirmações são verdadeiras? \r\n" + 
				"\r\n" + 
				"I - A arquitetura de micro-núcleo facilita a depuração do SO. \r\n" + 
				"II - A arquitetura de micro-núcleo permite um número menor de mudanças de contexto \r\n" + 
				"III - A arquitetura de micro-núcleo facilita a reconfiguração de serviço do SO pois a maioria deles reside em espaço de usuário.");
		questaoAlternativa35.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa35.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa35.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
		questaoAlternativa35.setAlternativaCorreta("c");
		questaoAlternativa35.setAlternativasA("Apenas I");
		questaoAlternativa35.setAlternativasB("II e III");
		questaoAlternativa35.setAlternativasC("I e III");
		questaoAlternativa35.setAlternativasD("I e II");
		questaoAlternativa35.setAlternativasE("Todas são verdadeiras");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa36 = new QuestaoAlternativa();
		questaoAlternativa36.setId(36l);
		questaoAlternativa36.setAno(2002);
		questaoAlternativa36.setDescricao("Considere um sistema distribuído onde cada nó precisa obter um bloqueio(lock) antes de acessar qualquer serviço no sistema. Qual das estrtégias a seguir não será eficaz para evitar impasses (deadlocks)?");
		questaoAlternativa36.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa36.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa36.setDisciplina(EDisciplina.SISTEMAS_DISTRIBUIDOS);
		questaoAlternativa36.setAlternativaCorreta("a");
		questaoAlternativa36.setAlternativasA("Associar prioridades aos nós e criar filhos de prioridades para cada serviço");
		questaoAlternativa36.setAlternativasB("Numerar os serviços e exigir que cada nó solicite os bloqueios dos serviços em ordem crescente");
		questaoAlternativa36.setAlternativasC("Instalar um serviço de detecção de impasses no sistema distribuído e reiniciar os nós que atinjam um impasse");
		questaoAlternativa36.setAlternativasD("Fazer com que cada nó reinicie sua execução se um pedido de bloqueio não é concedido após um longo tempo de espera. O pedido de bloqueio é reenviado após um tempo aleatório");
		questaoAlternativa36.setAlternativasE("Forçar cada nó a obter todos os bloqueios de que necessita no início de su execução e reiniciar a execução se algum bloqueio não é concedido");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa37 = new QuestaoAlternativa();
		questaoAlternativa37.setId(37l);
		questaoAlternativa37.setAno(2002);
		questaoAlternativa37.setDescricao("Uma árvore binária é declarada em C como \r\n" + 
				"\r\n" + 
				"typedef struct no *apontador;\r\n" + 
				"struct no {\r\n" + 
				"        int valor;\r\n" + 
				"        apontador esq, dir;\r\n" + 
				"};\r\n" + 
				"\r\n" + 
				"onde $esq$ e $dir$ representam ligações para os filhos esquerdo e direito de um nó da árvore, respectvamente. Qual das seguintes alternativas é uma implementação correta da operação que inverte as posições dos filhos esquerdo e direito de um nó $p$ da árvore, onde $t$ é um apontador auxiliar.\r\n" + 
				"");
		questaoAlternativa37.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa37.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa37.setDisciplina(EDisciplina.ESTRUTURAS_DE_DADOS);
		questaoAlternativa37.setAlternativaCorreta("e");
		questaoAlternativa37.setAlternativasA("t = p; \r\n" + 
				"p->esq = p->dir; \r\n" + 
				"p->dir = p->esq        ");
		questaoAlternativa37.setAlternativasB("p->dir = t; \r\n" + 
				"p->esq = p->dir; \r\n" + 
				"p->dir = t        ");
		questaoAlternativa37.setAlternativasC("p->esq = p->dir; \r\n" + 
				"t = p->esq; \r\n" + 
				"p->dir = t        ");
		questaoAlternativa37.setAlternativasD("t = p->dir; \r\n" + 
				"p->esq = p->dir; \r\n" + 
				"p->dir = t        ");
		questaoAlternativa37.setAlternativasE("t = p->dir; \r\n" + 
				"p->dir = p-esq; \r\n" + 
				"p->esq = t");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa38 = new QuestaoAlternativa();
		questaoAlternativa38.setId(38l);
		questaoAlternativa38.setAno(2002);
		questaoAlternativa38.setDescricao("No programa abaixo, escrito em Pascal, os parâmetros do procedimento vr são passados por valor. \r\n" + 
				" \r\n" + 
				"program teste;\r\n" + 
				"var x,y: integer;\r\n" + 
				"\r\n" + 
				"	prcedure vr(u,v : integer);\r\n" + 
				"	begin\r\n" + 
				"		u:=2*u;\r\n" + 
				"		x:=u+v;\r\n" + 
				"		u:=u-1;\r\n" + 
				"	end\r\n" + 
				"	\r\n" + 
				"	begin\r\n" + 
				"		x:=4;\r\n" + 
				"		y:=2;\r\n" + 
				"		vr(x,y)\r\n" + 
				"		writeln(x)\r\n" + 
				"	end\r\n" + 
				"\r\n" + 
				"O valor de x impresso na última linha do programa é:");
		questaoAlternativa38.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa38.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa38.setDisciplina(EDisciplina.PROGRAMACAO);
		questaoAlternativa38.setAlternativaCorreta("e");
		questaoAlternativa38.setAlternativasA("4");
		questaoAlternativa38.setAlternativasB("5");
		questaoAlternativa38.setAlternativasC("7");
		questaoAlternativa38.setAlternativasD("8");
		questaoAlternativa38.setAlternativasE("10");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa39 = new QuestaoAlternativa();
		questaoAlternativa39.setId(39l);
		questaoAlternativa39.setAno(2002);
		questaoAlternativa39.setDescricao("A função abaixo computa a soma dos n primeiros números inteiros não negativos:\r\n" + 
				" \r\n" + 
				"function sum(n:integer): integer;\r\n" + 
				"begin\r\n" + 
				"        if n=0 then sum: =0\r\n" + 
				"        else ------------\r\n" + 
				"end;\r\n" + 
				" \r\n" + 
				"A parte que falta para completar a condição é:");
		questaoAlternativa39.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa39.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa39.setDisciplina(EDisciplina.PROGRAMACAO);
		questaoAlternativa39.setAlternativaCorreta("d");
		questaoAlternativa39.setAlternativasA("while n<>0 sum:=sum + sum(n=1)");
		questaoAlternativa39.setAlternativasB("sum:=n + sum(n)");
		questaoAlternativa39.setAlternativasC("sum:=(n-1) + sum(n-1)");
		questaoAlternativa39.setAlternativasD("sum:=n + sum(n-1)");
		questaoAlternativa39.setAlternativasE("sum:=(n-1) + sum(n)");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa40 = new QuestaoAlternativa();
		questaoAlternativa40.setId(40l);
		questaoAlternativa40.setAno(2002);
		questaoAlternativa40.setDescricao("O menor número possível de arestas em um grafo conexo com n vértices é:");
		questaoAlternativa40.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa40.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa40.setDisciplina(EDisciplina.GRAFOS);
		questaoAlternativa40.setAlternativaCorreta("c");
		questaoAlternativa40.setAlternativasA("$1$");
		questaoAlternativa40.setAlternativasB("$n/2$");
		questaoAlternativa40.setAlternativasC("$n-1$");
		questaoAlternativa40.setAlternativasD("$n$");
		questaoAlternativa40.setAlternativasE("$n^2$");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa41 = new QuestaoAlternativa();
		questaoAlternativa41.setId(41l);
		questaoAlternativa41.setAno(2002);
		questaoAlternativa41.setDescricao("Considere um grafo G satisfazendo as seguintes propriedades:  \r\n" + 
				"• G é conexo\r\n" + 
				"• Se removermos qualquer aresta de G, o grafo obtido é desconexo.\r\n" + 
				"Então é correto afirmar que o grafo G é:");
		questaoAlternativa41.setArea(EArea.FUNDAMENTOS_DE_COMPUTACAO);
		questaoAlternativa41.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa41.setDisciplina(EDisciplina.GRAFOS);
		questaoAlternativa41.setAlternativaCorreta("c");
		questaoAlternativa41.setAlternativasA("$1$");
		questaoAlternativa41.setAlternativasB("$n/2$");
		questaoAlternativa41.setAlternativasC("$n-1$");
		questaoAlternativa41.setAlternativasD("$n$");
		questaoAlternativa41.setAlternativasE("$n^2$");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa42 = new QuestaoAlternativa();
		questaoAlternativa42.setId(42l);
		questaoAlternativa42.setAno(2002);
		questaoAlternativa42.setDescricao("Supondo a Relação PROJ (PNO, Nome, Orçam), com chave primária PNO e a Relação\r\n" + 
				"DSG (ENO, PNO, Dur, Resp), com chave primária {ENO, PNO} e chave estrangeira PNO\r\n" + 
				"em relação a PROJ, a asserção abaixo NÃO expressa:\r\n" + 
				"\r\n" + 
				"∀g ∈ DSG, ∃j ∈ PROJ : g.PNO = j.PNO");
		questaoAlternativa42.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa42.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa42.setDisciplina(EDisciplina.GRAFOS);
		questaoAlternativa42.setAlternativaCorreta("c");
		questaoAlternativa42.setAlternativasA("Uma restrição que define um estado consistente do banco de dados. ");
		questaoAlternativa42.setAlternativasB("Uma restrição a ser verificada na inserção de tuplas em DSG.");
		questaoAlternativa42.setAlternativasC("Uma restrição de integridade de chave primária em PROJ.");
		questaoAlternativa42.setAlternativasD("Uma restrição de integridade de chave estrangeira em DSG. ");
		questaoAlternativa42.setAlternativasE("Uma restrição a ser verificada na atualização de tuplas em DSG. ");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa43 = new QuestaoAlternativa();
		questaoAlternativa43.setId(43l);
		questaoAlternativa43.setAno(2002);
		questaoAlternativa43.setDescricao("Dentre as definições a seguir, ligadas ao conceito de normalização do modelo relacional, qual delas é INCORRETA?");
		questaoAlternativa43.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa43.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa43.setDisciplina(EDisciplina.BANCO_DE_DADOS);
		questaoAlternativa43.setAlternativaCorreta("b");
		questaoAlternativa43.setAlternativasA("Programas aplicativos do banco de dados podem ser executados sobre visões de relações da base de dados.");
		questaoAlternativa43.setAlternativasB("Uma visão relacional é uma relação virtual que nunca é materializada.");
		questaoAlternativa43.setAlternativasC("Uma visão relacional é uma relação virtual, derivada de relações base a partir da especificação de operações da álgebra relacional. ");
		questaoAlternativa43.setAlternativasD("Uma visão é útil por representar uma percepção particular do banco de dados, compartilhado por muitos aplicativos.");
		questaoAlternativa43.setAlternativasE("O gerenciamento de visões envolve a conversão da consulta do usuário sobre as visões para a consulta sobre as relações base.");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa44 = new QuestaoAlternativa();
		questaoAlternativa44.setId(44l);
		questaoAlternativa44.setAno(2002);
		questaoAlternativa44.setDescricao("Supondo a Relação PROJ (PNO, Orçam), com chave primária PNO, a Relação EMP\r\n" + 
				"(ENO, ENome, Cargo) com chave primária ENO, e a Relação DSG (ENO, PNO, Dur,\r\n" + 
				"Resp), com chave primária {ENO, PNO}, chave estrangeira PNO em relação a PROJ e\r\n" + 
				"chave estrangeira ENO em relação a EMP. Qual das expressões da álgebra relacional\r\n" + 
				"abaixo NÃO corresponde à seguinte consulta SQL:\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"SELECT ENome FROM EMP, PROJ, DSG WHERE EMP.ENO = DSG.ENO AND PROJ.PNO = DSG.PNO AND Dur > 36");
		
		questaoAlternativa44.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa44.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa44.setDisciplina(EDisciplina.BANCO_DE_DADOS);
		questaoAlternativa44.setAlternativaCorreta("e");
		questaoAlternativa44.setAlternativasA("$\\pi_{ENome} (PROJ \\bowtie_{PNO} ( EMP \\bowtie_{ENO} \\sigma_{ Dur} > 36 (DSG)))$");
		questaoAlternativa44.setAlternativasB("$\\pi_{ENome} (PROJ \\bowtie_{PNO} ((\\pi_{ENome, ENO} (EMP)) \\bowtie_{ENO} ( \\sigma_{Dur} > 36 (DSG)))$");
		questaoAlternativa44.setAlternativasC("$\\pi_{ENome} (PROJ \\bowtie_{PNO} (\\sigma_{Dur > 36} (EMP \\bowtie_{ENO} (DSG) ))) $");
		questaoAlternativa44.setAlternativasD("$\\pi_{ENome} (\\sigma_{Dur > 36} ((\\pi_{ PNO} (PROJ))\\bowtie_{PNO} ( EMP\\bowtie_{ENO} DSG))) $");
		questaoAlternativa44.setAlternativasE("$\\pi_{ENome} (PROJ \\bowtie_{PNO} ( EMP \\bowtie_{ ENO} \\sigma _{Dur > 36} (\\pi_{ Dur} (DSG)))) $");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa45 = new QuestaoAlternativa();
		questaoAlternativa45.setId(45l);
		questaoAlternativa45.setAno(2002);
		questaoAlternativa45.setDescricao("Dentre as características do modelo relacional e do modelo de objetos em bancos de dados, qual afirmação é INCORRETA? ");
		questaoAlternativa45.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa45.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa45.setDisciplina(EDisciplina.BANCO_DE_DADOS);
		questaoAlternativa45.setAlternativaCorreta("a");
		questaoAlternativa45.setAlternativasA("O relacionamento de herança é diretamente representado no modelo relacional.");
		questaoAlternativa45.setAlternativasB("O relacionamento binário N x M é representado de modo semelhante nos dois modelos.");
		questaoAlternativa45.setAlternativasC("O modelo de objetos possui mais recursos estruturais para a representação de dados que o relacional. ");
		questaoAlternativa45.setAlternativasD("O modelo de objetos provê uma representação bem próxima de linguagens de programação.");
		questaoAlternativa45.setAlternativasE("O modelo de objetos é mais adequado para a representação de tipos abstratos de dados.");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa46 = new QuestaoAlternativa();
		questaoAlternativa46.setId(46l);
		questaoAlternativa46.setAno(2002);
		questaoAlternativa46.setDescricao("Considere C(x) uma função que define a complexidade de um problema x; E(x) uma função que define o esforço (em termos de tempo) exigido para se resolver o problema x. Sejam dois problemas denominados p1 e p2. Assinale a alternativa correta.");
		questaoAlternativa46.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa46.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa46.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa46.setAlternativaCorreta("a");
		questaoAlternativa46.setAlternativasA("Se C(p1) < C(p2) então E(p1) < E(p2)");
		questaoAlternativa46.setAlternativasB("Se C(p1) < C(p2) então E(p1) > E(p2) ");
		questaoAlternativa46.setAlternativasC("E(p1+p2) < E(p1) + E(p2)");
		questaoAlternativa46.setAlternativasD("C(p1+p2) < C(p1) + C(p2)");
		questaoAlternativa46.setAlternativasE(" Nenhuma das alternativas anteriores");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa47 = new QuestaoAlternativa();
		questaoAlternativa47.setId(47l);
		questaoAlternativa47.setAno(2002);
		questaoAlternativa47.setDescricao("Sobre a UML, quais das seguintes afirmações são verdadeiras?\r\n" + 
				"\r\n" + 
				"I) A UML é o método de desenvolvimento de software mais utilizado na atualidade.\r\n" + 
				"\r\n" + 
				"II) A UML é uma evolução das linguagens para especificação dos conceitos dos métodos de\r\n" + 
				"Booch, OMT e OOSE e também de outros métodos de especificação de requisitos de\r\n" + 
				"software orientados a objetos ou não.\r\n" + 
				"\r\n" + 
				"III) A UML é composta dos seguintes diagramas: Diagrama de Caso de Uso, Diagrama de\r\n" + 
				"Classes, Diagrama de Colaboração, Diagrama de Estados, entre outros.\r\n" + 
				"\r\n" + 
				"IV) Em UML pode-se representar tão somente relacionamentos de Agregação, Associação e\r\n" + 
				"Composição. ");
		questaoAlternativa47.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa47.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa47.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
		questaoAlternativa47.setAlternativaCorreta("d");
		questaoAlternativa47.setAlternativasA("Todas as alternativas.");
		questaoAlternativa47.setAlternativasB("Apenas as alternativas I, II e III.");
		questaoAlternativa47.setAlternativasC("Apenas as alternativas III e IV.");
		questaoAlternativa47.setAlternativasD("Apenas as alternativas II e III.");
		questaoAlternativa47.setAlternativasE("Nenhuma delas.");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa48 = new QuestaoAlternativa();
		questaoAlternativa48.setId(48l);
		questaoAlternativa48.setAno(2002);
		questaoAlternativa48.setDescricao("Marque a alternativa onde todos os conceitos estão corretos.");
		questaoAlternativa48.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa48.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa48.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
		questaoAlternativa48.setAlternativaCorreta("b");
		questaoAlternativa48.setAlternativasA("Em um diagrama de fluxo de dados, uma entidade externa representa um produtor ou um consumidor de informação e está fora dos limites do sistema modelado; cada processo pode ser refinado, para explicitar um maior detalhamento; um DFD contém dois níveis de detalhamento; um\r\n" + 
				"processo é um transformador de informação e também está fora do sistema; o nível 0 de um DFD representa o sistema como um todo e indica os principais usuários e as funções do sistema. ");
		questaoAlternativa48.setAlternativasB("Em um diagrama de fluxo de dados uma entidade externa representa uma fonte ou destino das informações processadas pelo sistema e está fora dos limites do sistema modelado; cada processo pode ser refinado, para explicitar um maior detalhamento; um DFD pode conter vários níveis de detalhamento; um processo é um transformador de informação; o nível 0 de um DFD representa o sistema como um todo e indica as principais fontes e destinos das informações, usualmente referenciado por Diagrama de Contexto. ");
		questaoAlternativa48.setAlternativasC("Em um diagrama de fluxo de dados uma entidade externa representa um produtor ou um consumidor de informação e está fora dos limites do sistema modelado; cada processo deve ser refinado, para explicitar um maior detalhamento; um DFD pode conter vários níveis de detalhamento; um processo é um transformador de informação e também está fora do sistema; o nível 0 de um DFD representa o sistema como um todo e indica os principais usuários e as funções do sistema.");
		questaoAlternativa48.setAlternativasD("Em um diagrama de fluxo de dados uma entidade externa representa uma fonte ou destino das informações processadas pelo sistema e está fora dos limites do sistema modelado; cada processo\r\n" + 
				"pode ser refinado, para explicitar um maior detalhamento; um DFD pode conter vários níveis de detalhamento; um processo é um transformador de informação e também está fora do sistema; o nível 0 de um DFD representa o sistema como um todo e indica as principais fontes e destinos das informações. ");
		questaoAlternativa48.setAlternativasE("Nenhuma das alternativas anteriores.");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa49 = new QuestaoAlternativa();
		questaoAlternativa49.setId(49l);
		questaoAlternativa49.setAno(2002);
		questaoAlternativa49.setDescricao("Considerando a rede de Petri abaixo, quais das alternativas são verdadeiras?\r\n" + 
				"\r\n" + 
				"I) O lugar A está habilitado a disparar.\r\n" + 
				"II) Apenas a transição T1 está habilitada a disparar.\r\n" + 
				"III) A seqüência de transições (T1, T2, T3, T2) pode ser disparada, nessa ordem.\r\n" + 
				"IV) A transição T4 nunca poderá ser disparada. \r\n" + 
				"\r\n" + 
				"<IMAGEM = 49>");
		questaoAlternativa49.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa49.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa49.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
		questaoAlternativa49.setAlternativaCorreta("e");
		questaoAlternativa49.setImagem(true);
		questaoAlternativa49.setAlternativasA("Todas as alternativas.");
		questaoAlternativa49.setAlternativasB("Apenas as alternativas II e III.");
		questaoAlternativa49.setAlternativasC("Apenas as alternativas I e III.");
		questaoAlternativa49.setAlternativasD("Apenas as alternativas II, III e IV.");
		questaoAlternativa49.setAlternativasE("Apenas as alternativas II, IV. ");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa50 = new QuestaoAlternativa();
		questaoAlternativa50.setId(50l);
		questaoAlternativa50.setAno(2002);
		questaoAlternativa50.setDescricao("Quais das seguintes afirmações são verdadeiras? As Métricas de software servem para:\r\n" + 
				"I) indicar a qualidade do produto e avaliar a produtividade.\r\n" + 
				"II) auxiliar na melhoria do processo.\r\n" + 
				"III) formar uma base para as estimativas e justificar a aquisição de ferramentas.\r\n" + 
				"IV) determinar se a utilização de um método traz benefícios ou não. ");
		questaoAlternativa50.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa50.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa50.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
		questaoAlternativa50.setAlternativaCorreta("a");
		questaoAlternativa50.setAlternativasA("Todas as alternativas.");
		questaoAlternativa50.setAlternativasB("Apenas as alternativas I, II e IV.");
		questaoAlternativa50.setAlternativasC("Apenas as alternativas I, IV.");
		questaoAlternativa50.setAlternativasD("Apenas as alternativas II e III.");
		questaoAlternativa50.setAlternativasE("Nenhuma delas.");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa51 = new QuestaoAlternativa();
		questaoAlternativa51.setId(51l);
		questaoAlternativa51.setAno(2002);
		questaoAlternativa51.setDescricao("Histograma de uma imagem com K tons de cinza é : ");
		questaoAlternativa51.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa51.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa51.setDisciplina(EDisciplina.ENGENHARIA_DE_SOFTWARE);
		questaoAlternativa51.setAlternativaCorreta("c");
		questaoAlternativa51.setAlternativasA("O relacionamento de herança é diretamente representado no modelo relacional.");
		questaoAlternativa51.setAlternativasB("O relacionamento binário N x M é representado de modo semelhante nos dois modelos.");
		questaoAlternativa51.setAlternativasC("O modelo de objetos possui mais recursos estruturais para a representação de dados que o relacional.");
		questaoAlternativa51.setAlternativasD("O modelo de objetos provê uma representação bem próxima de linguagens de programação.");
		questaoAlternativa51.setAlternativasE("O modelo de objetos é mais adequado para a representação de tipos abstratos de dados.");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa52 = new QuestaoAlternativa();
		questaoAlternativa52.setId(52l);
		questaoAlternativa52.setAno(2002);
		questaoAlternativa52.setDescricao("Filtro da mediana é:");
		questaoAlternativa52.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa52.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa52.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
		questaoAlternativa52.setAlternativaCorreta("b");
		questaoAlternativa52.setAlternativasA("Indicado para detectar bordas em imagens.");
		questaoAlternativa52.setAlternativasB("Indicado para atenuar ruído com preservação de bordas (i.é rápidas transições de nível em imagens). ");
		questaoAlternativa52.setAlternativasC("Indicado para detectar formas específicas em imagens. ");
		questaoAlternativa52.setAlternativasD("Indicado para detectar tonalidades específicas em uma imagem.");
		questaoAlternativa52.setAlternativasE("Nenhuma das respostas acima.");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa53 = new QuestaoAlternativa();
		questaoAlternativa53.setId(53l);
		questaoAlternativa53.setAno(2002);
		questaoAlternativa53.setDescricao("$\\textbf{Considere uma cena representada no sistema de referência do universo (SRU), uma\r\n" + 
				"window definida pelo par de coordenadas (0,0)-(100,100) e uma viewport definida pelo par\r\n" + 
				"de coordenadas (20,30)-(300,100). Considere ainda que as coordenadas que definem\r\n" + 
				"window e viewport correspondem, respectivamente, aos limites inferior esquerdo e\r\n" + 
				"superior direito de ambas. Analise as afirmativas abaixo levando em consideração os\r\n" + 
				"conceitos clássicos de window e viewport e assinale a alternativa correta.}$\r\n" + 
				"\r\n" + 
				"I – Window e viewport estão definidas no SRU.\r\n" + 
				"\r\n" + 
				"II – No processo de mapeamento desta window para esta viewport haverá modificação na\r\n" + 
				"relação de aspecto.\r\n" + 
				"\r\n" + 
				"III – O mapeamento da window redefinida pelo par de coordenadas (0,0) – (50,50) para a\r\n" + 
				"mesma viewport (20,30)-(300,100) corresponde a uma operação de zoom out sobre o mesmo\r\n" + 
				"universo. ");
		questaoAlternativa53.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa53.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa53.setDisciplina(EDisciplina.COMPUTACAO_GRAFICA);
		questaoAlternativa53.setAlternativaCorreta("b");
		questaoAlternativa53.setAlternativasA("As alternativas I e II são verdadeiras ");
		questaoAlternativa53.setAlternativasB("As alternativas I e III são falsas");
		questaoAlternativa53.setAlternativasC("Apenas a afirmativa III é verdadeira");
		questaoAlternativa53.setAlternativasD("As afirmativas II e III são verdadeiras");
		questaoAlternativa53.setAlternativasE(" As alternativas I e II são falsas");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa54 = new QuestaoAlternativa();
		questaoAlternativa54.setId(54l);
		questaoAlternativa54.setAno(2002);
		questaoAlternativa54.setDescricao("Qual das seguintes condições não é necessária para a ocorrência de um deadlock?");
		questaoAlternativa54.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa54.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa54.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
		questaoAlternativa54.setAlternativaCorreta("c");
		questaoAlternativa54.setAlternativasA("Uso mutuamente exclusivo de recursos por processos.");
		questaoAlternativa54.setAlternativasB("Alocação parcial de recursos a processos.");
		questaoAlternativa54.setAlternativasC("Escalonamento preemptivo de recursos.");
		questaoAlternativa54.setAlternativasD("Processos em espera circular.");
		questaoAlternativa54.setAlternativasE("Haver compartilhamento de recursos por processos.");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa55 = new QuestaoAlternativa();
		questaoAlternativa55.setId(55l);
		questaoAlternativa55.setAno(2002);
		questaoAlternativa55.setDescricao("Starvation ocorre quando: ");
		questaoAlternativa55.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa55.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa55.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
		questaoAlternativa55.setAlternativaCorreta("a");
		questaoAlternativa55.setAlternativasA("Pelo menos um processo é continuamente postergado e não executa. ");
		questaoAlternativa55.setAlternativasB("A prioridade de um processo é ajustada de acordo com o tempo total de execução do mesmo. ");
		questaoAlternativa55.setAlternativasC("Pelo menos um evento espera por um evento que não vai ocorrer.");
		questaoAlternativa55.setAlternativasD(" Dois ou mais processos são forçados a acessar dados críticos alternando estritamente entre eles.");
		questaoAlternativa55.setAlternativasE("O processo tenta mas não consegue acessar uma variável compartilhada.");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa56 = new QuestaoAlternativa();
		questaoAlternativa56.setId(56l);
		questaoAlternativa56.setAno(2002);
		questaoAlternativa56.setDescricao("Quando trabalhando com sistemas baseados em trocas de mensagens, temporizações (time-outs) são utilizadas para:");
		questaoAlternativa56.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa56.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa56.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
		questaoAlternativa56.setAlternativaCorreta("b");
		questaoAlternativa56.setAlternativasA("Limitar o número de retransmissões de uma mensagem.");
		questaoAlternativa56.setAlternativasB("Arbitrar que uma mensagem transmitida foi perdida.");
		questaoAlternativa56.setAlternativasC("Temporariamente suspender a transmissão de mensagens.");
		questaoAlternativa56.setAlternativasD("Limitar o tamanho de uma mensagem transmitida.");
		questaoAlternativa56.setAlternativasE("Limitar o tempo para obter um recurso.");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa57 = new QuestaoAlternativa();
		questaoAlternativa57.setId(57l);
		questaoAlternativa57.setAno(2002);
		questaoAlternativa57.setDescricao("Sistemas de processamento de transações, tais como sistemas de reservas aéreas, devem prover um mecanismo que garanta que cada transação não é afetada por outras transações que possam estar ocorrendo ao mesmo tempo. Transações de duas fases obedecem a um protocolo que garante essa atomicidade. Em transações de duas fases:");
		questaoAlternativa57.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa57.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa57.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
		questaoAlternativa57.setAlternativaCorreta("b");
		questaoAlternativa57.setAlternativasA("Todas as operações de leitura ocorrem antes da primeira operação de escrita. ");
		questaoAlternativa57.setAlternativasB("Todas as ações de travamento (lock) ocorrem antes da primeira ação de destravamento. ");
		questaoAlternativa57.setAlternativasC("Uma trava compartilhada sobre um objeto deve ser obtida antes de uma trava exclusiva sobre o objeto ser obtida.");
		questaoAlternativa57.setAlternativasD("Qualquer objeto correntemente travado deve ser destravado antes que outro objeto possa ser travado.");
		questaoAlternativa57.setAlternativasE("Verifica-se a disponibilidade de todas as travas antes de executar qualquer ação de travamento. ");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa58 = new QuestaoAlternativa();
		questaoAlternativa58.setId(58l);
		questaoAlternativa58.setAno(2002);
		questaoAlternativa58.setDescricao("Qual o significado de coerência de memórias cache em sistemas multiprocessados? ");
		questaoAlternativa58.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa58.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa58.setDisciplina(EDisciplina.SISTEMAS_OPERACIONAIS);
		questaoAlternativa58.setAlternativaCorreta("a");
		questaoAlternativa58.setAlternativasA("Caches em processadores diferentes sempre contêm o mesmo dado válido para a mesma linha de cache.");
		questaoAlternativa58.setAlternativasB("Caches em processadores diferentes nunca compartilham a mesma linha de cache.");
		questaoAlternativa58.setAlternativasC("Caches em processadores diferentes nunca interagem entre si.");
		questaoAlternativa58.setAlternativasD("Caches em processadores diferentes sempre lêem os mesmos dados ao mesmo tempo.");
		questaoAlternativa58.setAlternativasE("Caches em processadores diferentes podem possuir dados diferentes associados à mesma linha de cache.");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa59 = new QuestaoAlternativa();
		questaoAlternativa59.setId(59l);
		questaoAlternativa59.setAno(2002);
		questaoAlternativa59.setDescricao("Seja a árvore binária abaixo a representação de um espaço de estados para um problema\r\n" + 
				"p, em que o estado inicial é a, e i e f são estados finais. \r\n" + 
				"\r\n" + 
				"<IMAGEM = 59>\r\n" + 
				"\r\n" + 
				"Um algoritmo de busca em largura-primeiro forneceria a seguinte seqüência de estados como\r\n" + 
				"primeira alternativa a um caminho-solução para o problema p: ");
		questaoAlternativa59.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa59.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa59.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
		questaoAlternativa59.setAlternativaCorreta("b");
		questaoAlternativa59.setImagem(true);
		questaoAlternativa59.setAlternativasA("a b d h e i");
		questaoAlternativa59.setAlternativasB("a b c d e f");
		questaoAlternativa59.setAlternativasC("a b e i");
		questaoAlternativa59.setAlternativasD("a c f");
		questaoAlternativa59.setAlternativasE("a b d e f");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa60 = new QuestaoAlternativa();
		questaoAlternativa60.setId(60l);
		questaoAlternativa60.setAno(2002);
		questaoAlternativa60.setDescricao("Sejam os seguintes predicados de uma linguagem de primeira ordem:\\ N (x) : x é número; \r\n" + 
				"\\P (x) : x tem propriedade P;\r\n" + 
				"\\x $<$ y : x é menor que y. \\ E sejam os símbolos: \\\r\n" + 
				"$\\forall$: quantificador universal;\\\r\n" + 
				"$=>$ : operador se-então;\\\r\n" + 
				"$\\neg$ : operador de negação.\\\r\n" + 
				"\r\n" + 
				"Para a fórmula: $\\forall$ x (N(x) $=>$ $\\neg\\forall$y (N(y) $=>$ y $<$ x))), qual alternativa abaixo NÃO constitui\r\n" + 
				"uma tradução possível?");
		questaoAlternativa60.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa60.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa60.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
		questaoAlternativa60.setAlternativaCorreta("e");
		questaoAlternativa60.setAlternativasA("Não há um número tal que todos os números são menores do que ele.");
		questaoAlternativa60.setAlternativasB("Para todo número, existe um outro número que é maior do que ele. ");
		questaoAlternativa60.setAlternativasC("Para todo número, não é verdade que qualquer número seja menor do que ele. ");
		questaoAlternativa60.setAlternativasD("Para qualquer x, se x é número, então não é verdade que todos os números são menores do que ele.");
		questaoAlternativa60.setAlternativasE("Não há um número menor do que outro número.");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa61 = new QuestaoAlternativa();
		questaoAlternativa61.setId(61l);
		questaoAlternativa61.setAno(2002);
		questaoAlternativa61.setDescricao("Dada a seguinte fórmula (lógica de primeira ordem):\r\n" + 
				" \r\n" + 
				" $\\forall$ x $\\exists$ y $\\mid$ ama(x,y)\r\n" + 
				" \r\n" + 
				"qual das seguintes sentenças em linguagem natural ela representa, considerando que ama(x,y)\r\n" + 
				"representa que x ama y?");
		questaoAlternativa61.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa61.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa61.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
		questaoAlternativa61.setAlternativaCorreta("b");
		questaoAlternativa61.setAlternativasA("Alguém ama a todos. ");
		questaoAlternativa61.setAlternativasB("Todos amam alguém.");
		questaoAlternativa61.setAlternativasC("Ninguém ama a todos.");
		questaoAlternativa61.setAlternativasD("Há alguém que todos amam.");
		questaoAlternativa61.setAlternativasE("Nenhuma das anteriores.");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa62 = new QuestaoAlternativa();
		questaoAlternativa62.setId(62l);
		questaoAlternativa62.setAno(2002);
		questaoAlternativa62.setDescricao("Em qual das situações abaixo um sistema de Raciocínio Baseado em Casos não deve ser utilizado? ");
		questaoAlternativa62.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa62.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa62.setDisciplina(EDisciplina.INTELIGENCIA_ARTIFICIAL);
		questaoAlternativa62.setAlternativaCorreta("e");
		questaoAlternativa62.setAlternativasA("Quando a experiência for tão valiosa quanto o conhecimento em livros texto.");
		questaoAlternativa62.setAlternativasB("Em aplicações de diagnóstico médico.");
		questaoAlternativa62.setAlternativasC("Quando especialistas conversam sobre seus domínios dando exemplos.");
		questaoAlternativa62.setAlternativasD("Quando as regras utilizadas apresentam um grande número de exceções.");
		questaoAlternativa62.setAlternativasE("Quando for fácil a obtenção de regras do especialista do domínio.");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa63 = new QuestaoAlternativa();
		questaoAlternativa63.setId(63l);
		questaoAlternativa63.setAno(2002);
		questaoAlternativa63.setDescricao("Uma integração de Sistemas Computacionais formando uma rede, tipicamente é implementada através da instalação de uma Arquitetura de Rede, que é composta de camadas e protocolos, em cada um dos elementos que compõem esta rede. Considere que estações “conversam” quando aplicações de usuários conseguem comunicar-se, sintática e semanticamente, através da Rede de Computadores. Baseados nesta premissa e em todos os conceitos associados à implementação e utilização das redes de computadores podemos afirmar como certo: ");
		questaoAlternativa63.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa63.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa63.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
		questaoAlternativa63.setAlternativaCorreta("c");
		questaoAlternativa63.setAlternativasA("Computadores com arquiteturas de redes diferentes conseguem “conversar”.");
		questaoAlternativa63.setAlternativasB("Computadores com arquiteturas de rede parecidas conseguem “conversar”.");
		questaoAlternativa63.setAlternativasC("Computadores com arquiteturas de redes diferentes podem “conversar” através de um gateway ou conversor de protocolos.");
		questaoAlternativa63.setAlternativasD("Computadores com arquiteturas diferentes podem “conversar” através de multiplexadores.");
		questaoAlternativa63.setAlternativasE("Nenhuma delas é uma afirmação correta.");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa64 = new QuestaoAlternativa();
		questaoAlternativa64.setId(64l);
		questaoAlternativa64.setAno(2002);
		questaoAlternativa64.setDescricao("Assinale a alternativa INCORRETA:");
		questaoAlternativa64.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa64.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa64.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
		questaoAlternativa64.setAlternativaCorreta("b");
		questaoAlternativa64.setAlternativasA("Nos serviços orientados a conexões há a necessidade de estabelecimento de uma conexão antes da transferência dos dados.");
		questaoAlternativa64.setAlternativasB("Os serviços orientados a conexões são sempre confiáveis garantindo a entrega ordenada e completa dos dados transmitidos.");
		questaoAlternativa64.setAlternativasC("Serviços orientados a conexão podem ser implementados em subredes que funcionam no modo datagrama.");
		questaoAlternativa64.setAlternativasD("O controle de fluxo tem como objetivo garantir que nenhum dos parceiros de uma comunicação inunda o outro enviando pacotes mais rápido do que ele pode tratar.");
		questaoAlternativa64.setAlternativasE("Os serviços orientados a conexão podem ajudar no controle de congestionamento através da diminuição da taxa de transmissão durante um congestionamento em andamento.");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa65 = new QuestaoAlternativa();
		questaoAlternativa65.setId(65l);
		questaoAlternativa65.setAno(2002);
		questaoAlternativa65.setDescricao("Na criptografia com chave pública:");
		questaoAlternativa65.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa65.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa65.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
		questaoAlternativa65.setAlternativaCorreta("b");
		questaoAlternativa65.setAlternativasA("O sigilo é obtido através da codificação com a chave privada do remetente e decifragem com a chave pública do destinatário.");
		questaoAlternativa65.setAlternativasB("O sigilo é obtido através da codificação com a chave pública do destinatário e decifragem com a chave privada do destinatário.");
		questaoAlternativa65.setAlternativasC("O sigilo é obtido através da codificação com a chave privada do destinatário e decifragem com a chave pública do destinatário.");
		questaoAlternativa65.setAlternativasD("Para assinar digitalmente uma mensagem codifica-se a mesma com a chave pública do remetente e esta é decifrada com a chave privada do destinatário.");
		questaoAlternativa65.setAlternativasE("Para assinar digitalmente uma mensagem codifica-se a mesma com a chave pública do destinatário e esta é decifrada com a chave privada do destinatário.");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa66 = new QuestaoAlternativa();
		questaoAlternativa66.setId(66l);
		questaoAlternativa66.setAno(2002);
		questaoAlternativa66.setDescricao("Quanto ao TCP, é INCORRETO afirmar:");
		questaoAlternativa66.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa66.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa66.setDisciplina(EDisciplina.REDES_DE_COMPUTADORES);
		questaoAlternativa66.setAlternativaCorreta("e");
		questaoAlternativa66.setAlternativasA("É um protocolo do nível de transporte.");
		questaoAlternativa66.setAlternativasB("Usa janelas deslizantes para implementar o controle de fluxo e erro.");
		questaoAlternativa66.setAlternativasC("É um protocolo orientado a conexão.");
		questaoAlternativa66.setAlternativasD("Utiliza portas para permitir a comunicação entre processos localizados em dispositivos diferentes.");
		questaoAlternativa66.setAlternativasE("Possui um campo de checksum que valida as informações de seu cabeçalho, mas não valida as informações de payload (campo de dados).");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa67 = new QuestaoAlternativa();
		questaoAlternativa67.setId(67l);
		questaoAlternativa67.setAno(2002);
		questaoAlternativa67.setDescricao("Para a gramática a seguir, qual o conjunto de terminais que pode aparecer como primeiro\r\n" + 
				"terminal após o não-terminal A, em qualquer forma sentencial gerada pela gramática\r\n" + 
				"abaixo (isto é, não necessariamente imediatamente após A), onde ε representa a sentença\r\n" + 
				"vazia? \\ $S \\rightarrow ABCDd$ \\\r\n" + 
				"$A \\rightarrow aA \\mid \\varepsilon$ \\\r\n" + 
				"$B \\rightarrow bC \\mid \\varepsilon$ \\\r\n" + 
				"$C \\rightarrow cD \\mid \\varepsilon$ \\\r\n" + 
				"$D \\rightarrow \\varepsilon$ \\\r\n");
		questaoAlternativa67.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa67.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa67.setDisciplina(EDisciplina.LINGUAGENS_E_PARADIGMAS_DE_PROGRAMACAO);
		questaoAlternativa67.setAlternativaCorreta("d");
		questaoAlternativa67.setAlternativasA("$\\left\\{d\\right\\}$");
		questaoAlternativa67.setAlternativasB("$\\left\\{b\\right\\}$");
		questaoAlternativa67.setAlternativasC("$\\left\\{b,c,e\\right\\}$");
		questaoAlternativa67.setAlternativasD("$\\left\\{b,c,d,e\\right\\}$");
		questaoAlternativa67.setAlternativasE("$\\left\\{e\\right\\}$");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa68 = new QuestaoAlternativa();
		questaoAlternativa68.setId(68l);
		questaoAlternativa68.setAno(2002);
		questaoAlternativa68.setDescricao("Qual das afirmações a seguir, relativas à análise sintática, está INCORRETA?");
		questaoAlternativa68.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa68.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa68.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa68.setAlternativaCorreta("a");
		questaoAlternativa68.setAlternativasA("As gramáticas LL podem descrever mais linguagens do que as gramáticas LR . ");
		questaoAlternativa68.setAlternativasB("Analisadores sintáticos descendentes recursivos são mais simples de implementar do que analisadores sintáticos redutivos. ");
		questaoAlternativa68.setAlternativasC("Uma das diferenças entre os diversos algoritmos de análise redutiva é a forma de identificar o handle na pilha.");
		questaoAlternativa68.setAlternativasD("Algoritmos de análise redutiva podem ser utilizados mesmo para gramáticas ambíguas.");
		questaoAlternativa68.setAlternativasE("Algoritmos descendentes recursivos podem ser utilizados para algumas gramáticas ambíguas. ");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa69 = new QuestaoAlternativa();
		questaoAlternativa69.setId(69l);
		questaoAlternativa69.setAno(2002);
		questaoAlternativa69.setDescricao("Qual o valor do atributo E.val após a análise da expressão “ 4 / 2 / 2 ” para o esquema de\r\n" + 
				"tradução a seguir? \\$E \\rightarrow T / E1 \\left\\{ E.val = T.val / E1.val\\right\\}$\\\r\n" + 
				"$E \\rightarrow T \\left\\{ E.val = T.val \\right\\}$\\\r\n" + 
				"$T \\rightarrow digito \\left\\{ T.val = val(digito) \\right\\}$ \\");
		questaoAlternativa69.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa69.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa69.setDisciplina(EDisciplina.TEORIA_DA_COMPUTACAO);
		questaoAlternativa69.setAlternativaCorreta("d");
		questaoAlternativa69.setAlternativasA("1");
		questaoAlternativa69.setAlternativasB("2");
		questaoAlternativa69.setAlternativasC("3");
		questaoAlternativa69.setAlternativasD("4");
		questaoAlternativa69.setAlternativasE("8");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa70 = new QuestaoAlternativa();
		questaoAlternativa70.setId(70l);
		questaoAlternativa70.setAno(2002);
		questaoAlternativa70.setDescricao("Qual das informações a seguir NÃO é colocada no registro de ativação na chamada de funções?");
		questaoAlternativa70.setArea(EArea.TECNOLOGIA_DA_COMPUTACAO);
		questaoAlternativa70.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa70.setDisciplina(EDisciplina.PROGRAMACAO);
		questaoAlternativa70.setAlternativaCorreta("b");
		questaoAlternativa70.setAlternativasA("Endereço de retorno");
		questaoAlternativa70.setAlternativasB("Variáveis locais estáticas");
		questaoAlternativa70.setAlternativasC("Estado dos registradores");
		questaoAlternativa70.setAlternativasD("Link para a subrotina chamadora");
		questaoAlternativa70.setAlternativasE("Valor de retorno da função");
		
//		---------------------------------------------------------------
		
		
		List<QuestaoAlternativa> questoes = new ArrayList<>();
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
