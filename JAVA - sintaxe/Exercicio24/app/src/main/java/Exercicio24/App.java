/*
Exercício 24
Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;
*/
package Exercicio24;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        int i=0;
        float numero[] = new float[5];
        
        for(i=0; i<5; i++){
            System.out.print("Digite o "+ (i+1) +"º número: ");
            numero[i] = leitor.nextFloat();
        }
        System.out.println();
        for(i=0; i<5; i++){
            if(numero[i] > 0){
                System.out.println("O número "+ numero[i] +" é positivo.");
            }
            else if(numero[i] < 0){
                System.out.println("O número "+ numero[i] +" é negativo.");
            }
            else{
                System.out.println("O número "+ numero[i] +" é igual a zero.");
            }
        }
    }
}
