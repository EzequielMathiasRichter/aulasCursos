/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.areaformasinterface2;

/**
 *
 * @author Aluno
 */
public class Circulo implements Forma {
     private double raio;
    
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }
    
    
    @Override
    public double calcularArea() {
        return Math.PI*(Math.pow(getRaio(), 2));
    }

    @Override
    public double calcularPerimetro() {
        return (2*Math.PI)*getRaio();
    }

    @Override
    public void revelarDados() {
        System.out.printf("Área do círculo: %.2f\nPerimetro do círculo: %.2f\n",calcularArea(),calcularPerimetro());
    }
        
}
