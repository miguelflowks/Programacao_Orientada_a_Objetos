public class ContaCorrente extends ContaBancaria {
    
    ContaCorrente(Titular titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    void sacar(double valor) {
        super.sacar(valor + 0.50); 
    }
}