import java.util.ArrayList;

public class Banco {

    private ArrayList<ContaBancaria> contas = new ArrayList<>();
    private int contador = 1;

    void abrirConta(Titular titular) {
        ContaBancaria novaConta = new ContaBancaria(titular, this.contador);
        contas.add(novaConta);
        this.contador += 1;
    }

    ContaBancaria buscarConta(int numero) {
        for (ContaBancaria contaAtual : contas) {
            if (contaAtual.getNumero() == numero)
            return contaAtual;
        }
        
        return null; 
    }
    
}
