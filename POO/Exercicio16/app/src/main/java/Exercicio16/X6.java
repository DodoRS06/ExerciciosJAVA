package Exercicio16;

public class X6 extends Carro {

    public void carro() {
        int opcao;

        System.out.println("Selecione o que deseja");
        System.out.println("1 - Abastecer");
        System.out.println("2 - Deslocar");
        opcao = leitor.nextInt();

        switch (opcao) {
            case 1 ->
                abastecer();
            case 2 ->
                deslocar();
            default ->
                System.out.println("Opção inválida.");
        }
    }
    public void abastecer(){
        float litros;
        System.out.print("Quantos litros deseja abastecer? ");
        litros = leitor.nextFloat();
        if(tanque >= (quantidadeGasolina + litros)){
            tanque = tanque + litros;
            System.out.println("Abastecido.");
        }
        else{
            System.out.println("Seu tanque não tem essa capacidade.");
        }
    }
    
    public void deslocar(){
        System.out.print("Qual distancia vai andar? ");
        setDistancia(leitor.nextFloat());
        if(distancia <= (quantidadeGasolina / 15)){
            quantidadeGasolina = quantidadeGasolina - (distancia * (1/15));
        }
        else{
            System.out.println("Você não tem combustível suficiente.");
        }
    }
}
