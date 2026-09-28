package Nivel2;

public class Arma {
    private String nome;
    private int poderAtaque;

    Arma(String nome, int poderAtaque) {
        this.nome = nome;
        this.poderAtaque = poderAtaque;
    }

    public String getNome() {
        return this.nome;
    }

    public int getPoderAtaque() {
        return this.poderAtaque;
    }


}
