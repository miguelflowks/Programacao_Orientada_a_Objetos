package modelo;
import erros.ValorInvalidoException;

public abstract class Plano {
    
    private String nome;
    protected double valorMensalBase;

    Plano(String nome, double valorMensalBase) {
        if (valorMensalBase <= 0) {
            throw new ValorInvalidoException("O preço base não pode ser negativo: " + valorMensalBase);
        }
        this.nome = nome;
        this.valorMensalBase = valorMensalBase;
    }

    public abstract double calcularMensalidade();

    public String getNomePlano() {
        return nome;
    }

    public String GetValorMensal() {
        return valorMensalBase;
    }

}
