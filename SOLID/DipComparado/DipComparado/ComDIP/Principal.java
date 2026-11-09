public class Principal {
    public static void main(String[] args) {

        System.out.println(">>> Relatorio 1: formato texto, destino console <<<\n");
        GeradorDeRelatorio gerador1 = new GeradorDeRelatorio(
            new FormatadorTexto(),
            new DestinoConsole()
        );
        gerador1.registrar(new Venda("Camiseta", 15, 49.90));
        gerador1.registrar(new Venda("Calca Jeans", 8, 129.90));
        gerador1.registrar(new Venda("Tenis", 5, 299.90));
        gerador1.registrar(new Venda("Boné", 20, 35.00));
        gerador1.gerarRelatorio();

        System.out.println(">>> Relatorio 2: formato CSV, destino arquivo <<<\n");
        GeradorDeRelatorio gerador2 = new GeradorDeRelatorio(
            new FormatadorCSV(),
            new DestinoArquivo("vendas.csv")
        );
        gerador2.registrar(new Venda("Camiseta", 15, 49.90));
        gerador2.registrar(new Venda("Calca Jeans", 8, 129.90));
        gerador2.registrar(new Venda("Tenis", 5, 299.90));
        gerador2.registrar(new Venda("Boné", 20, 35.00));
        gerador2.gerarRelatorio();

        // O GeradorDeRelatorio NAO FOI EDITADO entre um e outro.
        // Trocamos formato e destino mudando UMA LINHA cada na montagem.
        // Isso e Inversao de Dependencia.
    }
}
