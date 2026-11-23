package relatorio;

public class RelatorioConsole implements RelatorioService {
    @Override
    public void emitir(String conteudo) {
        System.out.println("=== COMPROVANTE ===\n" + conteudo);
    }
}