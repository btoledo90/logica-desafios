package com.concrete;

import java.util.Scanner;

public class ValoresDasQuatroOperacoes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int valorA, valorB;

		System.out.println("Digiti o primeiro valor: ");
		valorA = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		valorB = sc.nextInt();

		System.out.println("Os valores das quatros opera��es �:\n ");

		System.out.println("A Soma dos n�meros �: " + (valorA + valorB));
		System.out.println("A Subtra��o dos n�meros �: " + (valorA - valorB));
		System.out.println("A Multiplica��o dos n�meros �: " + (valorA * valorB));
		System.out.println("A Divis�o dos n�meros �: " + (valorA / valorB));

	}

}
