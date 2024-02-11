package C6_OO.Heranca.Desafio;

public class HondaCity extends Carro{
   @Override
    void acelerar(){
        super.acelerar();
        super.acelerar();
    }

    @Override
    void frear() {
        super.frear();
        super.frear();
    }
    public String toString() {
        return "Velocidade atual do Honda City: " + velocidaAtual;
    }
}
