package estrutura_sequencial_exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

	public static void main(String[] args) {
		
		/*
		 * Escreva um programa que leia o número de um funcionário,
		 * seu número de horas trabalhadas em um mês e o valor que ele recebe por hora.
		 * Imprima o número do funcionário e o salário que ele receberá no final do mês,
		 * com duas casas decimais.
		 * Não se esqueça de imprimir o final da linha após o resultado, caso contrário
		 * você receberá “Erro de apresentação”.
		 * Não se esqueça do espaço antes e depois do sinal de igual e depois do U$.
		 * 
		 * Entrada
		 * O arquivo de entrada contém 2 números inteiros e 1 valor de ponto flutuante,
		 * representando o número, o valor das horas trabalhadas e o valor que o funcionário
		 * recebe por hora trabalhada.
		 * 
		 * Saída
		 * Imprima o número e o salário do funcionário, conforme exemplo dado, com um espaço
		 * em branco antes e depois do sinal de igual.
		 * 
		 */
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Informe o número do funcionário:");
		int numeroFuncionario = leia.nextInt();
		System.out.println("Quantidade de horas no mês:");
		int quantidadeHoras = leia.nextInt();
		System.out.println("Valor da hora R$:");
		double valorHora = leia.nextDouble();
		
		double salario = (quantidadeHoras * valorHora);
		
		System.out.println("Número: "+numeroFuncionario);
		System.out.printf("Salário: R$%.2f\n",salario);
		
		
		leia.close();
		
		

	}

}
