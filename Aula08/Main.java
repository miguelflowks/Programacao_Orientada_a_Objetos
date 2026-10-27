import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Veiculo> frota = new ArrayList<>();

        frota.add(new Van("ABC-1234", 1200));
        frota.add(new Moto("MTO-5678", 50));
        frota.add(new Caminhao("TRK-6767", 5000)); 

        double distancia = 100.0;
        double custoTotal = 0.0;

        for (Veiculo v : frota) {
            custoTotal += v.calcularCusto(distancia);
        }

        System.out.println("Custo total para " + distancia + " km: R$ " + custoTotal);
    }
}