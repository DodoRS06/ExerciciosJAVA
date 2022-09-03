/*
Exercício 35
Faça um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculo da conta de 
luz segue a tabela abaixo: 
Tipo de Cliente Valor do KW/h
a. (Residência) 0,60;
b. (Comércio) 0,48;
c. (Indústria) 1,29 
*/
package Exercicio35;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        int tipo;
        float horas, total = 0;
        
        System.out.print("Digite quantas horas de luz você gastou: ");
        horas = leitor.nextFloat();
        System.out.println("Qual tipo de cliente? ");
        System.out.println("1 - Residência");
        System.out.println("2 - Comércio");
        System.out.println("3 - Indústria");
        tipo = leitor.nextInt();
        System.out.println("");
        
        switch(tipo){
            case 1:
                total = horas * 0.6f;
                System.out.println("O valor a ser pago é R$"+ formato.format(total) +".");
                break;
            case 2:
                total = horas * 0.48f;
                System.out.println("O valor a ser pago é R$"+ formato.format(total) +".");
                break;
            case 3:
                total = horas * 1.29f;
                System.out.println("O valor a ser pago é R$"+ formato.format(total) +".");
                break;
            default:
                System.out.println("Tipo inválido!!");
                break;
        }  
    }
}
