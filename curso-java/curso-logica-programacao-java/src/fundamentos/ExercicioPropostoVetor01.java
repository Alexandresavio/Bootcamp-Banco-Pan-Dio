package fundamentos;

import java.util.Scanner;

public class ExercicioPropostoVetor01 {

	public static void main(String[] args) {
		
		/*
		 * Faça um programa que leia N números inteiros e armazene-os
		 * em um vetor. Em seguida, mostrar na tela todos os números
		 * negativos lidos.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deseja informar quantos números?");
		int numero = sc.nextInt();
		
		//instanciar o objeto vetor
		int[] vet = new int[numero];
		
		//entrada de dados
		for(int i = 0; i < numero; i++) {
			System.out.println("Informe o  número da posição "+i+" do vetor:");
			vet[i] = sc.nextInt();
		}
		
		System.out.println("Resultado:");
		
		//saida de dados
		for(int i = 0; i < numero; i++) {
			if(vet[i] < 0) {
				System.out.println(vet[i]);
			}			
		}
		
		sc.close();

	}

}
