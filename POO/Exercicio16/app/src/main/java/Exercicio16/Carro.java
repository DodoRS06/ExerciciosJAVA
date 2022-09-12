package Exercicio16;

import java.util.Scanner;

public class Carro {
    
    Scanner leitor = new Scanner(System.in);
    
    private float distancia, tanque, quantidadeGasolina;
    
    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public float getTanque() {
        return tanque;
    }

    public void setTanque(float tanque) {
        this.tanque = tanque;
    }

    public float getQuantidadeGasolina() {
        return quantidadeGasolina;
    }

    public void setQuantidadeGasolina(float quantidadeGasolina) {
        this.quantidadeGasolina = quantidadeGasolina;
    }
    
    
    
}
