/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.aula05;

/**
 *
 * @author Aluno
 */
public class Pessoa {
    public final String NOME;
    // final = const (Não pode haver modificação futura na resposta da constante)
    public final int IDADE;
    public final String ESPECIE_RACA = "Humana";

    public String cursoAtual;
    
    public Pessoa(String nome, int idade){
        //criador da classe Pessoa
        this.NOME = nome;
        //chama as constantes 
        this.IDADE = idade;
        //chama as constantes
    }
    
}
