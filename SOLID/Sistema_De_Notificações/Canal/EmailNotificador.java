package Canal;

import Contrato.Notificador;

public class EmailNotificador implements Notificador {

    @Override
    public void notificar(String destinatario, String mensagem) {
        System.out.println("[E-MAIL] Para: " + destinatario + " | " + mensagem);
    }

}