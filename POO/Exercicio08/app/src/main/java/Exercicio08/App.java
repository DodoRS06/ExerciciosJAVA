/*
Exercício 08
Escreva uma classe Data cuja instância (objeto) represente uma data. Esta classe deverá dispor dos 
seguintes métodos:
a. Construtor: define a data que determinado objeto (através de parâmetro), este método verifica se a 
data está correta, caso não esteja a data é configurada como 01/01/0001
b. Compara: recebe como parâmetro um outro objeto da Classe data, compare com a data corrente e 
retorne: 
i. 0 se as datas forem iguais; 
ii. 1 se a data corrente for maior que a do parâmetro; 
iii. -1 se a data do parâmetro for maior que a corrente.
c. GetDia: retorna o dia da data
d. GetMes: retorna o mês da data
e. GetMesExtenso: retorna o mês da data corrente por extenso
f. GetAno: retorna o ano da data
g. IsBissexto: retorna verdadeiro se o ano da data corrente for bissexto e falso caso contrário
h. Clone: o objeto clona a si próprio, para isto, ele cria um novo objeto da classe Data com os 
mesmos valores de atributos e retorna sua referência pelo método
*/
package Exercicio08;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Data objeto = new Data(06, 04, 2000);
        int aux;
        
        System.out.print("Digite o dia de hoje: ");
        objeto.setDiaN(leitor.nextInt());
        System.out.print("Digite o mês atual: ");
        objeto.setMesN(leitor.nextInt());
        System.out.print("Digite o ano atual: ");
        objeto.setAnoN(leitor.nextInt());
        
        System.out.println("Dia: "+ objeto.getDia());
        System.out.println("Mês: "+ objeto.getMes());
        System.out.println("Ano: "+ objeto.getAno());
        aux = objeto.compara(23, 12, 2001);
        if(aux < 0){
            System.out.println("Data corrente menor.");
        }
        else if(aux > 0){
            System.out.println("Data corrente maior.");
        }
        else{
            System.out.println("Datas iguais.");
        }
         
        System.out.println("Dia corrente: "+ objeto.getDiaN());
        System.out.println("Mês corrente: "+ objeto.getMesN());
        System.out.println("Ano corrente: "+ objeto.getAnoN());
        objeto.getMesExtenso();
        if(objeto.isBissexto(objeto.getAnoN())){
            System.out.println("Ano bissexto!");
        }
        else{
            System.out.println("Ano não bissexto!");
        }
    }
}
