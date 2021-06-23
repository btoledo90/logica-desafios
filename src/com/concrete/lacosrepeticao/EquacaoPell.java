package com.concrete.lacosrepeticao;

import java.util.Scanner;

public class EquacaoPell {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int impar = 1, raiz = 0;

		System.out.println("Informe um numero: ");
		int numero = sc.nextInt();

		while (numero >= impar) {
			numero -= impar;
			impar += 2;
			++raiz;
		}
		System.out.println("A equação de Pell é: " +(raiz));

	}

}
