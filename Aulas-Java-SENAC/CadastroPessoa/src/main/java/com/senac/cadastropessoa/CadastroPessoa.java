/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.cadastropessoa;

/**
 *
 * @author Aluno
 */
public class CadastroPessoa {

    public static void main(String[] args) {
        Gato gatoMain = new Gato("Dengoso", 15, "Persa");
        Cachorro cachorroMain = new Cachorro("Lindão", 16, "Pug");
        Carro carroMain = new Carro("Hyundai", "HB20");
        Moto motoMain = new Moto("Honda", "Hornet");
        Pessoa pessoa = new Pessoa(cachorroMain, gatoMain, motoMain, carroMain);
        Pessoa pessoaReal = new Pessoa("Ezequiel", 18);
        pessoaReal.informacoesPessoa();
        pessoa.imprimirPets();
        pessoa.imprimirVeiculos();
    }
}
