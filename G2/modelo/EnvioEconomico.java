package modelo;

import java.time.LocalDate;

public class EnvioEconomico extends Envio {
    
    public EnvioEconomico(Encomenda encomenda, LocalDate data, double precoBase) { // LSP: esta classe pode substituir Envio mantendo o mesmo contrato.
        super(encomenda, data, precoBase);
    }

    public EnvioEconomico(LocalDate data, double precoBase) {
        this(null, data, precoBase);
    }
    
    @Override
    public double calcularValorBase() {
        return precoBase;
    }

}
