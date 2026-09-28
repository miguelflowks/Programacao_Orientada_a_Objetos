package Locadora;

public class Principal {
    public static void main(String[] args) {
        Locadora locadora = new Locadora();

        Carro carro1 = new Carro("ABC-1234", "Civic", 100.0);
        Moto moto1 = new Moto("XYZ-9999", "Fazer", 50.0);

        locadora.cadastrarVeiculo(carro1);
        locadora.cadastrarVeiculo(moto1);

        System.out.println("\n--- TESTANDO OS ALUGUÉIS ---");

        locadora.alugar("ABC-1234", 5);

        locadora.alugar("XYZ-9999", 10);

        System.out.println("\n--- TESTANDO AS RECUSAS (DESAFIO DO PROFESSOR) ---");

        locadora.alugar("ABC-1234", -2);

        locadora.alugar("XXX-0000", 3);

        System.out.println("\n--- RELATÓRIO FINAL ---");
        locadora.exibirFaturamento();
    }
}