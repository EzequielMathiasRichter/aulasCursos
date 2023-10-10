/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.cadastropessoa;

/**
 *
 * @author Aluno
 */
public abstract class Animal {
    private String nome;
    private int idade;
    private String raca;
    
    public Animal(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public void imprimirInformacoes(){
        System.out.printf("\n=-= %s =-=\nNome: %s\nRaça: %s\nIdade: %d\n",getClass().getSimpleName(),getNome(),getRaca(),getIdade());
    }
}
