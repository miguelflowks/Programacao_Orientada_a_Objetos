package app;

import erros.PrecoInvalidoException;
import modelo.*;
import relatorio.*;
import servico.*;

public class Principal {
    
    public static void main(String[] args) {
        RelatorioService relatorio = new RelatorioConsole(); // DIP: a aplicação depende da abstração RelatorioService e não da classe concreta.
        ControleFinanceiro controle = new ControleFinanceiro();
        EnvioService service = new EnvioService(relatorio, controle);
    
        Remetente r1 = new Remetente("Miguel", "111.222.333-44");
        Remetente r2 = new Remetente("Augusto", "555.666.777-88");
    
        EnvioEconomico economico = new EnvioEconomico(null, 30);
        EnvioExpresso expresso = new EnvioExpresso(null, 50);
        EnvioInternacional internacional = new EnvioInternacional(null, 100);

        service.enviar(r1, internacional);
        service.enviar(r2, expresso);
        service.enviar(r1, economico);

        try {
            new EnvioEconomico(null, -20);
        } catch (PrecoInvalidoException e) {
            System.out.println("Erro capturado, tente novamente");
        }
        
        System.out.println("Faturamento mensal total: R$ " + controle.calcularFaturamentoMensal());

    } 

}
