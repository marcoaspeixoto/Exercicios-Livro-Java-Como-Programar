package capitulo03.exercicio03_16;

public class FrequenciaCardiaca {
    
    private String nome;
    private String sobrenome;
    private int diaNascimento;
    private int mesNascimento;
    private int anoNascimento;

    public FrequenciaCardiaca(String nome, String sobrenome, int diaNascimento,
            int mesNascimento, int anoNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
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
}
