public class SmsNotificador {
    
public class SmsNotificador implements Notificador {

    @Override
    public void notificar(String destinatario, String mensagem) {
        System.out.println("[E-MAIL] Para: " + destinatario + " | " + mensagem);
    }

}

}
