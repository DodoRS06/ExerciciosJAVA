/*
Exercício 09
Escreva uma classe em que cada objeto representa um Voo que acontece em determinada data e em 
determinado horário. Cada vôo possui no máximo 100 passageiros, e a classe permite controlar a 
ocupação das vagas. A classe deve ter os seguintes métodos:
a. Construtor: configura os dados do vôo (recebidos como parâmetro): número do vôo, data (para 
armazenar a data utilize um objeto da classe Data, criada na questão anterior);
b. ProximoLivre: retorna o número da próxima cadeira livre
c. Verifica: verifica se o número da cadeira recebido como parâmetro está ocupada
d. Ocupa: ocupa determinada cadeira do vôo, cujo número é recebido como parâmetro, e retorna 
verdadeiro se a cadeira ainda não estiver ocupada (operação foi bem sucedida) e falso caso 
contrário
e. Vagas: retorna o número de cadeiras vagas disponíveis (não ocupadas) no vôo
f. GetVoo: retorna o número do vôo
 */
package Exercicio09;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        Voo objeto = new Voo(1, "15");
        Data obj = new Data(06, 04, 2000);
        int opcao, aux=0;
        boolean resposta = true;
        String resp;

        while (resposta == true) {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Saber a próxima cadeira livre");
            System.out.println("2 - Pesquisar se cadeira está ocupada");
            System.out.println("3 - Ocupar cadeira");
            System.out.println("4 - Ver quantidade de vagas disponíveis");
            System.out.println("5 - Dados do vôo");
            opcao = leitor.nextInt();
            switch(opcao){
                case 1:
                    objeto.proximoLivre();
                    break;
                case 2:
                    System.out.println("Digite o número da cadeira: ");
                    aux = leitor.nextInt();
                    if(objeto.verifica(aux)){
                        System.out.println("Cadeira ocupada.");
                    }
                    else{
                        System.out.println("Cadeira vazia.");
                    }
                    break;
                case 3:
                    System.out.println("Digite o número da cadeira: ");
                    aux = leitor.nextInt();
                    if(objeto.ocupa(aux)){
                        System.out.println("Operação bem sucedida!");
                    }
                    else{
                        System.out.println("Cadeira ocupada.");
                    }
                case 4:
                    System.out.println("Há "+ objeto.vagas() +" vagas.");
                    break;
                case 5:
                    System.out.println("Número do vôo: "+ objeto.getVoo());
                    System.out.println(obj.getDiaN() + "/"+ obj.getMesN() +"/"+ obj.getAnoN());
                    System.out.println("Horário: "+ objeto.getHorario());
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
            
            System.out.print("Deseja continuar [s]/[n]? ");
            resp = leitor.next();
            
            if((resp.startsWith("N"))||(resp.startsWith("n"))){
                resposta = false;
            }
            
        }
    }
}
