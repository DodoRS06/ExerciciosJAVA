/*
Exercício 32
Escreva um algoritmo que leia três valores inteiros e verifique se eles podem ser os lados de um triângulo. 
Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ou escaleno. 
Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos 
outros dois lados. 
a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais; 
b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais. 
c. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
*/
package Exercicio32;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        float ladoA, ladoB, ladoC;
        
        System.out.print("Digite o valor do lado A: ");
        ladoA = leitor.nextFloat();
        System.out.print("Digite o valor do lado B: ");
        ladoB = leitor.nextFloat();
        System.out.print("Digite o valor do lado C: ");
        ladoC = leitor.nextFloat();
        
        if(((ladoA + ladoB) <= ladoC)||((ladoA + ladoC) <= ladoB)||((ladoB + ladoC) <= ladoA)){
            System.out.println("A figura não é um triângulo.");
        }
        else{
            if((ladoA == ladoB)&&(ladoA == ladoC)){
                System.out.println("Equilátero.");
            }
            else if((ladoA == ladoB)||(ladoA == ladoC)||(ladoB == ladoC)){
                System.out.println("Isósceles.");
            }
            else{
                System.out.println("Escaleno.");
            }
        }
    }
}
