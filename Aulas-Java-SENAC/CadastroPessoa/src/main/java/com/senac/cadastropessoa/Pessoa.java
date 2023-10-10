/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.cadastropessoa;

/**
 *
 * @author Ezequiel Mathias Richter
 */
public class Pessoa {
    private Gato gato;
    private Moto moto;
    private Carro carro;
    private String nome;
    private int idade;
    private Cachorro cachorro;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public Pessoa(Cachorro cachorro, Gato gato, Moto moto, Carro carro) {
        this.cachorro = cachorro;
        this.gato = gato;
        this.moto = moto;
        this.carro = carro;
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
    
    public Cachorro getCachorro() {
        return cachorro;
    }

    public void setCachorro(Cachorro cachorro) {
        this.cachorro = cachorro;
    }

    public Gato getGato() {
        return gato;
    }

    public void setGato(Gato gato) {
        this.gato = gato;
    }

    public Moto getMoto() {
        return moto;
    }

    public void setMoto(Moto moto) {
        this.moto = moto;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
    public void informacoesPessoa(){
        System.out.printf("Nome: %s\nidade: %s\n", getNome(),getIdade());
    }
    public void imprimirPets(){
        this.cachorro.imprimirInformacoes();
        this.gato.imprimirInformacoes();
    }
    
    public void imprimirVeiculos(){
        this.carro.imprimirInformaoes();
        this.moto.imprimirInformaoes();
    }
}
