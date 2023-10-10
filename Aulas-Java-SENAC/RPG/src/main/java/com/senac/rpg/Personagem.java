/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.rpg;

/**
 *
 * @author guilherme.walter
 */
public class Personagem {

    private String nome;
    private double danoAtaque;
    private double vida;
    private final double VIDA_MINIMA = 0;

    public Personagem(String nome, double vida, double danoAtaque) {
        this.nome = nome;
        this.vida = vida;
        this.danoAtaque = danoAtaque;
    }

    public double getVida() {
        return this.vida;
    }

    public void atacar(Personagem vitima) {
        if (this.vida <= VIDA_MINIMA) {
            System.out.println("Personagem " + this.nome +  " está morto e não pode realizar ataque");
        } else {
            vitima.receberAtaque(this);
        }
    }

    private void receberAtaque(Personagem atacante) {
        double vidaFinal = this.vida - atacante.danoAtaque;
        
        if (vidaFinal < VIDA_MINIMA) {
            this.vida = VIDA_MINIMA;
        } else {
            this.vida = vidaFinal;
        }
    }
}
