package com.concrete.torneio;

import java.util.Scanner;

public class TorneioDeeNatacao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe seu nome: ");
		String nome = sc.nextLine();
		System.out.println("Informe sua idade: ");
		int idade = sc.nextInt();
		if (idade <= 10) {
			System.out.println(nome + " participará da categoria Infantil");
		} else if (idade >= 11 && idade <= 15) {
			System.out.println(nome + " participará da categoria Juvenil");
		} else if (idade >= 16 && idade <= 19) {
			System.out.println(nome + " participará da categoria Pré-adulto");
		} else {
			System.out.println(nome + " participará da categoria Adulto");
		}
		sc.close();

	}

}
