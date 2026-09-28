package Locadora;

public class Veiculo {
    private String placa;
    private String modelo;
    private double diaria;

    Veiculo(String placa, String modelo, double diaria) {
        this.placa = placa;
        this.modelo = modelo;
        this.diaria = diaria;
    }
    
    public String getPlaca() {
        return this.placa;
    }

    public String getModelo() {
        return this.modelo;
    }

    public double getDiaria() {
        return this.diaria;
    }

    public double calcularAluguel(int dias) {
        if (dias <= 0) {
            System.out.println("Quantidade de dias invalida!");
            return 0.0;
        }
        return diaria * dias;
    }
}
