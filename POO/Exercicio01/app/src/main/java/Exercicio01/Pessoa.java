package Exercicio01;

import java.text.DecimalFormat;

public class Pessoa {
    
    DecimalFormat formato = new DecimalFormat("0.00");
    
    private String nome;
    private float altura;
    private int dia, mes, ano, diaAtual, mesAtual, anoAtual;  
    
    public int idade(){
        int id, aux;
        
        id = (anoAtual - ano);
        if(mesAtual < mes){
            id = id - 1;
        }
        else if(mesAtual == mes){
            if(diaAtual < dia){
                id = id - 1;
            }
        }
        return id;
    }
    
    public void dados(){
        System.out.println("Nome: "+ nome);
        System.out.println("Altura: "+ formato.format(altura) );
        System.out.println("Nascimento: "+ dia +"/"+ mes +"/"+ ano);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDiaAtual() {
        return diaAtual;
    }

    public void setDiaAtual(int diaAtual) {
        this.diaAtual = diaAtual;
    }

    public int getMesAtual() {
        return mesAtual;
    }

    public void setMesAtual(int mesAtual) {
        this.mesAtual = mesAtual;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }
}
