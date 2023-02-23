package fundamentos;

public class SaidaDeDados {

	public static void main(String[] args) {
		
		//Para escrever na tela um texto qualquer
		
		//Com quebra de linha ao final:
				System.out.println("Bom dia!");
		
		//Sem quebra de linha ao final:
				System.out.print("Bom dia!");
				System.out.println("Maria");
				
		/*
		 * Para escrever o conteúdo de uma variável de algum tipo básico
		 * Suponha uma variável tipo int declarada e iniciada:		
		 */
		int y = 32;
		System.out.println(y);
		
		/*
		 * Para escrever o conteúdo de uma variável
		 * com ponto flutuante suponha uma variável tipo double declarada e iniciada:
		 * 
		 */
		double x = 10.35784;
		System.out.println(x);
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		
		/*
		 * Para concatenar vários elementos em um mesmo comando de escrita.
		 * Regra geral para print e println:
		 * elemento1 + elemento2 + elemento3 + ... + elementoN
		 * 
		 */
		System.out.println("RESULTADO = " + x + " METROS");
		
		/*
		 * Para concatenar vários elementos em um mesmo comando de escrita:
		 * Regra geral para printf:
		 * %f = ponto flutuante
		 * "TEXTO1 %f TEXTO2 %f TEXTO3", variavel1, variavel2
		 * 
		 */
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
		/* Para concatenar vários elementos em um mesmo comando de escrita:
		 * Regra geral para printf:
		 * "TEXTO1 %f TEXTO2 %f TEXTO3", variavel1, variavel2
		 * %f = ponto flutuante
		 * %d = inteiro
		 * %s = texto
		 * %n = quebra de linha
		 * 
		 */
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
		
	}

}
