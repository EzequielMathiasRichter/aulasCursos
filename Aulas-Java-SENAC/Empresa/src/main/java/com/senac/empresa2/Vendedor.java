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
public class Vendedor extends Funcionario {

    private final double bonus = 300;
    public double vendas;

    public void obterDados() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID do vendedor:");
        int idV = scanner.nextInt();
        this.id = idV;
        System.out.println("Nome:");
        String nomeV = scanner.next();
        this.nome = nomeV;
        System.out.println("Salário atual:");
        double salarioV = scanner.nextDouble();
        this.salario = salarioV;
        System.out.println("Média de vendas mensais:");
        double vendasV;
        vendasV = scanner.nextDouble();
        this.vendas = vendasV;
    }

    public double calcularSalarioTotal() {
        double salarioV = salario + bonus * vendas;

        return this.salario = salarioV;
    }

    public void revelarDados() {
        this.calcularSalarioTotal();
        System.out.printf("ID do vendedor: %d" + "\nNome: %s" + "\nSalário: %.2f\n", id, nome, salario);
    }
}
