package capitulo02;

import java.util.Scanner;

public class Exercicio02_33 {

    public static void main(String[] args) {

        double peso;
        double altura;
        double imc;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Insira seu peso: ");
        peso = entrada.nextDouble();

        System.out.print("Insira sua altura: ");
        altura = entrada.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("Seu imc: %f%n", imc);

        System.out.println("----------------------------------");
        System.out.println("| VALORES DE IMC                 |");
        System.out.println("| Abaixo do peso: menos de 18,5  |");
        System.out.println("| Normal: entre 18,5 e 24,9      |");
        System.out.println("| Sobrepeso: entre 25 e 29,9     |");
        System.out.println("| Obeso: 30 ou mais              |");
        System.out.println("----------------------------------");
    }
}
