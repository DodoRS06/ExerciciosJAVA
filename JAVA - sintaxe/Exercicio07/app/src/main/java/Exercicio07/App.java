/*
Exercício 07
Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de 
conversão é:F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius;
*/
package Exercicio07;

import java.util.Scanner;

public class App {    

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double celsius, fahrenheit;
        
        System.out.print("Digite a temperatura em ºCelsius: ");
        celsius = leitor.nextFloat();
        
        fahrenheit = ((9 * celsius) + 160) / 5;
        
        System.out.print("A temperatura é "+ fahrenheit +"ºF.");
    }
}
