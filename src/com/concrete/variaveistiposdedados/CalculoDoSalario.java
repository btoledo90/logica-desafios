package com.concrete.variaveistiposdedados;

import java.util.Scanner;

public class CalculoDoSalario {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe seu salário base: ");
		double salarioBase = sc.nextDouble();
		System.out.println("Informe as horas trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();
		System.out.println("Informe o valor das horas trabalhadas: ");
		double valorHoraDeTrabalho = sc.nextDouble();
		double totalDeDescontos;
		System.out.println("Informe o percentual de desconto: ");
		double percentualDeDesconto = sc.nextDouble();
		double salarioLiquido;

		salarioBase = horasTrabalhadas * valorHoraDeTrabalho;
		totalDeDescontos = (percentualDeDesconto / 100) * salarioBase;
		salarioLiquido = salarioBase - percentualDeDesconto;

		System.out.println("A base do salário é: " + salarioBase + " e o salário liquído é: " + salarioLiquido);

		sc.close();
	}

}
