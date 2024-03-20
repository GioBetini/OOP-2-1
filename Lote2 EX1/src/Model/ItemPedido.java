package Model;


public class ItemPedido {
    private int quantidade;

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        if (quantidade < 0){
            this.quantidade = 1;
        } else{
            this.quantidade = quantidade;
        }
    }


}
