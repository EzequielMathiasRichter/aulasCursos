/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.aula05;

/**
 *
 * @author Aluno
 */
public class Aula05 {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Ezequiel", 18);
        pessoa.cursoAtual = "Java";
        Cachorro cachorro1 = new Cachorro("Meg" , 80);
        Cachorro cachorro2 = new Cachorro("Guss",20);
        Cachorro cachorro3 = new Cachorro("Tobi", 10);
        cachorro1.latir();
        cachorro2.latir();
        cachorro3.latir();
    }
}

