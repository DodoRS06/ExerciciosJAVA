package Exercicio13;

import java.util.Scanner;

public class Calculadora {
    
    Scanner leitor = new Scanner(System.in);
    
    private float soma = 0, subtracao = 0, multiplicacao = 0, divisao = 0;

    public float somar(float var1, float var2){
        soma = var1 + var2;
        return soma;
    }
    
    public float subtrair(float var1, float var2){
        subtracao = var1 - var2;
        return subtracao;
    }
    
    public float multiplicar(float var1, float var2){
        multiplicacao = var1 * var2;
        return multiplicacao;
    }
    
    public float dividir(float var1, float var2){
        divisao = var1 / var2;
        return divisao;
    }
    
    public float getSoma() {
        return soma;
    }

    public void setSoma(float soma) {
        this.soma = soma;
    }

    public float getSubtracao() {
        return subtracao;
    }

    public void setSubtracao(float subtracao) {
        this.subtracao = subtracao;
    }

    public float getMultiplicacao() {
        return multiplicacao;
    }

    public void setMultiplicacao(float multiplicacao) {
        this.multiplicacao = multiplicacao;
    }

    public float getDivisao() {
        return divisao;
    }

    public void setDivisao(float divisao) {
        this.divisao = divisao;
    }
    
}
