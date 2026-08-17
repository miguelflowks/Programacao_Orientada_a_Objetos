public class Principal {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Miguel", "miguel161foza@gmail.com");

        Produto produto1 = new Produto("Playstation 2", 200.00);

        Pedido pedido1 = new Pedido(cliente1, produto1, 2);

        pedido1.resumo();
        
    }
    
}
