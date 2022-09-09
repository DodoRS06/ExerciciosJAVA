package Exercicio10;

import java.text.DecimalFormat;

public class Jogador {
    
    DecimalFormat formato = new DecimalFormat("0.00");
    
    private String nome, nacionalidade;
    private int posicao, dia, mes, ano, diaAtual, mesAtual, anoAtual;
    private float altura, peso;

    public void dados() {
        int idade = idade();
        System.out.println("");
        System.out.println("Nome: " + nome);
        System.out.println("O jogador " + nome + " tem " + idade + " anos.");
        switch(posicao){
            case 1 -> System.out.println("Posição: Defesa");
            case 2 -> System.out.println("Posição: Meio campo");
            case 3 -> System.out.println("Posição: Ataque");
        }
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Altura: " + formato.format(altura) +"m");
        System.out.println("Peso: " + formato.format(peso) +"kg");
        aposentar(idade);
    }

    public int idade() {
        int idade = 0;
        idade = anoAtual - ano;
        if (mesAtual < mes) {
            idade = idade - 1;
        } else if (mesAtual == mes) {
            if (diaAtual < dia) {
                idade = idade - 1;
            }
        }
        return idade;
    }

    public void aposentar(int idade) {
        int tempo = 0;
        switch (posicao) {
            case 1 -> {
                tempo = 40 - idade;
                System.out.println("Faltam " + tempo + " anos para o jogador " + nome + " se aposentar");
            }
            case 2 -> {
                tempo = 38 - idade;
                System.out.println("Faltam " + tempo + " anos para o jogador " + nome + " se aposentar");
            }
            case 3 -> {
                tempo = 35 - idade;
                System.out.println("Faltam " + tempo + " anos para o jogador " + nome + " se aposentar");
            }
            default -> {
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
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

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
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
