package com.concrete;

import java.util.Scanner;

public class ConversaoDolarReal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cotacaoDolar, valorDolar, ValorReal;

		System.out.println("Informe a cota��o em d�lar");
		cotacaoDolar = sc.nextDouble();

		System.out.println("Informe o valor em d�lar: ");
		valorDolar = sc.nextDouble();

		ValorReal = cotacaoDolar * valorDolar;

		System.out.println("O valor convertido em reais �: " + "R$ " + ValorReal);

	}
}
