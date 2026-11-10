package excecoes;

import excecoes.PrecoInvalidoException;

public class PrecoInvalidoException extends RuntimeException {
    public PrecoInvalidoException(String mensagem) {
        super(mensagem);
    }
    
}
