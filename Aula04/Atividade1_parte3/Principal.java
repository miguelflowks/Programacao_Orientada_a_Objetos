import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ContaBancaria> contas = new ArrayList<>();

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n1 - Criar conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Aplicar percentual");
            System.out.println("5 - Ver saldo e dados");
            System.out.println("6 - Ver extrato");
            System.out.println("7 - Listar contas");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();

            if (opcao == 1) {
                sc.nextLine(); 
                System.out.print("Nome do titular: ");
                String nome = sc.nextLine();

                System.out.print("Saldo inicial: ");
                double saldoInicial = sc.nextDouble();

                Titular titular = new Titular(nome, "000", null);
                ContaBancaria novaConta = new ContaBancaria(titular, saldoInicial);
                contas.add(novaConta);

                System.out.println("Conta criada! Número: " + (contas.size() - 1));

            } else if (opcao == 2) {
                ContaBancaria conta = escolherConta(sc, contas);
                if (conta != null) {
                    System.out.print("Valor do depósito: ");
                    double valor = sc.nextDouble();
                    conta.depositar(valor);
                }

            } else if (opcao == 3) {
                ContaBancaria conta = escolherConta(sc, contas);
                if (conta != null) {
                    System.out.print("Valor do saque: ");
                    double valor = sc.nextDouble();
                    conta.sacar(valor);
                }

            } else if (opcao == 4) {
                ContaBancaria conta = escolherConta(sc, contas);
                if (conta != null) {
                    System.out.print("Percentual: ");
                    double percentual = sc.nextDouble();
                    conta.aplicarPercentual(percentual);
                }

            } else if (opcao == 5) {
                ContaBancaria conta = escolherConta(sc, contas);
                if (conta != null) {
                    System.out.println("\nTitular: " + conta.getNome());
                    System.out.println("Saldo: " + conta.getSaldo());
                    System.out.println("Operações: " + conta.getOperacoes());
                }

            } else if (opcao == 6) {
                ContaBancaria conta = escolherConta(sc, contas);
                if (conta != null) {
                    conta.exibirExtrato();
                }

            } else if (opcao == 7) {
                for (int i = 0; i < contas.size(); i++) {
                    System.out.println(i + " - " + contas.get(i).getNome());
                }
            }
        }

        System.out.println("Saindo...");
        sc.close();
    }

    static ContaBancaria escolherConta(Scanner sc, ArrayList<ContaBancaria> contas) {
        if (contas.isEmpty()) {
            System.out.println("Nenhuma conta criada ainda!");
            return null;
        }

        for (int i = 0; i < contas.size(); i++) {
            System.out.println(i + " - " + contas.get(i).getNome());
        }
        System.out.print("Escolha o número da conta: ");
        int indice = sc.nextInt();

        if (indice >= 0 && indice < contas.size()) {
            return contas.get(indice);
        } else {
            System.out.println("Conta inválida!");
            return null;
        }
    }
}