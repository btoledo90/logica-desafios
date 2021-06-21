package com.concrete;

import java.util.Scanner;

public class CircuitoEletrico {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double resistenciaOhms, tensaoVolts, correnteAmperes;

		System.out.println("Informe a voltagem: ");
		tensaoVolts = sc.nextDouble();
		System.out.println("Informe o Ampere: ");
		correnteAmperes = sc.nextDouble();

		resistenciaOhms = tensaoVolts / correnteAmperes;

		System.out.println("A resistência elétrica é: " + resistenciaOhms);

	}
}