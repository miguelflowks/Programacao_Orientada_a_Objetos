import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeRelatorio {
    private ArrayList<Venda> vendas;

    public GeradorDeRelatorio() {
        this.vendas = new ArrayList<>();
    }

    public void registrar(Venda venda) {
        vendas.add(venda);
    } 

    public void gerarRelatorioPorCsv() {
        System.out.println("=== Gerando relatorio CSV ===");

        StringBuilder csv = new StringBuilder();
        csv.append("Produto;Qtd;Preco;Total\n");
        double faturamento = 0;
        for (Venda v : vendas) {
            csv.append(v.getProduto() + ";"
                + v.getQuantidade() + ";"
                + String.format("%.2f", v.getPrecoUnitario()) + ";"
                + String.format("%.2f", v.getTotal()) + "\n");
            faturamento += v.getTotal();
        }
        csv.append("TOTAL;;;" + String.format("%.2f", faturamento) + "\n");

        try {
            FileWriter fw = new FileWriter("relatorio.csv");
            fw.write(csv.toString());
            fw.close();
            System.out.println("[ARQUIVO] relatorio.csv salvo com sucesso.");
        } catch (IOException e) {
            System.out.println("[ERRO] Falha ao salvar: " + e.getMessage());
        }

        System.out.println("[SMTP] Conectando ao servidor de e-mail...");
        System.out.println("[SMTP] Enviando relatorio.csv para gerente@empresa.com...");
        System.out.println("[SMTP] E-mail enviado com sucesso.");
        System.out.println();
    }
}
