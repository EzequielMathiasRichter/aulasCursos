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
public class Gerente extends Funcionario {

    public void obterDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID do gerente:");
        int idG = scanner.nextInt();
        this.id = idG;
        System.out.println("Nome:");
        String nomeG = scanner.next();
        this.nome = nomeG;
        System.out.println("Salário atual:");
        double salarioG = scanner.nextDouble();
        this.salario = salarioG;

    }

    public void revelarDados() {
        System.out.printf("ID do gerente: %d" + "\nNome: %s" + "\nSalário: %.2f\n", id, nome, salario);
    }
}
