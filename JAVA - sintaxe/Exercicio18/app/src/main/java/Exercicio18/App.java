/*
Exercício 18
Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando “maior de idade” e 
“menor de idade” para cada pessoa. Considere a idade a partir de 18 anos como maior de idade;
*/
package Exercicio18;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        String nome[] = new String[75];
        int idade[] = new int[75];
        int i=0;
        
        for(i=0; i<75; i++){
            System.out.print("Digite o nome da "+ (i+1) +" pessoa: ");
            nome[i] = leitor.nextLine();       
        }
        for(i=0; i<75; i++){     
            System.out.print("Digite a idade de "+ nome[i] +": ");
            idade[i] = leitor.nextInt();
        }
        System.out.println("");
        
        for(i=0; i<75; i++){
            if(idade[i] >= 18){
                System.out.println(nome[i] +" é maior de idade.");
            }
            else{
                System.out.println(nome[i] +" é menor de idade.");
            }
        }
    }
}
