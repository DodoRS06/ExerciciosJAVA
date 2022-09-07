package Exercicio06;

public class Invoice {
    
    private int numero, quantidade;
    private float precoUnit;
    private String descricao;

    public Invoice(int numero, int quantidade, float precoUnit, String descricao) {
        this.numero = numero;
        this.descricao = descricao;
        setPrecoUnit(precoUnit);
        setQuantidade(quantidade);
    }
    
    public double getInvoiceAmount(){
        double valor;
        
        valor = quantidade * precoUnit;
        
        return valor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
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

    public float getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(float precoUnit) {
        if(precoUnit < 0){
            this.precoUnit = 0;
        }
        else{
            this.precoUnit = precoUnit;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
