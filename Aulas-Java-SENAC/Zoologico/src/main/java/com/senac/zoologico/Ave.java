/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.zoologico;

/**
 *
 * @author Aluno
 */
public class Ave extends Animal {
    public int tamanhoDoBico;
    public String corDoPelo;
 
    public Ave(String corDoPelo, int tamanhoDoBico, String nome, int idade){
       super(idade,nome);
       this.corDoPelo = corDoPelo;
       this.tamanhoDoBico = tamanhoDoBico;
    }
    public void revelarDados(){
        System.out.printf("Nome da ave: %s", nome );
        System.out.println("\n");
        System.out.printf("Idade: %d", idade );
        System.out.println("\n");
        System.out.printf("Cor dos pelos: %s", corDoPelo );
        System.out.println("\n");
        System.out.printf("Tamanho do bico: %d", tamanhoDoBico );
    }

    /**
     *
     */
    @Override
        public void interagir(){
        System.out.println("Có..có..ri..có...");
    }
}
