package com.concrete.diferenca;

import java.util.Scanner;

public class CalculadorDiferencaIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Informe a primeira idade: ");
		int primeiraIdade = sc.nextInt();
		System.out.println("Informe a segunda idade: ");
		int segundaIdade = sc.nextInt();
		int diferencaIdade = primeiraIdade - segundaIdade;
		System.out.println("A diferenca entre a primeira idade: " + primeiraIdade + " e a segunda "
				+ "idade: " + segundaIdade + " é: " + diferencaIdade);
		



	}

}
