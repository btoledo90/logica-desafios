package com.concrete.estruturasdecisao;

import java.util.Scanner;

public class CalculoImc {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double peso, altura, imc;
		System.out.println("Informe seu peso: ");
		peso = sc.nextDouble();
		System.out.println("Informe sua altura");
		altura = sc.nextDouble();

		imc = peso / Math.pow(altura, 2);

		if (imc < 10) {
			System.out.println("Estado Nutricional" + "\n" + "Desnutrição Grau V");
		} else if (imc >= 10 && imc <= 12.9) {
			System.out.println("Estado Nutricional" + "\n" + "Desnutrição Grau IV");
		} else if (imc >= 13 && imc <= 15.9) {
			System.out.println("Estado Nutricional" + "\n" + "Desnutrição Grau III");
		} else if (imc >= 16 && imc <= 16.9) {
			System.out.println("Estado Nutricional" + "\n" + "Desnutrição Grau II");
		} else if (imc >= 17 && imc <= 18.4) {
			System.out.println("Estado Nutricional" + "\n" + "Desnutrição Grau I");
		} else if (imc >= 18.5 && imc <= 24.9) {
			System.out.println("Estado Nutricional" + "\n" + "Normal");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("Estado Nutricional" + "\n" + "Prá-obesidade");
		} else if (imc >= 30 && imc <= 34.5) {
			System.out.println("Estado Nutricional" + "\n" + "Obesidade Grau I");
		} else if (imc >= 35 && imc <= 39.9) {
			System.out.println("Estado Nutricional" + "\n" + "Obesidade Grau II");
		} else {
			System.out.println("Estado Nutricional" + "\n" + "Obesidade Grau III");
		}

		sc.close();

	}

}
