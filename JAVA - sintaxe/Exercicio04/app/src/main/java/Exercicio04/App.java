/*
Exercício 04
Escreva um algoritmo que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas 
por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas 
efetuadas, informar o seu nome, o salário fixo e salário no final do mês.
*/
package Exercicio04;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        float salario, vendas, salfinal;
        
        System.out.print("Digite seu nome: ");
        nome = leitor.nextLine();
        System.out.print("Digite seu salário: R$");
        salario = leitor.nextFloat();
        System.out.print("Digite o valor de vendas totais: R$");
        vendas = leitor.nextFloat();
        
        salfinal = (float) (salario + (vendas * 0.15));
        
        System.out.println("Nome: "+ nome);
        System.out.println("Salário fixo: R$"+ salario);
        System.out.println("Salário final: R$"+ salfinal);
    }
}