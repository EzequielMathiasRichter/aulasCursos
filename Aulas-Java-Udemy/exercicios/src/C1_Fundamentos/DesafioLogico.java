package C1_Fundamentos;

import java.util.Scanner;

public class DesafioLogico {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("O trabalho na terça deu certo? S/N");
        String terca = scan.nextLine().toUpperCase();
        boolean tercaB;
        if(terca.equals("S")){
            tercaB = true;
        }
        else {
            tercaB = false;
        }
        System.out.println("Passou-se dois dias e mãe de Gabriel voltou a perguntar.");
        System.out.println("O trabalho na quinta deu certo? S/N");
        String quinta = scan.nextLine().toUpperCase();
        boolean quintaB;
        if(quinta.equals("S")){
            quintaB = true;
        }
        else {
            quintaB = false;
        }

        if(tercaB && quintaB){
            System.out.println("gabriel foi ao Shopping e comprou uma TV de 45 polegadas");
        } else if (tercaB || quintaB) {
            System.out.println("Gabriel foi ao Shopping e comprou uma Tv de 30 polegadas");
        }
        else{
            System.out.println("Gabriel levou a família para tomar sorvete no Shopping");
        }
    }
}
