public class Principal {
    public static void main(String[] args) {
        
        Titular titular1 = new Titular("Augusto", "123456789");
        ContaBancaria conta1 = new ContaBancaria(titular1, 1800); // <-- Passando a variável direto

        conta1.depositar(500.0);

        conta1.sacar(200.0);

        conta1.exibirSaldo();
        
        conta1.aplicarRendimento(5.0);

        conta1.exibirSaldo();
    }
}
