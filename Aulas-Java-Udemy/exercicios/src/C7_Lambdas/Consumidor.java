package C7_Lambdas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
    public static void main(String[] args) {
        Consumer<Produto> imprimirNome = prod -> System.out.println(prod.nome + "!!!");
        Produto produto1 = new Produto("Notebook", 3893.89, 0.15);
        Produto produto2 = new Produto("Caneta", 12.9, 0.15);
        Produto produto3 = new Produto("Borracha", 19.8, 0.15);
        Produto produto4 = new Produto("Lapis", 2.7, 0.15);

        imprimirNome.accept(produto1);

        List<Produto> produtos = Arrays.asList(produto1, produto2, produto3, produto4);
        produtos.forEach(imprimirNome);
        produtos.forEach(p -> System.out.println(p.preco));
        produtos.forEach(System.out::println);
    }
}
