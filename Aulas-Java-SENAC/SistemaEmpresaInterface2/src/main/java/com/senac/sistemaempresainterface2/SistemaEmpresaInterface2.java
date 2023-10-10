/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.senac.sistemaempresainterface2;

/**
 *
 * @author Aluno
 */
public class SistemaEmpresaInterface2 {

    public static void main(String[] args) {
        Gerente gerente = new Gerente(5000);
        
        gerente.calcularSalario();
        gerente.getTipoFuncionario();
        
        Vendedor vendedor = new Vendedor(2000,3);
        
        vendedor.calcularSalario();
        vendedor.getTipoFuncionario();
        
    }
}
