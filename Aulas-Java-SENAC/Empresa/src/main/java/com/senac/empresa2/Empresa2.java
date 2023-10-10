/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.empresa2;

/**
 *
 * @author Aluno
 */
public class Empresa2 {

    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();
        Desenvolvedor desenvolvedor = new Desenvolvedor();
        gerente.obterDados();
        desenvolvedor.obterDados();
        vendedor.obterDados();
        System.out.println("=-=-=-=-=-=-=-=-=");
        gerente.revelarDados();
        System.out.println("=-=-=-=-=-=-=-=-=");
        desenvolvedor.revelarDados();
        System.out.println("=-=-=-=-=-=-=-=-=");        
        vendedor.revelarDados();
    }
}
