/*
Exercício 03
Escreva um algoritmo para determinar o consumo médio de um automóvel sendo fornecida a distância 
total percorrida pelo automóvel e o total de combustível gasto;
*/
package Exercicio3;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        float distancia, combustivel, consumo;
        
        System.out.print("Digite a distância total percorrida: ");
        distancia = leitor.nextFloat();
        System.out.print("Digite o total de combustível gasto: ");
        combustivel = leitor.nextFloat();
        
        consumo = distancia / combustivel;
        
        System.out.print("O consumo total é de "+ consumo +"km/l");
    }
}
