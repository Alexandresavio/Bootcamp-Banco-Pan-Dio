package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido01 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler as medidas da largura e comprimento de um terreno
		 * retangular com uma casa decimal, bem como o valor do metro quadrado do terreno
		 * com duas casas decimais. Em seguida, o programa deve mostrar o valor da área do
		 * terreno, bem como o valor do preço do terreno, ambos com duas casas decimais.
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Largura:");
		double largura = sc.nextDouble();
		
		System.out.println("Comprimento:");
		double comprimento = sc.nextDouble();
		
		System.out.println("M2:");
		double metroQuadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroQuadrado;
		
		System.out.printf("AREA = %.2f%n", area);
		System.out.printf("PRECO = %.2f%n", preco);
		
		
		sc.close();

	}

}
