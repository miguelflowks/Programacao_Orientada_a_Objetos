public class Veiculo {
    
    private String placa;
    private double capacidadeQuilos;

    public Veiculo(String placa, double capacidadeQuilos) {
        this.placa = placa;
        this.capacidadeQuilos = capacidadeQuilos;
    }

    public String getPlaca() {
        return placa;
    }

    public double getCapacidadeQuilos() {
        return capacidadeQuilos;
    }

    public double calcularCusto(double distanciaKm) {
        return distanciaKm * 2.0;
    }
}