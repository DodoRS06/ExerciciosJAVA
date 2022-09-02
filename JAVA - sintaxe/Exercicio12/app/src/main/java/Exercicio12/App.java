/*
Exercicio 12
O custo de um carro novo ao consumidor é a soma do custo de fábrica mais o percentual do distribuidor e 
dos impostos aplicados (primeiro os impostos são aplicados sobre o custo de fábrica, e depois o percentual 
do distribuidor sobre o resultado). Supondo que o percentual do distribuidor seja de 28% e os impostos 45%,
escreva um algoritmo que leia o custo de fábrica de um carro e informe o custo ao consumidor do mesmo;
*/
package Exercicio12;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formatado = new DecimalFormat("0.00");
        
        float custo, percentual = 0.28f, imposto = 0.45f, venda;
        
        System.out.print("Digite o custo do veículo: R$");
        custo = leitor.nextFloat();
        
        venda = (custo * (1+ imposto))*(1 + percentual);
        
        System.out.print("O preço de venda do carro é R$"+ formatado.format(venda) +".");
    }
}
