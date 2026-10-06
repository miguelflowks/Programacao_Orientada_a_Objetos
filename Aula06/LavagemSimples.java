public class LavagemSimples extends Servico {

    LavagemSimples(Veiculo veiculo, LocalDate data, double precoBase) {
        super(veiculo, data, precoBase);
    }
    
    @Override 
    public double calcularPreco() {
        if (getVeiculo().getPorte().equals("grande")) {
            return super.getPrecoBase() + 15.00;
        }
        return super.getPrecoBase();
    }


}
