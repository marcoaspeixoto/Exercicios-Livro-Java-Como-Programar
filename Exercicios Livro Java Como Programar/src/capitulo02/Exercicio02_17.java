package capitulo02;

import java.util.Scanner;

public class Exercicio02_17 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int numero3;
        int soma;
        int produto;
        int media;
        int maior;
        int menor;

        System.out.print("Insira o primeiro número: ");
        numero1 = entrada.nextInt();

        System.out.print("Insira o segundo número: ");
        numero2 = entrada.nextInt();

        System.out.print("Insira o terceiro número: ");
        numero3 = entrada.nextInt();

        soma = numero1 + numero2 + numero3;
        produto = numero1 * numero2 * numero3;
        media = soma / 3;

        menor = numero1;

        if (numero2 < menor) {
            menor = numero2;
        }

        if (numero3 < menor) {
            menor = numero3;
        }

        maior = numero1;

        if (numero2 > maior) {
            maior = numero2;
        }

        if (numero3 > maior) {
            maior = numero3;
        }

        System.out.printf("A soma é %d%n", soma);
        System.out.printf("A média é %d%n", media);
        System.out.printf("O produto é %d%n", produto);
        System.out.printf("O número menor é %d%n", menor);
        System.out.printf("O número maior é %d%n", maior);
    }
}
