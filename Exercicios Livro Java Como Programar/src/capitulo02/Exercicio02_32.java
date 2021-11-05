package capitulo02;

import java.util.Scanner;

public class Exercicio02_32 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        int quantidadeNegativo = 0;
        int quantidadePositivo = 0;
        int quantidadeZero = 0;

        System.out.print("Insira o primeiro número: ");
        numero1 = entrada.nextInt();

        System.out.print("Insira o segundo número: ");
        numero2 = entrada.nextInt();

        System.out.print("Insira o terceiro número: ");
        numero3 = entrada.nextInt();

        System.out.print("Insira o quarto número: ");
        numero4 = entrada.nextInt();

        System.out.print("Insira o quinto número: ");
        numero5 = entrada.nextInt();

        if (numero1 < 0) {
            quantidadeNegativo = quantidadeNegativo + 1;
        }

        if (numero2 < 0) {
            quantidadeNegativo = quantidadeNegativo + 1;
        }

        if (numero3 < 0) {
            quantidadeNegativo = quantidadeNegativo + 1;
        }

        if (numero4 < 0) {
            quantidadeNegativo = quantidadeNegativo + 1;
        }

        if (numero5 < 0) {
            quantidadeNegativo = quantidadeNegativo + 1;
        }

        if (numero1 > 0) {
            quantidadePositivo = quantidadePositivo + 1;
        }

        if (numero2 > 0) {
            quantidadePositivo = quantidadePositivo + 1;
        }

        if (numero3 > 0) {
            quantidadePositivo = quantidadePositivo + 1;
        }

        if (numero4 > 0) {
            quantidadePositivo = quantidadePositivo + 1;
        }

        if (numero5 > 0) {
            quantidadePositivo = quantidadePositivo + 1;
        }

        if (numero1 == 0) {
            quantidadeZero = quantidadeZero + 1;
        }

        if (numero2 == 0) {
            quantidadeZero = quantidadeZero + 1;
        }

        if (numero3 == 0) {
            quantidadeZero = quantidadeZero + 1;
        }

        if (numero4 == 0) {
            quantidadeZero = quantidadeZero + 1;
        }

        if (numero5 == 0) {
            quantidadeZero = quantidadeZero + 1;
        }

        System.out.printf("Quantidade de negativos: %d%n", quantidadeNegativo);
        System.out.printf("Quantidade de postivios: %d%n", quantidadePositivo);
        System.out.printf("Quantidade de zeros: %d%n", quantidadeZero);
    }
}
