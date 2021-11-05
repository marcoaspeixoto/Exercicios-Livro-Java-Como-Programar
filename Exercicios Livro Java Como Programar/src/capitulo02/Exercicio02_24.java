package capitulo02;

import java.util.Scanner;

public class Exercicio02_24 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1, numero2, numero3, numero4, numero5;
        int menor, maior;

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

        menor = numero1;

        if (numero2 < menor) {
            menor = numero2;
        }

        if (numero3 < menor) {
            menor = numero3;
        }

        if (numero4 < menor) {
            menor = numero4;
        }

        if (numero5 < menor) {
            menor = numero5;
        }

        maior = numero1;

        if (numero2 > maior) {
            maior = numero2;
        }

        if (numero3 > maior) {
            maior = numero3;
        }

        if (numero4 > maior) {
            maior = numero4;
        }

        if (numero5 > maior) {
            maior = numero5;
        }

        System.out.printf("O número menor é %d%n", menor);
        System.out.printf("O número maior é %d%n", maior);
    }
}
