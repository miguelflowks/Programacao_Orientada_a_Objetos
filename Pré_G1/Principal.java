public class Principal {
    
    public static void main(String[] args) {
        Carro carro1 = new Carro("Sedan", 50.0);

        carro1.abastecer(30.0);
        carro1.viajar(150.0);     // deve gastar 15 L e sobrar 15 L
        carro1.exibirStatus();

        carro1.viajar(400.0);     // deve avisar que o combustível é insuficiente
        carro1.exibirStatus();
    }

}
