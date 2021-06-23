package com.concrete.lacosrepeticao;

import java.util.Scanner;

public class NumeroFatorial {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero, fatorial = 1;

		System.out.println("Informe o número que deseja o fatorial: ");
		numero = sc.nextInt();

		if (numero >= 0) {
			for (int i = 1; i <= numero; i++) {
				fatorial = fatorial * i;

			}
			System.out.println("O Fatorial é: " + fatorial);

		} else {
			System.out.println("Informe numeros positivos");
		}
		sc.close();
	}

}
