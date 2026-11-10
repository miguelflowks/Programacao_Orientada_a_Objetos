package Cardapio;

public abstract class Prato {
    
    private String nome;
    private double precoBase;
    private int tempoPreparo;

    Prato(String nome, double precoBase, int tempoPreparo) {
        if (precoBase < 0) {
            throw new PrecoInvalidoException("O preço base não pode ser negativo: " + precoBase);
        }
        this.nome = nome;
        this.precoBase = precoBase;
        this.tempoPreparo = tempoPreparo;
    }

    public abstract double calcularPreco();

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }
}
