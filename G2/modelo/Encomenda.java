package modelo;

import erros.PesoInvalidoException;

public class Encomenda {
    
    private String descricao;
    private double peso;
    private Remetente remetente;

    public Encomenda(String descricao, double peso, Remetente remetente) {
        if (peso <= 0) {
            throw new PesoInvalidoException("O peso não pode ser negativo");
        }
        this.peso = peso;
        this.descricao = descricao;
        this.remetente = remetente;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPeso() {
        return peso;
    }

    public Remetente getRemetente() {
        return remetente;
    }

}
