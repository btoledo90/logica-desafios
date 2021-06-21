package com.concrete;

import java.util.Scanner;

public class VolumeEsfera {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double raio, volume;
		final double PI = 3.1415;

		System.out.println("Informe o valor do raio: ");
		raio = sc.nextDouble();

		volume = (4 / 3) * PI * (Math.pow(raio, 3));

		System.out.println("O volume da esfera é: " + volume);

		sc.close();

	}
}