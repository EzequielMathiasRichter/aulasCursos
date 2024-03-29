package C7_Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
    public static void main(String[] args) {
        UnaryOperator<Integer> maisDois = numero -> numero + 2;
        UnaryOperator<Integer> vezesDois = numero -> numero * 2;
        UnaryOperator<Integer> aoQuadrado = numero -> numero * numero;

        int resultado1 = maisDois
                .andThen(vezesDois)
                .andThen(aoQuadrado)
                .apply(0);
        System.out.println(resultado1);

        int resultado2 = aoQuadrado
                .compose(vezesDois) // A ordem dos métodos é invertida
                .compose(maisDois)
                .apply(0);
        System.out.println(resultado2);
    }
}
