package com.concrete.metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConversaoTest {

	final static List<String> OPERATIONS = new ArrayList<String>();

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("=======================================================================");
		System.out.println("\t\t\t\tCONVERSOR DE TEMPERATURA");
		System.out.println("=======================================================================");

		String num = "";
		String result = "";

		while (!num.equals("4")) {
			getCalcDisplay();

			System.out.print("Informe a opção: ");
			num = scan.next();

			switch (num) {
			case "1":
				System.out.print("\n\nInforme o valor em graus celsius: ");
				double celsius = scan.nextDouble();

				result = convertFahrenheitToCelsius(celsius);
				addOperation(result);
				break;
			case "2":
				System.out.print("\n\nInforme o valor em graus fahrenheit: ");
				double fahrenheit = scan.nextDouble();

				result = convertCelsiusToFahrenheit(fahrenheit);

				addOperation(result);
				break;
			case "3":
				getLastFiveOperationsMessage();
				break;
			case "4":
				System.out.print("\n\nEncerrando Calculadora:");
				break;
			default:
				System.out.println("Comando inválido");
				break;
			}
		}

	}

	private static void getLastFiveOperationsMessage() {
		System.out.println("\nEXIBINDO OPERAÇÕES\n");
		System.out.println("=======================================================================");
		OPERATIONS.forEach(System.out::println);
		System.out.println("=======================================================================\n\n");
	}

	private static void addOperation(String message) {
		if (OPERATIONS.size() == 5) {
			OPERATIONS.remove(0);
		}

		OPERATIONS.add(message);
	}

	private static String convertFahrenheitToCelsius(double fahrenheit) {
		return "A temperatura em Celsius é: " + (((((fahrenheit - 32) * 5) / 9)));
	}

	private static String convertCelsiusToFahrenheit(double celsius) {
		return "A temperatura em Fahrenheit é: " + ((((9 * celsius + 160) / 5)));
	}

	private static void getCalcDisplay() {
		System.out.println("1 - Conversão de graus celsius para graus fahrenheit");
		System.out.println("2 - Conversão de graus fahrenheit para graus celsius");
		System.out.println("3 - Exibir últimas 5 operações");
		System.out.println("4 - Sair");

		System.out.print("\n\nInforme a operação: ");
	}
}