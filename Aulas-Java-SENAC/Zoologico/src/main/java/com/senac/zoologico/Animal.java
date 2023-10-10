/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.zoologico;

/**
 *
 * @author Aluno
 */
public class Animal {
    public int idade;
    public String nome;
    
    public Animal(int idade, String nome){
        this.nome = nome;
        this.idade = idade;
    }
    
    public void interagir(){
        System.out.println("Animal interagindo...");
    }
    
}
