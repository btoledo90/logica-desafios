package com.concrete.lacosrepeticao;

public class SomatorioNumeros {
	public static void main(String[] args) {

		int soma = 0;

		System.out.print("A soma de 1 a 500 é: ");

		for (int i = 1; i <= 500; i++) {
			soma += i;

		}
		System.out.println(soma);
	}

}
