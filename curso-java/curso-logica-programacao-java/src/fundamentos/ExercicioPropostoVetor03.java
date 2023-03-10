package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPropostoVetor03 {

	public static void main(String[] args) {
	
		/*
		 *  Fazer um programa para ler um número N, depois nome
		 * (apenas uma palavra sem espaços), idade e altura de N pessoas,
		 *  conforme exemplo. Depois, mostrar na tela a altura média das
		 *  pessoas, e mostrar também a porcentagem de pessoas com menos
		 *  de 16 anos.
		 *  
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] nomes = new String[N];
		
		int[] idades = new int[N];
		double[] alturas = new double[N];
		
		for (int i=0; i<N; i++) {
			nomes[i] = sc.next();
			idades[i] = sc.nextInt();
			alturas[i] = sc.nextDouble();
		}
		
		double soma = 0.0;
		
		for (int i=0; i<N; i++) {
			soma = soma + alturas[i];
		}
		
		double media = soma / N;
		System.out.printf("Altura media: %.2f%n", media);
		
		int cont = 0;
		
		for (int i=0; i<N; i++) {
				if (idades[i] < 16) {
				cont = cont + 1;
				}
		}
		
		double x = (double) cont * 100.0 / N;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", x);
		
		sc.close();

	}

}
