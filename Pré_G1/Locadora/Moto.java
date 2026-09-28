package Locadora;

public class Moto extends Veiculo{
    public Moto(String placa, String modelo, double diaria) {
        super(placa, modelo, diaria);
    }
    
    @Override
    public double calcularAluguel(int dias) {
        if (dias <= 0) {
            System.out.println("Quantidade de dias invalida!");
            return 0.0;
        }
        double totalPagamento = super.calcularAluguel(dias);
        if (dias >= 7) {
            return totalPagamento * 0.90;
        } else {
            return totalPagamento;
        }

    }
}
