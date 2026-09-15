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
            System.out.println("3 - Sacar (50 de TODAS as contas)");
            System.out.println("4 - Ver saldo e dados");
            System.out.println("5 - Ver extrato");
            System.out.println("6 - Listar contas");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();

            if (opcao == 1) {
                sc.nextLine(); 
                System.out.print("Nome do titular: ");
                String nome = sc.nextLine();

                System.out.print("Saldo inicial: ");
                double saldoInicial = sc.nextDouble();

                // Dando a opção para instanciar as subclasses (Polimorfismo)
                System.out.println("Qual o tipo da conta?");
                System.out.println("1 - Conta Corrente");
                System.out.println("2 - Conta Poupança");
                System.out.print("Escolha: ");
                int tipoConta = sc.nextInt();

                Titular titular = new Titular(nome, "000", null);
                ContaBancaria novaConta;

                if (tipoConta == 1) {
                    novaConta = new ContaCorrente(titular, saldoInicial);
                } else {
                    novaConta = new ContaPoupanca(titular, saldoInicial);
                }
                
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
                if (contas.isEmpty()) {
                    System.out.println("Nenhuma conta criada ainda!");
                } else {
                    System.out.println("Realizando saque de 50 em todas as contas (Polimorfismo em ação)...");
                    
                    // O seu FOR exatamente como você pediu
                    for (int i = 0; i < contas.size(); i++) {
                        contas.get(i).sacar(50);
                    }
                    
                    System.out.println("Saques realizados com sucesso!");
                }

            } else if (opcao == 4) {
                ContaBancaria conta = escolherConta(sc, contas);
                if (conta != null) {
                    System.out.println("\nTitular: " + conta.getNome());
                    System.out.println("Saldo: " + conta.getSaldo());
                    System.out.println("Operações: " + conta.getOperacoes());
                }

            } else if (opcao == 5) {
                ContaBancaria conta = escolherConta(sc, contas);
                if (conta != null) {
                    conta.exibirExtrato();
                }

            } else if (opcao == 6) {
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