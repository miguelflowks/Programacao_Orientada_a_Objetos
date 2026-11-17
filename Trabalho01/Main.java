import excecoes.PrecoInvalidoException;
import modelo.Cliente;
import modelo.Combo;
import modelo.Pedido;
import modelo.PratoEspecial;
import modelo.PratoExecutivo;
import relatorios.RelatorioConsole;
import relatorios.RelatorioService;
import servico.ControlePedidos;

public class Main {
    public static void main(String[] args) {
        ControlePedidos controle = new ControlePedidos();

        try {
            System.out.println("Prato com preço base negativo...");
            new PratoExecutivo("Prato Inválido", -15.0, 10);
        } catch (PrecoInvalidoException e) {
            System.out.println("Deu erro aí: " + e.getMessage());
        }
        System.out.println("O programa ta vivo! :D\n");

        Cliente cliente1 = new Cliente("Kadu", "Estrada Recanto Maestro , 123", "11988887777");
        Cliente cliente2 = new Cliente("Laura", "Rua Santo Angelo", "11977776666");

        // pedido 1 
        Pedido pedido1 = new Pedido(cliente1);
        pedido1.adicionarPrato(new PratoExecutivo("Executivo de Porco", 30.0, 15));        
        pedido1.adicionarPrato(new Combo("Combo Almoço", 40.0, 20));                       

        // pedido 2 
        Pedido pedido2 = new Pedido(cliente2);
        pedido2.adicionarPrato(new PratoEspecial("Picanha do Lula Premium", 50.0, 25, 20.0));

        pedido3.adicionarPrato(new PratoSemGluten("Strogonoff Zero", 75.0, 15, 20.0));

        controle.adicionarPedido(pedido1);
        controle.adicionarPedido(pedido2);

        RelatorioService relatorio = new RelatorioConsole();
        relatorio.gerarRelatorio(controle);
    }
}