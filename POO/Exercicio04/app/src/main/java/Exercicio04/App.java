/*
Exercício 04
Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um 
prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o 
térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também 
disponibilizar os seguintes métodos: 
a. Inicializa: que deve receber como parâmetros a capacidade do elevador e o total de andares no 
prédio (os elevadores sempre começam no térreo e vazio);
b. Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
c. Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
d. Sobe: para subir um andar (não deve subir se já estiver no último andar);
e. Desce: para descer um andar (não deve descer se já estiver no térreo);
*/
package Exercicio04;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        Elevador objeto = new Elevador();
        boolean teste = true;
        int opcao;
        String resp;
        
        System.out.println("Iniciando o elevador...");
        System.out.println("");
        objeto.inicializa();
        
        while(teste == true){
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Pessoa entrou no elevador");
            System.out.println("2 - Pessoa saiu do elevador");
            System.out.println("3 - Subir um andar");
            System.out.println("4 - Descer um andar");
            opcao = leitor.nextInt();
            
            switch(opcao){
                case 1:
                    objeto.entra();
                    break;
                case 2:
                    objeto.sai();
                    break;
                case 3:
                    objeto.sobe();
                    break;
                case 4:
                    objeto.desce();
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
            
            System.out.println("Quantidade de pessoas: "+ objeto.getQuantPessoas());
            System.out.println("Andar: "+ objeto.getAndarAtual());           
            System.out.println("");
            System.out.println("Deseja continuar [s]/[n]?");
            resp = leitor.next();
            
            if((resp.startsWith("N"))||(resp.startsWith("n"))){
                teste = false;
            }
        }
    }
}
