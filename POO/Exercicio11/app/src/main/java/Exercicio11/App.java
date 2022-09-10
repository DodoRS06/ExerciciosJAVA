/*
Exercício 11
Crie uma classe chamada Ingresso, que possui um valor em reais e um mé
todo imprimirValor. Crie uma 
classe IngressoVIP, que herda de Ingresso e possui um valor adicional. Crie um mé
todo que retorne o 
valor do ingresso VIP (com o adicional incluído). Crie um programa para criar as instâncias de Ingresso e
IngressoVIP, mostrando a diferença de preços.
*/
package Exercicio11;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Ingresso objeto1 = new Ingresso();
        IngressoVIP objeto2 = new IngressoVIP();
        int opcao;
        
        System.out.println("Selecione uma opção:");
        System.out.println("1 - Ingresso comum");
        System.out.println("2 - Ingresso VIP");
        opcao = leitor.nextInt();
        switch(opcao){
            case 1 -> {
                System.out.println("Digite o valor do ingresso: ");
                objeto1.setValor(leitor.nextFloat());
                objeto1.imprimirValor();
            }
            case 2 -> {
                System.out.println("Digite o valor do ingresso: ");
                objeto2.setValor(leitor.nextFloat());
                objeto2.imprimirValorVIP();
            }
            default -> System.out.println("Opção inválida.");
        }
    }
}
