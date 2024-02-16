package Desafio1;

public class Produto {
    private String nome;
    private double preco;
    private int quatidade;

    public Produto(String nome, double preco, int quatidade) {
        this.nome = nome;
        this.preco = preco;
        this.quatidade = quatidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quatidade;
    }

    public void setQuantidade(int desconto) {
        this.quatidade = desconto;
    }
}
