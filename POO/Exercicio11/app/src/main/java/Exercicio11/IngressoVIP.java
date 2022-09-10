package Exercicio11;

public class IngressoVIP extends Ingresso{
    
    private float taxa = 0.5f;
    
    public IngressoVIP(){
        super();
    }
    
    public void imprimirValorVIP(){
        float preco;
        preco = getValor() * (1 + taxa);
        System.out.println("O valor do ingresso VIP é R$"+ preco +".");
    }
}
