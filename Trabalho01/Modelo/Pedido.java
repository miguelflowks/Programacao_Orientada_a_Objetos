package modelo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pedido {
    
    private Cliente cliente;
    private LocalDate data;
    private List<Prato> pratos;

    public Pedido(Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Pedido sem cliente não pode existir.");
        }
        this.cliente = cliente;
        this.data = LocalDate.now();
        this.pratos = new ArrayList<>(); 
    }

    public void adicionarPrato(Prato prato) {
        if (prato != null) {
            this.pratos.add(prato);
        }
    }

    public double calcularValorTotal() {
        double total = 0.0;
        for (Prato prato : pratos) {
            total += prato.calcularPreco();
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public List<Prato> getPratos() {
        return Collections.unmodifiableList(pratos);
    }
}