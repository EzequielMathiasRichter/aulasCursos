/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.aula04;

/**
 *
 * @author Aluno
 */
public class ex02 {

    public static void main(String[] args) {
        int number = 9;
        
        do {
            number++;
            
             if(number % 2 == 0){
            System.out.println("par");
            System.out.println(number + " ");
        }else{
            System.out.println("ímpar");
            System.out.println(" "+ number);
        }
        } while (number<=49);
       
    }
}
