import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        
        Paciente paciente1 = new Paciente("Miguel", 55999999);

        Consulta consulta1 = new Consulta(paciente1, LocalDate.of(2026, 1, 16), 1200.00);

        consulta1.exibirComprovante();


    }
    
}
