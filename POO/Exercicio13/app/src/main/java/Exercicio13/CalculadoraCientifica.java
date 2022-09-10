package Exercicio13;

public class CalculadoraCientifica extends Calculadora{
    
    private double raizQuadrada;
    private double potencia;
    
    public double raiz(float var1){
        raizQuadrada = Math.sqrt(var1);
        return raizQuadrada;
    }
    
    public double potencia(float var1, float var2){
        potencia = Math.pow(var1, var2);
        return potencia;
    }
}
