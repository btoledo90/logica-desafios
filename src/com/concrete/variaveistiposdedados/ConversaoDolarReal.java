package com.concrete.variaveistiposdedados;

import java.util.Scanner;

public class ConversaoDolarReal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cotacaoDolar, valorDolar, valorReal;

		System.out.println("Informe a cotação em dólar");
		cotacaoDolar = sc.nextDouble();

		System.out.println("Informe o valor em dólar: ");
		valorDolar = sc.nextDouble();

		valorReal = cotacaoDolar * valorDolar;

		System.out.println("O valor convertido em reais é: " + "R$ " + valorReal);

	}
}
