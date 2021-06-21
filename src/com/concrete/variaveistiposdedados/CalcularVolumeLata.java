package com.concrete.variaveistiposdedados;

import java.util.Scanner;

public class CalcularVolumeLata {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double raio, volume, altura;
		final double PI = 3.1415;

		System.out.println("Informe o valor do raio");
		raio = sc.nextDouble();
		System.out.println("Informe a altura da lata");
		altura = sc.nextDouble();

		volume = PI * (Math.pow(raio, 2)) * altura;

		System.out.println("O valor do volume da lata é: " + volume + " cm³");

		sc.close();

	}

}
