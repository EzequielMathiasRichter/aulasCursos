/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sistemaprodutos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class NotaFiscal {

    private List<Produto> produtos = new ArrayList();

    public void adicionarProduto(Produto produto) {
        if(produto.getNome().length() < 20 ){
            produtos.add(produto);            
        }else{
            throw new ProdutoNaoEncontradoException(String.format("O produto %s não foi adicionado pois o nome não pode ter mais que %d caracteres.",produto.getNome(), 20));
        }    
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Produto prod : produtos) {

            valorTotal += prod.getPrecoTotal();

        }

        return valorTotal;
    }

    public void exibirProdutos() {
        for (Produto prod : produtos) {
            System.out.printf("\nNome: %s\nPreço: R$:%.2f\nImposto: R$:%.2f\n", prod.getNome(), prod.getPreco(), prod.getImposto());
        }
    }

    public void removerProdutoPorNome(String nome) {
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            if (p.getNome().equals(nome)) {
                produtos.remove(p);
                
            }else{
                throw new ProdutoNaoEncontradoException(String.format("O produto %s não foi removido pois não foi encontrado.",p ));
            }
        }
    }

    public Produto getProdutoPorNome(String nome) {
//         usando for
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            if (p.getNome().equals(nome)) {
                return p;
            }else{
                throw new ProdutoNaoEncontradoException(String.format("O produto: %s não foi encontrado", p));
            }           
        }
//        return null;
        // usando métodos prontos
//        return this.produtos.stream().filter(prod -> prod.getNome().equals(nome)).findAny().orElse(null);
        return null;
        
    }

    public boolean poussuiProdutoPorNome(String nome) {
        boolean possuiProduto = this.produtos.stream().anyMatch(prod -> prod.getNome().equals(nome));
        return possuiProduto;

    }

    public List getProdutosOrdenadosPorNome() {
        Comparator<Produto> comparator = Comparator.comparing(prod -> prod.getNome());

        Collections.sort(produtos, comparator);
        return produtos;
    }

    public List getProdutosOrdenadosPorPreco() {
        Comparator<Produto> comparator = Comparator.comparing(prod -> prod.getPreco());

        Collections.sort(produtos, comparator);
        return produtos;
    }
}
