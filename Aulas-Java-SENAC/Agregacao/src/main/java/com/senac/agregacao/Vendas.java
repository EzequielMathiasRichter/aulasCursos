/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.agregacao;

/**
 *
 * @author Aluno
 */
public class Vendas {

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public void setComprador(Comprador comprador) {
        this.comprador = comprador;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Vendas(Produto produto, Comprador comprador, Vendedor vendedor) {
        this.produto = produto;
        this.comprador = comprador;
        this.vendedor = vendedor;
    }
    private Produto produto;
    private Comprador comprador;
    private Vendedor vendedor;
}
