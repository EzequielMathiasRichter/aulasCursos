package C6_OO.Heranca.Teste;

import C6_OO.Heranca.Heroi;
import C6_OO.Heranca.Monstro;

public class Jogo {
    public static void main(String[] args) {
        Monstro monstro = new Monstro(10, 10);
        monstro.x = 10; // _______________^       ^
        monstro.y = 10; //________________________^

        Heroi heroi = new Heroi(10, 11);

        System.out.println("Monstro tem -> " + monstro.vida + " pontos de vida");
        System.out.println("Heroi tem -> " + heroi.vida + " pontos de vida\n");

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println("Monstro tem -> " + monstro.vida + " pontos de vida");
        System.out.println("Heroi tem -> " + heroi.vida + " pontos de vida");

    }
}
