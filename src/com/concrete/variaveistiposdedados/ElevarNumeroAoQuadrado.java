package com.concrete.variaveistiposdedados;

import java.util.Scanner;

public class ElevarNumeroAoQuadrado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		double resultado;
		double resultadoCubo;
		double resultadoDecima;

		System.out.println("Digite um número que elevaremos ao quadrado, cubo e a décima: ");
		numero = sc.nextInt();

		resultado = (Math.pow(numero, 2));
		resultadoCubo = (Math.pow(numero, 3));
		resultadoDecima = (Math.pow(numero, 10));

		System.out.println("O número elevado ao quadrado é: " + resultado);
		System.out.println("O número elevado ao cubo é: " + resultadoCubo);
		System.out.println("O número elevado a décima é: " + resultadoDecima);
		
		System.out.println("\nA soma total dos valores é " + resultado + resultadoCubo + resultadoDecima);
		
		

		sc.close();

	}

}
