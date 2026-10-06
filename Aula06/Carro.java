public class Carro {

    private String placa;
    private String modelo;
    private String porte;
    private Cliente cliente;

    Carro(String placa, String modelo, String porte, Cliente cliente) {
        if (cliente == null) {
            throw new IllegalArgumentException("Carro sem dono");
        }      
        this.placa = placa;
        this.modelo = modelo;
        this.porte = porte;
        this.cliente = cliente;
    }

    public String getPorte() {
        return porte;
    }


    
}
