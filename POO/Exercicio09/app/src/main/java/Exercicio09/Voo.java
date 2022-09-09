package Exercicio09;

public class Voo {

    private int numero;
    private String horario;
    private int vagas[] = new int[100];

    public Voo(int numero, String horario) {
        setNumero(numero);
        setHorario(horario);
    }
    
    public void proximoLivre(){
        for(int i=1; i<101; i++){
            if(vagas[i] == 0){
                System.out.println("Cadeira "+ i +" livre.");
            }
        }
    }
    
    public boolean verifica(int i){
        boolean cadeira;
        cadeira = vagas[i] == 1;
        return cadeira;
    }
    
    public boolean ocupa(int i){
        boolean cadeira;
        
        vagas[i] = 1;
        cadeira = vagas[i] == 0;
        return cadeira;
    }
    
    public int vagas(){
        int cont = 0;
        for(int i=1; i<101; i++){
            if(vagas[i] == 0){
                cont = cont + 1;
            }
        }
        return cont;
    }
    
    public int getVoo(){
        return numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int[] getVagas() {
        return vagas;
    }

    public void setVagas(int[] vagas) {
        this.vagas = vagas;
    }
    
    public String getHorario(){
        return horario;
    }
    
    public void setHorario(String horario){
        this.horario = horario;
    }
    
    
    
}
