import java.util.ArrayList;

public class ContaBancaria {

    private Titular titular;
    private double saldo;
    private ArrayList<Movimentacao> movimentacoes = new ArrayList<>();

    ContaBancaria(Titular titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito inválido na conta de " + titular.getNome() + ": R$ " + valor);
        } else {
            saldo = saldo + valor;
            movimentacoes.add(new Movimentacao("Depósito", valor));
            System.out.println("Depósito de R$ " + valor + " na conta de " + titular.getNome());
        }
    }

    void sacar(double valor) {
        double custo = valor + 0.50;
        if (custo > saldo) {
            System.out.println("Saldo insuficiente na conta de " + titular.getNome()
                    + ": saque R$ " + valor + " mais tarifa, saldo R$ " + saldo);
        } else {
            saldo = saldo - custo;
            movimentacoes.add(new Movimentacao("Saque", valor));
            System.out.println("Saque de R$ " + valor + " (tarifa R$ 0.5) na conta de " + titular.getNome());
        }
    }

    void aplicarRendimento(double percentual) {
        if (percentual < 0 || percentual > 100) {
            System.out.println("Percentual inválido: " + percentual);
        } else {
            saldo = saldo + saldo * percentual / 100;
            System.out.println("Rendimento de " + percentual + "% na conta de " + titular.getNome());
        }
    }

    void exibirSaldo() {
        System.out.println("Conta de " + titular.getNome() + ": R$ " + saldo);
    }

    public double getSaldo() {
        return this.saldo;
    }

    void exibirMovimentacoes() {
        for (Movimentacao movimentacao : movimentacoes) {
            System.out.println(movimentacao);
        }
    }

}

