package capitulo02;

import java.util.Scanner;

class Exercicio02_15 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;
        int soma;
        int produto;
        int diferenca;
        int quociente;

        System.out.print("Insira o primeiro número: ");
        numero1 = entrada.nextInt();

        System.out.print("Insira o segundo número: ");
        numero2 = entrada.nextInt();

        soma = numero1 + numero2;
        produto = numero1 * numero2;
        diferenca = numero1 - numero2;
        quociente = numero1 / numero2;

        System.out.printf("A soma é %d%n", soma);
        System.out.printf("O produto é %d%n", produto);
        System.out.printf("A diferença é %d%n", diferenca);
        System.out.printf("O quociente é %d%n", quociente);
    }
}
