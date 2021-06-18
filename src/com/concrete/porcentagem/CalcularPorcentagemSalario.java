package com.concrete.porcentagem;

import java.util.Scanner;

public class CalcularPorcentagemSalario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe seu salario: ");
		double salario = sc.nextDouble();
		System.out.println("Informe a pocentagem: ");
		double porcentagem = sc.nextDouble();
		double porcentagemDoSalario = salario * (porcentagem / 100);
		System.out.println("A porcentagem do salário é: " + porcentagemDoSalario);
	}

}
