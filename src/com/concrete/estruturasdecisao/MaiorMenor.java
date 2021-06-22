package com.concrete.estruturasdecisao;

import java.util.Scanner;

public class MaiorMenor {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, num4, num5, maior, menor;

		System.out.println("Informe o primeiro número: ");
		num1 = sc.nextInt();
		System.out.println("Informe o segundo número: ");
		num2 = sc.nextInt();
		System.out.println("Informe o terceiro número: ");
		num3 = sc.nextInt();
		System.out.println("Informe o quarto número: ");
		num4 = sc.nextInt();
		System.out.println("Informe o quinto número: ");
		num5 = sc.nextInt();

		maior = num1;

		if (num2 > maior) {
			maior = num2;
		}
		if (num3 > maior) {
			maior = num3;
		}
		if (num4 > maior) {
			maior = num4;
		}
		if (num5 > maior) {
			maior = num5;
		}

		menor = num1;

		if (num2 < menor) {
			menor = num2;
		}
		if (num3 < menor) {
			menor = num3;
		}
		if (num4 < menor) {
			menor = num4;
		}
		if (num5 < menor) {
			menor = num5;
		}

		System.out.println("O maior valor inserifo foi " + maior);
		System.out.println("O menor valor inserifo foi " + menor);

	}

}
