package capitulo03.exercicio03_17;

import java.util.Scanner;

public class PerfilDeSaudeTeste {
    
    public static void main(String[] args) {
        
        PerfilDeSaude pessoa = new PerfilDeSaude(
                "Marco", "Peixoto", 12, 4, 1979, 1.91, 120);
        
        imprimeRelatorio(pessoa);
        
        Scanner entrada = new Scanner(System.in);
                
        System.out.println("\nAltere os dados da pessoa:");
        System.out.print("Insira o nome: ");
        String nome = entrada.next();
        pessoa.setNome(nome);
                
        System.out.print("Insira o sobrenome: ");
        String sobrenome = entrada.next();
        pessoa.setSobrenome(sobrenome);
        
        System.out.println("Insira a data de nascimento:");
        System.out.print("Dia: ");
        int dia = entrada.nextInt();
        pessoa.setDiaNascimento(dia);
        System.out.print("Mês: ");
        int mes = entrada.nextInt();
        pessoa.setMesNascimento(mes);
        System.out.print("Ano: ");
        int ano = entrada.nextInt();
        pessoa.setAnoNascimento(ano);
        
        System.out.print("Insira a altura: ");
        double altura = entrada.nextDouble();
        pessoa.setAltura(altura);
        
        System.out.print("Insira o peso: ");
        double peso = entrada.nextDouble();
        pessoa.setPeso(peso);
        
        System.out.println("");
        
        imprimeRelatorio(pessoa);
    }
    
    public static void imprimeRelatorio(PerfilDeSaude individuo){
        
        System.out.printf("Nome......................: %s%n", individuo.getNome());
        System.out.printf("Sobrenome.................: %s%n", individuo.getSobrenome());
        System.out.printf("Data de nascimento........: %02d/%02d/%d%n", individuo.getDiaNascimento(),
                individuo.getMesNascimento(), individuo.getAnoNascimento());
        System.out.printf("Idade.....................: %d anos%n", individuo.calcIdade());
        System.out.printf("Frequência cardíaca máxima: %d bpm%n", individuo.calcFreqCardMaxima());
        System.out.printf("Frequência cardíaca alvo..: entre %.1f e %.1f bpm%n",
                individuo.calc50porcentoFreqCardAlvo(), individuo.calc85porcentoFreqCardAlvo());
        System.out.printf("IMC.......................: %.1f%n", individuo.calcImc());
        individuo.exibeGraficoImc();
    }
}

