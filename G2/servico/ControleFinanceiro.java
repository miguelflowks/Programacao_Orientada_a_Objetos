package servico;

import java.util.ArrayList;
import modelo.Envio;

public class ControleFinanceiro {
    private ArrayList<Envio> envios = new ArrayList<>(); // SRP: esta classe é responsável somente pelo controle financeiro dos envios.

    public void registrar(Envio e) {
        envios.add(e);
    }

    public double calcularFaturamentoMensal() {
        double total = 0;
        for (Envio e : envios) {
            total += e.calcularValorBase();
        }
        return total;
    }

    public double envioMaisCaro() {
        if (envios.isEmpty()) {
            return 0;
        }

        double maior = envios.get(0).calcularValorBase();
        for (Envio envio : envios) {
            double valor = envio.calcularValorBase();
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }

}
