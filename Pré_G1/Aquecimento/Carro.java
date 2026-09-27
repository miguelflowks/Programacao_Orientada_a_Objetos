public class Carro {
    private String modelo;
    private double tanqueCombustivel;
    private double capacidadeTanque;

    Carro(String modelo, double capacidadeTanque) {
        this.modelo = modelo;
        this.tanqueCombustivel = 0.0;
        this.capacidadeTanque = capacidadeTanque;
    }
    
    void abastecer(double litros) {
    if (litros <= 0) {
        System.out.println("Abasteça uma quantidade maior que 0!");
        return; 
    }
    if (tanqueCombustivel + litros > capacidadeTanque) {
        System.out.println("A quantidade informada ultrapassa a capacidade do tanque!");
        return;
    }
    tanqueCombustivel += litros;
    System.out.println("Quantidade abastecida: " + litros + " L. Total no tanque: " + tanqueCombustivel + " L.");
}

    void viajar(double distanciaKm) {
        double combustivelNecessario = distanciaKm / 10;

        if (combustivelNecessario > tanqueCombustivel) {
            System.out.println("A quantidade de combustível no tanque é insuficiente para essa distância!!");       
        } else {
            tanqueCombustivel -= combustivelNecessario;
            System.out.println("A viagem foi feita. Combustivel restante: " + tanqueCombustivel);
        }
    }

    void exibirStatus() {
        System.out.println("Modelo do Carro -> " + modelo);
        System.out.println("Quantidade Atual em Tanque -> " + tanqueCombustivel);
        System.out.println("Capacidade Máxima do Tanque -> " + capacidadeTanque);
    }

}
