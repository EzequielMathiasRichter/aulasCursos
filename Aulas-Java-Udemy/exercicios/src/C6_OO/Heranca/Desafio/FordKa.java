package C6_OO.Heranca.Desafio;

public class FordKa extends Carro{
    @Override
    void acelerar() {
        velocidaAtual += 15;
    }
    @Override
    void frear() {
        if (velocidaAtual >= 15) {
            velocidaAtual -= 15;
        } else{
            velocidaAtual = 0;
        }
    }
    public String toString() {
        return "Velocidade atual do Ford Ka: " + velocidaAtual;
    }
}
