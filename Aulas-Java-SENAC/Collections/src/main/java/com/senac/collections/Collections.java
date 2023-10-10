/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author Aluno
 */
public class Collections {

    public static void main(String[] args) {
//        List<String> textos = new ArrayList<>();
//        String[] array = {"oi","olá","opa"};
//        textos.addAll(Arrays.asList(array));
//        
//        Set<String> textosSet = new HashSet();
//        
//        textosSet.add("Hey");
//        textosSet.add("Hello");
//        
//        //System.out.println(textos);
//        //System.out.println(textosSet);
//        
//        List<String> namoradas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
//        for(int i = 0; i<5; i++){
//            System.out.printf("Qual o nome da sua %dª namorada?", i+1);
//            namoradas.add(i,scan.nextLine());
//            
//        }
//        for(int i = 0; i<namoradas.size(); i++){
//            System.out.printf("\nEstá é a %s minha namorada número %d", namoradas.get(i), i+1);
//        }
        
        List<Pessoa> pessoas = new ArrayList();
        for(int i = 0; i<2; i++){
            System.out.println("Digite o nome e a idade da pessoa que quer adicionar \nExemplo \nEzequiel (Sem sobrenome)\n18");
            pessoas.add( new Pessoa( scan.next(),scan.nextInt()));
        }
        
//        List<Pessoa> pessoasFiltradas = new ArrayList();
//        for (Pessoa pessoa : pessoas) {
//            if(pessoa.getIdade()>=18){
//                pessoasFiltradas.add(pessoa);
//            }
//        }

        List<Pessoa> pessoasFiltradas = pessoas.stream().filter(pessoa -> pessoa.getIdade()>=20).collect(Collectors.toList());

        for(Pessoa pessoa : pessoasFiltradas){
            System.out.printf("\nNome: %s\nIdade: %d",pessoa.getNome(),pessoa.getIdade());
        }
        
        Map<String, String> dicionario = new HashMap();
        dicionario.put("OI", "HI");
        dicionario.put("HELLO", "OLÁ");
        String traducaoOi = dicionario.get("OI");
        String traducaoHello = dicionario.get("HELLO");
        System.out.println(traducaoOi);
        System.out.println(traducaoHello);
        
        
        Map<Integer, String> usuario = new HashMap();
        for(Integer i = 0; usuario.size()<3; i++){
            usuario.put(i, scan.next());
        }
        for(Integer i = 0; i < usuario.size(); i++ ){
            System.out.printf("Chave: %d\nNome: %s",i,usuario.get(i));
        }
    }
}
