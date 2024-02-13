package C7_Lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
    public static void main(String[] args) {
        // não:  int -> Double
        Double a = 2.0;
        // double -> Double
        BinaryOperator<Double> calculo = (x, y) -> { return x + y; };
        System.out.println(calculo.apply(2.0, 3.0));
        calculo = (x, y) -> x * y;
        System.out.println(calculo.apply(2.0, 3.0));

        BinaryOperator<Integer> calculo2 = (x, y) -> { return x + y; };
        System.out.println(calculo2.apply(2, 3));
        calculo2 = (x, y) -> x * y;
        System.out.println(calculo2.apply(2, 3));
    }
}
