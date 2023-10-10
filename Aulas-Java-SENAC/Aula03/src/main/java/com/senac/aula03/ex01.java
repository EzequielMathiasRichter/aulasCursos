/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.aula03;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ex01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, vai querer utilizar qual operação matemática hoje?[+ - x / ** % ]");

        String operacaoMatematica = scanner.nextLine();
//        System.out.println("Muito bem, digite o primeiro valor:");;
//        
//        double primeiroValor = scanner.nextDouble();
//        
//        System.out.println("Agora digite o segundo valor:");
//    
//        double segundoValor = scanner.nextDouble();
        int[] i = new int[2];
        for (int l = 0; l < 2; l++) {
            System.out.printf("Digite o %dº valor:", l+1);
            i[l] = scanner.nextInt();

        }

        switch (operacaoMatematica) {
            case "+":
                double resultadoSoma = i[0] + i[1];
                System.out.printf("O resultado da soma é: %.2f", resultadoSoma);
                break;
            case "-":
                double resultadoSubtracao = i[0] - i[1];
                System.out.printf("O resultado da subtração é: %.2f", resultadoSubtracao);
                break;
            case "x":
                double resultadoMultiplicacao = i[0] * i[1];
                System.out.printf("O resultado da multiplicação é: %.2f", resultadoMultiplicacao);
                break;
            case "/":
                double resultadoDivisao = i[0] / i[1];
                System.out.printf("O resultado da divisão é: %.2f", resultadoDivisao);
                break;
            case "**":
                double resultadoExpoente = Math.pow(i[0], i[1]);
                System.out.printf("O número %d elevado a potência %d é igual a: %.2f", i[0], i[1], resultadoExpoente);
                break;
            case "%":
                double resultadoPorcentagem = i[0] * 100 / i[1];
                System.out.printf("%d porcento de %d é igual a %.2f ", i[1], i[0], resultadoPorcentagem);
                break;
            default:
                break;
        }

    }
}
