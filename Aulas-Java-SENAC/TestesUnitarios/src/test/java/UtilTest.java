
import com.senac.testesunitarios.Pessoa;
import com.senac.testesunitarios.Util;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
/**
 *
 * @author Aluno
 */
public class UtilTest {

    @Test
    public void quandoValidarUmaPessoaComNomeInvalido_DeveRetornarFalse() {
        Pessoa pessoa = new Pessoa("Joao Guilherme Da Silva Santos", 16);

        boolean resultado = Util.validarPessoa(pessoa);

        Assertions.assertFalse(resultado);
    }
    @Test
    public void quandoValidarUmaPessoaComIdadeInvalida_DeveRetornarFalse(){
        Pessoa pessoa = new Pessoa("joao", 17);
        
        boolean resultado = Util.validarPessoa(pessoa);
        
        Assertions.assertFalse(resultado);
    }
    @Test
    public void quandoValidarPessoaValida(){
        Pessoa pessoa = new Pessoa("Joao", 24);
        
        boolean resultado = Util.validarPessoa(pessoa);
        
        Assertions.assertTrue(resultado);
    }
    @Test
    public void quandoUmaStringValida_deveRetornarInt(){
        String valor = "5";
        int resultadoEsperado = 5;
        
        int resultado = Util.converterStringParaInt(valor);
        
        Assertions.assertEquals(resultadoEsperado, resultado);
    }
    @Test
    public void quandoUmaStringInvalida_DeveJogarException(){
        String valor = "A3";
        String resulatdoEsperado = "For input string: \"A3\"";
        
        NumberFormatException resultado = assertThrows(NumberFormatException.class, () -> Util.converterStringParaInt(valor));
    
        Assertions.assertEquals(resulatdoEsperado, resultado.getMessage());
    }
    @Test
    public void quandoPassarUmaLista_DeveRetornarAMesmaOrdenada(){
        List<String> lista = new ArrayList();
        lista.add("Douglas");
        lista.add("Ana");
        lista.add("Guilherme");
        
        List<String> resultado = Util.ordenarLista(lista);
        
        Assertions.assertEquals("Ana", resultado.get(0));
        Assertions.assertEquals("Douglas", resultado.get(1));
        Assertions.assertEquals("Guilherme", resultado.get(2));
    }
}
