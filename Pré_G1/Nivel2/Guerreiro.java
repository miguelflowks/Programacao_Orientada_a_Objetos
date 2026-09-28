package Nivel2;

public class Guerreiro {
    private String nome;
    private int vida;
    private Arma arma;

    Guerreiro(String nome, int vida, Arma arma) {
        this.nome = nome;
        this.vida = vida;
        this.arma = arma;
    }

    public String getNome() {
    return this.nome;
    }
    
    void receberDano(int dano) {
        if (dano <= 0) {
            System.out.println("Nenhum dano recebido, nada aconteceu!");
            return;
        }
        vida -= dano;
        
        if (vida <= 0 ) {
            vida = 0;
            System.out.println("O personagem " + nome + " foi derrotado!");
        } else {
            System.out.println("Dano recebido: " + dano + " / vida restante -> " + vida);
        }
    }

    void atacar(Guerreiro alvo) {
        if (vida == 0) {
            System.out.println("O personagem ainda está derrotado e não pode atacar");
            return;
        }
        if (arma == null) {
        System.out.println(nome + " atacou " + alvo.getNome() + " com as próprias mãos (soco)!");
        alvo.receberDano(5);
        } else {
            System.out.println(nome + " atacou " + alvo.getNome() + " usando " + arma.getNome());
            alvo.receberDano(arma.getPoderAtaque());
        }
    }

    void equiparArma(Arma novaArma) {
        arma = novaArma;
        System.out.println("A arma " + novaArma.getNome() + " foi equipada");
    } 

    void exibirStatus() {
    String nomeArma;

    if (arma != null) {
        nomeArma = arma.getNome();
    } else {
        nomeArma = "Desarmado";
    }
    System.out.println("Guerreiro: " + nome + " | Vida: " + vida + " | Arma: " + nomeArma);
}
}
