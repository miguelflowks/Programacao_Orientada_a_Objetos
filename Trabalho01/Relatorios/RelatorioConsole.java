package relatorio;

import modelo.Pedido;
import modelo.Prato;
import servico.ControlePedidos;

public class RelatorioConsole implements RelatorioService {

    @Override
    public void gerarRelatorio(ControlePedidos controle) {
        System.out.println("= RELATÓRIO DE FECHAMENTO DO DIA =");
        System.out.println("--- Lista de Pedidos ---");

        for (Pedido p : controle.getPedidos()) {
            System.out.println("Cliente: " + p.getCliente().getNome());
            System.out.println("Data: " + p.getData());
            System.out.println("Pratos:");
            
            for (Prato prato : p.getPratos()) {
                System.out.println(" - " + prato.getNome() + ": R$ " + prato.calcularPreco());
            }
            System.out.println("Total do Pedido: R$ " + p.calcularValorTotal());
            System.out.println("---------------------");
        }

        System.out.println("FATURAMENTO TOTAL: R$ " + controle.calcularFaturamentoTotal());

        Pedido maisCaro = controle.obterPedidoMaisCaro();
        
        if (maisCaro != null) {
            System.out.println("PEDIDO MAIS CARO: Cliente " 
                + maisCaro.getCliente().getNome() 
                + " (R$ " + maisCaro.calcularValorTotal() + ")");
        }
        System.out.println("===================");
    }
}