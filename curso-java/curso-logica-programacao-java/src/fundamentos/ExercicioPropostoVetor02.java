package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioPropostoVetor02 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que leia N números reais e armazene-os em um vetor.
		 * Em seguida: 
		 * - Imprimir todos os elementos do vetor
		 * - Mostrar na tela a soma e a média dos elementos do vetor
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deseja informar quantos números?");
		int numero = sc.nextInt();
	    		
		//instanciar o objeto vetor
		double[] vet = new double[numero];
		
		//entrada de dados
		for(int i = 0; i < numero; i++) {
			vet[i] = sc.nextDouble();						
		}
		
		//saida de dados
		for(int i = 0; i < numero; i++) {
			System.out.print(vet[i]+" ");			
		}
		
		System.out.println();
		
		double soma = 0;
		for(int i = 0; i < numero; i++) {
			soma += vet[i];
		}
		
		System.out.printf("%.2f\n",soma);		
		
		double media = 0;
		media = soma/numero;
		System.out.printf("%.2f\n",media);
				
		
		sc.close();

	}

}
