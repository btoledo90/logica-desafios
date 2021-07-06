package com.concrete.orientadoaobjetos;

import java.util.Locale;
import java.util.Scanner;

import com.concrete.orientadoaobjetosentities.Retangulo;

public class RetanguloTeste {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Retangulo retangulo = new Retangulo();

		System.out.println("Entre com as medidas do Retângulo: ");
		System.out.print("Entre com a largua: ");
		retangulo.largura = sc.nextDouble();
		System.out.print("Entre com a altura: ");
		retangulo.altura = sc.nextDouble();

		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("PERTIMETRO = %.2f%n", retangulo.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());

		sc.close();
	}
}
