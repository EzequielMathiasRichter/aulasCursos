package C3_Classe;



public class ProdutoTeste {
    public static void main(String[] args) {

        Produto p1 = new Produto();
        p1.nome = "Notebook";
        p1.preco = 4356.89;


        var p2 = new Produto("Caneta Preta",12.56);

        Produto.desconto = 0.50;

        System.out.println(p1.nome + " R$:" + p1.precoComDesconto());
        System.out.println(p2.nome + " R$:" + p2.precoComDesconto());

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto(0.1);
        double mediaCarrinho = (precoFinal1 + precoFinal2) /2;
        System.out.printf("A média do carrinho é: R$:%.2f", mediaCarrinho);
    }
}
