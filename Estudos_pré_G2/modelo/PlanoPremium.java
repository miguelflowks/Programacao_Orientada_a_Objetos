package modelo;
import erros.ValorInvalidoException;
import contrato.Agendavel;
import contrato.AcessoVIP;

public class PlanoPremium extends Plano implements Agendavel, AcessoVIP {
    
    private double taxaPersonal;

    public PlanoPremium(String nome, double valorMensalBase, double taxaPersonal) {
        super(nome, valorMensalBase);
        if (taxaPersonal < 0) {
            throw new ValorInvalidoException("A taxa do personal não pode ser valor negativo!");
        }
        this.taxaPersonal = taxaPersonal;
    }

    @Override 
    public double calcularMensalidade() {
        return valorMensalBase + taxaPersonal;
    }

    @Override 
    public void agendarAula(){
        
    }

    @Override 
    public void AcessoVIP(){
        
    }

}
