/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.aula05;

/**
 *
 * @author Aluno
 */
public class Cachorro {

    public int tamanho;
    public String nome;

    public Cachorro(String nome, int tamanho) {
        this.tamanho = tamanho;
        this.nome = nome;
    }

    public void latir() {
        if (this.tamanho > 70) {
            System.out.println("Woof Woof!");
        } else if (this.tamanho > 18) {
            System.out.println("Ruff Ruff!");
        } else {
            System.out.println("Yep Yep!");
        }
    }

    public int pegarTamanho() {
        return this.tamanho;
    }

}
