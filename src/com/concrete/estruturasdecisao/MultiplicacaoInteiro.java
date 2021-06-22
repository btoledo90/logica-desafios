package com.concrete.estruturasdecisao;

import java.util.Scanner;

public class MultiplicacaoInteiro {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número inteiro: ");
		int numero = sc.nextInt();

		int resultado = numero * 2;

		if (resultado >= 30) {
			System.out.println("O resultado é: " + resultado);

		} else {
			System.out.println("Resultado inválido");
		}

		sc.close();

	}
}