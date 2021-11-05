package capitulo02;

import java.util.Scanner;

public class Exercicio02_05 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int x;
        int y;
        int z;
        int result;

        System.out.print("Insira o primeiro inteiro: ");
        x = input.nextInt();

        System.out.print("Insira o segundo inteiro: ");
        y = input.nextInt();

        System.out.print("Insira o terceiro inteiro: ");
        z = input.nextInt();

        result = x * y * z;

        System.out.printf("Product is %d%n", result);
    }
}
