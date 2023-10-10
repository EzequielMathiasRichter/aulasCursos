/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.areaformas;

/**
 *
 * @author Ezequiel
 */
public class Retangulo extends Formas {
    private final double altura;
    private final double comprimento;
    
    public Retangulo(double altura, double comprimento){
        this.altura = altura;
        this.comprimento = comprimento;
    }
    @Override
    public void calcularArea() {
        double resultado =  altura * comprimento;
        this.area = resultado;
    }
    public void resultadoRetangulo(){
        System.out.printf("Área do Retângulo: %.2f" , area);
    }
}
