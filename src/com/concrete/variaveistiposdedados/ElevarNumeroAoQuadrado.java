package com.concrete.variaveistiposdedados;

import java.util.Scanner;

public class ElevarNumeroAoQuadrado {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero;
		double resultado;
		double resultadoCubo;
		double resultadoDecima;

		System.out.println("Digite um n�mero que elevaremos ao quadrado, cubo e a d�cima: ");
		numero = sc.nextInt();

		resultado = (Math.pow(numero, 2));
		resultadoCubo = (Math.pow(numero, 3));
		resultadoDecima = (Math.pow(numero, 10));

		System.out.println("O n�mero elevado ao quadrado �: " + resultado);
		System.out.println("O n�mero elevado ao cubo �: " + resultadoCubo);
		System.out.println("O n�mero elevado a d�cima �: " + resultadoDecima);
		
		System.out.println("\nA soma total dos valores � " + resultado + resultadoCubo + resultadoDecima);
		
		

		sc.close();

	}

}
