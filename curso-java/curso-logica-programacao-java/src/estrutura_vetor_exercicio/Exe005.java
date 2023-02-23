package estrutura_vetor_exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Exe005 {

	public static void main(String[] args) {
		
		/*
		 * 5) Fazer um programa para ler um vetor de N números inteiros.
		 * Em seguida, mostrar na tela a média aritmética somente dos números
		 * pares lidos.
		 * 
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Deseja informar quantos números?");
		int n = sc.nextInt();
		
		double[] vet = new double[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Digite o valor da posição "+i+" do vetor:");
			vet[i] = sc.nextDouble();
		}
		
		int cont = 0;
		double soma = 0;
		for(int i = 0; i < n; i++) {
			if(vet[i] % 2 == 0) {
				soma += vet[i];
				cont++;
			}
		}
		
		double media = soma / cont;
		System.out.printf("Média:%.1f\n ",media);
		
		
		
		
		
		sc.close();

	}

}










