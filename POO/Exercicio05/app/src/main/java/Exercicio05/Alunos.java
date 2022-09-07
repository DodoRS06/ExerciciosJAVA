package Exercicio05;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Alunos {

    Scanner leitor = new Scanner(System.in);
    DecimalFormat formato = new DecimalFormat("0.00");
    
    private float media, provaFinal = 0, prova1, prova2, trabalho;
    private int matricula;
    private String nome;
    float pesoProva = 2.5f, pesoTrabalho = 2f, pesoTotal;
    
    public void inicio(){
        boolean teste = true;
        while(teste == true){
            System.out.print("Digite seu nome: ");
            setNome(leitor.next());
            System.out.print("Digite sua matrícula: ");
            setMatricula(leitor.nextInt());
            System.out.println("Digite o resultado da primeira prova [0 a 10]: ");
            this.prova1 = leitor.nextFloat();
            if((prova1 > 10f)||(prova1 < 0f)){
                System.out.println("Resultado inválido!");
                System.out.println("");
            }
            else{
                System.out.println("Digite o resultado da segunda prova [0 a 10]: ");
                this.prova2 = leitor.nextFloat();
                if((prova2 > 10f)||(prova2 < 0f)){
                    System.out.println("Resultado inválido!");
                    System.out.println("");
                }
                else{
                    System.out.println("Digite o resultado do trabalho [0 a 10]: ");
                    this.trabalho = leitor.nextFloat();
                    if((trabalho > 10f)||(trabalho < 0f)){
                        System.out.println("Resultado inválido!");
                        System.out.println("");
                    }
                    else{
                        teste = false;
                    }
                }
            }
        }
    }
    
    public void media(){
        pesoTotal = (pesoProva * 2) + pesoTrabalho;
        media = ((prova1 * pesoProva)+(prova2 * pesoProva) + (trabalho * pesoTrabalho)) / pesoTotal;
        System.out.println("A média entre as provas é "+ formato.format(media) +" pontos.");
    }
    
    public void notafinal(){
        if(media >= 6){
            System.out.println("Aluno precisa de "+ formato.format(provaFinal) +" pontos para prova final.");
        }
        else{
            provaFinal = 6 - media;
            System.out.println("Aluno precisa de "+ formato.format(provaFinal) +" pontos na prova final.");
        }
    }
    
    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public float getProvaFinal() {
        return provaFinal;
    }

    public void setProvaFinal(float provaFinal) {
        this.provaFinal = provaFinal;
    }

    public float getProva1() {
        return prova1;
    }

    public void setProva1(float prova) {
        this.prova1 = prova1;
    }
    
    public float getProva2() {
        return prova2;
    }

    public void setProva2(float prova) {
        this.prova2 = prova2;
    }

    public float getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(float trabalho) {
        this.trabalho = trabalho;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


}
