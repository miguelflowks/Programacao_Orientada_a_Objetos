package servico;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import modelo.Pedido;

public class ControlePedidos {

    private List<Pedido> pedidos = new ArrayList<>();

    public void adicionarPedido(Pedido pedido) {
        if (pedido != null) {
            this.pedidos.add(pedido);
        }
    }

    public double calcularFaturamentoTotal() {
        double total = 0.0;
        
        for (Pedido p : pedidos) {
            total += p.calcularValorTotal();
        }
        return total;
    }

    public Pedido obterPedidoMaisCaro() {
        if (pedidos.isEmpty()) {
            return null;
        }

        Pedido maisCaro = pedidos.get(0);
        
        for (Pedido p : pedidos) {
            if (p.calcularValorTotal() > maisCaro.calcularValorTotal()) {
                maisCaro = p;
            }
        }
        return maisCaro;
    }

    public List<Pedido> getPedidos() {
        return Collections.unmodifiableList(pedidos);
    }
}