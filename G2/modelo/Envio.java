package modelo;

import java.time.LocalDate;
import erros.PrecoInvalidoException;

public abstract class Envio {
    // SRP: essa classe mantém apenas os dados e as regras comuns de um envio.
    // OCP: novas formas de envio podem ser adicionadas sem alterar a base.
    
    private Encomenda encomenda; 
    private LocalDate data;
    protected double precoBase;

    public Envio(Encomenda encomenda, LocalDate data, double precoBase) {
        if (precoBase <= 0) {
            throw new PrecoInvalidoException("O envio precisa de encomenda, o preço base não pode ser negativo");
        }
        this.encomenda = encomenda;
        this.data = data;
        this.precoBase = precoBase;
    }

    public abstract double calcularValorBase();

    public LocalDate getData() {
        return data;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public Encomenda getEncomenda() {
        return encomenda;
    }

}
