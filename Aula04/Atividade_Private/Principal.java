public class Principal {

    public static void main(String[] args) {

        Titular titular1 = new Titular("Augusto", "12345", null);
        ContaBancaria c1 = new ContaBancaria(titular1, 500);

        c1.aplicarRendimento(150.0);
        c1.exibirSaldo();

        c1.saldo = -10000;
        c1.exibirSaldo();

        System.out.println(c1.titular.nome);
    }
}
