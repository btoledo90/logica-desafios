package com.concrete.estruturasdecisao;

import java.util.Scanner;

public class MultiplicacaoInteiro {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um n�mero inteiro: ");
		int numero = sc.nextInt();

		int resultado = numero * 2;

		if (resultado >= 30) {
			System.out.println("O resultado �: " + resultado);

		} else {
			System.out.println("Resultado inv�lido");
		}

		sc.close();

	}
}