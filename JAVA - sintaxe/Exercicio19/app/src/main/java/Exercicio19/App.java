/*
Exercício 19
Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e informe o nome e se ela é homem ou 
mulher. No final informe total de homens e de mulheres;
*/
package Exercicio19;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        String nome[] = new String[5];
        String sexo[] = new String[5];
        int i=0;
        
        for(i=0; i<5; i++){
            System.out.print("Digite o nome da "+ (i+1) +"ª pessoa: ");
            nome[i] = leitor.nextLine();
        }
        for(i=0; i<5; i++){
            System.out.print("Digite o sexo de "+ nome[i] +" [M]/[F]: ");
            sexo[i] = leitor.next();
        }
        for(i=0; i<5; i++){
            if((sexo[i] == "M")||(sexo[i] == "m")){
                System.out.println(nome[i] +" é do sexo masculino.");
            }
            else if((sexo[i] == "F")||(sexo[i] == "f")){
                System.out.println(nome[i] +" é do sexo feminino.");
            }
            else{
                System.out.println("Sexo inválido!");
            }
        }
    }
}
