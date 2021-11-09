package capitulo03.exercicio03_13;

public class Empregado {

    String nome;
    String sobrenome;
    double salario;

    public Empregado(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;

        if (salario > 0) {
            this.salario = salario;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setSalario(double salario) {

        if (salario < 0) {
            return;
        }

        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public double getSalario() {
        return salario;
    }
}
