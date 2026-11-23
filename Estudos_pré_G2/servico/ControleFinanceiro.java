package servico;

import java.util.ArrayList;
import modelo.Matricula;

public class ControleFinanceiro {
    private ArrayList<Matricula> matriculas = new ArrayList<>();

    public void registrar(Matricula m) {
        matriculas.add(m);
    }

    public double calcularFaturamentoMensal() {
        double total = 0;
        for (Matricula m : matriculas) {
            total += m.calcularValor();
        }
        return total;
    }
}