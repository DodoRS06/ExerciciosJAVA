/*
Exercício 16
Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. Calcular a 
sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), Reprovado (media <= 5) e 
Recuperação (media entre 5.1 a 6.9)
 */
package Exercicio16;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        String nome;
        float notas[] = new float[3];
        float media, soma = 0;
        int i=0;
        
        System.out.print("Digite seu nome: ");
        nome = leitor.nextLine();
        
        for(i=0; i<3; i++){
            System.out.print("Digite a "+ (i+1) +"ª nota: ");
            notas[i] = leitor.nextFloat();
            soma = soma + notas[i];
        }
        
        media = soma / i;
        
        if(media >= 7){
            System.out.println("O aluno "+ nome +" teve nota "+ formato.format(media) +" e foi aprovado.");
        }
        else if(media <=5){
            System.out.println("O aluno "+ nome +" teve nota "+ formato.format(media) +" e foi reprovado.");
        }
        else{
            System.out.println("O aluno "+ nome +" teve nota "+ formato.format(media) +" e está de recuperação.");
        }
    }
}
