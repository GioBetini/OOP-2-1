package View;

import java.util.ArrayList;
import java.util.List;

import Model.ItemPedido;
import Model.Pedido;
import Model.Produto;

public class Main {
    public static void main(String[] args) throws Exception {

      Produto prod = new Produto();
      prod.setCodigo(1);
      prod.setDescricao("Bala");
      prod.setValor(1.5);

      ItemPedido item = new ItemPedido();
      List<ItemPedido> lista = new ArrayList<ItemPedido>();

      item.setQuantidade(3);

      Pedido p1 = new Pedido();

      p1.setNumeroNota(10000);
      p1.adicionaItem(lista, item);
      System.out.println(p1.getValorTotal(lista, prod.getValor()));;


    }
}
