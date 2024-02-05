package C6_OO.Composicao.Desafio;

public class Item {
    final int quantidade;
    final Produto produto;

    Item(Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
}
