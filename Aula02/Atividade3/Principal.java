package Atividade3;


public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Miguel";
        conta1.saldo = 1000.0;

        ContaBancaria conta2 = new ContaBancaria();
        conta2.titular = "Pedro";
        conta2.saldo = 1500.0;

        conta1.depositar(500.0);
        conta2.depositar(300.0);

        System.out.println("---------------------------------");

        conta1.sacar(200.0);
        conta2.sacar(400.0);

        System.out.println("---------------------------------");

        conta1.exibirSaldo();
        conta2.exibirSaldo();

        System.out.println("---------------------------------");

        conta1.transferir(conta2, 300.0);

        System.out.println("---------------------------------");

        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
