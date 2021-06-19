package com.concrete.imparoupar;

import java.util.Scanner;

public class ImparOuPar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero para verificar se é Par ou Impar: ");
		int numero = sc.nextInt();
		if ((numero % 2) == 0) {
			System.out.println("Numero Par: " + numero);
		} else {
			System.out.println("Numero Impar: " + numero);
		}
		sc.close();

	}

}
