package com.concrete.metodos;

import java.util.Scanner;

import com.concrete.metodos.test.Calculadora;

public class CalculadoraTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Calculadora calc = new Calculadora();
		System.out.println("A soma é: ");
		calc.somaDoisNumeros(5, 5);
		System.out.println("A subtração é: ");
		calc.subtraiDoisNumeros(5, 5);
		System.out.println("A multiplicação é: ");
		calc.multiplicaDoisNumeros(5, 5);
		System.out.println("A divisão é: ");
		calc.divideDoisNumeros(5, 2);
		System.out.println("Equação de Pell é: ");
		calc.equacaoDePell(256);

		sc.close();

	}

}
