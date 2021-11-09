package capitulo03.exercicio03_13;

public class EmpregadoTeste {
    
    public static void main(String[] args) {
        
        Empregado empregado1 = new Empregado("Marco", "Peixoto", 3000);
        Empregado empregado2 = new Empregado("Geiza", "Silva", -2000);
        
        System.out.printf("Nome............: %s%n", empregado1.getNome());
        System.out.printf("Sobrenome.......: %s%n", empregado1.getSobrenome());
        System.out.printf("Salário Mensal..: R$ %,.2f%n", empregado1.getSalario());
        System.out.printf("Salário Anual..: R$ %,.2f%n%n", empregado1.getSalario() * 12);
    
        System.out.printf("Nome............: %s%n", empregado2.getNome());
        System.out.printf("Sobrenome.......: %s%n", empregado2.getSobrenome());
        System.out.printf("Salário Mensal..: R$ %,.2f%n", empregado2.getSalario());
        System.out.printf("Salário Anual...: R$ %,.2f%n", empregado2.getSalario() * 12);
        
        System.out.print("\nAplicando aumento de 10% no salário\n\n");
        
        double novoSalario = empregado1.getSalario() * (1 + 10.0 / 100);
        empregado1.setSalario(novoSalario);
        
        novoSalario = empregado2.getSalario() * (1 + 10.0 / 100);
        empregado2.setSalario(novoSalario);
        
        System.out.printf("Nome............: %s%n", empregado1.getNome());
        System.out.printf("Sobrenome.......: %s%n", empregado1.getSobrenome());
        System.out.printf("Salário Mensal..: R$ %,.2f%n", empregado1.getSalario());
        System.out.printf("Salário Anual..: R$ %,.2f%n%n", empregado1.getSalario() * 12);
    
        System.out.printf("Nome............: %s%n", empregado2.getNome());
        System.out.printf("Sobrenome.......: %s%n", empregado2.getSobrenome());
        System.out.printf("Salário Mensal..: R$ %,.2f%n", empregado2.getSalario());
        System.out.printf("Salário Anual...: R$ %,.2f%n", empregado2.getSalario() * 12);
    }
}
