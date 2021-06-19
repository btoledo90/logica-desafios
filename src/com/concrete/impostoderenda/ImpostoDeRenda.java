package com.concrete.impostoderenda;

import java.util.Scanner;

public class ImpostoDeRenda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu salario para comparar o valor do imposto de renda");
		double salario = sc.nextDouble();
		if (salario <= 1903.98) {
			System.out.println("Você esta Isento");
		} else if (salario >= 1903.99 && salario <= 2826.65) {
			System.out.println("O imposto sobre seu salario é 7.5%: " + (salario * 0.075));
		} else if (salario >= 2826.66 && salario <= 3751.05) {
			System.out.println("O imposto sobre seu salario é 15%: " + (salario * 0.15));
		} else if (salario >= 3751.06 && salario <= 4664.65) {
			System.out.println("O imposto sobre seu salario é 22.5%: " + (salario * 0.225));
		} else {
			System.out.println("O imposto sobre seu salario é 27.5%: " + (salario * 0.275));
		}
		sc.close();
	}

}
