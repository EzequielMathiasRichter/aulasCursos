/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sistemaprodutos;

/**
 *
 * @author EzequielRichter
 */
public class Produto {
    
    private Double preco;
    private Double imposto;
    private String nome;
    
    public Produto(String nome, Double preco, Double imposto) {
        this.nome = nome;
        this.preco = preco;
        this.imposto = imposto;
        
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double getImposto() {
        return imposto;
    }

    public void setImposto(Double imposto) {
        this.imposto = imposto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPrecoTotal(){
        Double getPrecoTotal = this.preco+this.imposto;
        return getPrecoTotal;
    }
    
    
    public void exibirInformacoes() {
        if(this != null){
            System.out.printf("\nNome: %s\nPreço: R$:%.2f\nImposto: R$:%.2f\n", this.nome,this.preco, this.imposto);
            
        }else{
            System.out.println("Produto não encontrado.");
        }
    }
    
}
