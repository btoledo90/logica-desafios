package com.concrete.variaveistiposdedados;

import java.util.Scanner;

public class SucessorAntecessor {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero, antecessor, sucessor;

		System.out.println("Digite um n�mero: ");
		numero = sc.nextInt();

		antecessor = numero - 1;
		sucessor = numero + 1;

		System.out.println("O antecessor do numero: " + numero + " � o " + antecessor + " e o sucessor" + " do n�mero: "
				+ numero + " � o " + sucessor);

		sc.close();

	}
}