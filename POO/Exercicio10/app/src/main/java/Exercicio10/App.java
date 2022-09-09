/*
Exercício 10
Crie uma classe para representar um jogador de futebol, com os atributos:
a. nome;
b. posição;
c. data de nascimento;
d. nacionalidade;
e. altura;
f. peso;
Crie os métodos públicos necessários para getters e setters e também um método para imprimir todos os 
dados do jogador. Crie um método para calcular a idade do jogador e outro método para mostrar quanto 
tempo falta para o jogador se aposentar. Para isso, considere que os jogadores da posição de defesa se 
aposentam em média aos 40 anos, os jogadores de meio-campo aos 38 e os atacantes aos 35.
*/
package Exercicio10;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Jogador objeto = new Jogador();
        
        System.out.print("Digite o nome do jogador: ");
        objeto.setNome(leitor.next());
        System.out.println("Joga em qual posição?");
        System.out.println("1 - defesa");
        System.out.println("2 - meio campo");
        System.out.println("3 - ataque");
        objeto.setPosicao(leitor.nextInt());
        System.out.print("Digite o dia do nascimento: ");
        objeto.setDia(leitor.nextInt());
        System.out.print("Digite o mês do nascimento: ");
        objeto.setMes(leitor.nextInt());
        System.out.print("Digite o ano do nascimento: ");
        objeto.setAno(leitor.nextInt());
        System.out.print("Digite o dia de hoje: ");
        objeto.setDiaAtual(leitor.nextInt());
        System.out.print("Digite o mês atual: ");
        objeto.setMesAtual(leitor.nextInt());
        System.out.print("Digite o ano atual: ");
        objeto.setAnoAtual(leitor.nextInt());
        System.out.print("Digite sua nacionalidade: ");
        objeto.setNacionalidade(leitor.next());
        System.out.print("Digite sua altura: ");
        objeto.setAltura(leitor.nextFloat());
        System.out.print("Digite seu peso: ");
        objeto.setPeso(leitor.nextFloat());
        if(objeto.idade() > 16){
            objeto.dados();
        }
        else{
            System.out.println("Datas inválidas.");
        }
    }
}
