package Exercicio04;

import java.util.Scanner;

public class Elevador {
    
    Scanner leitor = new Scanner(System.in);
    
    private int andarAtual = 0, totalAndares , quantPessoas = 0, capacidade;

    public void inicializa(){
        System.out.print("Digite a capacidade do elevador: ");
        setCapacidade(leitor.nextInt());
        System.out.print("Digite o total de andares do prédio: ");
        setTotalAndares(leitor.nextInt());
    }
    
    public void entra(){
        if(quantPessoas < capacidade){
            quantPessoas = quantPessoas + 1;
        }
        else{
            System.out.println("Elevador cheio.");
        }
    }
    
    public void sai(){
        if(quantPessoas > 0){
            quantPessoas = quantPessoas - 1;
        }
        else{
            System.out.println("Elevador vazio.");
        }
    }
    
    public void sobe(){
        if(andarAtual < totalAndares){
            andarAtual = andarAtual + 1;
        }
        else{
            System.out.println("Elevador no último andar.");
        }
    }
    
    public void desce(){
        if(andarAtual > 0){
            andarAtual = andarAtual - 1;
        }
        else{
            System.out.println("Elevador no térreo.");
        }
    }
    
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getQuantPessoas() {
        return quantPessoas;
    }

    public void setQuantPessoas(int quantPessoas) {
        this.quantPessoas = quantPessoas;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    
}
