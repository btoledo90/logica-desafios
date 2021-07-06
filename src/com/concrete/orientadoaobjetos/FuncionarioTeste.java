package com.concrete.orientadoaobjetos;

import java.util.Locale;
import java.util.Scanner;

import com.concrete.entities.Funcionario;

public class FuncionarioTeste {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();

		System.out.println("Nome: ");
		funcionario.name = sc.nextLine();
		System.out.println("Sal�rio Bruto: ");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.println("Taxa: ");
		funcionario.taxa = sc.nextDouble();

		System.out.println();
		System.out.println("Funcion�rio: " + funcionario);
		System.out.println();
		System.out.println("Entre com a porcentagem para aumentar o sal�rio: ");
		double porcentagem = sc.nextDouble();
		funcionario.aumentarSalario(porcentagem);

		System.out.println();
		System.out.println("Dados atualizados: " + funcionario);
		sc.close();
	}
}
