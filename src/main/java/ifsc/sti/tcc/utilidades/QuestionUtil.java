package ifsc.sti.tcc.utilidades;

import java.util.ArrayList;
import java.util.List;

import ifsc.sti.tcc.modelos.questao.QuestaoAlternativa;
import ifsc.sti.tcc.props.EArea;
import ifsc.sti.tcc.props.EDisciplina;
import ifsc.sti.tcc.props.ETipoQuestao;

public class QuestionUtil {
	
	public static List<QuestaoAlternativa> registerPoscomp2002() {
		QuestaoAlternativa questaoAlternativa1 = new QuestaoAlternativa();
		questaoAlternativa1.setAno(2002);
		questaoAlternativa1.setDescricao("Pode-se afirmar que o gráfico da função $y = 2 + \\\\frac{1}{x - 1}$ é o gráfico da função $y = \\\\frac{1}{x}$");
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
		questaoAlternativa2.setAno(2002);
		questaoAlternativa2.setDescricao("A derivada da função $f(x) = x^x$ é igual a");
		questaoAlternativa2.setArea(EArea.MATEMATICA);
		questaoAlternativa2.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa2.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa2.setAlternativaCorreta("d");
		
		questaoAlternativa2.setAlternativasA("$xx^{x−1}$");
		questaoAlternativa2.setAlternativasB("$x^x$");
		questaoAlternativa2.setAlternativasC("$x^x ln\\\\left(x\\\\right)$");
		questaoAlternativa2.setAlternativasD("$x^x\\\\left(ln\\\\left(x\\\\right) + 1\\\\right)$");
		questaoAlternativa2.setAlternativasE("$x^x\\\\left(ln\\\\left(x\\\\right) + x\\\\right)$");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa3 = new QuestaoAlternativa();
		questaoAlternativa3.setAno(2002);
		questaoAlternativa3.setDescricao("Seja $n$ um número inteiro positivo. Considere a função $f$ definida recursivamente por \r\n" + 
				"\r\n" + 
				"$f\\\\left(n\\\\right) = \\\\begin{cases}0 & se \\\\ n = 0\\\\\\\\ f\\\\left(\\\\left[\\\\frac{n}{2}\\\\right]\\\\right) + 1 & se \\\\ n > 0\\\\end{cases}$\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"onde $\\\\left[k\\\\right]$ é o maior inteiro menor ou igual a $k$. O valor de $f(25)$ é igual a\r\n");
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
		questaoAlternativa4.setAno(2002);
		questaoAlternativa4.setDescricao("Para cada $n ∈ N$ seja $Dn = \\\\left(0, 1/n\\\\right)$, onde $\\\\left(0, 1/n\\\\right)$ representa o intervalo aberto de\r\n" + 
				"extremos $0 e 1/n$. O conjunto diferença $D_3 − D_{20}$ é igual a:");
		questaoAlternativa4.setArea(EArea.MATEMATICA);
		questaoAlternativa4.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa4.setDisciplina(EDisciplina.MATEMÁTICA_DISCRETA);
		questaoAlternativa4.setAlternativaCorreta("d");
		
		questaoAlternativa4.setAlternativasA("$D_3$");
		questaoAlternativa4.setAlternativasB("$D_{20}$");
		questaoAlternativa4.setAlternativasC("$\\\\left(1/20, 1/3\\\\right)$");
		questaoAlternativa4.setAlternativasD("$\\\\left[1/20, 1/3\\\\right)$");
		questaoAlternativa4.setAlternativasE("$D_{20} ∪ D_3$");
		
//		---------------------------------------------------------------
		
		
		QuestaoAlternativa questaoAlternativa5 = new QuestaoAlternativa();
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
		questaoAlternativa6.setAno(2002);
		questaoAlternativa6.setDescricao("A sequência é definida recursivamente por\r\n" + 
				"\r\n" + 
				"$\\\\begin{cases}x_0 &  = a/2\\\\\\\\ x_{n+1} & = \\\\left(x_n + a/x_n \\\\right)/2 & para \\\\ n > 0\\\\end{cases}$\r\n" + 
				"\r\n" + 
				"onde a é um número real maior do que 1. Se $\\\\lim_{n \\\\rightarrow ∞} x_n = L$ podemos afirmar que\r\n");
		questaoAlternativa6.setArea(EArea.MATEMATICA);
		questaoAlternativa6.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa6.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa6.setAlternativaCorreta("e");
		
		questaoAlternativa6.setAlternativasA("$L = 1$");
		questaoAlternativa6.setAlternativasB("$L = 1/a$");
		questaoAlternativa6.setAlternativasC("$L = a$");
		questaoAlternativa6.setAlternativasD("$L = 1/2a$");
		questaoAlternativa6.setAlternativasE("$L =\\\\sqrt{a}$");
		
//		---------------------------------------------------------------
		
		QuestaoAlternativa questaoAlternativa7 = new QuestaoAlternativa();
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
		questaoAlternativa8.setAno(2002);
		questaoAlternativa8.setDescricao("Seja g : $\\\\mathbb{R} \\\\rightarrow \\\\mathbb{R}$ contínua e $f\\\\left(x\\\\right) =g\\\\left(x\\\\right) - x$. Definimos a sequência $\\\\left(x_n\\\\right)$ da seguinte maneira \r\n" + 
				"\r\n" + 
				"$\\\\begin{cases}x_0 & = 1\\\\\\\\ x_n & = g(x_{n-1}) & para \\\\ n \\\\geq 1\\\\end{cases}$ \r\n" + 
				"\r\n" + 
				"\r\n" + 
				"Se $\\\\lim_{n \\\\rightarrow ∞} x_n = L$ podemos afirmar que\r\n");
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
		questaoAlternativa9.setAno(2002);
		questaoAlternativa9.setDescricao("Assinale a proposição verdadeira");
		questaoAlternativa9.setArea(EArea.MATEMATICA);
		questaoAlternativa9.setProva(ETipoQuestao.POSCOMP);
		questaoAlternativa9.setDisciplina(EDisciplina.CALCULO);
		questaoAlternativa9.setAlternativaCorreta("d");
		
		questaoAlternativa9.setAlternativasA("Se x é um número real tal que $x^2 \\\\leq 4$ então $x \\\\leq 2$ e $x \\\\geq −2$");
		questaoAlternativa9.setAlternativasB("Se x e y são números reais tais que $x < y$ então $x^2 < y^2$");
		questaoAlternativa9.setAlternativasC("Se $x + y$ é um número racional então $x$ e $y$ são números racionais");
		questaoAlternativa9.setAlternativasD("Se $x < −4$ ou $x > 1$ então $\\\\frac{2x + 3}{x − 1}> 1$\r\n");
		questaoAlternativa9.setAlternativasE("Nenhuma das anteriores");
		
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
		return questoes;
	}

}
