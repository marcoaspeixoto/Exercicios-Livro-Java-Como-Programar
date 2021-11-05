package capitulo02;

import java.util.Scanner;

public class Exercicio02_28 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int raio;

        System.out.print("Insira o valor do raio: ");
        raio = entrada.nextInt();

        System.out.printf("Diâmetro: %d%n", 2 * raio);
        System.out.printf("Circunferência: %f%n", 2 * Math.PI * raio);
        System.out.printf("Diâmetro: %f%n", Math.PI * raio * raio);
    }
}
