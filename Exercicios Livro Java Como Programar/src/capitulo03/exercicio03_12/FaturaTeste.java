package capitulo03.exercicio03_12;

import java.util.Scanner;

public class FaturaTeste {
    
    public static void main(String[] args) {
        
        Fatura faturaDoFulano = new Fatura("123", "mouse", 2, 20.00);
        
        System.out.printf("Fatura nº %s%n", faturaDoFulano.getNumero());
        System.out.printf("Descrição............: %s%n", faturaDoFulano.getDescricao());
        System.out.printf("Quantidade...........: %d%n", faturaDoFulano.getQuantidade());
        System.out.printf("Preço do item........: R$ %.2f%n", faturaDoFulano.getPrecoItem());
        System.out.printf("Valor total da fatura: R$ %.2f%n", faturaDoFulano.valorFatura());
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("\nAltere o número da fatura: ");
        String novoNumero = entrada.next();
        faturaDoFulano.setNumero(novoNumero);
        
        System.out.print("Altere a descrição da fatura: ");
        String novaDescricao = entrada.next();
        faturaDoFulano.setDescricao(novaDescricao);
        
        System.out.print("Altere a quantidade de item da fatura: ");
        int novaQuantidade = entrada.nextInt();
        faturaDoFulano.setQuantidade(novaQuantidade);
        
        System.out.print("Altere o preço do item da fatura: ");
        double novoPreco = entrada.nextDouble();
        faturaDoFulano.setPrecoItem(novoPreco);
        
        System.out.printf("%nFatura nº %s%n", faturaDoFulano.getNumero());
        System.out.printf("Descrição............: %s%n", faturaDoFulano.getDescricao());
        System.out.printf("Quantidade...........: %d%n", faturaDoFulano.getQuantidade());
        System.out.printf("Preço do item........: R$ %.2f%n", faturaDoFulano.getPrecoItem());
        System.out.printf("Valor total da fatura: R$ %.2f%n", faturaDoFulano.valorFatura());
    }
}
