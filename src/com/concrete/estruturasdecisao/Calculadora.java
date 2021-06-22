package com.concrete.estruturasdecisao;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, num2, soma, subtracao, multiplicacao, divisao, opcao;

		System.out.println("## Selecione a opera��o desejada");
		System.out.println("[1] - SOMAR");
		System.out.println("[2] - SUBTRAIR");
		System.out.println("[3] - MULTIPLICAR");
		System.out.println("[4] - DIVIDIR");
		System.out.println(">>>>> Digite a op��o desejada <<<<<");
		opcao = sc.nextInt();

		System.out.println("Insira o primeiro n�mero: ");
		num1 = sc.nextInt();

		System.out.println("Insira o segundo n�mero: ");
		num2 = sc.nextInt();

		switch (opcao) {
		case 1:
			soma = num1 + num2;
			System.out.println("O resultado da soma �: " + soma);
			break;

		case 2:
			subtracao = num1 - num2;
			System.out.println("O resultado da subtra��o �: " + subtracao);
			break;

		case 3:
			multiplicacao = num1 * num2;
			System.out.println("O resultado da multiplica��o �: " + multiplicacao);
			break;

		case 4:
			divisao = num1 / num2;
			System.out.println("O resultado da divis�o �: " + divisao);
			break;

		default:
			System.out.println("Opera��o inv�lida");
		}

		sc.close();

	}
}