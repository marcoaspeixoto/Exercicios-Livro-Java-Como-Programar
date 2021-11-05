package capitulo02;

import java.util.Scanner;

public class Exercicio02_25 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Insira um número: ");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        }

        if (numero % 2 != 0) {
            System.out.println("O número é impar");
        }
    }
}
