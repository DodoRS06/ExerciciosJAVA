/*
Exercício 26
Faça um algoritmo que leia um número de 1 a 5 e escreva por extenso. Caso o usuário digite um número 
que não esteja neste intervalo, exibir a seguinte mensagem: número inválido
*/
package Exercicio26;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        int numero;
        String resp;
        boolean resposta = true;
        
        while(resposta == true){
            System.out.print("Digite um número de 1 a 5: ");
            numero = leitor.nextInt();
            if(numero == 1){
                System.out.println("Um.");
            }
            else if(numero == 2){
                System.out.println("Dois.");
            }
            else if(numero == 3){
                System.out.println("Três.");
            }
            else if(numero == 4){
                System.out.println("Quatro.");
            }
            else if(numero == 5){
                System.out.println("Cinco.");
            }
            else{
                System.out.println("Número inválido!");
            }
            
            System.out.print("Deseja digitar outro número [s]/[n]? ");
            resp = leitor.next();
            
            if((resp.startsWith("n"))||(resp.startsWith("N"))){
                resposta = false;
            }
            
            System.out.println("");
        }
    }
}
