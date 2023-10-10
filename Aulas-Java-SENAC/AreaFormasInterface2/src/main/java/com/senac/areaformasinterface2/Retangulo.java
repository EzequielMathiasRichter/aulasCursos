/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.areaformasinterface2;

/**
 *
 * @author Aluno
 */
public class Retangulo implements Forma{
    private double comprimento;
    private double altura;
    
    public Retangulo(double comprimento, double altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularArea(){
    
        return getComprimento()*getAltura();
    
    }

    public double calcularPerimetro() {
        return (getComprimento()*2)+(getAltura()*2);
    }

    public void revelarDados() {
        System.out.printf("Área do retângulo: %.2f\nPerimetro do retângulo: %.2f\n",calcularArea(),calcularPerimetro());
    }
    
}

