/*
Exercicio 11
Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o 
preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
*/
package Exercicio11;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float custo, taxa, venda;
        
        System.out.print("Digite o preço de custo do produto: R$");
        custo = leitor.nextFloat();
        System.out.print("Digite o percentual de acréscimo: ");
        taxa = leitor.nextFloat();
        
        venda = custo * (1+(taxa/100));
        System.out.println("O valor de venda é R$"+ venda +".");
        
    }
}
