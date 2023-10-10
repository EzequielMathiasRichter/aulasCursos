/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.empresabancaria;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ContaCorrente extends Conta {
    private final double juros = 0.01;
    private double resultado;
    private double taxa;
    private int meses;
    Scanner scanner =  new Scanner(System.in);
    
    @Override
    public void calcularRendimentoMes() {
        System.out.println("Há quantos meses você realizou o depósito bancário?");
        meses = scanner.nextInt();
        
        taxa = 1+juros;
        resultado = getSaldo()*Math.pow(taxa ,meses);
//M = C (1+i)t
//M: montante == resultado
//C: capital == getSaldo
//i: taxa fixa == juros
//t: período de tempo == meses
        System.out.printf("Valor do saldo bancario com rendimento de 1%% ao mês: R$:%.2f",resultado);
    }

    @Override
    public void sacar() {
        
        System.out.printf("Seu saldo: R$:%.2f\n", getSaldo());
        System.out.println("Digite o valor de saque: ");
        double saque = scanner.nextDouble();
        if(saque<=getSaldo()){
            setSaldo(getSaldo()-saque);
            System.out.printf("\nSaque realizado com sucesso.\nNovo valor de saldo: R$:%.2f", getSaldo());
        }else{
            System.out.println("\nValor de saque indisponível");
        }
    }
 
    @Override
    public void depositar(){
        System.out.println("Digite o valor que você quer depositar: ");
        double deposito = scanner.nextDouble();
        this.setSaldo(deposito);
        
    }
}
