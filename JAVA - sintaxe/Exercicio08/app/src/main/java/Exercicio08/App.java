/*
Exercício 08
Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) de um valor lido em 
dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares 
disponíveis com o usuário;
*/
package Exercicio08;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int moeda;
        float real, dolar, cotacao;
        
        System.out.println("Qual moeda deseja converter?");
        System.out.println("Digite 1: Real");
        System.out.println("Digite 2: Dólar");
        moeda = leitor.nextInt();
        switch(moeda){
            case 1:
                System.out.print("Digite o valor de cotação do dólar em real: ");
                cotacao = leitor.nextFloat();
                System.out.print("Digite a quantidade de real disponível: ");
                real = leitor.nextFloat();
                
                dolar = real / cotacao;
                
                System.out.println("Você tem U$"+ dolar +".");              
            break;
                
            case 2:
                System.out.print("Digite o valor da cotação do real em dólar: ");
                cotacao = leitor.nextFloat();
                System.out.print("Digite a quantidade de dólar disponível: ");
                dolar = leitor.nextFloat();
                
                real = dolar / cotacao;
                
                System.out.println("Você tem R$"+ real +"."); 
            break;
                
            default:
                System.out.println("Valor inválido!");
            break;
        }
    }
}
