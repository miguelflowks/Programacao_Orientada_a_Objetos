package modelo;

public class PratoSemGluten extends Prato {

    public PratoSemGluten(String nome, double precoBase, int tempoPreparo) {
        super(nome, precoBase, tempoPreparo);
    }

    @Override
    public double calcularPreco() {
        return getPrecoBase() + 10.0; 
    }
    
}
