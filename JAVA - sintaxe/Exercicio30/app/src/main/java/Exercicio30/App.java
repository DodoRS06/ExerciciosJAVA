/*
Exercício 30
Escreva um algoritmo que leia três valores inteiros distintos e os escreva em ordem crescente;
*/
package Exercicio30;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        int i=0, maior = 0, menor = 99999, meio = 0;
        int numero[] = new int[3];
        
        for(i=0; i<3; i++){
            System.out.print("Digite o "+ (i+1) +"º número: ");
            numero[i] = leitor.nextInt();
            
            if(numero[i] > maior){
                maior = numero[i];
            }
            if(numero[i] < menor){
                menor = numero[i];
            }   
        }
        for(i=0; i<3; i++){
            if((numero[i] != maior)&&(numero[i] != menor)){
                meio = numero[i];
            }
        }
        System.out.println(menor +" "+ meio +" "+ maior);
    }
}
