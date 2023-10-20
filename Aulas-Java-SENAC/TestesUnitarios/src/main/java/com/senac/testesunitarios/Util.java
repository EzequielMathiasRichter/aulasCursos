/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.testesunitarios;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Util {
    public static boolean validarPessoa(Pessoa pessoa){
        if (pessoa.getNome().length() > 15){
            return false;
        } 
        else if (pessoa.getIdade() < 18){
            return false;
        }
        return true;
    }
    public static int converterStringParaInt(String stringASerConvertida){
        return Integer.parseInt(stringASerConvertida);
        
    }
    public static List<String> ordenarLista(List<String> lista){
        Collections.sort(lista);
        
        return lista;
    }
}
