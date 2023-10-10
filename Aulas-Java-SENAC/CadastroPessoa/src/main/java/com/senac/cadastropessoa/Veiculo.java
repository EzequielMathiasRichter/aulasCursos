/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.cadastropessoa;

/**
 *
 * @author Aluno
 */
public abstract class Veiculo {
    private String marca;
    private String nome;
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Veiculo(String marca, String nome) {
        this.marca = marca;
        this.nome = nome;
    }
    
    public void imprimirInformaoes(){
        System.out.printf("\n=-= %s =-=\nNome: %s\nMarca: %s\n", this.getClass().getSimpleName(), getNome(),getMarca());
    }
}
