package C6_OO.Heranca.Desafio;

public class HondaCity extends Carro{

    public HondaCity() {
        super(150);
    }

   @Override
    public void acelerar(){
        super.acelerar();
        super.acelerar();
    }

    @Override
    public void frear() {
        super.frear();
        super.frear();
    }
    public String toString() {
        return "Velocidade atual do Honda City: " + velocidaAtual + " km/h";
    }
}
