package com.concrete.metodos;

import java.util.Scanner;

import com.concrete.metodos.test.LeiDeOhm;

public class LeiDeOhmComFuncionalidades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		LeiDeOhm leiDeOhm = new LeiDeOhm();

		System.out.println("=======================================================================");
		System.out.println("\t\t\t\t LEI DE OHM");
		System.out.println("=======================================================================");

		String num = "";

		while (!num.equals("e")) {

			System.out.println("a - Calcular Tensão Elétrica");
			System.out.println("b - Calcular Resistêcia Elétrica");
			System.out.println("c - Calcular Corrente Elétrica");
			System.out.println("d - Calcular Potência Elétrica");
			System.out.println("e - Sair");

			System.out.println("Informe a opção: ");
			num = sc.next();
			switch (num) {

			case "a":
				System.out.println("Tensao Elétrica: ");
				System.out.println("Digite o valor da resistenciaOhms: ");
				double valorResistencia = sc.nextDouble();

				System.out.println("Digite o valor do Ampere: ");
				double valorAmpere = sc.nextDouble();

				double tensaoEletrica = leiDeOhm.calcularTensaoEletrica(valorResistencia, valorAmpere);
				System.out.println("O valor da Tensão Elétrica é: " + tensaoEletrica);
				System.out.println("=====================================================");
				break;
			case "b":
				System.out.println("Resistência Elétrica: ");
				System.out.println("Digite o valor da tensão em Volts: ");
				double tensaoVolts = sc.nextDouble();

				System.out.println("Digite o valor da Corrente Ampere: ");
				double correnteAmpere = sc.nextDouble();

				double resistenciaEletrica = leiDeOhm.calcularTensaoEletrica(tensaoVolts, correnteAmpere);
				System.out.println("O valor da Resistência Elétrica é: " + resistenciaEletrica);
				System.out.println("=====================================================");
				break;

			case "c":
				System.out.println("Corrente Elétrica: ");
				System.out.print("Digite o valor da Tensão em Volts: ");
				double tensaoEmVolts = sc.nextDouble();

				System.out.print("Digite o valor da Resistência em Ohms: ");
				double resistenciaOhms = sc.nextDouble();

				double correnteEletrica = leiDeOhm.calcularTensaoEletrica(tensaoEmVolts, resistenciaOhms);
				System.out.println("O valor da Resistência Elétrica é: " + correnteEletrica);
				System.out.println("=====================================================");
				break;
			case "d":
				System.out.println("Potência Elétrica: ");
				System.out.print("Digite o valor da Tensão em Volts: ");
				double tensaoEmVolt = sc.nextDouble();

				System.out.print("Digite o valor da Corr: ");
				double correnteAmperes = sc.nextDouble();

				double potenciaEletrica = leiDeOhm.calcularTensaoEletrica(tensaoEmVolt, correnteAmperes);
				System.out.println("O valor da Resistência Elétrica é: " + potenciaEletrica);
				System.out.println("=====================================================");
				break;
			case "e":
				System.out.println("Programa encerrado!");
				break;
			default:
				System.out.println("Comando inválido!");

			}

		}
		sc.close();
	}
}
