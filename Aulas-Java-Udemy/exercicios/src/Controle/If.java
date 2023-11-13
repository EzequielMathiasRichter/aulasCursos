package Controle;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a média: ");
        double media = scan.nextDouble();
        boolean criterioDeAprovacao = media >=7 ;
        if(media <= 10 && media >=7) {
            System.out.println("Você está aprovado!");
        }else if(media<7 && media >=4.5){
            System.out.println("Você foi Reprovado! Está de recuperação");
        }else{
            System.out.println("Você foir reprovado sem opção de recuperação!");
        }
        Scanner entrada = new Scanner(System.in);

        entrada.close();

    }
}
