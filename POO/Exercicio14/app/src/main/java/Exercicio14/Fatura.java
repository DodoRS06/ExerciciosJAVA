package Exercicio14;

public class Fatura {
    
    private String numero, descricao;
    private int quantidade;
    private double preco;

    public Fatura(){
        
    }
    
    public double getTotalFatura(){
        double total = 0, valor;
        valor = quantidade * preco;
        total = total + valor;
        return total;
    }
    
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade < 0){
            this.quantidade = 0;
        }
        else{
            this.quantidade = quantidade;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if(preco < 0){
            this.preco = 0;
        }
        else{
            this.preco = preco;
        }
    }
    
    
}
