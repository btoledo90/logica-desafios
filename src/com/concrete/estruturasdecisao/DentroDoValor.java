package com.concrete.estruturasdecisao;

import java.util.Scanner;

public class DentroDoValor {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Informe um valor inteiro: ");
		numero = sc.nextInt();

		if (numero >= 1 && numero <= 9) {
			System.out.println("O valor esta dentro do permitido");
		} else {
			System.out.println("Fora do valor permitido");
		}

		sc.close();

	}
}