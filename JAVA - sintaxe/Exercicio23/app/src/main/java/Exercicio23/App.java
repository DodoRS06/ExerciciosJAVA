/*
Exercicio 23
Faça um algoritmo que receba um número e mostre uma mensagem caso este número sege maior que 80, 
menor que 25 ou igual a 40;
*/
package Exercicio23;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        float numero;
        boolean resposta = true;
        String resp;
        
        while(resposta == true){
            System.out.print("Digite um número: ");
            numero = leitor.nextFloat();
        
            if(numero > 80){
                System.out.println("O número digitado é maior que 80.");
            }
            else if(numero < 25){
                System.out.println("O número digitado é menor que 25.");
            }
            else if(numero == 40){
                System.out.println("O número é igual a 40.");
            }
            
            System.out.print("Deseja digitar outro número [s]/[n]? ");
            resp = leitor.next();
            
            if((resp.startsWith("N"))||(resp.startsWith("n"))){
                resposta = false;
            }
            System.out.println("");
        }
    }
}
