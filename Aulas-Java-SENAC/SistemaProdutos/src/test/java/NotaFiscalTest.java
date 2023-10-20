/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.senac.sistemaprodutos.Livro;
import com.senac.sistemaprodutos.NotaFiscal;
import com.senac.sistemaprodutos.Produto;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Aluno
 */
public class NotaFiscalTest {
    @Test
    public void quandoAdicionarProdutoValido_DeveTerSucesso(){
        NotaFiscal notaFiscal = new NotaFiscal();
        Livro useACabecaJava = new Livro("Use a cabeça Java", 65, 5);
        
        notaFiscal.adicionarProduto(useACabecaJava);
        
        Assertions.assertEquals(1, notaFiscal.getProdutos().size());
        Assertions.assertEquals("Use a cabeça Java", notaFiscal.getProdutos().get(0).getNome());
    } 
    

}
