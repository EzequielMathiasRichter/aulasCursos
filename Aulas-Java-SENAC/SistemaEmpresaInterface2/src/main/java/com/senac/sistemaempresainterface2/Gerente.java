/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sistemaempresainterface2;

/**
 *
 * @author Aluno
 */
public class Gerente implements Funcionario {
    private double salario;
    

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Gerente(double salario) {
        this.salario = salario;
    }
    
    @Override
    public double calcularSalario() {
        return getSalario();
    }

    @Override
    public void getTipoFuncionario() {
        System.out.printf("\nCargo na empresa: %s\nSeu Salário correspondente: %.2f",getClass().getSimpleName(), calcularSalario());
    }
    
}
