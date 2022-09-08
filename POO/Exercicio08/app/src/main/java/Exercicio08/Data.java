package Exercicio08;

import java.util.Scanner;

public class Data {

    Scanner leitor = new Scanner(System.in);
    
    private int dia, mes, ano;
    private int diaN, mesN, anoN;

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }
    
    public int compara(int diaP, int mesP, int anoP){
        int resposta = 0;
        if((diaN == diaP)&&(mesN == mesP)&&(anoN == anoP)){
            resposta = 0;
        }
        else if(anoP == anoN){
            if(mesP == mesN){
                if(diaP < diaN){
                    resposta = 1;
                }
            }
            else if(mesP < mesN){
                resposta = 1;
            }
        }
        else if(anoP < anoN){
            resposta = 1;
        }
        else{
            resposta = -1;
        }
        return resposta;
    }
    
    public void getMesExtenso(){
        
        switch(mesN){
            case 1:
                System.out.println("Mês corrente por extenso: Janeiro");
                break;
            case 2:
                System.out.println("Mês corrente por extenso: Fevereiro");
                break;
            case 3:
                System.out.println("Mês corrente por extenso: Março");
                break;
            case 4:
                System.out.println("Mês corrente por extenso: Abril");
                break;
            case 5:
                System.out.println("Mês corrente por extenso: Maio");
                break;
            case 6:
                System.out.println("Mês corrente por extenso: Junho");
                break;
            case 7:
                System.out.println("Mês corrente por extenso: Julho");
                break;
            case 8:
                System.out.println("Mês corrente por extenso: Agosto");
                break;
            case 9:
                System.out.println("Mês corrente por extenso: Setembro");
                break;
            case 10:
                System.out.println("Mês corrente por extenso: Outubro");
                break;
            case 11:
                System.out.println("Mês corrente por extenso: Novembro");
                break;
            case 12:
                System.out.println("Mês corrente por extenso: Dezembro");
                break;
            default:
                System.out.println("Inválido!");
        }
    }
    
    public boolean isBissexto(int anoN){
        boolean resposta;
        resposta = anoN%4 == 0;
        return resposta;
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if((dia > 0)&&(dia < 31)){
            this.dia = dia;
        }
        else{
            this.dia = 01;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if((mes > 0)&&(mes <= 12)){
            this.mes = mes;
        }
        else{
            this.mes = 01;
        }        
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano > 0){
            this.ano = ano;
        }
        else{
            this.ano = 0001;
        }
    }
    
    public int getDiaN(){
        return diaN;
    }
    
    public void setDiaN(int diaN){
        if((diaN > 0)&&(diaN < 31)){
            this.diaN = diaN;
        }
        else{
            this.diaN = 01;
        }
    }
    
    public int getMesN(){
        return mesN;
    }
    
    public void setMesN(int mesN){
        if((mesN > 0)&&(mesN <= 12)){
            this.mesN = mesN;
        }
        else{
            this.mesN = 01;
        } 
    }
    
    public int getAnoN(){
        return anoN;
    }
    
    public void setAnoN(int anoN){
        this.anoN = anoN;
    }
}
