import java.util.ArrayList;

public class GeradorDeRelatorio {
    private ArrayList<Venda> vendas;
    private Formatador formatador;
    private Destino destino;

    public GeradorDeRelatorio(Formatador formatador, Destino destino) {
        this.vendas = new ArrayList<>();
        this.formatador = formatador;
        this.destino = destino;
    }

    public void registrar(Venda venda) {
        vendas.add(venda);
    }

    public void gerarRelatorio() {
        double faturamento = 0;
        for (Venda v : vendas) {
            faturamento += v.getTotal();
        }
        String conteudo = formatador.formatar(vendas, faturamento);
        destino.enviar(conteudo);
    }
}
