package com.concrete.variaveistiposdedados;

import java.util.Scanner;

public class CalculoCombustivel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double velocidade, tempoGasto, distancia, litrosUsados;

		System.out.print("Informe o tempo que voc� gastou em sua viagem (horas): ");
		tempoGasto = sc.nextDouble();

		System.out.print("Informe a velocidade m�dia em que voc� fez o percurso (Km/h): ");
		velocidade = sc.nextDouble();

		distancia = velocidade * tempoGasto;
		litrosUsados = distancia / 12;

		System.out.println("A dist�ncia percorrida foi: " + distancia + " e a quantidade de combust�vel gasto foi: "
				+ litrosUsados + " litros.");

	}

}
