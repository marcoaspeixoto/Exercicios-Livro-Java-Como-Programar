package capitulo02;

import java.util.Scanner;

public class Exercicio02_16 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Insira o primeiro número: ");
        numero1 = entrada.nextInt();

        System.out.print("Insira o segundo número: ");
        numero2 = entrada.nextInt();

        if (numero1 > numero2) {
            System.out.println("O número 1 é maior");
        }

        if (numero2 > numero1) {
            System.out.println("O número 2 é maior");
        }

        if (numero1 == numero2) {
            System.out.println("Os números são iguais");
        }
    }
}
