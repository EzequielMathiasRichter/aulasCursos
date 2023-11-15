/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.senac.sistemaprodutos;

import java.util.List;

/**
 *
 * @author EzequielRichter
 */
public class SistemaProdutos {

    public static void main(String[] args) {
        Livro useACabecaJava = new Livro("Use a cabeça! Java", 65, 5);
        Televisao televisaoSamsung = new Televisao("Televisao Samsung", 3000, 100);
        Computador computadorAcer = new Computador("Computador Acer", 4500, 90);

        NotaFiscal nota = new NotaFiscal();
        try {
            nota.adicionarProduto(useACabecaJava);
            nota.adicionarProduto(televisaoSamsung);
            nota.adicionarProduto(computadorAcer);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        double valorTotalNota = nota.calcularValorTotal();
        System.out.println("Valor total nota: " + valorTotalNota);
        nota.exibirProdutos();

        try {
            nota.removerProdutoPorNome("Televisao Samsung");
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Produtos atualizados");
        nota.exibirProdutos();

        System.out.println("Produto buscado");
        try {
            Produto produtoBuscado = nota.getProdutoPorNome("Computador Acer");
            produtoBuscado.exibirInformacoes();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            nota.adicionarProduto(new Televisao("Televisao Sony", 2700, 100));
            nota.adicionarProduto(new Computador("Computador Dell", 6200, 90));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("\n-- Produtos ordenados por nome --");
        List<Produto> produtosOrdenadosPorNome = nota.getProdutosOrdenadosPorNome();
        for (Produto produto : produtosOrdenadosPorNome) {
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Produto: " + produto.getPreco());
        }

        System.out.println("\n-- Produtos ordenados por preco --");
        List<Produto> produtosOrdenadosPorPreco = nota.getProdutosOrdenadosPorPreco();
        for (Produto produto : produtosOrdenadosPorPreco) {
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Produto: " + produto.getPreco());
        }

        System.out.println("\n\nTestando as exceções");
        try {
            nota.adicionarProduto(new Televisao("Televisao Sony 30 polegadas", 2700, 100));
        } catch (Exception ex) {
            System.out.println("Erro esperado: O produto Televisao Sony 30 polegadas não foi adicionado pois o nome não pode ter mais que 20 caracteres.");
            System.out.println("Erro retornado: " + ex.getMessage());
        }

        try {
            nota.removerProdutoPorNome("Mouse Dell");
        } catch (Exception ex) {
            System.out.println("Erro esperado: O produto Mouse Dell não foi removido pois não foi encontrado.");
            System.out.println("Erro retornado: " + ex.getMessage());
        }

        try {
            Produto produtoBuscado = nota.getProdutoPorNome("Computador Positivo");
        } catch (Exception ex) {
            System.out.println("Erro esperado: O produto Computador Positivo não foi encontrado.");
            System.out.println("Erro retornado: " + ex.getMessage());
        }
    }
}