/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.aula04;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ex04 {
     public static void main(String[] args) {
         
         Scanner scanner = new Scanner(System.in);
         System.out.print("Digite algo ");
         String nome = scanner.nextLine();
         StringBuilder builder = new StringBuilder(nome);
         System.out.println(builder.reverse().toString());
     }
}
