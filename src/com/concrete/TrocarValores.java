package com.concrete;

import java.util.Scanner;

public class TrocarValores {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numeroA, numeroB, aux;

		System.out.println("Informe o valor do n�meroA: ");
		numeroA = sc.nextInt();
		System.out.println("Informe o valor do n�meroB: ");
		numeroB = sc.nextInt();

		System.out.println("\nTrocando os valores de numeroA e numeroB:\n ");
		aux = numeroB;
		numeroB = numeroA;
		numeroA = aux;

		System.out.println("Agora o valor de numeroA �: " + numeroA);
		System.out.println("Agora o valor de numeroB �: " + numeroB);

	}
}