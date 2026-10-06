public class LavagemComCera extends Servico {

    private double valorCera;

    LavagemComCera(Veiculo veiculo, LocalDate data, double precoBase, double valorCera) {
        super(veiculo, data, precoBase);
        this.valorCera = valorCera;
    }
    
    @Override 
    public double calcularPreco() {
        return super.getPrecoBase() + valorCera;
    }



}
