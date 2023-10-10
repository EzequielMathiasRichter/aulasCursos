/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.areaformas;

/**
 *
 * @author Ezequiel
 */
public class Circulo extends Formas {
    private final double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    @Override
    public void calcularArea() {
        
        double resultado =  Math.PI * Math.pow(raio, 2);
        this.area = resultado;
    }
    public void resultadoCirculo(){
        System.out.printf("Área do Círculo: %.2f" , area);
    }
}
