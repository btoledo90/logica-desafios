package com.concrete.variaveistiposdedados;

import java.util.Scanner;

public class SalarioBase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double novoSalario;
		System.out.println("Informe seu sal�rio base: ");
		double salarioBase = sc.nextDouble();
		System.out.println("Informe o percentual de reajuste do sal�rio: ");
		double percentualDeReajuste = sc.nextDouble();

		novoSalario = salarioBase + (salarioBase * percentualDeReajuste) / 100;

		System.out.println("O novo sal�rio do funcion�rio �: " + novoSalario + ", " + "parab�ns pela dedica��o.");

		sc.close();
	}

}
