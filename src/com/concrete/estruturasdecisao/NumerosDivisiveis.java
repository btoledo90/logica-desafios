package com.concrete.estruturasdecisao;

import java.util.Scanner;

public class NumerosDivisiveis {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num1, num2, num3, num4, num5, div2, div3;

		System.out.println("Digite o primeiro número:");
		num1 = sc.nextInt();

		div2 = num1 % 2;
		div3 = num1 % 3;

		if (div2 == 0 && div3 == 0) {
			System.out.println(num1 + " é divisível por 2 e por 3");
		} else {
			System.out.println(num1 + " não é divisível  por 2 e por 3");
		}

		sc.close();

	}
}