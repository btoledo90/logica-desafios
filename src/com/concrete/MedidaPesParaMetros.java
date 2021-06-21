package com.concrete;

import java.util.Scanner;

public class MedidaPesParaMetros {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double pes = 30.48;

		System.out.println("Digite o valor em pés: ");
		pes = sc.nextDouble();

		double metros = pes * 0.3048;

		System.out.println("O valor em metros é: " + metros);

		sc.close();

	}
}