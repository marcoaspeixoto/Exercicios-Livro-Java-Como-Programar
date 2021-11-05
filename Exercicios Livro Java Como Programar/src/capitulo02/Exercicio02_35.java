package capitulo02;

import java.util.Scanner;

public class Exercicio02_35 {

    public static void main(String[] args) {

        double quilometrosTotaisDia;
        double precoLitroGasolina;
        double quilometrosMediosLitro;
        double taxaEstacionamentoDia;
        double pedagioDia;
        double custoDia;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe os quilômetros totais dirigidos por dia: ");
        quilometrosTotaisDia = entrada.nextDouble();

        System.out.print("Informe o preço por litro da gasolina: ");
        precoLitroGasolina = entrada.nextDouble();

        System.out.print("Informe os quilômetros médios por litro: ");
        quilometrosMediosLitro = entrada.nextDouble();

        System.out.print("Informe as taxas de estacionamento por dia: ");
        taxaEstacionamentoDia = entrada.nextDouble();

        System.out.print("Informe os os pedágios por dia: ");
        pedagioDia = entrada.nextDouble();

        custoDia = quilometrosTotaisDia / quilometrosMediosLitro * precoLitroGasolina
                + taxaEstacionamentoDia + pedagioDia;

        System.out.printf("Custo por dia de dirigir: R$ %.2f%n", custoDia);
    }
}
