/*
Exercício 02
Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos: 
número da conta, nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e 
saque; No construtor, saldo é opcional, com valor default zero e os demais atributos são obrigatórios.
*/
package Exercicio02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class App {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        DecimalFormat formato = new DecimalFormat("0.00");
        
        int opcao;
        contaCorrente objeto = new contaCorrente(1, 0, "nome");
        boolean resposta = false;
        String resp;
        
        while(resposta == false){
            System.out.println("Qual operação deseja fazer? ");
            System.out.println("1 - Trocar nome");
            System.out.println("2 - Depositar dinheiro");
            System.out.println("3 - Sacar dinheiro");
            opcao = leitor.nextInt();
        
            switch(opcao){
                case 1:
                    objeto.alterarNome();
                    break;
                case 2:
                    objeto.deposito();
                    break;
                case 3:
                    objeto.saque();
                    break;
                default:
                    System.out.println("Opração inválida!");
                    break;
            }
            
            objeto.dados();
            
            System.out.print("Deseja fazer outra operação [s]/[n]? ");
            resp = leitor.next();
            System.out.println("");
            
            if((resp.startsWith("N"))||(resp.startsWith("n"))){
                resposta = true;
            }
        }
    }
}
