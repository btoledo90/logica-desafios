package com.concrete.estruturasdecisao;

import java.util.Scanner;

public class CalcularNotas {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double nota1, nota2, nota3, nota4, resultado;

		System.out.println("Informe a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.println("Informe a segunda nota: ");
		nota2 = sc.nextDouble();
		System.out.println("Informe a terceira nota: ");
		nota3 = sc.nextDouble();
		System.out.println("Informe a quarta nota: ");
		nota4 = sc.nextDouble();

		resultado = (nota1 + nota2 + nota3 + nota4) / 4;

		if (resultado < 50) {
			System.out.println("Voc� esta REPROVADO");
		} else if (resultado == 50) {
			System.out.println("Voc� esta de RECUPERA��O");

		} else {
			System.out.println("Para�ns voc� foi APROVADO");
		}

		sc.close();
	}
}