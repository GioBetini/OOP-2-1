package Model;


import java.util.List;

public class Pedido {
    private int numeroNota;
    private double valorTotal;
    private List<ItemPedido> lista;

    



    public int getNumeroNota(){
        return numeroNota;
    }

    public void setNumeroNota(int numeroNota){
        this.numeroNota = numeroNota;
    }

    public void adicionaItem(List<ItemPedido> lista, ItemPedido itemPedido){
        lista.add(itemPedido);
    }

    public double getValorTotal(List<ItemPedido> itens, double valor ){ 
        
        for(ItemPedido itemPedido :  itens ){
            valorTotal = valorTotal + (itemPedido.getQuantidade() * valor );
        }
        return valorTotal;
    }

}
