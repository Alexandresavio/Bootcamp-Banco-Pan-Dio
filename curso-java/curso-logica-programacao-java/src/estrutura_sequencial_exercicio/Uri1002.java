package estrutura_sequencial_exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Uri1002 {

	public static void main(String[] args) {
		
		/*
		 * A fórmula para calcular a área de uma circunferência é definida como A = π . R 2.
		 * Considerando para este problema que π = 3,14159 :
		 * Calcule a área usando a fórmula fornecida na descrição do problema.
		 * 
		 * Entrada
		 * A entrada contém um valor de ponto flutuante (precisão dupla), que é a variável R.
		 * 
		 * Saída
		 * Apresente a mensagem "A=" seguida do valor da variável, conforme exemplo abaixo, 
		 * com quatro casas após a vírgula. Use todas as variáveis ​​de precisão dupla.
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o valor do raio:");
		double r = leia.nextDouble();
		
		final double PI = 3.14159;
		
		double a = PI*(Math.pow(r, 2));
		
		System.out.printf("A = %.4f",a);
		
		
		leia.close();
		
		
		
		
	}

}
