package Exercicio11;

import java.text.DecimalFormat;

public class Ingresso {
    
    DecimalFormat formato = new DecimalFormat();
    
    private float valor = 0;

    public void imprimirValor(){
        System.out.print("O ingresso comum custa R$"+ formato.format(getValor()));
    }
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    
}
