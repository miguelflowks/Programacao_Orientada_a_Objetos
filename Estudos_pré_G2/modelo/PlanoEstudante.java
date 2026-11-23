package modelo;
import contrato.Agendavel;

public class PlanoEstudante extends Plano implements Agendavel {

    public PlanoEstudante(String nome, double valorMensalBase) {
        super(nome, valorMensalBase);
    }

    @Override 
    public double calcularMensalidade() {
        return valorMensalBase * 0.80;
    }

    @Override 
    public void agendarAula(){
        
    }

}
