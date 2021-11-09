package capitulo03.exercicio03_14;

public class Data {
    
    int mes, dia, ano;
    
    Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int getDia() {
        return dia;
    }
    
    public int getMes() {
        return mes;
    }
    
    public int getAno() {
        return ano;
    }
    
    public String exibeData() {
        String dataFormatada = String.format("%02d/%02d/%d%n", getDia(), getMes(), getAno());
        return dataFormatada;
    }
}
