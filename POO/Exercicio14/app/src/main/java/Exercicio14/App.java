/*
Exercício 14
Crie uma classe em Java chamada Fatura para uma loja de suprimentos de informática. A classe deve 
conter quatro atributos: 
a. número (String);
b. descrição (String);
c. quantidade comprada de um item (int);
d. preço por item (double).
A classe deve ter um construtor e os métodos getters e setters. Além disso, forneça um método chamado 
getTotalFatura que calcula o valor da fatura e depois retorna o valor como um double. Se o valor não for 
positivo, ele deve ser alterado para 0. Se o preço por item não for positivo, ele deve ser alterado para 0. 
Escreva uma nova classe chamada FaturaTeste (que contenha o método main) que demonstre as 
capacidades da classe Fatura.
 */
package Exercicio14;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Fatura objeto = new Fatura();
        boolean teste = true;
        String resp;

        while (teste == true) {
            System.out.println("Digite o número do produto: ");
            objeto.setNumero(leitor.next());
            System.out.println("Digite a descrição do produto: ");
            objeto.setDescricao(leitor.next());
            System.out.print("Digite a quantidade comprada do item: ");
            objeto.setQuantidade(leitor.nextInt());
            System.out.print("Digite o preço por item: ");
            objeto.setPreco(leitor.nextDouble());

            System.out.print("Deseja continuar [s]/[n]? ");
            resp = leitor.next();
            if ((resp.startsWith("N")) || (resp.startsWith("n"))) {
                teste = false;
            }
        }
        System.out.print("O total é R$" + objeto.getTotalFatura());
    }
}
