/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.agregacao;

/**
 *
 * @author Aluno
 */
public class Agregacao {

    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        Comprador comprador = new Comprador();
        Produto produto = new Produto();
        Vendas vendas = new Vendas(produto, comprador, vendedor);
        vendas.getComprador().setVerba(100);
        System.out.println(vendas.getComprador().getVerba());
    }
}
