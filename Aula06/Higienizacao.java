import java.time.LocalDate;

public class Higienizacao extends Servico {
    private boolean entregarMesmoDia;
    
    Higienizacao(Veiculo veiculo, LocalDate data, double precoBase, boolean entregarMesmoDia) {
        super(veiculo, data, precoBase);
        this.entregarMesmoDia = entregarMesmoDia;
    }

    @Override 
    public double calcularPreco() {
        if (entregarMesmoDia) {
            return super.getPrecoBase() * 2;
        }
        return super.getPrecoBase();
    }

}
