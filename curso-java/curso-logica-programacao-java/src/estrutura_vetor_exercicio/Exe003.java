package estrutura_vetor_exercicio;

import java.util.Scanner;

public class Exe003 {

	public static void main(String[] args) {
		
		/*
		 * 3) Faça um programa para ler dois vetores A e B, contendo N elementos cada.
		 * Em seguida, gere um terceiro vetor C onde cada elemento de C é a soma dos elementos 
		 * correspondentes de A e B. Imprima o vetor C gerado.
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deseja informar quantos números?");
		int n = sc.nextInt();
		
		System.out.println("Informe os valore do vetor A:");
		int[] vetA = new int[n];
		for(int i = 0; i <n; i++) {
			System.out.println("Digite o valor da posição "+i+" do vetor:");
			vetA[i] = sc.nextInt();
		}
		
		System.out.println("Informe os valore do vetor B:");
		int[] vetB = new int[n];
		for(int i = 0; i <n; i++) {
			System.out.println("Digite o valor da posição "+i+" do vetor:");
			vetB[i] = sc.nextInt();
		}
		
		int[] vetC = new int[n];
		for(int i = 0; i <n; i++) {
			vetC[i] = vetA[i]+vetB[i];
		}
		System.out.println("Soma dos valores do vetor A e vetor B:");
		for(int i = 0; i <n; i++) {
			System.out.print(vetC[i]+" ");
		}
	
		
		sc.close();

	}

}



