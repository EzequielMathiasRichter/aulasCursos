package C6_OO.Composicao.Desafio;

import java.util.ArrayList;

public class Cliente {
    final String nome;

    final ArrayList<Compra> compras = new ArrayList<>();

    Cliente(String nome){
        this.nome = nome;
    }

    void adicionarCompras(Compra compra){
        this.compras.add(compra);
    }

   double obterValorTotal(){
        double valorTotal = 0;

        for(Compra compra: compras){
            valorTotal += compra.obterValorTotal();
        }

        return valorTotal;
   };
}
