/*
Exercício 25
Faça um algoritmo que leia dois números e identifique se são iguais ou diferentes. Caso eles sejam iguais 
imprima uma mensagem dizendo que eles são iguais. Caso sejam diferentes, informe qual número é o 
maior, e uma mensagem que são diferentes;
*/
package Exercicio25;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        float numero1, numero2;
        
        System.out.print("Digite um número: ");
        numero1 = leitor.nextFloat();
        System.out.print("Digite outro número: ");
        numero2 = leitor.nextFloat();
        
        if(numero1 == numero2){
            System.out.println("Os números são iguais.");
        }
        else if(numero1 > numero2){
            System.out.println("Os números são diferentes. ");
            System.out.println("O número "+ numero1 +"é maior que "+ numero2 +".");
        }
        else{
            System.out.println("Os números são diferentes. ");
            System.out.println("O número "+ numero2 +"é maior que "+ numero1 +".");
        }
    }
}
