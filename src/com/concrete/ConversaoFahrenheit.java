package com.concrete;

import java.util.Scanner;

public class ConversaoFahrenheit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a temperatura em Celsius");
		double celsius = sc.nextDouble();

		System.out.println("A temperatura em Fahrenheit é: " + ((9 * celsius + 160) / 5));
		
		sc.close();
	}

}
