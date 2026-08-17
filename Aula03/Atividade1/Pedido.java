public class Pedido {
    Cliente cliente;
    Produto produto;
    int quantidade;

    Pedido(Cliente cliente, Produto produto, int quantidade) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
    void resumo() {
        System.out.println("Pedido de -> " + cliente.nome); 
        System.out.println("Produto -> " + produto.nome + " | Preço: R$ " + produto.preco);
        System.out.println("Quantidade -> " + quantidade);
    }
}
