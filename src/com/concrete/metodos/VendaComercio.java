package com.concrete.metodos;

import java.util.Locale;
import java.util.Scanner;

public class VendaComercio {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("=======================================================================");
		System.out.println("\t\t\t\t VENDAS");
		System.out.println("=======================================================================");

		String num = "";

		double[] ultimasVendas = new double[5];
		
		double total = 0;

		while (!num.equals("f")) {

			System.out.println("a - Realizar venda");
			System.out.println("b - Calcular pagamento a vista");
			System.out.println("c - Calcular pagamento parcelado");
			System.out.println("d - Calcular prestação em atraso");
			System.out.println("e - Total de vendas");
			System.out.println("f - Sair");

			System.out.println("Informe a opção: ");
			num = sc.next();
			switch (num) {

			case "a":
				System.out.print("Informe o valor do produto: ");
				double valorProduto = sc.nextDouble();
				double comissao = valorProduto * 0.25;
				double imposto = valorProduto * 0.65;
				double valorTotalDaVenda = valorProduto + comissao + imposto;
				System.out.println("\nO valor total do produto é: " + (valorTotalDaVenda));
				System.out.println("=====================================================");
				break;
			case "b":
				System.out.print("Informe o valor a pagar: ");
				double valorReceber = sc.nextDouble();
				System.out.print("Informe o percentual de desconto: ");
				double desconto = sc.nextInt();
				if (desconto <= 15) {
					System.out.println("O percentual de desconto é: " + desconto);
				} else {
					System.out.println("Desconto não se aplica!");
				}
				break;
			case "c":
				System.out.print("Informe o valor a pagar: ");
				double valorPagar = sc.nextDouble();
				System.out.println("Informe a quantidade de parcelas: ");
				double quantidadeParcelas = sc.nextInt();
				final double juros = 0.02;

				if (quantidadeParcelas >= 3 && quantidadeParcelas < 37) {

					quantidadeParcelas += valorPagar * juros;
					System.out.println("O valor é: " + quantidadeParcelas);

				} else {
					System.out.println("Quantidade de parcelas inválidade");
				}
				break;
			case "d":
				double valorPrestacao, valorAtualPrestacao, taxa, diasAtraso = 0;
				System.out.println("Informe o valor da prestação: ");
				valorAtualPrestacao = sc.nextDouble();
				System.out.println("Informe o valor atual da prestação: ");
				valorAtualPrestacao = sc.nextDouble();
				System.out.println("Informe a taxa: ");
				taxa = sc.nextDouble();
				System.out.println("Informe os dias em atraso: ");

				valorPrestacao = valorAtualPrestacao + (valorAtualPrestacao * (taxa / 100) * diasAtraso);

				System.out.println("A prestação em atraso é: " + valorPrestacao);
				break;

			case "e":
				valorTotalDaVenda = 0;
				for (int i = 0; i < ultimasVendas.length; i++) {
					valorTotalDaVenda += ultimasVendas[i];
					System.out.println(valorTotalDaVenda);

				}
				

			case "f":
				System.out.println("Programa encerrado!");

			}
		}

	}
}