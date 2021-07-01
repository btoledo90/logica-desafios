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

			System.out.println("a - Calcular Tens�o El�trica");
			System.out.println("b - Calcular Resist�cia El�trica");
			System.out.println("c - Calcular Corrente El�trica");
			System.out.println("d - Calcular Pot�ncia El�trica");
			System.out.println("e - Sair");

			System.out.println("Informe a op��o: ");
			num = sc.next();
			switch (num) {

			case "a":
				System.out.println("Tensao El�trica: ");
				System.out.println("Digite o valor da resistenciaOhms: ");
				double valorResistencia = sc.nextDouble();

				System.out.println("Digite o valor do Ampere: ");
				double valorAmpere = sc.nextDouble();

				double tensaoEletrica = leiDeOhm.calcularTensaoEletrica(valorResistencia, valorAmpere);
				System.out.println("O valor da Tens�o El�trica �: " + tensaoEletrica);
				System.out.println("=====================================================");
				break;
			case "b":
				System.out.println("Resist�ncia El�trica: ");
				System.out.println("Digite o valor da tens�o em Volts: ");
				double tensaoVolts = sc.nextDouble();

				System.out.println("Digite o valor da Corrente Ampere: ");
				double correnteAmpere = sc.nextDouble();

				double resistenciaEletrica = leiDeOhm.calcularTensaoEletrica(tensaoVolts, correnteAmpere);
				System.out.println("O valor da Resist�ncia El�trica �: " + resistenciaEletrica);
				System.out.println("=====================================================");
				break;

			case "c":
				System.out.println("Corrente El�trica: ");
				System.out.print("Digite o valor da Tens�o em Volts: ");
				double tensaoEmVolts = sc.nextDouble();

				System.out.print("Digite o valor da Resist�ncia em Ohms: ");
				double resistenciaOhms = sc.nextDouble();

				double correnteEletrica = leiDeOhm.calcularTensaoEletrica(tensaoEmVolts, resistenciaOhms);
				System.out.println("O valor da Resist�ncia El�trica �: " + correnteEletrica);
				System.out.println("=====================================================");
				break;
			case "d":
				System.out.println("Pot�ncia El�trica: ");
				System.out.print("Digite o valor da Tens�o em Volts: ");
				double tensaoEmVolt = sc.nextDouble();

				System.out.print("Digite o valor da Corr: ");
				double correnteAmperes = sc.nextDouble();

				double potenciaEletrica = leiDeOhm.calcularTensaoEletrica(tensaoEmVolt, correnteAmperes);
				System.out.println("O valor da Resist�ncia El�trica �: " + potenciaEletrica);
				System.out.println("=====================================================");
				break;
			case "e":
				System.out.println("Programa encerrado!");
				break;
			default:
				System.out.println("Comando inv�lido!");

			}

		}
		sc.close();
	}
}
