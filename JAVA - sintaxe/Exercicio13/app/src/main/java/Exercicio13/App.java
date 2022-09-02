/*
Exercicio13
Faça um algoritmo que receba um número e mostre uma mensagem caso este número seja maior que 10
*/
package Exercicio13;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        float numero;
        
        System.out.print("Digite um número: ");
        numero = leitor.nextFloat();
        
        if(numero > 10){
            System.out.println("O número digitado é maior que 10.");
        }
        else{
            System.out.println("O número digitado não é maior que 10.");
        }
    }
}
