package Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class DesafioArrays {
    public static void main(String[] args) {

        // quantas notas quer passar?
        //

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantas notas quer passar? ");

        int numeroDeNotas = scan.nextInt();

        double[] notas = new double[numeroDeNotas];

        for(int i = 0; i < notas.length; i++){
            System.out.printf("Qual a %dª nota? ", i+1);
            notas[i] = scan.nextDouble();
        }
        double total = 0;
        for(double nota: notas){
            total += nota;
        }
        System.out.print("A média de suas notas é igual a: ");
        double media = total / notas.length;
        System.out.printf("%.1f", media);
    }

}
