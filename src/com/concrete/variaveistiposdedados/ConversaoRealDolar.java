package com.concrete.variaveistiposdedados;

import java.util.Scanner;

public class ConversaoRealDolar {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cotacaoDolar, valorDolar, valorReal;

		System.out.println("Informe a cota��o em d�lar");
		cotacaoDolar = sc.nextDouble();

		System.out.println("Informe o valor em reais: ");
		valorReal = sc.nextDouble();

		valorDolar = valorReal / cotacaoDolar;

		System.out.println("O valor convertido em d�lar �: " + "US$ " + valorDolar);

		sc.close();

	}

}
