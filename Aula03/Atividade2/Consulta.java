import java.time.LocalDate;

public class Consulta {
    
    Paciente paciente;
    LocalDate data;
    double valor;

    Consulta(Paciente paciente, LocalDate data, double valor) {
        this.paciente = paciente;
        this.data = data;
        this.valor = valor;
    }

    exibirComprovante() {
        System.out.println("Paciente: " + paciente.nome);
        System.out.println("Data da consulta: " + data);
        System.out.println("Valor Total: " + valor);
    }

}
