package com.concrete;

import java.util.Scanner;

public class VolumeCaixa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double volume, comprimento, largura, altura;

		System.out.println("Informe o comprimento da caixa: ");
		comprimento = sc.nextDouble();
		System.out.println("Informe a largura da caixa: ");
		largura = sc.nextDouble();
		System.out.println("Informe a altura da caixa: ");
		altura = sc.nextDouble();

		volume = comprimento * largura * altura;

		System.out.println("O volume da caixa retangular é: " + volume + " cm³");

		sc.close();

	}

}
