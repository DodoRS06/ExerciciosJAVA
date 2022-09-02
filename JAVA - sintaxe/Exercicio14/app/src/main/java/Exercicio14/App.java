/*
Exercício 14
Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
*/
package Exercicio14;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        int num1, num2;
        
        System.out.print("Digite o primeiro número: ");
        num1 = leitor.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = leitor.nextInt();
        
        if(num1 > num2){
            System.out.println("O número "+ num1 +" é maior que o número "+ num2 +".");
        }
        else if(num1 < num2){
            System.out.println("O número "+ num2 +" é maior que o número "+ num1 +".");
        }
        else{
            System.out.println("Os números "+ num1 +" e "+ num2 +" são iguais.");
        }
    }
}
