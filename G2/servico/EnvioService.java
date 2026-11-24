package servico;

import modelo.Envio;
import modelo.Remetente;
import relatorio.RelatorioService;

public class EnvioService {
    // SRP: coordena o envio sem implementar relatório ou controle financeiro.
    // DIP: recebe serviços por abstrações ou dependências injetadas.
    private RelatorioService relatorio;
    private ControleFinanceiro controle;

    public EnvioService(RelatorioService relatorio, ControleFinanceiro controle) {
        this.relatorio = relatorio;
        this.controle = controle;
    }

    public void enviar(Remetente r, Envio e) {
        controle.registrar(e);

        String texto = "Encomenda: " + e.getEncomenda().getRemetente().getNome() + " | Data: " + e.getData() + " | Preço base: " + e.calcularValorBase();

        relatorio.emitir(texto);
    }

}
