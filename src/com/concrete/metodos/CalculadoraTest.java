package com.concrete.metodos;

import java.util.Scanner;

import com.concrete.metodos.test.Calculadora;

public class CalculadoraTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Calculadora calc = new Calculadora();
		System.out.println("A soma �: ");
		calc.somaDoisNumeros(5, 5);
		System.out.println("A subtra��o �: ");
		calc.subtraiDoisNumeros(5, 5);
		System.out.println("A multiplica��o �: ");
		calc.multiplicaDoisNumeros(5, 5);
		System.out.println("A divis�o �: ");
		calc.divideDoisNumeros(5, 2);
		System.out.println("Equa��o de Pell �: ");
		calc.equacaoDePell(256);

		sc.close();

	}

}
