package com.concrete.calculoimposto;

import java.util.Scanner;

public class CalcularImpostoComCondicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digit o valor do salario");
		double salario = sc.nextDouble();
		double resultado = 0;
		String porcentagem = "";
		if (salario >= 4500.0) {
			resultado = salario * 0.30;
			porcentagem = "30%";
		} else {
			resultado = salario * 0.15;
			porcentagem = "15%";
		}
		System.out.println("O valor da porcentagem do salario é " + porcentagem + " total de " + resultado);

		sc.close();

	}

}
