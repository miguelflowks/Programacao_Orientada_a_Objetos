public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Miguel", 1800);


        ContaBancaria conta2 = new ContaBancaria("Arthur", 1000);

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
        
        conta1.aplicarRendimento(5.0);
        conta2.aplicarRendimento(1000.0);

        System.out.println("---------------------------------");

        conta1.exibirSaldo();
        conta2.exibirSaldo();
    }
}
