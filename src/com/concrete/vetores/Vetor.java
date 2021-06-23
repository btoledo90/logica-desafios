package com.concrete.vetores;

import java.util.Scanner;

public class Vetor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array1 = new int[3];
		int[] array2 = new int[3];
		int[] array3 = new int[3];

		String resultadoMultiplicacaoArrays = "";
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Vetor 1, na posição " + i + ": ");
			array1[i] = sc.nextInt();
			System.out.println("Vetor 2, na posição " + i + ": ");
			array2[i] = sc.nextInt();
			array3[i] = array1[i] * array2[i];
			resultadoMultiplicacaoArrays = resultadoMultiplicacaoArrays + array3[i] + " ";

		}

		System.out.println(resultadoMultiplicacaoArrays);

	}

}
