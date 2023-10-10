import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        String nome = scan.nextLine();
        System.out.printf("prazer em conhece-lo %s",nome);
    }
}