package C7_Lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {
    public static void main(String[] args) {
        Predicate<Integer> isPar = numero -> numero % 2 ==0; // Verifica se o número é par e retorna true ou false
        Predicate<Integer> isTresDigitos = numero -> numero >= 100 && numero <= 999; // Verifica se o número tem 3 dígitos

        System.out.println(isPar.and(isTresDigitos).negate().test(123));
        System.out.println(isPar.or(isTresDigitos).test(122));
    }
}
