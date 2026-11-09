import java.util.ArrayList;

public class FormatadorTexto implements Formatador {

    @Override
    public String formatar(ArrayList<Venda> vendas, double faturamento) {
        StringBuilder sb = new StringBuilder();
        sb.append("========== RELATORIO DE VENDAS ==========\n");
        int numero = 1;
        for (Venda v : vendas) {
            sb.append(String.format("%d. %s - %d un. x R$ %.2f = R$ %.2f\n",
                numero, v.getProduto(), v.getQuantidade(),
                v.getPrecoUnitario(), v.getTotal()));
            numero++;
        }
        sb.append("==========================================\n");
        sb.append(String.format("FATURAMENTO TOTAL: R$ %.2f\n", faturamento));
        return sb.toString();
    }
}
