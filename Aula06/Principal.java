import java.time.LocalDate;

public class Principal {
    
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Zé", "55999066369");
        Cliente cliente2 = new Cliente("Airton", "55999497194");

        Veiculo fucaoDosInferno = new Veiculo("JBL", "Fuscão", "medio", cliente2);
        Veiculo corsaQuebrado = new Veiculo("IJT", "Corsa", "pequeno", cliente1);

        LavaJa lavatudoJato = new LavaJa("LavaTudoJa");

        lavatudoJato.adicionarServico(new LavagemComCera(fucaoDosInferno, LocalDate.MAX, 50.0));
        lavatudoJato.adicionarServico(new LavagemSimples(corsaQuebrado, LocalDate.MAX, 20.0));
    
        try {
            lavatudoJato.adicionarServico(new LavagemSimples(corsaQuebrado, LocalDate.MAX, 20.0));
        } catch (LavaJaException e) {
            System.out.println("Carro não informado");
        }
    
    }

}
