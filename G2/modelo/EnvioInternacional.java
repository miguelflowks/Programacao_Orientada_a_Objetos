package modelo;

import java.time.LocalDate;

public class EnvioInternacional extends Envio {
    // LSP: esta classe pode substituir Envio mantendo o mesmo contrato.

    public EnvioInternacional(Encomenda encomenda, LocalDate data, double precoBase) {
        super(encomenda, data, precoBase);
    }

    public EnvioInternacional(LocalDate data, double precoBase) {
        this(null, data, precoBase);
    }

    @Override
    public double calcularValorBase() {
        return precoBase * 2.5;
    }
    
}
