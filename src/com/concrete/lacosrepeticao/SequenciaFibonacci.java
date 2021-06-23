package com.concrete.lacosrepeticao;

public class SequenciaFibonacci {
	public static void main(String[] args) {
		int numeroA = 1;
		int numeroB = 0;
		int aux;

		for (int i = 0; i <= 15; i++) {
			System.out.print(numeroA + " ");
			aux = numeroA;
			numeroA = numeroA + numeroB;
			numeroB = aux;
		}

	}
}