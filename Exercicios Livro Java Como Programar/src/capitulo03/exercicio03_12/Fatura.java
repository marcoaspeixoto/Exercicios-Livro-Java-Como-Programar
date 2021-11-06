package capitulo03.exercicio03_12;

public class Fatura {
    
    String numero;
    String descricao;
    int quantidade;
    double precoItem;
    
    Fatura(String numero, String descricao, int quantidade, double precoItem) {
        
        this.numero = numero;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoItem = precoItem;
    }

    public String getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }
    
    public double valorFatura() {
        
        if (quantidade < 0) {
            quantidade = 0;
        }
        
        if (precoItem < 0) {
            precoItem = 0;
        }
        
        return quantidade * precoItem;
    }
}
