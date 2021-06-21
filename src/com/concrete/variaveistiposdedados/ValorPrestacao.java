package com.concrete.variaveistiposdedados;

import java.util.Scanner;

public class ValorPrestacao {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double prestacao, valor, taxa, tempo;

		System.out.println("Informe o valor: ");
		valor = sc.nextDouble();
		System.out.println("Informe a taxa: ");
		taxa = sc.nextDouble();
		System.out.println("Informe o tempo: ");
		tempo = sc.nextDouble();
		prestacao = valor + (valor * (taxa / 100)) * tempo;
		System.out.println("Sua prestação em atraso é: " + prestacao);

		sc.close();

	}
}