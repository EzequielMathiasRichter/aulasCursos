/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.aula03;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Aula03 {
    /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // chama a classe Scanner
        System.out.println("Digite o primeiro valor:");
        // imprime o texto selecionado
        double primeiroValor = scanner.nextDouble();
        // input do primeiro valor 
        System.out.println("Digite o segundo valor:");
        // imprime o texto selecionado
        double segundoValor = scanner.nextDouble();
        // input do segundo valor 
        if(primeiroValor>segundoValor){
        // compara se o primeiro valor é maior que o segundo valor
            System.out.printf("O primeiro valor %.2f é maior" , primeiroValor );
        // caso o primeiro valor seja maior que o segundo é printado essa mensagem na tela
        }else{
        // se nenhuma comparação anterior achar o maior valor é passado a mensagem abaixo 
            System.out.printf("O segundo valor %.2f é maior", segundoValor);
        // imprime o texto selecionado
        }
        */
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // chama a classe Scanner
        System.out.println("Digite o primeiro valor:");
        // imprime o texto selecionado
        double primeiroValor = scanner.nextDouble();
        // input do primeiro valor 
        System.out.println("Digite o segundo valor:");
        // imprime o texto selecionado
        double segundoValor = scanner.nextDouble();
        // input do segundo valor
        System.out.printf("O maior valor digitado foi: %.2f" , Math.max(primeiroValor, segundoValor));
        }
    }

