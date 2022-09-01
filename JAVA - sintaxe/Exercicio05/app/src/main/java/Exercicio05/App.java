/*
Exercício 05
Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre. 
No final informar o nome do aluno e a sua média (aritmética);
*/
package Exercicio05;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String nome;
        int i=0;
        double media, cont=0;
        double nota[] = new double[3];
        
        System.out.print("Digite seu nome: ");
        nome = leitor.nextLine();
        
        for(i=0; i<3; i++){
            System.out.print("Digite a "+ i +"ª nota: ");
            nota[i] = leitor.nextDouble();
            cont = cont + nota[i];
        }
        
        media = cont / i;
        System.out.println("O aluno "+ nome +" obteve uma média de "+ media +" entre as provas.");
    }
}
