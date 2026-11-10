package modelo;

public class Combo extends Prato {

    public Combo(String nome, double precoBase, int tempoPreparo) {
        super(nome, precoBase, tempoPreparo);
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() * 0.85; 
    }
}