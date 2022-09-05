/*
Exercício 03
Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os 
seguintes atributos: tipo de combustível, valor por litro e quantidade de combustível. Além desses 
atributos a classes deve conter os seguintes métodos.
a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de 
litros que foi colocada no veículo
b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o 
valor a ser pago pelo cliente.
c. alterarValor; //altera o valor do litro do combustível.
d. alterarCombustivel; //altera o tipo do combustível.
e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.
Crie uma classe que contenha um método main para testar sua classe BombaCombustível
*/
package Exercicio03;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        BombaCombustivel objeto = new BombaCombustivel();
        boolean teste = true, teste2 = true;
        int combustivel, fazer;
        String resp;
        
        System.out.println("Digite o tipo de combustível: ");
        System.out.println("1 - Etanol");
        System.out.println("2 - Gasolina");
        System.out.println("3 - Diesel");
        System.out.println("4 - Gás");
        combustivel = leitor.nextInt();
        
        while(teste == true){
            switch(combustivel){
                case 1:
                    objeto.setTipo("Etanol");
                    teste = false;
                    break;
                case 2:
                    objeto.setTipo("Gasolina");
                    teste = false;
                    break;
                case 3:
                    objeto.setTipo("Diesel");
                    teste = false;
                    break;
                case 4:
                    objeto.setTipo("Gás");
                    teste = false;
                    break;
                default:
                    System.out.println("Tipo indefinido.");
            }
        }
        System.out.print("Digite o valor do combustível: R$");
        objeto.setValor(leitor.nextFloat());
        System.out.print("Digite a quantidade de combustível: ");
        objeto.setQuantidade(leitor.nextFloat());
        System.out.println("");
        
        while(teste2 == true){
            System.out.println("O que deseja fazer?");        
            System.out.println("1 - Abastecer por valor");
            System.out.println("2 - Abastecer por litro");
            System.out.println("3 - Alterar Valor");
            System.out.println("4 - Alterar Combustível");
            System.out.println("5 - Alterar Quantidade de Combustível");
            fazer = leitor.nextInt();
            
            switch(fazer){
                case 1:
                    objeto.abastecerPorValor();
                    break;
                case 2:
                    objeto.abastecerPorLitro();
                    break;
                case 3:
                    objeto.alterarValor();
                    break;
                case 4:
                    objeto.alterarCombustivel();
                    break;
                case 5:
                    objeto.alterarQuantidadeCombustivel();
                    break;
                default:
                    System.out.println("Opção inválida!!!");
            }
            
            System.out.print("Deseja continuar [s]/[n]? ");
            resp = leitor.next();
            if((resp.startsWith("n"))||(resp.startsWith("N"))){
                teste2 = false;
            }
            System.out.println("Restaram "+ formato.format(objeto.getQuantidade()) + "litros na bomba");
        }
    }
}
