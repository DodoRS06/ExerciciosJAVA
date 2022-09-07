package Exercicio07;

public class Funcionarios {
    
    private String nome, sobrenome;
    private float salario;
    
    public Funcionarios(String nome, String sobrenome, float salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        setSalario(salario);
    }
    
    public double salAnual(){
        return salario * 12;
    }
    
    public double salAnualAumento(){
        return (salario * 1.1) * 12;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        if(salario < 0){
            this.salario = 0;
        }
        else{
            this.salario = salario;
        }
    }

}
