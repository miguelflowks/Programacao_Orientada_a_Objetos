package Aquecimento2;

public class Personagem {
    private String nome;
    private int vida;
    private int vidaMaxima;
    private int nivel;

    Personagem(String nome, int vidaMaxima) {
        this.nome = nome;
        this.vidaMaxima = vidaMaxima;
        this.vida = vidaMaxima;
        this.nivel = 1;
    }

    void receberDano(int dano) {
        if (dano <= 0) {
            System.out.println("O dano deve ser maior que 0!");
            return;
        }
        vida -= dano;
        
        if (vida <= 0 ) {
            vida = 0;
            System.out.println("O personagem " + nome + "foi derrotado!");
        } else {
            System.out.println("Dano recebido: " + dano + " / vida restante -> " + vida);
        }
    }
    
    void curar(int pontos) {
        if (pontos <= 0) {
            System.out.println("Informe uma quantidade maior de pontos para curar!");
            return;
        }
        
        if (vida == 0) {
            System.out.println("O personagem não pode ser curado pois está derrotado!");
            return;
        }
        vida += pontos;
        
        if (vida > vidaMaxima) {
        vida = vidaMaxima;
        }
        
        System.out.println(nome + " curou pontos. Vida atual: " + vida + " / " + vidaMaxima);
    }

    void exibirStatus() {
        System.out.println("Personagem: " + nome + " (Nível " + nivel + ") | Vida: " + vida + " / " + vidaMaxima);
    }
}



