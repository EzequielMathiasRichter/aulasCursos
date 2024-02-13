package C6_OO.Heranca.Desafio;

public class FordKa extends Carro implements Esportivo, Luxo{

    boolean ligarTurbo = false;
    boolean ligarAr = false;

    public FordKa() {
        this(200);
    }
    public FordKa(int velocidadeMaxima) {
        super(velocidadeMaxima);
        setDelta(15);
    }
    @Override
    public void acelerar() {
        velocidaAtual += 15;
    }
    @Override
    public void frear() {
        if (velocidaAtual >= 15) {
            velocidaAtual -= 15;
        } else{
            velocidaAtual = 0;
        }
    }
    public String toString() {
        return "Velocidade atual do Ford Ka: " + velocidaAtual+ " km/h";
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    public int getDelta(){
        if(ligarTurbo && !ligarAr){
            return 35;
        } else if(ligarTurbo && ligarAr){
            return 30;
        }else if (!ligarTurbo && !ligarAr){
            return 20;
        }else{
            return 15;
        }
    }
}
