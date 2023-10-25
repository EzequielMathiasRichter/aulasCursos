package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu primeiro sálario:");
        String valor1 = scan.nextLine().replace(",",".");
        System.out.println("Digite seu segundo sálario:");
        String valor2 = scan.nextLine().replace(",",".");
        System.out.println("Digite seu terceiro sálario:");
        String valor3 = scan.nextLine().replace(",",".");

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);
        double numero3 = Double.parseDouble(valor3);

        double media = (numero1 + numero2 + numero3) / 3;

        System.out.println("A média de 3 meses do seu sálario é: " + media);
    }
}
