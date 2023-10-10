/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.empresabancaria;

/**
 *
 * @author Aluno
 */
public abstract class Conta {
    private double saldo;

    public double getSaldo() {
        return this.saldo;
    }

    public double setSaldo(double saldo) {
        return this.saldo = saldo;
    }
    
    public abstract void depositar();
    public abstract void sacar();
    
    public abstract void calcularRendimentoMes();
}
