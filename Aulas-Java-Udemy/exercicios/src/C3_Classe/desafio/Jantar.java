package C3_Classe.desafio;

public class Jantar {
    public static void main(String[] args) {
        Comida comida1 = new Comida("Peito de frango", 0.100);
        Pessoa p1 = new Pessoa("Ezequiel", 80);
        p1.comer(comida1);
        p1.imprimirPeso();
    }
}
