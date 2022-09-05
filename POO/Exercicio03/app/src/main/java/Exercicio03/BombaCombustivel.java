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
        boolean teste = true;
        
        while(teste == true ){
            System.out.print("Digite o valor a ser abastecido: R$");
            abastecido = leitor.nextFloat();
            litros = abastecido / valor;
            
            if(litros < quantidade){
                System.out.println("Foram abastecidos "+ formato.format(litros) +" litros de "+ tipo +".");
                this.quantidade = quantidade - litros;
                teste = false;
            }
            else{
                System.out.println("Não há combustível suficiente na bomba.");
            }
        }
    }
    
    public void abastecerPorLitro(){
        float litros, abastecido;
        boolean teste = true;
        
        while(teste == true){
            System.out.print("Digite quantos litros deseja abastecer: ");
            litros = leitor.nextFloat();
            
            if(litros < quantidade){
                abastecido = litros * valor;
                System.out.println("Ficaram R$"+ formato.format(abastecido) +" ao todo.");
                this.quantidade = quantidade - litros;
                teste = false;
            }
            else{
                System.out.println("Não há combustível suficiente na bomba.");
            }
        }
        
    }
    
    public void alterarValor(){
        float novoValor;
        System.out.print("Qual valor de "+ tipo +": R$");
        novoValor = leitor.nextFloat();
        this.valor = novoValor;
    }
    
    public void alterarCombustivel(){
        int combustivel;
        String novoTipo = null;
        boolean teste = true;
        
        System.out.println("Digite o tipo de combustível: ");
        System.out.println("1 - Etanol");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        System.out.println("4 - Gás");
        combustivel = leitor.nextInt();
        
        while(teste == true){
            switch(combustivel){
                case 1:
                    novoTipo = "Etanol";
                    teste = false;
                    break;
                case 2:
                    novoTipo = "Gasolina";
                    teste = false;
                    break;
                case 3:
                    novoTipo = "Diesel";
                    teste = false;
                    break;
                case 4:
                    novoTipo = "Gas";
                    teste = false;
                    break;
                default:
                    teste = true;
                    System.out.println("Tipo indefinido.");
            }
        }
        this.tipo = novoTipo;
    }
    
    public void alterarQuantidadeCombustivel(){
        float quant;
        boolean teste = true;
        
        while(teste == true){
            System.out.print("Digite a nova quantidade: ");
            quant = leitor.nextFloat();
            if(quant > 0){
                this.quantidade = quant;
                teste = false;
            }
            else{
                System.out.println("Quantidade inválida!");
            }
        }
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
