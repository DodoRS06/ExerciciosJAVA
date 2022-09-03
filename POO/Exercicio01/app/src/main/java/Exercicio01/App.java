/*
Exercício 01
Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e 
altura. Crie os métodos públicos necessários para getters e setters e também um método para imprimir 
todos dados de uma pessoa. Crie um método para calcular a idade da pessoa. 
*/
package Exercicio01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        Pessoa objeto = new Pessoa();
        
        System.out.print("Digite seu nome: ");
        objeto.setNome(leitor.next());
        System.out.print("Digite sua altura: ");
        objeto.setAltura(leitor.nextFloat());
        System.out.print("Digite o dia de nasicmento: ");
        objeto.setDia(leitor.nextInt());
        System.out.print("Digite o mês de nascimento: ");
        objeto.setMes(leitor.nextInt());
        System.out.print("Digite o ano de nascimento: ");
        objeto.setAno(leitor.nextInt());
        System.out.print("Digite o dia atual: ");
        objeto.setDiaAtual(leitor.nextInt());
        System.out.print("Digite o mês atual: ");
        objeto.setMesAtual(leitor.nextInt());
        System.out.print("Digite o ano atual: ");
        objeto.setAnoAtual(leitor.nextInt());
        
        objeto.dados();
        if(objeto.idade() < 1){
            System.out.println("Idade inválida.");
        }
        else{
            System.out.println("Idade: "+ objeto.idade());
        }
    }
}
