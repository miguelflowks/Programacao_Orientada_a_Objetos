package Locadora;

import java.util.ArrayList;

public class Locadora {
    private ArrayList<Veiculo> frota;
    private double faturamento;

    public Locadora() {
        this.frota = new ArrayList<>();
        this.faturamento = 0.0;
    }

    public void cadastrarVeiculo(Veiculo v) {
        frota.add(v);
        System.out.println("Veiculo " + v.getModelo() + " cadastrado na frota!");
    }

    public void alugar(String placa, int dias) {
        if (dias <= 0) {
            System.out.println("Quantidade de dias invalida!");
            return;
        }

        for (Veiculo v : frota) {
            if(v.getPlaca().equals(placa)) {
                double valor = v.calcularAluguel(dias);
                faturamento += valor;
                System.out.println("Aluguel realizado! Modelo: " + v.getModelo() + " | Valor: R$ " + valor);
                return;
            } 
            System.out.println("Veiculo com a placa " + v.getPlaca() + " nao foi encontrado");  
        }
    }

    public void exibirFaturamento() {
    System.out.println("Faturamento total da locadora: R$ " + faturamento);
}
    
}
