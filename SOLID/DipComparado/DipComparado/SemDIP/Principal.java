public class Principal {
    public static void main(String[] args) {
        GeradorDeRelatorio gerador = new GeradorDeRelatorio();

        gerador.registrar(new Venda("Camiseta", 15, 49.90));
        gerador.registrar(new Venda("Calca Jeans", 8, 129.90));
        gerador.registrar(new Venda("Tenis", 5, 299.90));
        gerador.registrar(new Venda("Boné", 20, 35.00));

        gerador.gerarRelatorio();
    }
}
