package estrutura_repeticao_for_exercicio;

import java.util.Scanner;

public class Uri1067 {

	public static void main(String[] args) {
		
		/*
		 *Lê um valor inteiro X (1 <= X <= 1000). Em seguida,
		 *imprima os números ímpares de 1 a X , cada um em uma linha,
		 *incluindo X se for o caso.
		 *
		 *Entrada
		 *A entrada será um valor inteiro.
		 *
		 *Saída
		 *Imprima todos os valores ímpares entre 1 e X , incluindo X se for o caso.
		 *
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quer saber os impares até que número?");
		int numero = sc.nextInt();
		
		for(int i = 1;i <= numero; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();

	}

}
