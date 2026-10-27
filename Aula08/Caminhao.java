public class Caminhao extends Veiculo {

    public Caminhao(String placa, double capacidadeQuilos) {
        super(placa, capacidadeQuilos);
    }

    @Override
    public double calcularCusto(double distanciaKm) {
        double custoBase = super.calcularCusto(distanciaKm); // aqui ele pega o custo base, utiliza o super pra chamar a função de "Veiculo/calcularCusto", assim conseguindo o custo base
        double toneladas = getCapacidadeQuilos() / 1000.0; // calcula toneladas chamando a capacidade do caminhão pelo método get e dividindo por 1000.
        double adicional = 0.50 * distanciaKm * toneladas; // só calcula os 0,50 por km para cada tonelada.
        
        return custoBase + adicional; 
    }
}