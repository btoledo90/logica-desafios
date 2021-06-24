package com.concrete.metodos.test;

public class Calculadora {

	public void somaDoisNumeros(int numero1, int numero2) {

		System.out.println(numero1 + numero2);
	}

	public void subtraiDoisNumeros(int numero1, int numero2) {

		System.out.println(numero1 - numero2);
	}

	public void multiplicaDoisNumeros(int numero1, int numero2) {

		System.out.println(numero1 * numero2);
	}

	public void divideDoisNumeros(double numero1, double numero2) {
		if (numero2 != 0) {
			System.out.println(numero1 / numero2);
			return;
		}

		System.out.println("Não é possível dividir por 0");
	}

	int impar = 1, raiz = 0;

	public void equacaoDePell(int numero) {

		while (numero >= impar) {

			numero -= impar;
			impar += 2;
			++raiz;
		}
		System.out.println(raiz);
	}
}
