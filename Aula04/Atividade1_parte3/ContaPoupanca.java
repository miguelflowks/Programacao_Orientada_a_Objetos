public class ContaPoupanca extends ContaBancaria {

    ContaPoupanca(Titular titular) {
        super(titular); 
    }
    
    void aplicarPercentual(double percentual){
        if (percentual >= 0 && percentual <= 100){
            double valor = saldo + (saldo*(percentual/100));
            System.out.println("\nSeu percentual de: "+percentual+"% é de: "+valor+" baseado no seu saldo atual!");
        } else {
            System.out.println("\nValor de percentual invalido!");
        }
    }



}
