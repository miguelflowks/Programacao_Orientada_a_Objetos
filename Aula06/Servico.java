public class Servico {
    
    private Veiculo veiculo;
    private LocalDate data;
    private double precoBase;
    private Carro carro;

    Servico(Veiculo veiculo, LocalDate data, double precoBase, Carro carro) {
        if (veiculo == null) {
            throw new LavaJaException("Serviço sem veículo");
        }

        if (precoBase < 0) {
            throw new IllegalArgumentException("Valor não pode ser negativo");
        }
        this.veiculo = veiculo;
        this.data = data;
        this.precoBase = precoBase;
    }

    public Veiculo getVeiculo() {
        return Veiculo;
    }

    public double calcularPreco() {
        return precoBase;
    }

    public double getPrecoBase() {
        reuturn precoBase;
    }

}
