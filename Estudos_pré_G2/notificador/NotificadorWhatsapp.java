package notificador;

public class NotificadorWhatsapp implements NotificadorService {
    
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("[WhatsApp] Para " + destinatario + ": " + mensagem);
    }
}