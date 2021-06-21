package com.concrete.variaveistiposdedados;

import java.util.Scanner;

public class CircuitoEletricoWatts {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double potenciaWatts, tensaoVolts, correnteAmperes;

		System.out.println("Informe o valor em volts: ");
		tensaoVolts = sc.nextDouble();
		System.out.println("Informe o valor em ampere: ");
		correnteAmperes = sc.nextDouble();

		potenciaWatts = tensaoVolts * correnteAmperes;

		System.out.println("A potência em watts é: " + potenciaWatts);

		sc.close();

	}

}
