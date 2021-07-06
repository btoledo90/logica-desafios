package com.concrete.orientadoaobjetos;

import java.util.Locale;
import java.util.Scanner;

import com.concrete.entities.Aluno;

public class AlunoTeste {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome: ");
		aluno.nome = sc.nextLine();
		System.out.println("Informe a primeira nota: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Informe a segunda nota: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Informe a terceira nota: ");
		aluno.nota3 = sc.nextDouble();

		System.out.printf("Nota Final: %.2f%n", aluno.notaFinal());

		if (aluno.notaFinal() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", aluno.pontosFaltando());
		} else {
			System.out.println("PASS");
		}
		sc.close();
	}
}
