public class ContaUniversitaria extends ContaBancaria {

    ContaUniversitaria(Titular titular, double saldoInicial) {
        super(titular, saldoInicial); 
    }
    
    @Override
    void sacar(double valor) {
        if (valor <= 300) {
            saldo -= valor;
            System.out.println("\nSaque concluido!");
            movimentacoes.add((-valor));
        } else {
            System.out.println("\nSaque Invalido - Valor Exedido. O limite é 300.");
        }
    }
}