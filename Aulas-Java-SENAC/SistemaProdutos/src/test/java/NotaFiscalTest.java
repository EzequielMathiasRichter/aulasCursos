
import com.senac.sistemaprodutos.NotaFiscal;
import com.senac.sistemaprodutos.Produto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotaFiscalTest {

    /**
     *
     * @author EzequielRichter
     */
    @Test
    void calcularValorTotalDeveRetornarZeroParaListaVazia() {
        NotaFiscal notaFiscal = new NotaFiscal();
        assertEquals(0.0, notaFiscal.calcularValorTotal());
    }

    @Test
    void adicionarProdutoDeveAumentarValorTotal() {
        NotaFiscal notaFiscal = new NotaFiscal();
        Produto produto1 = new Produto("Produto1", 30.0, 15.0);
        Produto produto2 = new Produto("Produto2", 8.0, 4.0);

        notaFiscal.adicionarProduto(produto1);
        notaFiscal.adicionarProduto(produto2);

        assertEquals(57.0, notaFiscal.calcularValorTotal());
    }

    @Test
    void removerProdutoPorNomeDeveRemoverProduto() {
        NotaFiscal notaFiscal = new NotaFiscal();
        Produto produto = new Produto("Produto1", 30.0, 15.0); // 
        notaFiscal.adicionarProduto(produto);

        notaFiscal.removerProdutoPorNome("Produto1");

        assertFalse(notaFiscal.poussuiProdutoPorNome("Produto1"));
    }

    @Test
    void getProdutoPorNomeDeveRetornarProdutoCorreto() {
        NotaFiscal notaFiscal = new NotaFiscal();
        Produto produto1 = new Produto("Produto1", 30.0, 15.0);
        Produto produto2 = new Produto("Produto2", 8.0, 4.0);

        notaFiscal.adicionarProduto(produto1);
        notaFiscal.adicionarProduto(produto2);

        assertEquals(produto1, notaFiscal.getProdutoPorNome("Produto1"));
    }

    @Test
    void possuiProdutoPorNomeDeveRetornarTrueSeProdutoExistir() {
        NotaFiscal notaFiscal = new NotaFiscal();
        Produto produto = new Produto("Produto1", 30.0, 15.0);
        notaFiscal.adicionarProduto(produto);

        assertTrue(notaFiscal.poussuiProdutoPorNome("Produto1"));
    }

    @Test
    void getProdutosOrdenadosPorNomeDeveRetornarListaOrdenada() {
        NotaFiscal notaFiscal = new NotaFiscal();
        Produto produto2 = new Produto("Produto2", 8.0, 4.0);
        Produto produto1 = new Produto("Produto1", 30.0, 15.0);

        notaFiscal.adicionarProduto(produto2);
        notaFiscal.adicionarProduto(produto1);

        assertEquals(produto1, notaFiscal.getProdutosOrdenadosPorNome().get(0));
        assertEquals(produto2, notaFiscal.getProdutosOrdenadosPorNome().get(1));
    }

    @Test
    void getProdutosOrdenadosPorPrecoDeveRetornarListaOrdenada() {
        NotaFiscal notaFiscal = new NotaFiscal();
        Produto produto2 = new Produto("Produto2", 8.0, 4.0);
        Produto produto1 = new Produto("Produto1", 30.0, 15.0);

        notaFiscal.adicionarProduto(produto2);
        notaFiscal.adicionarProduto(produto1);

        assertEquals(produto2, notaFiscal.getProdutosOrdenadosPorPreco().get(0));
        assertEquals(produto1, notaFiscal.getProdutosOrdenadosPorPreco().get(1));
    }
}
