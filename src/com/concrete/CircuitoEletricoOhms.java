package com.concrete;

import java.util.Scanner;

public class CircuitoEletricoOhms {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double resistenciaOhms, tensaoVolts, correnteAmperes;

		System.out.println("Informe o valor para Ohms: ");
		resistenciaOhms = sc.nextDouble();
		System.out.println("Informe o Ampere: ");
		correnteAmperes = sc.nextDouble();

		tensaoVolts = resistenciaOhms * correnteAmperes;

		System.out.println("A Tensão em volts é: " + tensaoVolts);

	}

}
