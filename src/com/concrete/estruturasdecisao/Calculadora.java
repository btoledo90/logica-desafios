package com.concrete.estruturasdecisao;

import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, num2, soma, subtracao, multiplicacao, divisao, opcao;

		System.out.println("## Selecione a operação desejada");
		System.out.println("[1] - SOMAR");
		System.out.println("[2] - SUBTRAIR");
		System.out.println("[3] - MULTIPLICAR");
		System.out.println("[4] - DIVIDIR");
		System.out.println(">>>>> Digite a opção desejada <<<<<");
		opcao = sc.nextInt();

		System.out.println("Insira o primeiro número: ");
		num1 = sc.nextInt();

		System.out.println("Insira o segundo número: ");
		num2 = sc.nextInt();

		switch (opcao) {
		case 1:
			soma = num1 + num2;
			System.out.println("O resultado da soma é: " + soma);
			break;

		case 2:
			subtracao = num1 - num2;
			System.out.println("O resultado da subtração é: " + subtracao);
			break;

		case 3:
			multiplicacao = num1 * num2;
			System.out.println("O resultado da multiplicação é: " + multiplicacao);
			break;

		case 4:
			divisao = num1 / num2;
			System.out.println("O resultado da divisão é: " + divisao);
			break;

		default:
			System.out.println("Operação inválida");
		}

		sc.close();

	}
}