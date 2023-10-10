/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.zoologico;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Zoologico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a idade da ave: ");
        int idade = scanner.nextInt();
        System.out.println("Digite o nome da ave: ");
        String nome = scanner.next();
        Ave ave = new Ave("azul", 17, nome, idade );
        ave.revelarDados();
    }
}
