package com.concrete.estruturasdecisao;

import java.util.Scanner;

public class OrdenarTresNumeros {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numeroA, numeroB, numeroC;

		System.out.println("Digite o primeiro numero: ");
		numeroA = sc.nextInt();
		System.out.println("Digite o segundo numero: ");
		numeroB = sc.nextInt();
		System.out.println("Digite o terceiro numero: ");
		numeroC = sc.nextInt();

		System.out.println("Os valores em ordem crescente: ");

		if (numeroA < numeroB) {
			if (numeroB < numeroC) {
				System.out.println(numeroA + "\n" + numeroB + "\n" + numeroC);
			} else if (numeroA < numeroC) {
				System.out.println(numeroA + "\n" + numeroC + "\n" + numeroB);
			} else {
				System.out.println(numeroC + "\n" + numeroA + "\n" + numeroB);
			}
		}

		else if (numeroB < numeroC) {
			if (numeroA < numeroC) {
				System.out.println(numeroB + "\n" + numeroA + "\n" + numeroC);
			} else {
				System.out.println(numeroB + "\n" + numeroC + "\n" + numeroA);
			}
		} else {
			System.out.println(numeroC + "\n" + numeroB + "\n" + numeroA);
		}
		sc.close();

	}

}
