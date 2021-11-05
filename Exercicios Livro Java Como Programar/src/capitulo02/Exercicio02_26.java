package capitulo02;

import java.util.Scanner;

public class Exercicio02_26 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.print("Insira o primeiro número para sabermos se é"
                + " múltiplo do segundo: ");
        numero1 = entrada.nextInt();

        System.out.print("Insira o segundo número: ");
        numero2 = entrada.nextInt();

        if (numero1 % numero2 == 0) {
            System.out.printf("%d é múltiplo de %d%n", numero1, numero2);
        }

        if (numero1 % numero2 != 0) {
            System.out.printf("%d não é múltiplo de %d%n", numero1, numero2);
        }
    }
}
