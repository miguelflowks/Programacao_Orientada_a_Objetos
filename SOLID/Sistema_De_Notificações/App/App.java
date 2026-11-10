package App;

import Canal.EmailNotificador;
import Canal.SmsNotificador;
import Contrato.Notificador;
import Servico.ConfirmacaoPedido;

public class App {
    public static void main(String[] args) {
        Notificador canalEmail = new EmailNotificador();
        ConfirmacaoPedido pedidoEmail = new ConfirmacaoPedido(canalEmail);
        pedidoEmail.processar();

        Notificador canalSms = new SmsNotificador();
        ConfirmacaoPedido pedidoSms = new ConfirmacaoPedido(canalSms);
        pedidoSms.processar();
    }
}