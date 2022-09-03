/*
Exercício 20
A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos com desconto. Faça 
um algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente de vários carros. O 
desconto deverá ser calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O 
sistema deverá perguntar se deseja continuar calculando desconto até que a resposta seja: “(N) Não”. 
Informar total de carros com ano até 2000 e total geral;
*/
package Exercicio20;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        boolean resposta = false;
        int ano, cont = 0, cont2000 = 0;
        float valor, totalDesconto = 0, totalPago = 0;
        String resp = "s";
        
        while (resposta == false){
            System.out.print("Digite o ano do veículo: ");
            ano = leitor.nextInt();
            System.out.print("Digite o valor do veículo: R$");
            valor = leitor.nextFloat();
            
            if(ano <= 2000){
                totalDesconto = totalDesconto + (valor * 0.12f);
                totalPago = totalPago + (valor * 0.88f);
                cont2000 = cont2000 + 1;
            }
            else{
                totalDesconto = totalDesconto + (valor * 0.07f);
                totalPago = totalPago + (valor * 0.93f);
            }
            cont = cont + 1;
            
            System.out.print("Deseja continuar [S]/[N]? ");
            resp = leitor.next();
            
            if((resp.startsWith("N"))||(resp.startsWith("n"))){
                resposta = true;
            }
            
            System.out.println("");
        }
        
        System.out.println("O valor do desconto é R$"+ formato.format(totalDesconto));
        System.out.println("O valor a ser pago é R$"+ formato.format(totalPago));
        System.out.println(cont2000 +" carros foram produzidos até 2000.");
        System.out.println("Há "+ cont +" carros no total.");
    }
}
