package estrutura_vetor_exercicio;

import java.util.Scanner;

public class Exe004 {

	public static void main(String[] args) {
		
		/*
		 * 4) Fazer um programa para ler um vetor de N números reais. Em seguida, 
		 * mostrar na tela a média aritmética de todos os elementos. Depois mostrar 
		 * todos os elementos do vetor que estejam abaixo da média.
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deseja informar quantos números?");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		for(int i = 0; i <n; i++) {
			System.out.println("Digite o valor da posição "+i+" do vetor:");
			vet[i] = sc.nextDouble();
		}
		
		double soma = 0;
		for(int i = 0; i <n; i++) {
			soma += vet[i];
		}
		double media = soma/n;
		System.out.printf("Média dos valores:%.3f\n",media);
		
		for(int i = 0; i <n; i++) {
			if(vet[i] < media) {
				System.out.printf("%.1f\n",vet[i]);
			}
		}
		
		sc.close();
	}

}






