/*
Exercício 27
A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Faça um 
algoritmo que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O desconto deverá ser 
calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina – 21% ou diesel 
–14%). Com valor do veículo zero encerra entrada de dados. Informe total de desconto e total pago pelos 
clientes;
*/
package Exercicio27;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        float valor, valorDesconto = 0, valorPago = 0;
        int tipo;
        
        do{
            System.out.print("Digite o valor do veículo: R$");
            valor = leitor.nextFloat();
            
            if(valor != 0){
                System.out.println("Digite o tipo de combustível do carro: ");
                System.out.println("1 - álcool");
                System.out.println("2 - gasolina");
                System.out.println("3 - diesel");
                tipo = leitor.nextInt();
                switch(tipo){
                    case 1:
                        valorDesconto = valorDesconto + (valor*0.25f);
                        valorPago = valorPago + (valor*0.75f);
                        break;
                    case 2:
                        valorDesconto = valorDesconto + (valor*0.21f);
                        valorPago = valorPago + (valor*0.79f);
                        break;
                    case 3:
                        valorDesconto = valorDesconto + (valor*0.14f);
                        valorPago = valorPago + (valor*0.86f);
                        break;
                    default:
                        System.out.println("Tipo de combustível inválido!!");
                        break;           
                }
            }
        }while(valor != 0);
        System.out.println("O desconto é de R$"+ formato.format(valorDesconto) +".");
        System.out.println("O valor a ser pago é R$"+ formato.format(valorPago) +".");
        
    }
}
