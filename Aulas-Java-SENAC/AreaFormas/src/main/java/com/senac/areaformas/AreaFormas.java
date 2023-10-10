/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.senac.areaformas;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class AreaFormas {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String continuar = "S";
        while ("S".equals(continuar)) {

            System.out.println("Qual forma geométrica vai querer resolver?");
            System.out.println("[1]Quadrado\n[2]Retângulo\n[3]Círculo");
            int forma = scanner.nextInt();

            switch (forma) {
                case 1:
                    System.out.println("Altura do Quadrado: ");
                    double alturaQ = scanner.nextDouble();
                    System.out.println("Comprimento do quadrado:");
                    double comprimentoQ = scanner.nextDouble();
                    Quadrado quadrado = new Quadrado(alturaQ, comprimentoQ);
                    quadrado.calcularArea();
                    quadrado.resultadoQuadrado();
                    System.out.println("\n"+"Quer continuar? [S] ou [N]");
                    continuar = scanner.next().toUpperCase();
                    break;
                case 2:
                    System.out.println("Altura do retângulo:");
                    double alturaR = scanner.nextDouble();
                    System.out.println("Comprimento do retângulo:");
                    double comprimentoR = scanner.nextDouble();
                    Retangulo retangulo = new Retangulo(alturaR, comprimentoR);
                    retangulo.calcularArea();
                    retangulo.resultadoRetangulo();
                    System.out.println("\n"+"Quer continuar? [S] ou [N]");
                    continuar = scanner.next().toUpperCase();
                    break;
                case 3:
                    System.out.println("raio do círculo:");
                    double raio1 = scanner.nextDouble();
                    Circulo circulo = new Circulo(raio1);
                    circulo.calcularArea();
                    circulo.resultadoCirculo();
                    System.out.println("\n"+"Quer continuar? [S] ou [N]");
                    continuar = scanner.next().toUpperCase();
                    break;
                default:
                    System.out.println("Código inválido. Retorne um valor correto :<");
            }
        }
    }
}