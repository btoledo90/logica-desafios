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

		System.out.println("Os valores das quatros operações é:\n ");

		System.out.println("A Soma dos números é: " + (valorA + valorB));
		System.out.println("A Subtração dos números é: " + (valorA - valorB));
		System.out.println("A Multiplicação dos números é: " + (valorA * valorB));
		System.out.println("A Divisão dos números é: " + (valorA / valorB));

	}

}
