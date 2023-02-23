package fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		/*
		 * Para fazer entrada de dados, nós vamos criar um objeto do tipo
		 * "Scanner" da seguinte forma:
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Para ler uma palavra (texto sem espaços)
		 * Suponha uma variável tipo String declarada:
		 */
		String nome;
		System.out.println("Qual seu nome?");
		nome = sc.next();
		System.out.println("Olá "+nome);
		
		/*
		 * Para ler um número inteiro
		 * Suponha uma variável tipo int declarada:
		 */
		int idade;
		System.out.println("Qual sua idade?");
		idade = sc.nextInt();
		System.out.println("Você tem "+idade+" anos");
		
		/*
		 * Para ler um número com ponto flutuante
		 * Suponha uma variável tipo double declarada:
		 */
		double salario;
		System.out.println("Digite seu salário:");
		salario = sc.nextDouble();
		System.out.println(salario);
		
		/*
		 * ATENÇÃO:
		 * Para considerar o separador de decimais como ponto, 
		 * ANTES da declaração do Scanner, faça:
		 * Locale.setDefault(Locale.US);
		 */
		
		/*
		 * Para ler um caractere suponha uma variável tipo char declarada:
		 */
		System.out.println("1ª letra do seu nome:");
		char letra = sc.next().charAt(0);// este comando le o elemento na posicao 0
		System.out.println(letra);
		
		/*
		 * Para ler vários dados na mesma linha
		 */
		System.out.println("Qual seu sobrenome:");
		String palavra = sc.next();
		System.out.println("Quantidade de irmãos:");
		int numero = sc.nextInt();
		System.out.println("Qual sua altura:");
		double altura = sc.nextDouble();
				
		System.out.println(palavra);
		System.out.println(numero);
		System.out.println(altura);
		
		sc.close();

	}

}
