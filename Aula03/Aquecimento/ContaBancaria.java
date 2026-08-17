public class ContaBancaria {
    String titular;
    Double saldo;
    Int operacoes;

    void depositar(double valor) { // Já determina que os valores devem ser maiores que 0, caso contrário, não será possível realizar o depósito.
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido. Informe um valor positivo.");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && valor + 0.50 <= saldo) { // Aqui cada saque tem uma tarifa de R$ 0,50 por cobrança
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Saldo: " + saldo);
    }

    void transferir(ContaBancaria contaDestino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }
}
