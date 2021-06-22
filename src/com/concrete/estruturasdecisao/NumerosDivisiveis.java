package com.concrete.estruturasdecisao;

import java.util.Scanner;

public class NumerosDivisiveis {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, num4, num5,div1, div2;

		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextInt();
		System.out.println("Digite o terceiro número: ");
		num3 = sc.nextInt();
		System.out.println("Digite o primeiro número:");
		num4 = sc.nextInt();
		System.out.println("Digite o primeiro número:");
		num5 = sc.nextInt();
		
		div1 = num1 % 1;
		div2 = num2 % 2;

		if (num1 % 2 == 0 && num1 % 3 == 0) {
			System.out.println(num1 + " é divisível por 2 e por 3");
		} else if (num2 % 2 == 0 && num2 % 3 == 0) {
			System.out.println(num2 + " é divisível por 2 e por 3");
		} else if (num3 % 2 == 0 && num3 % 3 == 0) {
			System.out.println(num3 + " é divisível por 2 e por 3");
		} else if (num4 % 2 == 0 && num4 % 3 == 0) {
			System.out.println(num4 + " é divisível por 2 e por 3");
		} else if (num5 % 2 == 0 && num5 % 3 == 0) {
			System.out.println(num5 + " é divisível por 2 e por 3");
		} else {
			System.out.println(num1 + " não é divisível  por 2 e por 3");
		}

		sc.close();

	}
}