/*
Exercício 21
Escreva um algoritmo que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informe se está apta 
ou não para cumprir o serviço militar obrigatório. Informe os totais
*/
package Exercicio21;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        String nome, sexo, saude, resp;
        int idade, contPode = 0, contNao = 0;
        boolean resposta = false;
        
        while(resposta == false){
            System.out.print("Digite seu nome: ");
            nome = leitor.next();
            System.out.print("Digite sua idade: ");
            idade = leitor.nextInt();
            
            if(idade >= 18){
                System.out.print("Digite o seu sexo [F]/[M]: ");
                sexo = leitor.next();
                if((sexo.startsWith("M"))||(sexo.startsWith("m"))){
                    System.out.print("Informe sua saúde [ok]/[ruim]: ");
                    saude = leitor.next();
                    if((saude.equals("OK"))||(saude.equals("Ok"))||(saude.equals("ok"))){          
                        System.out.println(nome +" está apto a exercer o serviço militar!!");
                        contPode = contPode + 1;
                    }
                    else{
                        System.out.println(nome +" não está apto a exercer o serviço militar.");
                        contNao = contNao + 1;
                    }
                }
                else{
                    System.out.println(nome +" não está apto a exercer o serviço militar.");
                    contNao = contNao + 1;
                }
            }
            else{
                System.out.println(nome +" não está apto a exercer o serviço militar.");
                contNao = contNao + 1;
            }
            
            System.out.println("Deseja fazer uma nova consulta [S]/[N]? ");
            resp = leitor.next();
            System.out.println("");
            
            if((resp.startsWith("N"))||(resp.startsWith("n"))){
                resposta = true;
            }
        }
        
        System.out.println(contPode +" pessoas podem se alistar.");
        System.out.println(contNao +" pessoas não podem se alistar.");
    }
}
