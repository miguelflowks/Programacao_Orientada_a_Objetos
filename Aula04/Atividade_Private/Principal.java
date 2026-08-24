public class Principal {

    public static void main(String[] args) {

        Titular titular1 = new Titular("Augusto", "12345", null);
        ContaBancaria c1 = new ContaBancaria(titular1, 500);

        System.out.println(c1.titular.nome);
    }
}
