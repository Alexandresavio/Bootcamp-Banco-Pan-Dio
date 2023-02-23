package estrutura_sequencial_exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Uri1003 {

	public static void main(String[] args) {
		
		/*
		 * Leia dois valores inteiros, no caso, as variáveis ​​A e B. 
		 * Depois disso, calcule a soma entre eles e atribua à variável SOMA.
		 * Escreva o valor dessa variável.
		 * 
		 * Entrada
		 * O arquivo de entrada contém 2 números inteiros.
		 * 
		 * Saída
		 * Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço
		 * em branco antes e depois do sinal de igual seguido do valor correspondente à soma de A e B.
		 *  
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe dois valores:");
		int a = leia.nextInt();
		int b = leia.nextInt();
		
		int soma = (a + b);
		
		System.out.println("SOMA = "+soma);
		
		
		
		leia.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
