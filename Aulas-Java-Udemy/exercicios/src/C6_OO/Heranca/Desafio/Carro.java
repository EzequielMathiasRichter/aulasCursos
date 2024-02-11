package C6_OO.Heranca.Desafio;


public class Carro {
    int velocidaAtual;

    void acelerar() {
        velocidaAtual += 5;
    }

    void frear() {
        if (velocidaAtual >= 5) {
            velocidaAtual -= 5;
        } else{
            velocidaAtual = 0;
        }
    }
}
