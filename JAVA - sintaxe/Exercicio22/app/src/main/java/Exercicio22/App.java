/*
Exercício 22
Faça um algoritmo que receba o preço de custo e o preço de venda de 40 produtos. Mostre como resultado 
se houve lucro, prejuízo ou empate para cada produto. Informe o valor de custo de cada produto, o valor 
de venda de cada produto, a média de preço de custo e do preço de venda
*/
package Exercicio22;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        float custo[] = new float[40];
        float venda[] = new float[40];
        float somaCusto = 0, somaVenda = 0, mediaCusto, mediaVenda;
        int i = 0;
        
        for(i=0; i<40; i++){
            System.out.print("Digite o preço de custo do "+ (i+1) +"º produto: ");
            custo[i] = leitor.nextFloat();
            System.out.print("Digite o preço de venda do "+ (i+1) +"º produto: ");
            venda[i] = leitor.nextFloat();
            somaCusto = somaCusto + custo[i];
            somaVenda = somaVenda + venda[i];
        }
        System.out.print("");
        for(i=0; i<40; i++){
            System.out.println("O valor de custo do "+ (i+1) +"º produto é "+ formato.format(custo[i]));
            System.out.println("O valor de venda do "+ (i+1) +"º produto é "+ formato.format(venda[i]));
            if(custo[i] > venda[i]){
                System.out.println("Você levou prejuízo. ");
            }
            else if(custo[i] < venda[i]){
                System.out.println("Você lucrou. ");
            }
            else{
                System.out.println("Você não obteve lucro e nem prejuízo.");
            }
            System.out.print("");
        }
        System.out.println("A média do preço de custo é "+ formato.format(somaCusto/i));
        System.out.println("A média do preço de venda é "+ formato.format(somaVenda/i));
    }
}
