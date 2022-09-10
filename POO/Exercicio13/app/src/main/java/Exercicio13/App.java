/*
Exercício 13
Crie uma classe Calculadora. Esta classe deve implementar as operações básicas (soma, subtração, divisão 
e multiplicação). Utilizando o conceito de herança crie uma classe chamada calculadora cientifica que 
implementa os seguintes cálculos: raizQuadrada e a potencia. Dica utilize a classe Math do pacote 
java.lang.
*/
package Exercicio13;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Calculadora Obj1 = new Calculadora();
        CalculadoraCientifica Obj2 = new CalculadoraCientifica();
        
        boolean teste = true;
        String resp;
        int opcao;
        float var1, var2;
        
        while(teste == true){
            System.out.println("Digite a operação desejada ");
            System.out.println("1 - SOMA");
            System.out.println("2 - SUBTRAÇÃO");
            System.out.println("3 - MULTIPLICAÇÃO");
            System.out.println("4 - DIVISÃO");
            System.out.println("5 - RAIZ QUADRADA");
            System.out.println("6 - POTENCIAÇÃO");
            opcao = leitor.nextInt();
            
            switch(opcao){
                case 1 -> {
                    System.out.print("Digite um valor: ");
                    var1 = leitor.nextFloat();
                    System.out.print("Digite outro valor: ");
                    var2 = leitor.nextFloat();
                    System.out.println("Resultado da soma: "+ Obj1.somar(var1, var2));
                }
                case 2 -> {
                    System.out.print("Digite um valor: ");
                    var1 = leitor.nextFloat();
                    System.out.print("Digite outro valor: ");
                    var2 = leitor.nextFloat();
                    System.out.println("Resultado da subtração: "+ Obj1.subtrair(var1, var2));
                }
                case 3 -> {
                    System.out.print("Digite um valor: ");
                    var1 = leitor.nextFloat();
                    System.out.print("Digite outro valor: ");
                    var2 = leitor.nextFloat();
                    System.out.println("Resultado da multiplicação: "+ Obj1.multiplicar(var1, var2));
                }
                case 4 -> {
                    System.out.print("Digite um valor: ");
                    var1 = leitor.nextFloat();
                    System.out.print("Digite outro valor: ");
                    var2 = leitor.nextFloat();
                    System.out.println("Resultado da divisão: "+ Obj1.dividir(var1, var2));
                }
                case 5 -> {
                    System.out.print("Digite um valor: ");
                    var1 = leitor.nextFloat();
                    System.out.println("Resultado da raiz: "+ Obj2.raiz(var1));
                }
                case 6 -> {
                    System.out.print("Digite um valor: ");
                    var1 = leitor.nextFloat();
                    System.out.print("Digite outro valor: ");
                    var2 = leitor.nextFloat();
                    System.out.println("Resultado da exponenciação: "+ Obj2.potencia(var1, var2));
                }
                default -> System.out.println("Opção inválida!");
            }
            
            System.out.print("Deseja continuar [s]/[n]? ");
            resp = leitor.next();
            
            if((resp.startsWith("N"))||(resp.startsWith("n"))){
                teste = false;
            }
        }
    }
}
