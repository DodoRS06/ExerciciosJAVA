package Exercicio12;

public class Agenda {
    
    private String nomeA[] = new String[10];
    private int idadeA[] = new int[10];
    private float alturaA[] = new float[10];

    public void armazenarPessoa(String nome, int idade, float altura){
        for(int i=0; i<10; i++){
            if(nomeA[i] == null){
                this.nomeA[i] = nome;
                this.idadeA[i] = idade;
                this.alturaA[i] = altura;
                i = 15;
            }
        }
    }
    
    public void removerPessoa(String nome){
        for(int i=0; i<10; i++){
            if(nome.equals(nomeA[i])){
                nomeA[i] = null;
                idadeA[i] = 0;
                alturaA[i] = 0;
            }
        }
    }
    
    public int buscarPessoa(String nome){
        int aux = 0;
        for(int i=0; i<10; i++){
            if(nome.equals(nomeA[i])){
                aux = i;
            }
        }
        return aux;
    }
    
    public void imprimitAgenda(){
        for(int i=0; i<10; i++){
            System.out.println("");
            System.out.println("Posição: "+ i);
            System.out.println("Nome: "+ nomeA[i]);
            System.out.println("Idade: "+ idadeA[i]);
            System.out.println("Altura: "+ alturaA[i]);
        }
    }
    
    public void imprimirPessoa(int index){
        System.out.println("");
        System.out.println("Posição: "+ index);
        System.out.println("Nome: "+ nomeA[index]);
        System.out.println("Idade: "+ idadeA[index]);
        System.out.println("Altura: "+ alturaA[index]);
    }
    
    public String[] getNomeA() {
        return nomeA;
    }

    public void setNomeA(String[] nome) {
        this.nomeA = nome;
    }

    public int[] getIdadeA() {
        return idadeA;
    }

    public void setIdadeA(int[] idade) {
        this.idadeA = idade;
    }

    public float[] getAlturaA() {
        return alturaA;
    }

    public void setAlturaA(float[] altura) {
        this.alturaA = altura;
    }
    
}
