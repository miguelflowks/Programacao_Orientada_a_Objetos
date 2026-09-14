import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do titular: ");
        String nome = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();

        Titular titular1 = new Titular(nome, cpf, null);

        System.out.print("Saldo inicial: ");
        double saldoInicial = sc.nextDouble();

        ContaBancaria c1 = new ContaBancaria(titular1, saldoInicial);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Aplicar percentual");
            System.out.println("4 - Exibir dados da conta");
            System.out.println("5 - Exibir extrato");
            System.out.println("6 - Total depositado");
            System.out.println("7 - Maior saque");
            System.out.println("8 - Alterar nome do titular");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Valor do depósito: ");
                    double valorDeposito = sc.nextDouble();
                    c1.depositar(valorDeposito);
                    break;

                case 2:
                    System.out.print("Valor do saque: ");
                    double valorSaque = sc.nextDouble();
                    c1.sacar(valorSaque);
                    break;

                case 3:
                    System.out.print("Percentual: ");
                    double percentual = sc.nextDouble();
                    c1.aplicarPercentual(percentual);
                    break;

                case 4:
                    exibir(c1);
                    break;

                case 5:
                    c1.exibirExtrato();
                    break;

                case 6:
                    c1.totalDepositado();
                    break;

                case 7:
                    c1.maiorSaque();
                    break;

                case 8:
                    sc.nextLine(); // limpar buffer
                    System.out.print("Novo nome: ");
                    String novoNome = sc.nextLine();
                    titular1.setTitular(novoNome);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }

    static void exibir(ContaBancaria conta) {
        System.out.println("\nTitular da Conta: " + conta.getNome()
                + "\nSaldo atual: " + conta.getSaldo()
                + "\nNúmero de operações: " + conta.getOperacoes());
    }
}