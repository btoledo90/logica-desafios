package com.concrete.verificar;

import java.util.Scanner;

public class VerificaIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idadePessoa = sc.nextInt();
		if (idadePessoa >= 18) {
			System.out.println("Voc� � de maior");
		} else {
			System.out.println("Voc� � de menor");
		}

	}

}
