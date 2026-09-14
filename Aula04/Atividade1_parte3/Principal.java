import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do titular: ");
        String nome = sc.nextLine();

        System.out.print("Saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        Titular titular1 = new Titular(nome, "000", null);
        ContaBancaria c1 = new ContaBancaria(titular1, saldoInicial);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Aplicar percentual");
            System.out.println("4 - Ver saldo e dados");
            System.out.println("5 - Ver extrato");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.print("Valor do depósito: ");
                double valor = sc.nextDouble();
                c1.depositar(valor);

            } else if (opcao == 2) {
                System.out.print("Valor do saque: ");
                double valor = sc.nextDouble();
                c1.sacar(valor);

            } else if (opcao == 3) {
                System.out.print("Percentual: ");
                double percentual = sc.nextDouble();
                c1.aplicarPercentual(percentual);

            } else if (opcao == 4) {
                System.out.println("\nTitular: " + c1.getNome());
                System.out.println("Saldo: " + c1.getSaldo());
                System.out.println("Operações: " + c1.getOperacoes());

            } else if (opcao == 5) {
                c1.exibirExtrato();
            }
        }

        System.out.println("Saindo...");
        sc.close();
    }
}