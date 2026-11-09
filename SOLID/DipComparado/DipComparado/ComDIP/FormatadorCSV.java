import java.util.ArrayList;

public class FormatadorCSV implements Formatador {

    @Override
    public String formatar(ArrayList<Venda> vendas, double faturamento) {
        StringBuilder sb = new StringBuilder();
        sb.append("Produto;Qtd;Preco;Total\n");
        for (Venda v : vendas) {
            sb.append(v.getProduto() + ";"
                + v.getQuantidade() + ";"
                + String.format("%.2f", v.getPrecoUnitario()) + ";"
                + String.format("%.2f", v.getTotal()) + "\n");
        }
        sb.append("TOTAL;;;" + String.format("%.2f", faturamento) + "\n");
        return sb.toString();
    }
}
