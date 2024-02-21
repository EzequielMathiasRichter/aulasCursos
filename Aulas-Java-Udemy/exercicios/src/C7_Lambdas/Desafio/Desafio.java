package C7_Lambdas.Desafio;

import C7_Lambdas.Produto;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 4356.89, 0.13);

        Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);

        UnaryOperator<Double> impostoMunicipal = (preco) -> preco >= 2500 ? preco * 1.085: preco;

        UnaryOperator<Double> frete = (preco) -> preco >= 3000 ? preco + 100 : preco + 50;

        Function<Double, String> arredondar = preco -> String.format("%.2f", preco);

        Function<String, String> formatar = preco -> String.format("R$: %s", preco.replace(".", ","));

        System.out.println(precoFinal.andThen(impostoMunicipal).andThen(frete).andThen(arredondar).andThen(formatar).apply(p));
    }
}
