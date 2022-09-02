/*
Exercício 15
Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200
*/
package Exercicio15;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        float numero;
        
        System.out.print("Digite um número: ");
        numero = leitor.nextFloat();
        
        if((numero >= 100)&&(numero < 200)){
            System.out.println("O número "+ numero +" está entre 100 e 200.");
        }
        else{
            System.out.println("O número "+ numero +" não está entre 100 e 200");
        }
    }
}
