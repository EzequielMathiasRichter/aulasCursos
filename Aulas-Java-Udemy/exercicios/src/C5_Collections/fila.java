package C5_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        // offer e add -> adiciona elementos na fila
        // Diferença é o comportamento ocorre quando a fila está cheia!

        fila.add("Ana"); // Lança uma exceção
        fila.offer("Bia"); // retorna false
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> obter o próximo elemento da fila (sem remover)
        // Diferença é o comportamento ocorre quando a fila está vazia!
        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.peek()); // lança uma exceção
        System.out.println(fila.element());
        System.out.println(fila.element());


        // Pool e Remove -> obter o próximo elemento da fila e remove
        // Diferença é o comportamento ocorre quando a fila está vazia!
        System.out.println(fila.poll()); // retorna null
        System.out.println(fila.poll()); // lança uma exceção
        System.out.println(fila.remove());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());

        System.out.println(fila.poll());
//        System.out.println(fila.remove());



//        fila.size();
//        fila.clear();
//        fila.isEmpty();
//        fila.contains(...);

    }
}
