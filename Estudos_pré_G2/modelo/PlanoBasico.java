package modelo;

public class PlanoBasico extends Plano {
    
    public PlanoBasico(String nome, double valorMensalBase) {
        super(nome, valorMensalBase);
    }

    @Override 
    public double calcularMensalidade() {
        return valorMensalBase;
    }

}
