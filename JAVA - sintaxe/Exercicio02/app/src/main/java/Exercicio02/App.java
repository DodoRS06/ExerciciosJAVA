/*
Exercício 02
Faça um algoritmo que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão 
dos dois números lidos;
 */
package Exercicio02;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float n1, n2, soma, subtracao, multi, div;
        
        System.out.print("Digite o primeiro número: ");
        n1 = leitor.nextFloat();
        System.out.print("Digite o segundo número: ");
        n2 = leitor.nextFloat();
        
        soma = n1 + n2;
        subtracao = n1 - n2;
        multi = n1 * n2;
        div = n1 / n2;
        
        System.out.println("A soma entre "+ n1 +" e "+ n2 +" é "+ soma +".");
        System.out.println("A subtração entre "+ n1 +" e "+ n2 +" é "+ subtracao +".");
        System.out.println("A multiplicação entre "+ n1 +" e "+ n2 +" é "+ multi +".");
        System.out.println("A divisão entre "+ n1 +" e "+ n2 +" é "+ div +".");
    }
}
