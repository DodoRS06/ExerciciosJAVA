/*
Exercício 10
A Loja Mamão com Açúcar está vendendo seus produtos em 5(cinco)prestações sem juros. Faça um 
algoritmo que receba um valor de uma compra e mostre o valor das prestações;
*/
package Exercicio10;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float valor, prestacao;
        int quant;
        
        System.out.print("Digite o valor da compra: R$");
        valor = leitor.nextFloat();
        System.out.print("Digite a quantidade de prestações: ");
        quant = leitor.nextInt();
        if((quant > 0)&&(quant <= 5)){
            prestacao = valor / quant;
            System.out.println("Você pagará "+ quant +" parcelas de R$"+ prestacao +".");
        }
        else{
            System.out.println("Quantidade de prestações inválida!");
        }        
    }
}
