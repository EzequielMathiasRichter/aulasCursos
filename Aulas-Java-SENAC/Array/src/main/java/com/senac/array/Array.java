/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Array {

    public static void main(String[] args) {
     int[] array1 =  new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i<=4; i++){
            System.out.println("Digite o valor da posição " + i);
            int elemento = scan.nextInt();
            array1[i] = elemento;
            
        }
        double somaTotal = 0;
        for(int p = 0; p<=4; p++){
            System.out.printf("Posição %d: %d\n", p, array1[p]);
            somaTotal = somaTotal + array1[p];
        }
        System.out.println("Soma total: " + somaTotal);
    }
}
