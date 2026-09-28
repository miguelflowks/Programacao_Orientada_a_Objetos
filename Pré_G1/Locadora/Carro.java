package Locadora;

public class Carro extends Veiculo {
    public Carro(String placa, String modelo, double diaria) {
        super(placa, modelo, diaria);
    }

    @Override
    public double calcularAluguel(int dias) {
        if (dias <= 0) {
            return 0.0;
        }
        return super.calcularAluguel(dias) + 30.0;
    }    
}
