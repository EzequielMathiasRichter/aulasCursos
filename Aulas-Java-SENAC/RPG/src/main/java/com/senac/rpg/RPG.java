/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.rpg;

/**
 *
 * @author guilherme.walter
 */
public class Rpg {

    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("Xin Zhao", 100, 15);
        Mago mago = new Mago("Veigar", 60, 25);
        Arqueiro arqueiro = new Arqueiro("Ashe", 55, 25);

        System.out.println("----------- Rodada 1 -----------");
        guerreiro.atacar(mago);
        mago.atacar(arqueiro);
        arqueiro.atacar(mago);

        System.out.println("Vida do guerreiro esperada 100. Vida real: " + guerreiro.getVida());
        System.out.println("Vida do mago esperada 20. Vida real: " + mago.getVida());
        System.out.println("Vida do arqueiro esperada 30. Vida real: " + arqueiro.getVida());
        System.out.println("");

        System.out.println("----------- Rodada 2 -----------");
        guerreiro.atacar(arqueiro);
        mago.atacar(arqueiro);
        arqueiro.atacar(guerreiro);

        System.out.println("Vida do guerreiro esperada 100. Vida real: " + guerreiro.getVida());
        System.out.println("Vida do mago esperada 20. Vida real: " + mago.getVida());
        System.out.println("Vida do arqueiro esperada 0. Vida real: " + arqueiro.getVida());
        System.out.println("");

        System.out.println("----------- Rodada 3 -----------");
        guerreiro.atacar(mago);
        mago.atacar(guerreiro);
        arqueiro.atacar(guerreiro);

        System.out.println("Vida do guerreiro esperada 75. Vida real: " + guerreiro.getVida());
        System.out.println("Vida do mago esperada 5. Vida real: " + mago.getVida());
        System.out.println("Vida do arqueiro esperada 0. Vida real: " + arqueiro.getVida());
        System.out.println("");

        System.out.println("----------- Rodada 4 -----------");
        guerreiro.atacar(mago);
        mago.atacar(guerreiro);
        arqueiro.atacar(guerreiro);

        System.out.println("Vida do guerreiro esperada 75. Vida real: " + guerreiro.getVida());
        System.out.println("Vida do mago esperada 0. Vida real: " + mago.getVida());
        System.out.println("Vida do arqueiro esperada 0. Vida real: " + arqueiro.getVida());
    }
}
