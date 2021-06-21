package com.concrete;

import java.util.Scanner;

public class VelocidadeEmMetros {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double velocidade, distancia, tempo;

		System.out.println("Informe a distância percorrida: ");
		distancia = sc.nextDouble();
		System.out.println("Informe o tempo percorrida: ");
		tempo = sc.nextDouble();

		velocidade = (distancia * 1000) / (tempo * 60);

		System.out.println("A distância percorrida em m/s foi " + velocidade);

		sc.close();
	}

}
