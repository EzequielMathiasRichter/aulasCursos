package C6_OO.Composicao.Desafio;

import java.util.ArrayList;

public class Compra {
    final ArrayList<Item> itens = new ArrayList<>();

    void adicionarItem(Produto p, int quantidade){
        this.itens.add(new Item(p, quantidade));
    }
    void adicionarItem(String nome, double preco, int quantidade){
        var produto = new Produto(preco, nome);
        this.itens.add(new Item(produto, quantidade));
    }

    double obterValorTotal(){
        double valorTotal = 0;

        for(Item item: itens){
            valorTotal += item.quantidade * item.produto.preco;
        }

        return valorTotal;
    }
}
