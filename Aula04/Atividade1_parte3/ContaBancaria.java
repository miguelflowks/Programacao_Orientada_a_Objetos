import java.util.ArrayList;

public class ContaBancaria {
    private Titular titular;

    protected double saldo;
    private int operacoes;
    protected ArrayList<Double> movimentacoes;


    ContaBancaria(Titular nome, double saldoInicial) {
        this.titular = nome;
        this.saldo = saldoInicial;
        this.operacoes = 0;
        this.movimentacoes = new ArrayList<>();
        
    }

    void depositar(double valor) {
        if (valor > 0){
            saldo += valor;
            System.out.println("\nDeposito concluido!");
            movimentacoes.add(valor);
            operacoes ++;
        }else{
            System.out.println("Deposite um saldo positivo!");
        }
    }
    
    void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("\nSaque concluido!");
            movimentacoes.add((-valor));
            operacoes ++;
        } else {
            System.out.println("\nSaque Invalido - Valor Excedido");
        }
    }

    public double getSaldo() {
        return this.saldo;
    }   
    
    public int getOperacoes() {
        return this.operacoes;

    }

    public String getNome() {
        return titular.getTitular();
    }

    public void exibirExtrato() {
        System.out.println("\nUltimas movimentações: ");
        for (Double movimentacao : movimentacoes) {
            System.out.println(movimentacao);
    }}

    public void totalDepositado() {
        Double soma = 0.0;
        for (Double movimentacao : movimentacoes) {
            if (movimentacao > 0) {
                soma += movimentacao;
            }}
        System.out.print("\nTotal depositado no mês: "+soma);
    }

    public void maiorSaque() {
        Double maior = 0.0;
        for (Double movimentacao : movimentacoes) {
            if (movimentacao < maior){
                maior = movimentacao;
            }}
        System.out.println("\nSeu maior saque foi de: "+maior);
    }
}