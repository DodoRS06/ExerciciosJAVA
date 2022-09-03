/*
Exercício 28
Escreva um algoritmo para uma empresa que decide dar um reajuste a seus 584 funcionários de acordo 
com os seguintes critérios: 
a. 50% para aqueles que ganham menos do que três salários mínimos;
b. 20% para aqueles que ganham entre três até dez salários mínimos; 
c. 15% para aqueles que ganham acima de dez até vinte salários mínimos; 
d. 10% para os demais funcionários.

Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salário 
reajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto à empresa 
vai aumentar sua folha de pagamento;
*/
package Exercicio28;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        String nome[] = new String[3];
        float salario[] = new float[3];
        float pagamento = 0;
        float aux[] = new float[3];
        float salarioMinimo;
        int i=0;
        
        System.out.print("Digite o valor do salário mínimo: R$");
        salarioMinimo = leitor.nextFloat();
        
        for(i=0; i<3; i++){
            System.out.print("Digite o "+ (i+1) +"º nome: ");
            nome[i] = leitor.next();
            System.out.print("Digite seu salário: R$");
            salario[i] = leitor.nextFloat();
            if(salario[i] < (3*salarioMinimo)){
                aux[i] = salario[i];
                salario[i] = salario[i]*1.5f;
            }
            else if(salario[i] < (10*salarioMinimo)){
                aux[i] = salario[i];
                salario[i] = salario[i]*1.2f;
            }
            else if(salario[i] < (20*salarioMinimo)){
                aux[i] = salario[i];
                salario[i] = salario[i]*1.15f;
            }
            else{
                aux[i] = salario[i];
                salario[i] = salario[i]*1.1f;
            }
        }
        System.out.print("");
        for(i=0; i<3; i++){
            System.out.println("O salário de "+ nome[i] +" foi reajustado em R$"+ formato.format(salario[i]-aux[i]) +" e passará a ser R$"+ formato.format(salario[i]) +".");
            pagamento = pagamento + (salario[i]-aux[i]);
        }
        System.out.println("A empresa vai aumentar em R$"+ formato.format(pagamento) +" na sua folha de ponto.");
    }
}
