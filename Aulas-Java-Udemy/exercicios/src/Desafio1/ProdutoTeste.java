package Desafio1;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Chinelo", 30, 2);
        Produto produto2 = new Produto("Camisa", 78, 2);
        Produto produto3 = new Produto("Calçao", 50.80, 3);
        Produto produto4 = new Produto("Correntinha", 190, 1);

        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProduto(produto1);
        cadastro.adicionarProduto(produto2);
        cadastro.adicionarProduto(produto3);
        cadastro.adicionarProduto(produto4);

        cadastro.removerProdutoPorNome("Camiseta");
        cadastro.removerProdutoPorNome("Camisa");

        cadastro.atualizarDados(produto1,"Chinelo", 35, 3);

        cadastro.listarProdutos();
    }
}
