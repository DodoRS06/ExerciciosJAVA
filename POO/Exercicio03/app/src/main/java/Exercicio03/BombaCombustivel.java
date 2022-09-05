package Exercicio03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class BombaCombustivel {
    
    Scanner leitor = new Scanner(System.in);
    DecimalFormat formato = new DecimalFormat("0.00");

    private String tipo;
    private float valor, quantidade;

    public void abastecerPorValor(){
        float litros, abastecido;
        
        System.out.print("Digite o valor a ser abastecido: R$");
        abastecido = leitor.nextFloat();
        litros = abastecido / valor;
        System.out.println("Foram abastecidos "+ formato.format(litros) +" litros de "+ tipo +".");
    }
    
    public void abastecerPorLitro(){
        float litros, abastecido;
        
        System.out.print("Digite quantos litros deseja abastecer: ");
        litros = leitor.nextFloat();
        abastecido = litros * valor;
        System.out.println("Ficaram R$"+ formato.format(abastecido) +" ao todo.");
    }
    
    public void alterarValor(){
        float novoValor;
        System.out.print("Qual valor de "+ tipo +": R$");
        novoValor = leitor.nextFloat();
        this.valor = novoValor;
    }
    
    public void alterarCombustivel(){
        int Combustivel;
        boolean teste = true;
        
        System.out.println("Digite o tipo de combustível: ");
        System.out.println("1 - Etanol");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        System.out.println("4 - Gás");
        Combustivel = leitor.nextInt();
        
        while(teste == true){
            switch(Combustivel){
                case 1:
                    tipo = "Etanol";
                    teste = false;
                    break;
                case 2:
                    tipo = "Gasolina";
                    teste = false;
                    break;
                case 3:
                    tipo = "Diesel";
                    teste = false;
                    break;
                case 4:
                    tipo = "Gas";
                    teste = false;
                    break;
                default:
                    teste = true;
                    System.out.println("Tipo indefinido.");
            }
        }
        setTipo();
    }
    
    public void alterarQuantidadeCombustivel(){
        
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }
    
    
}
