package com.concrete.lacosrepeticao;

import java.util.Scanner;

public class TabuadaContador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o número da tabuada que deseja:");
		int numero = sc.nextInt();

		System.out.println("A tabuada desejada: \n");

		for (int i = 1; i <= 10; i++) {
			System.out.println(numero * i);
		}
		sc.close();
	}

}
