package com.concrete.variaveistiposdedados;

import java.util.Scanner;

public class CalcularRaioDoCirculo {

    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);

        double raio, area;
        final double PI = 3.1415;

        System.out.println("Informe o valor do raio: ");
        raio = scan.nextDouble();

        area = PI * (Math.pow(raio, 2));

        System.out.println("O valor da área é: " + area);

        scan.close();

    }
}
