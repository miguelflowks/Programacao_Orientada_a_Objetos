package Nivel2;

public class Principal {
    public static void main(String[] args) {
        Arma espada = new Arma("Espada Vorpal", 25);
        Arma machado = new Arma("Machado de Batalha", 35);

        Guerreiro arthur = new Guerreiro("Arthur", 100, espada);
        Guerreiro orc = new Guerreiro("Orc", 60, machado);

        System.out.println("--- STATUS INICIAL ---");
        arthur.exibirStatus();
        orc.exibirStatus();

        System.out.println("\n--- COMBATE ---");
        // Arthur ataca o Orc
        arthur.atacar(orc);

        // Orc contra-ataca o Arthur
        orc.atacar(arthur);

        arthur.atacar(orc);
        arthur.atacar(orc);

        orc.atacar(arthur);

        System.out.println("\n--- STATUS FINAL ---");
        arthur.exibirStatus();
        orc.exibirStatus();
    }
}