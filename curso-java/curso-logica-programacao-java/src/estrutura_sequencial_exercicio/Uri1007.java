package estrutura_sequencial_exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Uri1007 {

	public static void main(String[] args) {
		
		/*
		 * Leia quatro valores inteiros denominados A, B, C e D. Calcule e imprima
		 * a diferença do produto A e B pelo produto de C e D (A * B - C * D).
		 * 
		 * Entrada
		 * O arquivo de entrada contém 4 valores inteiros.
		 * 
		 * Saída
		 * Imprima DIFERENCA com todas as letras maiúsculas, conforme exemplo a seguir,
		 * com um espaço em branco antes e depois do sinal de igual.
		 * 
		 */
		
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe quatro valores:");
		int a = leia.nextInt();
		int b = leia.nextInt();
		int c = leia.nextInt();
		int d = leia.nextInt();
		
		int diferenca = (a * b - c * d);
		
		System.out.println("DIFERENÇA = "+diferenca);
		
		leia.close();
		

	}

}
