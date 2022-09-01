/*
Exercício 09
Faça um algoritmo que receba um valor que foi depositado e exiba o valor com rendimento após um 
mês. Considere fixo o juro da poupança em 0,07% a. m.
*/
package Exercicio09;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double valor;
        
        System.out.print("Digite o valor a ser depositado: R$");
        valor = leitor.nextDouble();
        
        System.out.println("O valor após um mês será R$"+ valor*1.07 +".");
    }
}
