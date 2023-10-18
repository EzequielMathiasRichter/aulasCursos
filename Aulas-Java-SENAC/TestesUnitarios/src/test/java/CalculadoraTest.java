
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
        double soma = Calculadora.somar(1, 2);
        
        Assertions.assertEquals(3, soma);
    }
    @Test
    public void quandoSubtrair_DeveTerSucesso(){
        double subtracao = Calculadora.subtrair(2,1);
        Assertions.assertEquals(1, subtracao);
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
}
