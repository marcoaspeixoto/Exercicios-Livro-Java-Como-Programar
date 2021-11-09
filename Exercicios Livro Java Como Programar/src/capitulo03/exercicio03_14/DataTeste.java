package capitulo03.exercicio03_14;

import java.util.Scanner;

public class DataTeste {
    
    public static void main(String[] args) {
        
        Data dataHoje = new Data(9, 11, 2021);
        
        System.out.printf("Data de hoje: %s", dataHoje.exibeData());
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Altere o dia: ");
        int dia = entrada.nextInt();
        dataHoje.setDia(dia);
        
        System.out.print("Altere o mês: ");
        int mes = entrada.nextInt();
        dataHoje.setMes(mes);
        
        System.out.print("Altere o ano: ");
        int ano = entrada.nextInt();
        dataHoje.setAno(ano);
        
        System.out.printf("Data de hoje alterada: %s", dataHoje.exibeData());
    }
}
