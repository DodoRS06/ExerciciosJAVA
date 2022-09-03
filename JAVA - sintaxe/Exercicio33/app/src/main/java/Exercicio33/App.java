/*
Exercício 33
A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um algoritmo que 
calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabela abaixo: 
a. Professor Nível 1 R$12,00 por hora/aula;
b. Professor Nível 2 R$17,00 por hora/aula;
c. Professor Nível 3 R$25,00 por hora/aula. 
*/
package Exercicio33;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        float horaAula, salario = 0;
        int nivel;
        
        System.out.print("Digite quantas horas/aula você fez: ");
        horaAula = leitor.nextFloat();
        System.out.println("Digite seu nível: ");
        System.out.println("1 - Nível 1 ");
        System.out.println("2 - Nível 2 ");
        System.out.println("3 - Nível 3 ");
        nivel = leitor.nextInt();
        System.out.println(""); 
        
        switch(nivel){
            case 1:
                salario = horaAula * 12;
                System.out.println("O salário do professor é R$"+ formato.format(salario) +".");
                break;
            case 2:
                salario = horaAula * 17;
                System.out.println("O salário do professor é R$"+ formato.format(salario) +".");
                break;
            case 3:
                salario = horaAula * 25;
                System.out.println("O salário do professor é R$"+ formato.format(salario) +".");
                break;
            default:
                System.out.println("Nível inválido!");
                break;
        }              
    }
}
