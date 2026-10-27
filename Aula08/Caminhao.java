public class Caminhao extends Veiculo {

    public Caminhao(String placa, double capacidadeQuilos) {
        super(placa, capacidadeQuilos);
    }

    @Override
    public double calcularCusto(double distanciaKm) {
        double custoBase = super.calcularCusto(distanciaKm);
        double toneladas = getCapacidadeQuilos() / 1000.0;
        double adicional = 0.50 * distanciaKm * toneladas;
        
        return custoBase + adicional;
    }
}