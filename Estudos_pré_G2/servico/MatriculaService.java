package servico;

import modelo.Matricula;
import notificador.NotificadorService;
import relatorio.RelatorioService;

public class MatriculaService {
    private NotificadorService notificador;
    private RelatorioService relatorio;
    private ControleFinanceiro controle;

    public MatriculaService(NotificadorService notificador, RelatorioService relatorio, ControleFinanceiro controle) {
        this.notificador = notificador;
        this.relatorio = relatorio;
        this.controle = controle;
    }

    public void confirmar(Matricula m) {
        controle.registrar(m);

        String texto = "Aluno: " + m.getAluno().getNome()
                + " | Plano: " + m.getPlano().getNomePlano()
                + " | Mensalidade: R$ " + m.calcularValor();

        relatorio.emitir(texto);
        notificador.enviar(m.getAluno().getNome(), "Matrícula confirmada!");
    }
}