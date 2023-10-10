/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.empresabancaria;

import java.util.Scanner;

/**
 * 20
 *
 * @author Aluno
 */
public class Menu {

    Scanner scanner = new Scanner(System.in);
    ContaPoupanca poupanca = new ContaPoupanca();
    ContaCorrente corrente = new ContaCorrente();

    public void iniciarMenu() {
        System.out.println("=-=-= Bem-vindo ao banco EzeBank =-=-=");
        System.out.println("\n=-=-=-=-=-=-=-= Digite =-=-=-=-=-=-=-=\n[1] para acessar sua conta poupança.\n[2] para acessar sua conta corrente. ");
        int tipoConta = scanner.nextInt();

        switch (tipoConta) {
            case 1:
                int i = 0;
                System.out.println("\n=-=-=-=-=-= Conta Poupança =-=-=-=-=-=");
                while (i != 4) {
                    System.out.println("\n=-=-=-=-=-=-=-= Digite =-=-=-=-=-=-=-=\n[1] para realizar um deposito.\n[2] para realizar um saque.\n[3] para realizar uma consulta de rendimento.\n[4] para finalizar o atendimento");

                    i = scanner.nextInt();
                    switch (i) {
                        case 1:
                            poupanca.depositar();
                            break;
                        case 2:
                            poupanca.sacar();
                            break;
                        case 3:
                            poupanca.calcularRendimentoMes();
                            break;
                        case 4:
                            System.out.println("Finalizando...");
                            break;
                        default:
                            System.out.println("Valor incorreto");
                            break;
                    }
                }
                break;
            case 2:
                System.out.println("\n=-=-=-=-=-= Conta Corrente =-=-=-=-=-=");
                int l = 0;
                while (l != 4) {
                    System.out.println("\nDigite \n[1] para realizar um deposito.\n[2] para realizar um saque.\n[3] para realizar uma consulta de rendimento.\n[4] para finalizar o atendimento");
                    l = scanner.nextInt();
                    switch (l) {
                        case 1:
                            corrente.depositar();
                            break;
                        case 2:
                            corrente.sacar();
                            break;
                        case 3:
                            corrente.calcularRendimentoMes();
                            break;
                        case 4:
                            System.out.println("Finalizando...");
                            break;
                        default:
                            System.out.println("Valor incorreto");
                            break;
                    }
                }
                break;
            default:
                System.out.println("Valor incorreto.");
                break;
        }
    }
}
