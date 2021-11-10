package capitulo03.exercicio03_17;

public class PerfilDeSaude {
    
    private String nome;
    private String sobrenome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;
    private double altura;
    private double peso;

    public PerfilDeSaude(String nome, String sobrenome, int diaNascimento,
            int mesNascimento, int anoNascimento, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public void setDiaNascimento(int diaNascimento) {
        this.diaNascimento = diaNascimento;
    }

    public void setMesNascimento(int mesNascimento) {
        this.mesNascimento = mesNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public int getDiaNascimento() {
        return diaNascimento;
    }

    public int getMesNascimento() {
        return mesNascimento;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }
    
    public int calcIdade() {
        int idade = 2021 - getAnoNascimento();
        return idade;
    }
    
    public int calcFreqCardMaxima() {
        int freqCardMaxima = 220 - calcIdade();
        return freqCardMaxima;
    }
    
    public double calc50porcentoFreqCardAlvo() {
        double _50porcento = calcFreqCardMaxima() * 0.50;
        return _50porcento;
    }
    
    public double calc85porcentoFreqCardAlvo() {
        double _85porcento = calcFreqCardMaxima() * 0.85;
        return _85porcento;
    }
    
    public double calcImc(){
        double imc = getPeso() / (Math.pow(getAltura(), 2));
        return imc;
    }
    
    public void exibeGraficoImc() {
        System.out.println("----------------------------------");
        System.out.println("| VALORES DE IMC                 |");
        System.out.println("| Abaixo do peso: menos de 18,5  |");
        System.out.println("| Normal: entre 18,5 e 24,9      |");
        System.out.println("| Sobrepeso: entre 25 e 29,9     |");
        System.out.println("| Obeso: 30 ou mais              |");
        System.out.println("----------------------------------");
    }    
}
