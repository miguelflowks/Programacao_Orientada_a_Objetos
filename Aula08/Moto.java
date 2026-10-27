public class Moto extends Veiculo {

    public Moto(String placa, double capacidadeQuilos) {
        super(placa, capacidadeQuilos);
    }

    @Override
    public double calcularCusto(double distanciaKm) {
        return super.calcularCusto(distanciaKm) / 2.0;
    }
}