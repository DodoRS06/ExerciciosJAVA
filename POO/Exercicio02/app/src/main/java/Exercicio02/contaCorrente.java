package Exercicio02;

import java.util.Scanner;
import java.text.DecimalFormat;

public class contaCorrente {

    Scanner leitor = new Scanner(System.in);
    DecimalFormat formato = new DecimalFormat("0.00");
    
    private int numeroDaConta, saldo;
    private String nome;

    public contaCorrente(int numeroDaConta, int saldo, String nome) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.nome = nome;
    }
    
    public void dados(){
        System.out.println("");
        System.out.println("Nome: "+ getNome());
        System.out.println("Número da conta: "+ getNumeroDaConta());
        System.out.println("Saldo: R$"+ getSaldo());
    }
    
    public void alterarNome(){
        System.out.print("Digite o novo nome: ");
        setNome(leitor.nextLine());
    }
    
    public void deposito(){
        int deposito = 0;
        System.out.print("Digite o valor do depósito: R$");
        deposito = leitor.nextInt();
        this.saldo = deposito;
    }
    
    public void saque(){
        int saque = 0;
        if(saldo > 0){
            System.out.print("Digite o valor do saque: R$");
            saque = leitor.nextInt();
            if(saque <= saldo){
                this.saldo = saldo - saque;
            }
            else{
                System.out.println("Você não tem saldo suficiente!");
            }
        }
        else{
            System.out.println("Você não tem saldo suficiente!");
        }
    }
    
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}
