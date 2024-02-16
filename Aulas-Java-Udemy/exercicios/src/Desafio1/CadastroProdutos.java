package Desafio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CadastroProdutos  {
    // métodos = adicionarNovoProduto, RemoverProdutoPorNome, AtalizarDados, ListarProdutos
    private List<Produto> produtos = new ArrayList<Produto>();
    public void adicionarProduto(Produto produto) {
        if (produto != null && produto.getPreco() > 0 && produto.getQuantidade() >= 0) {
            produtos.add(produto);
            System.out.println("\nProduto adicionado com sucesso!");
        } else {
            System.out.println("\nFalha ao adicionar o produto. Verifique os dados inseridos.");
        }
    }
    public void removerProdutoPorNome(String nome) {
        boolean produtoEncontrado = false;
        Iterator<Produto> iterator = produtos.iterator();
        while (iterator.hasNext()) {
            Produto produto = iterator.next();
            if (produto.getNome().equals(nome)) {
                iterator.remove();
                System.out.println("\nProduto removido com sucesso!");
                produtoEncontrado = true;
                break; // Encerra o loop assim que o produto é removido
            }
        }
        if (!produtoEncontrado) {
            System.out.println("\nProduto não encontrado!");
        }
    }
    public void atualizarDados(Produto produto, String nome, double preco, int quantidade) {
        if (produto != null && preco > 0 && quantidade >= 0) {
            produto.setNome(nome);
            produto.setPreco(preco);
            produto.setQuantidade(quantidade);
            System.out.println("\nProduto atualizado com sucesso!");
        } else {
            System.out.println("\nFalha ao atualizar o produto. Verifique os dados inseridos.");
        }
    }
    public void listarProdutos(){
        if(produtos.isEmpty()){
            System.out.println("\nNenhum produto cadastrado!");
        }else{
            System.out.println("\n-=-=-=-Listagem de produtos-=-=-=-");
            for(Produto produtoListado: produtos){
                System.out.println("Nome: " + produtoListado.getNome());
                System.out.printf("Preço: R$:%.2f\n", produtoListado.getPreco());
                System.out.println("Quantidade: " + produtoListado.getQuantidade());
            }
        }
    }
}
