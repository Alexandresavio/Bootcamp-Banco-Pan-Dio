package fundamentos;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		
		/*
		 * FUP para ler um valor inteiro de 1 a 7 representando um 
		 * dia da semana(sendo 1=domingo, 2=segunda, 3=terca, 4=quarta,
		 * 5=quinta, 6=sexta, 7=sabado).
		 *  
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que dia é hoje?");
		int dia = sc.nextInt();
		
		switch (dia) {
			case 1:
				System.out.println("Domingo");
			break;
			case 2:
				System.out.println("Segunda-feira");
			break;
			case 3:
				System.out.println("Terça-feira");
			break;
			case 4:
				System.out.println("Quarta-feira");
			break;
			case 5:
				System.out.println("Quinta-feira");
			break;
			case 6:
				System.out.println("Sexta-feira");
			break;
			case 7:
				System.out.println("Sabado-feira");
			break;
			default:
				System.out.println("Dia inválido.");
			break;
		}
		
		
		sc.close();
	}
}
