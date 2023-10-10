/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.areaformas;

/**
 *
 * @author Aluno
 */
public class Quadrado extends Formas{
    private final double altura;
    private final double comprimento;

    public Quadrado(double altura, double comprimento){
        this.altura = altura;
        this.comprimento = comprimento;   
        
    }
    
    @Override
    public void calcularArea() {
        double resultado = altura * comprimento;
        this.area = resultado;
    }
    public void resultadoQuadrado(){
        System.out.printf("Área do quadrado: %.2f", area);
    }
}