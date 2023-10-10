/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sistemaempresainterface2;

/**
 *
 * @author Aluno
 */
public class Vendedor implements Funcionario{


    
    private double salario;
    private final double comissao = 200;
    private int vendas;

    public Vendedor(double salario, int vendas) {
        this.salario = salario;
        this.vendas = vendas;
    }
        
    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario ) {
        this.salario = salario;
    }

    public Vendedor(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcularSalario() {
        return salario + (comissao*vendas);
    }

    @Override
    public void getTipoFuncionario() {
        System.out.printf("\nCargo na empresa: %s\nSeu Salário correspondente: %.2f",getClass().getSimpleName(), calcularSalario());
    }
    
}
