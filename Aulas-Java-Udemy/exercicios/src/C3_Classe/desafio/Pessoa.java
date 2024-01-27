package C3_Classe.desafio;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String nome, int peso){
        this.nome = nome;
        this.peso = peso;
    }

    public void comer(Comida comida){
        if (comida != null) {
            peso += comida.pesoDaComida;
        }
    }
    public void imprimirPeso(){
        System.out.println("Seu peso aumento para: " + peso + "Kg.");
    }
}
