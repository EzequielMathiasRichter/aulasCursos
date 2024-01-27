package C5_Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();

        conjunto.add(1.2); // double -> Double
        conjunto.add(true);
        conjunto.add("teste");
        conjunto.add(1);
        conjunto.add("x");

        System.out.println("tamanho é: " + conjunto.size());

        // conjunto.add("Teste"); //-> adiciona pois é diferente de "teste" != "Teste"
        conjunto.add("teste"); //-> não adiciona pois é igual a "teste" == "teste"
        System.out.println("tamanho é: " + conjunto.size());

        System.out.println(conjunto.remove("Teste")); // retorna flase pois não existe esse elemento
        System.out.println(conjunto.remove("teste")); // retorna true pois existe e removeu este elemento

        System.out.println("Tamanho é: " + conjunto.size());

        System.out.println(conjunto.contains("teste")); // retorna false pois não contém esse elemento
        System.out.println(conjunto.contains(1)); // retorna true pois contém esse elemento

        Set nums = new HashSet();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println(nums);
        System.out.println(conjunto);

        //conjunto.addAll(nums); // união entre dois conjuntos

        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
