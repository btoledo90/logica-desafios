package com.concrete;

import java.util.Scanner;

public class CircuitoEletricoAmpere {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double resistenciaOhms, tensaoVolts, correnteAmperes;

		System.out.println("Informe o valor em volts: ");
		tensaoVolts = sc.nextDouble();
		System.out.println("Informe o valor em ohms: ");
		resistenciaOhms = sc.nextDouble();

		correnteAmperes = tensaoVolts / resistenciaOhms;

		System.out.println("A Tensão em volts é: " + correnteAmperes);

	}

}
