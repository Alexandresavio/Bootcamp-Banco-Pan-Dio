package estrutura_repeticao_for_exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Uri1078 {

	public static void main(String[] args) {
		/*
		 * FUP que leia um valor inteiro N (2 <N < 1000).
		 * A seguir mostra a tabuada de N.
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Quer ver a tabuada de qual numero?");
		int n = leia.nextInt() ;
		
		for(int i = 0; i <= 10; i++) {
			System.out.println(i+" X "+n+" = "+(i * n));
		}
		
		leia.close();

	}

}
