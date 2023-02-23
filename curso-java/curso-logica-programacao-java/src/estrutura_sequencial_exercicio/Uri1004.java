package estrutura_sequencial_exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Uri1004 {

	public static void main(String[] args) {
		
		/*
		 * Leia dois valores inteiros. Depois disso, calcule o produto entre eles e
		 * armazene o resultado em uma variável chamada PROD . Imprima o resultado como
		 * no exemplo abaixo. Não se esqueça de imprimir o final da linha após o resultado,
		 * caso contrário você receberá “Erro de apresentação”.
		 * 
		 * Entrada
		 * O arquivo de entrada contém 2 números inteiros.
		 * 
		 * Saída
		 * Imprima a mensagem "PROD" e PROD conforme exemplo a seguir, com um espaço em branco 
		 * antes e depois do sinal de igual.
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe dois valores:");
		int a = leia.nextInt();
		int b = leia.nextInt();
		
		int prod = (a * b);
		
		System.out.println("PROD = "+prod);
		
		leia.close();
		
		
		

	}

}
