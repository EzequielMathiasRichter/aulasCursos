/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.empresa2;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Desenvolvedor extends Funcionario {

    public void obterDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID do desenvolvedor:");
        int idD = scanner.nextInt();
        this.id = idD;
        System.out.println("Nome:");
        String nomeD = scanner.next();
        this.nome = nomeD;
        System.out.println("Salário atual:");
        double salarioD = scanner.nextDouble();
        this.salario = salarioD;

    }

    public void revelarDados() {
        System.out.printf("ID do desenvolvedor: %d" + "\nNome: %s" + "\nSalário: %.2f\n", id, nome, salario);
    }
}
