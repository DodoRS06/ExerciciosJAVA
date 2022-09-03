/*
Exercício 31
Dados três valores A, B e C, em que A e B são números reais e C é um caractere, pede-se para imprimir o 
resultado da operação de A por B se C for um símbolo de operador aritmético; caso contrário deve ser 
impressa uma mensagem de operador não definido. Tratar erro de divisão por zero;
*/
package Exercicio31;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        float a, b, resultado=0;
        String c;
        
        System.out.print("Digite o valor de a: ");
        a = leitor.nextFloat();
        System.out.print("Digite o valor de b: ");
        b = leitor.nextFloat();
        System.out.print("Digite o operador c: ");
        c = leitor.next();
        
        if("+".equals(c)){
            resultado = a + b;
            System.out.println("O resultado da soma é "+ formato.format(resultado) +".");
        }
        else if("-".equals(c)){
            resultado = a - b;
            System.out.println("O resultado da subtração é "+ formato.format(resultado) +".");
        }
        else if("*".equals(c)){
            resultado = a * b;
            System.out.println("O resultado da multiplicação é "+ formato.format(resultado) +".");
        }
        else if("/".equals(c)){
            if(b == 0){
                System.out.println("Não é possível dividir um número por zero.");
            }
            else{
                resultado = a / b;
                System.out.println("O resultado da divisão é "+ formato.format(resultado) +".");
            }
        }
        else{
            System.out.println("Operador não definido!");
        }        
    }
}
