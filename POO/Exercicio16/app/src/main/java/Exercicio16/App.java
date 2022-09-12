/*
Exercício 16
Construa uma classe para representar um carro. O tanque de combustível do carro armazena no máximo 50 
litros de gasolina. O carro consome 15 km/litro. Deve ser possível:
a. Abastecer o carro com certa quantidade de gasolina;
b. Mover o carro em uma determinada distância (medida em km);
c. Retornar a quantidade de combustível e a distância total percorrida.
No programa principal, crie 2 carros. Abasteça 20 litros no primeiro e 30 litros no segundo. Desloque o 
primeiro em 200 km e o segundo em 400 km. Exiba na tela a distância percorrida e o total de combustível 
restante para cada um.
*/
package Exercicio16;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        Carro objeto = new Carro();
        boolean teste = true;
        int opcao;
        String resp;
        
        while(teste == true){
            System.out.println("Escolha um carro: ");
            System.out.println("1 - BMW X6");
            System.out.println("2 - Mercedez GLE 400");
            opcao = leitor.nextInt();
            switch(opcao){
                case 1 -> objeto.carro1();
                case 2 -> objeto.carro2();
                default -> System.out.println("Opcão inválida!");
            }
            System.out.print("Deseja continuar [s]/[n]? ");
            resp = leitor.next();
            if((resp.startsWith("N"))||(resp.startsWith("n"))){
                teste = false;
            }
        }
        System.out.println("Foram percorridos "+ );
    }
}
