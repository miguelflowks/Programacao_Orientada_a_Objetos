package app;

import erros.ValorInvalidoException;
import modelo.*;
import notificador.*;
import relatorio.*;
import servico.*;

public class Principal {
    public static void main(String[] args) {
        NotificadorService notificador = new NotificadorWhatsapp();
        RelatorioService relatorio = new RelatorioConsole();
        ControleFinanceiro controle = new ControleFinanceiro();
        MatriculaService service = new MatriculaService(notificador, relatorio, controle);

        Aluno a1 = new Aluno("Ana", "111.222.333-44");
        Aluno a2 = new Aluno("Bruno", "555.666.777-88");

        PlanoBasico basico = new PlanoBasico("Básico", 100.0);
        PlanoEstudante estudante = new PlanoEstudante("Estudante", 100.0);
        PlanoPremium premium = new PlanoPremium("Premium", 100.0, 50.0);

        service.confirmar(new Matricula(a1, basico));
        service.confirmar(new Matricula(a2, estudante));
        service.confirmar(new Matricula(a1, premium));

        estudante.agendarAula();
        premium.agendarAula();
        premium.acessarAreaVIP();

        try {
            new PlanoBasico("Inválido", -20.0);
        } catch (ValorInvalidoException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

        System.out.println("Faturamento mensal total: R$ " + controle.calcularFaturamentoMensal());
    }
}