package Servico;
import Contrato.Notificador;

public class ConfirmacaoPedido {
    
    private Notificador notificador;

    public ConfirmacaoPedido(Notificador notificador) {
    this.notificador = notificador;
}

public void concretizarPedido() {

    this.notificador.enviar("Seu pedido foi confirmado com sucesso!");
}
    

}
