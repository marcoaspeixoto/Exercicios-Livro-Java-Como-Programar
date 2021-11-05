package capitulo02;

import java.util.Scanner;

public class Exercicio02_30 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;
        int digito1;
        int digito2;
        int digito3;
        int digito4;
        int digito5;
        int resto;

        System.out.print("Insira um número: ");
        numero = entrada.nextInt();

        digito1 = numero / 10000;
        resto = numero % 10000;
        digito2 = resto / 1000;
        resto = resto % 1000;
        digito3 = resto / 100;
        resto = resto % 100;
        digito4 = resto / 10;
        resto = resto % 10;
        digito5 = resto;

        System.out.printf("%d %d %d %d %d%n", digito1, digito2, digito3,
                digito4, digito5);
    }
}
