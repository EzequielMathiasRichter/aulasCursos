
import com.senac.testesunitarios.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */


/**
 *
 * @author Aluno
 */
public class CalculadoraTest {
    
    
    @Test
    public void quandoSomar_DeveTerSucesso() {
        double valor1 = 1;
        double valor2 = 2;
        double valorEsperado = 3;
        
        double soma = Calculadora.somar(valor1, valor2);
        
        Assertions.assertEquals(valorEsperado, soma);
    }
    @Test
    public void quandoSubtrair_DeveTerSucesso(){
        double valor1 = 1;
        double valor2 = 2;
        double valorEsperado = -1;
        
        double subtracao = Calculadora.subtrair(valor1,valor2);
        
        Assertions.assertEquals(valorEsperado, subtracao);
    }
    @Test
    public void quandoMultiplicar_DeveTerSucesso(){
        //Arange
        double valor1 = 10;
        double valor2 = 20;
        double valorEsperado = 200;
        //act
        double multiplicacao = Calculadora.multiplicar(valor1, valor2);
        //assert
        Assertions.assertEquals(valorEsperado, multiplicacao);
    }
    @Test
    public void quandoDividir_DeveTerSucesso(){
        double valor1 = 10;
        double valor2 = 2;
        double valorEsperado = 5;
        
        double divisao = Calculadora.dividir(valor1, valor2);
        
        Assertions.assertEquals(valorEsperado, divisao);
    }
}
