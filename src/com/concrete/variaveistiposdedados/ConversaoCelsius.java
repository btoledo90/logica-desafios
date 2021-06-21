package com.concrete.variaveistiposdedados;

import java.util.Scanner;

public class ConversaoCelsius {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a temperatura em Fahrenheit");
		double fahrenheit = sc.nextDouble();

		System.out.println("A temperatura em Fahrenheit é: " + ((fahrenheit - 32) * 5) / 9);

		sc.close();
	}

}
