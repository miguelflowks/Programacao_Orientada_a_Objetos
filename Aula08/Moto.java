public class Moto extends Veiculo {

    public Moto(String placa, double capacidadeQuilos) {
        super(placa, capacidadeQuilos);
    }

    @Override
    public double calcularCusto(double distanciaKm) {
        return super.calcularCusto(distanciaKm) / 2.0; // aqui ele simplesmente pega o custo base que já existe e divide por 2, porque a moto é metade
    }
}