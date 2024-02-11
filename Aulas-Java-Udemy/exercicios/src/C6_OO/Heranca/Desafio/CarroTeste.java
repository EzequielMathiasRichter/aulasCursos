package C6_OO.Heranca.Desafio;

public class CarroTeste {
    public static void main(String[] args) {
        FordKa ka = new FordKa();
        HondaCity city = new HondaCity();
        System.out.println(ka);
        System.out.println(city);

        ka.acelerar();
        ka.acelerar();
        ka.acelerar();
        ka.frear();
        ka.frear();
        System.out.println(ka);

        city.acelerar();
        city.acelerar();
        city.acelerar();
        city.frear();
        city.frear();
        System.out.println(city);
    }
}
