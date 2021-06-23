package com.concrete.lacosrepeticao;

import java.util.Scanner;

public class TelaLogin {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final String login = "Bruno";
		final String password = "123";
		boolean exibirTelaLogin = true;

		while (exibirTelaLogin) {
			System.out.println("Informe seu login: ");
			String loginDigitado = sc.nextLine();
			System.out.println("Informe sua senha: ");
			String passwordDigitado = sc.nextLine();
			if (login.equals(loginDigitado) && password.equals(passwordDigitado)) {
				System.out.println("ACESSO CONCEDIDO");
				break;
			}
			System.out.println("ACESSO NEGADO");

		}
		System.out.println("PROGRAMA TERMINOU");

		sc.close();
	}

}
