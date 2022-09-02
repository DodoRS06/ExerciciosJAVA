/*
Exercício 17
Leia 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive) e 150 
(inclusive)
*/
package Exercicio17;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        float numeros[] = new float[80];
        int i=0;
        
        for(i=0; i<80; i++){
            System.out.print("Digite o "+ (i+1) +"º número: ");
            numeros[i] = leitor.nextFloat();
        }
        System.out.println("Estão entre 10 e 150, os números: ");
        for(i=0; i<80; i++){            
            if((numeros[i] >= 10)&&(numeros[i] <=150)){
                System.out.println(numeros[i]);
            }
        }
    }
}
