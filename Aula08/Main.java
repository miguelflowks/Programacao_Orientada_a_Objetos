import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Entregavel> entregas = new ArrayList<>();

        entregas.add(new Van("ABC-1234", 1200));
        entregas.add(new Moto("MTO-5678", 50));
        entregas.add(new Caminhao("TRK-6767", 5000));

        double distancia = 100.0;
        double custoTotal = 0.0;

        for (Entregavel entrega : entregas) {
            custoTotal += entrega.calcularCusto(distancia);
        }

        System.out.println("Custo total da frota: R$ " + custoTotal);
    }
}