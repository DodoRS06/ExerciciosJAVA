/*
Exercício 01
Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
 */
package Exercicio01;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int n1, n2, soma;
        
        System.out.print("Digite o primeiro número: ");
        n1 = leitor.nextInt();
        System.out.print("Digite o segundo número: ");
        n2 = leitor.nextInt();
        
        soma = n1 + n2;
        
        System.out.println("A soma entre o número "+ n1 +" e o número "+ n2 +" é "+ soma +"."); 
    }
}