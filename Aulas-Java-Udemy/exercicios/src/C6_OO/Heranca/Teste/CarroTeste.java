package C6_OO.Heranca.Teste;

import C6_OO.Heranca.Desafio.FordKa;
import C6_OO.Heranca.Desafio.HondaCity;

public class CarroTeste {
    public static void main(String[] args) {
        FordKa ka = new FordKa(300);
        HondaCity city = new HondaCity();
        System.out.println(ka);
        System.out.println(city);

        ka.acelerar();
        ka.ligarTurbo();
        ka.acelerar();
        ka.desligarTurbo();
        ka.acelerar();
        ka.ligarAr();
        ka.acelerar();
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
