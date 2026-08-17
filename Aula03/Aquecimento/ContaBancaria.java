public class ContaBancaria {
    String titular;
    double saldo;
    int operacoes;

    ContaBancaria(String nome, double saldoInicial) {
        this.titular = nome;
        this.saldo = saldoInicial;
        
    }

    void depositar(double valor) { // Já determina que os valores devem ser maiores que 0, caso contrário, não será possível realizar o depósito.
        if (valor > 0) {
            saldo += valor;
            operacoes++; // operacoes = operacoes + 1; dá na mesma
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido. Informe um valor positivo.");
        }
    }

    void sacar(double valor) {
        if (valor > 0 && valor + 0.50 <= saldo) { // Aqui cada saque tem uma tarifa de R$ 0,50 por cobrança
            saldo -= (valor + 0.50); // Junta o saque e a taxa de R$ 0,50 tudo em um
            operacoes++;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    void exibirSaldo() {
        System.out.println("Titular: " + titular + " | Saldo: " + saldo);
        System.out.println("Total de operações: " + operacoes);
    }

    void transferir(ContaBancaria contaDestino, double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            contaDestino.saldo += valor;
            operacoes++;
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    void aplicarRendimento(double percentual) { // aplicar rendimento, que aumente o saldo
        if (percentual > 0 && percentual <= 100) {
            saldo += saldo * (percentual / 100);
            operacoes++;
            System.out.println("Seu rendimento foi aplicado com sucesso!");
        } else {
            System.out.println("Bota um valor normal aí mano plmds...");
        }
    }
}
