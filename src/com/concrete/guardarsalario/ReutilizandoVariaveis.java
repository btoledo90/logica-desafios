package com.concrete.guardarsalario;

import java.util.Scanner;

public class ReutilizandoVariaveis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o salario: ");
		double salario = sc.nextDouble();
		double resultado = salario * 0.30;
		System.out.println("30% do salario é: " + resultado);
		resultado = salario * 0.15;
		System.out.println("15% do salario é: " + resultado);
		resultado = salario * 0.05;
		System.out.println("5% do salario é: " + resultado);

		sc.close();
	}

}
