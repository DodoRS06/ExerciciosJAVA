/*
Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as seguintes 
operações:
a. void armazenarPessoa(String nome, int idade, float altura); //armazena a pessoa em um array
b. void removerPessoa(String nome); //remove a pessoa do array
c. int buscarPessoa(String nome); // informa em que posição da agenda está a pessoa
d. void imprimirAgenda(); // imprime os dados de todas as pessoas da agenda
e. void imprimirPessoa(int index); // imprime os dados da pessoa que está na posição “i” da agenda*/
package Exercicio12;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        Agenda objeto = new Agenda();
        String nome, resp;
        int idade, opcao, index;
        float altura;
        boolean teste = false;

        while (teste == false) {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Adicionar pessoa na agenda");
            System.out.println("2 - Remover pessoa da agenda");
            System.out.println("3 - Buscar pessoa na agenda");
            System.out.println("4 - Mostrar pessoas da agenda");
            System.out.println("5 - Buscar pessoa por posição na agenda");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o nome da pessoa: ");
                    nome = leitor.next();
                    System.out.print("Digite a idade da pessoa: ");
                    idade = leitor.nextInt();
                    System.out.print("Digite a altura da pessoa: ");
                    altura = leitor.nextFloat();
                    objeto.armazenarPessoa(nome, idade, altura);
                }
                case 2 -> {
                    System.out.print("Digite o nome da pessoa: ");
                    nome = leitor.next();
                    objeto.removerPessoa(nome);
                }
                case 3 -> {
                    System.out.print("Digite o nome da pessoa: ");
                    nome = leitor.next();
                    System.out.println("Posição: "+ objeto.buscarPessoa(nome));
                }
                case 4 -> {
                    objeto.imprimitAgenda();
                }
                case 5 -> {
                    boolean testador = false;
                    while (testador == false) {
                        System.out.print("Digite a posição: ");
                        index = leitor.nextInt();
                        if ((index > 0) && (index <= 10)) {
                            objeto.imprimirPessoa(index);
                            testador = true;
                        } else {
                            System.out.println("Posição inválida!");
                        }
                    }
                }
                default -> {
                    System.out.println("Posição inválida!");
                }
            }
            
            System.out.print("Deseja continuar [s]/[n]? ");
            resp = leitor.next();
            
            if((resp.startsWith("N"))||(resp.startsWith("n"))){
                teste = true;
            }
        }
    }
}
