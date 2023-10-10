/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.senac.sistemaprodutos;

/**
 *
 * @author Aluno
 */
public class ProdutoNaoEncontradoException extends RuntimeException {
    ProdutoNaoEncontradoException(String mensagemErro){
        super(mensagemErro);
    }
}
