package C6_OO.Heranca.Desafio;
public class Carro {
    public final int VELOCIDADE_MAXIMA; // constatnte não muda, logo não importa se for public ou protected
    protected int velocidaAtual;
    private int delta = 5;

    protected Carro(int velocidadeMaxima) {
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar() {
        if (velocidaAtual + getDelta() > VELOCIDADE_MAXIMA) {
            velocidaAtual = VELOCIDADE_MAXIMA;
        } else{
        velocidaAtual += getDelta();
        }
    }

    public void frear() {
        if (velocidaAtual >= delta) {
            velocidaAtual -= delta;
        } else{
            velocidaAtual = 0;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }
}
