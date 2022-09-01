/*
Exercício 06
Leia dois valores para as variáveis A e B, e efetuar as trocas dos valores de forma que a variável A passe a 
possuir o valor da variável B e a variável B passe a possuir o valor da variável A.Apresentar os valores 
trocados
*/
package Exercicio06;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int valorA, valorB, aux;
        
        System.out.print("Digite o valor de A: ");
        valorA = leitor.nextInt();
        System.out.print("Digite o valor de B: ");
        valorB = leitor.nextInt();
        
        aux = valorA;
        valorA = valorB;
        valorB = aux;
        
        System.out.println("O valor de A agora é: "+ valorA +".");
        System.out.println("O valor de B agora é: "+ valorB +".");
    }
}
