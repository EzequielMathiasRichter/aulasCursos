/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.areaformasinterface2;

/**
 *
 * @author Aluno
 */
public class AreaFormasInterface2 {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(12,14);
        
        retangulo.calcularArea();
        retangulo.calcularPerimetro();
        retangulo.revelarDados();
        
        Circulo circulo = new Circulo(12);
        circulo.calcularArea();
        circulo.calcularPerimetro();
        circulo.revelarDados();
    }
}
