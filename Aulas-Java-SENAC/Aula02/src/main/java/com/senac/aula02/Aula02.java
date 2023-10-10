/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.aula02;

import java.util.Scanner;

/**
 *
 * @author Ezequiel M. Richter
 */
public class Aula02 {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        // Chama a classe scanner 
        System.out.println("Digite o pi:");
        // Imprimi na tela o texto 
        double pi = scanner.nextDouble();
        // input do valor de pi
        System.out.println("Digite o raio:");
        // imprimi na tela o texto
        double raio = scanner.nextDouble();
        // input do valor de raio
        double resultado = pi*Math.pow(raio, 2);
        // calculo da área do círculo (faz a potência do raio com a classe interna Math.pow())
        System.out.printf("A área do círculo é: %.2f cm²", resultado);
        // imprimi o texto selecionado + o resultado da área do círculo
    }
}
