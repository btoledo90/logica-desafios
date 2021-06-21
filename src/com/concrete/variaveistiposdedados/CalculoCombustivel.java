package com.concrete.variaveistiposdedados;

import java.util.Scanner;

public class CalculoCombustivel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double velocidade, tempoGasto, distancia, litrosUsados;

		System.out.print("Informe o tempo que você gastou em sua viagem (horas): ");
		tempoGasto = sc.nextDouble();

		System.out.print("Informe a velocidade média em que você fez o percurso (Km/h): ");
		velocidade = sc.nextDouble();

		distancia = velocidade * tempoGasto;
		litrosUsados = distancia / 12;

		System.out.println("A distância percorrida foi: " + distancia + " e a quantidade de combustível gasto foi: "
				+ litrosUsados + " litros.");

	}

}
