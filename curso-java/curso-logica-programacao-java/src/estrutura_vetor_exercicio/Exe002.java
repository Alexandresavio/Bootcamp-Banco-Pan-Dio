package estrutura_vetor_exercicio;

import java.util.Scanner;

public class Exe002 {

	public static void main(String[] args) {
		
		/*
		 * 2) Faça um programa que leia N números inteiros e
		 *  armazene-os em um vetor. Em seguida, mostre na tela:
		 *  - todos os números pares
		 *  - a quantidade de números pares
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Deseja informar quantos números?");
		int n = sc.nextInt();
		
		int [] vet = new int [n];
		for(int i = 0; i < n; i++) {
			System.out.println("Informe o valor da posição "+i+" do vetor:");
			vet[i] = sc.nextInt();
		}
		
		int quantidadePar = 0;
		for(int i = 0; i < n; i++) {
			if(vet[i] % 2 == 0) {
				quantidadePar++;
				System.out.print(vet[i]+" ");
				
			}
		}
		System.out.println();
		
		System.out.println(quantidadePar);
		sc.close();

	}

}







